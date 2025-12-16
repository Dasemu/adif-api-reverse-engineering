package kotlin.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1321differenceModuloWZ9TVnA(int i, int i4, int i5) {
        int remainderUnsigned = Integer.remainderUnsigned(i, i5);
        int remainderUnsigned2 = Integer.remainderUnsigned(i4, i5);
        int compareUnsigned = Integer.compareUnsigned(remainderUnsigned, remainderUnsigned2);
        int m211constructorimpl = UInt.m211constructorimpl(remainderUnsigned - remainderUnsigned2);
        return compareUnsigned >= 0 ? m211constructorimpl : UInt.m211constructorimpl(m211constructorimpl + i5);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1322differenceModulosambcqE(long j4, long j5, long j6) {
        long remainderUnsigned = Long.remainderUnsigned(j4, j6);
        long remainderUnsigned2 = Long.remainderUnsigned(j5, j6);
        int compareUnsigned = Long.compareUnsigned(remainderUnsigned, remainderUnsigned2);
        long m290constructorimpl = ULong.m290constructorimpl(remainderUnsigned - remainderUnsigned2);
        return compareUnsigned >= 0 ? m290constructorimpl : ULong.m290constructorimpl(m290constructorimpl + j6);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1323getProgressionLastElement7ftBX0g(long j4, long j5, long j6) {
        if (j6 > 0) {
            return Long.compareUnsigned(j4, j5) >= 0 ? j5 : ULong.m290constructorimpl(j5 - m1322differenceModulosambcqE(j5, j4, ULong.m290constructorimpl(j6)));
        }
        if (j6 < 0) {
            return Long.compareUnsigned(j4, j5) <= 0 ? j5 : ULong.m290constructorimpl(j5 + m1322differenceModulosambcqE(j4, j5, ULong.m290constructorimpl(-j6)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1324getProgressionLastElementNkh28Cs(int i, int i4, int i5) {
        if (i5 > 0) {
            if (Integer.compareUnsigned(i, i4) < 0) {
                return UInt.m211constructorimpl(i4 - m1321differenceModuloWZ9TVnA(i4, i, UInt.m211constructorimpl(i5)));
            }
        } else {
            if (i5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compareUnsigned(i, i4) > 0) {
                return UInt.m211constructorimpl(i4 + m1321differenceModuloWZ9TVnA(i, i4, UInt.m211constructorimpl(-i5)));
            }
        }
        return i4;
    }
}
