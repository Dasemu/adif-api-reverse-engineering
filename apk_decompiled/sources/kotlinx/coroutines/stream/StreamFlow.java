package kotlinx.coroutines.stream;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096@¢\u0006\u0002\u0010\fR\t\u0010\u0006\u001a\u00020\u0007X\u0082\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "stream", "Ljava/util/stream/Stream;", "(Ljava/util/stream/Stream;)V", "consumed", "Lkotlinx/atomicfu/AtomicBoolean;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StreamFlow<T> implements Flow<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater consumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile = 0;
    private final Stream<T> stream;

    public StreamFlow(Stream<T> stream) {
        this.stream = stream;
    }

    private final /* synthetic */ int getConsumed$volatile() {
        return this.consumed$volatile;
    }

    private final /* synthetic */ void setConsumed$volatile(int i) {
        this.consumed$volatile = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:15:0x005a, B:17:0x0060), top: B:14:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.stream.StreamFlow$collect$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.stream.StreamFlow$collect$1 r0 = (kotlinx.coroutines.stream.StreamFlow$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.stream.StreamFlow$collect$1 r0 = new kotlinx.coroutines.stream.StreamFlow$collect$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r5 = r0.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.stream.StreamFlow r2 = (kotlinx.coroutines.stream.StreamFlow) r2
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L37
            r7 = r6
            r6 = r2
            goto L5a
        L37:
            r5 = move-exception
            r6 = r2
            goto L81
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L42:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = getConsumed$volatile$FU()
            r2 = 0
            boolean r7 = r7.compareAndSet(r5, r2, r3)
            if (r7 == 0) goto L87
            java.util.stream.Stream<T> r7 = r5.stream     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L7d
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L5a:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L75
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L73
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L73
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L73
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L73
            r0.label = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r2 = r7.emit(r2, r0)     // Catch: java.lang.Throwable -> L73
            if (r2 != r1) goto L5a
            return r1
        L73:
            r5 = move-exception
            goto L81
        L75:
            java.util.stream.Stream<T> r5 = r6.stream
            r5.close()
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L7d:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L81:
            java.util.stream.Stream<T> r6 = r6.stream
            r6.close()
            throw r5
        L87:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Stream.consumeAsFlow can be collected only once"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.stream.StreamFlow.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
