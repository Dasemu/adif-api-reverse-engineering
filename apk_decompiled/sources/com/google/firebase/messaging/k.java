package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Continuation, FirebaseInstanceIdInternal.NewTokenListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6017a;

    public /* synthetic */ k(Object obj) {
        this.f6017a = obj;
    }

    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
    public void onNewToken(String str) {
        ((FirebaseMessaging) this.f6017a).lambda$new$0(str);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return GmsRpc.a((GmsRpc) this.f6017a, task);
    }
}
