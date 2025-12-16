package s3;

import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import r3.C0576h;
import r3.D;
import r3.x;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f8472a;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        f8472a = bytes;
    }

    public static final boolean a(D segment, int i, byte[] bytes, int i4) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i5 = segment.f8250c;
        byte[] bArr = segment.f8248a;
        for (int i6 = 1; i6 < i4; i6++) {
            if (i == i5) {
                segment = segment.f8253f;
                Intrinsics.checkNotNull(segment);
                bArr = segment.f8248a;
                i = segment.f8249b;
                i5 = segment.f8250c;
            }
            if (bArr[i] != bytes[i6]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final String b(C0576h c0576h, long j4) {
        Intrinsics.checkNotNullParameter(c0576h, "<this>");
        if (j4 > 0) {
            long j5 = j4 - 1;
            if (c0576h.O(j5) == 13) {
                String d02 = c0576h.d0(j5, Charsets.UTF_8);
                c0576h.l(2L);
                return d02;
            }
        }
        c0576h.getClass();
        String d03 = c0576h.d0(j4, Charsets.UTF_8);
        c0576h.l(1L);
        return d03;
    }

    public static final int c(C0576h c0576h, x options, boolean z3) {
        int i;
        byte[] bArr;
        int i4;
        int i5;
        D d4;
        byte[] bArr2;
        int i6;
        Intrinsics.checkNotNullParameter(c0576h, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        D d5 = c0576h.f8283a;
        if (d5 == null) {
            return z3 ? -2 : -1;
        }
        int i7 = d5.f8249b;
        int i8 = d5.f8250c;
        int[] iArr = options.f8318b;
        byte[] bArr3 = d5.f8248a;
        D d6 = d5;
        int i9 = -1;
        int i10 = 0;
        loop0: while (true) {
            int i11 = i10 + 1;
            int i12 = iArr[i10];
            int i13 = i10 + 2;
            int i14 = iArr[i11];
            if (i14 != -1) {
                i9 = i14;
            }
            if (d6 == null) {
                break;
            }
            if (i12 >= 0) {
                int i15 = i7 + 1;
                int i16 = bArr3[i7] & UByte.MAX_VALUE;
                int i17 = i13 + i12;
                while (i13 != i17) {
                    if (i16 == iArr[i13]) {
                        i = iArr[i13 + i12];
                        if (i15 == i8) {
                            d6 = d6.f8253f;
                            Intrinsics.checkNotNull(d6);
                            i5 = d6.f8249b;
                            i4 = d6.f8250c;
                            bArr = d6.f8248a;
                            if (d6 == d5) {
                                d6 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i4 = i8;
                            i5 = i15;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        byte[] bArr4 = bArr;
                        i10 = -i;
                        i7 = i5;
                        i8 = i4;
                        bArr3 = bArr4;
                    } else {
                        i13++;
                    }
                }
                break loop0;
            }
            int i18 = (i12 * (-1)) + i13;
            while (true) {
                int i19 = i7 + 1;
                int i20 = i13 + 1;
                if ((bArr3[i7] & UByte.MAX_VALUE) != iArr[i13]) {
                    break loop0;
                }
                boolean z4 = i20 == i18;
                if (i19 == i8) {
                    Intrinsics.checkNotNull(d6);
                    D d7 = d6.f8253f;
                    Intrinsics.checkNotNull(d7);
                    i6 = d7.f8249b;
                    int i21 = d7.f8250c;
                    bArr2 = d7.f8248a;
                    if (d7 != d5) {
                        d4 = d7;
                        i8 = i21;
                    } else {
                        if (!z4) {
                            break loop0;
                        }
                        i8 = i21;
                        d4 = null;
                    }
                } else {
                    d4 = d6;
                    bArr2 = bArr3;
                    i6 = i19;
                }
                if (z4) {
                    i = iArr[i20];
                    int i22 = i6;
                    i4 = i8;
                    i5 = i22;
                    byte[] bArr5 = bArr2;
                    d6 = d4;
                    bArr = bArr5;
                    break;
                }
                i7 = i6;
                bArr3 = bArr2;
                d6 = d4;
                i13 = i20;
            }
        }
        if (z3) {
            return -2;
        }
        return i9;
    }
}
