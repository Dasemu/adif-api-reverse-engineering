package l1;

import com.adif.elcanomovil.domain.entities.DataType;
import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteStationUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RemoveFavoriteStationUseCase f7335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7336c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DataType f7337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Boolean f7339f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RemoveFavoriteStationUseCase removeFavoriteStationUseCase, String str, DataType dataType, String str2, Boolean bool, Continuation continuation) {
        super(2, continuation);
        this.f7335b = removeFavoriteStationUseCase;
        this.f7336c = str;
        this.f7337d = dataType;
        this.f7338e = str2;
        this.f7339f = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f7335b, this.f7336c, this.f7337d, this.f7338e, this.f7339f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavoritesRepository favoritesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7334a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            favoritesRepository = this.f7335b.favoritesRepository;
            this.f7334a = 1;
            if (favoritesRepository.deleteStation(this.f7336c, this.f7337d, this.f7338e, this.f7339f, this) == coroutine_suspended) {
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
