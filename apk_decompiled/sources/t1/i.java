package t1;

import com.adif.elcanomovil.domain.entities.DataType;
import com.adif.elcanomovil.repositories.favourites.DefaultFavoritesRepository;
import com.adif.elcanomovil.serviceStorage.database.FavouritesDao;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultFavoritesRepository f8538c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DataType f8539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f8541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f8542g;
    public final /* synthetic */ Boolean h;
    public final /* synthetic */ Boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, DefaultFavoritesRepository defaultFavoritesRepository, DataType dataType, String str2, String str3, String str4, Boolean bool, Boolean bool2, Continuation continuation) {
        super(2, continuation);
        this.f8537b = str;
        this.f8538c = defaultFavoritesRepository;
        this.f8539d = dataType;
        this.f8540e = str2;
        this.f8541f = str3;
        this.f8542g = str4;
        this.h = bool;
        this.i = bool2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f8537b, this.f8538c, this.f8539d, this.f8540e, this.f8541f, this.f8542g, this.h, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavouritesDao favouritesDao;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8536a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (StringsKt.isBlank(this.f8537b)) {
                return Unit.INSTANCE;
            }
            favouritesDao = this.f8538c.favouritesDao;
            List<FavouriteEntity> listOf = CollectionsKt.listOf(new FavouriteEntity(0, this.f8537b, this.f8540e, this.f8541f, this.f8542g, this.f8539d.name(), this.h, this.i, 1, null));
            this.f8536a = 1;
            if (favouritesDao.insertAll(listOf, this) == coroutine_suspended) {
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
