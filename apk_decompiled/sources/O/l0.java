package O;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0060d f1265a;

    /* renamed from: b, reason: collision with root package name */
    public D0 f1266b;

    public l0(View view, C0060d c0060d) {
        D0 d02;
        this.f1265a = c0060d;
        WeakHashMap weakHashMap = X.f1226a;
        D0 a2 = M.a(view);
        if (a2 != null) {
            d02 = (Build.VERSION.SDK_INT >= 30 ? new u0(a2) : new t0(a2)).b();
        } else {
            d02 = null;
        }
        this.f1266b = d02;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        B0 b02;
        if (!view.isLaidOut()) {
            this.f1266b = D0.f(view, windowInsets);
            return m0.i(view, windowInsets);
        }
        D0 f2 = D0.f(view, windowInsets);
        if (this.f1266b == null) {
            WeakHashMap weakHashMap = X.f1226a;
            this.f1266b = M.a(view);
        }
        if (this.f1266b == null) {
            this.f1266b = f2;
            return m0.i(view, windowInsets);
        }
        C0060d j4 = m0.j(view);
        if (j4 != null && Objects.equals((WindowInsets) j4.f1236b, windowInsets)) {
            return m0.i(view, windowInsets);
        }
        D0 d02 = this.f1266b;
        int i = 1;
        int i4 = 0;
        while (true) {
            b02 = f2.f1207a;
            if (i > 256) {
                break;
            }
            if (!b02.f(i).equals(d02.f1207a.f(i))) {
                i4 |= i;
            }
            i <<= 1;
        }
        if (i4 == 0) {
            return m0.i(view, windowInsets);
        }
        D0 d03 = this.f1266b;
        r0 r0Var = new r0(i4, (i4 & 8) != 0 ? b02.f(8).f561d > d03.f1207a.f(8).f561d ? m0.f1270e : m0.f1271f : m0.f1272g, 160L);
        r0Var.f1292a.d(BitmapDescriptorFactory.HUE_RED);
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(r0Var.f1292a.a());
        G.c f4 = b02.f(i4);
        G.c f5 = d03.f1207a.f(i4);
        int min = Math.min(f4.f558a, f5.f558a);
        int i5 = f4.f559b;
        int i6 = f5.f559b;
        int min2 = Math.min(i5, i6);
        int i7 = f4.f560c;
        int i8 = f5.f560c;
        int min3 = Math.min(i7, i8);
        int i9 = f4.f561d;
        int i10 = f5.f561d;
        int i11 = i4;
        F.i iVar = new F.i(3, G.c.b(min, min2, min3, Math.min(i9, i10)), G.c.b(Math.max(f4.f558a, f5.f558a), Math.max(i5, i6), Math.max(i7, i8), Math.max(i9, i10)));
        m0.f(view, windowInsets, false);
        duration.addUpdateListener(new k0(r0Var, f2, d03, i11, view));
        duration.addListener(new B0.p(r0Var, view));
        ViewTreeObserverOnPreDrawListenerC0083y.a(view, new L.l(view, r0Var, iVar, duration));
        this.f1266b = f2;
        return m0.i(view, windowInsets);
    }
}
