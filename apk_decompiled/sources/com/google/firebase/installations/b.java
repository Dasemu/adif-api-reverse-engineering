package com.google.firebase.installations;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5994b;

    public /* synthetic */ b(Object obj, int i) {
        this.f5993a = i;
        this.f5994b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void deleteFirebaseInstallationId;
        int i = this.f5993a;
        Object obj = this.f5994b;
        switch (i) {
            case 0:
                deleteFirebaseInstallationId = ((FirebaseInstallations) obj).deleteFirebaseInstallationId();
                return deleteFirebaseInstallationId;
            case 1:
                return ((RemoteConfigComponent) obj).getDefault();
            default:
                return ((ConfigStorageClient) obj).read();
        }
    }
}
