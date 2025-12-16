package com.google.firebase.storage.network;

import android.net.Uri;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

/* loaded from: classes3.dex */
public class ResumableUploadCancelRequest extends ResumableNetworkRequest {
    public static boolean cancelCalled = false;
    private final Uri uploadURL;

    public ResumableUploadCancelRequest(StorageReferenceUri storageReferenceUri, FirebaseApp firebaseApp, Uri uri) {
        super(storageReferenceUri, firebaseApp);
        cancelCalled = true;
        this.uploadURL = uri;
        super.setCustomHeader("X-Goog-Upload-Protocol", "resumable");
        super.setCustomHeader("X-Goog-Upload-Command", "cancel");
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "POST";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public Uri getURL() {
        return this.uploadURL;
    }
}
