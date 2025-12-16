package com.adif.elcanomovil.uiSubscriptions.create;

import android.view.View;
import com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5302a;

    public /* synthetic */ a(int i) {
        this.f5302a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5302a) {
            case 0:
                SubscriptionCreationFragment.f(view);
                return;
            default:
                SubscriptionHomeFragment.h(view);
                return;
        }
    }
}
