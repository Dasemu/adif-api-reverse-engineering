package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzjb extends zziw implements Set {
    private transient zzja zza;

    public static int zzf(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @SafeVarargs
    public static zzjb zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "_in";
        objArr2[1] = "_xa";
        objArr2[2] = "_xu";
        objArr2[3] = "_aq";
        objArr2[4] = "_aa";
        objArr2[5] = "_ai";
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return zzk(15, objArr2);
    }

    private static zzjb zzk(int i, Object... objArr) {
        if (i == 0) {
            return zzjf.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzjg(obj);
        }
        int zzf = zzf(i);
        Object[] objArr2 = new Object[zzf];
        int i4 = zzf - 1;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            Object obj2 = objArr[i7];
            zzjd.zza(obj2, i7);
            int hashCode = obj2.hashCode();
            int zza = zzit.zza(hashCode);
            while (true) {
                int i8 = zza & i4;
                Object obj3 = objArr2[i8];
                if (obj3 == null) {
                    objArr[i6] = obj2;
                    objArr2[i8] = obj2;
                    i5 += hashCode;
                    i6++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i6, i, (Object) null);
        if (i6 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzjg(obj4);
        }
        if (zzf(i6) < zzf / 2) {
            return zzk(i6, objArr);
        }
        if (i6 < 10) {
            objArr = Arrays.copyOf(objArr, i6);
        }
        return new zzjf(objArr, i5, objArr2, i4, i6);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzjb) && zzj() && ((zzjb) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzjh iterator();

    public final zzja zzg() {
        zzja zzjaVar = this.zza;
        if (zzjaVar != null) {
            return zzjaVar;
        }
        zzja zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    public zzja zzh() {
        Object[] array = toArray();
        int i = zzja.zzd;
        return zzja.zzg(array, array.length);
    }

    public boolean zzj() {
        return false;
    }
}
