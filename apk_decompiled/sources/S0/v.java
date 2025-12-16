package S0;

import androidx.lifecycle.C;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f1532a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Continuation continuation) {
        super(2, continuation);
        this.f1532a = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.f1532a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        w wVar = this.f1532a;
        u uVar = wVar.f1535c;
        if (uVar != null) {
            Job.DefaultImpls.cancel$default(uVar.f1531e, (CancellationException) null, 1, (Object) null);
            C c4 = uVar.f1530d;
            U0.a aVar = uVar.f1529c;
            if (aVar != null) {
                c4.c(aVar);
            }
            c4.c(uVar);
        }
        wVar.f1535c = null;
        return Unit.INSTANCE;
    }
}
