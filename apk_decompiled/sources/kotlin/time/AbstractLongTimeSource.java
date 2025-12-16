package kotlin.time;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;

@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "zero", "", "getZero", "()J", "zero$delegate", "Lkotlin/Lazy;", "adjustedRead", "markNow", "Lkotlin/time/ComparableTimeMark;", "read", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: classes3.dex */
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {
    private final DurationUnit unit;

    /* renamed from: zero$delegate, reason: from kotlin metadata */
    private final Lazy zero;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001b\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", "offset", "Lkotlin/time/Duration;", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "equals", "", "other", "", "hashCode", "", "minus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class LongTimeMark implements ComparableTimeMark {
        private final long offset;
        private final long startedAt;
        private final AbstractLongTimeSource timeSource;

        public /* synthetic */ LongTimeMark(long j4, AbstractLongTimeSource abstractLongTimeSource, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(j4, abstractLongTimeSource, j5);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc */
        public long mo1445elapsedNowUwyO8pc() {
            return Duration.m1490minusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(Object other) {
            return (other instanceof LongTimeMark) && Intrinsics.areEqual(this.timeSource, ((LongTimeMark) other).timeSource) && Duration.m1460equalsimpl0(mo1447minusUwyO8pc((ComparableTimeMark) other), Duration.INSTANCE.m1558getZEROUwyO8pc());
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return Long.hashCode(this.startedAt) + (Duration.m1483hashCodeimpl(this.offset) * 37);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: minus-LRDsOJo */
        public ComparableTimeMark mo1446minusLRDsOJo(long j4) {
            return ComparableTimeMark.DefaultImpls.m1450minusLRDsOJo(this, j4);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc */
        public long mo1447minusUwyO8pc(ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof LongTimeMark) {
                LongTimeMark longTimeMark = (LongTimeMark) other;
                if (Intrinsics.areEqual(this.timeSource, longTimeMark.timeSource)) {
                    return Duration.m1491plusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, longTimeMark.startedAt, this.timeSource.getUnit()), Duration.m1490minusLRDsOJo(this.offset, longTimeMark.offset));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        public String toString() {
            return "LongTimeMark(" + this.startedAt + DurationUnitKt__DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((Object) Duration.m1504toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }

        private LongTimeMark(long j4, AbstractLongTimeSource timeSource, long j5) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = j4;
            this.timeSource = timeSource;
            this.offset = j5;
        }

        @Override // java.lang.Comparable
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: plus-LRDsOJo */
        public ComparableTimeMark mo1448plusLRDsOJo(long duration) {
            DurationUnit unit = this.timeSource.getUnit();
            if (Duration.m1487isInfiniteimpl(duration)) {
                return new LongTimeMark(LongSaturatedMathKt.m1584saturatingAddNuflL3o(this.startedAt, unit, duration), this.timeSource, Duration.INSTANCE.m1558getZEROUwyO8pc(), null);
            }
            long m1507truncateToUwyO8pc$kotlin_stdlib = Duration.m1507truncateToUwyO8pc$kotlin_stdlib(duration, unit);
            long m1491plusLRDsOJo = Duration.m1491plusLRDsOJo(Duration.m1490minusLRDsOJo(duration, m1507truncateToUwyO8pc$kotlin_stdlib), this.offset);
            long m1584saturatingAddNuflL3o = LongSaturatedMathKt.m1584saturatingAddNuflL3o(this.startedAt, unit, m1507truncateToUwyO8pc$kotlin_stdlib);
            long m1507truncateToUwyO8pc$kotlin_stdlib2 = Duration.m1507truncateToUwyO8pc$kotlin_stdlib(m1491plusLRDsOJo, unit);
            long m1584saturatingAddNuflL3o2 = LongSaturatedMathKt.m1584saturatingAddNuflL3o(m1584saturatingAddNuflL3o, unit, m1507truncateToUwyO8pc$kotlin_stdlib2);
            long m1490minusLRDsOJo = Duration.m1490minusLRDsOJo(m1491plusLRDsOJo, m1507truncateToUwyO8pc$kotlin_stdlib2);
            long m1475getInWholeNanosecondsimpl = Duration.m1475getInWholeNanosecondsimpl(m1490minusLRDsOJo);
            if (m1584saturatingAddNuflL3o2 != 0 && m1475getInWholeNanosecondsimpl != 0 && (m1584saturatingAddNuflL3o2 ^ m1475getInWholeNanosecondsimpl) < 0) {
                long duration2 = DurationKt.toDuration(MathKt.getSign(m1475getInWholeNanosecondsimpl), unit);
                m1584saturatingAddNuflL3o2 = LongSaturatedMathKt.m1584saturatingAddNuflL3o(m1584saturatingAddNuflL3o2, unit, duration2);
                m1490minusLRDsOJo = Duration.m1490minusLRDsOJo(m1490minusLRDsOJo, duration2);
            }
            if ((1 | (m1584saturatingAddNuflL3o2 - 1)) == LongCompanionObject.MAX_VALUE) {
                m1490minusLRDsOJo = Duration.INSTANCE.m1558getZEROUwyO8pc();
            }
            return new LongTimeMark(m1584saturatingAddNuflL3o2, this.timeSource, m1490minusLRDsOJo, null);
        }
    }

    public AbstractLongTimeSource(DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.zero = LazyKt.lazy(new Function0<Long>() { // from class: kotlin.time.AbstractLongTimeSource$zero$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return Long.valueOf(AbstractLongTimeSource.this.read());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    private final long getZero() {
        return ((Number) this.zero.getValue()).longValue();
    }

    public final DurationUnit getUnit() {
        return this.unit;
    }

    public abstract long read();

    @Override // kotlin.time.TimeSource
    public ComparableTimeMark markNow() {
        return new LongTimeMark(adjustedRead(), this, Duration.INSTANCE.m1558getZEROUwyO8pc(), null);
    }
}
