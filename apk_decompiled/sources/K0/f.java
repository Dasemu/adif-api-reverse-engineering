package K0;

import a.AbstractC0105a;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f995a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(2, continuation);
        this.f995a = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f995a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, r3.G] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        g gVar = this.f995a;
        synchronized (gVar) {
            if (!gVar.f1006l || gVar.f1007m) {
                return Unit.INSTANCE;
            }
            try {
                gVar.e0();
            } catch (IOException unused) {
                gVar.f1008n = true;
            }
            try {
                if (gVar.i >= 2000) {
                    gVar.g0();
                }
            } catch (IOException unused2) {
                gVar.f1009o = true;
                gVar.f1004j = AbstractC0105a.c(new Object());
            }
            return Unit.INSTANCE;
        }
    }
}
