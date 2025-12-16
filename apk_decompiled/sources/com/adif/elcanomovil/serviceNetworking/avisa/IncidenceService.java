package com.adif.elcanomovil.serviceNetworking.avisa;

import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.adif.elcanomovil.serviceNetworking.avisa.model.CreateIncidenceRequest;
import com.adif.elcanomovil.serviceNetworking.avisa.model.IncidenceResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/avisa/IncidenceService;", "", "createIncidence", "Lretrofit2/Response;", "", "authValue", "", "incidenceRequest", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/CreateIncidenceRequest;", "(Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/avisa/model/CreateIncidenceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incidence", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceResponse;", ServicePaths.IncidenceService.pathIncidenceId, "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incidences", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IncidenceService {
    @POST(ServicePaths.IncidenceService.incidences)
    Object createIncidence(@Header("Authorization") String str, @Body CreateIncidenceRequest createIncidenceRequest, Continuation<? super Response<Unit>> continuation);

    @GET(ServicePaths.IncidenceService.incidenceDetails)
    Object incidence(@Header("Authorization") String str, @Path("incidenceId") int i, Continuation<? super IncidenceResponse> continuation);

    @GET(ServicePaths.IncidenceService.incidences)
    Object incidences(@Header("Authorization") String str, Continuation<? super List<IncidenceResponse>> continuation);
}
