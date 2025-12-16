package Y;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final SuspendLambda f2085a;

    /* renamed from: b, reason: collision with root package name */
    public final CompletableDeferred f2086b;

    /* renamed from: c, reason: collision with root package name */
    public final G f2087c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f2088d;

    /* JADX WARN: Multi-variable type inference failed */
    public l(Function2 transform, CompletableDeferred ack, G g4, CoroutineContext callerContext) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(ack, "ack");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        this.f2085a = (SuspendLambda) transform;
        this.f2086b = ack;
        this.f2087c = g4;
        this.f2088d = callerContext;
    }
}
