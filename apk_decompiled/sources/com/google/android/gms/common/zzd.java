package com.google.android.gms.common;

/* loaded from: classes3.dex */
final class zzd {
    public static int zza(int i) {
        int[] iArr = {1, 2, 3};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr[i4];
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == i) {
                return i5;
            }
        }
        return 1;
    }
}
