package I0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f765a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0.j f767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, S0.j jVar, Continuation continuation) {
        super(2, continuation);
        this.f767c = jVar;
        this.f768d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.f768d, this.f767c, continuation);
        lVar.f766b = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f765a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f766b;
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        p pVar = this.f768d;
        S0.j jVar = this.f767c;
        async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, immediate, null, new k(pVar, jVar, null), 2, null);
        U0.b bVar = jVar.f1479c;
        if (bVar instanceof U0.a) {
            W0.f.c(((U0.a) bVar).f1775b).a(async$default);
        }
        this.f765a = 1;
        Object await = async$default.await(this);
        return await == coroutine_suspended ? coroutine_suspended : await;
    }
}
