package com.google.android.gms.internal.measurement;

import C.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private zzml(int[] iArr, Object[] objArr, int i, int i4, zzmi zzmiVar, boolean z3, boolean z4, int[] iArr2, int i5, int i6, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i4;
        this.zzi = z3;
        boolean z5 = false;
        if (zzkoVar != null && zzkoVar.zzc(zzmiVar)) {
            z5 = true;
        }
        this.zzh = z5;
        this.zzj = iArr2;
        this.zzk = i5;
        this.zzl = i6;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }

    private final zzlf zzA(int i) {
        int i4 = i / 3;
        return (zzlf) this.zzd[i4 + i4 + 1];
    }

    private final zzmt zzB(int i) {
        int i4 = i / 3;
        int i5 = i4 + i4;
        zzmt zzmtVar = (zzmt) this.zzd[i5];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzb2 = zzmq.zza().zzb((Class) this.zzd[i5 + 1]);
        this.zzd[i5] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i) {
        int i4 = i / 3;
        return this.zzd[i4 + i4];
    }

    private final Object zzD(Object obj, int i) {
        zzmt zzB = zzB(i);
        int zzy = zzy(i) & 1048575;
        if (!zzP(obj, i)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzE(Object obj, int i, int i4) {
        zzmt zzB = zzB(i4);
        if (!zzT(obj, i, i4)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i4) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        if (zzP(obj2, i)) {
            int zzy = zzy(i) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = zzy;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzmt zzB = zzB(i);
            if (!zzP(obj, i)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j4, zze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzJ(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j4, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int i4 = this.zzc[i];
        if (zzT(obj2, i4, i)) {
            int zzy = zzy(i) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = zzy;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzmt zzB = zzB(i);
            if (!zzT(obj, i4, i)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j4, zze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzK(obj, i4, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j4, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i) {
        int zzv = zzv(i);
        long j4 = 1048575 & zzv;
        if (j4 == 1048575) {
            return;
        }
        zznu.zzq(obj, j4, (1 << (zzv >>> 20)) | zznu.zzc(obj, j4));
    }

    private final void zzK(Object obj, int i, int i4) {
        zznu.zzq(obj, zzv(i4) & 1048575, i);
    }

    private final void zzL(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzy(i) & 1048575, obj2);
        zzJ(obj, i);
    }

    private final void zzM(Object obj, int i, int i4, Object obj2) {
        zzb.putObject(obj, zzy(i4) & 1048575, obj2);
        zzK(obj, i, i4);
    }

    private final void zzN(zzoc zzocVar, int i, Object obj, int i4) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        return zzP(obj, i) == zzP(obj2, i);
    }

    private final boolean zzP(Object obj, int i) {
        int zzv = zzv(i);
        long j4 = zzv & 1048575;
        if (j4 != 1048575) {
            return ((1 << (zzv >>> 20)) & zznu.zzc(obj, j4)) != 0;
        }
        int zzy = zzy(i);
        long j5 = zzy & 1048575;
        switch (zzx(zzy)) {
            case 0:
                return Double.doubleToRawLongBits(zznu.zza(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zznu.zzb(obj, j5)) != 0;
            case 2:
                return zznu.zzd(obj, j5) != 0;
            case 3:
                return zznu.zzd(obj, j5) != 0;
            case 4:
                return zznu.zzc(obj, j5) != 0;
            case 5:
                return zznu.zzd(obj, j5) != 0;
            case 6:
                return zznu.zzc(obj, j5) != 0;
            case 7:
                return zznu.zzw(obj, j5);
            case 8:
                Object zzf = zznu.zzf(obj, j5);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzka) {
                    return !zzka.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zznu.zzf(obj, j5) != null;
            case 10:
                return !zzka.zzb.equals(zznu.zzf(obj, j5));
            case 11:
                return zznu.zzc(obj, j5) != 0;
            case 12:
                return zznu.zzc(obj, j5) != 0;
            case 13:
                return zznu.zzc(obj, j5) != 0;
            case 14:
                return zznu.zzd(obj, j5) != 0;
            case 15:
                return zznu.zzc(obj, j5) != 0;
            case 16:
                return zznu.zzd(obj, j5) != 0;
            case 17:
                return zznu.zzf(obj, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i, int i4, int i5, int i6) {
        return i4 == 1048575 ? zzP(obj, i) : (i5 & i6) != 0;
    }

    private static boolean zzR(Object obj, int i, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i, int i4) {
        return zznu.zzc(obj, (long) (zzv(i4) & 1048575)) == i;
    }

    private static boolean zzU(Object obj, long j4) {
        return ((Boolean) zznu.zzf(obj, j4)).booleanValue();
    }

    private static final void zzV(int i, Object obj, zzoc zzocVar) throws IOException {
        if (obj instanceof String) {
            zzocVar.zzF(i, (String) obj);
        } else {
            zzocVar.zzd(i, (zzka) obj);
        }
    }

    public static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar != zznl.zzc()) {
            return zznlVar;
        }
        zznl zzf = zznl.zzf();
        zzlbVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.zzml zzl(java.lang.Class r33, com.google.android.gms.internal.measurement.zzmf r34, com.google.android.gms.internal.measurement.zzmn r35, com.google.android.gms.internal.measurement.zzlw r36, com.google.android.gms.internal.measurement.zznk r37, com.google.android.gms.internal.measurement.zzko r38, com.google.android.gms.internal.measurement.zzmd r39) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zzmf, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzlw, com.google.android.gms.internal.measurement.zznk, com.google.android.gms.internal.measurement.zzko, com.google.android.gms.internal.measurement.zzmd):com.google.android.gms.internal.measurement.zzml");
    }

    private static double zzm(Object obj, long j4) {
        return ((Double) zznu.zzf(obj, j4)).doubleValue();
    }

    private static float zzn(Object obj, long j4) {
        return ((Float) zznu.zzf(obj, j4)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003e. Please report as an issue. */
    private final int zzo(Object obj) {
        int i;
        int zzn;
        int zzy;
        int zzt;
        boolean z3;
        int zzc;
        int zzy2;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < this.zzc.length) {
            int zzy3 = zzy(i6);
            int[] iArr = this.zzc;
            int i9 = iArr[i6];
            int zzx = zzx(zzy3);
            if (zzx <= 17) {
                int i10 = iArr[i6 + 2];
                int i11 = i10 & i4;
                int i12 = i10 >>> 20;
                if (i11 != i5) {
                    i8 = unsafe.getInt(obj, i11);
                    i5 = i11;
                }
                i = 1 << i12;
            } else {
                i = 0;
            }
            long j4 = zzy3 & i4;
            switch (zzx) {
                case 0:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = w.B(i9 << 3, 8, i7);
                        break;
                    }
                case 1:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = w.B(i9 << 3, 4, i7);
                        break;
                    }
                case 2:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = w.B(i9 << 3, zzki.zzy(unsafe.getLong(obj, j4)), i7);
                        break;
                    }
                case 3:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = w.B(i9 << 3, zzki.zzy(unsafe.getLong(obj, j4)), i7);
                        break;
                    }
                case 4:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = w.B(i9 << 3, zzki.zzu(unsafe.getInt(obj, j4)), i7);
                        break;
                    }
                case 5:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = w.B(i9 << 3, 8, i7);
                        break;
                    }
                case 6:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = w.B(i9 << 3, 4, i7);
                        break;
                    }
                case 7:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = w.B(i9 << 3, 1, i7);
                        break;
                    }
                case 8:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j4);
                        if (!(object instanceof zzka)) {
                            i7 = w.B(i9 << 3, zzki.zzw((String) object), i7);
                            break;
                        } else {
                            int i13 = zzki.zzb;
                            int zzd = ((zzka) object).zzd();
                            i7 = w.B(i9 << 3, zzki.zzx(zzd) + zzd, i7);
                            break;
                        }
                    }
                case 9:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzn = zzmv.zzn(i9, unsafe.getObject(obj, j4), zzB(i6));
                        i7 += zzn;
                        break;
                    }
                case 10:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzka zzkaVar = (zzka) unsafe.getObject(obj, j4);
                        int i14 = zzki.zzb;
                        int zzd2 = zzkaVar.zzd();
                        i7 = w.B(i9 << 3, zzki.zzx(zzd2) + zzd2, i7);
                        break;
                    }
                case 11:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = w.B(i9 << 3, zzki.zzx(unsafe.getInt(obj, j4)), i7);
                        break;
                    }
                case 12:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = w.B(i9 << 3, zzki.zzu(unsafe.getInt(obj, j4)), i7);
                        break;
                    }
                case 13:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = w.B(i9 << 3, 4, i7);
                        break;
                    }
                case 14:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = w.B(i9 << 3, 8, i7);
                        break;
                    }
                case 15:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j4);
                        i7 = w.B((i15 >> 31) ^ (i15 + i15), zzki.zzx(i9 << 3), i7);
                        break;
                    }
                case 16:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        long j5 = unsafe.getLong(obj, j4);
                        zzy = zzki.zzy((j5 >> 63) ^ (j5 + j5)) + zzki.zzx(i9 << 3);
                        i7 += zzy;
                        break;
                    }
                case 17:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzt(i9, (zzmi) unsafe.getObject(obj, j4), zzB(i6));
                        i7 += zzy;
                        break;
                    }
                case 18:
                    zzn = zzmv.zzg(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzn;
                    break;
                case 19:
                    zzn = zzmv.zze(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzn;
                    break;
                case 20:
                    zzn = zzmv.zzl(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzn;
                    break;
                case 21:
                    zzn = zzmv.zzw(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzn;
                    break;
                case 22:
                    zzn = zzmv.zzj(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzn;
                    break;
                case 23:
                    zzn = zzmv.zzg(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzn;
                    break;
                case 24:
                    zzn = zzmv.zze(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzn;
                    break;
                case 25:
                    zzn = zzmv.zza(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzn;
                    break;
                case 26:
                    zzt = zzmv.zzt(i9, (List) unsafe.getObject(obj, j4));
                    i7 += zzt;
                    break;
                case 27:
                    zzt = zzmv.zzo(i9, (List) unsafe.getObject(obj, j4), zzB(i6));
                    i7 += zzt;
                    break;
                case 28:
                    zzt = zzmv.zzb(i9, (List) unsafe.getObject(obj, j4));
                    i7 += zzt;
                    break;
                case 29:
                    zzt = zzmv.zzu(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzt;
                    break;
                case 30:
                    z3 = false;
                    zzc = zzmv.zzc(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzc;
                    break;
                case 31:
                    z3 = false;
                    zzc = zzmv.zze(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzc;
                    break;
                case 32:
                    z3 = false;
                    zzc = zzmv.zzg(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzc;
                    break;
                case 33:
                    z3 = false;
                    zzc = zzmv.zzp(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzc;
                    break;
                case 34:
                    z3 = false;
                    zzc = zzmv.zzr(i9, (List) unsafe.getObject(obj, j4), false);
                    i7 += zzc;
                    break;
                case 35:
                    int zzh = zzmv.zzh((List) unsafe.getObject(obj, j4));
                    if (zzh > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzh), zzh, i7);
                    }
                    break;
                case 36:
                    int zzf = zzmv.zzf((List) unsafe.getObject(obj, j4));
                    if (zzf > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzf), zzf, i7);
                    }
                    break;
                case 37:
                    int zzm = zzmv.zzm((List) unsafe.getObject(obj, j4));
                    if (zzm > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzm), zzm, i7);
                    }
                    break;
                case 38:
                    int zzx2 = zzmv.zzx((List) unsafe.getObject(obj, j4));
                    if (zzx2 > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzx2), zzx2, i7);
                    }
                    break;
                case 39:
                    int zzk = zzmv.zzk((List) unsafe.getObject(obj, j4));
                    if (zzk > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzk), zzk, i7);
                    }
                    break;
                case 40:
                    int zzh2 = zzmv.zzh((List) unsafe.getObject(obj, j4));
                    if (zzh2 > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzh2), zzh2, i7);
                    }
                    break;
                case 41:
                    int zzf2 = zzmv.zzf((List) unsafe.getObject(obj, j4));
                    if (zzf2 > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzf2), zzf2, i7);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j4);
                    int i16 = zzmv.zza;
                    int size = list.size();
                    if (size > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(size), size, i7);
                    }
                    break;
                case 43:
                    int zzv = zzmv.zzv((List) unsafe.getObject(obj, j4));
                    if (zzv > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzv), zzv, i7);
                    }
                    break;
                case 44:
                    int zzd3 = zzmv.zzd((List) unsafe.getObject(obj, j4));
                    if (zzd3 > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzd3), zzd3, i7);
                    }
                    break;
                case 45:
                    int zzf3 = zzmv.zzf((List) unsafe.getObject(obj, j4));
                    if (zzf3 > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzf3), zzf3, i7);
                    }
                    break;
                case 46:
                    int zzh3 = zzmv.zzh((List) unsafe.getObject(obj, j4));
                    if (zzh3 > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzh3), zzh3, i7);
                    }
                    break;
                case 47:
                    int zzq = zzmv.zzq((List) unsafe.getObject(obj, j4));
                    if (zzq > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzq), zzq, i7);
                    }
                    break;
                case 48:
                    int zzs = zzmv.zzs((List) unsafe.getObject(obj, j4));
                    if (zzs > 0) {
                        i7 = w.y(i9 << 3, zzki.zzx(zzs), zzs, i7);
                    }
                    break;
                case 49:
                    zzt = zzmv.zzi(i9, (List) unsafe.getObject(obj, j4), zzB(i6));
                    i7 += zzt;
                    break;
                case 50:
                    zzmd.zza(i9, unsafe.getObject(obj, j4), zzC(i6));
                    break;
                case 51:
                    if (zzT(obj, i9, i6)) {
                        i7 = w.B(i9 << 3, 8, i7);
                    }
                    break;
                case 52:
                    if (zzT(obj, i9, i6)) {
                        i7 = w.B(i9 << 3, 4, i7);
                    }
                    break;
                case 53:
                    if (zzT(obj, i9, i6)) {
                        i7 = w.B(i9 << 3, zzki.zzy(zzz(obj, j4)), i7);
                    }
                    break;
                case 54:
                    if (zzT(obj, i9, i6)) {
                        i7 = w.B(i9 << 3, zzki.zzy(zzz(obj, j4)), i7);
                    }
                    break;
                case 55:
                    if (zzT(obj, i9, i6)) {
                        i7 = w.B(i9 << 3, zzki.zzu(zzp(obj, j4)), i7);
                    }
                    break;
                case 56:
                    if (zzT(obj, i9, i6)) {
                        i7 = w.B(i9 << 3, 8, i7);
                    }
                    break;
                case 57:
                    if (zzT(obj, i9, i6)) {
                        i7 = w.B(i9 << 3, 4, i7);
                    }
                    break;
                case 58:
                    if (zzT(obj, i9, i6)) {
                        i7 = w.B(i9 << 3, 1, i7);
                    }
                    break;
                case 59:
                    if (zzT(obj, i9, i6)) {
                        Object object2 = unsafe.getObject(obj, j4);
                        if (object2 instanceof zzka) {
                            int i17 = zzki.zzb;
                            int zzd4 = ((zzka) object2).zzd();
                            i7 = w.B(i9 << 3, zzki.zzx(zzd4) + zzd4, i7);
                        } else {
                            i7 = w.B(i9 << 3, zzki.zzw((String) object2), i7);
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i9, i6)) {
                        zzt = zzmv.zzn(i9, unsafe.getObject(obj, j4), zzB(i6));
                        i7 += zzt;
                    }
                    break;
                case 61:
                    if (zzT(obj, i9, i6)) {
                        zzka zzkaVar2 = (zzka) unsafe.getObject(obj, j4);
                        int i18 = zzki.zzb;
                        int zzd5 = zzkaVar2.zzd();
                        i7 = w.B(i9 << 3, zzki.zzx(zzd5) + zzd5, i7);
                    }
                    break;
                case 62:
                    if (zzT(obj, i9, i6)) {
                        i7 = w.B(i9 << 3, zzki.zzx(zzp(obj, j4)), i7);
                    }
                    break;
                case 63:
                    if (zzT(obj, i9, i6)) {
                        i7 = w.B(i9 << 3, zzki.zzu(zzp(obj, j4)), i7);
                    }
                    break;
                case 64:
                    if (zzT(obj, i9, i6)) {
                        i7 = w.B(i9 << 3, 4, i7);
                    }
                    break;
                case 65:
                    if (zzT(obj, i9, i6)) {
                        i7 = w.B(i9 << 3, 8, i7);
                    }
                    break;
                case 66:
                    if (zzT(obj, i9, i6)) {
                        int zzp = zzp(obj, j4);
                        i7 = w.B((zzp >> 31) ^ (zzp + zzp), zzki.zzx(i9 << 3), i7);
                    }
                    break;
                case 67:
                    if (zzT(obj, i9, i6)) {
                        long zzz = zzz(obj, j4);
                        zzy2 = zzki.zzy((zzz >> 63) ^ (zzz + zzz)) + zzki.zzx(i9 << 3);
                        i7 += zzy2;
                    }
                    break;
                case 68:
                    if (zzT(obj, i9, i6)) {
                        zzy2 = zzki.zzt(i9, (zzmi) unsafe.getObject(obj, j4), zzB(i6));
                        i7 += zzy2;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        zznk zznkVar = this.zzn;
        int zza2 = i7 + zznkVar.zza(zznkVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j4) {
        return ((Integer) zznu.zzf(obj, j4)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i, int i4, int i5, long j4, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i5);
        Object object = unsafe.getObject(obj, j4);
        if (!((zzmc) object).zze()) {
            zzmc zzb2 = zzmc.zza().zzb();
            zzmd.zzb(zzb2, object);
            unsafe.putObject(obj, j4, zzb2);
        }
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0018. Please report as an issue. */
    private final int zzr(Object obj, byte[] bArr, int i, int i4, int i5, int i6, int i7, int i8, int i9, long j4, int i10, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        long j5 = this.zzc[i10 + 2] & 1048575;
        switch (i9) {
            case 51:
                if (i7 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j4, Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i))));
                int i11 = i + 8;
                unsafe.putInt(obj, j5, i6);
                return i11;
            case 52:
                if (i7 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j4, Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i))));
                int i12 = i + 4;
                unsafe.putInt(obj, j5, i6);
                return i12;
            case 53:
            case 54:
                if (i7 != 0) {
                    return i;
                }
                int zzm = zzjo.zzm(bArr, i, zzjnVar);
                unsafe.putObject(obj, j4, Long.valueOf(zzjnVar.zzb));
                unsafe.putInt(obj, j5, i6);
                return zzm;
            case 55:
            case 62:
                if (i7 != 0) {
                    return i;
                }
                int zzj = zzjo.zzj(bArr, i, zzjnVar);
                unsafe.putObject(obj, j4, Integer.valueOf(zzjnVar.zza));
                unsafe.putInt(obj, j5, i6);
                return zzj;
            case 56:
            case 65:
                if (i7 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j4, Long.valueOf(zzjo.zzp(bArr, i)));
                int i13 = i + 8;
                unsafe.putInt(obj, j5, i6);
                return i13;
            case 57:
            case 64:
                if (i7 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(zzjo.zzb(bArr, i)));
                int i14 = i + 4;
                unsafe.putInt(obj, j5, i6);
                return i14;
            case 58:
                if (i7 != 0) {
                    return i;
                }
                int zzm2 = zzjo.zzm(bArr, i, zzjnVar);
                unsafe.putObject(obj, j4, Boolean.valueOf(zzjnVar.zzb != 0));
                unsafe.putInt(obj, j5, i6);
                return zzm2;
            case 59:
                if (i7 != 2) {
                    return i;
                }
                int zzj2 = zzjo.zzj(bArr, i, zzjnVar);
                int i15 = zzjnVar.zza;
                if (i15 == 0) {
                    unsafe.putObject(obj, j4, "");
                } else {
                    if ((i8 & 536870912) != 0 && !zznz.zze(bArr, zzj2, zzj2 + i15)) {
                        throw zzll.zzc();
                    }
                    unsafe.putObject(obj, j4, new String(bArr, zzj2, i15, zzlj.zzb));
                    zzj2 += i15;
                }
                unsafe.putInt(obj, j5, i6);
                return zzj2;
            case 60:
                if (i7 != 2) {
                    return i;
                }
                Object zzE = zzE(obj, i6, i10);
                int zzo = zzjo.zzo(zzE, zzB(i10), bArr, i, i4, zzjnVar);
                zzM(obj, i6, i10, zzE);
                return zzo;
            case 61:
                if (i7 != 2) {
                    return i;
                }
                int zza2 = zzjo.zza(bArr, i, zzjnVar);
                unsafe.putObject(obj, j4, zzjnVar.zzc);
                unsafe.putInt(obj, j5, i6);
                return zza2;
            case 63:
                if (i7 != 0) {
                    return i;
                }
                int zzj3 = zzjo.zzj(bArr, i, zzjnVar);
                int i16 = zzjnVar.zza;
                zzlf zzA = zzA(i10);
                if (zzA != null && !zzA.zza(i16)) {
                    zzd(obj).zzj(i5, Long.valueOf(i16));
                    return zzj3;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(i16));
                unsafe.putInt(obj, j5, i6);
                return zzj3;
            case 66:
                if (i7 != 0) {
                    return i;
                }
                int zzj4 = zzjo.zzj(bArr, i, zzjnVar);
                unsafe.putObject(obj, j4, Integer.valueOf(zzke.zzb(zzjnVar.zza)));
                unsafe.putInt(obj, j5, i6);
                return zzj4;
            case 67:
                if (i7 != 0) {
                    return i;
                }
                int zzm3 = zzjo.zzm(bArr, i, zzjnVar);
                unsafe.putObject(obj, j4, Long.valueOf(zzke.zzc(zzjnVar.zzb)));
                unsafe.putInt(obj, j5, i6);
                return zzm3;
            case 68:
                if (i7 == 3) {
                    Object zzE2 = zzE(obj, i6, i10);
                    int zzn = zzjo.zzn(zzE2, zzB(i10), bArr, i, i4, (i5 & (-8)) | 4, zzjnVar);
                    zzM(obj, i6, i10, zzE2);
                    return zzn;
                }
            default:
                return i;
        }
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i4, int i5, int i6, int i7, int i8, long j4, int i9, long j5, zzjn zzjnVar) throws IOException {
        int zzl;
        Unsafe unsafe = zzb;
        zzli zzliVar = (zzli) unsafe.getObject(obj, j5);
        if (!zzliVar.zzc()) {
            int size = zzliVar.size();
            zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j5, zzliVar);
        }
        zzli zzliVar2 = zzliVar;
        switch (i9) {
            case 18:
            case 35:
                if (i7 == 2) {
                    zzkk zzkkVar = (zzkk) zzliVar2;
                    int zzj = zzjo.zzj(bArr, i, zzjnVar);
                    int i10 = zzjnVar.zza + zzj;
                    while (zzj < i10) {
                        zzkkVar.zze(Double.longBitsToDouble(zzjo.zzp(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i10) {
                        return zzj;
                    }
                    throw zzll.zzf();
                }
                if (i7 == 1) {
                    zzkk zzkkVar2 = (zzkk) zzliVar2;
                    zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, i)));
                    int i11 = i + 8;
                    while (i11 < i4) {
                        int zzj2 = zzjo.zzj(bArr, i11, zzjnVar);
                        if (i5 != zzjnVar.zza) {
                            return i11;
                        }
                        zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, zzj2)));
                        i11 = zzj2 + 8;
                    }
                    return i11;
                }
                return i;
            case 19:
            case 36:
                if (i7 == 2) {
                    zzku zzkuVar = (zzku) zzliVar2;
                    int zzj3 = zzjo.zzj(bArr, i, zzjnVar);
                    int i12 = zzjnVar.zza + zzj3;
                    while (zzj3 < i12) {
                        zzkuVar.zze(Float.intBitsToFloat(zzjo.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i12) {
                        return zzj3;
                    }
                    throw zzll.zzf();
                }
                if (i7 == 5) {
                    zzku zzkuVar2 = (zzku) zzliVar2;
                    zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, i)));
                    int i13 = i + 4;
                    while (i13 < i4) {
                        int zzj4 = zzjo.zzj(bArr, i13, zzjnVar);
                        if (i5 != zzjnVar.zza) {
                            return i13;
                        }
                        zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, zzj4)));
                        i13 = zzj4 + 4;
                    }
                    return i13;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i7 == 2) {
                    zzlx zzlxVar = (zzlx) zzliVar2;
                    int zzj5 = zzjo.zzj(bArr, i, zzjnVar);
                    int i14 = zzjnVar.zza + zzj5;
                    while (zzj5 < i14) {
                        zzj5 = zzjo.zzm(bArr, zzj5, zzjnVar);
                        zzlxVar.zzg(zzjnVar.zzb);
                    }
                    if (zzj5 == i14) {
                        return zzj5;
                    }
                    throw zzll.zzf();
                }
                if (i7 == 0) {
                    zzlx zzlxVar2 = (zzlx) zzliVar2;
                    int zzm = zzjo.zzm(bArr, i, zzjnVar);
                    zzlxVar2.zzg(zzjnVar.zzb);
                    while (zzm < i4) {
                        int zzj6 = zzjo.zzj(bArr, zzm, zzjnVar);
                        if (i5 != zzjnVar.zza) {
                            return zzm;
                        }
                        zzm = zzjo.zzm(bArr, zzj6, zzjnVar);
                        zzlxVar2.zzg(zzjnVar.zzb);
                    }
                    return zzm;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i7 == 2) {
                    return zzjo.zzf(bArr, i, zzliVar2, zzjnVar);
                }
                if (i7 == 0) {
                    return zzjo.zzl(i5, bArr, i, i4, zzliVar2, zzjnVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i7 == 2) {
                    zzlx zzlxVar3 = (zzlx) zzliVar2;
                    int zzj7 = zzjo.zzj(bArr, i, zzjnVar);
                    int i15 = zzjnVar.zza + zzj7;
                    while (zzj7 < i15) {
                        zzlxVar3.zzg(zzjo.zzp(bArr, zzj7));
                        zzj7 += 8;
                    }
                    if (zzj7 == i15) {
                        return zzj7;
                    }
                    throw zzll.zzf();
                }
                if (i7 == 1) {
                    zzlx zzlxVar4 = (zzlx) zzliVar2;
                    zzlxVar4.zzg(zzjo.zzp(bArr, i));
                    int i16 = i + 8;
                    while (i16 < i4) {
                        int zzj8 = zzjo.zzj(bArr, i16, zzjnVar);
                        if (i5 != zzjnVar.zza) {
                            return i16;
                        }
                        zzlxVar4.zzg(zzjo.zzp(bArr, zzj8));
                        i16 = zzj8 + 8;
                    }
                    return i16;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i7 == 2) {
                    zzlc zzlcVar = (zzlc) zzliVar2;
                    int zzj9 = zzjo.zzj(bArr, i, zzjnVar);
                    int i17 = zzjnVar.zza + zzj9;
                    while (zzj9 < i17) {
                        zzlcVar.zzh(zzjo.zzb(bArr, zzj9));
                        zzj9 += 4;
                    }
                    if (zzj9 == i17) {
                        return zzj9;
                    }
                    throw zzll.zzf();
                }
                if (i7 == 5) {
                    zzlc zzlcVar2 = (zzlc) zzliVar2;
                    zzlcVar2.zzh(zzjo.zzb(bArr, i));
                    int i18 = i + 4;
                    while (i18 < i4) {
                        int zzj10 = zzjo.zzj(bArr, i18, zzjnVar);
                        if (i5 != zzjnVar.zza) {
                            return i18;
                        }
                        zzlcVar2.zzh(zzjo.zzb(bArr, zzj10));
                        i18 = zzj10 + 4;
                    }
                    return i18;
                }
                return i;
            case 25:
            case 42:
                if (i7 == 2) {
                    zzjp zzjpVar = (zzjp) zzliVar2;
                    int zzj11 = zzjo.zzj(bArr, i, zzjnVar);
                    int i19 = zzjnVar.zza + zzj11;
                    while (zzj11 < i19) {
                        zzj11 = zzjo.zzm(bArr, zzj11, zzjnVar);
                        zzjpVar.zze(zzjnVar.zzb != 0);
                    }
                    if (zzj11 == i19) {
                        return zzj11;
                    }
                    throw zzll.zzf();
                }
                if (i7 == 0) {
                    zzjp zzjpVar2 = (zzjp) zzliVar2;
                    int zzm2 = zzjo.zzm(bArr, i, zzjnVar);
                    zzjpVar2.zze(zzjnVar.zzb != 0);
                    while (zzm2 < i4) {
                        int zzj12 = zzjo.zzj(bArr, zzm2, zzjnVar);
                        if (i5 != zzjnVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzjo.zzm(bArr, zzj12, zzjnVar);
                        zzjpVar2.zze(zzjnVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i;
            case 26:
                if (i7 == 2) {
                    if ((j4 & 536870912) == 0) {
                        int zzj13 = zzjo.zzj(bArr, i, zzjnVar);
                        int i20 = zzjnVar.zza;
                        if (i20 < 0) {
                            throw zzll.zzd();
                        }
                        if (i20 == 0) {
                            zzliVar2.add("");
                        } else {
                            zzliVar2.add(new String(bArr, zzj13, i20, zzlj.zzb));
                            zzj13 += i20;
                        }
                        while (zzj13 < i4) {
                            int zzj14 = zzjo.zzj(bArr, zzj13, zzjnVar);
                            if (i5 != zzjnVar.zza) {
                                return zzj13;
                            }
                            zzj13 = zzjo.zzj(bArr, zzj14, zzjnVar);
                            int i21 = zzjnVar.zza;
                            if (i21 < 0) {
                                throw zzll.zzd();
                            }
                            if (i21 == 0) {
                                zzliVar2.add("");
                            } else {
                                zzliVar2.add(new String(bArr, zzj13, i21, zzlj.zzb));
                                zzj13 += i21;
                            }
                        }
                        return zzj13;
                    }
                    int zzj15 = zzjo.zzj(bArr, i, zzjnVar);
                    int i22 = zzjnVar.zza;
                    if (i22 < 0) {
                        throw zzll.zzd();
                    }
                    if (i22 == 0) {
                        zzliVar2.add("");
                    } else {
                        int i23 = zzj15 + i22;
                        if (!zznz.zze(bArr, zzj15, i23)) {
                            throw zzll.zzc();
                        }
                        zzliVar2.add(new String(bArr, zzj15, i22, zzlj.zzb));
                        zzj15 = i23;
                    }
                    while (zzj15 < i4) {
                        int zzj16 = zzjo.zzj(bArr, zzj15, zzjnVar);
                        if (i5 != zzjnVar.zza) {
                            return zzj15;
                        }
                        zzj15 = zzjo.zzj(bArr, zzj16, zzjnVar);
                        int i24 = zzjnVar.zza;
                        if (i24 < 0) {
                            throw zzll.zzd();
                        }
                        if (i24 == 0) {
                            zzliVar2.add("");
                        } else {
                            int i25 = zzj15 + i24;
                            if (!zznz.zze(bArr, zzj15, i25)) {
                                throw zzll.zzc();
                            }
                            zzliVar2.add(new String(bArr, zzj15, i24, zzlj.zzb));
                            zzj15 = i25;
                        }
                    }
                    return zzj15;
                }
                return i;
            case 27:
                if (i7 == 2) {
                    return zzjo.zze(zzB(i8), i5, bArr, i, i4, zzliVar2, zzjnVar);
                }
                return i;
            case 28:
                if (i7 == 2) {
                    int zzj17 = zzjo.zzj(bArr, i, zzjnVar);
                    int i26 = zzjnVar.zza;
                    if (i26 < 0) {
                        throw zzll.zzd();
                    }
                    if (i26 > bArr.length - zzj17) {
                        throw zzll.zzf();
                    }
                    if (i26 == 0) {
                        zzliVar2.add(zzka.zzb);
                    } else {
                        zzliVar2.add(zzka.zzl(bArr, zzj17, i26));
                        zzj17 += i26;
                    }
                    while (zzj17 < i4) {
                        int zzj18 = zzjo.zzj(bArr, zzj17, zzjnVar);
                        if (i5 != zzjnVar.zza) {
                            return zzj17;
                        }
                        zzj17 = zzjo.zzj(bArr, zzj18, zzjnVar);
                        int i27 = zzjnVar.zza;
                        if (i27 < 0) {
                            throw zzll.zzd();
                        }
                        if (i27 > bArr.length - zzj17) {
                            throw zzll.zzf();
                        }
                        if (i27 == 0) {
                            zzliVar2.add(zzka.zzb);
                        } else {
                            zzliVar2.add(zzka.zzl(bArr, zzj17, i27));
                            zzj17 += i27;
                        }
                    }
                    return zzj17;
                }
                return i;
            case 30:
            case 44:
                if (i7 != 2) {
                    if (i7 == 0) {
                        zzl = zzjo.zzl(i5, bArr, i, i4, zzliVar2, zzjnVar);
                    }
                    return i;
                }
                zzl = zzjo.zzf(bArr, i, zzliVar2, zzjnVar);
                zzlf zzA = zzA(i8);
                zznk zznkVar = this.zzn;
                int i28 = zzmv.zza;
                if (zzA != null) {
                    Object obj2 = null;
                    if (zzliVar2 != null) {
                        int size2 = zzliVar2.size();
                        int i29 = 0;
                        for (int i30 = 0; i30 < size2; i30++) {
                            Integer num = (Integer) zzliVar2.get(i30);
                            int intValue = num.intValue();
                            if (zzA.zza(intValue)) {
                                if (i30 != i29) {
                                    zzliVar2.set(i29, num);
                                }
                                i29++;
                            } else {
                                obj2 = zzmv.zzA(obj, i6, intValue, obj2, zznkVar);
                            }
                        }
                        if (i29 != size2) {
                            zzliVar2.subList(i29, size2).clear();
                            return zzl;
                        }
                    } else {
                        Iterator it = zzliVar2.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!zzA.zza(intValue2)) {
                                obj2 = zzmv.zzA(obj, i6, intValue2, obj2, zznkVar);
                                it.remove();
                            }
                        }
                    }
                }
                return zzl;
            case 33:
            case 47:
                if (i7 == 2) {
                    zzlc zzlcVar3 = (zzlc) zzliVar2;
                    int zzj19 = zzjo.zzj(bArr, i, zzjnVar);
                    int i31 = zzjnVar.zza + zzj19;
                    while (zzj19 < i31) {
                        zzj19 = zzjo.zzj(bArr, zzj19, zzjnVar);
                        zzlcVar3.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    if (zzj19 == i31) {
                        return zzj19;
                    }
                    throw zzll.zzf();
                }
                if (i7 == 0) {
                    zzlc zzlcVar4 = (zzlc) zzliVar2;
                    int zzj20 = zzjo.zzj(bArr, i, zzjnVar);
                    zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    while (zzj20 < i4) {
                        int zzj21 = zzjo.zzj(bArr, zzj20, zzjnVar);
                        if (i5 != zzjnVar.zza) {
                            return zzj20;
                        }
                        zzj20 = zzjo.zzj(bArr, zzj21, zzjnVar);
                        zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    return zzj20;
                }
                return i;
            case 34:
            case 48:
                if (i7 == 2) {
                    zzlx zzlxVar5 = (zzlx) zzliVar2;
                    int zzj22 = zzjo.zzj(bArr, i, zzjnVar);
                    int i32 = zzjnVar.zza + zzj22;
                    while (zzj22 < i32) {
                        zzj22 = zzjo.zzm(bArr, zzj22, zzjnVar);
                        zzlxVar5.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    if (zzj22 == i32) {
                        return zzj22;
                    }
                    throw zzll.zzf();
                }
                if (i7 == 0) {
                    zzlx zzlxVar6 = (zzlx) zzliVar2;
                    int zzm3 = zzjo.zzm(bArr, i, zzjnVar);
                    zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    while (zzm3 < i4) {
                        int zzj23 = zzjo.zzj(bArr, zzm3, zzjnVar);
                        if (i5 != zzjnVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzjo.zzm(bArr, zzj23, zzjnVar);
                        zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    return zzm3;
                }
                return i;
            default:
                if (i7 == 3) {
                    zzmt zzB = zzB(i8);
                    int i33 = (i5 & (-8)) | 4;
                    int zzc = zzjo.zzc(zzB, bArr, i, i4, i33, zzjnVar);
                    int i34 = i4;
                    int i35 = i33;
                    zzjn zzjnVar2 = zzjnVar;
                    zzliVar2.add(zzjnVar2.zzc);
                    while (zzc < i34) {
                        int zzj24 = zzjo.zzj(bArr, zzc, zzjnVar2);
                        if (i5 != zzjnVar2.zza) {
                            return zzc;
                        }
                        int i36 = i35;
                        int i37 = i34;
                        zzjn zzjnVar3 = zzjnVar2;
                        zzc = zzjo.zzc(zzB, bArr, zzj24, i37, i36, zzjnVar3);
                        zzliVar2.add(zzjnVar3.zzc);
                        i35 = i36;
                        i34 = i37;
                        zzjnVar2 = zzjnVar3;
                    }
                    return zzc;
                }
                return i;
        }
    }

    private final int zzt(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, 0);
    }

    private final int zzu(int i, int i4) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, i4);
    }

    private final int zzv(int i) {
        return this.zzc[i + 2];
    }

    private final int zzw(int i, int i4) {
        int length = (this.zzc.length / 3) - 1;
        while (i4 <= length) {
            int i5 = (length + i4) >>> 1;
            int i6 = i5 * 3;
            int i7 = this.zzc[i6];
            if (i == i7) {
                return i6;
            }
            if (i < i7) {
                length = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return -1;
    }

    private static int zzx(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    private final int zzy(int i) {
        return this.zzc[i + 1];
    }

    private static long zzz(Object obj, long j4) {
        return ((Long) zznu.zzf(obj, j4)).longValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003b. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zza(Object obj) {
        int zzn;
        int zzx;
        int zzy;
        int zzt;
        if (!this.zzi) {
            return zzo(obj);
        }
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzy2 = zzy(i4);
            int zzx2 = zzx(zzy2);
            int i5 = this.zzc[i4];
            int i6 = zzy2 & 1048575;
            if (zzx2 >= zzkt.zzJ.zza() && zzx2 <= zzkt.zzW.zza()) {
                int i7 = this.zzc[i4 + 2];
            }
            long j4 = i6;
            switch (zzx2) {
                case 0:
                    if (zzP(obj, i4)) {
                        i = w.B(i5 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj, i4)) {
                        i = w.B(i5 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj, i4)) {
                        i = w.B(i5 << 3, zzki.zzy(zznu.zzd(obj, j4)), i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj, i4)) {
                        i = w.B(i5 << 3, zzki.zzy(zznu.zzd(obj, j4)), i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj, i4)) {
                        i = w.B(i5 << 3, zzki.zzu(zznu.zzc(obj, j4)), i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj, i4)) {
                        i = w.B(i5 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj, i4)) {
                        i = w.B(i5 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj, i4)) {
                        i = w.B(i5 << 3, 1, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj, i4)) {
                        Object zzf = zznu.zzf(obj, j4);
                        if (zzf instanceof zzka) {
                            int i8 = i5 << 3;
                            int i9 = zzki.zzb;
                            int zzd = ((zzka) zzf).zzd();
                            i = w.B(i8, zzki.zzx(zzd) + zzd, i);
                            break;
                        } else {
                            i = w.B(i5 << 3, zzki.zzw((String) zzf), i);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzP(obj, i4)) {
                        zzn = zzmv.zzn(i5, zznu.zzf(obj, j4), zzB(i4));
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzP(obj, i4)) {
                        zzka zzkaVar = (zzka) zznu.zzf(obj, j4);
                        int i10 = i5 << 3;
                        int i11 = zzki.zzb;
                        int zzd2 = zzkaVar.zzd();
                        i = w.B(i10, zzki.zzx(zzd2) + zzd2, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj, i4)) {
                        i = w.B(i5 << 3, zzki.zzx(zznu.zzc(obj, j4)), i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj, i4)) {
                        i = w.B(i5 << 3, zzki.zzu(zznu.zzc(obj, j4)), i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj, i4)) {
                        i = w.B(i5 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj, i4)) {
                        i = w.B(i5 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj, i4)) {
                        int zzc = zznu.zzc(obj, j4);
                        i = w.B((zzc >> 31) ^ (zzc + zzc), zzki.zzx(i5 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj, i4)) {
                        long zzd3 = zznu.zzd(obj, j4);
                        zzx = zzki.zzx(i5 << 3);
                        zzy = zzki.zzy((zzd3 >> 63) ^ (zzd3 + zzd3));
                        zzt = zzy + zzx;
                        i += zzt;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzP(obj, i4)) {
                        zzt = zzki.zzt(i5, (zzmi) zznu.zzf(obj, j4), zzB(i4));
                        i += zzt;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzn = zzmv.zzg(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 19:
                    zzn = zzmv.zze(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 20:
                    zzn = zzmv.zzl(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 21:
                    zzn = zzmv.zzw(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 22:
                    zzn = zzmv.zzj(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 23:
                    zzn = zzmv.zzg(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 24:
                    zzn = zzmv.zze(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 25:
                    zzn = zzmv.zza(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 26:
                    zzn = zzmv.zzt(i5, (List) zznu.zzf(obj, j4));
                    i += zzn;
                    break;
                case 27:
                    zzn = zzmv.zzo(i5, (List) zznu.zzf(obj, j4), zzB(i4));
                    i += zzn;
                    break;
                case 28:
                    zzn = zzmv.zzb(i5, (List) zznu.zzf(obj, j4));
                    i += zzn;
                    break;
                case 29:
                    zzn = zzmv.zzu(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 30:
                    zzn = zzmv.zzc(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 31:
                    zzn = zzmv.zze(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 32:
                    zzn = zzmv.zzg(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 33:
                    zzn = zzmv.zzp(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 34:
                    zzn = zzmv.zzr(i5, (List) zznu.zzf(obj, j4), false);
                    i += zzn;
                    break;
                case 35:
                    int zzh = zzmv.zzh((List) unsafe.getObject(obj, j4));
                    if (zzh > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzh), zzh, i);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzf2 = zzmv.zzf((List) unsafe.getObject(obj, j4));
                    if (zzf2 > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzf2), zzf2, i);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzm = zzmv.zzm((List) unsafe.getObject(obj, j4));
                    if (zzm > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzm), zzm, i);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzx3 = zzmv.zzx((List) unsafe.getObject(obj, j4));
                    if (zzx3 > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzx3), zzx3, i);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzk = zzmv.zzk((List) unsafe.getObject(obj, j4));
                    if (zzk > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzk), zzk, i);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzh2 = zzmv.zzh((List) unsafe.getObject(obj, j4));
                    if (zzh2 > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzh2), zzh2, i);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzf3 = zzmv.zzf((List) unsafe.getObject(obj, j4));
                    if (zzf3 > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzf3), zzf3, i);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j4);
                    int i12 = zzmv.zza;
                    int size = list.size();
                    if (size > 0) {
                        i = w.y(i5 << 3, zzki.zzx(size), size, i);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzv = zzmv.zzv((List) unsafe.getObject(obj, j4));
                    if (zzv > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzv), zzv, i);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zzd4 = zzmv.zzd((List) unsafe.getObject(obj, j4));
                    if (zzd4 > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzd4), zzd4, i);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzf4 = zzmv.zzf((List) unsafe.getObject(obj, j4));
                    if (zzf4 > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzf4), zzf4, i);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzh3 = zzmv.zzh((List) unsafe.getObject(obj, j4));
                    if (zzh3 > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzh3), zzh3, i);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzq = zzmv.zzq((List) unsafe.getObject(obj, j4));
                    if (zzq > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzq), zzq, i);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzs = zzmv.zzs((List) unsafe.getObject(obj, j4));
                    if (zzs > 0) {
                        i = w.y(i5 << 3, zzki.zzx(zzs), zzs, i);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzn = zzmv.zzi(i5, (List) zznu.zzf(obj, j4), zzB(i4));
                    i += zzn;
                    break;
                case 50:
                    zzmd.zza(i5, zznu.zzf(obj, j4), zzC(i4));
                    break;
                case 51:
                    if (zzT(obj, i5, i4)) {
                        i = w.B(i5 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i5, i4)) {
                        i = w.B(i5 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i5, i4)) {
                        i = w.B(i5 << 3, zzki.zzy(zzz(obj, j4)), i);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i5, i4)) {
                        i = w.B(i5 << 3, zzki.zzy(zzz(obj, j4)), i);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i5, i4)) {
                        i = w.B(i5 << 3, zzki.zzu(zzp(obj, j4)), i);
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i5, i4)) {
                        i = w.B(i5 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i5, i4)) {
                        i = w.B(i5 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i5, i4)) {
                        i = w.B(i5 << 3, 1, i);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i5, i4)) {
                        Object zzf5 = zznu.zzf(obj, j4);
                        if (zzf5 instanceof zzka) {
                            int i13 = i5 << 3;
                            int i14 = zzki.zzb;
                            int zzd5 = ((zzka) zzf5).zzd();
                            i = w.B(i13, zzki.zzx(zzd5) + zzd5, i);
                            break;
                        } else {
                            i = w.B(i5 << 3, zzki.zzw((String) zzf5), i);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i5, i4)) {
                        zzn = zzmv.zzn(i5, zznu.zzf(obj, j4), zzB(i4));
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i5, i4)) {
                        zzka zzkaVar2 = (zzka) zznu.zzf(obj, j4);
                        int i15 = i5 << 3;
                        int i16 = zzki.zzb;
                        int zzd6 = zzkaVar2.zzd();
                        i = w.B(i15, zzki.zzx(zzd6) + zzd6, i);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i5, i4)) {
                        i = w.B(i5 << 3, zzki.zzx(zzp(obj, j4)), i);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i5, i4)) {
                        i = w.B(i5 << 3, zzki.zzu(zzp(obj, j4)), i);
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i5, i4)) {
                        i = w.B(i5 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i5, i4)) {
                        i = w.B(i5 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i5, i4)) {
                        int zzp = zzp(obj, j4);
                        i = w.B((zzp >> 31) ^ (zzp + zzp), zzki.zzx(i5 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i5, i4)) {
                        long zzz = zzz(obj, j4);
                        zzx = zzki.zzx(i5 << 3);
                        zzy = zzki.zzy((zzz >> 63) ^ (zzz + zzz));
                        zzt = zzy + zzx;
                        i += zzt;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i5, i4)) {
                        zzt = zzki.zzt(i5, (zzmi) zznu.zzf(obj, j4), zzB(i4));
                        i += zzt;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zznk zznkVar = this.zzn;
        return i + zznkVar.zza(zznkVar.zzd(obj));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i4;
        int floatToIntBits;
        int zzc;
        int length = this.zzc.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int zzy = zzy(i6);
            int i7 = this.zzc[i6];
            long j4 = 1048575 & zzy;
            int i8 = 37;
            switch (zzx(zzy)) {
                case 0:
                    i = i5 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zznu.zza(obj, j4));
                    byte[] bArr = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzc;
                    break;
                case 1:
                    i4 = i5 * 53;
                    floatToIntBits = Float.floatToIntBits(zznu.zzb(obj, j4));
                    i5 = floatToIntBits + i4;
                    break;
                case 2:
                    i = i5 * 53;
                    doubleToLongBits = zznu.zzd(obj, j4);
                    byte[] bArr2 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzc;
                    break;
                case 3:
                    i = i5 * 53;
                    doubleToLongBits = zznu.zzd(obj, j4);
                    byte[] bArr3 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzc;
                    break;
                case 4:
                    i = i5 * 53;
                    zzc = zznu.zzc(obj, j4);
                    i5 = i + zzc;
                    break;
                case 5:
                    i = i5 * 53;
                    doubleToLongBits = zznu.zzd(obj, j4);
                    byte[] bArr4 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzc;
                    break;
                case 6:
                    i = i5 * 53;
                    zzc = zznu.zzc(obj, j4);
                    i5 = i + zzc;
                    break;
                case 7:
                    i4 = i5 * 53;
                    floatToIntBits = zzlj.zza(zznu.zzw(obj, j4));
                    i5 = floatToIntBits + i4;
                    break;
                case 8:
                    i4 = i5 * 53;
                    floatToIntBits = ((String) zznu.zzf(obj, j4)).hashCode();
                    i5 = floatToIntBits + i4;
                    break;
                case 9:
                    Object zzf = zznu.zzf(obj, j4);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i5 = (i5 * 53) + i8;
                    break;
                case 10:
                    i4 = i5 * 53;
                    floatToIntBits = zznu.zzf(obj, j4).hashCode();
                    i5 = floatToIntBits + i4;
                    break;
                case 11:
                    i = i5 * 53;
                    zzc = zznu.zzc(obj, j4);
                    i5 = i + zzc;
                    break;
                case 12:
                    i = i5 * 53;
                    zzc = zznu.zzc(obj, j4);
                    i5 = i + zzc;
                    break;
                case 13:
                    i = i5 * 53;
                    zzc = zznu.zzc(obj, j4);
                    i5 = i + zzc;
                    break;
                case 14:
                    i = i5 * 53;
                    doubleToLongBits = zznu.zzd(obj, j4);
                    byte[] bArr5 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzc;
                    break;
                case 15:
                    i = i5 * 53;
                    zzc = zznu.zzc(obj, j4);
                    i5 = i + zzc;
                    break;
                case 16:
                    i = i5 * 53;
                    doubleToLongBits = zznu.zzd(obj, j4);
                    byte[] bArr6 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zznu.zzf(obj, j4);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i5 = (i5 * 53) + i8;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i4 = i5 * 53;
                    floatToIntBits = zznu.zzf(obj, j4).hashCode();
                    i5 = floatToIntBits + i4;
                    break;
                case 50:
                    i4 = i5 * 53;
                    floatToIntBits = zznu.zzf(obj, j4).hashCode();
                    i5 = floatToIntBits + i4;
                    break;
                case 51:
                    if (zzT(obj, i7, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j4));
                        byte[] bArr7 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j4));
                        i5 = floatToIntBits + i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i7, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = zzz(obj, j4);
                        byte[] bArr8 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i7, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = zzz(obj, j4);
                        byte[] bArr9 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i7, i6)) {
                        i = i5 * 53;
                        zzc = zzp(obj, j4);
                        i5 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i7, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = zzz(obj, j4);
                        byte[] bArr10 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i7, i6)) {
                        i = i5 * 53;
                        zzc = zzp(obj, j4);
                        i5 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        floatToIntBits = zzlj.zza(zzU(obj, j4));
                        i5 = floatToIntBits + i4;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        floatToIntBits = ((String) zznu.zzf(obj, j4)).hashCode();
                        i5 = floatToIntBits + i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        floatToIntBits = zznu.zzf(obj, j4).hashCode();
                        i5 = floatToIntBits + i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        floatToIntBits = zznu.zzf(obj, j4).hashCode();
                        i5 = floatToIntBits + i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i7, i6)) {
                        i = i5 * 53;
                        zzc = zzp(obj, j4);
                        i5 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i7, i6)) {
                        i = i5 * 53;
                        zzc = zzp(obj, j4);
                        i5 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i7, i6)) {
                        i = i5 * 53;
                        zzc = zzp(obj, j4);
                        i5 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i7, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = zzz(obj, j4);
                        byte[] bArr11 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i7, i6)) {
                        i = i5 * 53;
                        zzc = zzp(obj, j4);
                        i5 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i7, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = zzz(obj, j4);
                        byte[] bArr12 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        floatToIntBits = zznu.zzf(obj, j4).hashCode();
                        i5 = floatToIntBits + i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzd(obj).hashCode() + (i5 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0421, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0478, code lost:
    
        if (r0 == 1048575) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x047a, code lost:
    
        r24.putInt(r9, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0480, code lost:
    
        r0 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0484, code lost:
    
        if (r0 >= r8.zzl) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0486, code lost:
    
        r1 = r8.zzj[r0];
        r2 = r8.zzc[r1];
        r2 = com.google.android.gms.internal.measurement.zznu.zzf(r9, r8.zzy(r1) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0498, code lost:
    
        if (r2 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x049f, code lost:
    
        if (r8.zzA(r1) != null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x04a4, code lost:
    
        r2 = (com.google.android.gms.internal.measurement.zzmc) r2;
        r0 = (com.google.android.gms.internal.measurement.zzmb) r8.zzC(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04a1, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04ad, code lost:
    
        if (r33 != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04af, code lost:
    
        if (r3 != r4) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04b6, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x04bb, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x04b7, code lost:
    
        if (r3 > r4) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04b9, code lost:
    
        if (r13 != r33) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x04c0, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:113:0x0094. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzjn r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzjn):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzf(Object obj) {
        if (zzS(obj)) {
            if (obj instanceof zzlb) {
                zzlb zzlbVar = (zzlb) obj;
                zzlbVar.zzbP(Integer.MAX_VALUE);
                zzlbVar.zzb = 0;
                zzlbVar.zzbN();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzy = zzy(i);
                int i4 = 1048575 & zzy;
                int zzx = zzx(zzy);
                long j4 = i4;
                if (zzx != 9) {
                    if (zzx != 60 && zzx != 68) {
                        switch (zzx) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzm.zza(obj, j4);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    ((zzmc) object).zzc();
                                    unsafe.putObject(obj, j4, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzT(obj, this.zzc[i], i)) {
                        zzB(i).zzf(zzb.getObject(obj, j4));
                    }
                }
                if (zzP(obj, i)) {
                    zzB(i).zzf(zzb.getObject(obj, j4));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzy = zzy(i);
            int i4 = this.zzc[i];
            long j4 = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i)) {
                        zznu.zzo(obj, j4, zznu.zza(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i)) {
                        zznu.zzp(obj, j4, zznu.zzb(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j4, zznu.zzd(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j4, zznu.zzd(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j4, zznu.zzc(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j4, zznu.zzd(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j4, zznu.zzc(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i)) {
                        zznu.zzm(obj, j4, zznu.zzw(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i)) {
                        zznu.zzs(obj, j4, zznu.zzf(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzP(obj2, i)) {
                        zznu.zzs(obj, j4, zznu.zzf(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j4, zznu.zzc(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j4, zznu.zzc(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j4, zznu.zzc(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j4, zznu.zzd(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j4, zznu.zzc(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j4, zznu.zzd(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzb(obj, obj2, j4);
                    break;
                case 50:
                    int i5 = zzmv.zza;
                    zznu.zzs(obj, j4, zzmd.zzb(zznu.zzf(obj, j4), zznu.zzf(obj2, j4)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzT(obj2, i4, i)) {
                        zznu.zzs(obj, j4, zznu.zzf(obj2, j4));
                        zzK(obj, i4, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i4, i)) {
                        zznu.zzs(obj, j4, zznu.zzf(obj2, j4));
                        zzK(obj, i4, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzmv.zzB(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:79:0x0089. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzh(Object obj, byte[] bArr, int i, int i4, zzjn zzjnVar) throws IOException {
        Object obj2;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj3;
        Unsafe unsafe2;
        int i10;
        Unsafe unsafe3;
        int i11;
        Object obj4;
        int i12;
        Unsafe unsafe4;
        int i13;
        int i14;
        int i15;
        int i16;
        zzml<T> zzmlVar = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i17 = i4;
        zzjn zzjnVar2 = zzjnVar;
        if (!zzmlVar.zzi) {
            zzc(obj5, bArr, i, i17, 0, zzjnVar);
            return;
        }
        zzG(obj5);
        Unsafe unsafe5 = zzb;
        int i18 = -1;
        int i19 = i;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 1048575;
        while (i19 < i17) {
            int i24 = i19 + 1;
            int i25 = bArr2[i19];
            if (i25 < 0) {
                i24 = zzjo.zzk(i25, bArr2, i24, zzjnVar2);
                i25 = zzjnVar2.zza;
            }
            int i26 = i25 >>> 3;
            int zzu = i26 > i20 ? zzmlVar.zzu(i26, i21 / 3) : zzmlVar.zzt(i26);
            if (zzu == i18) {
                obj2 = obj5;
                unsafe = unsafe5;
                i5 = i25;
                i6 = i24;
                i7 = i26;
                i8 = 0;
            } else {
                int i27 = i25 & 7;
                int[] iArr = zzmlVar.zzc;
                int i28 = iArr[zzu + 1];
                int zzx = zzx(i28);
                int i29 = i25;
                int i30 = zzu;
                long j4 = i28 & 1048575;
                if (zzx <= 17) {
                    int i31 = iArr[i30 + 2];
                    int i32 = 1 << (i31 >>> 20);
                    int i33 = i31 & 1048575;
                    int i34 = i24;
                    if (i33 != i23) {
                        if (i23 != 1048575) {
                            unsafe5.putInt(obj5, i23, i22);
                        }
                        if (i33 != 1048575) {
                            i22 = unsafe5.getInt(obj5, i33);
                        }
                        i23 = i33;
                    }
                    switch (zzx) {
                        case 0:
                            i7 = i26;
                            i9 = i34;
                            obj3 = obj5;
                            unsafe2 = unsafe5;
                            i10 = i30;
                            if (i27 != 1) {
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                zznu.zzo(obj3, j4, Double.longBitsToDouble(zzjo.zzp(bArr2, i9)));
                                i19 = i9 + 8;
                                i22 |= i32;
                                i17 = i4;
                                zzjnVar2 = zzjnVar;
                                unsafe5 = unsafe2;
                                i21 = i10;
                                obj5 = obj3;
                                i20 = i7;
                                i18 = -1;
                                break;
                            }
                        case 1:
                            i7 = i26;
                            i9 = i34;
                            obj3 = obj5;
                            unsafe2 = unsafe5;
                            i10 = i30;
                            if (i27 != 5) {
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                zznu.zzp(obj3, j4, Float.intBitsToFloat(zzjo.zzb(bArr2, i9)));
                                i19 = i9 + 4;
                                i22 |= i32;
                                i17 = i4;
                                zzjnVar2 = zzjnVar;
                                unsafe5 = unsafe2;
                                i21 = i10;
                                obj5 = obj3;
                                i20 = i7;
                                i18 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            Unsafe unsafe6 = unsafe5;
                            i9 = i34;
                            i10 = i30;
                            if (i27 != 0) {
                                obj3 = obj5;
                                unsafe2 = unsafe6;
                                i7 = i26;
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                int zzm = zzjo.zzm(bArr2, i9, zzjnVar2);
                                Object obj6 = obj5;
                                unsafe6.putLong(obj6, j4, zzjnVar2.zzb);
                                i22 |= i32;
                                i17 = i4;
                                unsafe5 = unsafe6;
                                i21 = i10;
                                i20 = i26;
                                i19 = zzm;
                                obj5 = obj6;
                                i18 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            unsafe3 = unsafe5;
                            i9 = i34;
                            i10 = i30;
                            if (i27 != 0) {
                                Unsafe unsafe7 = unsafe3;
                                obj3 = obj5;
                                unsafe2 = unsafe7;
                                i7 = i26;
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                int zzj = zzjo.zzj(bArr2, i9, zzjnVar2);
                                unsafe3.putInt(obj5, j4, zzjnVar2.zza);
                                i22 |= i32;
                                i17 = i4;
                                i19 = zzj;
                                i21 = i10;
                                i20 = i26;
                                unsafe5 = unsafe3;
                                i18 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i10 = i30;
                            Object obj7 = obj5;
                            unsafe3 = unsafe5;
                            if (i27 != 1) {
                                obj5 = obj7;
                                i9 = i34;
                                Unsafe unsafe72 = unsafe3;
                                obj3 = obj5;
                                unsafe2 = unsafe72;
                                i7 = i26;
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                unsafe3.putLong(obj7, j4, zzjo.zzp(bArr2, i34));
                                obj5 = obj7;
                                i19 = i34 + 8;
                                i22 |= i32;
                                i17 = i4;
                                i21 = i10;
                                i20 = i26;
                                unsafe5 = unsafe3;
                                i18 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i11 = i34;
                            i10 = i30;
                            obj4 = obj5;
                            unsafe3 = unsafe5;
                            if (i27 != 5) {
                                i7 = i26;
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i9 = i11;
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                unsafe3.putInt(obj4, j4, zzjo.zzb(bArr2, i11));
                                i19 = i11 + 4;
                                i22 |= i32;
                                i17 = i4;
                                i21 = i10;
                                i20 = i26;
                                obj5 = obj4;
                                unsafe5 = unsafe3;
                                i18 = -1;
                                break;
                            }
                        case 7:
                            i11 = i34;
                            i10 = i30;
                            obj4 = obj5;
                            unsafe3 = unsafe5;
                            if (i27 != 0) {
                                i7 = i26;
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i9 = i11;
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                i19 = zzjo.zzm(bArr2, i11, zzjnVar2);
                                zznu.zzm(obj4, j4, zzjnVar2.zzb != 0);
                                i22 |= i32;
                                i17 = i4;
                                i21 = i10;
                                i20 = i26;
                                obj5 = obj4;
                                unsafe5 = unsafe3;
                                i18 = -1;
                                break;
                            }
                        case 8:
                            i11 = i34;
                            i10 = i30;
                            obj4 = obj5;
                            unsafe3 = unsafe5;
                            if (i27 != 2) {
                                i7 = i26;
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i9 = i11;
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                i19 = (i28 & 536870912) == 0 ? zzjo.zzg(bArr2, i11, zzjnVar2) : zzjo.zzh(bArr2, i11, zzjnVar2);
                                unsafe3.putObject(obj4, j4, zzjnVar2.zzc);
                                i22 |= i32;
                                i17 = i4;
                                i21 = i10;
                                i20 = i26;
                                obj5 = obj4;
                                unsafe5 = unsafe3;
                                i18 = -1;
                                break;
                            }
                        case 9:
                            obj4 = obj5;
                            unsafe3 = unsafe5;
                            i12 = i34;
                            i10 = i30;
                            if (i27 != 2) {
                                i7 = i26;
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i9 = i12;
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                Object zzD = zzmlVar.zzD(obj4, i10);
                                int zzo = zzjo.zzo(zzD, zzmlVar.zzB(i10), bArr2, i12, i4, zzjnVar2);
                                zzmlVar.zzL(obj4, i10, zzD);
                                i22 |= i32;
                                i17 = i4;
                                i19 = zzo;
                                i21 = i10;
                                i20 = i26;
                                obj5 = obj4;
                                unsafe5 = unsafe3;
                                i18 = -1;
                                break;
                            }
                        case 10:
                            i12 = i34;
                            obj4 = obj5;
                            unsafe4 = unsafe5;
                            if (i27 != 2) {
                                i7 = i26;
                                unsafe2 = unsafe4;
                                i10 = i30;
                                obj3 = obj4;
                                i9 = i12;
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                i19 = zzjo.zza(bArr2, i12, zzjnVar2);
                                unsafe4.putObject(obj4, j4, zzjnVar2.zzc);
                                i22 |= i32;
                                i17 = i4;
                                i20 = i26;
                                obj5 = obj4;
                                unsafe5 = unsafe4;
                                i21 = i30;
                                i18 = -1;
                                break;
                            }
                        case 12:
                            i12 = i34;
                            obj4 = obj5;
                            unsafe4 = unsafe5;
                            if (i27 != 0) {
                                i7 = i26;
                                unsafe2 = unsafe4;
                                i10 = i30;
                                obj3 = obj4;
                                i9 = i12;
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                i19 = zzjo.zzj(bArr2, i12, zzjnVar2);
                                unsafe4.putInt(obj4, j4, zzjnVar2.zza);
                                i22 |= i32;
                                i17 = i4;
                                i20 = i26;
                                obj5 = obj4;
                                unsafe5 = unsafe4;
                                i21 = i30;
                                i18 = -1;
                                break;
                            }
                        case 15:
                            i12 = i34;
                            obj4 = obj5;
                            unsafe4 = unsafe5;
                            if (i27 != 0) {
                                i7 = i26;
                                unsafe2 = unsafe4;
                                i10 = i30;
                                obj3 = obj4;
                                i9 = i12;
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                i19 = zzjo.zzj(bArr2, i12, zzjnVar2);
                                unsafe4.putInt(obj4, j4, zzke.zzb(zzjnVar2.zza));
                                i22 |= i32;
                                i17 = i4;
                                i20 = i26;
                                obj5 = obj4;
                                unsafe5 = unsafe4;
                                i21 = i30;
                                i18 = -1;
                                break;
                            }
                        case 16:
                            if (i27 != 0) {
                                obj3 = obj5;
                                unsafe2 = unsafe5;
                                i9 = i34;
                                i10 = i30;
                                i7 = i26;
                                i5 = i29;
                                unsafe = unsafe2;
                                i8 = i10;
                                i6 = i9;
                                obj2 = obj3;
                                break;
                            } else {
                                int zzm2 = zzjo.zzm(bArr2, i34, zzjnVar2);
                                Unsafe unsafe8 = unsafe5;
                                Object obj8 = obj5;
                                unsafe8.putLong(obj8, j4, zzke.zzc(zzjnVar2.zzb));
                                unsafe4 = unsafe8;
                                obj4 = obj8;
                                i22 |= i32;
                                i17 = i4;
                                i19 = zzm2;
                                i20 = i26;
                                obj5 = obj4;
                                unsafe5 = unsafe4;
                                i21 = i30;
                                i18 = -1;
                                break;
                            }
                        default:
                            obj3 = obj5;
                            unsafe2 = unsafe5;
                            i9 = i34;
                            i10 = i30;
                            i7 = i26;
                            i5 = i29;
                            unsafe = unsafe2;
                            i8 = i10;
                            i6 = i9;
                            obj2 = obj3;
                            break;
                    }
                } else {
                    i7 = i26;
                    Object obj9 = obj5;
                    Unsafe unsafe9 = unsafe5;
                    int i35 = i24;
                    if (zzx != 27) {
                        i8 = i30;
                        i16 = i35;
                        if (zzx <= 49) {
                            long j5 = i28;
                            i15 = i22;
                            unsafe = unsafe9;
                            i14 = i23;
                            int zzs = zzmlVar.zzs(obj9, bArr, i16, i4, i29, i7, i27, i8, j5, zzx, j4, zzjnVar);
                            i13 = i29;
                            if (zzs != i16) {
                                zzmlVar = this;
                                obj5 = obj;
                                i17 = i4;
                                zzjnVar2 = zzjnVar;
                                i19 = zzs;
                                i23 = i14;
                                i20 = i7;
                                i21 = i8;
                                i22 = i15;
                                unsafe5 = unsafe;
                                i18 = -1;
                                bArr2 = bArr;
                            } else {
                                obj2 = obj;
                                i6 = zzs;
                                i5 = i13;
                                i23 = i14;
                                i22 = i15;
                            }
                        } else {
                            i14 = i23;
                            i15 = i22;
                            unsafe = unsafe9;
                            i13 = i29;
                            if (zzx != 50) {
                                i5 = i13;
                                int zzr = zzr(obj, bArr, i16, i4, i5, i7, i27, i28, zzx, j4, i8, zzjnVar);
                                obj2 = obj;
                                if (zzr != i16) {
                                    zzmlVar = this;
                                    i17 = i4;
                                    zzjnVar2 = zzjnVar;
                                    i19 = zzr;
                                    obj5 = obj2;
                                    i23 = i14;
                                    i20 = i7;
                                    i21 = i8;
                                    i22 = i15;
                                    unsafe5 = unsafe;
                                    i18 = -1;
                                    bArr2 = bArr;
                                } else {
                                    i6 = zzr;
                                    i23 = i14;
                                    i22 = i15;
                                }
                            } else if (i27 == 2) {
                                int zzq = zzq(obj, bArr, i16, i4, i8, j4, zzjnVar);
                                if (zzq != i16) {
                                    zzmlVar = this;
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i17 = i4;
                                    zzjnVar2 = zzjnVar;
                                    i19 = zzq;
                                    i23 = i14;
                                    i20 = i7;
                                    i21 = i8;
                                    i22 = i15;
                                    unsafe5 = unsafe;
                                    i18 = -1;
                                } else {
                                    obj2 = obj;
                                    i6 = zzq;
                                    i5 = i13;
                                    i23 = i14;
                                    i22 = i15;
                                }
                            }
                        }
                    } else if (i27 == 2) {
                        zzli zzliVar = (zzli) unsafe9.getObject(obj9, j4);
                        if (!zzliVar.zzc()) {
                            int size = zzliVar.size();
                            zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
                            unsafe9.putObject(obj9, j4, zzliVar);
                        }
                        zzmt zzB = zzmlVar.zzB(i30);
                        i30 = i30;
                        byte[] bArr3 = bArr2;
                        bArr2 = bArr;
                        i17 = i4;
                        zzjnVar2 = zzjnVar;
                        i19 = zzjo.zze(zzB, i29, bArr3, i35, i4, zzliVar, zzjnVar);
                        unsafe5 = unsafe9;
                        obj5 = obj9;
                        i20 = i7;
                        i21 = i30;
                        i18 = -1;
                    } else {
                        i13 = i29;
                        unsafe = unsafe9;
                        i8 = i30;
                        i14 = i23;
                        i15 = i22;
                        i16 = i35;
                    }
                    obj2 = obj;
                    i6 = i16;
                    i5 = i13;
                    i23 = i14;
                    i22 = i15;
                }
            }
            int zzi = zzjo.zzi(i5, bArr, i6, i4, zzd(obj2), zzjnVar);
            bArr2 = bArr;
            zzjnVar2 = zzjnVar;
            i17 = i4;
            obj5 = obj2;
            i20 = i7;
            i21 = i8;
            unsafe5 = unsafe;
            i18 = -1;
            i19 = zzi;
            zzmlVar = this;
        }
        Object obj10 = obj5;
        Unsafe unsafe10 = unsafe5;
        int i36 = i17;
        int i37 = i23;
        int i38 = i22;
        if (i37 != 1048575) {
            unsafe10.putInt(obj10, i37, i38);
        }
        if (i19 != i36) {
            throw zzll.zze();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) throws IOException {
        int i;
        int i4;
        int i5 = 0;
        int i6 = 1048575;
        if (this.zzi) {
            if (this.zzh) {
                this.zzo.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int zzy = zzy(i7);
                int i8 = this.zzc[i7];
                switch (zzx(zzy)) {
                    case 0:
                        if (zzP(obj, i7)) {
                            zzocVar.zzf(i8, zznu.zza(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i7)) {
                            zzocVar.zzo(i8, zznu.zzb(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i7)) {
                            zzocVar.zzt(i8, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i7)) {
                            zzocVar.zzJ(i8, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i7)) {
                            zzocVar.zzr(i8, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i7)) {
                            zzocVar.zzm(i8, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i7)) {
                            zzocVar.zzk(i8, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i7)) {
                            zzocVar.zzb(i8, zznu.zzw(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i7)) {
                            zzV(i8, zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i7)) {
                            zzocVar.zzv(i8, zznu.zzf(obj, zzy & 1048575), zzB(i7));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i7)) {
                            zzocVar.zzd(i8, (zzka) zznu.zzf(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i7)) {
                            zzocVar.zzH(i8, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i7)) {
                            zzocVar.zzi(i8, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i7)) {
                            zzocVar.zzw(i8, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i7)) {
                            zzocVar.zzy(i8, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i7)) {
                            zzocVar.zzA(i8, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i7)) {
                            zzocVar.zzC(i8, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i7)) {
                            zzocVar.zzq(i8, zznu.zzf(obj, zzy & 1048575), zzB(i7));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzmv.zzF(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 19:
                        zzmv.zzJ(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 20:
                        zzmv.zzM(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 21:
                        zzmv.zzU(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 22:
                        zzmv.zzL(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 23:
                        zzmv.zzI(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 24:
                        zzmv.zzH(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 25:
                        zzmv.zzD(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 26:
                        zzmv.zzS(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 27:
                        zzmv.zzN(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i7));
                        break;
                    case 28:
                        zzmv.zzE(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 29:
                        zzmv.zzT(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 30:
                        zzmv.zzG(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 31:
                        zzmv.zzO(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 32:
                        zzmv.zzP(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 33:
                        zzmv.zzQ(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 34:
                        zzmv.zzR(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 35:
                        zzmv.zzF(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 36:
                        zzmv.zzJ(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 37:
                        zzmv.zzM(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 38:
                        zzmv.zzU(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 39:
                        zzmv.zzL(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 40:
                        zzmv.zzI(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 41:
                        zzmv.zzH(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 42:
                        zzmv.zzD(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 43:
                        zzmv.zzT(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 44:
                        zzmv.zzG(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 45:
                        zzmv.zzO(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 46:
                        zzmv.zzP(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 47:
                        zzmv.zzQ(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 48:
                        zzmv.zzR(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 49:
                        zzmv.zzK(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i7));
                        break;
                    case 50:
                        zzN(zzocVar, i8, zznu.zzf(obj, zzy & 1048575), i7);
                        break;
                    case 51:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzf(i8, zzm(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzo(i8, zzn(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzt(i8, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzJ(i8, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzr(i8, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzm(i8, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzk(i8, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzb(i8, zzU(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i8, i7)) {
                            zzV(i8, zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzv(i8, zznu.zzf(obj, zzy & 1048575), zzB(i7));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzd(i8, (zzka) zznu.zzf(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzH(i8, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzi(i8, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzw(i8, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzy(i8, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzA(i8, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzC(i8, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i8, i7)) {
                            zzocVar.zzq(i8, zznu.zzf(obj, zzy & 1048575), zzB(i7));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zznk zznkVar = this.zzn;
            zznkVar.zzi(zznkVar.zzd(obj), zzocVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length2 = this.zzc.length;
        Unsafe unsafe = zzb;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i9 < length2) {
            int zzy2 = zzy(i9);
            int[] iArr = this.zzc;
            int i12 = iArr[i9];
            int zzx = zzx(zzy2);
            if (zzx <= 17) {
                int i13 = iArr[i9 + 2];
                int i14 = i13 & i6;
                if (i14 != i11) {
                    i10 = unsafe.getInt(obj, i14);
                    i11 = i14;
                }
                i = 1 << (i13 >>> 20);
            } else {
                i = i5;
            }
            long j4 = zzy2 & i6;
            switch (zzx) {
                case 0:
                    i4 = 0;
                    if ((i10 & i) == 0) {
                        break;
                    } else {
                        zzocVar.zzf(i12, zznu.zza(obj, j4));
                        continue;
                    }
                case 1:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzo(i12, zznu.zzb(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzt(i12, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzJ(i12, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzr(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzm(i12, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzk(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzb(i12, zznu.zzw(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzV(i12, unsafe.getObject(obj, j4), zzocVar);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzv(i12, unsafe.getObject(obj, j4), zzB(i9));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzd(i12, (zzka) unsafe.getObject(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzH(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzi(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzw(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzy(i12, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzA(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzC(i12, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i4 = 0;
                    if ((i10 & i) != 0) {
                        zzocVar.zzq(i12, unsafe.getObject(obj, j4), zzB(i9));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i4 = 0;
                    zzmv.zzF(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 19:
                    i4 = 0;
                    zzmv.zzJ(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 20:
                    i4 = 0;
                    zzmv.zzM(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 21:
                    i4 = 0;
                    zzmv.zzU(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 22:
                    i4 = 0;
                    zzmv.zzL(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 23:
                    i4 = 0;
                    zzmv.zzI(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 24:
                    i4 = 0;
                    zzmv.zzH(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 25:
                    i4 = 0;
                    zzmv.zzD(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 26:
                    zzmv.zzS(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar);
                    break;
                case 27:
                    zzmv.zzN(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, zzB(i9));
                    break;
                case 28:
                    zzmv.zzE(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar);
                    break;
                case 29:
                    zzmv.zzT(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    break;
                case 30:
                    i4 = 0;
                    zzmv.zzG(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 31:
                    i4 = 0;
                    zzmv.zzO(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 32:
                    i4 = 0;
                    zzmv.zzP(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 33:
                    i4 = 0;
                    zzmv.zzQ(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 34:
                    i4 = 0;
                    zzmv.zzR(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                case 35:
                    zzmv.zzF(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 36:
                    zzmv.zzJ(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 37:
                    zzmv.zzM(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 38:
                    zzmv.zzU(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 39:
                    zzmv.zzL(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 40:
                    zzmv.zzI(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 41:
                    zzmv.zzH(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 42:
                    zzmv.zzD(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 43:
                    zzmv.zzT(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 44:
                    zzmv.zzG(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 45:
                    zzmv.zzO(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 46:
                    zzmv.zzP(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 47:
                    zzmv.zzQ(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 48:
                    zzmv.zzR(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 49:
                    zzmv.zzK(this.zzc[i9], (List) unsafe.getObject(obj, j4), zzocVar, zzB(i9));
                    break;
                case 50:
                    zzN(zzocVar, i12, unsafe.getObject(obj, j4), i9);
                    break;
                case 51:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzf(i12, zzm(obj, j4));
                        break;
                    }
                    break;
                case 52:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzo(i12, zzn(obj, j4));
                        break;
                    }
                    break;
                case 53:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzt(i12, zzz(obj, j4));
                        break;
                    }
                    break;
                case 54:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzJ(i12, zzz(obj, j4));
                        break;
                    }
                    break;
                case 55:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzr(i12, zzp(obj, j4));
                        break;
                    }
                    break;
                case 56:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzm(i12, zzz(obj, j4));
                        break;
                    }
                    break;
                case 57:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzk(i12, zzp(obj, j4));
                        break;
                    }
                    break;
                case 58:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzb(i12, zzU(obj, j4));
                        break;
                    }
                    break;
                case 59:
                    if (zzT(obj, i12, i9)) {
                        zzV(i12, unsafe.getObject(obj, j4), zzocVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzv(i12, unsafe.getObject(obj, j4), zzB(i9));
                        break;
                    }
                    break;
                case 61:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzd(i12, (zzka) unsafe.getObject(obj, j4));
                        break;
                    }
                    break;
                case 62:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzH(i12, zzp(obj, j4));
                        break;
                    }
                    break;
                case 63:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzi(i12, zzp(obj, j4));
                        break;
                    }
                    break;
                case 64:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzw(i12, zzp(obj, j4));
                        break;
                    }
                    break;
                case 65:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzy(i12, zzz(obj, j4));
                        break;
                    }
                    break;
                case 66:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzA(i12, zzp(obj, j4));
                        break;
                    }
                    break;
                case 67:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzC(i12, zzz(obj, j4));
                        break;
                    }
                    break;
                case 68:
                    if (zzT(obj, i12, i9)) {
                        zzocVar.zzq(i12, unsafe.getObject(obj, j4), zzB(i9));
                        break;
                    }
                    break;
            }
            i4 = 0;
            i9 += 3;
            i5 = i4;
            i6 = 1048575;
        }
        zznk zznkVar2 = this.zzn;
        zznkVar2.zzi(zznkVar2.zzd(obj), zzocVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzj(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzj(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzk(Object obj) {
        int i;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i7 < this.zzk) {
            int i9 = this.zzj[i7];
            int i10 = this.zzc[i9];
            int zzy = zzy(i9);
            int i11 = this.zzc[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i8) {
                if (i12 != 1048575) {
                    i6 = zzb.getInt(obj, i12);
                }
                i = i6;
                i8 = i12;
            } else {
                i = i6;
            }
            if ((268435456 & zzy) != 0) {
                i4 = i9;
                i5 = i8;
                if (!zzQ(obj, i4, i5, i, i13)) {
                    return false;
                }
            } else {
                i4 = i9;
                i5 = i8;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj, i10, i4) && !zzR(obj, zzy, zzB(i4))) {
                            return false;
                        }
                    } else if (zzx != 49) {
                        if (zzx == 50 && !((zzmc) zznu.zzf(obj, zzy & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zznu.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmt zzB = zzB(i4);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (!zzB.zzk(list.get(i14))) {
                            return false;
                        }
                    }
                }
            } else if (zzQ(obj, i4, i5, i, i13) && !zzR(obj, zzy, zzB(i4))) {
                return false;
            }
            i7++;
            i8 = i5;
            i6 = i;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
