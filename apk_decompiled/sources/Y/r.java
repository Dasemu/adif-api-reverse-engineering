package Y;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class r extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2096a;

    /* renamed from: b, reason: collision with root package name */
    public int f2097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1.b f2098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1.b bVar, Continuation continuation) {
        super(continuation);
        this.f2098c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2096a = obj;
        this.f2097b |= IntCompanionObject.MIN_VALUE;
        return this.f2098c.emit(null, this);
    }
}
