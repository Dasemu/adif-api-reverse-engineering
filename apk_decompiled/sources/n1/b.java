package n1;

import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentTrainSearchesUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetRecentTrainSearchesUseCase f7850b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GetRecentTrainSearchesUseCase getRecentTrainSearchesUseCase, Continuation continuation) {
        super(2, continuation);
        this.f7850b = getRecentTrainSearchesUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f7850b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchesRepository searchesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7849a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        searchesRepository = this.f7850b.searchesRepository;
        this.f7849a = 1;
        Object fetchTrainsSelected = searchesRepository.fetchTrainsSelected(this);
        return fetchTrainsSelected == coroutine_suspended ? coroutine_suspended : fetchTrainsSelected;
    }
}
