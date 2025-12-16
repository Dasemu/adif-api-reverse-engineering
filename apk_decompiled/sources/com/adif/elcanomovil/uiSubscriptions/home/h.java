package com.adif.elcanomovil.uiSubscriptions.home;

import androidx.lifecycle.W;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes3.dex */
public final class h implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionHomeViewModel f5368b;

    public /* synthetic */ h(SubscriptionHomeViewModel subscriptionHomeViewModel, int i) {
        this.f5367a = i;
        this.f5368b = subscriptionHomeViewModel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        W w3;
        W w4;
        W w5;
        W w6;
        switch (this.f5367a) {
            case 0:
                w3 = this.f5368b._resultCreateSubscription;
                w3.k((AsyncResult) obj);
                return Unit.INSTANCE;
            case 1:
                w4 = this.f5368b._userListSubscriptions;
                w4.k((AsyncResult) obj);
                return Unit.INSTANCE;
            default:
                int i = SubscriptionHomeViewModel$muteSubscription$1$1$WhenMappings.$EnumSwitchMapping$0[((AsyncResult) obj).getStatus().ordinal()];
                SubscriptionHomeViewModel subscriptionHomeViewModel = this.f5368b;
                if (i == 1) {
                    w5 = subscriptionHomeViewModel._muteSubscription;
                    w5.k(new Pair(Boxing.boxBoolean(false), null));
                } else if (i == 2) {
                    w6 = subscriptionHomeViewModel._muteSubscription;
                    w6.k(new Pair(Boxing.boxBoolean(true), null));
                }
                return Unit.INSTANCE;
        }
    }
}
