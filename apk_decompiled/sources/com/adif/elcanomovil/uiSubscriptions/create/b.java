package com.adif.elcanomovil.uiSubscriptions.create;

import com.adif.elcanomovil.domain.entities.subscription.SubscriptionType;
import com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData;
import com.adif.elcanomovil.uiSubscriptions.utils.AnticipationType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCreationFragment f5303a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SubscriptionCreationFragment subscriptionCreationFragment) {
        super(1);
        this.f5303a = subscriptionCreationFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SubscriptionCreateViewData subscriptionCreateViewData = (SubscriptionCreateViewData) obj;
        AnticipationType anticipationTime = subscriptionCreateViewData.getAnticipationTime();
        SubscriptionCreationFragment subscriptionCreationFragment = this.f5303a;
        subscriptionCreationFragment.configureAnticipationTime(anticipationTime);
        subscriptionCreationFragment.configureRepetitionDays(subscriptionCreateViewData.getRepetitionDays());
        SubscriptionType typeSubscription = subscriptionCreateViewData.getTypeSubscription();
        if (typeSubscription != null) {
            com.adif.elcanomovil.enums.SubscriptionType invoke = com.adif.elcanomovil.enums.SubscriptionType.INSTANCE.invoke(typeSubscription.getValue());
            int i = invoke == null ? -1 : SubscriptionCreationFragment$bindViewModel$3$WhenMappings.$EnumSwitchMapping$0[invoke.ordinal()];
            if (i == 1) {
                Intrinsics.checkNotNull(subscriptionCreateViewData);
                subscriptionCreationFragment.configureJourneyView(subscriptionCreateViewData);
            } else if (i == 2) {
                Intrinsics.checkNotNull(subscriptionCreateViewData);
                subscriptionCreationFragment.configureTrainView(subscriptionCreateViewData);
            }
        }
        return Unit.INSTANCE;
    }
}
