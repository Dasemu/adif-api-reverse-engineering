package Y;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class v extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public F f2109a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2110b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f2111c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2112d;

    /* renamed from: e, reason: collision with root package name */
    public x f2113e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f2114f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2115g;
    public final /* synthetic */ F h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(F f2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2115g = obj;
        this.i |= IntCompanionObject.MIN_VALUE;
        return this.h.e(this);
    }
}
