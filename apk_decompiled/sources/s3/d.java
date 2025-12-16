package s3;

import kotlin.jvm.internal.Intrinsics;
import r3.F;

/* loaded from: classes3.dex */
public abstract class d {
    public static final int a(F f2, int i) {
        int i4;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        int[] iArr = f2.f8259f;
        int i5 = i + 1;
        int length = f2.f8258e.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i6 = length - 1;
        int i7 = 0;
        while (true) {
            if (i7 <= i6) {
                i4 = (i7 + i6) >>> 1;
                int i8 = iArr[i4];
                if (i8 >= i5) {
                    if (i8 <= i5) {
                        break;
                    }
                    i6 = i4 - 1;
                } else {
                    i7 = i4 + 1;
                }
            } else {
                i4 = (-i7) - 1;
                break;
            }
        }
        return i4 >= 0 ? i4 : ~i4;
    }
}
