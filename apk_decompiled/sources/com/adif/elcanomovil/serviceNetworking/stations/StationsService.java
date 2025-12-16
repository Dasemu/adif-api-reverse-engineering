package com.adif.elcanomovil.serviceNetworking.stations;

import com.adif.elcanomovil.serviceNetworking.BuildConfig;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.adif.elcanomovil.serviceNetworking.stations.model.OneStationRequest;
import com.adif.elcanomovil.serviceNetworking.stations.model.StationResponse;
import com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stations/StationsService;", "", "oneStation", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationResponse;", "oneStationRequest", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/OneStationRequest;", "(Lcom/adif/elcanomovil/serviceNetworking/stations/model/OneStationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stations", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationsResponse;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StationsService {
    @Headers({ServicePaths.Headers.contentType, ServicePaths.Headers.apiManagerUserKeyStations})
    @POST(ServicePaths.StationService.stationDetails)
    Object oneStation(@Body OneStationRequest oneStationRequest, Continuation<? super StationResponse> continuation);

    @Headers({ServicePaths.Headers.contentType, ServicePaths.Headers.apiManagerUserKeyStations})
    @GET(BuildConfig.BASE_URL_SUFFIX_STATIONS_CIR)
    Object stations(@Path("token") String str, Continuation<? super StationsResponse> continuation);
}
