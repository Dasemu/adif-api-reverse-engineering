package com.google.android.gms.internal.measurement;

import C.w;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbi extends zzaw {
    public zzbi() {
        this.zza.add(zzbl.ADD);
        this.zza.add(zzbl.DIVIDE);
        this.zza.add(zzbl.MODULUS);
        this.zza.add(zzbl.MULTIPLY);
        this.zza.add(zzbl.NEGATE);
        this.zza.add(zzbl.POST_DECREMENT);
        this.zza.add(zzbl.POST_INCREMENT);
        this.zza.add(zzbl.PRE_DECREMENT);
        this.zza.add(zzbl.PRE_INCREMENT);
        this.zza.add(zzbl.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 0) {
            zzap zzb = zzgVar.zzb((zzap) w.h(zzbl.ADD, 2, list, 0));
            zzap zzb2 = zzgVar.zzb((zzap) list.get(1));
            if (!(zzb instanceof zzal) && !(zzb instanceof zzat) && !(zzb2 instanceof zzal) && !(zzb2 instanceof zzat)) {
                return new zzah(Double.valueOf(zzb2.zzh().doubleValue() + zzb.zzh().doubleValue()));
            }
            return new zzat(String.valueOf(zzb.zzi()).concat(String.valueOf(zzb2.zzi())));
        }
        if (ordinal == 21) {
            return new zzah(Double.valueOf(zzgVar.zzb((zzap) w.h(zzbl.DIVIDE, 2, list, 0)).zzh().doubleValue() / zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()));
        }
        if (ordinal == 59) {
            zzap zzb3 = zzgVar.zzb((zzap) w.h(zzbl.SUBTRACT, 2, list, 0));
            zzah zzahVar = new zzah(Double.valueOf(-zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()));
            return new zzah(Double.valueOf(zzahVar.zzh().doubleValue() + zzb3.zzh().doubleValue()));
        }
        if (ordinal == 52 || ordinal == 53) {
            zzh.zzh(str, 2, list);
            zzap zzb4 = zzgVar.zzb((zzap) list.get(0));
            zzgVar.zzb((zzap) list.get(1));
            return zzb4;
        }
        if (ordinal == 55 || ordinal == 56) {
            zzh.zzh(str, 1, list);
            return zzgVar.zzb((zzap) list.get(0));
        }
        switch (ordinal) {
            case 44:
                return new zzah(Double.valueOf(zzgVar.zzb((zzap) w.h(zzbl.MODULUS, 2, list, 0)).zzh().doubleValue() % zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()));
            case 45:
                return new zzah(Double.valueOf(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() * zzgVar.zzb((zzap) w.h(zzbl.MULTIPLY, 2, list, 0)).zzh().doubleValue()));
            case 46:
                return new zzah(Double.valueOf(-zzgVar.zzb((zzap) w.h(zzbl.NEGATE, 1, list, 0)).zzh().doubleValue()));
            default:
                return zzb(str);
        }
    }
}
