package com.google.firebase.storage.network;

import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

/* loaded from: classes3.dex */
public class GetMetadataNetworkRequest extends NetworkRequest {
    public GetMetadataNetworkRequest(StorageReferenceUri storageReferenceUri, FirebaseApp firebaseApp) {
        super(storageReferenceUri, firebaseApp);
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "GET";
    }
}
