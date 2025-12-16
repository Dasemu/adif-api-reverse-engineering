package com.google.firebase.storage.network;

import android.net.Uri;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

/* loaded from: classes3.dex */
public class ResumableUploadByteRequest extends ResumableNetworkRequest {
    private final int bytesToWrite;
    private final byte[] chunk;
    private final boolean isFinal;
    private final long offset;
    private final Uri uploadURL;

    public ResumableUploadByteRequest(StorageReferenceUri storageReferenceUri, FirebaseApp firebaseApp, Uri uri, byte[] bArr, long j4, int i, boolean z3) {
        super(storageReferenceUri, firebaseApp);
        if (bArr == null && i != -1) {
            this.mException = new IllegalArgumentException("contentType is null or empty");
        }
        if (j4 < 0) {
            this.mException = new IllegalArgumentException("offset cannot be negative");
        }
        this.bytesToWrite = i;
        this.uploadURL = uri;
        this.chunk = i <= 0 ? null : bArr;
        this.offset = j4;
        this.isFinal = z3;
        super.setCustomHeader("X-Goog-Upload-Protocol", "resumable");
        if (z3 && i > 0) {
            super.setCustomHeader("X-Goog-Upload-Command", "upload, finalize");
        } else if (z3) {
            super.setCustomHeader("X-Goog-Upload-Command", "finalize");
        } else {
            super.setCustomHeader("X-Goog-Upload-Command", "upload");
        }
        super.setCustomHeader("X-Goog-Upload-Offset", Long.toString(j4));
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "POST";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public byte[] getOutputRaw() {
        return this.chunk;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public int getOutputRawSize() {
        int i = this.bytesToWrite;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public Uri getURL() {
        return this.uploadURL;
    }
}
