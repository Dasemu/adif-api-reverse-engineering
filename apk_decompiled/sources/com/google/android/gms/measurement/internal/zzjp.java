package com.google.android.gms.measurement.internal;

import C.w;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjp implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzac zzc;
    final /* synthetic */ zzac zzd;
    final /* synthetic */ zzjz zze;

    public zzjp(zzjz zzjzVar, boolean z3, zzq zzqVar, boolean z4, zzac zzacVar, zzac zzacVar2) {
        this.zze = zzjzVar;
        this.zza = zzqVar;
        this.zzb = z4;
        this.zzc = zzacVar;
        this.zzd = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zze;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            w.v(zzjzVar.zzt, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzejVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
