package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
public final class SlidingWindowKt$windowedIterator$1<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Iterator<T> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SlidingWindowKt$windowedIterator$1(int i, int i4, Iterator<? extends T> it, boolean z3, boolean z4, Continuation<? super SlidingWindowKt$windowedIterator$1> continuation) {
        super(2, continuation);
        this.$size = i;
        this.$step = i4;
        this.$iterator = it;
        this.$reuseBuffer = z3;
        this.$partialWindows = z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, continuation);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0147, code lost:
    
        if (r4.yield(r11, r10) == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0162, code lost:
    
        if (r4.yield(r1, r10) == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        if (r6.yield(r11, r10) == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0094, code lost:
    
        r10.L$0 = r4;
        r10.L$1 = r3;
        r10.L$2 = r2;
        r10.I$0 = r1;
        r10.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r4.yield(r3, r10) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d6, code lost:
    
        if (r4.yield(r3, r10) == r0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0147 -> B:12:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0119 -> B:29:0x011c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00a2 -> B:48:0x0055). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super List<? extends T>> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SlidingWindowKt$windowedIterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
