package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166p0 extends androidx.lifecycle.w0 {

    /* renamed from: g, reason: collision with root package name */
    public static final C0164o0 f3201g = new C0164o0(0);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3205d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3202a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3203b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3204c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3206e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3207f = false;

    public C0166p0(boolean z3) {
        this.f3205d = z3;
    }

    public final void a(K k4) {
        if (this.f3207f) {
            if (AbstractC0158l0.M(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap hashMap = this.f3202a;
        if (hashMap.containsKey(k4.mWho)) {
            return;
        }
        hashMap.put(k4.mWho, k4);
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + k4);
        }
    }

    public final void b(K k4, boolean z3) {
        if (AbstractC0158l0.M(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + k4);
        }
        f(k4.mWho, z3);
    }

    public final void c(String str, boolean z3) {
        if (AbstractC0158l0.M(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        f(str, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0166p0.class == obj.getClass()) {
            C0166p0 c0166p0 = (C0166p0) obj;
            if (this.f3202a.equals(c0166p0.f3202a) && this.f3203b.equals(c0166p0.f3203b) && this.f3204c.equals(c0166p0.f3204c)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str, boolean z3) {
        HashMap hashMap = this.f3203b;
        C0166p0 c0166p0 = (C0166p0) hashMap.get(str);
        if (c0166p0 != null) {
            if (z3) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c0166p0.f3203b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c0166p0.c((String) it.next(), true);
                }
            }
            c0166p0.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f3204c;
        androidx.lifecycle.C0 c02 = (androidx.lifecycle.C0) hashMap2.get(str);
        if (c02 != null) {
            c02.a();
            hashMap2.remove(str);
        }
    }

    public final void g(K k4) {
        if (this.f3207f) {
            if (AbstractC0158l0.M(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3202a.remove(k4.mWho) == null || !AbstractC0158l0.M(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + k4);
        }
    }

    public final int hashCode() {
        return this.f3204c.hashCode() + ((this.f3203b.hashCode() + (this.f3202a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.w0
    public final void onCleared() {
        if (AbstractC0158l0.M(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3206e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f3202a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f3203b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f3204c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
