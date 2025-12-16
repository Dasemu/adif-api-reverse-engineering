package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.AvisaStationCategory;
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
@DebugMetadata(c = "com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1", f = "DefaultAvisaStationsRepository.kt", i = {0, 1, 2, 3}, l = {18, 19, 22, 57, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
@SourceDebugExtension({"SMAP\nNetworkBoundResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n+ 2 DefaultAvisaStationsRepository.kt\ncom/adif/elcanomovil/repositories/avisa/DefaultAvisaStationsRepository$fetchStationCategories$4\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,40:1\n109#2,4:41\n108#2,8:45\n139#2:53\n123#2:54\n122#2,15:55\n137#2:74\n108#2,8:75\n127#2,2:88\n108#2,8:90\n1549#3:70\n1620#3,3:71\n53#4:83\n55#4:87\n53#4:98\n55#4:102\n53#4:103\n55#4:107\n53#4:108\n55#4:112\n50#5:84\n55#5:86\n50#5:99\n55#5:101\n50#5:104\n55#5:106\n50#5:109\n55#5:111\n109#6:85\n109#6:100\n109#6:105\n109#6:110\n*S KotlinDebug\n*F\n+ 1 DefaultAvisaStationsRepository.kt\ncom/adif/elcanomovil/repositories/avisa/DefaultAvisaStationsRepository$fetchStationCategories$4\n+ 2 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n136#1:70\n136#1:71,3\n26#2:83\n26#2:87\n29#2:98\n29#2:102\n31#2:103\n31#2:107\n35#2:108\n35#2:112\n26#2:84\n26#2:86\n29#2:99\n29#2:101\n31#2:104\n31#2:106\n35#2:109\n35#2:111\n26#2:85\n29#2:100\n31#2:105\n35#2:110\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1 extends SuspendLambda implements Function2<FlowCollector<? super AsyncResult<? extends List<? extends AvisaStationCategory>>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $stationId$inlined;
    final /* synthetic */ String $stationId$inlined$1;
    final /* synthetic */ String $stationId$inlined$2;
    final /* synthetic */ String $stationId$inlined$3;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultAvisaStationsRepository this$0;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$2"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,115:1\n51#2,5:116\n*E\n"})
    /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 implements Flow<AsyncResult<? extends List<? extends AvisaStationCategory>>> {
        final /* synthetic */ Flow $this_unsafeTransform$inlined;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$2$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n1#1,222:1\n54#2:223\n29#3:224\n*E\n"})
        /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00052<T> implements FlowCollector {
            final /* synthetic */ FlowCollector $this_unsafeFlow;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1$2$2", f = "DefaultAvisaStationsRepository.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1$2$2$1, reason: invalid class name */
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
                    return C00052.this.emit(null, this);
                }
            }

            public C00052(FlowCollector flowCollector) {
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
                    boolean r0 = r6 instanceof com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1.AnonymousClass2.C00052.AnonymousClass1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1$2$2$1 r0 = (com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1.AnonymousClass2.C00052.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1$2$2$1 r0 = new com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1$2$2$1
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
                throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1.AnonymousClass2.C00052.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public AnonymousClass2(Flow flow) {
            this.$this_unsafeTransform$inlined = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super AsyncResult<? extends List<? extends AvisaStationCategory>>> flowCollector, Continuation continuation) {
            Object collect = this.$this_unsafeTransform$inlined.collect(new C00052(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1(Continuation continuation, DefaultAvisaStationsRepository defaultAvisaStationsRepository, String str, DefaultAvisaStationsRepository defaultAvisaStationsRepository2, String str2, DefaultAvisaStationsRepository defaultAvisaStationsRepository3, String str3, DefaultAvisaStationsRepository defaultAvisaStationsRepository4, String str4) {
        super(2, continuation);
        this.this$0 = defaultAvisaStationsRepository;
        this.$stationId$inlined = str;
        this.$stationId$inlined$1 = str2;
        this.$stationId$inlined$2 = str3;
        this.$stationId$inlined$3 = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultAvisaStationsRepository defaultAvisaStationsRepository = this.this$0;
        DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1 defaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1 = new DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1(continuation, defaultAvisaStationsRepository, this.$stationId$inlined, defaultAvisaStationsRepository, this.$stationId$inlined$1, defaultAvisaStationsRepository, this.$stationId$inlined$2, defaultAvisaStationsRepository, this.$stationId$inlined$3);
        defaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1.L$0 = obj;
        return defaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x020f, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll((kotlinx.coroutines.flow.FlowCollector) r1, r3, r11) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009e, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0114 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:16:0x002a, B:17:0x0100, B:19:0x0114, B:20:0x012b, B:21:0x0140, B:23:0x0146, B:25:0x015a, B:27:0x016d, B:28:0x0183, B:33:0x017f, B:35:0x00c5, B:37:0x00d5, B:38:0x00db), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0146 A[Catch: all -> 0x002f, LOOP:0: B:21:0x0140->B:23:0x0146, LOOP_END, TryCatch #0 {all -> 0x002f, blocks: (B:16:0x002a, B:17:0x0100, B:19:0x0114, B:20:0x012b, B:21:0x0140, B:23:0x0146, B:25:0x015a, B:27:0x016d, B:28:0x0183, B:33:0x017f, B:35:0x00c5, B:37:0x00d5, B:38:0x00db), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016d A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:16:0x002a, B:17:0x0100, B:19:0x0114, B:20:0x012b, B:21:0x0140, B:23:0x0146, B:25:0x015a, B:27:0x016d, B:28:0x0183, B:33:0x017f, B:35:0x00c5, B:37:0x00d5, B:38:0x00db), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017f A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:16:0x002a, B:17:0x0100, B:19:0x0114, B:20:0x012b, B:21:0x0140, B:23:0x0146, B:25:0x015a, B:27:0x016d, B:28:0x0183, B:33:0x017f, B:35:0x00c5, B:37:0x00d5, B:38:0x00db), top: B:2:0x000d }] */
    /* JADX WARN: Type inference failed for: r1v18, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v24, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AsyncResult<? extends List<? extends AvisaStationCategory>>> flowCollector, Continuation<? super Unit> continuation) {
        return ((DefaultAvisaStationsRepository$fetchStationCategories$4$invokeSuspend$$inlined$networkBoundResource$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
