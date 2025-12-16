package k1;

import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7037a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetDepartureCirculationsUseCase f7039c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CirculationType f7040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TrainType f7041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GetDepartureCirculationsUseCase getDepartureCirculationsUseCase, CirculationType circulationType, TrainType trainType, Continuation continuation) {
        super(2, continuation);
        this.f7039c = getDepartureCirculationsUseCase;
        this.f7040d = circulationType;
        this.f7041e = trainType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f7039c, this.f7040d, this.f7041e, continuation);
        dVar.f7038b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mapToCirculation;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7037a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) this.f7038b;
        boolean z3 = this.f7040d == CirculationType.DEPARTURE;
        this.f7037a = 1;
        mapToCirculation = this.f7039c.mapToCirculation(list, z3, this.f7041e, this);
        return mapToCirculation == coroutine_suspended ? coroutine_suspended : mapToCirculation;
    }
}
