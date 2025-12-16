package com.adif.elcanomovil.uiSubscriptions.home;

import androidx.lifecycle.W;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes3.dex */
public final class k implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubscriptionHomeViewModel f5375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5376b;

    public k(SubscriptionHomeViewModel subscriptionHomeViewModel, int i) {
        this.f5375a = subscriptionHomeViewModel;
        this.f5376b = i;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        W w3;
        W w4;
        int i = SubscriptionHomeViewModel$deleteSubscription$1$1$1$1$WhenMappings.$EnumSwitchMapping$0[((AsyncResult) obj).getStatus().ordinal()];
        SubscriptionHomeViewModel subscriptionHomeViewModel = this.f5375a;
        if (i == 1) {
            w3 = subscriptionHomeViewModel._deleteSubscription;
            w3.k(new Pair(Boxing.boxBoolean(false), null));
        } else if (i == 2) {
            w4 = subscriptionHomeViewModel._deleteSubscription;
            w4.k(new Pair(Boxing.boxBoolean(true), Boxing.boxInt(this.f5376b)));
        }
        return Unit.INSTANCE;
    }
}
