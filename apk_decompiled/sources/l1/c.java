package l1;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.GetStationIsFavoriteUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetStationIsFavoriteUseCase f7323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GetStationIsFavoriteUseCase getStationIsFavoriteUseCase, String str, Continuation continuation) {
        super(2, continuation);
        this.f7323b = getStationIsFavoriteUseCase;
        this.f7324c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f7323b, this.f7324c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavoritesRepository favoritesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7322a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            favoritesRepository = this.f7323b.favoritesRepository;
            this.f7322a = 1;
            obj = favoritesRepository.fetchFavouriteStation(this.f7324c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(obj != null);
    }
}
