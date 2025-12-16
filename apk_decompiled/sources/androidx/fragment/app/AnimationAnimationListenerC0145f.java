package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0145f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f3116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3117b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3118c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0147g f3119d;

    public AnimationAnimationListenerC0145f(J0 j02, ViewGroup viewGroup, View view, C0147g c0147g) {
        this.f3116a = j02;
        this.f3117b = viewGroup;
        this.f3118c = view;
        this.f3119d = c0147g;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        View view = this.f3118c;
        C0147g c0147g = this.f3119d;
        ViewGroup viewGroup = this.f3117b;
        viewGroup.post(new RunnableC0143e(viewGroup, view, c0147g, 0));
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f3116a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f3116a + " has reached onAnimationStart.");
        }
    }
}
