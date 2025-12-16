package com.google.android.gms.internal.measurement;

import C.w;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzh {
    public static double zza(double d4) {
        if (Double.isNaN(d4)) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        if (Double.isInfinite(d4) || d4 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d4 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return d4;
        }
        return (d4 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : -1) * Math.floor(Math.abs(d4));
    }

    public static int zzb(double d4) {
        if (Double.isNaN(d4) || Double.isInfinite(d4) || d4 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 0;
        }
        return (int) (((d4 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : -1) * Math.floor(Math.abs(d4))) % 4.294967296E9d);
    }

    public static int zzc(zzg zzgVar) {
        int zzb = zzb(zzgVar.zzd("runtime.counter").zzh().doubleValue() + 1.0d);
        if (zzb > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        zzgVar.zzg("runtime.counter", new zzah(Double.valueOf(zzb)));
        return zzb;
    }

    public static long zzd(double d4) {
        return zzb(d4) & 4294967295L;
    }

    public static zzbl zze(String str) {
        zzbl zzblVar = null;
        if (str != null && !str.isEmpty()) {
            zzblVar = zzbl.zza(Integer.parseInt(str));
        }
        if (zzblVar != null) {
            return zzblVar;
        }
        throw new IllegalArgumentException(w.z("Unsupported commandId ", str));
    }

    public static Object zzf(zzap zzapVar) {
        if (zzap.zzg.equals(zzapVar)) {
            return null;
        }
        if (zzap.zzf.equals(zzapVar)) {
            return "";
        }
        if (zzapVar instanceof zzam) {
            return zzg((zzam) zzapVar);
        }
        if (!(zzapVar instanceof zzae)) {
            return !zzapVar.zzh().isNaN() ? zzapVar.zzh() : zzapVar.zzi();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzae) zzapVar).iterator();
        while (it.hasNext()) {
            Object zzf = zzf((zzap) it.next());
            if (zzf != null) {
                arrayList.add(zzf);
            }
        }
        return arrayList;
    }

    public static Map zzg(zzam zzamVar) {
        HashMap hashMap = new HashMap();
        for (String str : zzamVar.zzb()) {
            Object zzf = zzf(zzamVar.zzf(str));
            if (zzf != null) {
                hashMap.put(str, zzf);
            }
        }
        return hashMap;
    }

    public static void zzh(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void zzi(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void zzj(String str, int i, List list) {
        if (list.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + list.size());
    }

    public static boolean zzk(zzap zzapVar) {
        if (zzapVar == null) {
            return false;
        }
        Double zzh = zzapVar.zzh();
        return !zzh.isNaN() && zzh.doubleValue() >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())));
    }

    public static boolean zzl(zzap zzapVar, zzap zzapVar2) {
        if (!zzapVar.getClass().equals(zzapVar2.getClass())) {
            return false;
        }
        if ((zzapVar instanceof zzau) || (zzapVar instanceof zzan)) {
            return true;
        }
        if (!(zzapVar instanceof zzah)) {
            return zzapVar instanceof zzat ? zzapVar.zzi().equals(zzapVar2.zzi()) : zzapVar instanceof zzaf ? zzapVar.zzg().equals(zzapVar2.zzg()) : zzapVar == zzapVar2;
        }
        if (Double.isNaN(zzapVar.zzh().doubleValue()) || Double.isNaN(zzapVar2.zzh().doubleValue())) {
            return false;
        }
        return zzapVar.zzh().equals(zzapVar2.zzh());
    }
}
