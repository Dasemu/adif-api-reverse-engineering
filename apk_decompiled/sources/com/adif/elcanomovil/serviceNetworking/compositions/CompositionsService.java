package com.adif.elcanomovil.serviceNetworking.compositions;

import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.adif.elcanomovil.serviceNetworking.circulations.model.request.OneOrSeveralPathsRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/compositions/CompositionsService;", "", "compositions", "Lretrofit2/Response;", "Lcom/adif/elcanomovil/serviceNetworking/compositions/CompositionResponse;", "request", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/OneOrSeveralPathsRequest;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/OneOrSeveralPathsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CompositionsService {
    @Headers({ServicePaths.Headers.contentType, ServicePaths.Headers.apiManagerUserKeyCirculations})
    @POST(ServicePaths.CompositionService.compositions)
    Object compositions(@Body OneOrSeveralPathsRequest oneOrSeveralPathsRequest, Continuation<? super Response<CompositionResponse>> continuation);
}
