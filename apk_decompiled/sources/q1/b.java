package q1;

import com.adif.elcanomovil.repositories.circulation.DefaultCirculationRepository;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DefaultCirculationRepository f8156a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultCirculationRepository f8158c;

    /* renamed from: d, reason: collision with root package name */
    public int f8159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DefaultCirculationRepository defaultCirculationRepository, Continuation continuation) {
        super(continuation);
        this.f8158c = defaultCirculationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8157b = obj;
        this.f8159d |= IntCompanionObject.MIN_VALUE;
        return this.f8158c.betweenStations(null, null, null, 0, false, this);
    }
}
