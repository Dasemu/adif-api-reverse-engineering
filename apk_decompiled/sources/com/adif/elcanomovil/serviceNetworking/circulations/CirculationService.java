package com.adif.elcanomovil.serviceNetworking.circulations;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.adif.elcanomovil.serviceNetworking.circulations.model.request.OneOrSeveralPathsRequest;
import com.adif.elcanomovil.serviceNetworking.circulations.model.request.TrafficCirculationPathRequest;
import com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialPathRouteInfoResponse;
import com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialPathStepSideInfoResponse;
import com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialRouteInfoResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/CirculationService;", "", NavArguments.ARG_DYNAMIC_ARRIVALS, "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathStepSideInfoResponse;", "request", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/TrafficCirculationPathRequest;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/TrafficCirculationPathRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "betweenStations", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialRouteInfoResponse;", NavArguments.ARG_DYNAMIC_DEPARTURES, "onePaths", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathRouteInfoResponse;", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/OneOrSeveralPathsRequest;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/OneOrSeveralPathsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "severalPaths", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CirculationService {
    @Headers({ServicePaths.Headers.contentType, ServicePaths.Headers.apiManagerUserKeyCirculations})
    @POST(ServicePaths.CirculationService.arrivals)
    Object arrivals(@Body TrafficCirculationPathRequest trafficCirculationPathRequest, Continuation<? super CommercialPathStepSideInfoResponse> continuation);

    @Headers({ServicePaths.Headers.contentType, ServicePaths.Headers.apiManagerUserKeyCirculations})
    @POST(ServicePaths.CirculationService.betweenStations)
    Object betweenStations(@Body TrafficCirculationPathRequest trafficCirculationPathRequest, Continuation<? super CommercialRouteInfoResponse> continuation);

    @Headers({ServicePaths.Headers.contentType, ServicePaths.Headers.apiManagerUserKeyCirculations})
    @POST(ServicePaths.CirculationService.departures)
    Object departures(@Body TrafficCirculationPathRequest trafficCirculationPathRequest, Continuation<? super CommercialPathStepSideInfoResponse> continuation);

    @Headers({ServicePaths.Headers.contentType, ServicePaths.Headers.apiManagerUserKeyCirculations})
    @POST(ServicePaths.CirculationService.onePaths)
    Object onePaths(@Body OneOrSeveralPathsRequest oneOrSeveralPathsRequest, Continuation<? super CommercialPathRouteInfoResponse> continuation);

    @Headers({ServicePaths.Headers.contentType, ServicePaths.Headers.apiManagerUserKeyCirculations})
    @POST(ServicePaths.CirculationService.severalPaths)
    Object severalPaths(@Body OneOrSeveralPathsRequest oneOrSeveralPathsRequest, Continuation<? super CommercialPathRouteInfoResponse> continuation);
}
