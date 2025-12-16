package com.adif.elcanomovil.repositories.favourites;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.DataType;
import com.adif.elcanomovil.domain.entities.FavouriteStation;
import com.adif.elcanomovil.domain.entities.FavouriteTrain;
import com.adif.elcanomovil.domain.entities.StationFavourites;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepositoryKt;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.adif.elcanomovil.serviceNetworking.subscriptions.SubscriptionsService;
import com.adif.elcanomovil.serviceStorage.database.FavouritesDao;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import com.adif.elcanomovil.serviceStorage.model.FavouriteTrainEntity;
import com.adif.elcanomovil.serviceStorage.model.StationFavouritesEntity;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import t1.C0616a;
import t1.C0618c;
import t1.C0620e;
import t1.C0622g;
import t1.C0623h;
import t1.i;
import t1.j;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJB\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u000e\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J,\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0002\u0010\u001cJ2\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u000e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096@¢\u0006\u0002\u0010$J\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0&H\u0096@¢\u0006\u0002\u0010\u0017J\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0'0&H\u0096@¢\u0006\u0002\u0010\u0017J\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0'0&H\u0096@¢\u0006\u0002\u0010\u0017J\u0018\u0010-\u001a\u0004\u0018\u00010(2\u0006\u0010.\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010/J2\u00100\u001a\u0004\u0018\u00010(2\u0006\u0010\u001e\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0096@¢\u0006\u0002\u00101J\u0018\u00102\u001a\u0004\u0018\u00010*2\u0006\u0010\u001e\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010/J^\u00103\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u00010\u000e2\b\u00107\u001a\u0004\u0018\u00010\u000e2\b\u00108\u001a\u0004\u0018\u00010\u000e2\b\u00109\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0002\u0010:JN\u0010;\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u000e2\b\u0010=\u001a\u0004\u0018\u00010\u000e2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010>\u001a\u0004\u0018\u00010#H\u0096@¢\u0006\u0002\u0010?J,\u0010@\u001a\u00020#2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0002\u0010\u001cJ^\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0&2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010D\u001a\u0004\u0018\u00010\u000e2\b\u0010E\u001a\u0004\u0018\u00010\u000e2\b\u0010F\u001a\u0004\u0018\u00010\u000e2\b\u0010G\u001a\u0004\u0018\u00010\u000e2\b\u0010H\u001a\u0004\u0018\u00010\u000e2\u0006\u0010I\u001a\u00020#H\u0096@¢\u0006\u0002\u0010JR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/adif/elcanomovil/repositories/favourites/DefaultFavoritesRepository;", "Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;", "favouritesDao", "Lcom/adif/elcanomovil/serviceStorage/database/FavouritesDao;", "favouritesMapper", "Lcom/adif/elcanomovil/repositories/favourites/FavouritesStationsMapper;", "subscriptionsService", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/SubscriptionsService;", "preferenceStorage", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "favouritesTrainMapper", "Lcom/adif/elcanomovil/repositories/favourites/FavouritesTrainsMapper;", "(Lcom/adif/elcanomovil/serviceStorage/database/FavouritesDao;Lcom/adif/elcanomovil/repositories/favourites/FavouritesStationsMapper;Lcom/adif/elcanomovil/serviceNetworking/subscriptions/SubscriptionsService;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Lcom/adif/elcanomovil/repositories/favourites/FavouritesTrainsMapper;)V", "createMuteUrl", "", "stationId", "destId", "start", "end", "repeats", "deviceId", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavouriteTrain", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteStation", "stationCode", "type", "Lcom/adif/elcanomovil/domain/entities/DataType;", "stationToCode", "isCercanias", "", "(Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/DataType;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAllFavoritesStations", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/adif/elcanomovil/domain/entities/FavouriteStation;", "fetchAllStations", "Lcom/adif/elcanomovil/domain/entities/StationFavourites;", "fetchAllTrains", "Lcom/adif/elcanomovil/domain/entities/FavouriteTrain;", "fetchFavouriteStation", "idFavourite", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFavouriteTimetable", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/DataType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchStation", "insertFavouriteTrain", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "timeStationFrom", "timeStationTo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertStation", "stationName", "stationToName", "isRodalies", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/DataType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavouriteTrain", "mute", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "destinationId", "msgStart", "msgEnd", "repeat", "trainId", "shouldFetch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultFavoritesRepository implements FavoritesRepository {
    private final FavouritesDao favouritesDao;
    private final FavouritesStationsMapper favouritesMapper;
    private final FavouritesTrainsMapper favouritesTrainMapper;
    private final PreferenceStorage preferenceStorage;
    private final SubscriptionsService subscriptionsService;

    public DefaultFavoritesRepository(FavouritesDao favouritesDao, FavouritesStationsMapper favouritesMapper, SubscriptionsService subscriptionsService, PreferenceStorage preferenceStorage, FavouritesTrainsMapper favouritesTrainMapper) {
        Intrinsics.checkNotNullParameter(favouritesDao, "favouritesDao");
        Intrinsics.checkNotNullParameter(favouritesMapper, "favouritesMapper");
        Intrinsics.checkNotNullParameter(subscriptionsService, "subscriptionsService");
        Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
        Intrinsics.checkNotNullParameter(favouritesTrainMapper, "favouritesTrainMapper");
        this.favouritesDao = favouritesDao;
        this.favouritesMapper = favouritesMapper;
        this.subscriptionsService = subscriptionsService;
        this.preferenceStorage = preferenceStorage;
        this.favouritesTrainMapper = favouritesTrainMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String createMuteUrl(String stationId, String destId, String start, String end, String repeats, String deviceId) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(DefaultSubscriptionsRepositoryKt.MUTE, Arrays.copyOf(new Object[]{deviceId, DefaultSubscriptionsRepositoryKt.PLATFORM, stationId, destId, start, end, repeats, ServicePaths.SubscriptionsService.subcriptionsMuteEndPath}, 8));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return "https://elcanoweb.adif.es/api/subscriptions/".concat(format);
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object deleteAll(Continuation<? super Unit> continuation) {
        Object deleteAll = this.favouritesDao.deleteAll(continuation);
        return deleteAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteAll : Unit.INSTANCE;
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object deleteFavouriteTrain(String str, String str2, String str3, Continuation<? super Unit> continuation) {
        if (str == null || StringsKt.isBlank(str) || str2 == null || StringsKt.isBlank(str2) || str3 == null || StringsKt.isBlank(str3)) {
            return Unit.INSTANCE;
        }
        Object deleteFavouriteTrain = this.favouritesDao.deleteFavouriteTrain(str, str2, str3, continuation);
        return deleteFavouriteTrain == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteFavouriteTrain : Unit.INSTANCE;
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object deleteStation(String str, DataType dataType, String str2, Boolean bool, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new C0616a(str, dataType, str2, this, bool, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object fetchAllFavoritesStations(Continuation<? super Flow<? extends List<FavouriteStation>>> continuation) {
        Flow flatMapMerge$default;
        flatMapMerge$default = FlowKt__MergeKt.flatMapMerge$default(this.favouritesDao.getAll(), 0, new C0618c(this, null), 1, null);
        return flatMapMerge$default;
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object fetchAllStations(Continuation<? super Flow<? extends List<StationFavourites>>> continuation) {
        Flow flatMapMerge$default;
        flatMapMerge$default = FlowKt__MergeKt.flatMapMerge$default(this.favouritesDao.getStationsFavourites(), 0, new C0620e(this, null), 1, null);
        return flatMapMerge$default;
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object fetchAllTrains(Continuation<? super Flow<? extends List<FavouriteTrain>>> continuation) {
        Flow flatMapMerge$default;
        flatMapMerge$default = FlowKt__MergeKt.flatMapMerge$default(this.favouritesDao.getTrainsFavourites(), 0, new C0622g(this, null), 1, null);
        return flatMapMerge$default;
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object fetchFavouriteStation(String str, Continuation<? super FavouriteStation> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C0623h(str, this, null), continuation);
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object fetchFavouriteTimetable(String str, String str2, DataType dataType, boolean z3, Continuation<? super FavouriteStation> continuation) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        FavouriteEntity favouritesRoute = dataType.equals(DataType.ROUTE) ? this.favouritesDao.getFavouritesRoute(str, str2, dataType.name(), z3) : this.favouritesDao.getFavouritesDeparturesOrArrivals(str, dataType.name(), z3);
        FavouritesStationsMapper favouritesStationsMapper = this.favouritesMapper;
        if (favouritesRoute == null) {
            return null;
        }
        return favouritesStationsMapper.favouriteEntityToDomain(favouritesRoute);
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object fetchStation(String str, Continuation<? super StationFavourites> continuation) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        FavouritesStationsMapper favouritesStationsMapper = this.favouritesMapper;
        StationFavouritesEntity stationFavourites = this.favouritesDao.getStationFavourites(Integer.parseInt(str));
        if (stationFavourites == null) {
            return null;
        }
        return favouritesStationsMapper.entityToDomain(stationFavourites);
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object insertFavouriteTrain(String str, String str2, String str3, Long l4, String str4, String str5, String str6, String str7, Continuation<? super Unit> continuation) {
        if (str == null || StringsKt.isBlank(str) || str2 == null || StringsKt.isBlank(str2) || str3 == null || StringsKt.isBlank(str3) || l4 == null || str6 == null || str7 == null) {
            return Unit.INSTANCE;
        }
        Object insertFavouriteTrains = this.favouritesDao.insertFavouriteTrains(CollectionsKt.listOf(new FavouriteTrainEntity(str, str2, str3, l4.longValue(), str4, str5, str6, str7)), continuation);
        return insertFavouriteTrains == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? insertFavouriteTrains : Unit.INSTANCE;
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object insertStation(String str, String str2, DataType dataType, String str3, String str4, Boolean bool, Boolean bool2, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new i(str, this, dataType, str2, str3, str4, bool, bool2, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object isFavouriteTrain(String str, String str2, String str3, Continuation<? super Boolean> continuation) {
        boolean z3 = false;
        if (str != null && !StringsKt.isBlank(str) && str2 != null && !StringsKt.isBlank(str2) && str3 != null && !StringsKt.isBlank(str3) && !this.favouritesDao.getFavouriteTrain(str, str2, str3).isEmpty()) {
            z3 = true;
        }
        return Boxing.boxBoolean(z3);
    }

    @Override // com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository
    public Object mute(String str, String str2, String str3, String str4, String str5, String str6, boolean z3, Continuation<? super Flow<AsyncResult>> continuation) {
        return FlowKt.flow(new j(this, str, str2, str3, str4, str5, null));
    }
}
