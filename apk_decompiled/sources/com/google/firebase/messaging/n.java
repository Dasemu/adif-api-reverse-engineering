package com.google.firebase.messaging;

import com.google.firebase.messaging.WithinAppServiceConnection;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6024b;

    public /* synthetic */ n(Object obj, int i) {
        this.f6023a = i;
        this.f6024b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6023a;
        Object obj = this.f6024b;
        switch (i) {
            case 0:
                ((SharedPreferencesQueue) obj).syncState();
                return;
            default:
                WithinAppServiceConnection.BindRequest.b((WithinAppServiceConnection.BindRequest) obj);
                return;
        }
    }
}
