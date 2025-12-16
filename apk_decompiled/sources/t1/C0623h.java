package t1;

import com.adif.elcanomovil.repositories.favourites.DefaultFavoritesRepository;
import com.adif.elcanomovil.repositories.favourites.FavouritesStationsMapper;
import com.adif.elcanomovil.serviceStorage.database.FavouritesDao;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: t1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultFavoritesRepository f8535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0623h(String str, DefaultFavoritesRepository defaultFavoritesRepository, Continuation continuation) {
        super(2, continuation);
        this.f8534a = str;
        this.f8535b = defaultFavoritesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0623h(this.f8534a, this.f8535b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0623h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavouritesDao favouritesDao;
        FavouritesStationsMapper favouritesStationsMapper;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.f8534a;
        StringsKt.isBlank(str);
        DefaultFavoritesRepository defaultFavoritesRepository = this.f8535b;
        favouritesDao = defaultFavoritesRepository.favouritesDao;
        FavouriteEntity stationFavourite = favouritesDao.getStationFavourite(Integer.parseInt(str));
        if (stationFavourite == null) {
            return null;
        }
        favouritesStationsMapper = defaultFavoritesRepository.favouritesMapper;
        return favouritesStationsMapper.favouriteEntityToDomain(stationFavourite);
    }
}
