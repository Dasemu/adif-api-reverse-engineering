package com.google.firebase.remoteconfig;

import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f6037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConfigUpdate f6038c;

    public /* synthetic */ d(ProducerScope producerScope, ConfigUpdate configUpdate, int i) {
        this.f6036a = i;
        this.f6037b = producerScope;
        this.f6038c = configUpdate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6036a) {
            case 0:
                RemoteConfigKt$configUpdates$1$registration$1.a(this.f6037b, this.f6038c);
                return;
            default:
                com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1$registration$1.a(this.f6037b, this.f6038c);
                return;
        }
    }
}
