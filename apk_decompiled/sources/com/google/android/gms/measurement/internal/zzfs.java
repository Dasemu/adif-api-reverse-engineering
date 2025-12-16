package com.google.android.gms.measurement.internal;

import java.util.List;

/* loaded from: classes3.dex */
final class zzfs implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfu zza;

    public zzfs(zzfu zzfuVar) {
        this.zza = zzfuVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z3, boolean z4) {
        int i4 = i - 1;
        zzer zzi = i4 != 0 ? i4 != 1 ? i4 != 3 ? i4 != 4 ? this.zza.zzt.zzaA().zzi() : z3 ? this.zza.zzt.zzaA().zzm() : !z4 ? this.zza.zzt.zzaA().zzl() : this.zza.zzt.zzaA().zzk() : this.zza.zzt.zzaA().zzj() : z3 ? this.zza.zzt.zzaA().zzh() : !z4 ? this.zza.zzt.zzaA().zze() : this.zza.zzt.zzaA().zzd() : this.zza.zzt.zzaA().zzc();
        int size = list.size();
        if (size == 1) {
            zzi.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzi.zza(str);
        } else {
            zzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
