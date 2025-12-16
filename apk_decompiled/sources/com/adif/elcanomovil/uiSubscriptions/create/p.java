package com.adif.elcanomovil.uiSubscriptions.create;

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
    public final /* synthetic */ SubscriptionCreationViewModel f5346a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SubscriptionCreationViewModel subscriptionCreationViewModel) {
        super(0);
        this.f5346a = subscriptionCreationViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context;
        context = this.f5346a.context;
        String string = context.getString(R.string.stations_avisa_dialog_positive);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new AlertActions(SubscriptionCreationViewModelKt.SUBSCRIPTION_GENERIC_ACTION, new AlertAction(string, AlertAction.Style.POSITIVE));
    }
}
