package com.adif.elcanomovil.domain.repositories.avisa;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H¦@¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H¦@¢\u0006\u0002\u0010\tJR\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u0014R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaLoginRepository;", "", "isRegistered", "", "()Z", FirebaseAnalytics.Event.LOGIN, "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "register", "registrationToken", "", "userId", "subscriptionUserId", "deviceId", ServicePaths.AvisaLoginService.queryPassword, "osType", "osVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AvisaLoginRepository {
    boolean isRegistered();

    Object login(Continuation<? super Flow<AsyncResult<Unit>>> continuation);

    Object refreshToken(Continuation<? super Flow<AsyncResult<Unit>>> continuation);

    Object register(String str, String str2, String str3, String str4, String str5, String str6, String str7, Continuation<? super Flow<AsyncResult<Unit>>> continuation);
}
