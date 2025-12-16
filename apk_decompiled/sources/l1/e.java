package l1;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.GetTrainIsFavoriteUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetTrainIsFavoriteUseCase f7328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7329c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GetTrainIsFavoriteUseCase getTrainIsFavoriteUseCase, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f7328b = getTrainIsFavoriteUseCase;
        this.f7329c = str;
        this.f7330d = str2;
        this.f7331e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f7328b, this.f7329c, this.f7330d, this.f7331e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavoritesRepository favoritesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7327a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        favoritesRepository = this.f7328b.favoritesRepository;
        this.f7327a = 1;
        Object isFavouriteTrain = favoritesRepository.isFavouriteTrain(this.f7329c, this.f7330d, this.f7331e, this);
        return isFavouriteTrain == coroutine_suspended ? coroutine_suspended : isFavouriteTrain;
    }
}
