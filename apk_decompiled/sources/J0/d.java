package J0;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.coroutines.sync.Semaphore;

/* loaded from: classes.dex */
public final class d extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f922a;

    /* renamed from: b, reason: collision with root package name */
    public Semaphore f923b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f924c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f925d;

    /* renamed from: e, reason: collision with root package name */
    public int f926e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f925d = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f924c = obj;
        this.f926e |= IntCompanionObject.MIN_VALUE;
        return this.f925d.a(this);
    }
}
