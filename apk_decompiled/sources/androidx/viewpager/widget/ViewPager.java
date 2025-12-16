package androidx.viewpager.widget;

import A.i;
import F0.a;
import F0.b;
import F0.c;
import F0.d;
import F0.e;
import F0.f;
import F0.g;
import F0.h;
import F0.j;
import O.L;
import O.X;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: W, reason: collision with root package name */
    public static final int[] f4021W = {R.attr.layout_gravity};

    /* renamed from: a0, reason: collision with root package name */
    public static final i f4022a0 = new i(1);

    /* renamed from: b0, reason: collision with root package name */
    public static final b f4023b0 = new b(0);

    /* renamed from: A, reason: collision with root package name */
    public int f4024A;

    /* renamed from: B, reason: collision with root package name */
    public final int f4025B;

    /* renamed from: C, reason: collision with root package name */
    public float f4026C;

    /* renamed from: D, reason: collision with root package name */
    public float f4027D;

    /* renamed from: E, reason: collision with root package name */
    public float f4028E;

    /* renamed from: F, reason: collision with root package name */
    public float f4029F;

    /* renamed from: G, reason: collision with root package name */
    public int f4030G;

    /* renamed from: H, reason: collision with root package name */
    public VelocityTracker f4031H;

    /* renamed from: I, reason: collision with root package name */
    public final int f4032I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4033K;

    /* renamed from: L, reason: collision with root package name */
    public final int f4034L;

    /* renamed from: M, reason: collision with root package name */
    public final EdgeEffect f4035M;

    /* renamed from: N, reason: collision with root package name */
    public final EdgeEffect f4036N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f4037O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f4038P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4039Q;

    /* renamed from: R, reason: collision with root package name */
    public ArrayList f4040R;

    /* renamed from: S, reason: collision with root package name */
    public h f4041S;

    /* renamed from: T, reason: collision with root package name */
    public ArrayList f4042T;

    /* renamed from: U, reason: collision with root package name */
    public final c f4043U;

    /* renamed from: V, reason: collision with root package name */
    public int f4044V;

    /* renamed from: a, reason: collision with root package name */
    public int f4045a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4046b;

    /* renamed from: c, reason: collision with root package name */
    public final e f4047c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4048d;

    /* renamed from: e, reason: collision with root package name */
    public a f4049e;

    /* renamed from: f, reason: collision with root package name */
    public int f4050f;

    /* renamed from: g, reason: collision with root package name */
    public int f4051g;
    public Parcelable h;
    public ClassLoader i;

    /* renamed from: j, reason: collision with root package name */
    public final Scroller f4052j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4053k;

    /* renamed from: l, reason: collision with root package name */
    public F0.i f4054l;

    /* renamed from: m, reason: collision with root package name */
    public int f4055m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f4056n;

    /* renamed from: o, reason: collision with root package name */
    public int f4057o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public float f4058q;

    /* renamed from: r, reason: collision with root package name */
    public float f4059r;

    /* renamed from: s, reason: collision with root package name */
    public int f4060s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4061t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4062u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4063v;

    /* renamed from: w, reason: collision with root package name */
    public int f4064w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4065x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4066y;

    /* renamed from: z, reason: collision with root package name */
    public final int f4067z;

    /* JADX WARN: Type inference failed for: r4v2, types: [F0.e, java.lang.Object] */
    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4046b = new ArrayList();
        this.f4047c = new Object();
        this.f4048d = new Rect();
        this.f4051g = -1;
        this.h = null;
        this.i = null;
        this.f4058q = -3.4028235E38f;
        this.f4059r = Float.MAX_VALUE;
        this.f4064w = 1;
        this.f4030G = -1;
        this.f4037O = true;
        this.f4043U = new c(this, 0);
        this.f4044V = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f4052j = new Scroller(context2, f4023b0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f2 = context2.getResources().getDisplayMetrics().density;
        this.f4025B = viewConfiguration.getScaledPagingTouchSlop();
        this.f4032I = (int) (400.0f * f2);
        this.J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4035M = new EdgeEffect(context2);
        this.f4036N = new EdgeEffect(context2);
        this.f4033K = (int) (25.0f * f2);
        this.f4034L = (int) (2.0f * f2);
        this.f4067z = (int) (f2 * 16.0f);
        X.j(this, new g(this, 0));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        L.u(this, new F.i(this));
    }

    public static boolean c(int i, int i4, int i5, View view, boolean z3) {
        int i6;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i7 = i4 + scrollX;
                if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && (i6 = i5 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom() && c(i, i7 - childAt.getLeft(), i6 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z3 && view.canScrollHorizontally(-i);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z3) {
        if (this.f4062u != z3) {
            this.f4062u = z3;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [F0.e, java.lang.Object] */
    public final e a(int i, int i4) {
        ?? obj = new Object();
        obj.f519b = i;
        obj.f518a = this.f4049e.instantiateItem((ViewGroup) this, i);
        obj.f521d = this.f4049e.getPageWidth(i);
        ArrayList arrayList = this.f4046b;
        if (i4 < 0 || i4 >= arrayList.size()) {
            arrayList.add(obj);
            return obj;
        }
        arrayList.add(i4, obj);
        return obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i4) {
        e h;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() == 0 && (h = h(childAt)) != null && h.f519b == this.f4050f) {
                    childAt.addFocusables(arrayList, i, i4);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i4 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        e h;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (h = h(childAt)) != null && h.f519b == this.f4050f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        f fVar = (f) layoutParams;
        boolean z3 = fVar.f523a | (view.getClass().getAnnotation(d.class) != null);
        fVar.f523a = z3;
        if (!this.f4061t) {
            super.addView(view, i, layoutParams);
        } else {
            if (z3) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            fVar.f526d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r7) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            android.graphics.Rect r6 = r7.f4048d
            if (r8 != r5) goto L97
            android.graphics.Rect r4 = r7.g(r6, r1)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.g(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L91
            if (r4 < r5) goto L91
            int r0 = r7.f4050f
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.f4063v = r3
            r7.u(r0, r3, r2, r3)
            goto Lce
        L91:
            boolean r0 = r1.requestFocus()
        L95:
            r3 = r0
            goto Lcf
        L97:
            if (r8 != r4) goto Lcf
            android.graphics.Rect r2 = r7.g(r6, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.g(r6, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r7.m()
            goto L95
        Lae:
            boolean r0 = r1.requestFocus()
            goto L95
        Lb3:
            if (r8 == r5) goto Lc2
            if (r8 != r2) goto Lb8
            goto Lc2
        Lb8:
            if (r8 == r4) goto Lbd
            r0 = 2
            if (r8 != r0) goto Lcf
        Lbd:
            boolean r3 = r7.m()
            goto Lcf
        Lc2:
            int r0 = r7.f4050f
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.f4063v = r3
            r7.u(r0, r3, r2, r3)
            goto Lce
        Lcd:
            r2 = r3
        Lce:
            r3 = r2
        Lcf:
            if (r3 == 0) goto Ld8
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Ld8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.b(int):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f4049e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f4058q)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f4059r));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f4053k = true;
        Scroller scroller = this.f4052j;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!n(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = X.f1226a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z3) {
        Scroller scroller = this.f4052j;
        boolean z4 = this.f4044V == 2;
        if (z4) {
            setScrollingCacheEnabled(false);
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        n(currX);
                    }
                }
            }
        }
        this.f4063v = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4046b;
            if (i >= arrayList.size()) {
                break;
            }
            e eVar = (e) arrayList.get(i);
            if (eVar.f520c) {
                eVar.f520c = false;
                z4 = true;
            }
            i++;
        }
        if (z4) {
            c cVar = this.f4043U;
            if (!z3) {
                cVar.run();
            } else {
                WeakHashMap weakHashMap = X.f1226a;
                postOnAnimation(cVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L66
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L61
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L61
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r5 = r5.b(r4)
            goto L62
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L61
            boolean r5 = r5.b(r1)
            goto L62
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r5 = r5.m()
            goto L62
        L41:
            r6 = 66
            boolean r5 = r5.b(r6)
            goto L62
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L5a
            int r6 = r5.f4050f
            if (r6 <= 0) goto L61
            int r6 = r6 - r1
            r5.f4063v = r2
            r5.u(r6, r2, r1, r2)
            r5 = r1
            goto L62
        L5a:
            r6 = 17
            boolean r5 = r5.b(r6)
            goto L62
        L61:
            r5 = r2
        L62:
            if (r5 == 0) goto L65
            goto L66
        L65:
            return r2
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e h;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (h = h(childAt)) != null && h.f519b == this.f4050f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a aVar;
        EdgeEffect edgeEffect = this.f4036N;
        EdgeEffect edgeEffect2 = this.f4035M;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z3 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f4049e) != null && aVar.getCount() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f4058q * width);
                edgeEffect2.setSize(height, width);
                z3 = edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!edgeEffect.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f4059r + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                z3 |= edgeEffect.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (z3) {
            WeakHashMap weakHashMap = X.f1226a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4056n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int count = this.f4049e.getCount();
        this.f4045a = count;
        ArrayList arrayList = this.f4046b;
        boolean z3 = arrayList.size() < (this.f4064w * 2) + 1 && arrayList.size() < count;
        int i = this.f4050f;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < arrayList.size()) {
            e eVar = (e) arrayList.get(i4);
            int itemPosition = this.f4049e.getItemPosition(eVar.f518a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    arrayList.remove(i4);
                    i4--;
                    if (!z4) {
                        this.f4049e.startUpdate((ViewGroup) this);
                        z4 = true;
                    }
                    this.f4049e.destroyItem((ViewGroup) this, eVar.f519b, eVar.f518a);
                    int i5 = this.f4050f;
                    if (i5 == eVar.f519b) {
                        i = Math.max(0, Math.min(i5, count - 1));
                    }
                } else {
                    int i6 = eVar.f519b;
                    if (i6 != itemPosition) {
                        if (i6 == this.f4050f) {
                            i = itemPosition;
                        }
                        eVar.f519b = itemPosition;
                    }
                }
                z3 = true;
            }
            i4++;
        }
        if (z4) {
            this.f4049e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(arrayList, f4022a0);
        if (z3) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                f fVar = (f) getChildAt(i7).getLayoutParams();
                if (!fVar.f523a) {
                    fVar.f525c = BitmapDescriptorFactory.HUE_RED;
                }
            }
            u(i, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i) {
        h hVar = this.f4041S;
        if (hVar != null) {
            hVar.b(i);
        }
        ArrayList arrayList = this.f4040R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                h hVar2 = (h) this.f4040R.get(i4);
                if (hVar2 != null) {
                    hVar2.b(i);
                }
            }
        }
    }

    public final Rect g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [F0.f, android.view.ViewGroup$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.f525c = BitmapDescriptorFactory.HUE_RED;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f4049e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f4050f;
    }

    public int getOffscreenPageLimit() {
        return this.f4064w;
    }

    public int getPageMargin() {
        return this.f4055m;
    }

    public final e h(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4046b;
            if (i >= arrayList.size()) {
                return null;
            }
            e eVar = (e) arrayList.get(i);
            if (this.f4049e.isViewFromObject(view, eVar.f518a)) {
                return eVar;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F0.e i() {
        /*
            r13 = this;
            int r0 = r13.getClientWidth()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r13.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r0 <= 0) goto L18
            int r3 = r13.f4055m
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            goto L19
        L18:
            r3 = r1
        L19:
            r0 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            r8 = r0
            r9 = r5
            r7 = r6
            r6 = r4
            r4 = r1
        L22:
            java.util.ArrayList r10 = r13.f4046b
            int r11 = r10.size()
            if (r8 >= r11) goto L71
            java.lang.Object r11 = r10.get(r8)
            F0.e r11 = (F0.e) r11
            if (r9 != 0) goto L4b
            int r12 = r11.f519b
            int r6 = r6 + r5
            if (r12 == r6) goto L4b
            float r1 = r1 + r4
            float r1 = r1 + r3
            F0.e r4 = r13.f4047c
            r4.f522e = r1
            r4.f519b = r6
            F0.a r1 = r13.f4049e
            float r1 = r1.getPageWidth(r6)
            r4.f521d = r1
            int r8 = r8 + (-1)
            r6 = r4
            goto L4c
        L4b:
            r6 = r11
        L4c:
            float r1 = r6.f522e
            float r4 = r6.f521d
            float r4 = r4 + r1
            float r4 = r4 + r3
            if (r9 != 0) goto L58
            int r9 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r9 < 0) goto L71
        L58:
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L70
            int r4 = r10.size()
            int r4 = r4 - r5
            if (r8 != r4) goto L64
            goto L70
        L64:
            int r4 = r6.f519b
            float r7 = r6.f521d
            int r8 = r8 + 1
            r9 = r6
            r6 = r4
            r4 = r7
            r7 = r9
            r9 = r0
            goto L22
        L70:
            return r6
        L71:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.i():F0.e");
    }

    public final e j(int i) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4046b;
            if (i4 >= arrayList.size()) {
                return null;
            }
            e eVar = (e) arrayList.get(i4);
            if (eVar.f519b == i) {
                return eVar;
            }
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.f4039Q
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L1b:
            if (r6 >= r5) goto L6c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            F0.f r8 = (F0.f) r8
            boolean r9 = r8.f523a
            if (r9 != 0) goto L2c
            goto L69
        L2c:
            int r8 = r8.f524b
            r8 = r8 & 7
            if (r8 == r1) goto L50
            r9 = 3
            if (r8 == r9) goto L4a
            r9 = 5
            if (r8 == r9) goto L3a
            r8 = r2
            goto L5d
        L3a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L46:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5d
        L4a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5d
        L50:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L46
        L5d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L68
            r7.offsetLeftAndRight(r2)
        L68:
            r2 = r8
        L69:
            int r6 = r6 + 1
            goto L1b
        L6c:
            F0.h r14 = r11.f4041S
            if (r14 == 0) goto L73
            r14.c(r12, r13)
        L73:
            java.util.ArrayList r14 = r11.f4040R
            if (r14 == 0) goto L8d
            int r14 = r14.size()
        L7b:
            if (r0 >= r14) goto L8d
            java.util.ArrayList r2 = r11.f4040R
            java.lang.Object r2 = r2.get(r0)
            F0.h r2 = (F0.h) r2
            if (r2 == 0) goto L8a
            r2.c(r12, r13)
        L8a:
            int r0 = r0 + 1
            goto L7b
        L8d:
            r11.f4038P = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.k(int, float, int):void");
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4030G) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4026C = motionEvent.getX(i);
            this.f4030G = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f4031H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean m() {
        a aVar = this.f4049e;
        if (aVar == null || this.f4050f >= aVar.getCount() - 1) {
            return false;
        }
        int i = this.f4050f + 1;
        this.f4063v = false;
        u(i, 0, true, false);
        return true;
    }

    public final boolean n(int i) {
        if (this.f4046b.size() == 0) {
            if (!this.f4037O) {
                this.f4038P = false;
                k(0, BitmapDescriptorFactory.HUE_RED, 0);
                if (!this.f4038P) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        e i4 = i();
        int clientWidth = getClientWidth();
        int i5 = this.f4055m;
        int i6 = clientWidth + i5;
        float f2 = clientWidth;
        int i7 = i4.f519b;
        float f4 = ((i / f2) - i4.f522e) / (i4.f521d + (i5 / f2));
        this.f4038P = false;
        k(i7, f4, (int) (i6 * f4));
        if (this.f4038P) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean o(float f2) {
        boolean z3;
        boolean z4;
        float f4 = this.f4026C - f2;
        this.f4026C = f2;
        float scrollX = getScrollX() + f4;
        float clientWidth = getClientWidth();
        float f5 = this.f4058q * clientWidth;
        float f6 = this.f4059r * clientWidth;
        ArrayList arrayList = this.f4046b;
        boolean z5 = false;
        e eVar = (e) arrayList.get(0);
        e eVar2 = (e) arrayList.get(arrayList.size() - 1);
        if (eVar.f519b != 0) {
            f5 = eVar.f522e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (eVar2.f519b != this.f4049e.getCount() - 1) {
            f6 = eVar2.f522e * clientWidth;
            z4 = false;
        } else {
            z4 = true;
        }
        if (scrollX < f5) {
            if (z3) {
                this.f4035M.onPull(Math.abs(f5 - scrollX) / clientWidth);
                z5 = true;
            }
            scrollX = f5;
        } else if (scrollX > f6) {
            if (z4) {
                this.f4036N.onPull(Math.abs(scrollX - f6) / clientWidth);
                z5 = true;
            }
            scrollX = f6;
        }
        int i = (int) scrollX;
        this.f4026C = (scrollX - i) + this.f4026C;
        scrollTo(i, getScrollY());
        n(i);
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4037O = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f4043U);
        Scroller scroller = this.f4052j;
        if (scroller != null && !scroller.isFinished()) {
            this.f4052j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f2;
        ArrayList arrayList;
        int i4;
        super.onDraw(canvas);
        if (this.f4055m <= 0 || this.f4056n == null) {
            return;
        }
        ArrayList arrayList2 = this.f4046b;
        if (arrayList2.size() <= 0 || this.f4049e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.f4055m / width;
        int i5 = 0;
        e eVar = (e) arrayList2.get(0);
        float f5 = eVar.f522e;
        int size = arrayList2.size();
        int i6 = eVar.f519b;
        int i7 = ((e) arrayList2.get(size - 1)).f519b;
        while (i6 < i7) {
            while (true) {
                i = eVar.f519b;
                if (i6 <= i || i5 >= size) {
                    break;
                }
                i5++;
                eVar = (e) arrayList2.get(i5);
            }
            if (i6 == i) {
                float f6 = eVar.f522e;
                float f7 = eVar.f521d;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float pageWidth = this.f4049e.getPageWidth(i6);
                f2 = (f5 + pageWidth) * width;
                f5 = pageWidth + f4 + f5;
            }
            if (this.f4055m + f2 > scrollX) {
                arrayList = arrayList2;
                i4 = scrollX;
                this.f4056n.setBounds(Math.round(f2), this.f4057o, Math.round(this.f4055m + f2), this.p);
                this.f4056n.draw(canvas);
            } else {
                arrayList = arrayList2;
                i4 = scrollX;
            }
            if (f2 > i4 + r3) {
                return;
            }
            i6++;
            arrayList2 = arrayList;
            scrollX = i4;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.f4025B;
        Scroller scroller = this.f4052j;
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 3 || action == 1) {
            s();
            return false;
        }
        if (action != 0) {
            if (this.f4065x) {
                return true;
            }
            if (this.f4066y) {
                return false;
            }
        }
        if (action == 0) {
            float x3 = motionEvent.getX();
            this.f4028E = x3;
            this.f4026C = x3;
            float y3 = motionEvent.getY();
            this.f4029F = y3;
            this.f4027D = y3;
            this.f4030G = motionEvent.getPointerId(0);
            this.f4066y = false;
            this.f4053k = true;
            scroller.computeScrollOffset();
            if (this.f4044V != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.f4034L) {
                d(false);
                this.f4065x = false;
            } else {
                scroller.abortAnimation();
                this.f4063v = false;
                p();
                this.f4065x = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i4 = this.f4030G;
            if (i4 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float x4 = motionEvent.getX(findPointerIndex);
                float f2 = x4 - this.f4026C;
                float abs = Math.abs(f2);
                float y4 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y4 - this.f4029F);
                if (f2 != BitmapDescriptorFactory.HUE_RED) {
                    float f4 = this.f4026C;
                    if ((f4 >= this.f4024A || f2 <= BitmapDescriptorFactory.HUE_RED) && ((f4 <= getWidth() - this.f4024A || f2 >= BitmapDescriptorFactory.HUE_RED) && c((int) f2, (int) x4, (int) y4, this, false))) {
                        this.f4026C = x4;
                        this.f4027D = y4;
                        this.f4066y = true;
                        return false;
                    }
                }
                float f5 = i;
                if (abs > f5 && abs * 0.5f > abs2) {
                    this.f4065x = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f6 = this.f4028E;
                    float f7 = i;
                    this.f4026C = f2 > BitmapDescriptorFactory.HUE_RED ? f6 + f7 : f6 - f7;
                    this.f4027D = y4;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f5) {
                    this.f4066y = true;
                }
                if (this.f4065x && o(x4)) {
                    WeakHashMap weakHashMap = X.f1226a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.f4031H == null) {
            this.f4031H = VelocityTracker.obtain();
        }
        this.f4031H.addMovement(motionEvent);
        return this.f4065x;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        f fVar;
        f fVar2;
        int i5;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i4));
        int measuredWidth = getMeasuredWidth();
        this.f4024A = Math.min(measuredWidth / 10, this.f4067z);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z3 = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.f523a) {
                int i8 = fVar2.f524b;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                boolean z4 = i10 == 48 || i10 == 80;
                if (i9 != 3 && i9 != 5) {
                    z3 = false;
                }
                int i11 = IntCompanionObject.MIN_VALUE;
                if (z4) {
                    i5 = Integer.MIN_VALUE;
                    i11 = 1073741824;
                } else {
                    i5 = z3 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i12 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i12 != -2) {
                    if (i12 == -1) {
                        i12 = paddingLeft;
                    }
                    i11 = 1073741824;
                } else {
                    i12 = paddingLeft;
                }
                int i13 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i13 == -2) {
                    i13 = measuredHeight;
                    i7 = i5;
                } else if (i13 == -1) {
                    i13 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, i11), View.MeasureSpec.makeMeasureSpec(i13, i7));
                if (z4) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z3) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f4060s = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f4061t = true;
        p();
        this.f4061t = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f523a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fVar.f525c), 1073741824), this.f4060s);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i4;
        int i5;
        int i6;
        e h;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i6 = 1;
        } else {
            i4 = childCount - 1;
            i5 = -1;
            i6 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (h = h(childAt)) != null && h.f519b == this.f4050f && childAt.requestFocus(i, rect)) {
                return true;
            }
            i4 += i6;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f1880a);
        a aVar = this.f4049e;
        ClassLoader classLoader = jVar.f533e;
        if (aVar != null) {
            aVar.restoreState(jVar.f532d, classLoader);
            u(jVar.f531c, 0, false, true);
        } else {
            this.f4051g = jVar.f531c;
            this.h = jVar.f532d;
            this.i = classLoader;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, F0.j, W.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new W.b(super.onSaveInstanceState());
        bVar.f531c = this.f4050f;
        a aVar = this.f4049e;
        if (aVar != null) {
            bVar.f532d = aVar.saveState();
        }
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i5, int i6) {
        super.onSizeChanged(i, i4, i5, i6);
        if (i != i5) {
            int i7 = this.f4055m;
            r(i, i5, i7, i7);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        int i = this.f4025B;
        boolean z3 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f4049e) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.f4031H == null) {
            this.f4031H = VelocityTracker.obtain();
        }
        this.f4031H.addMovement(motionEvent);
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            this.f4052j.abortAnimation();
            this.f4063v = false;
            p();
            float x3 = motionEvent.getX();
            this.f4028E = x3;
            this.f4026C = x3;
            float y3 = motionEvent.getY();
            this.f4029F = y3;
            this.f4027D = y3;
            this.f4030G = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f4065x) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4030G);
                    if (findPointerIndex == -1) {
                        z3 = s();
                    } else {
                        float x4 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x4 - this.f4026C);
                        float y4 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y4 - this.f4027D);
                        if (abs > i && abs > abs2) {
                            this.f4065x = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f2 = this.f4028E;
                            float f4 = i;
                            this.f4026C = x4 - f2 > BitmapDescriptorFactory.HUE_RED ? f2 + f4 : f2 - f4;
                            this.f4027D = y4;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f4065x) {
                    z3 = o(motionEvent.getX(motionEvent.findPointerIndex(this.f4030G)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f4026C = motionEvent.getX(actionIndex);
                    this.f4030G = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    l(motionEvent);
                    this.f4026C = motionEvent.getX(motionEvent.findPointerIndex(this.f4030G));
                }
            } else if (this.f4065x) {
                t(this.f4050f, 0, true, false);
                z3 = s();
            }
        } else if (this.f4065x) {
            VelocityTracker velocityTracker = this.f4031H;
            velocityTracker.computeCurrentVelocity(1000, this.J);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f4030G);
            this.f4063v = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            e i4 = i();
            float f5 = clientWidth;
            int i5 = i4.f519b;
            float f6 = ((scrollX / f5) - i4.f522e) / (i4.f521d + (this.f4055m / f5));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f4030G)) - this.f4028E)) <= this.f4033K || Math.abs(xVelocity) <= this.f4032I) {
                i5 += (int) (f6 + (i5 >= this.f4050f ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i5++;
            }
            ArrayList arrayList = this.f4046b;
            if (arrayList.size() > 0) {
                i5 = Math.max(((e) arrayList.get(0)).f519b, Math.min(i5, ((e) arrayList.get(arrayList.size() - 1)).f519b));
            }
            u(i5, xVelocity, true, true);
            z3 = s();
        }
        if (z3) {
            WeakHashMap weakHashMap = X.f1226a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final void p() {
        q(this.f4050f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r10 == r11) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r18) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.q(int):void");
    }

    public final void r(int i, int i4, int i5, int i6) {
        if (i4 > 0 && !this.f4046b.isEmpty()) {
            if (!this.f4052j.isFinished()) {
                this.f4052j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i4 - getPaddingLeft()) - getPaddingRight()) + i6)) * (((i - getPaddingLeft()) - getPaddingRight()) + i5)), getScrollY());
                return;
            }
        }
        e j4 = j(this.f4050f);
        int min = (int) ((j4 != null ? Math.min(j4.f522e, this.f4059r) : BitmapDescriptorFactory.HUE_RED) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            d(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f4061t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.f4030G = -1;
        this.f4065x = false;
        this.f4066y = false;
        VelocityTracker velocityTracker = this.f4031H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4031H = null;
        }
        this.f4035M.onRelease();
        this.f4036N.onRelease();
        return this.f4035M.isFinished() || this.f4036N.isFinished();
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList;
        a aVar2 = this.f4049e;
        if (aVar2 != null) {
            aVar2.setViewPagerObserver(null);
            this.f4049e.startUpdate((ViewGroup) this);
            int i = 0;
            while (true) {
                arrayList = this.f4046b;
                if (i >= arrayList.size()) {
                    break;
                }
                e eVar = (e) arrayList.get(i);
                this.f4049e.destroyItem((ViewGroup) this, eVar.f519b, eVar.f518a);
                i++;
            }
            this.f4049e.finishUpdate((ViewGroup) this);
            arrayList.clear();
            int i4 = 0;
            while (i4 < getChildCount()) {
                if (!((f) getChildAt(i4).getLayoutParams()).f523a) {
                    removeViewAt(i4);
                    i4--;
                }
                i4++;
            }
            this.f4050f = 0;
            scrollTo(0, 0);
        }
        this.f4049e = aVar;
        this.f4045a = 0;
        if (aVar != null) {
            if (this.f4054l == null) {
                this.f4054l = new F0.i(this, 0);
            }
            this.f4049e.setViewPagerObserver(this.f4054l);
            this.f4063v = false;
            boolean z3 = this.f4037O;
            this.f4037O = true;
            this.f4045a = this.f4049e.getCount();
            if (this.f4051g >= 0) {
                this.f4049e.restoreState(this.h, this.i);
                u(this.f4051g, 0, false, true);
                this.f4051g = -1;
                this.h = null;
                this.i = null;
            } else if (z3) {
                requestLayout();
            } else {
                p();
            }
        }
        ArrayList arrayList2 = this.f4042T;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f4042T.size();
        for (int i5 = 0; i5 < size; i5++) {
            H2.c cVar = (H2.c) this.f4042T.get(i5);
            TabLayout tabLayout = cVar.f697b;
            if (tabLayout.f5776N == this) {
                tabLayout.l(aVar, cVar.f696a);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f4063v = false;
        u(i, 0, !this.f4037O, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f4064w) {
            this.f4064w = i;
            p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.f4041S = hVar;
    }

    public void setPageMargin(int i) {
        int i4 = this.f4055m;
        this.f4055m = i;
        int width = getWidth();
        r(width, width, i, i4);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f4056n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f4044V == i) {
            return;
        }
        this.f4044V = i;
        h hVar = this.f4041S;
        if (hVar != null) {
            hVar.a(i);
        }
        ArrayList arrayList = this.f4040R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                h hVar2 = (h) this.f4040R.get(i4);
                if (hVar2 != null) {
                    hVar2.a(i);
                }
            }
        }
    }

    public final void t(int i, int i4, boolean z3, boolean z4) {
        int scrollX;
        Scroller scroller = this.f4052j;
        e j4 = j(i);
        int max = j4 != null ? (int) (Math.max(this.f4058q, Math.min(j4.f522e, this.f4059r)) * getClientWidth()) : 0;
        if (!z3) {
            if (z4) {
                f(i);
            }
            d(false);
            scrollTo(max, 0);
            n(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f4053k ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i5 = scrollX;
            int scrollY = getScrollY();
            int i6 = max - i5;
            int i7 = 0 - scrollY;
            if (i6 == 0 && i7 == 0) {
                d(false);
                p();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i8 = clientWidth / 2;
                float f2 = clientWidth;
                float f4 = i8;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f4) + f4;
                int abs = Math.abs(i4);
                int min = Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / ((this.f4049e.getPageWidth(this.f4050f) * f2) + this.f4055m)) + 1.0f) * 100.0f), 600);
                this.f4053k = false;
                this.f4052j.startScroll(i5, scrollY, i6, i7, min);
                WeakHashMap weakHashMap = X.f1226a;
                postInvalidateOnAnimation();
            }
        }
        if (z4) {
            f(i);
        }
    }

    public final void u(int i, int i4, boolean z3, boolean z4) {
        a aVar = this.f4049e;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f4046b;
        if (!z4 && this.f4050f == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f4049e.getCount()) {
            i = this.f4049e.getCount() - 1;
        }
        int i5 = this.f4064w;
        int i6 = this.f4050f;
        if (i > i6 + i5 || i < i6 - i5) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((e) arrayList.get(i7)).f520c = true;
            }
        }
        boolean z5 = this.f4050f != i;
        if (!this.f4037O) {
            q(i);
            t(i, i4, z3, z5);
        } else {
            this.f4050f = i;
            if (z5) {
                f(i);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4056n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [F0.f, android.view.ViewGroup$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.f525c = BitmapDescriptorFactory.HUE_RED;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4021W);
        layoutParams.f524b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(D.h.getDrawable(getContext(), i));
    }
}
