package com.adif.elcanomovil.domain.repositories.stations;

import com.adif.elcanomovil.domain.entities.MapRegion;
import com.adif.elcanomovil.domain.entities.station.RequestedStationInfo;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ6\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00040\u0003H&J\u000e\u0010\u0015\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0013J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001d\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0002\u0010\u0016¨\u0006 "}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;", "", RemoteConfigComponent.FETCH_FILE_NAME, "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "shouldFetch", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchForRegion", "mapRegion", "Lcom/adif/elcanomovil/domain/entities/MapRegion;", "(Lcom/adif/elcanomovil/domain/entities/MapRegion;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchOneStation", "Lcom/adif/elcanomovil/domain/entities/station/RequestedStationInfo;", "stationCode", "", "fetchStation", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentOneStation", "getLastVisitedStation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "homeStation", "saveHomeStation", "", "station", "saveWorkStation", "searchStation", "searchText", "setLastVisitedStation", "workStation", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StationsRepository {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object fetch$default(StationsRepository stationsRepository, boolean z3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i & 1) != 0) {
                z3 = false;
            }
            return stationsRepository.fetch(z3, continuation);
        }

        public static /* synthetic */ Object fetchForRegion$default(StationsRepository stationsRepository, MapRegion mapRegion, boolean z3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchForRegion");
            }
            if ((i & 1) != 0) {
                mapRegion = null;
            }
            if ((i & 2) != 0) {
                z3 = true;
            }
            return stationsRepository.fetchForRegion(mapRegion, z3, continuation);
        }
    }

    Object fetch(boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<Station>>>> continuation);

    Object fetchForRegion(MapRegion mapRegion, boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<Station>>>> continuation);

    Flow<AsyncResult<RequestedStationInfo>> fetchOneStation(String stationCode);

    Object fetchStation(String str, Continuation<? super Station> continuation);

    Flow<AsyncResult<RequestedStationInfo>> getCurrentOneStation();

    Object getLastVisitedStation(Continuation<? super String> continuation);

    Object homeStation(Continuation<? super Station> continuation);

    Object saveHomeStation(String str, Continuation<? super Unit> continuation);

    Object saveWorkStation(String str, Continuation<? super Unit> continuation);

    Object searchStation(String str, Continuation<? super List<Station>> continuation);

    Object setLastVisitedStation(String str, Continuation<? super Unit> continuation);

    Object workStation(Continuation<? super Station> continuation);
}
