package W0;

import androidx.lifecycle.C;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C f1881a;

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f1882b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1883c;

    /* renamed from: d, reason: collision with root package name */
    public int f1884d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1883c = obj;
        this.f1884d |= IntCompanionObject.MIN_VALUE;
        return c.a(null, this);
    }
}
