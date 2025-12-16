package com.adif.elcanomovil.serviceStorage.database;

import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionAuxEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsAuxDataDao;", "", "get", "Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/SubscriptionAuxEntity;", "subscriptionType", "", "insert", "", "subscription", "(Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/SubscriptionAuxEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SubscriptionsAuxDataDao {
    SubscriptionAuxEntity get(String subscriptionType);

    Object insert(SubscriptionAuxEntity subscriptionAuxEntity, Continuation<? super Unit> continuation);
}
