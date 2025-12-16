package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3066a;

    /* renamed from: b, reason: collision with root package name */
    public final Cloneable f3067b;

    public Q(AbstractC0158l0 fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f3066a = fragmentManager;
        this.f3067b = new CopyOnWriteArrayList();
    }

    public void a(K f2, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        K k4 = ((AbstractC0158l0) this.f3066a).f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.a(f2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public void b(K f2, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        AbstractC0158l0 abstractC0158l0 = (AbstractC0158l0) this.f3066a;
        P p = abstractC0158l0.f3177w.f3075b;
        K k4 = abstractC0158l0.f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.b(f2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public void c(K f2, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        K k4 = ((AbstractC0158l0) this.f3066a).f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.c(f2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public void d(K f2, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        K k4 = ((AbstractC0158l0) this.f3066a).f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.d(f2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public void e(K f2, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        K k4 = ((AbstractC0158l0) this.f3066a).f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.e(f2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public void f(K f2, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        K k4 = ((AbstractC0158l0) this.f3066a).f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.f(f2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public void g(K f2, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        AbstractC0158l0 abstractC0158l0 = (AbstractC0158l0) this.f3066a;
        P p = abstractC0158l0.f3177w.f3075b;
        K k4 = abstractC0158l0.f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.g(f2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public void h(K f2, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        K k4 = ((AbstractC0158l0) this.f3066a).f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.h(f2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public void i(K f2, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        K k4 = ((AbstractC0158l0) this.f3066a).f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.i(f2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public void j(K f2, Bundle outState, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        K k4 = ((AbstractC0158l0) this.f3066a).f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.j(f2, outState, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public void k(K f2, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        K k4 = ((AbstractC0158l0) this.f3066a).f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.k(f2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public void l(K f2, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        K k4 = ((AbstractC0158l0) this.f3066a).f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.l(f2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public void m(K f2, View v3, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        Intrinsics.checkNotNullParameter(v3, "v");
        K k4 = ((AbstractC0158l0) this.f3066a).f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.m(f2, v3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h cb = y3.f3081a;
                AbstractC0158l0 abstractC0158l0 = (AbstractC0158l0) this.f3066a;
                if (f2 == ((K) cb.f1413a)) {
                    Q q4 = abstractC0158l0.f3170o;
                    q4.getClass();
                    Intrinsics.checkNotNullParameter(cb, "cb");
                    synchronized (((CopyOnWriteArrayList) q4.f3067b)) {
                        try {
                            int size = ((CopyOnWriteArrayList) q4.f3067b).size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                }
                                if (((Y) ((CopyOnWriteArrayList) q4.f3067b).get(i)).f3081a == cb) {
                                    ((CopyOnWriteArrayList) q4.f3067b).remove(i);
                                    break;
                                }
                                i++;
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ((androidx.viewpager2.adapter.f) cb.f1415c).addViewToContainer(v3, (FrameLayout) cb.f1414b);
                } else {
                    continue;
                }
            }
        }
    }

    public void n(K f2, boolean z3) {
        Intrinsics.checkNotNullParameter(f2, "f");
        K k4 = ((AbstractC0158l0) this.f3066a).f3179y;
        if (k4 != null) {
            AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f3170o.n(f2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3067b).iterator();
        while (it.hasNext()) {
            Y y3 = (Y) it.next();
            if (z3) {
                y3.getClass();
            } else {
                R0.h hVar = y3.f3081a;
            }
        }
    }

    public Q(Animation animation) {
        this.f3066a = animation;
        this.f3067b = null;
    }

    public Q(Animator animator) {
        this.f3066a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3067b = animatorSet;
        animatorSet.play(animator);
    }
}
