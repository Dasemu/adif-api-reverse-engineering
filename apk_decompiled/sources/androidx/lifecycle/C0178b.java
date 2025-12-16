package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0182d f3333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178b(C0182d c0182d, Continuation continuation) {
        super(2, continuation);
        this.f3333b = c0182d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0178b(this.f3333b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0178b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3332a;
        C0182d c0182d = this.f3333b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            c0182d.getClass();
            this.f3332a = 1;
            if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (c0182d.f3344a.f3314c <= 0) {
            Job job = c0182d.f3348e;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            c0182d.f3348e = null;
        }
        return Unit.INSTANCE;
    }
}
