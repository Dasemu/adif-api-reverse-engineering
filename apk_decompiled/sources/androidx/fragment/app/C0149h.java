package androidx.fragment.app;

import a.AbstractC0106b;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.adif.elcanomovil.R;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149h extends AbstractC0159m {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3124b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3125c;

    /* renamed from: d, reason: collision with root package name */
    public Q f3126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0149h(J0 operation, boolean z3) {
        super(operation);
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f3124b = z3;
    }

    public final Q b(Context context) {
        Animation loadAnimation;
        Q q4;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f3125c) {
            return this.f3126d;
        }
        J0 j02 = this.f3181a;
        K k4 = j02.f3038c;
        boolean z3 = j02.f3036a == M0.f3055b;
        int nextTransition = k4.getNextTransition();
        int popEnterAnim = this.f3124b ? z3 ? k4.getPopEnterAnim() : k4.getPopExitAnim() : z3 ? k4.getEnterAnim() : k4.getExitAnim();
        k4.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = k4.mContainer;
        Q q5 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            k4.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = k4.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = k4.onCreateAnimation(nextTransition, z3, popEnterAnim);
            if (onCreateAnimation != null) {
                q5 = new Q(onCreateAnimation);
            } else {
                Animator onCreateAnimator = k4.onCreateAnimator(nextTransition, z3, popEnterAnim);
                if (onCreateAnimator != null) {
                    q5 = new Q(onCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z3 ? AbstractC0106b.I(context, android.R.attr.activityOpenEnterAnimation) : AbstractC0106b.I(context, android.R.attr.activityOpenExitAnimation) : z3 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z3 ? AbstractC0106b.I(context, android.R.attr.activityCloseEnterAnimation) : AbstractC0106b.I(context, android.R.attr.activityCloseExitAnimation) : z3 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z3 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                    }
                    if (popEnterAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                } catch (Resources.NotFoundException e4) {
                                    throw e4;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    q4 = new Q(loadAnimation);
                                    q5 = q4;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                            if (loadAnimator != null) {
                                q4 = new Q(loadAnimator);
                                q5 = q4;
                            }
                        } catch (RuntimeException e5) {
                            if (equals) {
                                throw e5;
                            }
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                            if (loadAnimation2 != null) {
                                q5 = new Q(loadAnimation2);
                            }
                        }
                    }
                }
            }
        }
        this.f3126d = q5;
        this.f3125c = true;
        return q5;
    }
}
