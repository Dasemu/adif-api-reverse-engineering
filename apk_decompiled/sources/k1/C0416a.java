package k1;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7017a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7018b;

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.SuspendLambda, k1.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ?? suspendLambda = new SuspendLambda(2, continuation);
        suspendLambda.f7018b = obj;
        return suspendLambda;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0416a) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7017a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f7018b;
            AsyncResult success = AsyncResult.INSTANCE.success(CollectionsKt.emptyList());
            this.f7017a = 1;
            if (flowCollector.emit(success, this) == coroutine_suspended) {
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
