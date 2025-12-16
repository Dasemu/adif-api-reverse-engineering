package t;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0613a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f8506a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f8507b = new Object[0];

    public static final int a(int[] array, int i, int i4) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i5 = i - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            int i8 = array[i7];
            if (i8 < i4) {
                i6 = i7 + 1;
            } else {
                if (i8 <= i4) {
                    return i7;
                }
                i5 = i7 - 1;
            }
        }
        return ~i6;
    }

    public static final int b(long[] array, int i, long j4) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i4 = i - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            long j5 = array[i6];
            if (j5 < j4) {
                i5 = i6 + 1;
            } else {
                if (j5 <= j4) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }
}
