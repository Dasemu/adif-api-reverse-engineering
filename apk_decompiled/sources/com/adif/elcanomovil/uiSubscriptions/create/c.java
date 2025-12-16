package com.adif.elcanomovil.uiSubscriptions.create;

import com.adif.elcanomovil.commonViews.ButtonsEvents;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.uiSubscriptions.create.views.JourneyAction;
import com.adif.elcanomovil.uiSubscriptions.create.views.TrainAction;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCreationFragment f5305b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SubscriptionCreationFragment subscriptionCreationFragment, int i) {
        super(1);
        this.f5304a = i;
        this.f5305b = subscriptionCreationFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SubscriptionCreationViewModel viewModel;
        SubscriptionCreationViewModel viewModel2;
        SubscriptionCreationViewModel viewModel3;
        SubscriptionCreationViewModel viewModel4;
        SubscriptionCreationViewModel viewModel5;
        SubscriptionCreationViewModel viewModel6;
        SubscriptionCreationViewModel viewModel7;
        SubscriptionCreationViewModel viewModel8;
        switch (this.f5304a) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    SubscriptionCreationFragment subscriptionCreationFragment = this.f5305b;
                    subscriptionCreationFragment.showLoading(8);
                    if (booleanValue) {
                        viewModel2 = subscriptionCreationFragment.getViewModel();
                        viewModel2.subscriptiondeleted();
                    } else {
                        viewModel = subscriptionCreationFragment.getViewModel();
                        viewModel.showErrorDialog();
                        Intrinsics.checkNotNullParameter("Problem to delete subscription", "message");
                        t3.c.f8551a.e("Problem to delete subscription", new Object[0]);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                AsyncResult asyncResult = (AsyncResult) obj;
                if (asyncResult != null) {
                    SubscriptionCreationFragment subscriptionCreationFragment2 = this.f5305b;
                    subscriptionCreationFragment2.showLoading(8);
                    int i = SubscriptionCreationFragment$bindViewModel$5$WhenMappings.$EnumSwitchMapping$0[asyncResult.getStatus().ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            subscriptionCreationFragment2.showMessage();
                        } else if (i != 3) {
                            Intrinsics.checkNotNullParameter("Unknown error", "message");
                            t3.c.f8551a.a("Unknown error", new Object[0]);
                        } else {
                            viewModel3 = subscriptionCreationFragment2.getViewModel();
                            viewModel3.showErrorDialog();
                            System.out.println(asyncResult.getThrowable());
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                ButtonsEvents it = (ButtonsEvents) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                SubscriptionCreationFragment subscriptionCreationFragment3 = this.f5305b;
                subscriptionCreationFragment3.showLoading(0);
                viewModel4 = subscriptionCreationFragment3.getViewModel();
                viewModel4.deleteSusbscription();
                return Unit.INSTANCE;
            case 3:
                ButtonsEvents it2 = (ButtonsEvents) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                this.f5305b.requireActivity().onBackPressed();
                return Unit.INSTANCE;
            case 4:
                Date it3 = (Date) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                viewModel5 = this.f5305b.getViewModel();
                viewModel5.setInitialTimeFrom(it3);
                return Unit.INSTANCE;
            case 5:
                JourneyAction it4 = (JourneyAction) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                viewModel6 = this.f5305b.getViewModel();
                viewModel6.handleHeaderButtonTap(it4);
                return Unit.INSTANCE;
            case 6:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                viewModel7 = this.f5305b.getViewModel();
                viewModel7.handleTrainTypeChange(booleanValue2);
                return Unit.INSTANCE;
            default:
                TrainAction it5 = (TrainAction) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                viewModel8 = this.f5305b.getViewModel();
                viewModel8.handleHeaderTrainButtonTap(it5);
                return Unit.INSTANCE;
        }
    }
}
