package k1;

import com.adif.elcanomovil.domain.repositories.compositions.CompositionsRepository;
import com.adif.elcanomovil.domain.usecases.circulation.GetCompositionsUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetCompositionsUseCase f7021c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f7024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f7025g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z3, GetCompositionsUseCase getCompositionsUseCase, String str, String str2, long j4, String str3, Continuation continuation) {
        super(2, continuation);
        this.f7020b = z3;
        this.f7021c = getCompositionsUseCase;
        this.f7022d = str;
        this.f7023e = str2;
        this.f7024f = j4;
        this.f7025g = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f7020b, this.f7021c, this.f7022d, this.f7023e, this.f7024f, this.f7025g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CompositionsRepository compositionsRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7019a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.f7020b) {
                return FlowKt.flow(new SuspendLambda(2, null));
            }
            compositionsRepository = this.f7021c.compositionsRepository;
            this.f7019a = 1;
            obj = compositionsRepository.compositions(this.f7022d, this.f7023e, this.f7024f, this.f7025g, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (Flow) obj;
    }
}
