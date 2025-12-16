package com.google.firebase.remoteconfig.internal.rollouts;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class RolloutsStateFactory {
    ConfigGetParameterHandler getParameterHandler;

    public RolloutsStateFactory(ConfigGetParameterHandler configGetParameterHandler) {
        this.getParameterHandler = configGetParameterHandler;
    }

    public static RolloutsStateFactory create(ConfigGetParameterHandler configGetParameterHandler) {
        return new RolloutsStateFactory(configGetParameterHandler);
    }

    public RolloutsState getActiveRolloutsState(ConfigContainer configContainer) throws FirebaseRemoteConfigClientException {
        JSONArray rolloutMetadata = configContainer.getRolloutMetadata();
        long templateVersionNumber = configContainer.getTemplateVersionNumber();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < rolloutMetadata.length(); i++) {
            try {
                JSONObject jSONObject = rolloutMetadata.getJSONObject(i);
                String string = jSONObject.getString(ConfigContainer.ROLLOUT_METADATA_ID);
                JSONArray jSONArray = jSONObject.getJSONArray(ConfigContainer.ROLLOUT_METADATA_AFFECTED_KEYS);
                if (jSONArray.length() > 1) {
                    Log.w(FirebaseRemoteConfig.TAG, String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String optString = jSONArray.optString(0, "");
                hashSet.add(RolloutAssignment.builder().setRolloutId(string).setVariantId(jSONObject.getString("variantId")).setParameterKey(optString).setParameterValue(this.getParameterHandler.getString(optString)).setTemplateVersion(templateVersionNumber).build());
            } catch (JSONException e4) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e4);
            }
        }
        return RolloutsState.create(hashSet);
    }
}
