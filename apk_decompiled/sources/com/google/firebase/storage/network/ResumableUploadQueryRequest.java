package com.google.firebase.storage.network;

import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

/* loaded from: classes3.dex */
public class ResumableUploadQueryRequest extends ResumableNetworkRequest {
    private final Uri uploadURL;

    public ResumableUploadQueryRequest(StorageReferenceUri storageReferenceUri, FirebaseApp firebaseApp, Uri uri) {
        super(storageReferenceUri, firebaseApp);
        this.uploadURL = uri;
        super.setCustomHeader("X-Goog-Upload-Protocol", "resumable");
        super.setCustomHeader("X-Goog-Upload-Command", SearchIntents.EXTRA_QUERY);
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
