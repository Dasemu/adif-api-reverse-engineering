package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class MetaDataStore {
    private static final String KEY_USER_ID = "userId";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final FileStore fileStore;

    public MetaDataStore(FileStore fileStore) {
        this.fileStore = fileStore;
    }

    private static Map<String, String> jsonToKeysData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, valueOrNull(jSONObject, next));
        }
        return hashMap;
    }

    private static List<RolloutAssignment> jsonToRolloutsState(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(RolloutAssignment.create(string));
            } catch (Exception e4) {
                Logger.getLogger().w("Failed de-serializing rollouts state. " + string, e4);
            }
        }
        return arrayList;
    }

    private String jsonToUserId(String str) throws JSONException {
        return valueOrNull(new JSONObject(str), KEY_USER_ID);
    }

    private static String keysDataToJson(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String rolloutsStateToJson(List<RolloutAssignment> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER.encode(list.get(i))));
            } catch (JSONException e4) {
                Logger.getLogger().w("Exception parsing rollout assignment!", e4);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static void safeDeleteCorruptFile(File file) {
        if (file.exists() && file.delete()) {
            Logger.getLogger().i("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static String userIdToJson(String str) throws JSONException {
        return new JSONObject(str) { // from class: com.google.firebase.crashlytics.internal.metadata.MetaDataStore.1
            final /* synthetic */ String val$userId;

            {
                this.val$userId = str;
                put(MetaDataStore.KEY_USER_ID, str);
            }
        }.toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File getInternalKeysFileForSession(String str) {
        return this.fileStore.getSessionFile(str, UserMetadata.INTERNAL_KEYDATA_FILENAME);
    }

    public File getKeysFileForSession(String str) {
        return this.fileStore.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
    }

    public File getRolloutsStateForSession(String str) {
        return this.fileStore.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
    }

    public File getUserDataFileForSession(String str) {
        return this.fileStore.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
    }

    public Map<String, String> readKeyData(String str) {
        return readKeyData(str, false);
    }

    public List<RolloutAssignment> readRolloutsState(String str) {
        FileInputStream fileInputStream;
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (!rolloutsStateForSession.exists() || rolloutsStateForSession.length() == 0) {
            safeDeleteCorruptFile(rolloutsStateForSession);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(rolloutsStateForSession);
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            List<RolloutAssignment> jsonToRolloutsState = jsonToRolloutsState(CommonUtils.streamToString(fileInputStream));
            Logger.getLogger().d("Loaded rollouts state:\n" + jsonToRolloutsState + "\nfor session " + str);
            CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
            return jsonToRolloutsState;
        } catch (Exception e5) {
            e = e5;
            fileInputStream2 = fileInputStream;
            Logger.getLogger().w("Error deserializing rollouts state.", e);
            safeDeleteCorruptFile(rolloutsStateForSession);
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
            return Collections.EMPTY_LIST;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    public String readUserId(String str) {
        FileInputStream fileInputStream;
        File userDataFileForSession = getUserDataFileForSession(str);
        Closeable closeable = null;
        if (userDataFileForSession.exists()) {
            ?? r32 = (userDataFileForSession.length() > 0L ? 1 : (userDataFileForSession.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(userDataFileForSession);
                        try {
                            String jsonToUserId = jsonToUserId(CommonUtils.streamToString(fileInputStream));
                            Logger.getLogger().d("Loaded userId " + jsonToUserId + " for session " + str);
                            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                            return jsonToUserId;
                        } catch (Exception e4) {
                            e = e4;
                            Logger.getLogger().w("Error deserializing user metadata.", e);
                            safeDeleteCorruptFile(userDataFileForSession);
                            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.closeOrLog(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
            }
        }
        Logger.getLogger().d("No userId set for session " + str);
        safeDeleteCorruptFile(userDataFileForSession);
        return null;
    }

    public void writeKeyData(String str, Map<String, String> map) {
        writeKeyData(str, map, false);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE (r6 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:20:0x0031 */
    public void writeRolloutState(String str, List<RolloutAssignment> list) {
        BufferedWriter bufferedWriter;
        Exception e4;
        Closeable closeable;
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (list.isEmpty()) {
            safeDeleteCorruptFile(rolloutsStateForSession);
            return;
        }
        Closeable closeable2 = null;
        try {
            try {
                String rolloutsStateToJson = rolloutsStateToJson(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(rolloutsStateForSession), UTF_8));
                try {
                    bufferedWriter.write(rolloutsStateToJson);
                    bufferedWriter.flush();
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e5) {
                    e4 = e5;
                    Logger.getLogger().w("Error serializing rollouts state.", e4);
                    safeDeleteCorruptFile(rolloutsStateForSession);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                CommonUtils.closeOrLog(closeable2, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e6) {
            bufferedWriter = null;
            e4 = e6;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.closeOrLog(closeable2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void writeUserData(String str, String str2) {
        String userIdToJson;
        BufferedWriter bufferedWriter;
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                userIdToJson = userIdToJson(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), UTF_8));
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(userIdToJson);
            bufferedWriter.flush();
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e5) {
            e = e5;
            bufferedWriter2 = bufferedWriter;
            Logger.getLogger().w("Error serializing user metadata.", e);
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, String> readKeyData(String str, boolean z3) {
        FileInputStream fileInputStream;
        Exception e4;
        File internalKeysFileForSession = z3 != 0 ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        if (internalKeysFileForSession.exists() && internalKeysFileForSession.length() != 0) {
            Closeable closeable = null;
            try {
                try {
                    fileInputStream = new FileInputStream(internalKeysFileForSession);
                    try {
                        Map<String, String> jsonToKeysData = jsonToKeysData(CommonUtils.streamToString(fileInputStream));
                        CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                        return jsonToKeysData;
                    } catch (Exception e5) {
                        e4 = e5;
                        Logger.getLogger().w("Error deserializing user metadata.", e4);
                        safeDeleteCorruptFile(internalKeysFileForSession);
                        CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                        return Collections.EMPTY_MAP;
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable = z3;
                    CommonUtils.closeOrLog(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e6) {
                fileInputStream = null;
                e4 = e6;
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.closeOrLog(closeable, "Failed to close user metadata file.");
                throw th;
            }
        } else {
            safeDeleteCorruptFile(internalKeysFileForSession);
            return Collections.EMPTY_MAP;
        }
    }

    public void writeKeyData(String str, Map<String, String> map, boolean z3) {
        BufferedWriter bufferedWriter;
        Exception e4;
        File internalKeysFileForSession = z3 ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            String keysDataToJson = keysDataToJson(map);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(internalKeysFileForSession), UTF_8));
            try {
                try {
                    bufferedWriter.write(keysDataToJson);
                    bufferedWriter.flush();
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Exception e5) {
                    e4 = e5;
                    Logger.getLogger().w("Error serializing key/value metadata.", e4);
                    safeDeleteCorruptFile(internalKeysFileForSession);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                }
            } catch (Throwable th) {
                th = th;
                bufferedWriter2 = bufferedWriter;
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e6) {
            bufferedWriter = null;
            e4 = e6;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }
}
