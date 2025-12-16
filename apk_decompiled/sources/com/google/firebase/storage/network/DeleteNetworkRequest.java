package com.google.firebase.storage.network;

import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

/* loaded from: classes3.dex */
public class DeleteNetworkRequest extends NetworkRequest {
    public DeleteNetworkRequest(StorageReferenceUri storageReferenceUri, FirebaseApp firebaseApp) {
        super(storageReferenceUri, firebaseApp);
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "DELETE";
    }
}
