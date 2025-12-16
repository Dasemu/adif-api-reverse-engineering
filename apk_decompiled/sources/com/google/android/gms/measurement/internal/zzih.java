package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzih implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzik zzb;

    public zzih(zzik zzikVar, boolean z3) {
        this.zzb = zzikVar;
        this.zza = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zzJ = this.zzb.zzt.zzJ();
        boolean zzI = this.zzb.zzt.zzI();
        this.zzb.zzt.zzF(this.zza);
        if (zzI == this.zza) {
            this.zzb.zzt.zzaA().zzj().zzb("Default data collection state already set to", Boolean.valueOf(this.zza));
        }
        if (this.zzb.zzt.zzJ() == zzJ || this.zzb.zzt.zzJ() != this.zzb.zzt.zzI()) {
            this.zzb.zzt.zzaA().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(this.zza), Boolean.valueOf(zzJ));
        }
        this.zzb.zzab();
    }
}
