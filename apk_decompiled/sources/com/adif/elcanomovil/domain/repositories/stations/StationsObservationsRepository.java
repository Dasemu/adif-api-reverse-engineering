package com.adif.elcanomovil.domain.repositories.stations;

import com.adif.elcanomovil.domain.entities.stationObservations.StationObservation;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H¦@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/stations/StationsObservationsRepository;", "", "observations", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/stationObservations/StationObservation;", "stations", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StationsObservationsRepository {
    Object observations(List<String> list, Continuation<? super Flow<? extends AsyncResult<? extends List<StationObservation>>>> continuation);
}
