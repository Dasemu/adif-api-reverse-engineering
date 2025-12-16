package O;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: b, reason: collision with root package name */
    public static final D0 f1206b;

    /* renamed from: a, reason: collision with root package name */
    public final B0 f1207a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f1206b = A0.f1199q;
        } else {
            f1206b = B0.f1203b;
        }
    }

    public D0(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1207a = new A0(this, windowInsets);
        } else {
            this.f1207a = new z0(this, windowInsets);
        }
    }

    public static D0 f(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        D0 d02 = new D0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = X.f1226a;
            D0 a2 = M.a(view);
            B0 b02 = d02.f1207a;
            b02.p(a2);
            b02.d(view.getRootView());
        }
        return d02;
    }

    public final int a() {
        return this.f1207a.j().f561d;
    }

    public final int b() {
        return this.f1207a.j().f558a;
    }

    public final int c() {
        return this.f1207a.j().f560c;
    }

    public final int d() {
        return this.f1207a.j().f559b;
    }

    public final WindowInsets e() {
        B0 b02 = this.f1207a;
        if (b02 instanceof w0) {
            return ((w0) b02).f1305c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        return Objects.equals(this.f1207a, ((D0) obj).f1207a);
    }

    public final int hashCode() {
        B0 b02 = this.f1207a;
        if (b02 == null) {
            return 0;
        }
        return b02.hashCode();
    }

    public D0() {
        this.f1207a = new B0(this);
    }
}
