package Y;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class z extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public F f2131a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f2133c;

    /* renamed from: d, reason: collision with root package name */
    public int f2134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(F f2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2133c = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2132b = obj;
        this.f2134d |= IntCompanionObject.MIN_VALUE;
        return this.f2133c.g(this);
    }
}
