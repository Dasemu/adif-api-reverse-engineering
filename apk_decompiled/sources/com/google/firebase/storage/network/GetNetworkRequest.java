package com.google.firebase.storage.network;

import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public class GetNetworkRequest extends NetworkRequest {
    private static final String TAG = "GetNetworkRequest";

    public GetNetworkRequest(StorageReferenceUri storageReferenceUri, FirebaseApp firebaseApp, long j4) {
        super(storageReferenceUri, firebaseApp);
        if (j4 != 0) {
            super.setCustomHeader("Range", "bytes=" + j4 + "-");
        }
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "GET";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public Map<String, String> getQueryParameters() {
        return Collections.singletonMap("alt", "media");
    }
}
