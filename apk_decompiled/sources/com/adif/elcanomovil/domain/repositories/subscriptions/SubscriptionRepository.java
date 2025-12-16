package com.adif.elcanomovil.domain.repositories.subscriptions;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.entities.subscription.SubscriptionType;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0094\u0001\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\nH&J&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0016H&J*\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001c0\u00040\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0016H¦@¢\u0006\u0002\u0010\u001dJ\u008a\u0001\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\nH&JZ\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010 \u001a\u0004\u0018\u00010\n2\b\u0010!\u001a\u0004\u0018\u00010\n2\b\u0010\"\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010$\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H&¨\u0006%"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/subscriptions/SubscriptionRepository;", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "subscription", "Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", "create", "stationId", "", "destId", "start", "center", "end", "repeats", "subscription_type", "typeSubscription", "Lcom/adif/elcanomovil/domain/entities/subscription/SubscriptionType;", "day", "msisdn", "shouldFetch", "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "delete", "isUnRegister", RemoteConfigComponent.FETCH_FILE_NAME, "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modify", "mute", "destinationId", "msgStart", "msgEnd", "repeat", "trainId", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SubscriptionRepository {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Flow create$default(SubscriptionRepository subscriptionRepository, String str, String str2, String str3, String str4, String str5, String str6, String str7, SubscriptionType subscriptionType, String str8, String str9, boolean z3, String str10, String str11, int i, Object obj) {
            if (obj == null) {
                return subscriptionRepository.create(str, str2, str3, str4, str5, str6, str7, subscriptionType, str8, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "null" : str9, (i & 1024) != 0 ? true : z3, str10, str11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }

        public static /* synthetic */ Flow delete$default(SubscriptionRepository subscriptionRepository, Subscription subscription, boolean z3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 2) != 0) {
                z3 = false;
            }
            return subscriptionRepository.delete(subscription, z3);
        }

        public static /* synthetic */ Object fetch$default(SubscriptionRepository subscriptionRepository, boolean z3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i & 1) != 0) {
                z3 = true;
            }
            return subscriptionRepository.fetch(z3, continuation);
        }

        public static /* synthetic */ Flow modify$default(SubscriptionRepository subscriptionRepository, Subscription subscription, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z3, String str9, String str10, int i, Object obj) {
            if (obj == null) {
                return subscriptionRepository.modify(subscription, str, str2, str3, str4, str5, str6, str7, (i & 256) != 0 ? "null" : str8, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? true : z3, str9, str10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: modify");
        }

        public static /* synthetic */ Flow mute$default(SubscriptionRepository subscriptionRepository, String str, String str2, String str3, String str4, String str5, String str6, boolean z3, int i, Object obj) {
            if (obj == null) {
                return subscriptionRepository.mute(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? true : z3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mute");
        }
    }

    Flow<AsyncResult<Unit>> active(Subscription subscription);

    Flow<AsyncResult<Unit>> create(String stationId, String destId, String start, String center, String end, String repeats, String subscription_type, SubscriptionType typeSubscription, String day, String msisdn, boolean shouldFetch, String operator, String commercialProduct);

    Flow<AsyncResult<Unit>> delete(Subscription subscription, boolean isUnRegister);

    Object fetch(boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<Subscription>>>> continuation);

    Flow<AsyncResult<Unit>> modify(Subscription subscription, String stationId, String destId, String start, String center, String end, String repeats, String subscription_type, String msisdn, boolean shouldFetch, String operator, String commercialProduct);

    Flow<AsyncResult<Unit>> mute(String stationId, String destinationId, String msgStart, String msgEnd, String repeat, String trainId, boolean shouldFetch);
}
