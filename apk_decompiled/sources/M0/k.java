package M0;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class k extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public l f1098a;

    /* renamed from: b, reason: collision with root package name */
    public K0.i f1099b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1100c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f1102e;

    /* renamed from: f, reason: collision with root package name */
    public int f1103f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1102e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1101d = obj;
        this.f1103f |= IntCompanionObject.MIN_VALUE;
        return this.f1102e.a(this);
    }
}
