package C1;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public a f344a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f346c;

    /* renamed from: d, reason: collision with root package name */
    public int f347d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Continuation continuation) {
        super(continuation);
        this.f346c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f345b = obj;
        this.f347d |= IntCompanionObject.MIN_VALUE;
        return this.f346c.a(null, this);
    }
}
