package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultHeartBeatController f5987b;

    public /* synthetic */ a(DefaultHeartBeatController defaultHeartBeatController, int i) {
        this.f5986a = i;
        this.f5987b = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f5986a;
        DefaultHeartBeatController defaultHeartBeatController = this.f5987b;
        switch (i) {
            case 0:
                return DefaultHeartBeatController.a(defaultHeartBeatController);
            default:
                return DefaultHeartBeatController.d(defaultHeartBeatController);
        }
    }
}
