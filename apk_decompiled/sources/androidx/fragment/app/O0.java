package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class O0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f3061a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3062b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3063c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3064d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3065e;

    public O0(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f3061a = container;
        this.f3062b = new ArrayList();
        this.f3063c = new ArrayList();
    }

    public static final O0 m(ViewGroup container, AbstractC0158l0 fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        E2.e factory = fragmentManager.K();
        Intrinsics.checkNotNullExpressionValue(factory, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof O0) {
            return (O0) tag;
        }
        factory.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        O0 o02 = new O0(container);
        Intrinsics.checkNotNullExpressionValue(o02, "factory.createController(container)");
        container.setTag(R.id.special_effects_controller_view_tag, o02);
        return o02;
    }

    public final void a(J0 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.i) {
            M0 m02 = operation.f3036a;
            View requireView = operation.f3038c.requireView();
            Intrinsics.checkNotNullExpressionValue(requireView, "operation.fragment.requireView()");
            m02.a(requireView, this.f3061a);
            operation.i = false;
        }
    }

    public abstract void b(List list, boolean z3);

    public final void c(List operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((J0) it.next()).f3044k);
        }
        List list = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((I0) list.get(i)).c(this.f3061a);
        }
        int size2 = operations.size();
        for (int i4 = 0; i4 < size2; i4++) {
            a((J0) operations.get(i4));
        }
        List list2 = CollectionsKt.toList(operations);
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            J0 j02 = (J0) list2.get(i5);
            if (j02.f3044k.isEmpty()) {
                j02.b();
            }
        }
    }

    public final void d(M0 m02, K0 k02, t0 t0Var) {
        synchronized (this.f3062b) {
            try {
                K k4 = t0Var.f3240c;
                Intrinsics.checkNotNullExpressionValue(k4, "fragmentStateManager.fragment");
                J0 j4 = j(k4);
                if (j4 == null) {
                    K k5 = t0Var.f3240c;
                    if (k5.mTransitioning) {
                        Intrinsics.checkNotNullExpressionValue(k5, "fragmentStateManager.fragment");
                        j4 = k(k5);
                    } else {
                        j4 = null;
                    }
                }
                if (j4 != null) {
                    j4.d(m02, k02);
                    return;
                }
                final J0 j02 = new J0(m02, k02, t0Var);
                this.f3062b.add(j02);
                final int i = 0;
                Runnable listener = new Runnable(this) { // from class: androidx.fragment.app.H0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ O0 f3031b;

                    {
                        this.f3031b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                O0 this$0 = this.f3031b;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                J0 operation = j02;
                                Intrinsics.checkNotNullParameter(operation, "$operation");
                                if (this$0.f3062b.contains(operation)) {
                                    M0 m03 = operation.f3036a;
                                    View view = operation.f3038c.mView;
                                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                    m03.a(view, this$0.f3061a);
                                    return;
                                }
                                return;
                            default:
                                O0 this$02 = this.f3031b;
                                Intrinsics.checkNotNullParameter(this$02, "this$0");
                                J0 operation2 = j02;
                                Intrinsics.checkNotNullParameter(operation2, "$operation");
                                this$02.f3062b.remove(operation2);
                                this$02.f3063c.remove(operation2);
                                return;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(listener, "listener");
                j02.f3039d.add(listener);
                final int i4 = 1;
                Runnable listener2 = new Runnable(this) { // from class: androidx.fragment.app.H0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ O0 f3031b;

                    {
                        this.f3031b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                O0 this$0 = this.f3031b;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                J0 operation = j02;
                                Intrinsics.checkNotNullParameter(operation, "$operation");
                                if (this$0.f3062b.contains(operation)) {
                                    M0 m03 = operation.f3036a;
                                    View view = operation.f3038c.mView;
                                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                    m03.a(view, this$0.f3061a);
                                    return;
                                }
                                return;
                            default:
                                O0 this$02 = this.f3031b;
                                Intrinsics.checkNotNullParameter(this$02, "this$0");
                                J0 operation2 = j02;
                                Intrinsics.checkNotNullParameter(operation2, "$operation");
                                this$02.f3062b.remove(operation2);
                                this$02.f3063c.remove(operation2);
                                return;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(listener2, "listener");
                j02.f3039d.add(listener2);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(M0 finalState, t0 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.f3240c);
        }
        d(finalState, K0.f3047b, fragmentStateManager);
    }

    public final void f(t0 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.f3240c);
        }
        d(M0.f3056c, K0.f3046a, fragmentStateManager);
    }

    public final void g(t0 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.f3240c);
        }
        d(M0.f3054a, K0.f3048c, fragmentStateManager);
    }

    public final void h(t0 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.f3240c);
        }
        d(M0.f3055b, K0.f3046a, fragmentStateManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017c A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0018, B:14:0x0021, B:15:0x0030, B:17:0x0036, B:19:0x0042, B:20:0x0061, B:23:0x0073, B:26:0x0077, B:30:0x0070, B:32:0x01a9, B:36:0x007d, B:37:0x008c, B:39:0x0092, B:41:0x009e, B:42:0x00b4, B:45:0x00cb, B:48:0x00cf, B:53:0x00c6, B:54:0x00c8, B:56:0x00d5, B:60:0x00e6, B:62:0x00f9, B:63:0x0100, B:64:0x0114, B:66:0x011a, B:68:0x0124, B:71:0x0143, B:78:0x012c, B:79:0x0130, B:81:0x0136, B:88:0x014d, B:90:0x0151, B:91:0x015d, B:93:0x0163, B:95:0x016f, B:98:0x0178, B:100:0x017c, B:101:0x019a, B:103:0x01a2, B:105:0x0185, B:107:0x018f), top: B:11:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a2 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0018, B:14:0x0021, B:15:0x0030, B:17:0x0036, B:19:0x0042, B:20:0x0061, B:23:0x0073, B:26:0x0077, B:30:0x0070, B:32:0x01a9, B:36:0x007d, B:37:0x008c, B:39:0x0092, B:41:0x009e, B:42:0x00b4, B:45:0x00cb, B:48:0x00cf, B:53:0x00c6, B:54:0x00c8, B:56:0x00d5, B:60:0x00e6, B:62:0x00f9, B:63:0x0100, B:64:0x0114, B:66:0x011a, B:68:0x0124, B:71:0x0143, B:78:0x012c, B:79:0x0130, B:81:0x0136, B:88:0x014d, B:90:0x0151, B:91:0x015d, B:93:0x0163, B:95:0x016f, B:98:0x0178, B:100:0x017c, B:101:0x019a, B:103:0x01a2, B:105:0x0185, B:107:0x018f), top: B:11:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.O0.i():void");
    }

    public final J0 j(K k4) {
        Object obj;
        Iterator it = this.f3062b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            J0 j02 = (J0) obj;
            if (Intrinsics.areEqual(j02.f3038c, k4) && !j02.f3040e) {
                break;
            }
        }
        return (J0) obj;
    }

    public final J0 k(K k4) {
        Object obj;
        Iterator it = this.f3063c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            J0 j02 = (J0) obj;
            if (Intrinsics.areEqual(j02.f3038c, k4) && !j02.f3040e) {
                break;
            }
        }
        return (J0) obj;
    }

    public final void l() {
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f3061a.isAttachedToWindow();
        synchronized (this.f3062b) {
            try {
                p();
                o(this.f3062b);
                for (J0 j02 : CollectionsKt.toMutableList((Collection) this.f3063c)) {
                    if (AbstractC0158l0.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.f3061a + " is not attached to window. ") + "Cancelling running operation " + j02);
                    }
                    j02.a(this.f3061a);
                }
                for (J0 j03 : CollectionsKt.toMutableList((Collection) this.f3062b)) {
                    if (AbstractC0158l0.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.f3061a + " is not attached to window. ") + "Cancelling pending operation " + j03);
                    }
                    j03.a(this.f3061a);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        Object obj;
        M0 m02;
        synchronized (this.f3062b) {
            try {
                p();
                ArrayList arrayList = this.f3062b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    J0 j02 = (J0) obj;
                    View view = j02.f3038c.mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    if (view.getAlpha() == BitmapDescriptorFactory.HUE_RED && view.getVisibility() == 0) {
                        m02 = M0.f3057d;
                    } else {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            m02 = M0.f3055b;
                        } else if (visibility == 4) {
                            m02 = M0.f3057d;
                        } else {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            m02 = M0.f3056c;
                        }
                    }
                    M0 m03 = j02.f3036a;
                    M0 m04 = M0.f3055b;
                    if (m03 == m04 && m02 != m04) {
                        break;
                    }
                }
                J0 j03 = (J0) obj;
                K k4 = j03 != null ? j03.f3038c : null;
                this.f3065e = k4 != null ? k4.isPostponed() : false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            J0 j02 = (J0) list.get(i);
            if (!j02.h) {
                j02.h = true;
                K0 k02 = j02.f3037b;
                K0 k03 = K0.f3047b;
                t0 t0Var = j02.f3045l;
                if (k02 == k03) {
                    K k4 = t0Var.f3240c;
                    Intrinsics.checkNotNullExpressionValue(k4, "fragmentStateManager.fragment");
                    View findFocus = k4.mView.findFocus();
                    if (findFocus != null) {
                        k4.setFocusedView(findFocus);
                        if (AbstractC0158l0.M(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k4);
                        }
                    }
                    View requireView = j02.f3038c.requireView();
                    Intrinsics.checkNotNullExpressionValue(requireView, "this.fragment.requireView()");
                    if (requireView.getParent() == null) {
                        t0Var.b();
                        requireView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    }
                    if (requireView.getAlpha() == BitmapDescriptorFactory.HUE_RED && requireView.getVisibility() == 0) {
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(k4.getPostOnViewCreatedAlpha());
                } else if (k02 == K0.f3048c) {
                    K k5 = t0Var.f3240c;
                    Intrinsics.checkNotNullExpressionValue(k5, "fragmentStateManager.fragment");
                    View requireView2 = k5.requireView();
                    Intrinsics.checkNotNullExpressionValue(requireView2, "fragment.requireView()");
                    if (AbstractC0158l0.M(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + k5);
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((J0) it.next()).f3044k);
        }
        List list2 = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            I0 i02 = (I0) list2.get(i4);
            i02.getClass();
            ViewGroup container = this.f3061a;
            Intrinsics.checkNotNullParameter(container, "container");
            if (!i02.f3033a) {
                i02.e(container);
            }
            i02.f3033a = true;
        }
    }

    public final void p() {
        M0 m02;
        Iterator it = this.f3062b.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            if (j02.f3037b == K0.f3047b) {
                View requireView = j02.f3038c.requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                int visibility = requireView.getVisibility();
                if (visibility == 0) {
                    m02 = M0.f3055b;
                } else if (visibility == 4) {
                    m02 = M0.f3057d;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(visibility, "Unknown visibility "));
                    }
                    m02 = M0.f3056c;
                }
                j02.d(m02, K0.f3046a);
            }
        }
    }
}
