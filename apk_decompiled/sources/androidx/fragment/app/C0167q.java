package androidx.fragment.app;

import B0.C0031i;
import O.AbstractC0057b0;
import O.ViewTreeObserverOnPreDrawListenerC0083y;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b.C0253b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167q extends I0 {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3208c;

    /* renamed from: d, reason: collision with root package name */
    public final J0 f3209d;

    /* renamed from: e, reason: collision with root package name */
    public final J0 f3210e;

    /* renamed from: f, reason: collision with root package name */
    public final E0 f3211f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3212g;
    public final ArrayList h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final s.e f3213j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3214k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3215l;

    /* renamed from: m, reason: collision with root package name */
    public final s.e f3216m;

    /* renamed from: n, reason: collision with root package name */
    public final s.e f3217n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3218o;
    public final K.e p;

    /* renamed from: q, reason: collision with root package name */
    public Object f3219q;

    /* JADX WARN: Type inference failed for: r2v1, types: [K.e, java.lang.Object] */
    public C0167q(ArrayList transitionInfos, J0 j02, J0 j03, E0 transitionImpl, Object obj, ArrayList sharedElementFirstOutViews, ArrayList sharedElementLastInViews, s.e sharedElementNameMapping, ArrayList enteringNames, ArrayList exitingNames, s.e firstOutViews, s.e lastInViews, boolean z3) {
        Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
        Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
        Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
        Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
        Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
        Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
        Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
        Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
        Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
        this.f3208c = transitionInfos;
        this.f3209d = j02;
        this.f3210e = j03;
        this.f3211f = transitionImpl;
        this.f3212g = obj;
        this.h = sharedElementFirstOutViews;
        this.i = sharedElementLastInViews;
        this.f3213j = sharedElementNameMapping;
        this.f3214k = enteringNames;
        this.f3215l = exitingNames;
        this.f3216m = firstOutViews;
        this.f3217n = lastInViews;
        this.f3218o = z3;
        this.p = new Object();
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (AbstractC0057b0.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            if (child.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                f(child, arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.I0
    public final boolean a() {
        Object obj;
        E0 e02 = this.f3211f;
        if (!e02.l()) {
            return false;
        }
        ArrayList<r> arrayList = this.f3208c;
        if (!arrayList.isEmpty()) {
            for (r rVar : arrayList) {
                if (Build.VERSION.SDK_INT < 34 || (obj = rVar.f3220b) == null || !e02.m(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.f3212g;
        return obj2 == null || e02.m(obj2);
    }

    @Override // androidx.fragment.app.I0
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        K.e eVar = this.p;
        synchronized (eVar) {
            try {
                if (eVar.f967a) {
                    return;
                }
                eVar.f967a = true;
                eVar.f969c = true;
                C0031i c0031i = eVar.f968b;
                if (c0031i != null) {
                    try {
                        RunnableC0175z runnableC0175z = (RunnableC0175z) c0031i.f143b;
                        if (runnableC0175z == null) {
                            ((B0.x) c0031i.f144c).cancel();
                            ((Runnable) c0031i.f145d).run();
                        } else {
                            runnableC0175z.run();
                        }
                    } catch (Throwable th) {
                        synchronized (eVar) {
                            eVar.f969c = false;
                            eVar.notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (eVar) {
                    eVar.f969c = false;
                    eVar.notifyAll();
                }
            } finally {
            }
        }
    }

    @Override // androidx.fragment.app.I0
    public final void c(ViewGroup container) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(container, "container");
        boolean isLaidOut = container.isLaidOut();
        ArrayList<r> arrayList = this.f3208c;
        if (!isLaidOut) {
            for (r rVar : arrayList) {
                J0 j02 = rVar.f3181a;
                if (AbstractC0158l0.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + j02);
                }
                rVar.f3181a.c(this);
            }
            return;
        }
        Object obj = this.f3219q;
        E0 e02 = this.f3211f;
        J0 j03 = this.f3210e;
        J0 j04 = this.f3209d;
        if (obj != null) {
            Intrinsics.checkNotNull(obj);
            e02.c(obj);
            if (AbstractC0158l0.M(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + j04 + " to " + j03);
                return;
            }
            return;
        }
        Pair g4 = g(container, j03, j04);
        ArrayList arrayList2 = (ArrayList) g4.component1();
        Object component2 = g4.component2();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((r) it.next()).f3181a);
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            J0 j05 = (J0) it2.next();
            e02.u(j05.f3038c, component2, this.p, new RunnableC0161n(j05, this, 1));
        }
        i(arrayList2, container, new C0163o(this, container, component2, 0));
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + j04 + " to " + j03);
        }
    }

    @Override // androidx.fragment.app.I0
    public final void d(C0253b backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
        Object obj = this.f3219q;
        if (obj != null) {
            this.f3211f.r(obj, backEvent.f4108c);
        }
    }

    @Override // androidx.fragment.app.I0
    public final void e(ViewGroup container) {
        int collectionSizeOrDefault;
        Object obj;
        Intrinsics.checkNotNullParameter(container, "container");
        boolean isLaidOut = container.isLaidOut();
        ArrayList arrayList = this.f3208c;
        if (!isLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                J0 j02 = ((r) it.next()).f3181a;
                if (AbstractC0158l0.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + j02);
                }
            }
            return;
        }
        boolean h = h();
        J0 j03 = this.f3210e;
        J0 j04 = this.f3209d;
        if (h && (obj = this.f3212g) != null && !a()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + j04 + " and " + j03 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (a() && h()) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Pair g4 = g(container, j03, j04);
            ArrayList arrayList2 = (ArrayList) g4.component1();
            Object component2 = g4.component2();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((r) it2.next()).f3181a);
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                J0 j05 = (J0) it3.next();
                RunnableC0175z runnableC0175z = new RunnableC0175z(objectRef, 1);
                K k4 = j05.f3038c;
                this.f3211f.v(component2, this.p, runnableC0175z, new RunnableC0161n(j05, this, 0));
            }
            i(arrayList2, container, new C0165p(this, container, component2, objectRef));
        }
    }

    public final Pair g(ViewGroup viewGroup, J0 j02, J0 j03) {
        ArrayList arrayList;
        ArrayList arrayList2;
        E0 e02;
        Object obj;
        Object obj2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        J0 j04 = j02;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList5 = this.f3208c;
        Iterator it = arrayList5.iterator();
        View view2 = null;
        boolean z3 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.i;
            arrayList2 = this.h;
            e02 = this.f3211f;
            obj = this.f3212g;
            if (!hasNext) {
                break;
            }
            if (((r) it.next()).f3222d == null || j03 == null || j04 == null || this.f3213j.isEmpty() || obj == null) {
                arrayList4 = arrayList5;
            } else {
                s.e sharedElements = this.f3216m;
                C0 c02 = x0.f3272a;
                arrayList4 = arrayList5;
                K inFragment = j04.f3038c;
                Intrinsics.checkNotNullParameter(inFragment, "inFragment");
                K outFragment = j03.f3038c;
                Intrinsics.checkNotNullParameter(outFragment, "outFragment");
                Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                if (this.f3218o) {
                    outFragment.getEnterTransitionCallback();
                } else {
                    inFragment.getEnterTransitionCallback();
                }
                ViewTreeObserverOnPreDrawListenerC0083y.a(viewGroup, new RunnableC0143e(j04, j03, this, 1));
                arrayList2.addAll(sharedElements.values());
                ArrayList arrayList6 = this.f3215l;
                if (!arrayList6.isEmpty()) {
                    Object obj3 = arrayList6.get(0);
                    Intrinsics.checkNotNullExpressionValue(obj3, "exitingNames[0]");
                    View view3 = (View) sharedElements.get((String) obj3);
                    e02.s(view3, obj);
                    view2 = view3;
                }
                s.e eVar = this.f3217n;
                arrayList.addAll(eVar.values());
                ArrayList arrayList7 = this.f3214k;
                if (!arrayList7.isEmpty()) {
                    Object obj4 = arrayList7.get(0);
                    Intrinsics.checkNotNullExpressionValue(obj4, "enteringNames[0]");
                    View view4 = (View) eVar.get((String) obj4);
                    if (view4 != null) {
                        ViewTreeObserverOnPreDrawListenerC0083y.a(viewGroup, new RunnableC0143e(e02, view4, rect, 2));
                        z3 = true;
                    }
                }
                e02.w(obj, view, arrayList2);
                Object obj5 = this.f3212g;
                e02.q(obj5, null, null, obj5, arrayList);
            }
            arrayList5 = arrayList4;
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it2 = arrayList5.iterator();
        Object obj6 = null;
        Object obj7 = null;
        while (it2.hasNext()) {
            r rVar = (r) it2.next();
            Iterator it3 = it2;
            J0 j05 = rVar.f3181a;
            ArrayList arrayList9 = arrayList2;
            Object h = e02.h(rVar.f3220b);
            if (h != null) {
                boolean z4 = z3;
                ArrayList arrayList10 = new ArrayList();
                Object obj8 = obj;
                View view5 = j05.f3038c.mView;
                Object obj9 = obj7;
                Intrinsics.checkNotNullExpressionValue(view5, "operation.fragment.mView");
                f(view5, arrayList10);
                if (obj8 != null && (j05 == j03 || j05 == j04)) {
                    if (j05 == j03) {
                        arrayList10.removeAll(CollectionsKt.toSet(arrayList9));
                    } else {
                        arrayList10.removeAll(CollectionsKt.toSet(arrayList));
                    }
                }
                if (arrayList10.isEmpty()) {
                    e02.a(view, h);
                    obj2 = h;
                    arrayList3 = arrayList10;
                } else {
                    e02.b(h, arrayList10);
                    e02.q(h, h, arrayList10, null, null);
                    obj2 = h;
                    arrayList3 = arrayList10;
                    if (j05.f3036a == M0.f3056c) {
                        j05.i = false;
                        ArrayList arrayList11 = new ArrayList(arrayList3);
                        K k4 = j05.f3038c;
                        arrayList11.remove(k4.mView);
                        e02.p(obj2, k4.mView, arrayList11);
                        ViewTreeObserverOnPreDrawListenerC0083y.a(viewGroup, new RunnableC0175z(arrayList3, 2));
                    }
                }
                if (j05.f3036a == M0.f3055b) {
                    arrayList8.addAll(arrayList3);
                    if (z4) {
                        e02.t(obj2, rect);
                    }
                    if (AbstractC0158l0.M(2)) {
                        Log.v("FragmentManager", "Entering Transition: " + obj2);
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            Object transitioningViews = it4.next();
                            Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                        }
                    }
                } else {
                    e02.s(view2, obj2);
                    if (AbstractC0158l0.M(2)) {
                        Log.v("FragmentManager", "Exiting Transition: " + obj2);
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        Iterator it5 = arrayList3.iterator();
                        while (it5.hasNext()) {
                            Object transitioningViews2 = it5.next();
                            Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                        }
                    }
                }
                if (rVar.f3221c) {
                    obj6 = e02.o(obj6, obj2);
                    it2 = it3;
                    j04 = j02;
                    arrayList2 = arrayList9;
                    z3 = z4;
                    obj = obj8;
                    obj7 = obj9;
                } else {
                    obj7 = e02.o(obj9, obj2);
                    it2 = it3;
                    j04 = j02;
                    arrayList2 = arrayList9;
                    z3 = z4;
                    obj = obj8;
                }
            } else {
                it2 = it3;
                arrayList2 = arrayList9;
                j04 = j02;
            }
        }
        Object n4 = e02.n(obj6, obj7, obj);
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Final merged transition: " + n4);
        }
        return new Pair(arrayList8, n4);
    }

    public final boolean h() {
        ArrayList arrayList = this.f3208c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((r) it.next()).f3181a.f3038c.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
        x0.a(4, arrayList);
        E0 e02 = this.f3211f;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.i;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = O.X.f1226a;
            arrayList2.add(O.L.k(view));
            O.L.v(view, null);
        }
        boolean M3 = AbstractC0158l0.M(2);
        ArrayList arrayList4 = this.h;
        if (M3) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                Object sharedElementFirstOutViews = it.next();
                Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view2 = (View) sharedElementFirstOutViews;
                StringBuilder sb = new StringBuilder("View: ");
                sb.append(view2);
                sb.append(" Name: ");
                WeakHashMap weakHashMap2 = O.X.f1226a;
                sb.append(O.L.k(view2));
                Log.v("FragmentManager", sb.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object sharedElementLastInViews = it2.next();
                Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                View view3 = (View) sharedElementLastInViews;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view3);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap3 = O.X.f1226a;
                sb2.append(O.L.k(view3));
                Log.v("FragmentManager", sb2.toString());
            }
        }
        function0.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < size2; i4++) {
            View view4 = (View) arrayList4.get(i4);
            WeakHashMap weakHashMap4 = O.X.f1226a;
            String k4 = O.L.k(view4);
            arrayList5.add(k4);
            if (k4 != null) {
                O.L.v(view4, null);
                String str = (String) this.f3213j.get(k4);
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i5))) {
                        O.L.v((View) arrayList3.get(i5), k4);
                        break;
                    }
                    i5++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0083y.a(viewGroup, new D0(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        x0.a(0, arrayList);
        e02.x(this.f3212g, arrayList4, arrayList3);
    }
}
