package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b.C0253b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153j extends I0 {

    /* renamed from: c, reason: collision with root package name */
    public final C0149h f3135c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f3136d;

    public C0153j(C0149h animatorInfo) {
        Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
        this.f3135c = animatorInfo;
    }

    @Override // androidx.fragment.app.I0
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        AnimatorSet animatorSet = this.f3136d;
        J0 j02 = this.f3135c.f3181a;
        if (animatorSet == null) {
            j02.c(this);
            return;
        }
        if (j02.f3042g) {
            C0157l.f3142a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (AbstractC0158l0.M(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(j02);
            sb.append(" has been canceled");
            sb.append(j02.f3042g ? " with seeking." : ".");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // androidx.fragment.app.I0
    public final void c(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        J0 j02 = this.f3135c.f3181a;
        AnimatorSet animatorSet = this.f3136d;
        if (animatorSet == null) {
            j02.c(this);
            return;
        }
        animatorSet.start();
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Animator from operation " + j02 + " has started.");
        }
    }

    @Override // androidx.fragment.app.I0
    public final void d(C0253b backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
        J0 j02 = this.f3135c.f3181a;
        AnimatorSet animatorSet = this.f3136d;
        if (animatorSet == null) {
            j02.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !j02.f3038c.mTransitioning) {
            return;
        }
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + j02);
        }
        long a2 = C0155k.f3138a.a(animatorSet);
        long j4 = backEvent.f4108c * ((float) a2);
        if (j4 == 0) {
            j4 = 1;
        }
        if (j4 == a2) {
            j4 = a2 - 1;
        }
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j4 + " for Animator " + animatorSet + " on operation " + j02);
        }
        C0157l.f3142a.b(animatorSet, j4);
    }

    @Override // androidx.fragment.app.I0
    public final void e(ViewGroup container) {
        C0153j c0153j;
        Intrinsics.checkNotNullParameter(container, "container");
        C0149h c0149h = this.f3135c;
        if (c0149h.a()) {
            return;
        }
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Q b4 = c0149h.b(context);
        this.f3136d = b4 != null ? (AnimatorSet) b4.f3067b : null;
        J0 j02 = c0149h.f3181a;
        K k4 = j02.f3038c;
        boolean z3 = j02.f3036a == M0.f3056c;
        View view = k4.mView;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f3136d;
        if (animatorSet != null) {
            c0153j = this;
            animatorSet.addListener(new C0151i(container, view, z3, j02, c0153j));
        } else {
            c0153j = this;
        }
        AnimatorSet animatorSet2 = c0153j.f3136d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
