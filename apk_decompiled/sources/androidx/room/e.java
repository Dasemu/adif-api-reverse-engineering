package androidx.room;

import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3966a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3968c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f3969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String[] f3970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Callable f3971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z3, u uVar, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.f3968c = z3;
        this.f3969d = uVar;
        this.f3970e = strArr;
        this.f3971f = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f3968c, this.f3969d, this.f3970e, this.f3971f, continuation);
        eVar.f3967b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3966a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f3967b;
            Callable callable = this.f3971f;
            d dVar = new d(this.f3968c, this.f3969d, flowCollector, this.f3970e, callable, null);
            this.f3966a = 1;
            if (CoroutineScopeKt.coroutineScope(dVar, this) == coroutine_suspended) {
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
