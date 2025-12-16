package Y;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class B extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f2032a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2033b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2034c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f2035d;

    /* renamed from: e, reason: collision with root package name */
    public int f2036e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(F f2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2035d = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2034c = obj;
        this.f2036e |= IntCompanionObject.MIN_VALUE;
        return this.f2035d.i(this);
    }
}
