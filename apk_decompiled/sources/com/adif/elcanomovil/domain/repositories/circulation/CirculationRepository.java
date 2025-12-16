package com.adif.elcanomovil.domain.repositories.circulation;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.entities.circulation.CommercialCirculation;
import com.adif.elcanomovil.domain.entities.circulation.CommercialPathRouteSidesInfo;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.entities.utils.SyncResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001/J<\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010\u0019JF\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010\u001bJ<\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010\u0019JH\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00100\u001e0\u00072\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010$J\n\u0010%\u001a\u0004\u0018\u00010&H&J\u0016\u0010'\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010)J\u0012\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010&H&J0\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00100\u001e0\u00072\u0006\u0010 \u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010.R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u00060"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;", "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "", "getDestinationStationCode", "()Ljava/lang/String;", "destinationStationCodeAsFlow", "Lkotlinx/coroutines/flow/Flow;", "getDestinationStationCodeAsFlow", "()Lkotlinx/coroutines/flow/Flow;", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "getOriginStationCode", "originStationCodeAsFlow", "getOriginStationCodeAsFlow", NavArguments.ARG_DYNAMIC_ARRIVALS, "Lcom/adif/elcanomovil/domain/entities/utils/SyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialCirculation;", "stationCode", "isCercanias", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "page", "", "showOnlyCommercialStopType", "", "(Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/TrainType;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "betweenStations", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/TrainType;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", NavArguments.ARG_DYNAMIC_DEPARTURES, "onePaths", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathRouteSidesInfo;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_ALL_CONTROL_POINTS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readTrainTypeRequest", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository$TrainTypeRequest;", "setLastDepartureArrivalStation", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLastDepartureArrivalStationTo", "setLastDepartureTypeTrainIsCercanias", "trainTypeRequest", "severalPaths", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TrainTypeRequest", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CirculationRepository {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository$TrainTypeRequest;", "", "isCercanias", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "circulationType", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "(Lcom/adif/elcanomovil/domain/entities/TrainType;Lcom/adif/elcanomovil/domain/entities/CirculationType;)V", "getCirculationType", "()Lcom/adif/elcanomovil/domain/entities/CirculationType;", "()Lcom/adif/elcanomovil/domain/entities/TrainType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class TrainTypeRequest {
        private final CirculationType circulationType;
        private final TrainType isCercanias;

        public TrainTypeRequest(TrainType isCercanias, CirculationType circulationType) {
            Intrinsics.checkNotNullParameter(isCercanias, "isCercanias");
            Intrinsics.checkNotNullParameter(circulationType, "circulationType");
            this.isCercanias = isCercanias;
            this.circulationType = circulationType;
        }

        public static /* synthetic */ TrainTypeRequest copy$default(TrainTypeRequest trainTypeRequest, TrainType trainType, CirculationType circulationType, int i, Object obj) {
            if ((i & 1) != 0) {
                trainType = trainTypeRequest.isCercanias;
            }
            if ((i & 2) != 0) {
                circulationType = trainTypeRequest.circulationType;
            }
            return trainTypeRequest.copy(trainType, circulationType);
        }

        /* renamed from: component1, reason: from getter */
        public final TrainType getIsCercanias() {
            return this.isCercanias;
        }

        /* renamed from: component2, reason: from getter */
        public final CirculationType getCirculationType() {
            return this.circulationType;
        }

        public final TrainTypeRequest copy(TrainType isCercanias, CirculationType circulationType) {
            Intrinsics.checkNotNullParameter(isCercanias, "isCercanias");
            Intrinsics.checkNotNullParameter(circulationType, "circulationType");
            return new TrainTypeRequest(isCercanias, circulationType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrainTypeRequest)) {
                return false;
            }
            TrainTypeRequest trainTypeRequest = (TrainTypeRequest) other;
            return this.isCercanias == trainTypeRequest.isCercanias && this.circulationType == trainTypeRequest.circulationType;
        }

        public final CirculationType getCirculationType() {
            return this.circulationType;
        }

        public int hashCode() {
            return this.circulationType.hashCode() + (this.isCercanias.hashCode() * 31);
        }

        public final TrainType isCercanias() {
            return this.isCercanias;
        }

        public String toString() {
            return "TrainTypeRequest(isCercanias=" + this.isCercanias + ", circulationType=" + this.circulationType + ')';
        }
    }

    Object arrivals(String str, TrainType trainType, int i, boolean z3, Continuation<? super SyncResult<? extends List<? extends CommercialCirculation>>> continuation);

    Object betweenStations(String str, String str2, TrainType trainType, int i, boolean z3, Continuation<? super SyncResult<? extends List<? extends CommercialCirculation>>> continuation);

    Object departures(String str, TrainType trainType, int i, boolean z3, Continuation<? super SyncResult<? extends List<? extends CommercialCirculation>>> continuation);

    String getDestinationStationCode();

    Flow<String> getDestinationStationCodeAsFlow();

    String getOriginStationCode();

    Flow<String> getOriginStationCodeAsFlow();

    Object onePaths(String str, String str2, String str3, long j4, boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<CommercialPathRouteSidesInfo>>>> continuation);

    TrainTypeRequest readTrainTypeRequest();

    Object setLastDepartureArrivalStation(String str, Continuation<? super Unit> continuation);

    Object setLastDepartureArrivalStationTo(String str, Continuation<? super Unit> continuation);

    void setLastDepartureTypeTrainIsCercanias(TrainTypeRequest trainTypeRequest);

    Object severalPaths(String str, boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<CommercialPathRouteSidesInfo>>>> continuation);
}
