package q1;

import com.adif.elcanomovil.repositories.circulation.DefaultCirculationRepository;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DefaultCirculationRepository f8152a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultCirculationRepository f8154c;

    /* renamed from: d, reason: collision with root package name */
    public int f8155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0558a(DefaultCirculationRepository defaultCirculationRepository, Continuation continuation) {
        super(continuation);
        this.f8154c = defaultCirculationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8153b = obj;
        this.f8155d |= IntCompanionObject.MIN_VALUE;
        return this.f8154c.arrivals(null, null, 0, false, this);
    }
}
