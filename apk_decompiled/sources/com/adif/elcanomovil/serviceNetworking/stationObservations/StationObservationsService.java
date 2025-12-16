package com.adif.elcanomovil.serviceNetworking.stationObservations;

import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.adif.elcanomovil.serviceNetworking.stationObservations.model.StationObservationsRequest;
import com.adif.elcanomovil.serviceNetworking.stationObservations.model.StationObservationsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stationObservations/StationObservationsService;", "", "stationObservations", "Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/StationObservationsResponse;", "stationCodes", "Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/StationObservationsRequest;", "(Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/StationObservationsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StationObservationsService {
    @Headers({ServicePaths.Headers.contentType, ServicePaths.Headers.apiManagerUserKeyStations})
    @POST(ServicePaths.StationObservationsService.observations)
    Object stationObservations(@Body StationObservationsRequest stationObservationsRequest, Continuation<? super StationObservationsResponse> continuation);
}
