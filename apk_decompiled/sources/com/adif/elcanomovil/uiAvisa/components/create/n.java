package com.adif.elcanomovil.uiAvisa.components.create;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements MediaScannerConnection.OnScanCompletedListener {
    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        NewIssueViewModel.galleryAddPic$lambda$8(str, uri);
    }
}
