package com.google.android.gms.internal.common;

import com.google.android.gms.measurement.internal.a;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes3.dex */
public final class zzah {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i4 = 0; i4 < i; i4++) {
            if (objArr[i4] == null) {
                throw new NullPointerException(a.l(i4, "at index "));
            }
        }
        return objArr;
    }
}
