package com.google.android.gms.internal.measurement;

import C.w;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznk zzc;
    private static final zznk zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zznk zznkVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zznkVar = (zznk) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zznkVar;
        zzd = new zznm();
    }

    public static Object zzA(Object obj, int i, int i4, Object obj2, zznk zznkVar) {
        if (obj2 == null) {
            obj2 = zznkVar.zzc(obj);
        }
        zznkVar.zzf(obj2, i, i4);
        return obj2;
    }

    public static void zzB(zznk zznkVar, Object obj, Object obj2) {
        zznkVar.zzh(obj, zznkVar.zze(zznkVar.zzd(obj), zznkVar.zzd(obj2)));
    }

    public static void zzC(Class cls) {
        Class cls2;
        if (!zzlb.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzD(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzc(i, list, z3);
    }

    public static void zzE(int i, List list, zzoc zzocVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zze(i, list);
    }

    public static void zzF(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzg(i, list, z3);
    }

    public static void zzG(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzj(i, list, z3);
    }

    public static void zzH(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzl(i, list, z3);
    }

    public static void zzI(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzn(i, list, z3);
    }

    public static void zzJ(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzp(i, list, z3);
    }

    public static void zzK(int i, List list, zzoc zzocVar, zzmt zzmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((zzkj) zzocVar).zzq(i, list.get(i4), zzmtVar);
        }
    }

    public static void zzL(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzs(i, list, z3);
    }

    public static void zzM(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzu(i, list, z3);
    }

    public static void zzN(int i, List list, zzoc zzocVar, zzmt zzmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((zzkj) zzocVar).zzv(i, list.get(i4), zzmtVar);
        }
    }

    public static void zzO(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzx(i, list, z3);
    }

    public static void zzP(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzz(i, list, z3);
    }

    public static void zzQ(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzB(i, list, z3);
    }

    public static void zzR(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzD(i, list, z3);
    }

    public static void zzS(int i, List list, zzoc zzocVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzG(i, list);
    }

    public static void zzT(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzI(i, list, z3);
    }

    public static void zzU(int i, List list, zzoc zzocVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzK(i, list, z3);
    }

    public static boolean zzV(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(int i, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) + 1) * size;
    }

    public static int zzb(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzki.zzx(i << 3) * size;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int zzd2 = ((zzka) list.get(i4)).zzd();
            zzx = w.B(zzd2, zzd2, zzx);
        }
        return zzx;
    }

    public static int zzc(int i, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlc)) {
            int i4 = 0;
            while (i < size) {
                i4 += zzki.zzu(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        zzlc zzlcVar = (zzlc) list;
        int i5 = 0;
        while (i < size) {
            i5 += zzki.zzu(zzlcVar.zze(i));
            i++;
        }
        return i5;
    }

    public static int zze(int i, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += zzki.zzt(i, (zzmi) list.get(i5), zzmtVar);
        }
        return i4;
    }

    public static int zzj(int i, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlc)) {
            int i4 = 0;
            while (i < size) {
                i4 += zzki.zzu(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        zzlc zzlcVar = (zzlc) list;
        int i5 = 0;
        while (i < size) {
            i5 += zzki.zzu(zzlcVar.zze(i));
            i++;
        }
        return i5;
    }

    public static int zzl(int i, List list, boolean z3) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlx)) {
            int i4 = 0;
            while (i < size) {
                i4 += zzki.zzy(((Long) list.get(i)).longValue());
                i++;
            }
            return i4;
        }
        zzlx zzlxVar = (zzlx) list;
        int i5 = 0;
        while (i < size) {
            i5 += zzki.zzy(zzlxVar.zza(i));
            i++;
        }
        return i5;
    }

    public static int zzn(int i, Object obj, zzmt zzmtVar) {
        if (!(obj instanceof zzlo)) {
            return zzki.zzx(i << 3) + zzki.zzv((zzmi) obj, zzmtVar);
        }
        int i4 = zzki.zzb;
        int zza2 = ((zzlo) obj).zza();
        return zzki.zzx(i << 3) + zzki.zzx(zza2) + zza2;
    }

    public static int zzo(int i, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzki.zzx(i << 3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            if (obj instanceof zzlo) {
                int zza2 = ((zzlo) obj).zza();
                zzx = w.B(zza2, zza2, zzx);
            } else {
                zzx = zzki.zzv((zzmi) obj, zzmtVar) + zzx;
            }
        }
        return zzx;
    }

    public static int zzp(int i, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlc)) {
            int i4 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i4 += zzki.zzx((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i4;
        }
        zzlc zzlcVar = (zzlc) list;
        int i5 = 0;
        while (i < size) {
            int zze = zzlcVar.zze(i);
            i5 += zzki.zzx((zze >> 31) ^ (zze + zze));
            i++;
        }
        return i5;
    }

    public static int zzr(int i, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlx)) {
            int i4 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i4 += zzki.zzy((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i4;
        }
        zzlx zzlxVar = (zzlx) list;
        int i5 = 0;
        while (i < size) {
            long zza2 = zzlxVar.zza(i);
            i5 += zzki.zzy((zza2 >> 63) ^ (zza2 + zza2));
            i++;
        }
        return i5;
    }

    public static int zzt(int i, List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z3 = list instanceof zzlq;
        int zzx = zzki.zzx(i << 3) * size;
        if (!z3) {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzka) {
                    int zzd2 = ((zzka) obj).zzd();
                    zzx = w.B(zzd2, zzd2, zzx);
                } else {
                    zzx = zzki.zzw((String) obj) + zzx;
                }
                i4++;
            }
            return zzx;
        }
        zzlq zzlqVar = (zzlq) list;
        while (i4 < size) {
            Object zzf = zzlqVar.zzf(i4);
            if (zzf instanceof zzka) {
                int zzd3 = ((zzka) zzf).zzd();
                zzx = w.B(zzd3, zzd3, zzx);
            } else {
                zzx = zzki.zzw((String) zzf) + zzx;
            }
            i4++;
        }
        return zzx;
    }

    public static int zzu(int i, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlc)) {
            int i4 = 0;
            while (i < size) {
                i4 += zzki.zzx(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        zzlc zzlcVar = (zzlc) list;
        int i5 = 0;
        while (i < size) {
            i5 += zzki.zzx(zzlcVar.zze(i));
            i++;
        }
        return i5;
    }

    public static int zzw(int i, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlx)) {
            int i4 = 0;
            while (i < size) {
                i4 += zzki.zzy(((Long) list.get(i)).longValue());
                i++;
            }
            return i4;
        }
        zzlx zzlxVar = (zzlx) list;
        int i5 = 0;
        while (i < size) {
            i5 += zzki.zzy(zzlxVar.zza(i));
            i++;
        }
        return i5;
    }

    public static zznk zzy() {
        return zzc;
    }

    public static zznk zzz() {
        return zzd;
    }
}
