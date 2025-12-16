package androidx.fragment.app;

import android.util.Log;
import b.C0253b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138b0 extends b.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0158l0 f3102a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138b0(AbstractC0158l0 abstractC0158l0) {
        super(false);
        this.f3102a = abstractC0158l0;
    }

    @Override // b.r
    public final void handleOnBackCancelled() {
        boolean M3 = AbstractC0158l0.M(3);
        AbstractC0158l0 abstractC0158l0 = this.f3102a;
        if (M3) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + abstractC0158l0);
        }
        C0135a c0135a = abstractC0158l0.h;
        if (c0135a != null) {
            c0135a.f3085r = false;
            c0135a.e(false);
            abstractC0158l0.A(true);
            abstractC0158l0.G();
            Iterator it = abstractC0158l0.f3169n.iterator();
            if (it.hasNext()) {
                throw C.w.g(it);
            }
        }
        abstractC0158l0.h = null;
    }

    @Override // b.r
    public final void handleOnBackPressed() {
        boolean M3 = AbstractC0158l0.M(3);
        AbstractC0158l0 abstractC0158l0 = this.f3102a;
        if (M3) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + abstractC0158l0);
        }
        abstractC0158l0.A(true);
        C0135a c0135a = abstractC0158l0.h;
        C0138b0 c0138b0 = abstractC0158l0.i;
        if (c0135a == null) {
            if (c0138b0.isEnabled()) {
                if (AbstractC0158l0.M(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                abstractC0158l0.T();
                return;
            } else {
                if (AbstractC0158l0.M(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                abstractC0158l0.f3164g.d();
                return;
            }
        }
        ArrayList arrayList = abstractC0158l0.f3169n;
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0158l0.H(abstractC0158l0.h));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = abstractC0158l0.h.f3257a.iterator();
        while (it3.hasNext()) {
            K k4 = ((v0) it3.next()).f3250b;
            if (k4 != null) {
                k4.mTransitioning = false;
            }
        }
        Iterator it4 = abstractC0158l0.f(new ArrayList(Collections.singletonList(abstractC0158l0.h)), 0, 1).iterator();
        while (it4.hasNext()) {
            O0 o02 = (O0) it4.next();
            o02.getClass();
            if (AbstractC0158l0.M(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            ArrayList arrayList2 = o02.f3063c;
            o02.o(arrayList2);
            o02.c(arrayList2);
        }
        abstractC0158l0.h = null;
        abstractC0158l0.k0();
        if (AbstractC0158l0.M(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + c0138b0.isEnabled() + " for  FragmentManager " + abstractC0158l0);
        }
    }

    @Override // b.r
    public final void handleOnBackProgressed(C0253b backEvent) {
        boolean M3 = AbstractC0158l0.M(2);
        AbstractC0158l0 abstractC0158l0 = this.f3102a;
        if (M3) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + abstractC0158l0);
        }
        if (abstractC0158l0.h != null) {
            Iterator it = abstractC0158l0.f(new ArrayList(Collections.singletonList(abstractC0158l0.h)), 0, 1).iterator();
            while (it.hasNext()) {
                O0 o02 = (O0) it.next();
                o02.getClass();
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                if (AbstractC0158l0.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f4108c);
                }
                ArrayList arrayList = o02.f3063c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList2, ((J0) it2.next()).f3044k);
                }
                List list = CollectionsKt.toList(CollectionsKt.toSet(arrayList2));
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((I0) list.get(i)).d(backEvent, o02.f3061a);
                }
            }
            Iterator it3 = abstractC0158l0.f3169n.iterator();
            if (it3.hasNext()) {
                throw C.w.g(it3);
            }
        }
    }

    @Override // b.r
    public final void handleOnBackStarted(C0253b c0253b) {
        boolean M3 = AbstractC0158l0.M(3);
        AbstractC0158l0 abstractC0158l0 = this.f3102a;
        if (M3) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + abstractC0158l0);
        }
        abstractC0158l0.x();
        abstractC0158l0.y(new C0154j0(abstractC0158l0), false);
    }
}
