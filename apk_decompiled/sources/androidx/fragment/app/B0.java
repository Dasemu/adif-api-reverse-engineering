package androidx.fragment.app;

import android.transition.Transition;

/* loaded from: classes.dex */
public final class B0 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC0161n f2985a;

    public B0(RunnableC0161n runnableC0161n) {
        this.f2985a = runnableC0161n;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f2985a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
