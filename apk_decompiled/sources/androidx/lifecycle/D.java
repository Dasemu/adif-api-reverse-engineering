package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes.dex */
public final class D extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f3290b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(E e4, Continuation continuation) {
        super(2, continuation);
        this.f3290b = e4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        D d4 = new D(this.f3290b, continuation);
        d4.f3289a = obj;
        return d4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f3289a;
        E e4 = this.f3290b;
        C c4 = e4.f3291a;
        if (c4.b().compareTo(B.f3281b) >= 0) {
            c4.a(e4);
        } else {
            JobKt__JobKt.cancel$default(coroutineScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
