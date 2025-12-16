package O;

import a.AbstractC0106b;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class w0 extends B0 {
    public static boolean h = false;
    public static Method i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f1302j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f1303k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f1304l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f1305c;

    /* renamed from: d, reason: collision with root package name */
    public G.c[] f1306d;

    /* renamed from: e, reason: collision with root package name */
    public G.c f1307e;

    /* renamed from: f, reason: collision with root package name */
    public D0 f1308f;

    /* renamed from: g, reason: collision with root package name */
    public G.c f1309g;

    public w0(D0 d02, WindowInsets windowInsets) {
        super(d02);
        this.f1307e = null;
        this.f1305c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private G.c q(int i4, boolean z3) {
        G.c cVar = G.c.f557e;
        for (int i5 = 1; i5 <= 256; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                cVar = G.c.a(cVar, r(i5, z3));
            }
        }
        return cVar;
    }

    private G.c s() {
        D0 d02 = this.f1308f;
        return d02 != null ? d02.f1207a.h() : G.c.f557e;
    }

    private G.c t(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            u();
        }
        Method method = i;
        if (method != null && f1302j != null && f1303k != null) {
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f1303k.get(f1304l.get(invoke));
                if (rect != null) {
                    return G.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void u() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f1302j = cls;
            f1303k = cls.getDeclaredField("mVisibleInsets");
            f1304l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f1303k.setAccessible(true);
            f1304l.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        h = true;
    }

    @Override // O.B0
    public void d(View view) {
        G.c t2 = t(view);
        if (t2 == null) {
            t2 = G.c.f557e;
        }
        v(t2);
    }

    @Override // O.B0
    public G.c f(int i4) {
        return q(i4, false);
    }

    @Override // O.B0
    public final G.c j() {
        if (this.f1307e == null) {
            WindowInsets windowInsets = this.f1305c;
            this.f1307e = G.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f1307e;
    }

    @Override // O.B0
    public boolean n() {
        return this.f1305c.isRound();
    }

    @Override // O.B0
    public void o(G.c[] cVarArr) {
        this.f1306d = cVarArr;
    }

    @Override // O.B0
    public void p(D0 d02) {
        this.f1308f = d02;
    }

    public G.c r(int i4, boolean z3) {
        G.c h4;
        int i5;
        if (i4 == 1) {
            return z3 ? G.c.b(0, Math.max(s().f559b, j().f559b), 0, 0) : G.c.b(0, j().f559b, 0, 0);
        }
        if (i4 == 2) {
            if (z3) {
                G.c s4 = s();
                G.c h5 = h();
                return G.c.b(Math.max(s4.f558a, h5.f558a), 0, Math.max(s4.f560c, h5.f560c), Math.max(s4.f561d, h5.f561d));
            }
            G.c j4 = j();
            D0 d02 = this.f1308f;
            h4 = d02 != null ? d02.f1207a.h() : null;
            int i6 = j4.f561d;
            if (h4 != null) {
                i6 = Math.min(i6, h4.f561d);
            }
            return G.c.b(j4.f558a, 0, j4.f560c, i6);
        }
        G.c cVar = G.c.f557e;
        if (i4 == 8) {
            G.c[] cVarArr = this.f1306d;
            h4 = cVarArr != null ? cVarArr[AbstractC0106b.q(8)] : null;
            if (h4 != null) {
                return h4;
            }
            G.c j5 = j();
            G.c s5 = s();
            int i7 = j5.f561d;
            if (i7 > s5.f561d) {
                return G.c.b(0, 0, 0, i7);
            }
            G.c cVar2 = this.f1309g;
            return (cVar2 == null || cVar2.equals(cVar) || (i5 = this.f1309g.f561d) <= s5.f561d) ? cVar : G.c.b(0, 0, 0, i5);
        }
        if (i4 == 16) {
            return i();
        }
        if (i4 == 32) {
            return g();
        }
        if (i4 == 64) {
            return k();
        }
        if (i4 != 128) {
            return cVar;
        }
        D0 d03 = this.f1308f;
        C0068i e4 = d03 != null ? d03.f1207a.e() : e();
        if (e4 == null) {
            return cVar;
        }
        DisplayCutout displayCutout = e4.f1256a;
        return G.c.b(AbstractC0067h.d(displayCutout), AbstractC0067h.f(displayCutout), AbstractC0067h.e(displayCutout), AbstractC0067h.c(displayCutout));
    }

    public void v(G.c cVar) {
        this.f1309g = cVar;
    }
}
