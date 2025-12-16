package I0;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S0.j f777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f778c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T0.h f779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bitmap f781f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(S0.j jVar, p pVar, T0.h hVar, d dVar, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f777b = jVar;
        this.f778c = pVar;
        this.f779d = hVar;
        this.f780e = dVar;
        this.f781f = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f777b, this.f778c, this.f779d, this.f780e, this.f781f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f776a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        List list = this.f778c.h;
        boolean z3 = this.f781f != null;
        S0.j jVar = this.f777b;
        N0.l lVar = new N0.l(jVar, list, 0, jVar, this.f779d, this.f780e, z3);
        this.f776a = 1;
        Object b4 = lVar.b(jVar, this);
        return b4 == coroutine_suspended ? coroutine_suspended : b4;
    }
}
