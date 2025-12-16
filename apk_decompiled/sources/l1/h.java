package l1;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteTrainUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RemoveFavoriteTrainUseCase f7341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7342c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RemoveFavoriteTrainUseCase removeFavoriteTrainUseCase, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f7341b = removeFavoriteTrainUseCase;
        this.f7342c = str;
        this.f7343d = str2;
        this.f7344e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f7341b, this.f7342c, this.f7343d, this.f7344e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavoritesRepository favoritesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7340a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            favoritesRepository = this.f7341b.favoritesRepository;
            this.f7340a = 1;
            if (favoritesRepository.deleteFavouriteTrain(this.f7342c, this.f7343d, this.f7344e, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
