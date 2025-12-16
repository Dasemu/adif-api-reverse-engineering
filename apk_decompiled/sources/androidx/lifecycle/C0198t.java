package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3429a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Flow f3431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0198t(Flow flow, Continuation continuation) {
        super(2, continuation);
        this.f3431c = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0198t c0198t = new C0198t(this.f3431c, continuation);
        c0198t.f3430b = obj;
        return c0198t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0198t) create((U) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3429a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C1.b bVar = new C1.b((U) this.f3430b, 2);
            this.f3429a = 1;
            if (this.f3431c.collect(bVar, this) == coroutine_suspended) {
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
}
