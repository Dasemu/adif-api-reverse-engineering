package o0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import v0.C0639d;
import v0.C0640e;

/* renamed from: o0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537n implements androidx.lifecycle.J, D0, InterfaceC0200v, v0.f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8005a;

    /* renamed from: b, reason: collision with root package name */
    public E f8006b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f8007c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.B f8008d;

    /* renamed from: e, reason: collision with root package name */
    public final C0545w f8009e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8010f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f8011g;
    public final androidx.lifecycle.L h = new androidx.lifecycle.L(this);
    public final C0640e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8012j;

    /* renamed from: k, reason: collision with root package name */
    public final Lazy f8013k;

    /* renamed from: l, reason: collision with root package name */
    public final Lazy f8014l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.lifecycle.B f8015m;

    public C0537n(Context context, E e4, Bundle bundle, androidx.lifecycle.B b4, C0545w c0545w, String str, Bundle bundle2) {
        this.f8005a = context;
        this.f8006b = e4;
        this.f8007c = bundle;
        this.f8008d = b4;
        this.f8009e = c0545w;
        this.f8010f = str;
        this.f8011g = bundle2;
        Intrinsics.checkNotNullParameter(this, "owner");
        this.i = new C0640e(this);
        this.f8013k = LazyKt.lazy(new C0536m(this, 0));
        this.f8014l = LazyKt.lazy(new C0536m(this, 1));
        this.f8015m = androidx.lifecycle.B.f3281b;
    }

    public final void a(androidx.lifecycle.B maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.f8015m = maxState;
        b();
    }

    public final void b() {
        if (!this.f8012j) {
            C0640e c0640e = this.i;
            c0640e.a();
            this.f8012j = true;
            if (this.f8009e != null) {
                q0.f(this);
            }
            c0640e.b(this.f8011g);
        }
        int ordinal = this.f8008d.ordinal();
        int ordinal2 = this.f8015m.ordinal();
        androidx.lifecycle.L l4 = this.h;
        if (ordinal < ordinal2) {
            l4.h(this.f8008d);
        } else {
            l4.h(this.f8015m);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof C0537n)) {
            C0537n c0537n = (C0537n) obj;
            if (Intrinsics.areEqual(this.f8010f, c0537n.f8010f) && Intrinsics.areEqual(this.f8006b, c0537n.f8006b) && Intrinsics.areEqual(this.h, c0537n.h) && Intrinsics.areEqual(this.i.f8636b, c0537n.i.f8636b)) {
                Bundle bundle = this.f8007c;
                Bundle bundle2 = c0537n.f8007c;
                if (Intrinsics.areEqual(bundle, bundle2)) {
                    return true;
                }
                if (bundle != null && (keySet = bundle.keySet()) != null) {
                    if (keySet.isEmpty()) {
                        return true;
                    }
                    for (String str : keySet) {
                        if (!Intrinsics.areEqual(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.InterfaceC0200v
    public final l0.c getDefaultViewModelCreationExtras() {
        l0.d dVar = new l0.d(0);
        Context context = this.f8005a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            dVar.b(x0.f3440d, application);
        }
        dVar.b(q0.f3417a, this);
        dVar.b(q0.f3418b, this);
        Bundle bundle = this.f8007c;
        if (bundle != null) {
            dVar.b(q0.f3419c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.InterfaceC0200v
    public final y0 getDefaultViewModelProviderFactory() {
        return (t0) this.f8013k.getValue();
    }

    @Override // androidx.lifecycle.J
    public final androidx.lifecycle.C getLifecycle() {
        return this.h;
    }

    @Override // v0.f
    public final C0639d getSavedStateRegistry() {
        return this.i.f8636b;
    }

    @Override // androidx.lifecycle.D0
    public final C0 getViewModelStore() {
        if (!this.f8012j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.h.f3298d == androidx.lifecycle.B.f3280a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        C0545w c0545w = this.f8009e;
        if (c0545w == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String backStackEntryId = this.f8010f;
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = c0545w.f8072a;
        C0 c02 = (C0) linkedHashMap.get(backStackEntryId);
        if (c02 != null) {
            return c02;
        }
        C0 c03 = new C0();
        linkedHashMap.put(backStackEntryId, c03);
        return c03;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f8006b.hashCode() + (this.f8010f.hashCode() * 31);
        Bundle bundle = this.f8007c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.i.f8636b.hashCode() + ((this.h.hashCode() + (hashCode * 31)) * 31);
    }
}
