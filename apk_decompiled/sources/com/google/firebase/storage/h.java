package com.google.firebase.storage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6074a;

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f6074a.setResult(obj);
    }
}
