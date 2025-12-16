package com.adif.elcanomovil.uiSubscriptions.home;

import android.content.Context;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.uiSubscriptions.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubscriptionHomeViewModel f5386a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SubscriptionHomeViewModel subscriptionHomeViewModel) {
        super(0);
        this.f5386a = subscriptionHomeViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context;
        Context context2;
        SubscriptionHomeViewModel subscriptionHomeViewModel = this.f5386a;
        context = subscriptionHomeViewModel.context;
        String string = context.getString(R.string.stations_avisa_dialog_keep);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        AlertAction alertAction = new AlertAction(string, AlertAction.Style.POSITIVE);
        context2 = subscriptionHomeViewModel.context;
        String string2 = context2.getString(R.string.stations_avisa_dialog_delete);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new AlertActions(SubscriptionHomeViewModelKt.SUBSCRIPTION_DELETE_ACTION, alertAction, new AlertAction(string2, AlertAction.Style.NEGATIVE));
    }
}
