package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5989b;

    public /* synthetic */ b(Object obj, int i) {
        this.f5988a = i;
        this.f5989b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        DefaultHeartBeatController lambda$component$3;
        int i = this.f5988a;
        Object obj = this.f5989b;
        switch (i) {
            case 0:
                lambda$component$3 = DefaultHeartBeatController.lambda$component$3((Qualified) obj, componentContainer);
                return lambda$component$3;
            case 1:
                return RemoteConfigRegistrar.a((Qualified) obj, componentContainer);
            default:
                return CrashlyticsRegistrar.a((CrashlyticsRegistrar) obj, componentContainer);
        }
    }
}
