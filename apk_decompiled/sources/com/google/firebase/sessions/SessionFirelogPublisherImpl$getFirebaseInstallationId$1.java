package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {}, l = {113}, m = "getFirebaseInstallationId", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SessionFirelogPublisherImpl$getFirebaseInstallationId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$getFirebaseInstallationId$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, Continuation<? super SessionFirelogPublisherImpl$getFirebaseInstallationId$1> continuation) {
        super(continuation);
        this.this$0 = sessionFirelogPublisherImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object firebaseInstallationId;
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        firebaseInstallationId = this.this$0.getFirebaseInstallationId(this);
        return firebaseInstallationId;
    }
}
