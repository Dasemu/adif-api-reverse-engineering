package com.adif.elcanomovil.repositories;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Add missing generic type declarations: [ResultType] */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "ResultType", "RequestType", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;"}, k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$3", f = "NetworkBoundResource.kt", i = {0, 1, 2, 3, 4, 5, 5}, l = {18, 19, 22, 25, 25, 28, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "throwable"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nNetworkBoundResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,40:1\n53#2:41\n55#2:45\n53#2:46\n55#2:50\n53#2:51\n55#2:55\n53#2:56\n55#2:60\n55#2:62\n53#2:63\n55#2:67\n53#2:68\n55#2:72\n53#2:73\n55#2:77\n50#3:42\n55#3:44\n50#3:47\n55#3:49\n50#3:52\n55#3:54\n50#3:57\n55#3:59\n55#3:61\n50#3:64\n55#3:66\n50#3:69\n55#3:71\n50#3:74\n55#3:76\n109#4:43\n109#4:48\n109#4:53\n109#4:58\n109#4:65\n109#4:70\n109#4:75\n*S KotlinDebug\n*F\n+ 1 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$3\n*L\n26#1:41\n26#1:45\n29#1:46\n29#1:50\n31#1:51\n31#1:55\n35#1:56\n35#1:60\n26#1:62\n29#1:63\n29#1:67\n31#1:68\n31#1:72\n35#1:73\n35#1:77\n26#1:42\n26#1:44\n29#1:47\n29#1:49\n31#1:52\n31#1:54\n35#1:57\n35#1:59\n26#1:61\n29#1:64\n29#1:66\n31#1:69\n31#1:71\n35#1:74\n35#1:76\n26#1:43\n29#1:48\n31#1:53\n35#1:58\n29#1:65\n31#1:70\n35#1:75\n*E\n"})
/* loaded from: classes.dex */
public final class NetworkBoundResourceKt$networkBoundResource$3<ResultType> extends SuspendLambda implements Function2<FlowCollector<? super AsyncResult<? extends ResultType>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super RequestType>, Object> $fetch;
    final /* synthetic */ Function2<Throwable, Continuation<? super Boolean>, Object> $onFetchFailed;
    final /* synthetic */ Function0<Flow<ResultType>> $query;
    final /* synthetic */ Function2<RequestType, Continuation<? super Unit>, Object> $saveFetchResult;
    final /* synthetic */ Function1<ResultType, Boolean> $shouldFetch;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NetworkBoundResourceKt$networkBoundResource$3(Function0<? extends Flow<? extends ResultType>> function0, Function1<? super ResultType, Boolean> function1, Function2<? super RequestType, ? super Continuation<? super Unit>, ? extends Object> function2, Function1<? super Continuation<? super RequestType>, ? extends Object> function12, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function22, Continuation<? super NetworkBoundResourceKt$networkBoundResource$3> continuation) {
        super(2, continuation);
        this.$query = function0;
        this.$shouldFetch = function1;
        this.$saveFetchResult = function2;
        this.$fetch = function12;
        this.$onFetchFailed = function22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetworkBoundResourceKt$networkBoundResource$3 networkBoundResourceKt$networkBoundResource$3 = new NetworkBoundResourceKt$networkBoundResource$3(this.$query, this.$shouldFetch, this.$saveFetchResult, this.$fetch, this.$onFetchFailed, continuation);
        networkBoundResourceKt$networkBoundResource$3.L$0 = obj;
        return networkBoundResourceKt$networkBoundResource$3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x012e, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r3, r6) != r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
    
        if (r7 != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        if (r7 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        if (r7 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0070, code lost:
    
        if (r7 == r0) goto L54;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v32 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        Flow networkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$4;
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        AsyncResult.Companion companion = AsyncResult.INSTANCE;
        AsyncResult loading = companion.loading(null);
        InlineMarker.mark(0);
        flowCollector.emit(loading, this);
        InlineMarker.mark(1);
        Flow<ResultType> invoke = this.$query.invoke();
        InlineMarker.mark(0);
        Object first = FlowKt.first(invoke, this);
        InlineMarker.mark(1);
        if (((Boolean) this.$shouldFetch.invoke(first)).booleanValue()) {
            AsyncResult loading2 = companion.loading(first);
            InlineMarker.mark(0);
            flowCollector.emit(loading2, this);
            InlineMarker.mark(1);
            try {
                this.$saveFetchResult.invoke(this.$fetch.invoke(this), this);
                networkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$4 = new NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$1(this.$query.invoke());
            } catch (Throwable th) {
                networkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$4 = ((Boolean) this.$onFetchFailed.invoke(th, this)).booleanValue() ? new NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$2(this.$query.invoke()) : new NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$3(this.$query.invoke(), th);
            }
        } else {
            networkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$4 = new NetworkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$4(this.$query.invoke());
        }
        InlineMarker.mark(0);
        FlowKt.emitAll(flowCollector, networkBoundResourceKt$networkBoundResource$3$invokeSuspend$$inlined$map$4, this);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AsyncResult<? extends ResultType>> flowCollector, Continuation<? super Unit> continuation) {
        return ((NetworkBoundResourceKt$networkBoundResource$3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
