package androidx.navigation.fragment;

import a.AbstractC0106b;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.AbstractC0158l0;
import androidx.fragment.app.C0135a;
import androidx.fragment.app.C0142d0;
import androidx.fragment.app.C0152i0;
import androidx.fragment.app.C0156k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o0.C0537n;
import o0.E;
import o0.K;
import o0.U;
import o0.V;
import q0.C0556c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Lo0/V;", "Lq0/c;", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@U("fragment")
/* loaded from: classes.dex */
public class FragmentNavigator extends V {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3450c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0158l0 f3451d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3452e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f3453f;

    public FragmentNavigator(Context context, AbstractC0158l0 fragmentManager, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f3450c = context;
        this.f3451d = fragmentManager;
        this.f3452e = i;
        this.f3453f = new LinkedHashSet();
    }

    @Override // o0.V
    public final E a() {
        Intrinsics.checkNotNullParameter(this, "fragmentNavigator");
        return new E(this);
    }

    @Override // o0.V
    public final void d(List entries, K k4) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        AbstractC0158l0 abstractC0158l0 = this.f3451d;
        if (abstractC0158l0.Q()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            C0537n c0537n = (C0537n) it.next();
            boolean isEmpty = ((List) b().f8026e.getValue()).isEmpty();
            if (k4 == null || isEmpty || !k4.f7938b || !this.f3453f.remove(c0537n.f8010f)) {
                C0135a k5 = k(c0537n, k4);
                if (!isEmpty) {
                    if (!k5.h) {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    k5.f3263g = true;
                    k5.i = c0537n.f8010f;
                }
                k5.e(false);
                b().e(c0537n);
            } else {
                abstractC0158l0.y(new C0156k0(abstractC0158l0, c0537n.f8010f, 0), false);
                b().e(c0537n);
            }
        }
    }

    @Override // o0.V
    public final void f(C0537n backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        AbstractC0158l0 abstractC0158l0 = this.f3451d;
        if (abstractC0158l0.Q()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C0135a k4 = k(backStackEntry, null);
        if (((List) b().f8026e.getValue()).size() > 1) {
            String str = backStackEntry.f8010f;
            abstractC0158l0.y(new C0152i0(abstractC0158l0, str, -1), false);
            if (!k4.h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            k4.f3263g = true;
            k4.i = str;
        }
        k4.e(false);
        b().b(backStackEntry);
    }

    @Override // o0.V
    public final void g(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f3453f;
            linkedHashSet.clear();
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, stringArrayList);
        }
    }

    @Override // o0.V
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f3453f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return AbstractC0106b.b(TuplesKt.to("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // o0.V
    public final void i(C0537n popUpTo, boolean z3) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        AbstractC0158l0 abstractC0158l0 = this.f3451d;
        if (abstractC0158l0.Q()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z3) {
            List list = (List) b().f8026e.getValue();
            C0537n c0537n = (C0537n) CollectionsKt.first(list);
            for (C0537n c0537n2 : CollectionsKt.reversed(list.subList(list.indexOf(popUpTo), list.size()))) {
                if (Intrinsics.areEqual(c0537n2, c0537n)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + c0537n2);
                } else {
                    abstractC0158l0.y(new C0156k0(abstractC0158l0, c0537n2.f8010f, 1), false);
                    this.f3453f.add(c0537n2.f8010f);
                }
            }
        } else {
            abstractC0158l0.y(new C0152i0(abstractC0158l0, popUpTo.f8010f, -1), false);
        }
        b().c(popUpTo, z3);
    }

    public final C0135a k(C0537n c0537n, K k4) {
        String str = ((C0556c) c0537n.f8006b).f8148k;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        char charAt = str.charAt(0);
        Context context = this.f3450c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        AbstractC0158l0 abstractC0158l0 = this.f3451d;
        C0142d0 J = abstractC0158l0.J();
        context.getClassLoader();
        androidx.fragment.app.K a2 = J.a(str);
        Intrinsics.checkNotNullExpressionValue(a2, "fragmentManager.fragment…t.classLoader, className)");
        a2.setArguments(c0537n.f8007c);
        C0135a c0135a = new C0135a(abstractC0158l0);
        Intrinsics.checkNotNullExpressionValue(c0135a, "fragmentManager.beginTransaction()");
        int i = k4 != null ? k4.f7942f : -1;
        int i4 = k4 != null ? k4.f7943g : -1;
        int i5 = k4 != null ? k4.h : -1;
        int i6 = k4 != null ? k4.i : -1;
        if (i != -1 || i4 != -1 || i5 != -1 || i6 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i4 == -1) {
                i4 = 0;
            }
            if (i5 == -1) {
                i5 = 0;
            }
            int i7 = i6 != -1 ? i6 : 0;
            c0135a.f3258b = i;
            c0135a.f3259c = i4;
            c0135a.f3260d = i5;
            c0135a.f3261e = i7;
        }
        int i8 = this.f3452e;
        if (i8 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        c0135a.c(i8, a2, null, 2);
        c0135a.i(a2);
        c0135a.p = true;
        return c0135a;
    }
}
