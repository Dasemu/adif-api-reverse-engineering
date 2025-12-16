package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStation;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
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
@DebugMetadata(c = "com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1", f = "DefaultIncidenceRepository.kt", i = {0, 1, 2, 3, 4}, l = {18, 19, 22, 49, 59, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
@SourceDebugExtension({"SMAP\nNetworkBoundResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n+ 2 DefaultIncidenceRepository.kt\ncom/adif/elcanomovil/repositories/avisa/DefaultIncidenceRepository$incidenceDetails$2\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$2\n*L\n1#1,40:1\n98#2,2:41\n102#2,16:49\n53#3:43\n55#3:47\n53#3:65\n55#3:69\n55#3:71\n53#3:72\n55#3:76\n55#3:78\n53#3:79\n55#3:83\n55#3:85\n53#3:86\n55#3:90\n50#4:44\n55#4:46\n50#4:66\n55#4:68\n55#4:70\n50#4:73\n55#4:75\n55#4:77\n50#4:80\n55#4:82\n55#4:84\n50#4:87\n55#4:89\n109#5:45\n109#5:67\n109#5:74\n109#5:81\n109#5:88\n16#6:48\n*S KotlinDebug\n*F\n+ 1 DefaultIncidenceRepository.kt\ncom/adif/elcanomovil/repositories/avisa/DefaultIncidenceRepository$incidenceDetails$2\n+ 2 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n99#1:43\n99#1:47\n99#1:71\n99#1:78\n99#1:85\n99#1:44\n99#1:46\n99#1:70\n99#1:77\n99#1:84\n99#1:45\n26#2:65\n26#2:69\n29#2:72\n29#2:76\n31#2:79\n31#2:83\n35#2:86\n35#2:90\n26#2:66\n26#2:68\n29#2:73\n29#2:75\n31#2:80\n31#2:82\n35#2:87\n35#2:89\n26#2:67\n29#2:74\n31#2:81\n35#2:88\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1 extends SuspendLambda implements Function2<FlowCollector<? super AsyncResult<? extends IncidenceStation>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $incidenceId$inlined;
    final /* synthetic */ int $incidenceId$inlined$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultIncidenceRepository this$0;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$2"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,115:1\n51#2,5:116\n*E\n"})
    /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 implements Flow<AsyncResult<? extends IncidenceStation>> {
        final /* synthetic */ Flow $this_unsafeTransform$inlined;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$2$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n1#1,222:1\n54#2:223\n29#3:224\n*E\n"})
        /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00072<T> implements FlowCollector {
            final /* synthetic */ FlowCollector $this_unsafeFlow;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$2$2", f = "DefaultIncidenceRepository.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$2$2$1, reason: invalid class name */
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
                    return C00072.this.emit(null, this);
                }
            }

            public C00072(FlowCollector flowCollector) {
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
                    boolean r0 = r6 instanceof com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1.AnonymousClass2.C00072.AnonymousClass1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$2$2$1 r0 = (com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1.AnonymousClass2.C00072.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$2$2$1 r0 = new com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$2$2$1
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
                throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1.AnonymousClass2.C00072.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public AnonymousClass2(Flow flow) {
            this.$this_unsafeTransform$inlined = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super AsyncResult<? extends IncidenceStation>> flowCollector, Continuation continuation) {
            Object collect = this.$this_unsafeTransform$inlined.collect(new C00072(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$4"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,115:1\n51#2,5:116\n*E\n"})
    /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 implements Flow<AsyncResult<? extends IncidenceStation>> {
        final /* synthetic */ Flow $this_unsafeTransform$inlined;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$4$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n1#1,222:1\n54#2:223\n35#3:224\n*E\n"})
        /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$4$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2<T> implements FlowCollector {
            final /* synthetic */ FlowCollector $this_unsafeFlow;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$4$2", f = "DefaultIncidenceRepository.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$4$2$1, reason: invalid class name */
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
                    boolean r0 = r6 instanceof com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1.AnonymousClass4.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$4$2$1 r0 = (com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1.AnonymousClass4.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$4$2$1 r0 = new com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1$4$2$1
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
                throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1.AnonymousClass4.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public AnonymousClass4(Flow flow) {
            this.$this_unsafeTransform$inlined = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super AsyncResult<? extends IncidenceStation>> flowCollector, Continuation continuation) {
            Object collect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1(Continuation continuation, DefaultIncidenceRepository defaultIncidenceRepository, int i, DefaultIncidenceRepository defaultIncidenceRepository2, DefaultIncidenceRepository defaultIncidenceRepository3, int i4) {
        super(2, continuation);
        this.this$0 = defaultIncidenceRepository;
        this.$incidenceId$inlined = i;
        this.$incidenceId$inlined$1 = i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultIncidenceRepository defaultIncidenceRepository = this.this$0;
        DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1 defaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1 = new DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1(continuation, defaultIncidenceRepository, this.$incidenceId$inlined, defaultIncidenceRepository, defaultIncidenceRepository, this.$incidenceId$inlined$1);
        defaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1.L$0 = obj;
        return defaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0108, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll((kotlinx.coroutines.flow.FlowCollector) r1, r7, r6) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r7 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r7 != r0) goto L25;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v21, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AsyncResult<? extends IncidenceStation>> flowCollector, Continuation<? super Unit> continuation) {
        return ((DefaultIncidenceRepository$incidenceDetails$2$invokeSuspend$$inlined$networkBoundResource$default$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
