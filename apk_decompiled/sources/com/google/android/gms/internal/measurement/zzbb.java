package com.google.android.gms.internal.measurement;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzap zza(String str, zzae zzaeVar, zzg zzgVar, List list) {
        char c4;
        double d4;
        String str2;
        double d5;
        double d6;
        zzae zzaeVar2;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    c4 = 18;
                    break;
                }
                c4 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c4 = 17;
                    break;
                }
                c4 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c4 = 19;
                    break;
                }
                c4 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c4 = 15;
                    break;
                }
                c4 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c4 = 14;
                    break;
                }
                c4 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        zzai zzaiVar = null;
        switch (c4) {
            case 0:
                zzap zzd = zzaeVar.zzd();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zzap zzb = zzgVar.zzb((zzap) it.next());
                        if (zzb instanceof zzag) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        zzae zzaeVar3 = (zzae) zzd;
                        int zzc = zzaeVar3.zzc();
                        if (zzb instanceof zzae) {
                            zzae zzaeVar4 = (zzae) zzb;
                            Iterator zzk = zzaeVar4.zzk();
                            while (zzk.hasNext()) {
                                Integer num = (Integer) zzk.next();
                                zzaeVar3.zzq(num.intValue() + zzc, zzaeVar4.zze(num.intValue()));
                            }
                        } else {
                            zzaeVar3.zzq(zzc, zzb);
                        }
                    }
                }
                return zzd;
            case 1:
                zzh.zzh("every", 1, list);
                zzap zzb2 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzb2 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzc() != 0 && zzb(zzaeVar, zzgVar, (zzao) zzb2, Boolean.FALSE, Boolean.TRUE).zzc() != zzaeVar.zzc()) {
                    return zzap.zzl;
                }
                return zzap.zzk;
            case 2:
                zzh.zzh("filter", 1, list);
                zzap zzb3 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzb3 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzb() == 0) {
                    return new zzae();
                }
                zzap zzd2 = zzaeVar.zzd();
                zzae zzb4 = zzb(zzaeVar, zzgVar, (zzao) zzb3, null, Boolean.TRUE);
                zzae zzaeVar5 = new zzae();
                Iterator zzk2 = zzb4.zzk();
                while (zzk2.hasNext()) {
                    zzaeVar5.zzq(zzaeVar5.zzc(), ((zzae) zzd2).zze(((Integer) zzk2.next()).intValue()));
                }
                return zzaeVar5;
            case 3:
                zzh.zzh("forEach", 1, list);
                zzap zzb5 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzb5 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzb() == 0) {
                    return zzap.zzf;
                }
                zzb(zzaeVar, zzgVar, (zzao) zzb5, null, null);
                return zzap.zzf;
            case 4:
                zzh.zzj("indexOf", 2, list);
                zzap zzapVar = zzap.zzf;
                if (!list.isEmpty()) {
                    zzapVar = zzgVar.zzb((zzap) list.get(0));
                }
                if (list.size() > 1) {
                    d4 = zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                    if (d4 >= zzaeVar.zzc()) {
                        return new zzah(Double.valueOf(-1.0d));
                    }
                    if (d4 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        d4 += zzaeVar.zzc();
                    }
                } else {
                    d4 = 0.0d;
                }
                Iterator zzk3 = zzaeVar.zzk();
                while (zzk3.hasNext()) {
                    int intValue = ((Integer) zzk3.next()).intValue();
                    double d7 = intValue;
                    if (d7 >= d4 && zzh.zzl(zzaeVar.zze(intValue), zzapVar)) {
                        return new zzah(Double.valueOf(d7));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 5:
                zzh.zzj("join", 1, list);
                if (zzaeVar.zzc() == 0) {
                    return zzap.zzm;
                }
                if (list.isEmpty()) {
                    str2 = ",";
                } else {
                    zzap zzb6 = zzgVar.zzb((zzap) list.get(0));
                    str2 = ((zzb6 instanceof zzan) || (zzb6 instanceof zzau)) ? "" : zzb6.zzi();
                }
                return new zzat(zzaeVar.zzj(str2));
            case 6:
                zzh.zzj("lastIndexOf", 2, list);
                zzap zzapVar2 = zzap.zzf;
                if (!list.isEmpty()) {
                    zzapVar2 = zzgVar.zzb((zzap) list.get(0));
                }
                int zzc2 = zzaeVar.zzc() - 1;
                if (list.size() > 1) {
                    zzap zzb7 = zzgVar.zzb((zzap) list.get(1));
                    d6 = Double.isNaN(zzb7.zzh().doubleValue()) ? zzaeVar.zzc() - 1 : zzh.zza(zzb7.zzh().doubleValue());
                    d5 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (d6 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        d6 += zzaeVar.zzc();
                    }
                } else {
                    d5 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    d6 = zzc2;
                }
                if (d6 < d5) {
                    return new zzah(Double.valueOf(-1.0d));
                }
                for (int min = (int) Math.min(zzaeVar.zzc(), d6); min >= 0; min--) {
                    if (zzaeVar.zzs(min) && zzh.zzl(zzaeVar.zze(min), zzapVar2)) {
                        return new zzah(Double.valueOf(min));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 7:
                zzh.zzh("map", 1, list);
                zzap zzb8 = zzgVar.zzb((zzap) list.get(0));
                if (zzb8 instanceof zzao) {
                    return zzaeVar.zzc() == 0 ? new zzae() : zzb(zzaeVar, zzgVar, (zzao) zzb8, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                zzh.zzh("pop", 0, list);
                int zzc3 = zzaeVar.zzc();
                if (zzc3 == 0) {
                    return zzap.zzf;
                }
                int i = zzc3 - 1;
                zzap zze = zzaeVar.zze(i);
                zzaeVar.zzp(i);
                return zze;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzaeVar.zzq(zzaeVar.zzc(), zzgVar.zzb((zzap) it2.next()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar.zzc()));
            case '\n':
                return zzc(zzaeVar, zzgVar, list, true);
            case 11:
                return zzc(zzaeVar, zzgVar, list, false);
            case '\f':
                zzh.zzh("reverse", 0, list);
                int zzc4 = zzaeVar.zzc();
                if (zzc4 != 0) {
                    for (int i4 = 0; i4 < zzc4 / 2; i4++) {
                        if (zzaeVar.zzs(i4)) {
                            zzap zze2 = zzaeVar.zze(i4);
                            zzaeVar.zzq(i4, null);
                            int i5 = (zzc4 - 1) - i4;
                            if (zzaeVar.zzs(i5)) {
                                zzaeVar.zzq(i4, zzaeVar.zze(i5));
                            }
                            zzaeVar.zzq(i5, zze2);
                        }
                    }
                }
                return zzaeVar;
            case '\r':
                zzh.zzh("shift", 0, list);
                if (zzaeVar.zzc() == 0) {
                    return zzap.zzf;
                }
                zzap zze3 = zzaeVar.zze(0);
                zzaeVar.zzp(0);
                return zze3;
            case 14:
                zzh.zzj("slice", 2, list);
                if (list.isEmpty()) {
                    return zzaeVar.zzd();
                }
                double zzc5 = zzaeVar.zzc();
                double zza = zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                double max = zza < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(zza + zzc5, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(zza, zzc5);
                if (list.size() == 2) {
                    double zza2 = zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                    zzc5 = zza2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(zzc5 + zza2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(zzc5, zza2);
                }
                zzae zzaeVar6 = new zzae();
                for (int i6 = (int) max; i6 < zzc5; i6++) {
                    zzaeVar6.zzq(zzaeVar6.zzc(), zzaeVar.zze(i6));
                }
                return zzaeVar6;
            case 15:
                zzh.zzh("some", 1, list);
                zzap zzb9 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzb9 instanceof zzai)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzc() == 0) {
                    return zzap.zzl;
                }
                zzai zzaiVar2 = (zzai) zzb9;
                Iterator zzk4 = zzaeVar.zzk();
                while (zzk4.hasNext()) {
                    int intValue2 = ((Integer) zzk4.next()).intValue();
                    if (zzaeVar.zzs(intValue2) && zzaiVar2.zza(zzgVar, Arrays.asList(zzaeVar.zze(intValue2), new zzah(Double.valueOf(intValue2)), zzaeVar)).zzg().booleanValue()) {
                        return zzap.zzk;
                    }
                }
                return zzap.zzl;
            case 16:
                zzh.zzj("sort", 1, list);
                if (zzaeVar.zzc() >= 2) {
                    List zzm = zzaeVar.zzm();
                    if (!list.isEmpty()) {
                        zzap zzb10 = zzgVar.zzb((zzap) list.get(0));
                        if (!(zzb10 instanceof zzai)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        zzaiVar = (zzai) zzb10;
                    }
                    Collections.sort(zzm, new zzba(zzaiVar, zzgVar));
                    zzaeVar.zzn();
                    Iterator it3 = zzm.iterator();
                    int i7 = 0;
                    while (it3.hasNext()) {
                        zzaeVar.zzq(i7, (zzap) it3.next());
                        i7++;
                    }
                }
                return zzaeVar;
            case 17:
                if (list.isEmpty()) {
                    return new zzae();
                }
                int zza3 = (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                if (zza3 < 0) {
                    zza3 = Math.max(0, zzaeVar.zzc() + zza3);
                } else if (zza3 > zzaeVar.zzc()) {
                    zza3 = zzaeVar.zzc();
                }
                int zzc6 = zzaeVar.zzc();
                zzae zzaeVar7 = new zzae();
                if (list.size() > 1) {
                    int max2 = Math.max(0, (int) zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()));
                    if (max2 > 0) {
                        for (int i8 = zza3; i8 < Math.min(zzc6, zza3 + max2); i8++) {
                            zzaeVar7.zzq(zzaeVar7.zzc(), zzaeVar.zze(zza3));
                            zzaeVar.zzp(zza3);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i9 = 2; i9 < list.size(); i9++) {
                            zzap zzb11 = zzgVar.zzb((zzap) list.get(i9));
                            if (zzb11 instanceof zzag) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            zzaeVar.zzo((zza3 + i9) - 2, zzb11);
                        }
                    }
                } else {
                    while (zza3 < zzc6) {
                        zzaeVar7.zzq(zzaeVar7.zzc(), zzaeVar.zze(zza3));
                        zzaeVar.zzq(zza3, null);
                        zza3++;
                    }
                }
                return zzaeVar7;
            case 18:
                zzh.zzh("toString", 0, list);
                return new zzat(zzaeVar.zzj(","));
            case 19:
                if (list.isEmpty()) {
                    zzaeVar2 = zzaeVar;
                } else {
                    zzae zzaeVar8 = new zzae();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        zzap zzb12 = zzgVar.zzb((zzap) it4.next());
                        if (zzb12 instanceof zzag) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        zzaeVar8.zzq(zzaeVar8.zzc(), zzb12);
                    }
                    int zzc7 = zzaeVar8.zzc();
                    Iterator zzk5 = zzaeVar.zzk();
                    while (zzk5.hasNext()) {
                        Integer num2 = (Integer) zzk5.next();
                        zzaeVar8.zzq(num2.intValue() + zzc7, zzaeVar.zze(num2.intValue()));
                    }
                    zzaeVar2 = zzaeVar;
                    zzaeVar2.zzn();
                    Iterator zzk6 = zzaeVar8.zzk();
                    while (zzk6.hasNext()) {
                        Integer num3 = (Integer) zzk6.next();
                        zzaeVar2.zzq(num3.intValue(), zzaeVar8.zze(num3.intValue()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar2.zzc()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static zzae zzb(zzae zzaeVar, zzg zzgVar, zzai zzaiVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator zzk = zzaeVar.zzk();
        while (zzk.hasNext()) {
            int intValue = ((Integer) zzk.next()).intValue();
            if (zzaeVar.zzs(intValue)) {
                zzap zza = zzaiVar.zza(zzgVar, Arrays.asList(zzaeVar.zze(intValue), new zzah(Double.valueOf(intValue)), zzaeVar));
                if (zza.zzg().equals(bool)) {
                    break;
                }
                if (bool2 == null || zza.zzg().equals(bool2)) {
                    zzaeVar2.zzq(intValue, zza);
                }
            }
        }
        return zzaeVar2;
    }

    private static zzap zzc(zzae zzaeVar, zzg zzgVar, List list, boolean z3) {
        zzap zzapVar;
        zzh.zzi("reduce", 1, list);
        zzh.zzj("reduce", 2, list);
        zzap zzb = zzgVar.zzb((zzap) list.get(0));
        if (!(zzb instanceof zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            zzapVar = zzgVar.zzb((zzap) list.get(1));
            if (zzapVar instanceof zzag) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzaeVar.zzc() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzapVar = null;
        }
        zzai zzaiVar = (zzai) zzb;
        int zzc = zzaeVar.zzc();
        int i = z3 ? 0 : zzc - 1;
        int i4 = z3 ? zzc - 1 : 0;
        int i5 = true == z3 ? 1 : -1;
        if (zzapVar == null) {
            zzapVar = zzaeVar.zze(i);
            i += i5;
        }
        while ((i4 - i) * i5 >= 0) {
            if (zzaeVar.zzs(i)) {
                zzapVar = zzaiVar.zza(zzgVar, Arrays.asList(zzapVar, zzaeVar.zze(i), new zzah(Double.valueOf(i)), zzaeVar));
                if (zzapVar instanceof zzag) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i5;
            } else {
                i += i5;
            }
        }
        return zzapVar;
    }
}
