package com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JQ\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/MuteSubscriptionsUseCase;", "", "subscriptionRepository", "Lcom/adif/elcanomovil/domain/repositories/subscriptions/SubscriptionRepository;", "(Lcom/adif/elcanomovil/domain/repositories/subscriptions/SubscriptionRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "stationId", "", "destinationId", "msgStart", "msgEnd", "repeat", "trainId", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MuteSubscriptionsUseCase {
    private final SubscriptionRepository subscriptionRepository;

    public MuteSubscriptionsUseCase(SubscriptionRepository subscriptionRepository) {
        Intrinsics.checkNotNullParameter(subscriptionRepository, "subscriptionRepository");
        this.subscriptionRepository = subscriptionRepository;
    }

    public final Flow<AsyncResult<Unit>> invoke(String stationId, String destinationId, String msgStart, String msgEnd, String repeat, String trainId) {
        return SubscriptionRepository.DefaultImpls.mute$default(this.subscriptionRepository, stationId, destinationId, msgStart, msgEnd, repeat, trainId, false, 64, null);
    }
}
