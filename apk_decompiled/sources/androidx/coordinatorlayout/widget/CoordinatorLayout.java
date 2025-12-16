package androidx.coordinatorlayout.widget;

import A.a;
import A.b;
import A.c;
import A.e;
import A.f;
import A.h;
import A.i;
import A.j;
import A.k;
import N.d;
import O.C0079u;
import O.D0;
import O.InterfaceC0077s;
import O.InterfaceC0078t;
import O.J;
import O.L;
import O.X;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0077s, InterfaceC0078t {

    /* renamed from: t, reason: collision with root package name */
    public static final String f2756t;

    /* renamed from: u, reason: collision with root package name */
    public static final Class[] f2757u;

    /* renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f2758v;

    /* renamed from: w, reason: collision with root package name */
    public static final i f2759w;

    /* renamed from: x, reason: collision with root package name */
    public static final d f2760x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2761a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2762b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2763c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2764d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2765e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2766f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2767g;
    public boolean h;
    public final int[] i;

    /* renamed from: j, reason: collision with root package name */
    public View f2768j;

    /* renamed from: k, reason: collision with root package name */
    public View f2769k;

    /* renamed from: l, reason: collision with root package name */
    public f f2770l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2771m;

    /* renamed from: n, reason: collision with root package name */
    public D0 f2772n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2773o;
    public Drawable p;

    /* renamed from: q, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f2774q;

    /* renamed from: r, reason: collision with root package name */
    public a f2775r;

    /* renamed from: s, reason: collision with root package name */
    public final C0079u f2776s;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f2756t = r02 != null ? r02.getName() : null;
        f2759w = new i(0);
        f2757u = new Class[]{Context.class, AttributeSet.class};
        f2758v = new ThreadLocal();
        f2760x = new d(12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v6, types: [O.u, java.lang.Object] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f2761a = new ArrayList();
        this.f2762b = new j(0);
        this.f2763c = new ArrayList();
        this.f2764d = new ArrayList();
        this.f2765e = new int[2];
        this.f2766f = new int[2];
        this.f2776s = new Object();
        int[] iArr = z.a.f8997a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.i = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.i[i] = (int) (r11[i] * f2);
            }
        }
        this.p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new A.d(this));
        WeakHashMap weakHashMap = X.f1226a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f2760x.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, e eVar, int i4, int i5) {
        int i6 = eVar.f11c;
        if (i6 == 0) {
            i6 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i);
        int i7 = eVar.f12d;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i7, i);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int i10 = absoluteGravity2 & 7;
        int i11 = absoluteGravity2 & 112;
        int width = i10 != 1 ? i10 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i11 != 16 ? i11 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i8 == 1) {
            width -= i4 / 2;
        } else if (i8 != 5) {
            width -= i4;
        }
        if (i9 == 16) {
            height -= i5 / 2;
        } else if (i9 != 80) {
            height -= i5;
        }
        rect2.set(width, height, i4 + width, i5 + height);
    }

    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f10b) {
            c cVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (c) cls.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    b bVar = (b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    b bVar2 = eVar.f9a;
                    if (bVar2 != bVar) {
                        if (bVar2 != null) {
                            bVar2.i();
                        }
                        eVar.f9a = bVar;
                        eVar.f10b = true;
                        if (bVar != null) {
                            bVar.g(eVar);
                        }
                    }
                } catch (Exception e4) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                }
            }
            eVar.f10b = true;
        }
        return eVar;
    }

    public static void u(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.i;
        if (i4 != i) {
            WeakHashMap weakHashMap = X.f1226a;
            view.offsetLeftAndRight(i - i4);
            eVar.i = i;
        }
    }

    public static void v(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.f16j;
        if (i4 != i) {
            WeakHashMap weakHashMap = X.f1226a;
            view.offsetTopAndBottom(i - i4);
            eVar.f16j = i;
        }
    }

    @Override // O.InterfaceC0077s
    public final void a(View view, View view2, int i, int i4) {
        C0079u c0079u = this.f2776s;
        if (i4 == 1) {
            c0079u.f1299b = i;
        } else {
            c0079u.f1298a = i;
        }
        this.f2769k = view2;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ((e) getChildAt(i5).getLayoutParams()).getClass();
        }
    }

    @Override // O.InterfaceC0077s
    public final void b(View view, int i) {
        C0079u c0079u = this.f2776s;
        if (i == 1) {
            c0079u.f1299b = 0;
        } else {
            c0079u.f1298a = 0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i)) {
                b bVar = eVar.f9a;
                if (bVar != null) {
                    bVar.t(childAt, view, i);
                }
                if (i == 0) {
                    eVar.f19m = false;
                } else if (i == 1) {
                    eVar.f20n = false;
                }
            }
        }
        this.f2769k = null;
    }

    @Override // O.InterfaceC0077s
    public final void c(View view, int i, int i4, int[] iArr, int i5) {
        b bVar;
        int childCount = getChildCount();
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i5) && (bVar = eVar.f9a) != null) {
                    int[] iArr2 = this.f2765e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.n(this, childAt, view, i, i4, iArr2, i5);
                    i6 = i > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z3) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // O.InterfaceC0078t
    public final void d(View view, int i, int i4, int i5, int i6, int i7, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        boolean z3 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i7) && (bVar = eVar.f9a) != null) {
                    int[] iArr2 = this.f2765e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.o(this, childAt, i4, i5, i6, iArr2);
                    i8 = i5 > 0 ? Math.max(i8, iArr2[0]) : Math.min(i8, iArr2[0]);
                    i9 = i6 > 0 ? Math.max(i9, iArr2[1]) : Math.min(i9, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z3) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        b bVar = ((e) view.getLayoutParams()).f9a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // O.InterfaceC0077s
    public final void e(View view, int i, int i4, int i5, int i6, int i7) {
        d(view, i, i4, i5, i6, 0, this.f2766f);
    }

    @Override // O.InterfaceC0077s
    public final boolean f(View view, View view2, int i, int i4) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f9a;
                if (bVar != null) {
                    boolean s4 = bVar.s(childAt, i, i4);
                    z3 |= s4;
                    if (i4 == 0) {
                        eVar.f19m = s4;
                    } else if (i4 == 1) {
                        eVar.f20n = s4;
                    }
                } else if (i4 == 0) {
                    eVar.f19m = false;
                } else if (i4 == 1) {
                    eVar.f20n = false;
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f2761a);
    }

    public final D0 getLastWindowInsets() {
        return this.f2772n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0079u c0079u = this.f2776s;
        return c0079u.f1299b | c0079u.f1298a;
    }

    public Drawable getStatusBarBackground() {
        return this.p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i, int i4) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i4) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i + max, i4 + max2);
    }

    public final void i(View view, Rect rect, boolean z3) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z3) {
            k(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        s.j jVar = (s.j) this.f2762b.f28b;
        int i = jVar.f8352c;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < i; i4++) {
            ArrayList arrayList2 = (ArrayList) jVar.i(i4);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jVar.f(i4));
            }
        }
        ArrayList arrayList3 = this.f2764d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(Rect rect, View view) {
        ThreadLocal threadLocal = k.f31a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = k.f31a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        k.a(this, view, matrix);
        ThreadLocal threadLocal3 = k.f32b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i, int i4) {
        d dVar = f2760x;
        Rect g4 = g();
        k(g4, view);
        try {
            return g4.contains(i, i4);
        } finally {
            g4.setEmpty();
            dVar.c(g4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f2771m) {
            if (this.f2770l == null) {
                this.f2770l = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2770l);
        }
        if (this.f2772n == null) {
            WeakHashMap weakHashMap = X.f1226a;
            if (getFitsSystemWindows()) {
                J.c(this);
            }
        }
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f2771m && this.f2770l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2770l);
        }
        View view = this.f2769k;
        if (view != null) {
            b(view, 0);
        }
        this.h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2773o || this.p == null) {
            return;
        }
        D0 d02 = this.f2772n;
        int d4 = d02 != null ? d02.d() : 0;
        if (d4 > 0) {
            this.p.setBounds(0, 0, getWidth(), d4);
            this.p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r4 = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r4;
        }
        t(true);
        return r4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        b bVar;
        WeakHashMap weakHashMap = X.f1226a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f2761a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f9a) == null || !bVar.k(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f4, boolean z3) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f9a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f4) {
        b bVar;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f9a) != null) {
                    z3 |= bVar.m(view);
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
        c(view, i, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i5, int i6) {
        e(view, i, i4, i5, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f1880a);
        SparseArray sparseArray = hVar.f24c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = n(childAt).f9a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.q(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, W.b, A.h] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable r4;
        ?? bVar = new W.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar2 = ((e) childAt.getLayoutParams()).f9a;
            if (id != -1 && bVar2 != null && (r4 = bVar2.r(childAt)) != null) {
                sparseArray.append(id, r4);
            }
        }
        bVar.f24c = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f2768j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f2768j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            A.e r6 = (A.e) r6
            A.b r6 = r6.f9a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f2768j
            boolean r6 = r6.u(r7, r1)
        L2a:
            android.view.View r7 = r0.f2768j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0047 A[EDGE_INSN: B:117:0x0047->B:9:0x0047 BREAK  A[LOOP:2: B:109:0x02ad->B:115:0x02c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i) {
        Rect g4;
        Rect g5;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f17k;
        if (view2 == null && eVar.f14f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = f2760x;
        if (view2 != null) {
            g4 = g();
            g5 = g();
            try {
                k(g4, view2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g4, g5, eVar2, measuredWidth, measuredHeight);
                h(eVar2, g5, measuredWidth, measuredHeight);
                view.layout(g5.left, g5.top, g5.right, g5.bottom);
                return;
            } finally {
                g4.setEmpty();
                dVar.c(g4);
                g5.setEmpty();
                dVar.c(g5);
            }
        }
        int i4 = eVar.f13e;
        if (i4 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            g4 = g();
            g4.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f2772n != null) {
                WeakHashMap weakHashMap = X.f1226a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g4.left = this.f2772n.b() + g4.left;
                    g4.top = this.f2772n.d() + g4.top;
                    g4.right -= this.f2772n.c();
                    g4.bottom -= this.f2772n.a();
                }
            }
            g5 = g();
            int i5 = eVar3.f11c;
            if ((i5 & 7) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            Gravity.apply(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), g4, g5, i);
            view.layout(g5.left, g5.top, g5.right, g5.bottom);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i6 = eVar4.f11c;
        if (i6 == 0) {
            i6 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i4 = width - i4;
        }
        int m4 = m(i4) - measuredWidth2;
        if (i7 == 1) {
            m4 += measuredWidth2 / 2;
        } else if (i7 == 5) {
            m4 += measuredWidth2;
        }
        int i9 = i8 != 16 ? i8 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(m4, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i9, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f2763c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        i iVar = f2759w;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            b bVar = ((e) view.getLayoutParams()).f9a;
            if (z3 && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                    }
                    if (i == 0) {
                        bVar.j(this, view, motionEvent2);
                    } else if (i == 1) {
                        bVar.u(view, motionEvent2);
                    }
                }
            } else if (!z3 && bVar != null) {
                if (i == 0) {
                    z3 = bVar.j(this, view, motionEvent);
                } else if (i == 1) {
                    z3 = bVar.u(view, motionEvent);
                }
                if (z3) {
                    this.f2768j = view;
                }
            }
        }
        arrayList.clear();
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        b bVar = ((e) view.getLayoutParams()).f9a;
        if (bVar != null) {
            bVar.p(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (!z3 || this.f2767g) {
            return;
        }
        t(false);
        this.f2767g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z3) {
        super.setFitsSystemWindows(z3);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2774q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                Drawable drawable3 = this.p;
                WeakHashMap weakHashMap = X.f1226a;
                H.b.b(drawable3, getLayoutDirection());
                this.p.setVisible(getVisibility() == 0, false);
                this.p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = X.f1226a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? D.h.getDrawable(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z3 = i == 0;
        Drawable drawable = this.p;
        if (drawable == null || drawable.isVisible() == z3) {
            return;
        }
        this.p.setVisible(z3, false);
    }

    public final void t(boolean z3) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVar = ((e) childAt.getLayoutParams()).f9a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                if (z3) {
                    bVar.j(this, childAt, obtain);
                } else {
                    bVar.u(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            ((e) getChildAt(i4).getLayoutParams()).getClass();
        }
        this.f2768j = null;
        this.f2767g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    public final void w() {
        WeakHashMap weakHashMap = X.f1226a;
        if (!getFitsSystemWindows()) {
            L.u(this, null);
            return;
        }
        if (this.f2775r == null) {
            this.f2775r = new a(this, 0);
        }
        L.u(this, this.f2775r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }
}
