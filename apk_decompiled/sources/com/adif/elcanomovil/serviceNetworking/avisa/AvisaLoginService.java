package com.adif.elcanomovil.serviceNetworking.avisa;

import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaLoginResponse;
import com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaRegistrationRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\tJ,\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaLoginService;", "", FirebaseAnalytics.Event.LOGIN, "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/AvisaLoginResponse;", "authValue", "", "grantType", ServicePaths.AvisaLoginService.queryUsername, ServicePaths.AvisaLoginService.queryPassword, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "Lretrofit2/Response;", "", "request", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/AvisaRegistrationRequest;", "(Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/avisa/model/AvisaRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AvisaLoginService {
    @POST("token")
    Object login(@Header("Authorization") String str, @Query("grant_type") String str2, @Query("username") String str3, @Query("password") String str4, Continuation<? super AvisaLoginResponse> continuation);

    @POST("token")
    Object refreshToken(@Header("Authorization") String str, @Query("grant_type") String str2, @Query("refresh_token") String str3, Continuation<? super AvisaLoginResponse> continuation);

    @POST(ServicePaths.AvisaLoginService.register)
    Object register(@Header("Authorization") String str, @Body AvisaRegistrationRequest avisaRegistrationRequest, Continuation<? super Response<Unit>> continuation);
}
