package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3334a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0182d f3336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0180c(C0182d c0182d, Continuation continuation) {
        super(2, continuation);
        this.f3336c = c0182d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0180c c0180c = new C0180c(this.f3336c, continuation);
        c0180c.f3335b = obj;
        return c0180c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0180c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3334a;
        C0182d c0182d = this.f3336c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            U u3 = new U(c0182d.f3344a, ((CoroutineScope) this.f3335b).getCoroutineContext());
            ?? r6 = c0182d.f3345b;
            this.f3334a = 1;
            if (r6.invoke(u3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        c0182d.f3347d.invoke();
        return Unit.INSTANCE;
    }
}
