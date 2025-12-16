package l1;

import com.adif.elcanomovil.domain.entities.DataType;
import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteStationUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SaveFavoriteStationUseCase f7346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7347c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DataType f7349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f7350f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f7351g;
    public final /* synthetic */ Boolean h;
    public final /* synthetic */ Boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SaveFavoriteStationUseCase saveFavoriteStationUseCase, String str, String str2, DataType dataType, String str3, String str4, Boolean bool, Boolean bool2, Continuation continuation) {
        super(2, continuation);
        this.f7346b = saveFavoriteStationUseCase;
        this.f7347c = str;
        this.f7348d = str2;
        this.f7349e = dataType;
        this.f7350f = str3;
        this.f7351g = str4;
        this.h = bool;
        this.i = bool2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f7346b, this.f7347c, this.f7348d, this.f7349e, this.f7350f, this.f7351g, this.h, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavoritesRepository favoritesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7345a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            favoritesRepository = this.f7346b.favoritesRepository;
            this.f7345a = 1;
            if (favoritesRepository.insertStation(this.f7347c, this.f7348d, this.f7349e, this.f7350f, this.f7351g, this.h, this.i, this) == coroutine_suspended) {
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
