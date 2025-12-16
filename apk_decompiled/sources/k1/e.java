package k1;

import com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class e extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public GetDepartureCirculationsUseCase f7042a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetDepartureCirculationsUseCase f7044c;

    /* renamed from: d, reason: collision with root package name */
    public int f7045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GetDepartureCirculationsUseCase getDepartureCirculationsUseCase, Continuation continuation) {
        super(continuation);
        this.f7044c = getDepartureCirculationsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mapToCirculation;
        this.f7043b = obj;
        this.f7045d |= IntCompanionObject.MIN_VALUE;
        mapToCirculation = this.f7044c.mapToCirculation(null, false, null, this);
        return mapToCirculation;
    }
}
