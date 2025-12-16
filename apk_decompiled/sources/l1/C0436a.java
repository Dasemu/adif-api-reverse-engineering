package l1;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.GetRelationStationsFavoritesUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetRelationStationsFavoritesUseCase f7315b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0436a(GetRelationStationsFavoritesUseCase getRelationStationsFavoritesUseCase, Continuation continuation) {
        super(2, continuation);
        this.f7315b = getRelationStationsFavoritesUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0436a(this.f7315b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0436a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavoritesRepository favoritesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7314a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        favoritesRepository = this.f7315b.favoritesRepository;
        this.f7314a = 1;
        Object fetchAllFavoritesStations = favoritesRepository.fetchAllFavoritesStations(this);
        return fetchAllFavoritesStations == coroutine_suspended ? coroutine_suspended : fetchAllFavoritesStations;
    }
}
