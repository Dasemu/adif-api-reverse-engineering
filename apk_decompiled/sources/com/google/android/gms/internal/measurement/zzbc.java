package com.google.android.gms.internal.measurement;

import C.w;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbc extends zzaw {
    public zzbc() {
        this.zza.add(zzbl.AND);
        this.zza.add(zzbl.NOT);
        this.zza.add(zzbl.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 1) {
            zzap zzb = zzgVar.zzb((zzap) w.h(zzbl.AND, 2, list, 0));
            return !zzb.zzg().booleanValue() ? zzb : zzgVar.zzb((zzap) list.get(1));
        }
        if (ordinal == 47) {
            return new zzaf(Boolean.valueOf(!zzgVar.zzb((zzap) w.h(zzbl.NOT, 1, list, 0)).zzg().booleanValue()));
        }
        if (ordinal != 50) {
            return zzb(str);
        }
        zzap zzb2 = zzgVar.zzb((zzap) w.h(zzbl.OR, 2, list, 0));
        return zzb2.zzg().booleanValue() ? zzb2 : zzgVar.zzb((zzap) list.get(1));
    }
}
