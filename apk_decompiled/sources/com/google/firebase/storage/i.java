package com.google.firebase.storage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6075a;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f6075a.setException(exc);
    }
}
