package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.internal.a;

/* loaded from: classes3.dex */
public final class zzjd {
    public static Object zza(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(a.l(i, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i) {
        for (int i4 = 0; i4 < i; i4++) {
            zza(objArr[i4], i4);
        }
        return objArr;
    }
}
