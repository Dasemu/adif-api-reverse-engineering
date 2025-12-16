package com.google.firebase.components;

import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentRegistrar f5927b;

    public /* synthetic */ c(ComponentRegistrar componentRegistrar, int i) {
        this.f5926a = i;
        this.f5927b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i = this.f5926a;
        ComponentRegistrar componentRegistrar = this.f5927b;
        switch (i) {
            case 0:
                return ComponentRuntime.c(componentRegistrar);
            default:
                return ComponentRuntime.Builder.a(componentRegistrar);
        }
    }
}
