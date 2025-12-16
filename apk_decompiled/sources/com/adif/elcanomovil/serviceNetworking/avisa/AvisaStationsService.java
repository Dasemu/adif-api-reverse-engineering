package com.adif.elcanomovil.serviceNetworking.avisa;

import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaStationCategoryResponse;
import com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaStationResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaStationsService;", "", "categoryStationList", "", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/AvisaStationCategoryResponse;", "authValue", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stationId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stations", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/AvisaStationResponse;", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AvisaStationsService {
    @GET(ServicePaths.AvisaStationService.stationCategory)
    Object categoryStationList(@Header("Authorization") String str, @Query("stationId") String str2, Continuation<? super List<AvisaStationCategoryResponse>> continuation);

    @GET(ServicePaths.AvisaStationService.stationCategory)
    Object categoryStationList(@Header("Authorization") String str, Continuation<? super List<AvisaStationCategoryResponse>> continuation);

    @GET(ServicePaths.AvisaStationService.stations)
    Object stations(@Header("Authorization") String str, Continuation<? super List<AvisaStationResponse>> continuation);
}
