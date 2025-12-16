package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"checkInfiniteSumDefined", "", "value", "duration", "Lkotlin/time/Duration;", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "infinityOfSign", "(J)J", "saturatingAdd", "unit", "Lkotlin/time/DurationUnit;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingFiniteDiff", "value1", "value2", "saturatingOriginsDiff", "origin1", "origin2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes3.dex */
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m1583checkInfiniteSumDefinedPjuGub4(long j4, long j5, long j6) {
        if (!Duration.m1487isInfiniteimpl(j5) || (j4 ^ j6) >= 0) {
            return j4;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j4) {
        return j4 < 0 ? Duration.INSTANCE.m1557getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m1556getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j4) {
        return ((j4 - 1) | 1) == LongCompanionObject.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m1584saturatingAddNuflL3o(long j4, DurationUnit unit, long j5) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long m1501toLongimpl = Duration.m1501toLongimpl(j5, unit);
        if (((j4 - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return m1583checkInfiniteSumDefinedPjuGub4(j4, j5, m1501toLongimpl);
        }
        if (((m1501toLongimpl - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return m1585saturatingAddInHalvesNuflL3o(j4, unit, j5);
        }
        long j6 = j4 + m1501toLongimpl;
        if (((j4 ^ j6) & (m1501toLongimpl ^ j6)) >= 0) {
            return j6;
        }
        if (j4 < 0) {
            return Long.MIN_VALUE;
        }
        return LongCompanionObject.MAX_VALUE;
    }

    /* renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m1585saturatingAddInHalvesNuflL3o(long j4, DurationUnit durationUnit, long j5) {
        long m1458divUwyO8pc = Duration.m1458divUwyO8pc(j5, 2);
        long m1501toLongimpl = Duration.m1501toLongimpl(m1458divUwyO8pc, durationUnit);
        return (1 | (m1501toLongimpl - 1)) == LongCompanionObject.MAX_VALUE ? m1501toLongimpl : m1584saturatingAddNuflL3o(m1584saturatingAddNuflL3o(j4, durationUnit, m1458divUwyO8pc), durationUnit, Duration.m1490minusLRDsOJo(j5, m1458divUwyO8pc));
    }

    public static final long saturatingDiff(long j4, long j5, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j5 - 1)) == LongCompanionObject.MAX_VALUE ? Duration.m1508unaryMinusUwyO8pc(infinityOfSign(j5)) : saturatingFiniteDiff(j4, j5, unit);
    }

    private static final long saturatingFiniteDiff(long j4, long j5, DurationUnit durationUnit) {
        long j6 = j4 - j5;
        if (((j6 ^ j4) & (~(j6 ^ j5))) >= 0) {
            return DurationKt.toDuration(j6, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m1508unaryMinusUwyO8pc(infinityOfSign(j6));
        }
        long convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j7 = (j4 / convertDurationUnit) - (j5 / convertDurationUnit);
        long j8 = (j4 % convertDurationUnit) - (j5 % convertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m1491plusLRDsOJo(DurationKt.toDuration(j7, durationUnit2), DurationKt.toDuration(j8, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j4, long j5, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return ((j5 - 1) | 1) == LongCompanionObject.MAX_VALUE ? j4 == j5 ? Duration.INSTANCE.m1558getZEROUwyO8pc() : Duration.m1508unaryMinusUwyO8pc(infinityOfSign(j5)) : (1 | (j4 - 1)) == LongCompanionObject.MAX_VALUE ? infinityOfSign(j4) : saturatingFiniteDiff(j4, j5, unit);
    }
}
