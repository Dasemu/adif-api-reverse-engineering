package com.google.firebase.sessions;

import android.util.Log;
import b0.AbstractC0262g;
import b0.C0257b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lb0/g;", "", "exception", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SessionDatastoreImpl$firebaseSessionDataFlow$1 extends SuspendLambda implements Function3<FlowCollector<? super AbstractC0262g>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SessionDatastoreImpl$firebaseSessionDataFlow$1(Continuation<? super SessionDatastoreImpl$firebaseSessionDataFlow$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.L$1);
            C0257b c0257b = new C0257b(true);
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(c0257b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super AbstractC0262g> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        SessionDatastoreImpl$firebaseSessionDataFlow$1 sessionDatastoreImpl$firebaseSessionDataFlow$1 = new SessionDatastoreImpl$firebaseSessionDataFlow$1(continuation);
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$0 = flowCollector;
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$1 = th;
        return sessionDatastoreImpl$firebaseSessionDataFlow$1.invokeSuspend(Unit.INSTANCE);
    }
}
