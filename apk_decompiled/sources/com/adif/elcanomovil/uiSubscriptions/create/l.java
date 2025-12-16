package com.adif.elcanomovil.uiSubscriptions.create;

import androidx.lifecycle.W;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes3.dex */
public final class l implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCreationViewModel f5339b;

    public /* synthetic */ l(SubscriptionCreationViewModel subscriptionCreationViewModel, int i) {
        this.f5338a = i;
        this.f5339b = subscriptionCreationViewModel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        W w3;
        W w4;
        W w5;
        W w6;
        W w7;
        W w8;
        switch (this.f5338a) {
            case 0:
                w3 = this.f5339b._resultCreateSubscription;
                w3.k((AsyncResult) obj);
                return Unit.INSTANCE;
            case 1:
                w4 = this.f5339b._resultCreateSubscription;
                w4.k((AsyncResult) obj);
                return Unit.INSTANCE;
            case 2:
                int i = SubscriptionCreationViewModel$deleteSusbscription$1$1$1$WhenMappings.$EnumSwitchMapping$0[((AsyncResult) obj).getStatus().ordinal()];
                SubscriptionCreationViewModel subscriptionCreationViewModel = this.f5339b;
                if (i == 1) {
                    w5 = subscriptionCreationViewModel._deleteSubscription;
                    w5.k(Boxing.boxBoolean(false));
                } else if (i == 2) {
                    w6 = subscriptionCreationViewModel._deleteSubscription;
                    w6.k(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            case 3:
                w7 = this.f5339b._resultCreateSubscription;
                w7.k((AsyncResult) obj);
                return Unit.INSTANCE;
            default:
                w8 = this.f5339b._resultCreateSubscription;
                w8.k((AsyncResult) obj);
                return Unit.INSTANCE;
        }
    }
}
