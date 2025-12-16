package l1;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.GetStationsFavoritesUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetStationsFavoritesUseCase f7326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GetStationsFavoritesUseCase getStationsFavoritesUseCase, Continuation continuation) {
        super(2, continuation);
        this.f7326b = getStationsFavoritesUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f7326b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavoritesRepository favoritesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7325a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        favoritesRepository = this.f7326b.favoritesRepository;
        this.f7325a = 1;
        Object fetchAllStations = favoritesRepository.fetchAllStations(this);
        return fetchAllStations == coroutine_suspended ? coroutine_suspended : fetchAllStations;
    }
}
