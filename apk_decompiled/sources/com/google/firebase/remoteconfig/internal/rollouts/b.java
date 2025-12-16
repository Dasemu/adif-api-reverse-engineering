package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriber f6056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RolloutsState f6057c;

    public /* synthetic */ b(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState, int i) {
        this.f6055a = i;
        this.f6056b = rolloutsStateSubscriber;
        this.f6057c = rolloutsState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6055a) {
            case 0:
                RolloutsStateSubscriptionsHandler.b(this.f6056b, this.f6057c);
                return;
            default:
                RolloutsStateSubscriptionsHandler.c(this.f6056b, this.f6057c);
                return;
        }
    }
}
