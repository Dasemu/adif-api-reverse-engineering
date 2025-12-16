package com.google.firebase.storage.network;

import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class UpdateMetadataNetworkRequest extends NetworkRequest {
    private final JSONObject metadata;

    public UpdateMetadataNetworkRequest(StorageReferenceUri storageReferenceUri, FirebaseApp firebaseApp, JSONObject jSONObject) {
        super(storageReferenceUri, firebaseApp);
        this.metadata = jSONObject;
        setCustomHeader("X-HTTP-Method-Override", "PATCH");
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "PUT";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public JSONObject getOutputJSON() {
        return this.metadata;
    }
}
