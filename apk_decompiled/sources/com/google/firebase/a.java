package com.google.firebase;

import android.content.Context;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.inject.Provider;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5918a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5920c;

    public /* synthetic */ a(Context context, String str) {
        this.f5919b = context;
        this.f5920c = str;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        HeartBeatInfoStorage lambda$new$2;
        switch (this.f5918a) {
            case 0:
                return FirebaseApp.b((FirebaseApp) this.f5920c, this.f5919b);
            default:
                lambda$new$2 = DefaultHeartBeatController.lambda$new$2(this.f5919b, (String) this.f5920c);
                return lambda$new$2;
        }
    }

    public /* synthetic */ a(FirebaseApp firebaseApp, Context context) {
        this.f5920c = firebaseApp;
        this.f5919b = context;
    }
}
