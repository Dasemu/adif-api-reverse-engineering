package com.adif.elcanomovil.uiSubscriptions.create;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCreationFragment f5310b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(SubscriptionCreationFragment subscriptionCreationFragment, int i) {
        super(0);
        this.f5309a = i;
        this.f5310b = subscriptionCreationFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SubscriptionCreationViewModel viewModel;
        SubscriptionCreationViewModel viewModel2;
        SubscriptionCreationViewModel viewModel3;
        SubscriptionCreationViewModel viewModel4;
        SubscriptionCreationViewModel viewModel5;
        SubscriptionCreationViewModel viewModel6;
        SubscriptionCreationViewModel viewModel7;
        switch (this.f5309a) {
            case 0:
                viewModel = this.f5310b.getViewModel();
                viewModel.setRepetitionDay("L");
                return Unit.INSTANCE;
            case 1:
                viewModel2 = this.f5310b.getViewModel();
                viewModel2.setRepetitionDay("M");
                return Unit.INSTANCE;
            case 2:
                viewModel3 = this.f5310b.getViewModel();
                viewModel3.setRepetitionDay("X");
                return Unit.INSTANCE;
            case 3:
                viewModel4 = this.f5310b.getViewModel();
                viewModel4.setRepetitionDay("J");
                return Unit.INSTANCE;
            case 4:
                viewModel5 = this.f5310b.getViewModel();
                viewModel5.setRepetitionDay("V");
                return Unit.INSTANCE;
            case 5:
                viewModel6 = this.f5310b.getViewModel();
                viewModel6.setRepetitionDay("S");
                return Unit.INSTANCE;
            default:
                viewModel7 = this.f5310b.getViewModel();
                viewModel7.setRepetitionDay("D");
                return Unit.INSTANCE;
        }
    }
}
