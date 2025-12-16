package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5976b;

    public /* synthetic */ b(Object obj, int i) {
        this.f5975a = i;
        this.f5976b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f5975a;
        Object obj = this.f5976b;
        switch (i) {
            case 0:
                return UserMetadata.SerializeableKeysMap.a((UserMetadata.SerializeableKeysMap) obj);
            default:
                return UserMetadata.b((UserMetadata) obj);
        }
    }
}
