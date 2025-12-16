package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,115:1\n147#2,13:116\n160#2,6:130\n329#3:129\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n159#1:129\n*E\n"})
/* loaded from: classes3.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ Function3 $action$inlined;
    final /* synthetic */ Flow $this_onCompletion$inlined;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {117, 124, 131}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,115:1\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= IntCompanionObject.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(Flow flow, Function3 function3) {
        this.$this_onCompletion$inlined = flow;
        this.$action$inlined = function3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        if (r10.collect(r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0054, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        r10 = new kotlinx.coroutines.flow.ThrowingCollector(r9);
        r9 = r9.$action$inlined;
        r0.L$0 = r9;
        r0.L$1 = null;
        r0.label = 2;
        r9 = kotlinx.coroutines.flow.FlowKt__EmittersKt.invokeSafely$FlowKt__EmittersKt(r10, r9, r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L58
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.internal.SafeCollector r8 = (kotlinx.coroutines.flow.internal.SafeCollector) r8
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L34
            goto L8b
        L34:
            r9 = move-exception
            goto L93
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.L$0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto Lab
        L46:
            java.lang.Object r8 = r0.L$1
            r9 = r8
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r8 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) r8
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L53
            goto L6a
        L53:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L97
        L58:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.flow.Flow r10 = r8.$this_onCompletion$inlined     // Catch: java.lang.Throwable -> L53
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L53
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L53
            r0.label = r5     // Catch: java.lang.Throwable -> L53
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L53
            if (r10 != r1) goto L6a
            goto Laa
        L6a:
            kotlinx.coroutines.flow.internal.SafeCollector r10 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r10.<init>(r9, r2)
            kotlin.jvm.functions.Function3 r8 = r8.$action$inlined     // Catch: java.lang.Throwable -> L91
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L91
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L91
            r0.label = r3     // Catch: java.lang.Throwable -> L91
            r9 = 6
            kotlin.jvm.internal.InlineMarker.mark(r9)     // Catch: java.lang.Throwable -> L91
            java.lang.Object r8 = r8.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L91
            r9 = 7
            kotlin.jvm.internal.InlineMarker.mark(r9)     // Catch: java.lang.Throwable -> L91
            if (r8 != r1) goto L8a
            goto Laa
        L8a:
            r8 = r10
        L8b:
            r8.releaseIntercepted()
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L91:
            r9 = move-exception
            r8 = r10
        L93:
            r8.releaseIntercepted()
            throw r9
        L97:
            kotlinx.coroutines.flow.ThrowingCollector r10 = new kotlinx.coroutines.flow.ThrowingCollector
            r10.<init>(r8)
            kotlin.jvm.functions.Function3 r9 = r9.$action$inlined
            r0.L$0 = r8
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt__EmittersKt.access$invokeSafely$FlowKt__EmittersKt(r10, r9, r8, r0)
            if (r9 != r1) goto Lab
        Laa:
            return r1
        Lab:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
