package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {
    final /* synthetic */ Ref.IntRef $consumed;
    final /* synthetic */ int $count;
    final /* synthetic */ FlowCollector<T> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1(Ref.IntRef intRef, int i, FlowCollector<? super T> flowCollector) {
        this.$consumed = intRef;
        this.$count = i;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r5.emit(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r5 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L51
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.$consumed
            int r2 = r7.element
            int r2 = r2 + r4
            r7.element = r2
            int r7 = r5.$count
            if (r2 >= r7) goto L54
            kotlinx.coroutines.flow.FlowCollector<T> r5 = r5.$this_unsafeFlow
            r0.label = r4
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L51
            goto L5e
        L51:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L54:
            kotlinx.coroutines.flow.FlowCollector<T> r5 = r5.$this_unsafeFlow
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt__LimitKt.access$emitAbort$FlowKt__LimitKt(r5, r6, r0)
            if (r5 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
