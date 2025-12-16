package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzgt implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgv zzb;

    public zzgt(zzgv zzgvVar, zzq zzqVar) {
        this.zzb = zzgvVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlhVar = this.zzb.zza;
        zzlhVar.zzA();
        zzlhVar2 = this.zzb.zza;
        zzlhVar2.zzL(this.zza);
    }
}
