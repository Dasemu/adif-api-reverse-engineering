package Y;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.coroutines.CompletableDeferred;

/* loaded from: classes.dex */
public final class u extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f2103a;

    /* renamed from: b, reason: collision with root package name */
    public F f2104b;

    /* renamed from: c, reason: collision with root package name */
    public CompletableDeferred f2105c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f2107e;

    /* renamed from: f, reason: collision with root package name */
    public int f2108f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(F f2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2107e = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2106d = obj;
        this.f2108f |= IntCompanionObject.MIN_VALUE;
        return F.c(this.f2107e, null, this);
    }
}
