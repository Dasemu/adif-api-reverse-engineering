package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6006b;

    public /* synthetic */ e(String str, int i) {
        this.f6005a = i;
        this.f6006b = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        Task lambda$subscribeToTopic$7;
        Task lambda$unsubscribeFromTopic$8;
        int i = this.f6005a;
        String str = this.f6006b;
        TopicsSubscriber topicsSubscriber = (TopicsSubscriber) obj;
        switch (i) {
            case 0:
                lambda$subscribeToTopic$7 = FirebaseMessaging.lambda$subscribeToTopic$7(str, topicsSubscriber);
                return lambda$subscribeToTopic$7;
            default:
                lambda$unsubscribeFromTopic$8 = FirebaseMessaging.lambda$unsubscribeFromTopic$8(str, topicsSubscriber);
                return lambda$unsubscribeFromTopic$8;
        }
    }
}
