package Y;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class w extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f2116a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2117b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2118c;

    /* renamed from: d, reason: collision with root package name */
    public Ref.ObjectRef f2119d;

    /* renamed from: e, reason: collision with root package name */
    public F f2120e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f2122g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2122g = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2121f = obj;
        this.h |= IntCompanionObject.MIN_VALUE;
        return this.f2122g.a(null, this);
    }
}
