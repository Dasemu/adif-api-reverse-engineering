package l1;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.GetTrainsFavoritesUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetTrainsFavoritesUseCase f7333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(GetTrainsFavoritesUseCase getTrainsFavoritesUseCase, Continuation continuation) {
        super(2, continuation);
        this.f7333b = getTrainsFavoritesUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f7333b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavoritesRepository favoritesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7332a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        favoritesRepository = this.f7333b.favoritesRepository;
        this.f7332a = 1;
        Object fetchAllTrains = favoritesRepository.fetchAllTrains(this);
        return fetchAllTrains == coroutine_suspended ? coroutine_suspended : fetchAllTrains;
    }
}
