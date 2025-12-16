package com.google.firebase.remoteconfig;

import B0.C0031i;
import B0.w;
import I2.k;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final String TAG = "FirebaseRemoteConfig";
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private final ConfigCacheClient activatedConfigsCache;
    private final ConfigRealtimeHandler configRealtimeHandler;
    private final Context context;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final ConfigFetchHandler fetchHandler;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseABTesting firebaseAbt;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigMetadataClient frcMetadata;
    private final ConfigGetParameterHandler getHandler;
    private final RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler;

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient, ConfigRealtimeHandler configRealtimeHandler, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.context = context;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.executor = executor;
        this.fetchedConfigsCache = configCacheClient;
        this.activatedConfigsCache = configCacheClient2;
        this.defaultConfigsCache = configCacheClient3;
        this.fetchHandler = configFetchHandler;
        this.getHandler = configGetParameterHandler;
        this.frcMetadata = configMetadataClient;
        this.configRealtimeHandler = configRealtimeHandler;
        this.rolloutsStateSubscriptionsHandler = rolloutsStateSubscriptionsHandler;
    }

    public static FirebaseRemoteConfig getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    private static boolean isFetchedFresh(ConfigContainer configContainer, ConfigContainer configContainer2) {
        return configContainer2 == null || !configContainer.getFetchTime().equals(configContainer2.getFetchTime());
    }

    public /* synthetic */ Task lambda$activate$2(Task task, Task task2, Task task3) throws Exception {
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        ConfigContainer configContainer = (ConfigContainer) task.getResult();
        return (!task2.isSuccessful() || isFetchedFresh(configContainer, (ConfigContainer) task2.getResult())) ? this.activatedConfigsCache.put(configContainer).continueWith(this.executor, new a(this)) : Tasks.forResult(Boolean.FALSE);
    }

    public static /* synthetic */ FirebaseRemoteConfigInfo lambda$ensureInitialized$0(Task task, Task task2) throws Exception {
        return (FirebaseRemoteConfigInfo) task.getResult();
    }

    public static /* synthetic */ Task lambda$fetch$3(ConfigFetchHandler.FetchResponse fetchResponse) throws Exception {
        return Tasks.forResult(null);
    }

    public static /* synthetic */ Task lambda$fetch$4(ConfigFetchHandler.FetchResponse fetchResponse) throws Exception {
        return Tasks.forResult(null);
    }

    public /* synthetic */ Task lambda$fetchAndActivate$1(Void r12) throws Exception {
        return activate();
    }

    public /* synthetic */ Void lambda$reset$6() throws Exception {
        this.activatedConfigsCache.clear();
        this.fetchedConfigsCache.clear();
        this.defaultConfigsCache.clear();
        this.frcMetadata.clear();
        return null;
    }

    public /* synthetic */ Void lambda$setConfigSettingsAsync$5(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) throws Exception {
        this.frcMetadata.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    public static /* synthetic */ Task lambda$setDefaultsWithStringsMapAsync$7(ConfigContainer configContainer) throws Exception {
        return Tasks.forResult(null);
    }

    public boolean processActivatePutTask(Task<ConfigContainer> task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.fetchedConfigsCache.clear();
        ConfigContainer result = task.getResult();
        if (result == null) {
            Log.e(TAG, "Activated configs written to disk are null.");
            return true;
        }
        updateAbtWithActivatedExperiments(result.getAbtExperiments());
        this.rolloutsStateSubscriptionsHandler.publishActiveRolloutsState(result);
        return true;
    }

    private Task<Void> setDefaultsWithStringsMapAsync(Map<String, String> map) {
        try {
            return this.defaultConfigsCache.put(ConfigContainer.newBuilder().replaceConfigsWith(map).build()).onSuccessTask(FirebaseExecutors.directExecutor(), new w(17));
        } catch (JSONException e4) {
            Log.e(TAG, "The provided defaults map could not be processed.", e4);
            return Tasks.forResult(null);
        }
    }

    public static List<Map<String, String>> toExperimentInfoMaps(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public Task<Boolean> activate() {
        Task<ConfigContainer> task = this.fetchedConfigsCache.get();
        Task<ConfigContainer> task2 = this.activatedConfigsCache.get();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{task, task2}).continueWithTask(this.executor, new C0031i(this, task, task2, 2));
    }

    public ConfigUpdateListenerRegistration addOnConfigUpdateListener(ConfigUpdateListener configUpdateListener) {
        return this.configRealtimeHandler.addRealtimeConfigUpdateListener(configUpdateListener);
    }

    public Task<FirebaseRemoteConfigInfo> ensureInitialized() {
        Task<ConfigContainer> task = this.activatedConfigsCache.get();
        Task<ConfigContainer> task2 = this.defaultConfigsCache.get();
        Task<ConfigContainer> task3 = this.fetchedConfigsCache.get();
        Task call = Tasks.call(this.executor, new b(this, 1));
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{task, task2, task3, call, this.firebaseInstallations.getId(), this.firebaseInstallations.getToken(false)}).continueWith(this.executor, new k(call, 19));
    }

    public Task<Void> fetch() {
        return this.fetchHandler.fetch().onSuccessTask(FirebaseExecutors.directExecutor(), new w(19));
    }

    public Task<Boolean> fetchAndActivate() {
        return fetch().onSuccessTask(this.executor, new a(this));
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
        return this.getHandler.getAll();
    }

    public boolean getBoolean(String str) {
        return this.getHandler.getBoolean(str);
    }

    public double getDouble(String str) {
        return this.getHandler.getDouble(str);
    }

    public FirebaseRemoteConfigInfo getInfo() {
        return this.frcMetadata.getInfo();
    }

    public Set<String> getKeysByPrefix(String str) {
        return this.getHandler.getKeysByPrefix(str);
    }

    public long getLong(String str) {
        return this.getHandler.getLong(str);
    }

    public RolloutsStateSubscriptionsHandler getRolloutsStateSubscriptionsHandler() {
        return this.rolloutsStateSubscriptionsHandler;
    }

    public String getString(String str) {
        return this.getHandler.getString(str);
    }

    public FirebaseRemoteConfigValue getValue(String str) {
        return this.getHandler.getValue(str);
    }

    public Task<Void> reset() {
        return Tasks.call(this.executor, new b(this, 0));
    }

    public void schedule(Runnable runnable) {
        this.executor.execute(runnable);
    }

    public Task<Void> setConfigSettingsAsync(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Tasks.call(this.executor, new com.google.firebase.crashlytics.internal.metadata.a(1, this, firebaseRemoteConfigSettings));
    }

    public void setConfigUpdateBackgroundState(boolean z3) {
        this.configRealtimeHandler.setBackgroundState(z3);
    }

    public Task<Void> setDefaultsAsync(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put(entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put(entry.getKey(), value.toString());
            }
        }
        return setDefaultsWithStringsMapAsync(hashMap);
    }

    public void startLoadingConfigsFromDisk() {
        this.activatedConfigsCache.get();
        this.defaultConfigsCache.get();
        this.fetchedConfigsCache.get();
    }

    public void updateAbtWithActivatedExperiments(JSONArray jSONArray) {
        if (this.firebaseAbt == null) {
            return;
        }
        try {
            this.firebaseAbt.replaceAllExperiments(toExperimentInfoMaps(jSONArray));
        } catch (AbtException e4) {
            Log.w(TAG, "Could not update ABT experiments.", e4);
        } catch (JSONException e5) {
            Log.e(TAG, "Could not parse ABT experiments from the JSON response.", e5);
        }
    }

    public static FirebaseRemoteConfig getInstance(FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).getDefault();
    }

    public Task<Void> fetch(long j4) {
        return this.fetchHandler.fetch(j4).onSuccessTask(FirebaseExecutors.directExecutor(), new w(18));
    }

    public Task<Void> setDefaultsAsync(int i) {
        return setDefaultsWithStringsMapAsync(DefaultsXmlParser.getDefaultsFromXml(this.context, i));
    }
}
