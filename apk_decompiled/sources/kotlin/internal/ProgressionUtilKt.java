package kotlin.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a \u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0001\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"differenceModulo", "", "a", "b", "c", "", "getProgressionLastElement", "start", "end", "step", "mod", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressionUtilKt {
    private static final int differenceModulo(int i, int i4, int i5) {
        return mod(mod(i, i5) - mod(i4, i5), i5);
    }

    @PublishedApi
    public static final int getProgressionLastElement(int i, int i4, int i5) {
        if (i5 > 0) {
            if (i < i4) {
                return i4 - differenceModulo(i4, i, i5);
            }
        } else {
            if (i5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i4) {
                return i4 + differenceModulo(i, i4, -i5);
            }
        }
        return i4;
    }

    private static final int mod(int i, int i4) {
        int i5 = i % i4;
        return i5 >= 0 ? i5 : i5 + i4;
    }

    private static final long differenceModulo(long j4, long j5, long j6) {
        return mod(mod(j4, j6) - mod(j5, j6), j6);
    }

    private static final long mod(long j4, long j5) {
        long j6 = j4 % j5;
        return j6 >= 0 ? j6 : j6 + j5;
    }

    @PublishedApi
    public static final long getProgressionLastElement(long j4, long j5, long j6) {
        if (j6 > 0) {
            return j4 >= j5 ? j5 : j5 - differenceModulo(j5, j4, j6);
        }
        if (j6 < 0) {
            return j4 <= j5 ? j5 : j5 + differenceModulo(j4, j5, -j6);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
