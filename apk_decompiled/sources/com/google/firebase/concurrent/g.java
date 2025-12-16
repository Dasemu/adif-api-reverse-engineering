package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5960a;

    public /* synthetic */ g(int i) {
        this.f5960a = i;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f5960a) {
            case 0:
                return ExecutorsRegistrar.f();
            case 1:
                return ExecutorsRegistrar.c();
            case 2:
                return ExecutorsRegistrar.h();
            case 3:
                return ExecutorsRegistrar.b();
            default:
                return RemoteConfigComponent.a();
        }
    }
}
