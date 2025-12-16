package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzef;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzb implements Callable {
    final /* synthetic */ FirebaseAnalytics zza;

    public zzb(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzef zzefVar;
        zzefVar = this.zza.zzb;
        return zzefVar.zzl();
    }
}
