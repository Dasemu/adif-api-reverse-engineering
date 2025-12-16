package Y;

import a.AbstractC0105a;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: Y.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088d extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f2068a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f2069b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2070c;

    /* renamed from: d, reason: collision with root package name */
    public int f2071d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2070c = obj;
        this.f2071d |= IntCompanionObject.MIN_VALUE;
        return AbstractC0105a.a(null, null, this);
    }
}
