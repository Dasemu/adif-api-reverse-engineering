package o2;

import F0.g;
import G2.i;
import O.L;
import O.X;
import R0.h;
import a.AbstractC0105a;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.adif.elcanomovil.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.datepicker.j;
import g.DialogC0353G;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import y2.C0664c;
import y2.InterfaceC0663b;

/* loaded from: classes3.dex */
public final class e extends DialogC0353G {

    /* renamed from: f, reason: collision with root package name */
    public BottomSheetBehavior f8092f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f8093g;
    public CoordinatorLayout h;
    public FrameLayout i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8094j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8095k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8096l;

    /* renamed from: m, reason: collision with root package name */
    public d f8097m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f8098n;

    /* renamed from: o, reason: collision with root package name */
    public h f8099o;
    public final c p;

    public e(Context context) {
        this(context, 0);
        this.f8098n = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f8092f == null) {
            f();
        }
        super.cancel();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, R0.h] */
    public final void f() {
        if (this.f8093g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f8093g = frameLayout;
            this.h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f8093g.findViewById(R.id.design_bottom_sheet);
            this.i = frameLayout2;
            BottomSheetBehavior A3 = BottomSheetBehavior.A(frameLayout2);
            this.f8092f = A3;
            c cVar = this.p;
            ArrayList arrayList = A3.f5558W;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
            this.f8092f.F(this.f8094j);
            BottomSheetBehavior bottomSheetBehavior = this.f8092f;
            FrameLayout frameLayout3 = this.i;
            ?? obj = new Object();
            int i = Build.VERSION.SDK_INT;
            obj.f1413a = i >= 34 ? new Object() : i >= 33 ? new Object() : null;
            obj.f1414b = bottomSheetBehavior;
            obj.f1415c = frameLayout3;
            this.f8099o = obj;
        }
    }

    public final FrameLayout g(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f8093g.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f8098n) {
            FrameLayout frameLayout = this.i;
            h3.d dVar = new h3.d(this, 7);
            WeakHashMap weakHashMap = X.f1226a;
            L.u(frameLayout, dVar);
        }
        this.i.removeAllViews();
        if (layoutParams == null) {
            this.i.addView(view);
        } else {
            this.i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new j(this, 4));
        X.j(this.i, new g(this, 3));
        this.i.setOnTouchListener(new i(1));
        return this.f8093g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z3 = this.f8098n && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f8093g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z3);
            }
            CoordinatorLayout coordinatorLayout = this.h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z3);
            }
            AbstractC0105a.O(window, !z3);
            d dVar = this.f8097m;
            if (dVar != null) {
                dVar.b(window);
            }
        }
        h hVar = this.f8099o;
        if (hVar == null) {
            return;
        }
        boolean z4 = this.f8094j;
        View view = (View) hVar.f1415c;
        C0664c c0664c = (C0664c) hVar.f1413a;
        if (z4) {
            if (c0664c != null) {
                c0664c.b((InterfaceC0663b) hVar.f1414b, view, false);
            }
        } else if (c0664c != null) {
            c0664c.c(view);
        }
    }

    @Override // g.DialogC0353G, b.p, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(IntCompanionObject.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        C0664c c0664c;
        d dVar = this.f8097m;
        if (dVar != null) {
            dVar.b(null);
        }
        h hVar = this.f8099o;
        if (hVar == null || (c0664c = (C0664c) hVar.f1413a) == null) {
            return;
        }
        c0664c.c((View) hVar.f1415c);
    }

    @Override // b.p, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f8092f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f5547L != 5) {
            return;
        }
        bottomSheetBehavior.H(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z3) {
        h hVar;
        super.setCancelable(z3);
        if (this.f8094j != z3) {
            this.f8094j = z3;
            BottomSheetBehavior bottomSheetBehavior = this.f8092f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.F(z3);
            }
            if (getWindow() == null || (hVar = this.f8099o) == null) {
                return;
            }
            boolean z4 = this.f8094j;
            View view = (View) hVar.f1415c;
            C0664c c0664c = (C0664c) hVar.f1413a;
            if (z4) {
                if (c0664c != null) {
                    c0664c.b((InterfaceC0663b) hVar.f1414b, view, false);
                }
            } else if (c0664c != null) {
                c0664c.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z3) {
        super.setCanceledOnTouchOutside(z3);
        if (z3 && !this.f8094j) {
            this.f8094j = true;
        }
        this.f8095k = z3;
        this.f8096l = true;
    }

    @Override // g.DialogC0353G, b.p, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(g(null, i, null));
    }

    @Override // g.DialogC0353G, b.p, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(g(view, 0, null));
    }

    @Override // g.DialogC0353G, b.p, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(view, 0, layoutParams));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130903178(0x7f03008a, float:1.7413167E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132017813(0x7f140295, float:1.9673915E38)
        L1b:
            r3.<init>(r4, r5)
            r3.f8094j = r0
            r3.f8095k = r0
            o2.c r4 = new o2.c
            r4.<init>(r3)
            r3.p = r4
            g.r r4 = r3.c()
            r4.h(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = 2130903503(0x7f0301cf, float:1.7413826E38)
            int[] r5 = new int[]{r5}
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            r5 = 0
            boolean r4 = r4.getBoolean(r5, r5)
            r3.f8098n = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.e.<init>(android.content.Context, int):void");
    }
}
