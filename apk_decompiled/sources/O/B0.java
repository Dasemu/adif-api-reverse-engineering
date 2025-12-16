package O;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class B0 {

    /* renamed from: b, reason: collision with root package name */
    public static final D0 f1203b;

    /* renamed from: a, reason: collision with root package name */
    public final D0 f1204a;

    static {
        f1203b = (Build.VERSION.SDK_INT >= 30 ? new u0() : new t0()).b().f1207a.a().f1207a.b().f1207a.c();
    }

    public B0(D0 d02) {
        this.f1204a = d02;
    }

    public D0 a() {
        return this.f1204a;
    }

    public D0 b() {
        return this.f1204a;
    }

    public D0 c() {
        return this.f1204a;
    }

    public void d(View view) {
    }

    public C0068i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return n() == b02.n() && m() == b02.m() && Objects.equals(j(), b02.j()) && Objects.equals(h(), b02.h()) && Objects.equals(e(), b02.e());
    }

    public G.c f(int i) {
        return G.c.f557e;
    }

    public G.c g() {
        return j();
    }

    public G.c h() {
        return G.c.f557e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public G.c i() {
        return j();
    }

    public G.c j() {
        return G.c.f557e;
    }

    public G.c k() {
        return j();
    }

    public D0 l(int i, int i4, int i5, int i6) {
        return f1203b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(G.c[] cVarArr) {
    }

    public void p(D0 d02) {
    }
}
