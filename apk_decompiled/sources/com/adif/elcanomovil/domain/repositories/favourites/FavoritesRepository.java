package com.adif.elcanomovil.domain.repositories.favourites;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.DataType;
import com.adif.elcanomovil.domain.entities.FavouriteStation;
import com.adif.elcanomovil.domain.entities.FavouriteTrain;
import com.adif.elcanomovil.domain.entities.StationFavourites;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\nJ2\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H¦@¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H¦@¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00150\u0014H¦@¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00150\u0014H¦@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u001dJ2\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u0004\u0018\u00010\u00182\u0006\u0010\f\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u001dJ^\u0010!\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\u00072\b\u0010&\u001a\u0004\u0018\u00010\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010(JN\u0010)\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010,\u001a\u0004\u0018\u00010\u0011H¦@¢\u0006\u0002\u0010-J,\u0010.\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\nJ`\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0003000\u00142\b\u00101\u001a\u0004\u0018\u00010\u00072\b\u00102\u001a\u0004\u0018\u00010\u00072\b\u00103\u001a\u0004\u0018\u00010\u00072\b\u00104\u001a\u0004\u0018\u00010\u00072\b\u00105\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u00107\u001a\u00020\u0011H¦@¢\u0006\u0002\u00108¨\u00069"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavouriteTrain", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteStation", "stationCode", "type", "Lcom/adif/elcanomovil/domain/entities/DataType;", "stationToCode", "isCercanias", "", "(Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/DataType;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAllFavoritesStations", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/adif/elcanomovil/domain/entities/FavouriteStation;", "fetchAllStations", "Lcom/adif/elcanomovil/domain/entities/StationFavourites;", "fetchAllTrains", "Lcom/adif/elcanomovil/domain/entities/FavouriteTrain;", "fetchFavouriteStation", "idFavourite", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFavouriteTimetable", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/DataType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchStation", "insertFavouriteTrain", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "timeStationFrom", "timeStationTo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertStation", "satationName", "stationToName", "isRodalies", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/DataType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavouriteTrain", "mute", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "stationId", "destinationId", "msgStart", "msgEnd", "repeat", "trainId", "shouldFetch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FavoritesRepository {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object mute$default(FavoritesRepository favoritesRepository, String str, String str2, String str3, String str4, String str5, String str6, boolean z3, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return favoritesRepository.mute(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? true : z3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mute");
        }
    }

    Object deleteAll(Continuation<? super Unit> continuation);

    Object deleteFavouriteTrain(String str, String str2, String str3, Continuation<? super Unit> continuation);

    Object deleteStation(String str, DataType dataType, String str2, Boolean bool, Continuation<? super Unit> continuation);

    Object fetchAllFavoritesStations(Continuation<? super Flow<? extends List<FavouriteStation>>> continuation);

    Object fetchAllStations(Continuation<? super Flow<? extends List<StationFavourites>>> continuation);

    Object fetchAllTrains(Continuation<? super Flow<? extends List<FavouriteTrain>>> continuation);

    Object fetchFavouriteStation(String str, Continuation<? super FavouriteStation> continuation);

    Object fetchFavouriteTimetable(String str, String str2, DataType dataType, boolean z3, Continuation<? super FavouriteStation> continuation);

    Object fetchStation(String str, Continuation<? super StationFavourites> continuation);

    Object insertFavouriteTrain(String str, String str2, String str3, Long l4, String str4, String str5, String str6, String str7, Continuation<? super Unit> continuation);

    Object insertStation(String str, String str2, DataType dataType, String str3, String str4, Boolean bool, Boolean bool2, Continuation<? super Unit> continuation);

    Object isFavouriteTrain(String str, String str2, String str3, Continuation<? super Boolean> continuation);

    Object mute(String str, String str2, String str3, String str4, String str5, String str6, boolean z3, Continuation<? super Flow<AsyncResult<Unit>>> continuation);
}
