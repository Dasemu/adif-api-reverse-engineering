package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzc implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, long j4) {
        this.zzb = zzdVar;
        this.zza = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzj(this.zza);
    }
}
