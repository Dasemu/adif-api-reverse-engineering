package com.google.android.gms.internal.measurement;

import C.w;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaz extends zzaw {
    public zzaz() {
        this.zza.add(zzbl.APPLY);
        this.zza.add(zzbl.BLOCK);
        this.zza.add(zzbl.BREAK);
        this.zza.add(zzbl.CASE);
        this.zza.add(zzbl.DEFAULT);
        this.zza.add(zzbl.CONTINUE);
        this.zza.add(zzbl.DEFINE_FUNCTION);
        this.zza.add(zzbl.FN);
        this.zza.add(zzbl.IF);
        this.zza.add(zzbl.QUOTE);
        this.zza.add(zzbl.RETURN);
        this.zza.add(zzbl.SWITCH);
        this.zza.add(zzbl.TERNARY);
    }

    private static zzap zzc(zzg zzgVar, List list) {
        zzh.zzi(zzbl.FN.name(), 2, list);
        zzap zzb = zzgVar.zzb((zzap) list.get(0));
        zzap zzb2 = zzgVar.zzb((zzap) list.get(1));
        if (!(zzb2 instanceof zzae)) {
            throw new IllegalArgumentException(w.z("FN requires an ArrayValue of parameter names found ", zzb2.getClass().getCanonicalName()));
        }
        List zzm = ((zzae) zzb2).zzm();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new zzao(zzb.zzi(), zzm, arrayList, zzgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 2) {
            zzap zzb = zzgVar.zzb((zzap) w.h(zzbl.APPLY, 3, list, 0));
            String zzi = zzgVar.zzb((zzap) list.get(1)).zzi();
            zzap zzb2 = zzgVar.zzb((zzap) list.get(2));
            if (!(zzb2 instanceof zzae)) {
                throw new IllegalArgumentException(w.z("Function arguments for Apply are not a list found ", zzb2.getClass().getCanonicalName()));
            }
            if (zzi.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return zzb.zzbU(zzi, zzgVar, ((zzae) zzb2).zzm());
        }
        if (ordinal == 15) {
            zzh.zzh(zzbl.BREAK.name(), 0, list);
            return zzap.zzh;
        }
        if (ordinal == 25) {
            return zzc(zzgVar, list);
        }
        if (ordinal == 41) {
            zzh.zzi(zzbl.IF.name(), 2, list);
            zzap zzb3 = zzgVar.zzb((zzap) list.get(0));
            zzap zzb4 = zzgVar.zzb((zzap) list.get(1));
            zzap zzb5 = list.size() > 2 ? zzgVar.zzb((zzap) list.get(2)) : null;
            zzap zzapVar = zzap.zzf;
            zzap zzc = zzb3.zzg().booleanValue() ? zzgVar.zzc((zzae) zzb4) : zzb5 != null ? zzgVar.zzc((zzae) zzb5) : zzapVar;
            return zzc instanceof zzag ? zzc : zzapVar;
        }
        if (ordinal == 54) {
            return new zzae(list);
        }
        if (ordinal == 57) {
            return list.isEmpty() ? zzap.zzj : new zzag("return", zzgVar.zzb((zzap) w.h(zzbl.RETURN, 1, list, 0)));
        }
        if (ordinal != 19) {
            if (ordinal == 20) {
                zzh.zzi(zzbl.DEFINE_FUNCTION.name(), 2, list);
                zzap zzc2 = zzc(zzgVar, list);
                zzai zzaiVar = (zzai) zzc2;
                if (zzaiVar.zzc() == null) {
                    zzgVar.zzg("", zzc2);
                    return zzc2;
                }
                zzgVar.zzg(zzaiVar.zzc(), zzc2);
                return zzc2;
            }
            if (ordinal == 60) {
                zzap zzb6 = zzgVar.zzb((zzap) w.h(zzbl.SWITCH, 3, list, 0));
                zzap zzb7 = zzgVar.zzb((zzap) list.get(1));
                zzap zzb8 = zzgVar.zzb((zzap) list.get(2));
                if (!(zzb7 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(zzb8 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                zzae zzaeVar = (zzae) zzb7;
                zzae zzaeVar2 = (zzae) zzb8;
                boolean z3 = false;
                for (int i = 0; i < zzaeVar.zzc(); i++) {
                    if (z3 || zzb6.equals(zzgVar.zzb(zzaeVar.zze(i)))) {
                        zzap zzb9 = zzgVar.zzb(zzaeVar2.zze(i));
                        if (zzb9 instanceof zzag) {
                            return ((zzag) zzb9).zzc().equals("break") ? zzap.zzf : zzb9;
                        }
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (zzaeVar.zzc() + 1 == zzaeVar2.zzc()) {
                    zzap zzb10 = zzgVar.zzb(zzaeVar2.zze(zzaeVar.zzc()));
                    if (zzb10 instanceof zzag) {
                        String zzc3 = ((zzag) zzb10).zzc();
                        if (zzc3.equals("return") || zzc3.equals("continue")) {
                            return zzb10;
                        }
                    }
                }
                return zzap.zzf;
            }
            if (ordinal == 61) {
                return zzgVar.zzb((zzap) w.h(zzbl.TERNARY, 3, list, 0)).zzg().booleanValue() ? zzgVar.zzb((zzap) list.get(1)) : zzgVar.zzb((zzap) list.get(2));
            }
            switch (ordinal) {
                case 11:
                    return zzgVar.zza().zzc(new zzae(list));
                case 12:
                    zzh.zzh(zzbl.BREAK.name(), 0, list);
                    return zzap.zzi;
                case 13:
                    break;
                default:
                    return zzb(str);
            }
        }
        if (list.isEmpty()) {
            return zzap.zzf;
        }
        zzap zzb11 = zzgVar.zzb((zzap) list.get(0));
        return zzb11 instanceof zzae ? zzgVar.zzc((zzae) zzb11) : zzap.zzf;
    }
}
