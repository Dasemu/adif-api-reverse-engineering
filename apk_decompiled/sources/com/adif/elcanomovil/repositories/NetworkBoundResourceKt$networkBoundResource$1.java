package com.adif.elcanomovil.repositories;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "ResultType", "RequestType", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$1", f = "NetworkBoundResource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nNetworkBoundResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkBoundResource.kt\ncom/adif/elcanomovil/repositories/NetworkBoundResourceKt$networkBoundResource$1\n*L\n1#1,40:1\n*E\n"})
/* loaded from: classes.dex */
public final class NetworkBoundResourceKt$networkBoundResource$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
    int label;

    public NetworkBoundResourceKt$networkBoundResource$1(Continuation<? super NetworkBoundResourceKt$networkBoundResource$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkBoundResourceKt$networkBoundResource$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(false);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Boolean> continuation) {
        return ((NetworkBoundResourceKt$networkBoundResource$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
