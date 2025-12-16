package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "ResultType", "RequestType", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1", f = "DefaultSubscriptionsRepository.kt", i = {0, 1, 2, 3, 4, 4, 5}, l = {18, 19, 22, 44, 51, 52, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "subscriptionsResponse", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$0"})
@SourceDebugExtension({"SMAP\nNetworkBoundResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n+ 2 DefaultSubscriptionsRepository.kt\ncom/adif/elcanomovil/repositories/subscriptions/DefaultSubscriptionsRepository$fetch$2\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,40:1\n212#2,2:41\n241#2:43\n223#2,9:44\n232#2,5:56\n239#2:62\n226#2,2:68\n1549#3:53\n1620#3,2:54\n1622#3:61\n53#4:63\n55#4:67\n53#4:70\n55#4:74\n53#4:75\n55#4:79\n53#4:80\n55#4:84\n50#5:64\n55#5:66\n50#5:71\n55#5:73\n50#5:76\n55#5:78\n50#5:81\n55#5:83\n109#6:65\n109#6:72\n109#6:77\n109#6:82\n*S KotlinDebug\n*F\n+ 1 DefaultSubscriptionsRepository.kt\ncom/adif/elcanomovil/repositories/subscriptions/DefaultSubscriptionsRepository$fetch$2\n+ 2 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n231#1:53\n231#1:54,2\n231#1:61\n26#2:63\n26#2:67\n29#2:70\n29#2:74\n31#2:75\n31#2:79\n35#2:80\n35#2:84\n26#2:64\n26#2:66\n29#2:71\n29#2:73\n31#2:76\n31#2:78\n35#2:81\n35#2:83\n26#2:65\n29#2:72\n31#2:77\n35#2:82\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1 extends SuspendLambda implements Function2<FlowCollector<? super AsyncResult<? extends List<? extends Subscription>>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $shouldFetch$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultSubscriptionsRepository this$0;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$2"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,115:1\n51#2,5:116\n*E\n"})
    /* renamed from: com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 implements Flow<AsyncResult<? extends List<? extends Subscription>>> {
        final /* synthetic */ Flow $this_unsafeTransform$inlined;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$2$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n1#1,222:1\n54#2:223\n29#3:224\n*E\n"})
        /* renamed from: com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00152<T> implements FlowCollector {
            final /* synthetic */ FlowCollector $this_unsafeFlow;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1$2$2", f = "DefaultSubscriptionsRepository.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1$2$2$1, reason: invalid class name */
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
                    return C00152.this.emit(null, this);
                }
            }

            public C00152(FlowCollector flowCollector) {
                this.$this_unsafeFlow = flowCollector;
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
                    boolean r0 = r6 instanceof com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1.AnonymousClass2.C00152.AnonymousClass1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1$2$2$1 r0 = (com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1.AnonymousClass2.C00152.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1$2$2$1 r0 = new com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1$2$2$1
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L31:
                    kotlin.ResultKt.throwOnFailure(r6)
                    kotlinx.coroutines.flow.FlowCollector r4 = r4.$this_unsafeFlow
                    com.adif.elcanomovil.domain.entities.utils.AsyncResult$Companion r6 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE
                    com.adif.elcanomovil.domain.entities.utils.AsyncResult r5 = r6.success(r5)
                    r0.label = r3
                    java.lang.Object r4 = r4.emit(r5, r0)
                    if (r4 != r1) goto L45
                    return r1
                L45:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1.AnonymousClass2.C00152.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public AnonymousClass2(Flow flow) {
            this.$this_unsafeTransform$inlined = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super AsyncResult<? extends List<? extends Subscription>>> flowCollector, Continuation continuation) {
            Object collect = this.$this_unsafeTransform$inlined.collect(new C00152(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1(Continuation continuation, DefaultSubscriptionsRepository defaultSubscriptionsRepository, boolean z3, DefaultSubscriptionsRepository defaultSubscriptionsRepository2, DefaultSubscriptionsRepository defaultSubscriptionsRepository3) {
        super(2, continuation);
        this.this$0 = defaultSubscriptionsRepository;
        this.$shouldFetch$inlined = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultSubscriptionsRepository defaultSubscriptionsRepository = this.this$0;
        DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1 defaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1 = new DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1(continuation, defaultSubscriptionsRepository, this.$shouldFetch$inlined, defaultSubscriptionsRepository, defaultSubscriptionsRepository);
        defaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1.L$0 = obj;
        return defaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x01bd, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r0, r13, r11) != r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ad, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0093, code lost:
    
        if (r13 != r1) goto L29;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110 A[Catch: all -> 0x0135, TRY_LEAVE, TryCatch #2 {all -> 0x0135, blocks: (B:13:0x0159, B:25:0x00f5, B:26:0x010a, B:28:0x0110, B:31:0x012e, B:35:0x013b, B:39:0x0143, B:45:0x014b, B:51:0x00dd, B:60:0x00d5), top: B:59:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AsyncResult<? extends List<? extends Subscription>>> flowCollector, Continuation<? super Unit> continuation) {
        return ((DefaultSubscriptionsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
