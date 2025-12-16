package G2;

import O.L;
import O.X;
import a.AbstractC0106b;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.adif.elcanomovil.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import i2.AbstractC0396a;
import j0.C0399a;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f602a;

    /* renamed from: b, reason: collision with root package name */
    public final int f603b;

    /* renamed from: c, reason: collision with root package name */
    public final int f604c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f605d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f606e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f607f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f608g;
    public final Context h;
    public final j i;

    /* renamed from: j, reason: collision with root package name */
    public final SnackbarContentLayout f609j;

    /* renamed from: k, reason: collision with root package name */
    public int f610k;

    /* renamed from: m, reason: collision with root package name */
    public int f612m;

    /* renamed from: n, reason: collision with root package name */
    public int f613n;

    /* renamed from: o, reason: collision with root package name */
    public int f614o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public int f615q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f616r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f617s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f618t;

    /* renamed from: v, reason: collision with root package name */
    public static final C0399a f597v = AbstractC0396a.f6816b;

    /* renamed from: w, reason: collision with root package name */
    public static final LinearInterpolator f598w = AbstractC0396a.f6815a;

    /* renamed from: x, reason: collision with root package name */
    public static final C0399a f599x = AbstractC0396a.f6818d;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f601z = {R.attr.snackbarStyle};

    /* renamed from: A, reason: collision with root package name */
    public static final String f596A = k.class.getSimpleName();

    /* renamed from: y, reason: collision with root package name */
    public static final Handler f600y = new Handler(Looper.getMainLooper(), new Object());

    /* renamed from: l, reason: collision with root package name */
    public final e f611l = new e(this, 0);

    /* renamed from: u, reason: collision with root package name */
    public final g f619u = new g(this);

    public k(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        int i = 1;
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f608g = viewGroup;
        this.f609j = snackbarContentLayout2;
        this.h = context;
        x2.m.c(context, x2.m.f8965a, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f601z);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        j jVar = (j) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = jVar;
        j.a(jVar, this);
        float actionTextColorAlpha = jVar.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f5755b.setTextColor(m3.d.y(actionTextColorAlpha, m3.d.t(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f5755b.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(jVar.getMaxInlineActionWidth());
        jVar.addView(snackbarContentLayout);
        WeakHashMap weakHashMap = X.f1226a;
        jVar.setAccessibilityLiveRegion(1);
        jVar.setImportantForAccessibility(1);
        jVar.setFitsSystemWindows(true);
        L.u(jVar, new f(this));
        X.j(jVar, new F0.g(this, i));
        this.f618t = (AccessibilityManager) context.getSystemService("accessibility");
        this.f604c = AbstractC0106b.E(context, R.attr.motionDurationLong2, 250);
        this.f602a = AbstractC0106b.E(context, R.attr.motionDurationLong2, 150);
        this.f603b = AbstractC0106b.E(context, R.attr.motionDurationMedium1, 75);
        this.f605d = AbstractC0106b.F(context, R.attr.motionEasingEmphasizedInterpolator, f598w);
        this.f607f = AbstractC0106b.F(context, R.attr.motionEasingEmphasizedInterpolator, f599x);
        this.f606e = AbstractC0106b.F(context, R.attr.motionEasingEmphasizedInterpolator, f597v);
    }

    public final void a(int i) {
        A.j h = A.j.h();
        g gVar = this.f619u;
        synchronized (h.f27a) {
            try {
                if (h.k(gVar)) {
                    h.a((o) h.f29c, i);
                } else {
                    o oVar = (o) h.f30d;
                    if (oVar != null && oVar.f627a.get() == gVar) {
                        h.a((o) h.f30d, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void b(int i) {
        A.j h = A.j.h();
        g gVar = this.f619u;
        synchronized (h.f27a) {
            try {
                if (h.k(gVar)) {
                    h.f29c = null;
                    if (((o) h.f30d) != null) {
                        h.p();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.f617s;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((h) this.f617s.get(size)).onDismissed(this, i);
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void c() {
        A.j h = A.j.h();
        g gVar = this.f619u;
        synchronized (h.f27a) {
            try {
                if (h.k(gVar)) {
                    h.o((o) h.f29c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.f617s;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((h) this.f617s.get(size)).onShown(this);
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z3 = true;
        AccessibilityManager accessibilityManager = this.f618t;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z3 = false;
        }
        j jVar = this.i;
        if (z3) {
            jVar.post(new e(this, 2));
            return;
        }
        if (jVar.getParent() != null) {
            jVar.setVisibility(0);
        }
        c();
    }

    public final void e() {
        j jVar = this.i;
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        boolean z3 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f596A;
        if (!z3) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (jVar.f594j == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (jVar.getParent() == null) {
            return;
        }
        int i = this.f612m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = jVar.f594j;
        int i4 = rect.bottom + i;
        int i5 = rect.left + this.f613n;
        int i6 = rect.right + this.f614o;
        int i7 = rect.top;
        boolean z4 = (marginLayoutParams.bottomMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6 && marginLayoutParams.topMargin == i7) ? false : true;
        if (z4) {
            marginLayoutParams.bottomMargin = i4;
            marginLayoutParams.leftMargin = i5;
            marginLayoutParams.rightMargin = i6;
            marginLayoutParams.topMargin = i7;
            jVar.requestLayout();
        }
        if ((z4 || this.f615q != this.p) && this.p > 0) {
            ViewGroup.LayoutParams layoutParams2 = jVar.getLayoutParams();
            if ((layoutParams2 instanceof A.e) && (((A.e) layoutParams2).f9a instanceof SwipeDismissBehavior)) {
                e eVar = this.f611l;
                jVar.removeCallbacks(eVar);
                jVar.post(eVar);
            }
        }
    }
}
