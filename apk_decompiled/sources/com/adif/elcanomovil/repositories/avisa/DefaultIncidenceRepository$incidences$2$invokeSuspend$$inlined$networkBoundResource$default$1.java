package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStation;
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
@DebugMetadata(c = "com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1", f = "DefaultIncidenceRepository.kt", i = {0, 1, 2, 3, 4, 4, 5}, l = {18, 19, 22, 44, 45, 46, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "incidences", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$0"})
@SourceDebugExtension({"SMAP\nNetworkBoundResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n+ 2 DefaultIncidenceRepository.kt\ncom/adif/elcanomovil/repositories/avisa/DefaultIncidenceRepository$incidences$2\n+ 3 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$2\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,40:1\n68#2,2:41\n76#2:44\n87#2,2:45\n90#2:51\n79#2,5:57\n16#3:43\n1549#4:47\n1620#4,3:48\n53#5:52\n55#5:56\n53#5:62\n55#5:66\n53#5:67\n55#5:71\n53#5:72\n55#5:76\n50#6:53\n55#6:55\n50#6:63\n55#6:65\n50#6:68\n55#6:70\n50#6:73\n55#6:75\n109#7:54\n109#7:64\n109#7:69\n109#7:74\n*S KotlinDebug\n*F\n+ 1 DefaultIncidenceRepository.kt\ncom/adif/elcanomovil/repositories/avisa/DefaultIncidenceRepository$incidences$2\n+ 2 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n88#1:47\n88#1:48,3\n26#2:52\n26#2:56\n29#2:62\n29#2:66\n31#2:67\n31#2:71\n35#2:72\n35#2:76\n26#2:53\n26#2:55\n29#2:63\n29#2:65\n31#2:68\n31#2:70\n35#2:73\n35#2:75\n26#2:54\n29#2:64\n31#2:69\n35#2:74\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1 extends SuspendLambda implements Function2<FlowCollector<? super AsyncResult<? extends List<? extends IncidenceStation>>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultIncidenceRepository this$0;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$2"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,115:1\n51#2,5:116\n*E\n"})
    /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 implements Flow<AsyncResult<? extends List<? extends IncidenceStation>>> {
        final /* synthetic */ Flow $this_unsafeTransform$inlined;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$2$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n1#1,222:1\n54#2:223\n29#3:224\n*E\n"})
        /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00092<T> implements FlowCollector {
            final /* synthetic */ FlowCollector $this_unsafeFlow;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$2$2", f = "DefaultIncidenceRepository.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$2$2$1, reason: invalid class name */
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
                    return C00092.this.emit(null, this);
                }
            }

            public C00092(FlowCollector flowCollector) {
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
                    boolean r0 = r6 instanceof com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1.AnonymousClass2.C00092.AnonymousClass1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$2$2$1 r0 = (com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1.AnonymousClass2.C00092.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$2$2$1 r0 = new com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$2$2$1
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
                throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1.AnonymousClass2.C00092.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public AnonymousClass2(Flow flow) {
            this.$this_unsafeTransform$inlined = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super AsyncResult<? extends List<? extends IncidenceStation>>> flowCollector, Continuation continuation) {
            Object collect = this.$this_unsafeTransform$inlined.collect(new C00092(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$4"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,115:1\n51#2,5:116\n*E\n"})
    /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 implements Flow<AsyncResult<? extends List<? extends IncidenceStation>>> {
        final /* synthetic */ Flow $this_unsafeTransform$inlined;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$4$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n1#1,222:1\n54#2:223\n35#3:224\n*E\n"})
        /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$4$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2<T> implements FlowCollector {
            final /* synthetic */ FlowCollector $this_unsafeFlow;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$4$2", f = "DefaultIncidenceRepository.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$4$2$1, reason: invalid class name */
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

            public AnonymousClass2(FlowCollector flowCollector) {
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
                    boolean r0 = r6 instanceof com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1.AnonymousClass4.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$4$2$1 r0 = (com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1.AnonymousClass4.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$4$2$1 r0 = new com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1$4$2$1
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
                throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1.AnonymousClass4.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public AnonymousClass4(Flow flow) {
            this.$this_unsafeTransform$inlined = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super AsyncResult<? extends List<? extends IncidenceStation>>> flowCollector, Continuation continuation) {
            Object collect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1(Continuation continuation, DefaultIncidenceRepository defaultIncidenceRepository, DefaultIncidenceRepository defaultIncidenceRepository2, DefaultIncidenceRepository defaultIncidenceRepository3) {
        super(2, continuation);
        this.this$0 = defaultIncidenceRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultIncidenceRepository defaultIncidenceRepository = this.this$0;
        DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1 defaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1 = new DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1(continuation, defaultIncidenceRepository, defaultIncidenceRepository, defaultIncidenceRepository);
        defaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1.L$0 = obj;
        return defaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x017c, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r5, r9) != r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
    
        if (r10 != r0) goto L30;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3 A[Catch: all -> 0x0032, LOOP:0: B:21:0x00ed->B:23:0x00f3, LOOP_END, TryCatch #0 {all -> 0x0032, blocks: (B:19:0x002d, B:20:0x00d8, B:21:0x00ed, B:23:0x00f3, B:25:0x0107), top: B:18:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v32 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AsyncResult<? extends List<? extends IncidenceStation>>> flowCollector, Continuation<? super Unit> continuation) {
        return ((DefaultIncidenceRepository$incidences$2$invokeSuspend$$inlined$networkBoundResource$default$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
