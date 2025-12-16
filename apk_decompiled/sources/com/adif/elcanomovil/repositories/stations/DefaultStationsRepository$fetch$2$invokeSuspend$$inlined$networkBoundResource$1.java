package com.adif.elcanomovil.repositories.stations;

import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "ResultType", "RequestType", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "com/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.adif.elcanomovil.repositories.stations.DefaultStationsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1", f = "DefaultStationsRepository.kt", i = {0, 1, 2, 3, 4, 5, 5, 5}, l = {18, 19, 22, 44, 53, 48, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "throwable", "throwable"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nNetworkBoundResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n+ 2 DefaultStationsRepository.kt\ncom/adif/elcanomovil/repositories/stations/DefaultStationsRepository$fetch$2\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,40:1\n55#2,2:41\n75#2:43\n63#2,11:44\n53#3:55\n55#3:59\n53#3:60\n55#3:64\n53#3:65\n55#3:69\n53#3:70\n55#3:74\n50#4:56\n55#4:58\n50#4:61\n55#4:63\n50#4:66\n55#4:68\n50#4:71\n55#4:73\n109#5:57\n109#5:62\n109#5:67\n109#5:72\n*S KotlinDebug\n*F\n+ 1 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n26#1:55\n26#1:59\n29#1:60\n29#1:64\n31#1:65\n31#1:69\n35#1:70\n35#1:74\n26#1:56\n26#1:58\n29#1:61\n29#1:63\n31#1:66\n31#1:68\n35#1:71\n35#1:73\n26#1:57\n29#1:62\n31#1:67\n35#1:72\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultStationsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1 extends SuspendLambda implements Function2<FlowCollector<? super AsyncResult<? extends List<? extends Station>>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $shouldFetch$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DefaultStationsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStationsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1(Continuation continuation, DefaultStationsRepository defaultStationsRepository, boolean z3, DefaultStationsRepository defaultStationsRepository2, DefaultStationsRepository defaultStationsRepository3, DefaultStationsRepository defaultStationsRepository4) {
        super(2, continuation);
        this.this$0 = defaultStationsRepository;
        this.$shouldFetch$inlined = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultStationsRepository defaultStationsRepository = this.this$0;
        DefaultStationsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1 defaultStationsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1 = new DefaultStationsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1(continuation, defaultStationsRepository, this.$shouldFetch$inlined, defaultStationsRepository, defaultStationsRepository, defaultStationsRepository);
        defaultStationsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1.L$0 = obj;
        return defaultStationsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0196, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r5, r9) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if (r10 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (r10 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006f, code lost:
    
        if (r10 == r0) goto L54;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.stations.DefaultStationsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AsyncResult<? extends List<? extends Station>>> flowCollector, Continuation<? super Unit> continuation) {
        return ((DefaultStationsRepository$fetch$2$invokeSuspend$$inlined$networkBoundResource$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
