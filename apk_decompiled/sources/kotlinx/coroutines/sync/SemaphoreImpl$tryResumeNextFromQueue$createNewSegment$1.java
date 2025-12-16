package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 extends FunctionReferenceImpl implements Function2<Long, SemaphoreSegment, SemaphoreSegment> {
    public static final SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 INSTANCE = new SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1();

    public SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, SemaphoreKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ SemaphoreSegment invoke(Long l4, SemaphoreSegment semaphoreSegment) {
        return invoke(l4.longValue(), semaphoreSegment);
    }

    public final SemaphoreSegment invoke(long j4, SemaphoreSegment semaphoreSegment) {
        SemaphoreSegment createSegment;
        createSegment = SemaphoreKt.createSegment(j4, semaphoreSegment);
        return createSegment;
    }
}
