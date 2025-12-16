package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
/* loaded from: classes3.dex */
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    /* renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m1590overflowLRDsOJo(long duration) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt__DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((Object) Duration.m1504toStringimpl(duration)) + '.');
    }

    /* renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m1591plusAssignLRDsOJo(long duration) {
        long m1501toLongimpl = Duration.m1501toLongimpl(duration, getUnit());
        if (((m1501toLongimpl - 1) | 1) != LongCompanionObject.MAX_VALUE) {
            long j4 = this.reading;
            long j5 = j4 + m1501toLongimpl;
            if ((m1501toLongimpl ^ j4) >= 0 && (j4 ^ j5) < 0) {
                m1590overflowLRDsOJo(duration);
            }
            this.reading = j5;
            return;
        }
        long m1458divUwyO8pc = Duration.m1458divUwyO8pc(duration, 2);
        if ((1 | (Duration.m1501toLongimpl(m1458divUwyO8pc, getUnit()) - 1)) == LongCompanionObject.MAX_VALUE) {
            m1590overflowLRDsOJo(duration);
            return;
        }
        long j6 = this.reading;
        try {
            m1591plusAssignLRDsOJo(m1458divUwyO8pc);
            m1591plusAssignLRDsOJo(Duration.m1490minusLRDsOJo(duration, m1458divUwyO8pc));
        } catch (IllegalStateException e4) {
            this.reading = j6;
            throw e4;
        }
    }

    @Override // kotlin.time.AbstractLongTimeSource
    /* renamed from: read, reason: from getter */
    public long getReading() {
        return this.reading;
    }
}
