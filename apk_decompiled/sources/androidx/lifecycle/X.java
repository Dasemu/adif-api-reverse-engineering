package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import n.C0508b;
import n.C0510d;

/* loaded from: classes.dex */
public class X extends Q {
    @Override // androidx.lifecycle.Q
    public void j(Object obj) {
        Q.a("setValue");
        this.f3318g++;
        this.f3316e = obj;
        c(null);
    }

    public final void k(Object obj) {
        boolean z3;
        synchronized (this.f3312a) {
            z3 = this.f3317f == Q.f3311k;
            this.f3317f = obj;
        }
        if (z3) {
            C0508b L3 = C0508b.L();
            F0.c cVar = this.f3319j;
            C0510d c0510d = L3.f7834a;
            if (c0510d.f7838c == null) {
                synchronized (c0510d.f7836a) {
                    try {
                        if (c0510d.f7838c == null) {
                            c0510d.f7838c = Handler.createAsync(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            c0510d.f7838c.post(cVar);
        }
    }
}
