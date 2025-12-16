package k1;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.circulation.GetSeveralPathsUseCase;
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
    public int f7046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetSeveralPathsUseCase f7047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7048c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(GetSeveralPathsUseCase getSeveralPathsUseCase, String str, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f7047b = getSeveralPathsUseCase;
        this.f7048c = str;
        this.f7049d = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f7047b, this.f7048c, this.f7049d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CirculationRepository circulationRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        circulationRepository = this.f7047b.circulationRepository;
        this.f7046a = 1;
        Object severalPaths = circulationRepository.severalPaths(this.f7048c, this.f7049d, this);
        return severalPaths == coroutine_suspended ? coroutine_suspended : severalPaths;
    }
}
