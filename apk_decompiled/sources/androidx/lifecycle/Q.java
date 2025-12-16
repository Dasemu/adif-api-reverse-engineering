package androidx.lifecycle;

import java.util.Map;
import n.C0508b;
import o.C0518d;
import o.C0520f;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f3311k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f3312a;

    /* renamed from: b, reason: collision with root package name */
    public final C0520f f3313b;

    /* renamed from: c, reason: collision with root package name */
    public int f3314c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3315d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f3316e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f3317f;

    /* renamed from: g, reason: collision with root package name */
    public int f3318g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final F0.c f3319j;

    public Q(Object obj) {
        this.f3312a = new Object();
        this.f3313b = new C0520f();
        this.f3314c = 0;
        this.f3317f = f3311k;
        this.f3319j = new F0.c(this, 5);
        this.f3316e = obj;
        this.f3318g = 0;
    }

    public static void a(String str) {
        if (!C0508b.L().M()) {
            throw new IllegalStateException(C.w.o("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(P p) {
        if (p.f3308b) {
            if (!p.f()) {
                p.a(false);
                return;
            }
            int i = p.f3309c;
            int i4 = this.f3318g;
            if (i >= i4) {
                return;
            }
            p.f3309c = i4;
            p.f3307a.onChanged(this.f3316e);
        }
    }

    public final void c(P p) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (p != null) {
                b(p);
                p = null;
            } else {
                C0520f c0520f = this.f3313b;
                c0520f.getClass();
                C0518d c0518d = new C0518d(c0520f);
                c0520f.f7896c.put(c0518d, Boolean.FALSE);
                while (c0518d.hasNext()) {
                    b((P) ((Map.Entry) c0518d.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final Object d() {
        Object obj = this.f3316e;
        if (obj != f3311k) {
            return obj;
        }
        return null;
    }

    public final void e(J j4, Y y3) {
        a("observe");
        if (j4.getLifecycle().b() == B.f3280a) {
            return;
        }
        O o4 = new O(this, j4, y3);
        P p = (P) this.f3313b.b(y3, o4);
        if (p != null && !p.c(j4)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (p != null) {
            return;
        }
        j4.getLifecycle().a(o4);
    }

    public final void f(Y y3) {
        a("observeForever");
        P p = new P(this, y3);
        P p3 = (P) this.f3313b.b(y3, p);
        if (p3 instanceof O) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (p3 != null) {
            return;
        }
        p.a(true);
    }

    public void g() {
    }

    public void h() {
    }

    public final void i(Y y3) {
        a("removeObserver");
        P p = (P) this.f3313b.c(y3);
        if (p == null) {
            return;
        }
        p.b();
        p.a(false);
    }

    public abstract void j(Object obj);

    public Q() {
        this.f3312a = new Object();
        this.f3313b = new C0520f();
        this.f3314c = 0;
        Object obj = f3311k;
        this.f3317f = obj;
        this.f3319j = new F0.c(this, 5);
        this.f3316e = obj;
        this.f3318g = -1;
    }
}
