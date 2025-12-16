package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class T extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f3324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0189j f3325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u3, C0189j c0189j, Continuation continuation) {
        super(2, continuation);
        this.f3324b = u3;
        this.f3325c = c0189j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new T(this.f3324b, this.f3325c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3323a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        C0189j c0189j = this.f3324b.f3326a;
        this.f3323a = 1;
        Object m4 = c0189j.m(this.f3325c, this);
        return m4 == coroutine_suspended ? coroutine_suspended : m4;
    }
}
