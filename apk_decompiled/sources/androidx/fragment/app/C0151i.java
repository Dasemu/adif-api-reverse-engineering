package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3129c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ J0 f3130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0153j f3131e;

    public C0151i(ViewGroup viewGroup, View view, boolean z3, J0 j02, C0153j c0153j) {
        this.f3127a = viewGroup;
        this.f3128b = view;
        this.f3129c = z3;
        this.f3130d = j02;
        this.f3131e = c0153j;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        ViewGroup viewGroup = this.f3127a;
        View viewToAnimate = this.f3128b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z3 = this.f3129c;
        J0 j02 = this.f3130d;
        if (z3) {
            M0 m02 = j02.f3036a;
            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
            m02.a(viewToAnimate, viewGroup);
        }
        C0153j c0153j = this.f3131e;
        c0153j.f3135c.f3181a.c(c0153j);
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Animator from operation " + j02 + " has ended.");
        }
    }
}
