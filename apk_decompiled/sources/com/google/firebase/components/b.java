package com.google.firebase.components;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.local.IidStore;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5925b;

    public /* synthetic */ b(Object obj, int i) {
        this.f5924a = i;
        this.f5925b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ComponentRegistrar instantiate;
        IidStore lambda$new$0;
        int i = this.f5924a;
        Object obj = this.f5925b;
        switch (i) {
            case 0:
                instantiate = ComponentDiscovery.instantiate((String) obj);
                return instantiate;
            default:
                lambda$new$0 = FirebaseInstallations.lambda$new$0((FirebaseApp) obj);
                return lambda$new$0;
        }
    }
}
