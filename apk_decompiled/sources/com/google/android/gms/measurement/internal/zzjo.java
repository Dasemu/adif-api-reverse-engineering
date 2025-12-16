package com.google.android.gms.measurement.internal;

import C.w;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjo implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjz zze;

    public zzjo(zzjz zzjzVar, boolean z3, zzq zzqVar, boolean z4, zzau zzauVar, String str) {
        this.zze = zzjzVar;
        this.zza = zzqVar;
        this.zzb = z4;
        this.zzc = zzauVar;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zze;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            w.v(zzjzVar.zzt, "Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzejVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
