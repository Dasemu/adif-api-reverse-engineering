package p1;

import com.adif.elcanomovil.observers.ComposedApplicationObserver;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0550a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f8113a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComposedApplicationObserver f8115c;

    /* renamed from: d, reason: collision with root package name */
    public int f8116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0550a(ComposedApplicationObserver composedApplicationObserver, Continuation continuation) {
        super(continuation);
        this.f8115c = composedApplicationObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8114b = obj;
        this.f8116d |= IntCompanionObject.MIN_VALUE;
        return this.f8115c.start(this);
    }
}
