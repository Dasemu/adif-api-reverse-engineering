package B0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.E0;
import androidx.fragment.app.RunnableC0141d;
import androidx.fragment.app.RunnableC0161n;
import androidx.fragment.app.RunnableC0175z;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* renamed from: B0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0036n extends E0 {
    @Override // androidx.fragment.app.E0
    public final void a(View view, Object obj) {
        ((x) obj).b(view);
    }

    @Override // androidx.fragment.app.E0
    public final void b(Object obj, ArrayList arrayList) {
        x xVar = (x) obj;
        if (xVar == null) {
            return;
        }
        int i = 0;
        if (xVar instanceof D) {
            D d4 = (D) xVar;
            int size = d4.f93E.size();
            while (i < size) {
                b(d4.O(i), arrayList);
                i++;
            }
            return;
        }
        if (E0.k(xVar.f187e) && E0.k(xVar.f188f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                xVar.b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.E0
    public final void c(Object obj) {
        u uVar = (u) obj;
        uVar.g();
        uVar.f169d.a((float) (uVar.f172g.f203x + 1));
    }

    @Override // androidx.fragment.app.E0
    public final void d(Object obj, RunnableC0141d runnableC0141d) {
        u uVar = (u) obj;
        uVar.f171f = runnableC0141d;
        uVar.g();
        uVar.f169d.a(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.fragment.app.E0
    public final void e(ViewGroup viewGroup, Object obj) {
        B.a(viewGroup, (x) obj);
    }

    @Override // androidx.fragment.app.E0
    public final boolean g(Object obj) {
        return obj instanceof x;
    }

    @Override // androidx.fragment.app.E0
    public final Object h(Object obj) {
        if (obj != null) {
            return ((x) obj).clone();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, B0.A] */
    @Override // androidx.fragment.app.E0
    public final Object i(ViewGroup viewGroup, Object obj) {
        x xVar = (x) obj;
        ArrayList arrayList = B.f90c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!xVar.t()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        x clone = xVar.clone();
        D d4 = new D();
        d4.N(clone);
        B.c(viewGroup, d4);
        viewGroup.setTag(R.id.transition_current_scene, null);
        ?? obj2 = new Object();
        obj2.f86a = d4;
        obj2.f87b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(obj2);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(obj2);
        viewGroup.invalidate();
        u uVar = new u(d4);
        d4.f204y = uVar;
        d4.a(uVar);
        return d4.f204y;
    }

    @Override // androidx.fragment.app.E0
    public final boolean l() {
        return true;
    }

    @Override // androidx.fragment.app.E0
    public final boolean m(Object obj) {
        boolean t2 = ((x) obj).t();
        if (!t2) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return t2;
    }

    @Override // androidx.fragment.app.E0
    public final Object n(Object obj, Object obj2, Object obj3) {
        x xVar = (x) obj;
        x xVar2 = (x) obj2;
        x xVar3 = (x) obj3;
        if (xVar != null && xVar2 != null) {
            D d4 = new D();
            d4.N(xVar);
            d4.N(xVar2);
            d4.R(1);
            xVar = d4;
        } else if (xVar == null) {
            xVar = xVar2 != null ? xVar2 : null;
        }
        if (xVar3 == null) {
            return xVar;
        }
        D d5 = new D();
        if (xVar != null) {
            d5.N(xVar);
        }
        d5.N(xVar3);
        return d5;
    }

    @Override // androidx.fragment.app.E0
    public final Object o(Object obj, Object obj2) {
        D d4 = new D();
        if (obj != null) {
            d4.N((x) obj);
        }
        d4.N((x) obj2);
        return d4;
    }

    @Override // androidx.fragment.app.E0
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((x) obj).a(new C0033k(view, arrayList));
    }

    @Override // androidx.fragment.app.E0
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((x) obj).a(new C0034l(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.E0
    public final void r(Object obj, float f2) {
        u uVar = (u) obj;
        boolean z3 = uVar.f167b;
        if (z3) {
            D d4 = uVar.f172g;
            long j4 = d4.f203x;
            long j5 = f2 * ((float) j4);
            if (j5 == 0) {
                j5 = 1;
            }
            if (j5 == j4) {
                j5 = j4 - 1;
            }
            if (uVar.f169d != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j6 = uVar.f166a;
            if (j5 == j6 || !z3) {
                return;
            }
            if (!uVar.f168c) {
                if (j5 == 0 && j6 > 0) {
                    j5 = -1;
                } else if (j5 == j4 && j6 < j4) {
                    j5 = j4 + 1;
                }
                if (j5 != j6) {
                    d4.E(j5, j6);
                    uVar.f166a = j5;
                }
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            G g4 = uVar.f170e;
            int i = (g4.f102b + 1) % 20;
            g4.f102b = i;
            ((long[]) g4.f103c)[i] = currentAnimationTimeMillis;
            ((float[]) g4.f104d)[i] = (float) j5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.b, java.lang.Object] */
    @Override // androidx.fragment.app.E0
    public final void s(View view, Object obj) {
        if (view != null) {
            E0.j(new Rect(), view);
            ((x) obj).G(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.b, java.lang.Object] */
    @Override // androidx.fragment.app.E0
    public final void t(Object obj, Rect rect) {
        ((x) obj).G(new Object());
    }

    @Override // androidx.fragment.app.E0
    public final void u(androidx.fragment.app.K k4, Object obj, K.e eVar, RunnableC0161n runnableC0161n) {
        v(obj, eVar, null, runnableC0161n);
    }

    @Override // androidx.fragment.app.E0
    public final void v(Object obj, K.e eVar, RunnableC0175z runnableC0175z, Runnable runnable) {
        x xVar = (x) obj;
        C0031i c0031i = new C0031i(runnableC0175z, xVar, runnable, 0);
        synchronized (eVar) {
            while (eVar.f969c) {
                try {
                    try {
                        eVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (eVar.f968b != c0031i) {
                eVar.f968b = c0031i;
                if (eVar.f967a) {
                    RunnableC0175z runnableC0175z2 = (RunnableC0175z) c0031i.f143b;
                    if (runnableC0175z2 == null) {
                        ((x) c0031i.f144c).cancel();
                        ((Runnable) c0031i.f145d).run();
                    } else {
                        runnableC0175z2.run();
                    }
                }
            }
        }
        xVar.a(new C0035m(runnable));
    }

    @Override // androidx.fragment.app.E0
    public final void w(Object obj, View view, ArrayList arrayList) {
        D d4 = (D) obj;
        ArrayList arrayList2 = d4.f188f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            E0.f((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(d4, arrayList);
    }

    @Override // androidx.fragment.app.E0
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        D d4 = (D) obj;
        if (d4 != null) {
            ArrayList arrayList3 = d4.f188f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(d4, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.E0
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        D d4 = new D();
        d4.N((x) obj);
        return d4;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        x xVar = (x) obj;
        int i = 0;
        if (xVar instanceof D) {
            D d4 = (D) xVar;
            int size = d4.f93E.size();
            while (i < size) {
                z(d4.O(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (E0.k(xVar.f187e)) {
            ArrayList arrayList3 = xVar.f188f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    xVar.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    xVar.B((View) arrayList.get(size3));
                }
            }
        }
    }
}
