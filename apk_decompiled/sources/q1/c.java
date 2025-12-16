package q1;

import com.adif.elcanomovil.repositories.circulation.DefaultCirculationRepository;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DefaultCirculationRepository f8160a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultCirculationRepository f8162c;

    /* renamed from: d, reason: collision with root package name */
    public int f8163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DefaultCirculationRepository defaultCirculationRepository, Continuation continuation) {
        super(continuation);
        this.f8162c = defaultCirculationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8161b = obj;
        this.f8163d |= IntCompanionObject.MIN_VALUE;
        return this.f8162c.departures(null, null, 0, false, this);
    }
}
