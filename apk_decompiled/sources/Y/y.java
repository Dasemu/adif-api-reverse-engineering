package Y;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class y extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public F f2127a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f2129c;

    /* renamed from: d, reason: collision with root package name */
    public int f2130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(F f2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2129c = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2128b = obj;
        this.f2130d |= IntCompanionObject.MIN_VALUE;
        return this.f2129c.f(this);
    }
}
