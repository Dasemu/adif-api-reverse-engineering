package Y;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class C extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public F f2037a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2038b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2039c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f2041e;

    /* renamed from: f, reason: collision with root package name */
    public int f2042f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(F f2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2041e = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2040d = obj;
        this.f2042f |= IntCompanionObject.MIN_VALUE;
        return this.f2041e.j(null, null, this);
    }
}
