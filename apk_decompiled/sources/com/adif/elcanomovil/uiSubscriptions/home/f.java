package com.adif.elcanomovil.uiSubscriptions.home;

import android.os.Bundle;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.uiSubscriptions.adapters.SubscriptionsEvents;
import com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData;
import com.adif.elcanomovil.uiSubscriptions.utils.SubscriptionHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class f extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubscriptionHomeFragment f5357a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SubscriptionHomeFragment subscriptionHomeFragment) {
        super(2);
        this.f5357a = subscriptionHomeFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SubscriptionHomeViewModel viewModel;
        SubscriptionHomeViewModel viewModel2;
        SubscriptionHomeViewModel viewModel3;
        SubscriptionsEvents buttonsEvents = (SubscriptionsEvents) obj;
        Subscription subscription = (Subscription) obj2;
        Intrinsics.checkNotNullParameter(buttonsEvents, "buttonsEvents");
        int i = SubscriptionHomeFragment$prepareRecycler$1$WhenMappings.$EnumSwitchMapping$0[buttonsEvents.ordinal()];
        SubscriptionHomeFragment subscriptionHomeFragment = this.f5357a;
        if (i == 1) {
            SubscriptionCreateViewData createSubscriptionViewData = SubscriptionHelper.INSTANCE.createSubscriptionViewData(subscription);
            Bundle bundle = new Bundle();
            bundle.putParcelable(NavArguments.ARG_VIEW_DATA_SUBSCRIPTION, createSubscriptionViewData);
            bundle.putString(NavArguments.ARG_DATA_SUBSCRIPTION, new Q2.d().f(subscription));
            viewModel = subscriptionHomeFragment.getViewModel();
            viewModel.onSelectedItem(subscription);
        } else if (i != 2) {
            if (i == 3 && subscription != null) {
                subscriptionHomeFragment.loading(false);
                viewModel3 = subscriptionHomeFragment.getViewModel();
                viewModel3.disableSubscription(subscription.getId());
            }
        } else if (subscription != null) {
            subscriptionHomeFragment.loading(true);
            viewModel2 = subscriptionHomeFragment.getViewModel();
            viewModel2.enableSubscription(subscription.getId());
        }
        return Unit.INSTANCE;
    }
}
