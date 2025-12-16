package b0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4155a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f4157c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0258c(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f4157c = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0258c c0258c = new C0258c(this.f4157c, continuation);
        c0258c.f4156b = obj;
        return c0258c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0258c) create((AbstractC0262g) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4155a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC0262g abstractC0262g = (AbstractC0262g) this.f4156b;
            this.f4155a = 1;
            obj = this.f4157c.invoke(abstractC0262g, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC0262g abstractC0262g2 = (AbstractC0262g) obj;
        ((C0257b) abstractC0262g2).f4154b.set(true);
        return abstractC0262g2;
    }
}
