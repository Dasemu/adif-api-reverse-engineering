package l1;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteTrainUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SaveFavoriteTrainUseCase f7353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f7357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f7358g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f7359j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SaveFavoriteTrainUseCase saveFavoriteTrainUseCase, String str, String str2, String str3, Long l4, String str4, String str5, String str6, String str7, Continuation continuation) {
        super(2, continuation);
        this.f7353b = saveFavoriteTrainUseCase;
        this.f7354c = str;
        this.f7355d = str2;
        this.f7356e = str3;
        this.f7357f = l4;
        this.f7358g = str4;
        this.h = str5;
        this.i = str6;
        this.f7359j = str7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f7353b, this.f7354c, this.f7355d, this.f7356e, this.f7357f, this.f7358g, this.h, this.i, this.f7359j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavoritesRepository favoritesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7352a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            favoritesRepository = this.f7353b.favoritesRepository;
            this.f7352a = 1;
            if (favoritesRepository.insertFavouriteTrain(this.f7354c, this.f7355d, this.f7356e, this.f7357f, this.f7358g, this.h, this.i, this.f7359j, this) == coroutine_suspended) {
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
