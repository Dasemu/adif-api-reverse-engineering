package com.adif.elcanomovil.uiSubscriptions.home;

import android.content.Context;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.uiSubscriptions.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubscriptionHomeViewModel f5388a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(SubscriptionHomeViewModel subscriptionHomeViewModel) {
        super(0);
        this.f5388a = subscriptionHomeViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context;
        context = this.f5388a.context;
        String string = context.getString(R.string.stations_avisa_dialog_positive);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new AlertActions("generic_subscription_without_action", new AlertAction(string, AlertAction.Style.POSITIVE));
    }
}
