package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.adif.elcanomovil.serviceNetworking.avisa.AvisaLoginService;
import com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaLoginResponse;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120\u0011H\u0096@¢\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120\u0011H\u0096@¢\u0006\u0002\u0010\u0013JR\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/adif/elcanomovil/repositories/avisa/DefaultAvisaLoginRepository;", "Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaLoginRepository;", "avisaLoginService", "Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaLoginService;", "preferences", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "tokenMapper", "Lcom/adif/elcanomovil/repositories/avisa/TokenMapper;", "(Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaLoginService;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Lcom/adif/elcanomovil/repositories/avisa/TokenMapper;)V", "isRegistered", "", "()Z", "handleAvisaLoginResponse", "", "avisaLoginResponse", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/AvisaLoginResponse;", FirebaseAnalytics.Event.LOGIN, "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "register", "registrationToken", "", "userId", "subscriptionUserId", "deviceId", ServicePaths.AvisaLoginService.queryPassword, "osType", "osVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeAvisaUser", "storeSubscriptionUserId", "subscriptionsUserId", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultAvisaLoginRepository implements AvisaLoginRepository {
    private final AvisaLoginService avisaLoginService;
    private final PreferenceStorage preferences;
    private final TokenMapper tokenMapper;

    public DefaultAvisaLoginRepository(AvisaLoginService avisaLoginService, PreferenceStorage preferences, TokenMapper tokenMapper) {
        Intrinsics.checkNotNullParameter(avisaLoginService, "avisaLoginService");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(tokenMapper, "tokenMapper");
        this.avisaLoginService = avisaLoginService;
        this.preferences = preferences;
        this.tokenMapper = tokenMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAvisaLoginResponse(AvisaLoginResponse avisaLoginResponse) {
        this.preferences.setAvisaToken(this.tokenMapper.map(avisaLoginResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void storeAvisaUser(String userId, String password) {
        this.preferences.setAvisaUserId(userId);
        if (password != null) {
            this.preferences.setAvisaPassword(password);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void storeSubscriptionUserId(String subscriptionsUserId) {
        this.preferences.setSubscriptionsUserId(subscriptionsUserId);
    }

    @Override // com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository
    public boolean isRegistered() {
        return this.preferences.isRegistered();
    }

    @Override // com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository
    public Object login(Continuation<? super Flow<AsyncResult<Unit>>> continuation) {
        return FlowKt.flow(new a(this, null));
    }

    @Override // com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository
    public Object refreshToken(Continuation<? super Flow<AsyncResult<Unit>>> continuation) {
        return FlowKt.flow(new b(this, null));
    }

    @Override // com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository
    public Object register(String str, String str2, String str3, String str4, String str5, String str6, String str7, Continuation<? super Flow<AsyncResult<Unit>>> continuation) {
        return FlowKt.flow(new c(this, str3, str, str2, str4, str5, str6, str7, null));
    }
}
