package g;

import O.D0;
import O.InterfaceC0080v;
import O.X;
import O.t0;
import O.u0;
import O.v0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.adif.elcanomovil.R;
import java.util.WeakHashMap;
import m.InterfaceC0455c0;
import m.Z0;

/* renamed from: g.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372t implements InterfaceC0080v, InterfaceC0455c0, l.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0351E f6668b;

    public /* synthetic */ C0372t(LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E, int i) {
        this.f6667a = i;
        this.f6668b = layoutInflaterFactory2C0351E;
    }

    @Override // l.x
    public void b(l.m mVar, boolean z3) {
        C0350D c0350d;
        switch (this.f6667a) {
            case 2:
                this.f6668b.s(mVar);
                return;
            default:
                l.m k4 = mVar.k();
                int i = 0;
                boolean z4 = k4 != mVar;
                if (z4) {
                    mVar = k4;
                }
                LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = this.f6668b;
                C0350D[] c0350dArr = layoutInflaterFactory2C0351E.f6505L;
                int length = c0350dArr != null ? c0350dArr.length : 0;
                while (true) {
                    if (i >= length) {
                        c0350d = null;
                    } else {
                        c0350d = c0350dArr[i];
                        if (c0350d == null || c0350d.h != mVar) {
                            i++;
                        }
                    }
                }
                if (c0350d != null) {
                    if (!z4) {
                        layoutInflaterFactory2C0351E.t(c0350d, z3);
                        return;
                    } else {
                        layoutInflaterFactory2C0351E.r(c0350d.f6479a, c0350d, k4);
                        layoutInflaterFactory2C0351E.t(c0350d, true);
                        return;
                    }
                }
                return;
        }
    }

    @Override // l.x
    public boolean f(l.m mVar) {
        Window.Callback callback;
        switch (this.f6667a) {
            case 2:
                Window.Callback callback2 = this.f6668b.f6528l.getCallback();
                if (callback2 == null) {
                    return true;
                }
                callback2.onMenuOpened(108, mVar);
                return true;
            default:
                if (mVar != mVar.k()) {
                    return true;
                }
                LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = this.f6668b;
                if (!layoutInflaterFactory2C0351E.f6500F || (callback = layoutInflaterFactory2C0351E.f6528l.getCallback()) == null || layoutInflaterFactory2C0351E.f6510Q) {
                    return true;
                }
                callback.onMenuOpened(108, mVar);
                return true;
        }
    }

    @Override // O.InterfaceC0080v
    public D0 g(View view, D0 d02) {
        boolean z3;
        boolean z4;
        D0 d03 = d02;
        int d4 = d03.d();
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = this.f6668b;
        layoutInflaterFactory2C0351E.getClass();
        int d5 = d03.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0351E.f6537v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z3 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0351E.f6537v.getLayoutParams();
            if (layoutInflaterFactory2C0351E.f6537v.isShown()) {
                if (layoutInflaterFactory2C0351E.f6521c0 == null) {
                    layoutInflaterFactory2C0351E.f6521c0 = new Rect();
                    layoutInflaterFactory2C0351E.f6522d0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0351E.f6521c0;
                Rect rect2 = layoutInflaterFactory2C0351E.f6522d0;
                rect.set(d03.b(), d03.d(), d03.c(), d03.a());
                Z0.a(layoutInflaterFactory2C0351E.f6495A, rect, rect2);
                int i = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup = layoutInflaterFactory2C0351E.f6495A;
                WeakHashMap weakHashMap = X.f1226a;
                D0 a2 = O.M.a(viewGroup);
                int b4 = a2 == null ? 0 : a2.b();
                int c4 = a2 == null ? 0 : a2.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z4 = true;
                }
                Context context = layoutInflaterFactory2C0351E.f6527k;
                if (i <= 0 || layoutInflaterFactory2C0351E.f6497C != null) {
                    View view2 = layoutInflaterFactory2C0351E.f6497C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != b4 || marginLayoutParams2.rightMargin != c4) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = b4;
                            marginLayoutParams2.rightMargin = c4;
                            layoutInflaterFactory2C0351E.f6497C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0351E.f6497C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b4;
                    layoutParams.rightMargin = c4;
                    layoutInflaterFactory2C0351E.f6495A.addView(layoutInflaterFactory2C0351E.f6497C, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0351E.f6497C;
                r8 = view4 != null;
                if (r8 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0351E.f6497C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? D.h.getColor(context, R.color.abc_decor_view_status_guard_light) : D.h.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0351E.f6502H && r8) {
                    d5 = 0;
                }
                boolean z5 = r8;
                r8 = z4;
                z3 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z3 = false;
            } else {
                z3 = false;
                r8 = false;
            }
            if (r8) {
                layoutInflaterFactory2C0351E.f6537v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0351E.f6497C;
        if (view6 != null) {
            view6.setVisibility(z3 ? 0 : 8);
        }
        if (d4 != d5) {
            int b5 = d03.b();
            int c5 = d03.c();
            int a4 = d03.a();
            v0 u0Var = Build.VERSION.SDK_INT >= 30 ? new u0(d03) : new t0(d03);
            u0Var.f(G.c.b(b5, d5, c5, a4));
            d03 = u0Var.b();
        }
        return X.f(view, d03);
    }
}
