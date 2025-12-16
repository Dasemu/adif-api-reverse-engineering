package com.adif.elcanomovil.serviceStorage.database;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionEntity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH'J\u0016\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH§@¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsDao;", "", "delete", "", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllStatus", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/SubscriptionEntity;", "insert", "subscription", "(Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/SubscriptionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "subscriptions", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SubscriptionsDao {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object deleteAllStatus$default(SubscriptionsDao subscriptionsDao, boolean z3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAllStatus");
            }
            if ((i & 1) != 0) {
                z3 = true;
            }
            return subscriptionsDao.deleteAllStatus(z3, continuation);
        }
    }

    Object delete(int i, Continuation<? super Unit> continuation);

    Object deleteAllStatus(boolean z3, Continuation<? super Unit> continuation);

    Flow<List<SubscriptionEntity>> getAll();

    Object insert(SubscriptionEntity subscriptionEntity, Continuation<? super Unit> continuation);

    Object insertAll(List<SubscriptionEntity> list, Continuation<? super Unit> continuation);
}
