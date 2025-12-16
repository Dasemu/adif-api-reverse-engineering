package I0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0.j f761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, S0.j jVar, Continuation continuation) {
        super(2, continuation);
        this.f760b = pVar;
        this.f761c = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f760b, this.f761c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f759a;
        p pVar = this.f760b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f759a = 1;
            obj = p.a(pVar, this.f761c, 0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((S0.k) obj) instanceof S0.f) {
            pVar.getClass();
        }
        return obj;
    }
}
