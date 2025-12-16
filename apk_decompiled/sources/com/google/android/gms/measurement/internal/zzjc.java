package com.google.android.gms.measurement.internal;

import C.w;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjc implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlk zzc;
    final /* synthetic */ zzjz zzd;

    public zzjc(zzjz zzjzVar, zzq zzqVar, boolean z3, zzlk zzlkVar) {
        this.zzd = zzjzVar;
        this.zza = zzqVar;
        this.zzb = z3;
        this.zzc = zzlkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zzd;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            w.v(zzjzVar.zzt, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzejVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
