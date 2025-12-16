package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BB\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0002\u0010\nJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0096A¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u0010R7\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "action", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSubscription", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,426:1\n329#2:427\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n417#1:427\n*E\n"})
/* loaded from: classes3.dex */
public final class SubscribedFlowCollector<T> implements FlowCollector<T> {
    private final Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> action;
    private final FlowCollector<T> collector;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(FlowCollector<? super T> flowCollector, Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.collector = flowCollector;
        this.action = function2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t2, Continuation<? super Unit> continuation) {
        return this.collector.emit(t2, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r7).onSubscription(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onSubscription(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L40
            goto L61
        L40:
            r8 = move-exception
            goto L84
        L42:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.flow.internal.SafeCollector r8 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlinx.coroutines.flow.FlowCollector<T> r2 = r7.collector
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r8.<init>(r2, r5)
            kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r7.action     // Catch: java.lang.Throwable -> L80
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L80
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L80
            r0.label = r4     // Catch: java.lang.Throwable -> L80
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L80
            if (r2 != r1) goto L5f
            goto L79
        L5f:
            r2 = r7
            r7 = r8
        L61:
            r7.releaseIntercepted()
            kotlinx.coroutines.flow.FlowCollector<T> r7 = r2.collector
            boolean r8 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector
            if (r8 == 0) goto L7d
            kotlinx.coroutines.flow.SubscribedFlowCollector r7 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r7
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r7 = r7.onSubscription(r0)
            if (r7 != r1) goto L7a
        L79:
            return r1
        L7a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L7d:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L80:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L84:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector.onSubscription(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
