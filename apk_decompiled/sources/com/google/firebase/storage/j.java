package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCanceledListener;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements OnCanceledListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f6076a;

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f6076a.cancel();
    }
}
