package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziu implements Runnable {
    final /* synthetic */ zzir zza;
    final /* synthetic */ zzir zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zziz zze;

    public zziu(zziz zzizVar, zzir zzirVar, zzir zzirVar2, long j4, boolean z3) {
        this.zze = zzizVar;
        this.zza = zzirVar;
        this.zzb = zzirVar2;
        this.zzc = j4;
        this.zzd = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzA(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
