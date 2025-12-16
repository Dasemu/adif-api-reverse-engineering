package Y;

import a.AbstractC0105a;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: Y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2065a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f2067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0087c(List list, Continuation continuation) {
        super(2, continuation);
        this.f2067c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0087c c0087c = new C0087c(this.f2067c, continuation);
        c0087c.f2066b = obj;
        return c0087c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0087c) create((x) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2065a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            x xVar = (x) this.f2066b;
            this.f2065a = 1;
            if (AbstractC0105a.a(this.f2067c, xVar, this) == coroutine_suspended) {
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
