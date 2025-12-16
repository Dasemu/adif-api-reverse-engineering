package o2;

import E2.g;
import O.D0;
import O.E0;
import O.F0;
import O.L;
import O.X;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import m3.l;

/* loaded from: classes3.dex */
public final class d extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f8088a;

    /* renamed from: b, reason: collision with root package name */
    public final D0 f8089b;

    /* renamed from: c, reason: collision with root package name */
    public Window f8090c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8091d;

    public d(View view, D0 d02) {
        ColorStateList g4;
        this.f8089b = d02;
        g gVar = BottomSheetBehavior.A(view).i;
        if (gVar != null) {
            g4 = gVar.f400a.f388c;
        } else {
            WeakHashMap weakHashMap = X.f1226a;
            g4 = L.g(view);
        }
        if (g4 != null) {
            this.f8088a = Boolean.valueOf(m3.d.x(g4.getDefaultColor()));
            return;
        }
        ColorStateList p = l.p(view.getBackground());
        Integer valueOf = p != null ? Integer.valueOf(p.getDefaultColor()) : null;
        if (valueOf != null) {
            this.f8088a = Boolean.valueOf(m3.d.x(valueOf.intValue()));
        } else {
            this.f8088a = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        E0 e02;
        WindowInsetsController insetsController;
        E0 e03;
        WindowInsetsController insetsController2;
        int top = view.getTop();
        D0 d02 = this.f8089b;
        if (top < d02.d()) {
            Window window = this.f8090c;
            if (window != null) {
                Boolean bool = this.f8088a;
                boolean booleanValue = bool == null ? this.f8091d : bool.booleanValue();
                E2.e eVar = new E2.e(window.getDecorView(), 5);
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    F0 f02 = new F0(insetsController2, eVar);
                    f02.f1215b = window;
                    e03 = f02;
                } else {
                    e03 = new E0(window, eVar);
                }
                e03.F(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), d02.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f8090c;
            if (window2 != null) {
                boolean z3 = this.f8091d;
                E2.e eVar2 = new E2.e(window2.getDecorView(), 5);
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window2.getInsetsController();
                    F0 f03 = new F0(insetsController, eVar2);
                    f03.f1215b = window2;
                    e02 = f03;
                } else {
                    e02 = new E0(window2, eVar2);
                }
                e02.F(z3);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Window window) {
        E0 e02;
        WindowInsetsController insetsController;
        if (this.f8090c == window) {
            return;
        }
        this.f8090c = window;
        if (window != null) {
            E2.e eVar = new E2.e(window.getDecorView(), 5);
            if (Build.VERSION.SDK_INT >= 30) {
                insetsController = window.getInsetsController();
                F0 f02 = new F0(insetsController, eVar);
                f02.f1215b = window;
                e02 = f02;
            } else {
                e02 = new E0(window, eVar);
            }
            this.f8091d = e02.v();
        }
    }

    @Override // o2.a
    public final void onLayout(View view) {
        a(view);
    }

    @Override // o2.a
    public final void onSlide(View view, float f2) {
        a(view);
    }

    @Override // o2.a
    public final void onStateChanged(View view, int i) {
        a(view);
    }
}
