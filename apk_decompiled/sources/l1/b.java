package l1;

import com.adif.elcanomovil.domain.entities.DataType;
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
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetStationIsFavoriteUseCase f7317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7318c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DataType f7320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f7321f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GetStationIsFavoriteUseCase getStationIsFavoriteUseCase, String str, String str2, DataType dataType, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f7317b = getStationIsFavoriteUseCase;
        this.f7318c = str;
        this.f7319d = str2;
        this.f7320e = dataType;
        this.f7321f = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f7317b, this.f7318c, this.f7319d, this.f7320e, this.f7321f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavoritesRepository favoritesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7316a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            favoritesRepository = this.f7317b.favoritesRepository;
            this.f7316a = 1;
            obj = favoritesRepository.fetchFavouriteTimetable(this.f7318c, this.f7319d, this.f7320e, this.f7321f, this);
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
