package androidx.fragment.app;

import android.transition.Transition;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends AbstractC0159m {

    /* renamed from: b, reason: collision with root package name */
    public final Object f3220b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3221c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(J0 operation, boolean z3, boolean z4) {
        super(operation);
        Intrinsics.checkNotNullParameter(operation, "operation");
        M0 m02 = operation.f3036a;
        M0 m03 = M0.f3055b;
        K k4 = operation.f3038c;
        this.f3220b = m02 == m03 ? z3 ? k4.getReenterTransition() : k4.getEnterTransition() : z3 ? k4.getReturnTransition() : k4.getExitTransition();
        this.f3221c = operation.f3036a == m03 ? z3 ? k4.getAllowReturnTransitionOverlap() : k4.getAllowEnterTransitionOverlap() : true;
        this.f3222d = z4 ? z3 ? k4.getSharedElementReturnTransition() : k4.getSharedElementEnterTransition() : null;
    }

    public final E0 b() {
        Object obj = this.f3220b;
        E0 c4 = c(obj);
        Object obj2 = this.f3222d;
        E0 c5 = c(obj2);
        if (c4 == null || c5 == null || c4 == c5) {
            return c4 == null ? c5 : c4;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f3181a.f3038c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final E0 c(Object obj) {
        if (obj == null) {
            return null;
        }
        C0 c02 = x0.f3272a;
        if (obj instanceof Transition) {
            return c02;
        }
        E0 e02 = x0.f3273b;
        if (e02 != null && e02.g(obj)) {
            return e02;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f3181a.f3038c + " is not a valid framework Transition or AndroidX Transition");
    }
}
