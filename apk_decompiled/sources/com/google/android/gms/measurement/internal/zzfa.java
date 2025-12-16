package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzfa implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzfb zzb;

    public zzfa(zzfb zzfbVar, boolean z3) {
        this.zzb = zzfbVar;
        this.zza = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar;
        zzlhVar = this.zzb.zzb;
        zzlhVar.zzJ(this.zza);
    }
}
