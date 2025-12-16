package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u0014\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m571partitionnroSd4(long[] jArr, int i, int i4) {
        long m350getsVKNKU = ULongArray.m350getsVKNKU(jArr, (i + i4) / 2);
        while (i <= i4) {
            while (Long.compareUnsigned(ULongArray.m350getsVKNKU(jArr, i), m350getsVKNKU) < 0) {
                i++;
            }
            while (Long.compareUnsigned(ULongArray.m350getsVKNKU(jArr, i4), m350getsVKNKU) > 0) {
                i4--;
            }
            if (i <= i4) {
                long m350getsVKNKU2 = ULongArray.m350getsVKNKU(jArr, i);
                ULongArray.m355setk8EXiF4(jArr, i, ULongArray.m350getsVKNKU(jArr, i4));
                ULongArray.m355setk8EXiF4(jArr, i4, m350getsVKNKU2);
                i++;
                i4--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m572partition4UcCI2c(byte[] bArr, int i, int i4) {
        int i5;
        byte m192getw2LRezQ = UByteArray.m192getw2LRezQ(bArr, (i + i4) / 2);
        while (i <= i4) {
            while (true) {
                int m192getw2LRezQ2 = UByteArray.m192getw2LRezQ(bArr, i) & UByte.MAX_VALUE;
                i5 = m192getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(m192getw2LRezQ2, i5) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m192getw2LRezQ(bArr, i4) & UByte.MAX_VALUE, i5) > 0) {
                i4--;
            }
            if (i <= i4) {
                byte m192getw2LRezQ3 = UByteArray.m192getw2LRezQ(bArr, i);
                UByteArray.m197setVurrAj0(bArr, i, UByteArray.m192getw2LRezQ(bArr, i4));
                UByteArray.m197setVurrAj0(bArr, i4, m192getw2LRezQ3);
                i++;
                i4--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m573partitionAa5vz7o(short[] sArr, int i, int i4) {
        int i5;
        short m455getMh2AYeg = UShortArray.m455getMh2AYeg(sArr, (i + i4) / 2);
        while (i <= i4) {
            while (true) {
                int m455getMh2AYeg2 = UShortArray.m455getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i5 = m455getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m455getMh2AYeg2, i5) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m455getMh2AYeg(sArr, i4) & UShort.MAX_VALUE, i5) > 0) {
                i4--;
            }
            if (i <= i4) {
                short m455getMh2AYeg3 = UShortArray.m455getMh2AYeg(sArr, i);
                UShortArray.m460set01HTLdE(sArr, i, UShortArray.m455getMh2AYeg(sArr, i4));
                UShortArray.m460set01HTLdE(sArr, i4, m455getMh2AYeg3);
                i++;
                i4--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m574partitionoBK06Vg(int[] iArr, int i, int i4) {
        int m271getpVg5ArA = UIntArray.m271getpVg5ArA(iArr, (i + i4) / 2);
        while (i <= i4) {
            while (Integer.compareUnsigned(UIntArray.m271getpVg5ArA(iArr, i), m271getpVg5ArA) < 0) {
                i++;
            }
            while (Integer.compareUnsigned(UIntArray.m271getpVg5ArA(iArr, i4), m271getpVg5ArA) > 0) {
                i4--;
            }
            if (i <= i4) {
                int m271getpVg5ArA2 = UIntArray.m271getpVg5ArA(iArr, i);
                UIntArray.m276setVXSXFK8(iArr, i, UIntArray.m271getpVg5ArA(iArr, i4));
                UIntArray.m276setVXSXFK8(iArr, i4, m271getpVg5ArA2);
                i++;
                i4--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m575quickSortnroSd4(long[] jArr, int i, int i4) {
        int m571partitionnroSd4 = m571partitionnroSd4(jArr, i, i4);
        int i5 = m571partitionnroSd4 - 1;
        if (i < i5) {
            m575quickSortnroSd4(jArr, i, i5);
        }
        if (m571partitionnroSd4 < i4) {
            m575quickSortnroSd4(jArr, m571partitionnroSd4, i4);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m576quickSort4UcCI2c(byte[] bArr, int i, int i4) {
        int m572partition4UcCI2c = m572partition4UcCI2c(bArr, i, i4);
        int i5 = m572partition4UcCI2c - 1;
        if (i < i5) {
            m576quickSort4UcCI2c(bArr, i, i5);
        }
        if (m572partition4UcCI2c < i4) {
            m576quickSort4UcCI2c(bArr, m572partition4UcCI2c, i4);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m577quickSortAa5vz7o(short[] sArr, int i, int i4) {
        int m573partitionAa5vz7o = m573partitionAa5vz7o(sArr, i, i4);
        int i5 = m573partitionAa5vz7o - 1;
        if (i < i5) {
            m577quickSortAa5vz7o(sArr, i, i5);
        }
        if (m573partitionAa5vz7o < i4) {
            m577quickSortAa5vz7o(sArr, m573partitionAa5vz7o, i4);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m578quickSortoBK06Vg(int[] iArr, int i, int i4) {
        int m574partitionoBK06Vg = m574partitionoBK06Vg(iArr, i, i4);
        int i5 = m574partitionoBK06Vg - 1;
        if (i < i5) {
            m578quickSortoBK06Vg(iArr, i, i5);
        }
        if (m574partitionoBK06Vg < i4) {
            m578quickSortoBK06Vg(iArr, m574partitionoBK06Vg, i4);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m579sortArraynroSd4(long[] array, int i, int i4) {
        Intrinsics.checkNotNullParameter(array, "array");
        m575quickSortnroSd4(array, i, i4 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m580sortArray4UcCI2c(byte[] array, int i, int i4) {
        Intrinsics.checkNotNullParameter(array, "array");
        m576quickSort4UcCI2c(array, i, i4 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m581sortArrayAa5vz7o(short[] array, int i, int i4) {
        Intrinsics.checkNotNullParameter(array, "array");
        m577quickSortAa5vz7o(array, i, i4 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m582sortArrayoBK06Vg(int[] array, int i, int i4) {
        Intrinsics.checkNotNullParameter(array, "array");
        m578quickSortoBK06Vg(array, i, i4 - 1);
    }
}
