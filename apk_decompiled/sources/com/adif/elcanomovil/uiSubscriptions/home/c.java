package com.adif.elcanomovil.uiSubscriptions.home;

import com.adif.elcanomovil.commonViews.extensions.ViewKt;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.uiSubscriptions.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubscriptionHomeFragment f5356a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SubscriptionHomeFragment subscriptionHomeFragment) {
        super(1);
        this.f5356a = subscriptionHomeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AsyncResult asyncResult = (AsyncResult) obj;
        if (asyncResult != null) {
            SubscriptionHomeFragment subscriptionHomeFragment = this.f5356a;
            subscriptionHomeFragment.loading(false);
            int i = SubscriptionHomeFragment$bindViewModel$3$WhenMappings.$EnumSwitchMapping$0[asyncResult.getStatus().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    String string = subscriptionHomeFragment.getString(R.string.subscription_operation_enable_message);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    ViewKt.showSnackbar(subscriptionHomeFragment, string, 0);
                } else if (i != 3) {
                    Intrinsics.checkNotNullParameter("Unknown error", "message");
                    t3.c.f8551a.a("Unknown error", new Object[0]);
                } else {
                    System.out.println(asyncResult.getThrowable());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
