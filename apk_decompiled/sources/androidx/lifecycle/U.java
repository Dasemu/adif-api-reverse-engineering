package androidx.lifecycle;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final C0189j f3326a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f3327b;

    public U(C0189j target, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3326a = target;
        this.f3327b = context.plus(Dispatchers.getMain().getImmediate());
    }
}
