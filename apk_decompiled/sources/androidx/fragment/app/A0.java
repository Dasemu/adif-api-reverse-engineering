package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class A0 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2979b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2980c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0 f2982e;

    public A0(C0 c02, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2982e = c02;
        this.f2978a = obj;
        this.f2979b = arrayList;
        this.f2980c = obj2;
        this.f2981d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C0 c02 = this.f2982e;
        Object obj = this.f2978a;
        if (obj != null) {
            c02.A(obj, this.f2979b, null);
        }
        Object obj2 = this.f2980c;
        if (obj2 != null) {
            c02.A(obj2, this.f2981d, null);
        }
    }
}
