package com.adif.elcanomovil.uiSubscriptions.create;

import com.adif.elcanomovil.uiSubscriptions.databinding.SubscriptionCreationFragmentBinding;
import com.adif.elcanomovil.uiSubscriptions.utils.AnticipationType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCreationFragmentBinding f5307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCreationFragment f5308c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding, SubscriptionCreationFragment subscriptionCreationFragment, int i) {
        super(0);
        this.f5306a = i;
        this.f5307b = subscriptionCreationFragmentBinding;
        this.f5308c = subscriptionCreationFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SubscriptionCreationViewModel viewModel;
        SubscriptionCreationViewModel viewModel2;
        SubscriptionCreationViewModel viewModel3;
        switch (this.f5306a) {
            case 0:
                SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding = this.f5307b;
                subscriptionCreationFragmentBinding.anticipationTime.anticipationTimeTwo.setActive(false);
                subscriptionCreationFragmentBinding.anticipationTime.anticipationTimeTwo.paintStatus();
                subscriptionCreationFragmentBinding.anticipationTime.anticipationTimeThree.setActive(false);
                subscriptionCreationFragmentBinding.anticipationTime.anticipationTimeThree.paintStatus();
                viewModel = this.f5308c.getViewModel();
                viewModel.setAnticipationTime(AnticipationType.TEN_MINUTES);
                return Unit.INSTANCE;
            case 1:
                SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding2 = this.f5307b;
                subscriptionCreationFragmentBinding2.anticipationTime.anticipationTimeOne.setActive(false);
                subscriptionCreationFragmentBinding2.anticipationTime.anticipationTimeOne.paintStatus();
                subscriptionCreationFragmentBinding2.anticipationTime.anticipationTimeThree.setActive(false);
                subscriptionCreationFragmentBinding2.anticipationTime.anticipationTimeThree.paintStatus();
                viewModel2 = this.f5308c.getViewModel();
                viewModel2.setAnticipationTime(AnticipationType.TWENTY_MINUTES);
                return Unit.INSTANCE;
            default:
                SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding3 = this.f5307b;
                subscriptionCreationFragmentBinding3.anticipationTime.anticipationTimeTwo.setActive(false);
                subscriptionCreationFragmentBinding3.anticipationTime.anticipationTimeTwo.paintStatus();
                subscriptionCreationFragmentBinding3.anticipationTime.anticipationTimeOne.setActive(false);
                subscriptionCreationFragmentBinding3.anticipationTime.anticipationTimeOne.paintStatus();
                viewModel3 = this.f5308c.getViewModel();
                viewModel3.setAnticipationTime(AnticipationType.THIRTY_MINUTES);
                return Unit.INSTANCE;
        }
    }
}
