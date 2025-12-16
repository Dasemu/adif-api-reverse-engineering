package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3244a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3245b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3246c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public C0166p0 f3247d;

    public final void a(K k4) {
        if (this.f3244a.contains(k4)) {
            throw new IllegalStateException("Fragment already added: " + k4);
        }
        synchronized (this.f3244a) {
            this.f3244a.add(k4);
        }
        k4.mAdded = true;
    }

    public final K b(String str) {
        t0 t0Var = (t0) this.f3245b.get(str);
        if (t0Var != null) {
            return t0Var.f3240c;
        }
        return null;
    }

    public final K c(String str) {
        K findFragmentByWho;
        for (t0 t0Var : this.f3245b.values()) {
            if (t0Var != null && (findFragmentByWho = t0Var.f3240c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (t0 t0Var : this.f3245b.values()) {
            if (t0Var != null) {
                arrayList.add(t0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (t0 t0Var : this.f3245b.values()) {
            if (t0Var != null) {
                arrayList.add(t0Var.f3240c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f3244a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f3244a) {
            arrayList = new ArrayList(this.f3244a);
        }
        return arrayList;
    }

    public final void g(t0 t0Var) {
        K k4 = t0Var.f3240c;
        String str = k4.mWho;
        HashMap hashMap = this.f3245b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(k4.mWho, t0Var);
        if (k4.mRetainInstanceChangedWhileDetached) {
            if (k4.mRetainInstance) {
                this.f3247d.a(k4);
            } else {
                this.f3247d.g(k4);
            }
            k4.mRetainInstanceChangedWhileDetached = false;
        }
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k4);
        }
    }

    public final void h(t0 t0Var) {
        K k4 = t0Var.f3240c;
        if (k4.mRetainInstance) {
            this.f3247d.g(k4);
        }
        HashMap hashMap = this.f3245b;
        if (hashMap.get(k4.mWho) == t0Var && ((t0) hashMap.put(k4.mWho, null)) != null && AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k4);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap hashMap = this.f3246c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }
}
