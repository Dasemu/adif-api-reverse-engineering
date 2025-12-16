package com.adif.elcanomovil.serviceStorage.database;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import com.adif.elcanomovil.serviceStorage.model.FavouriteTrainEntity;
import com.adif.elcanomovil.serviceStorage.model.StationFavouritesEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ&\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\u000fJ&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H'J(\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00172\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH'J\"\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH'J,\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH'J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u0007H'J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00170\u0016H'J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00170\u0016H'J\u001c\u0010#\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H§@¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\u00020\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H§@¢\u0006\u0002\u0010%¨\u0006("}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/database/FavouritesDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavouriteRouteType", "stationCode", "", "stationToCode", "isCercanias", "", "type", "", "(IIZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavouriteStationType", "(IZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavouriteTrain", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;", "getFavouriteTrain", "Lcom/adif/elcanomovil/serviceStorage/model/FavouriteTrainEntity;", "getFavouritesDeparturesOrArrivals", "getFavouritesRoute", "getStationFavourite", "favouriteId", "getStationFavourites", "Lcom/adif/elcanomovil/serviceStorage/model/StationFavouritesEntity;", "getStationsFavourites", "getTrainsFavourites", "insertAll", "favourites", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFavouriteTrains", "trainEntities", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FavouritesDao {
    Object deleteAll(Continuation<? super Unit> continuation);

    Object deleteFavouriteRouteType(int i, int i4, boolean z3, String str, Continuation<? super Unit> continuation);

    Object deleteFavouriteStationType(int i, boolean z3, String str, Continuation<? super Unit> continuation);

    Object deleteFavouriteTrain(String str, String str2, String str3, Continuation<? super Unit> continuation);

    Flow<List<FavouriteEntity>> getAll();

    List<FavouriteTrainEntity> getFavouriteTrain(String commercialNumber, String originStationCode, String destinationStationCode);

    FavouriteEntity getFavouritesDeparturesOrArrivals(String stationCode, String type, boolean isCercanias);

    FavouriteEntity getFavouritesRoute(String stationCode, String stationToCode, String type, boolean isCercanias);

    FavouriteEntity getStationFavourite(int favouriteId);

    StationFavouritesEntity getStationFavourites(int stationCode);

    Flow<List<StationFavouritesEntity>> getStationsFavourites();

    Flow<List<FavouriteTrainEntity>> getTrainsFavourites();

    Object insertAll(List<FavouriteEntity> list, Continuation<? super Unit> continuation);

    Object insertFavouriteTrains(List<FavouriteTrainEntity> list, Continuation<? super Unit> continuation);
}
