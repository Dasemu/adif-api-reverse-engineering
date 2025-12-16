package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f6034b;

    public /* synthetic */ b(FirebaseRemoteConfig firebaseRemoteConfig, int i) {
        this.f6033a = i;
        this.f6034b = firebaseRemoteConfig;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f6033a;
        FirebaseRemoteConfig firebaseRemoteConfig = this.f6034b;
        switch (i) {
            case 0:
                return FirebaseRemoteConfig.i(firebaseRemoteConfig);
            default:
                return firebaseRemoteConfig.getInfo();
        }
    }
}
