package com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Jw\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/ModifySubscriptionsUseCase;", "", "subscriptionRepository", "Lcom/adif/elcanomovil/domain/repositories/subscriptions/SubscriptionRepository;", "(Lcom/adif/elcanomovil/domain/repositories/subscriptions/SubscriptionRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "subscription", "Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", "staionId", "", "destId", "start", "center", "end", "repeats", "subscriptionType", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModifySubscriptionsUseCase {
    private final SubscriptionRepository subscriptionRepository;

    public ModifySubscriptionsUseCase(SubscriptionRepository subscriptionRepository) {
        Intrinsics.checkNotNullParameter(subscriptionRepository, "subscriptionRepository");
        this.subscriptionRepository = subscriptionRepository;
    }

    public final Flow<AsyncResult<Unit>> invoke(Subscription subscription, String staionId, String destId, String start, String center, String end, String repeats, String subscriptionType, String operator, String commercialProduct) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return SubscriptionRepository.DefaultImpls.modify$default(this.subscriptionRepository, subscription, staionId, destId, start, center, end, repeats, subscriptionType, null, false, operator, commercialProduct, 768, null);
    }
}
