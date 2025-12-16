package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.messaging.Store;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements SuccessContinuation, RequestDeduplicator.GetTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f6007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Store.Token f6009c;

    public /* synthetic */ f(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.f6007a = firebaseMessaging;
        this.f6008b = str;
        this.f6009c = token;
    }

    @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
    public Task start() {
        Task lambda$blockingGetToken$10;
        lambda$blockingGetToken$10 = this.f6007a.lambda$blockingGetToken$10(this.f6008b, this.f6009c);
        return lambda$blockingGetToken$10;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Task lambda$blockingGetToken$9;
        lambda$blockingGetToken$9 = this.f6007a.lambda$blockingGetToken$9(this.f6008b, this.f6009c, (String) obj);
        return lambda$blockingGetToken$9;
    }
}
