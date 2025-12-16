package com.adif.elcanomovil.serviceNetworking.subscriptions;

import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.adif.elcanomovil.serviceNetworking.subscriptions.models.SubscriptionCreateTrainRequest;
import com.adif.elcanomovil.serviceNetworking.subscriptions.models.SubscriptionRequest;
import com.adif.elcanomovil.serviceNetworking.subscriptions.models.SubscriptionResponse;
import com.adif.elcanomovil.serviceNetworking.subscriptions.models.SubscriptionTrainRequest;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJF\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJP\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u0012JP\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015JP\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u0012J<\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u001aJ<\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/subscriptions/SubscriptionsService;", "", "createJourneySubscription", "Lretrofit2/Response;", "", "authValue", "", "pushID", "deviceID", "headerAuth", "subscriptionRequest", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTrainSubscription", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionCreateTrainRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionCreateTrainRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modifyJourneySubscription", ImagesContract.URL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modifyTrainSubscription", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionTrainRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionTrainRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "muteSubscription", "subscriptions", "", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterSubscription", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SubscriptionsService {
    @POST(ServicePaths.SubscriptionsService.create_subcriptions)
    Object createJourneySubscription(@Header("Authorization") String str, @Header("X-CanalMovil-pushID") String str2, @Header("X-CanalMovil-deviceID") String str3, @Header("X-CanalMovil-Authentication") String str4, @Body SubscriptionRequest subscriptionRequest, Continuation<? super Response<Unit>> continuation);

    @POST(ServicePaths.SubscriptionsService.create_subcriptions)
    Object createTrainSubscription(@Header("Authorization") String str, @Header("X-CanalMovil-pushID") String str2, @Header("X-CanalMovil-deviceID") String str3, @Header("X-CanalMovil-Authentication") String str4, @Body SubscriptionCreateTrainRequest subscriptionCreateTrainRequest, Continuation<? super Response<Unit>> continuation);

    @POST
    Object modifyJourneySubscription(@Url String str, @Header("Authorization") String str2, @Header("X-CanalMovil-pushID") String str3, @Header("X-CanalMovil-deviceID") String str4, @Header("X-CanalMovil-Authentication") String str5, @Body SubscriptionRequest subscriptionRequest, Continuation<? super Response<Unit>> continuation);

    @POST
    Object modifyTrainSubscription(@Url String str, @Header("Authorization") String str2, @Header("X-CanalMovil-pushID") String str3, @Header("X-CanalMovil-deviceID") String str4, @Header("X-CanalMovil-Authentication") String str5, @Body SubscriptionTrainRequest subscriptionTrainRequest, Continuation<? super Response<Unit>> continuation);

    @POST(ServicePaths.SubscriptionsService.subcriptions)
    Object muteSubscription(@Url String str, @Header("Authorization") String str2, @Header("X-CanalMovil-pushID") String str3, @Header("X-CanalMovil-deviceID") String str4, @Header("X-CanalMovil-Authentication") String str5, @Body SubscriptionRequest subscriptionRequest, Continuation<? super Response<Unit>> continuation);

    @GET(ServicePaths.SubscriptionsService.subcriptions)
    Object subscriptions(@Header("Authorization") String str, @Header("X-CanalMovil-pushID") String str2, @Header("X-CanalMovil-deviceID") String str3, @Header("X-CanalMovil-Authentication") String str4, Continuation<? super List<SubscriptionResponse>> continuation);

    @DELETE
    Object unregisterSubscription(@Url String str, @Header("Authorization") String str2, @Header("X-CanalMovil-pushID") String str3, @Header("X-CanalMovil-Authentication") String str4, Continuation<? super Response<Unit>> continuation);
}
