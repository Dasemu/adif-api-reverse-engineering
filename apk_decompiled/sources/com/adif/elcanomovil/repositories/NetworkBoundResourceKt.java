package com.adif.elcanomovil.repositories;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aÁ\u0001\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u00062\u001e\b\u0004\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2$\b\u0004\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\f2$\b\u0006\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\f2\u0014\b\u0006\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00100\bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"networkBoundResource", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "ResultType", "RequestType", SearchIntents.EXTRA_QUERY, "Lkotlin/Function0;", RemoteConfigComponent.FETCH_FILE_NAME, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "saveFetchResult", "Lkotlin/Function2;", "", "onFetchFailed", "", "", "shouldFetch", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "repositories_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkBoundResourceKt {
    public static final <ResultType, RequestType> Flow<AsyncResult<ResultType>> networkBoundResource(Function0<? extends Flow<? extends ResultType>> query, Function1<? super Continuation<? super RequestType>, ? extends Object> fetch, Function2<? super RequestType, ? super Continuation<? super Unit>, ? extends Object> saveFetchResult, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> onFetchFailed, Function1<? super ResultType, Boolean> shouldFetch) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(fetch, "fetch");
        Intrinsics.checkNotNullParameter(saveFetchResult, "saveFetchResult");
        Intrinsics.checkNotNullParameter(onFetchFailed, "onFetchFailed");
        Intrinsics.checkNotNullParameter(shouldFetch, "shouldFetch");
        return FlowKt.flow(new NetworkBoundResourceKt$networkBoundResource$3(query, shouldFetch, saveFetchResult, fetch, onFetchFailed, null));
    }

    public static /* synthetic */ Flow networkBoundResource$default(Function0 query, Function1 fetch, Function2 saveFetchResult, Function2 function2, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = new NetworkBoundResourceKt$networkBoundResource$1(null);
        }
        Function2 onFetchFailed = function2;
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: com.adif.elcanomovil.repositories.NetworkBoundResourceKt$networkBoundResource$2
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj2) {
                    return Boolean.TRUE;
                }
            };
        }
        Function1 shouldFetch = function1;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(fetch, "fetch");
        Intrinsics.checkNotNullParameter(saveFetchResult, "saveFetchResult");
        Intrinsics.checkNotNullParameter(onFetchFailed, "onFetchFailed");
        Intrinsics.checkNotNullParameter(shouldFetch, "shouldFetch");
        return FlowKt.flow(new NetworkBoundResourceKt$networkBoundResource$3(query, shouldFetch, saveFetchResult, fetch, onFetchFailed, null));
    }
}
