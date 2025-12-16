package com.adif.elcanomovil.repositories;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [ResultType] */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1"}, k = 1, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,115:1\n51#2,5:116\n*E\n"})
/* loaded from: classes.dex */
public final class NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3<ResultType> implements Flow<AsyncResult<? extends ResultType>> {
    final /* synthetic */ Flow $this_unsafeTransform$inlined;
    final /* synthetic */ Throwable $throwable$inlined;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n1#1,222:1\n54#2:223\n31#3:224\n*E\n"})
    /* renamed from: com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $this_unsafeFlow;
        final /* synthetic */ Throwable $throwable$inlined;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
        @DebugMetadata(c = "com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3$2", f = "NetworkBoundResource.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
        /* renamed from: com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= IntCompanionObject.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, Throwable th) {
            this.$this_unsafeFlow = flowCollector;
            this.$throwable$inlined = th;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r6
                com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3$2$1 r0 = (com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3$2$1 r0 = new com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3$2$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.throwOnFailure(r6)
                goto L47
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.ResultKt.throwOnFailure(r6)
                kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r2 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE
                java.lang.Throwable r4 = r4.$throwable$inlined
                com.adif.elcanomovil.domain.entities.utils.AsyncResult r4 = r2.error(r4, r5)
                r0.label = r3
                java.lang.Object r4 = r6.emit(r4, r0)
                if (r4 != r1) goto L47
                return r1
            L47:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final Object emit$$forInline(Object obj, Continuation continuation) {
            InlineMarker.mark(4);
            new AnonymousClass1(continuation);
            InlineMarker.mark(5);
            FlowCollector flowCollector = this.$this_unsafeFlow;
            AsyncResult<T> error = AsyncResult.INSTANCE.error(this.$throwable$inlined, obj);
            InlineMarker.mark(0);
            flowCollector.emit(error, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    public NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3(Flow flow, Throwable th) {
        this.$this_unsafeTransform$inlined = flow;
        this.$throwable$inlined = th;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(flowCollector, this.$throwable$inlined), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public Object collect$$forInline(FlowCollector flowCollector, Continuation continuation) {
        InlineMarker.mark(4);
        new ContinuationImpl(continuation) { // from class: com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= IntCompanionObject.MIN_VALUE;
                return NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3.this.collect(null, this);
            }
        };
        InlineMarker.mark(5);
        Flow flow = this.$this_unsafeTransform$inlined;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(flowCollector, this.$throwable$inlined);
        InlineMarker.mark(0);
        flow.collect(anonymousClass2, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}
