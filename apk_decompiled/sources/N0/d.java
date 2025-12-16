package N0;

import M0.m;
import S0.o;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f1148c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f1149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S0.j f1150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1151f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f1152g;
    public final /* synthetic */ I0.d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, S0.j jVar, Object obj, Ref.ObjectRef objectRef3, I0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f1147b = iVar;
        this.f1148c = objectRef;
        this.f1149d = objectRef2;
        this.f1150e = jVar;
        this.f1151f = obj;
        this.f1152g = objectRef3;
        this.h = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f1147b, this.f1148c, this.f1149d, this.f1150e, this.f1151f, this.f1152g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1146a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        m mVar = (m) this.f1148c.element;
        I0.c cVar = (I0.c) this.f1149d.element;
        o oVar = (o) this.f1152g.element;
        this.f1146a = 1;
        Object a2 = i.a(this.f1147b, mVar, cVar, this.f1150e, this.f1151f, oVar, this.h, this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
