package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public M0 f3036a;

    /* renamed from: b, reason: collision with root package name */
    public K0 f3037b;

    /* renamed from: c, reason: collision with root package name */
    public final K f3038c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3039d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3040e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3041f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3042g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3043j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3044k;

    /* renamed from: l, reason: collision with root package name */
    public final t0 f3045l;

    public J0(M0 finalState, K0 lifecycleImpact, t0 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        K fragment = fragmentStateManager.f3240c;
        Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f3036a = finalState;
        this.f3037b = lifecycleImpact;
        this.f3038c = fragment;
        this.f3039d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.f3043j = arrayList;
        this.f3044k = arrayList;
        this.f3045l = fragmentStateManager;
    }

    public final void a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.h = false;
        if (this.f3040e) {
            return;
        }
        this.f3040e = true;
        if (this.f3043j.isEmpty()) {
            b();
            return;
        }
        for (I0 i02 : CollectionsKt.toList(this.f3044k)) {
            i02.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            if (!i02.f3034b) {
                i02.b(container);
            }
            i02.f3034b = true;
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f3041f) {
            if (AbstractC0158l0.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3041f = true;
            Iterator it = this.f3039d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f3038c.mTransitioning = false;
        this.f3045l.k();
    }

    public final void c(I0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        ArrayList arrayList = this.f3043j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(M0 finalState, K0 lifecycleImpact) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        int ordinal = lifecycleImpact.ordinal();
        M0 m02 = M0.f3054a;
        K k4 = this.f3038c;
        if (ordinal == 0) {
            if (this.f3036a != m02) {
                if (AbstractC0158l0.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + k4 + " mFinalState = " + this.f3036a + " -> " + finalState + '.');
                }
                this.f3036a = finalState;
                return;
            }
            return;
        }
        if (ordinal == 1) {
            if (this.f3036a == m02) {
                if (AbstractC0158l0.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + k4 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3037b + " to ADDING.");
                }
                this.f3036a = M0.f3055b;
                this.f3037b = K0.f3047b;
                this.i = true;
                return;
            }
            return;
        }
        if (ordinal != 2) {
            return;
        }
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + k4 + " mFinalState = " + this.f3036a + " -> REMOVED. mLifecycleImpact  = " + this.f3037b + " to REMOVING.");
        }
        this.f3036a = m02;
        this.f3037b = K0.f3048c;
        this.i = true;
    }

    public final String toString() {
        StringBuilder p = com.google.android.gms.measurement.internal.a.p("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        p.append(this.f3036a);
        p.append(" lifecycleImpact = ");
        p.append(this.f3037b);
        p.append(" fragment = ");
        p.append(this.f3038c);
        p.append('}');
        return p.toString();
    }
}
