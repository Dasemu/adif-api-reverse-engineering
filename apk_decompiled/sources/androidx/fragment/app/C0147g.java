package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147g extends I0 {

    /* renamed from: c, reason: collision with root package name */
    public final C0149h f3121c;

    public C0147g(C0149h animationInfo) {
        Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
        this.f3121c = animationInfo;
    }

    @Override // androidx.fragment.app.I0
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        C0149h c0149h = this.f3121c;
        J0 j02 = c0149h.f3181a;
        View view = j02.f3038c.mView;
        view.clearAnimation();
        container.endViewTransition(view);
        c0149h.f3181a.c(this);
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Animation from operation " + j02 + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.I0
    public final void c(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        C0149h c0149h = this.f3121c;
        boolean a2 = c0149h.a();
        J0 j02 = c0149h.f3181a;
        if (a2) {
            j02.c(this);
            return;
        }
        Context context = container.getContext();
        View view = j02.f3038c.mView;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Q b4 = c0149h.b(context);
        if (b4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) b4.f3066a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (j02.f3036a != M0.f3054a) {
            view.startAnimation(animation);
            j02.c(this);
            return;
        }
        container.startViewTransition(view);
        S s4 = new S(animation, container, view);
        s4.setAnimationListener(new AnimationAnimationListenerC0145f(j02, container, view, this));
        view.startAnimation(s4);
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Animation from operation " + j02 + " has started.");
        }
    }
}
