package androidx.core.widget;

import A.a;
import O.C0066g;
import O.C0079u;
import O.InterfaceC0078t;
import O.L;
import O.X;
import O.r;
import U.e;
import U.h;
import U.i;
import U.j;
import U.k;
import a.AbstractC0105a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0078t {

    /* renamed from: C, reason: collision with root package name */
    public static final float f2792C = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: D, reason: collision with root package name */
    public static final h f2793D = new h(0);

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f2794E = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public j f2795A;

    /* renamed from: B, reason: collision with root package name */
    public final C0066g f2796B;

    /* renamed from: a, reason: collision with root package name */
    public final float f2797a;

    /* renamed from: b, reason: collision with root package name */
    public long f2798b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f2799c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f2800d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f2801e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f2802f;

    /* renamed from: g, reason: collision with root package name */
    public int f2803g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public View f2804j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2805k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f2806l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2807m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2808n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2809o;
    public final int p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2810q;

    /* renamed from: r, reason: collision with root package name */
    public int f2811r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f2812s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f2813t;

    /* renamed from: u, reason: collision with root package name */
    public int f2814u;

    /* renamed from: v, reason: collision with root package name */
    public int f2815v;

    /* renamed from: w, reason: collision with root package name */
    public k f2816w;

    /* renamed from: x, reason: collision with root package name */
    public final C0079u f2817x;

    /* renamed from: y, reason: collision with root package name */
    public final r f2818y;

    /* renamed from: z, reason: collision with root package name */
    public float f2819z;

    /* JADX WARN: Type inference failed for: r7v2, types: [O.u, java.lang.Object] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.adif.elcanomovil.R.attr.nestedScrollViewStyle);
        this.f2799c = new Rect();
        this.h = true;
        this.i = false;
        this.f2804j = null;
        this.f2805k = false;
        this.f2808n = true;
        this.f2811r = -1;
        this.f2812s = new int[2];
        this.f2813t = new int[2];
        this.f2796B = new C0066g(getContext(), new a(this, 20));
        int i = Build.VERSION.SDK_INT;
        this.f2801e = i >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f2802f = i >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f2797a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2800d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2809o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2810q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2794E, com.adif.elcanomovil.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2817x = new Object();
        this.f2818y = new r(this);
        setNestedScrollingEnabled(true);
        X.j(this, f2793D);
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    @Override // O.InterfaceC0077s
    public final void a(View view, View view2, int i, int i4) {
        C0079u c0079u = this.f2817x;
        if (i4 == 1) {
            c0079u.f1299b = i;
        } else {
            c0079u.f1298a = i;
        }
        w(2, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // O.InterfaceC0077s
    public final void b(View view, int i) {
        C0079u c0079u = this.f2817x;
        if (i == 1) {
            c0079u.f1299b = 0;
        } else {
            c0079u.f1298a = 0;
        }
        y(i);
    }

    @Override // O.InterfaceC0077s
    public final void c(View view, int i, int i4, int[] iArr, int i5) {
        i(iArr, null, i, i4, i5);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    @Override // O.InterfaceC0078t
    public final void d(View view, int i, int i4, int i5, int i6, int i7, int[] iArr) {
        o(iArr, i6, i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f4, boolean z3) {
        return this.f2818y.a(f2, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f4) {
        return this.f2818y.b(f2, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i4, int[] iArr, int[] iArr2) {
        return this.f2818y.c(iArr, iArr2, i, i4, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i4, int i5, int i6, int[] iArr) {
        return this.f2818y.d(i, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f2801e;
        int i4 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f2802f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (i.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i4 = getPaddingLeft();
        }
        if (i.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i4 - width2, max);
        canvas.rotate(180.0f, width2, BitmapDescriptorFactory.HUE_RED);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // O.InterfaceC0077s
    public final void e(View view, int i, int i4, int i5, int i6, int i7) {
        o(null, i6, i7);
    }

    @Override // O.InterfaceC0077s
    public final boolean f(View view, View view2, int i, int i4) {
        return (i & 2) != 0;
    }

    public final boolean g(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !n(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f2799c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            t(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && !n(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0079u c0079u = this.f2817x;
        return c0079u.f1299b | c0079u.f1298a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f2819z == BitmapDescriptorFactory.HUE_RED) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2819z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2819z;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f2818y.f(0);
    }

    public final boolean i(int[] iArr, int[] iArr2, int i, int i4, int i5) {
        return this.f2818y.c(iArr, null, i, i4, i5);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f2818y.f1290d;
    }

    public final boolean j(KeyEvent keyEvent) {
        this.f2799c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? l(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? l(130) : g(130);
                    }
                    if (keyCode == 62) {
                        r(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return l(33);
                    }
                    if (keyCode == 93) {
                        return l(130);
                    }
                    if (keyCode == 122) {
                        r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        r(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final void k(int i) {
        if (getChildCount() > 0) {
            this.f2800d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, IntCompanionObject.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            w(2, 1);
            this.f2815v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean l(int i) {
        int childCount;
        boolean z3 = i == 130;
        int height = getHeight();
        Rect rect = this.f2799c;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i, int i4) {
        Rect rect = this.f2799c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i4;
    }

    public final void o(int[] iArr, int i, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2818y.d(0, scrollY2, 0, i - scrollY2, null, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0123, code lost:
    
        if (r2 >= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00d3, code lost:
    
        if (r2 >= 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ba  */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v41 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r28) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f2805k) {
            return true;
        }
        int i = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i4 = this.f2811r;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.f2803g) > this.f2809o && (2 & getNestedScrollAxes()) == 0) {
                                this.f2805k = true;
                                this.f2803g = y3;
                                if (this.f2806l == null) {
                                    this.f2806l = VelocityTracker.obtain();
                                }
                                this.f2806l.addMovement(motionEvent);
                                this.f2814u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        p(motionEvent);
                    }
                }
            }
            this.f2805k = false;
            this.f2811r = -1;
            VelocityTracker velocityTracker = this.f2806l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2806l = null;
            }
            if (this.f2800d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else {
            int y4 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y4 >= childAt.getTop() - scrollY && y4 < childAt.getBottom() - scrollY && x3 >= childAt.getLeft() && x3 < childAt.getRight()) {
                    this.f2803g = y4;
                    this.f2811r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f2806l;
                    if (velocityTracker2 == null) {
                        this.f2806l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f2806l.addMovement(motionEvent);
                    this.f2800d.computeScrollOffset();
                    if (!x(motionEvent) && this.f2800d.isFinished()) {
                        z3 = false;
                    }
                    this.f2805k = z3;
                    w(2, 0);
                }
            }
            if (!x(motionEvent) && this.f2800d.isFinished()) {
                z3 = false;
            }
            this.f2805k = z3;
            VelocityTracker velocityTracker3 = this.f2806l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f2806l = null;
            }
        }
        return this.f2805k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z3, i, i4, i5, i6);
        int i8 = 0;
        this.h = false;
        View view = this.f2804j;
        if (view != null && m(view, this)) {
            View view2 = this.f2804j;
            Rect rect = this.f2799c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.f2804j = null;
        if (!this.i) {
            if (this.f2816w != null) {
                scrollTo(getScrollX(), this.f2816w.f1756a);
                this.f2816w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i7 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i7 = 0;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i7 && scrollY >= 0) {
                i8 = paddingTop + scrollY > i7 ? i7 - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.f2807m && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f4, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(BitmapDescriptorFactory.HUE_RED, f4, true);
        k((int) f4);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f4) {
        return this.f2818y.b(f2, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
        i(iArr, null, i, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i5, int i6) {
        o(null, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i4, boolean z3, boolean z4) {
        super.scrollTo(i, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && n(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        this.f2816w = kVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, U.k, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f1756a = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i4, int i5, int i6) {
        super.onScrollChanged(i, i4, i5, i6);
        j jVar = this.f2795A;
        if (jVar != null) {
            CirculationsFragment.f((CirculationsFragment) ((I2.k) jVar).f823b, this, i, i4, i5, i6);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i5, int i6) {
        super.onSizeChanged(i, i4, i5, i6);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !n(findFocus, 0, i6)) {
            return;
        }
        Rect rect = this.f2799c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h = h(rect);
        if (h != 0) {
            if (this.f2808n) {
                v(0, h, false);
            } else {
                scrollBy(0, h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f2806l == null) {
            this.f2806l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2814u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f2 = this.f2814u;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        obtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, f2);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f2802f;
            EdgeEffect edgeEffect2 = this.f2801e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2806l;
                velocityTracker.computeCurrentVelocity(1000, this.f2810q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2811r);
                if (Math.abs(yVelocity) >= this.p) {
                    if (AbstractC0105a.y(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                        if (u(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (AbstractC0105a.y(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
                        int i = -yVelocity;
                        if (u(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            k(i);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f5 = i4;
                        if (!this.f2818y.b(BitmapDescriptorFactory.HUE_RED, f5)) {
                            dispatchNestedFling(BitmapDescriptorFactory.HUE_RED, f5, true);
                            k(i4);
                        }
                    }
                } else if (this.f2800d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2811r = -1;
                this.f2805k = false;
                VelocityTracker velocityTracker2 = this.f2806l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f2806l = null;
                }
                y(0);
                this.f2801e.onRelease();
                this.f2802f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2811r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f2811r + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(findPointerIndex);
                    int i5 = this.f2803g - y3;
                    float x3 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (AbstractC0105a.y(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                        float f6 = -AbstractC0105a.J(edgeEffect2, -height, x3);
                        if (AbstractC0105a.y(edgeEffect2) == BitmapDescriptorFactory.HUE_RED) {
                            edgeEffect2.onRelease();
                        }
                        f4 = f6;
                    } else if (AbstractC0105a.y(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
                        float J = AbstractC0105a.J(edgeEffect, height, 1.0f - x3);
                        if (AbstractC0105a.y(edgeEffect) == BitmapDescriptorFactory.HUE_RED) {
                            edgeEffect.onRelease();
                        }
                        f4 = J;
                    }
                    int round = Math.round(f4 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i6 = i5 - round;
                    if (!this.f2805k && Math.abs(i6) > this.f2809o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2805k = true;
                        i6 = i6 > 0 ? i6 - this.f2809o : i6 + this.f2809o;
                    }
                    if (this.f2805k) {
                        int t2 = t(i6, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f2803g = y3 - t2;
                        this.f2814u += t2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2805k && getChildCount() > 0 && this.f2800d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2811r = -1;
                this.f2805k = false;
                VelocityTracker velocityTracker3 = this.f2806l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f2806l = null;
                }
                y(0);
                this.f2801e.onRelease();
                this.f2802f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2803g = (int) motionEvent.getY(actionIndex);
                this.f2811r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.f2803g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2811r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f2805k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2800d.isFinished()) {
                this.f2800d.abortAnimation();
                y(1);
            }
            int y4 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f2803g = y4;
            this.f2811r = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f2806l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2811r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2803g = (int) motionEvent.getY(i);
            this.f2811r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2806l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i, int i4, int i5, int i6) {
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i9 = i5 + i;
        if (i4 <= 0 && i4 >= 0) {
            i7 = i4;
            z3 = false;
        } else {
            i7 = 0;
            z3 = true;
        }
        if (i9 > i6) {
            i8 = i6;
        } else {
            if (i9 >= 0) {
                i8 = i9;
                z4 = false;
                if (z4 && !this.f2818y.f(1)) {
                    this.f2800d.springBack(i7, i8, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i7, i8);
                return !z3 || z4;
            }
            i8 = 0;
        }
        z4 = true;
        if (z4) {
            this.f2800d.springBack(i7, i8, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i7, i8);
        if (z3) {
        }
    }

    public final void r(int i) {
        boolean z3 = i == 130;
        int height = getHeight();
        Rect rect = this.f2799c;
        if (z3) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i4 = rect.top;
        int i5 = height + i4;
        rect.bottom = i5;
        s(i, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.h) {
            this.f2804j = view2;
        } else {
            Rect rect = this.f2799c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h = h(rect);
        boolean z4 = h != 0;
        if (z4) {
            if (z3) {
                scrollBy(0, h);
                return z4;
            }
            v(0, h, false);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f2806l) != null) {
            velocityTracker.recycle();
            this.f2806l = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public final boolean s(int i, int i4, int i5) {
        boolean z3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z4 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                boolean z6 = i4 < top && bottom < i5;
                if (view == null) {
                    view = view2;
                    z5 = z6;
                } else {
                    boolean z7 = (z4 && top < view.getTop()) || (!z4 && bottom > view.getBottom());
                    if (z5) {
                        if (z6) {
                            if (!z7) {
                            }
                            view = view2;
                        }
                    } else if (z6) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z7) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i4 < scrollY || i5 > i6) {
            t(z4 ? i4 - scrollY : i5 - i6, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z3;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i4 < 0) {
                i4 = 0;
            } else if (height + i4 > height2) {
                i4 = height2 - height;
            }
            if (i == getScrollX() && i4 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i4);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f2807m) {
            this.f2807m = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        r rVar = this.f2818y;
        if (rVar.f1290d) {
            WeakHashMap weakHashMap = X.f1226a;
            L.z(rVar.f1289c);
        }
        rVar.f1290d = z3;
    }

    public void setOnScrollChangeListener(j jVar) {
        this.f2795A = jVar;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f2808n = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f2818y.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    public final int t(int i, int i4, int i5, boolean z3) {
        int i6;
        int i7;
        boolean z4;
        VelocityTracker velocityTracker;
        if (i5 == 1) {
            w(2, i5);
        }
        boolean c4 = this.f2818y.c(this.f2813t, this.f2812s, 0, i, i5);
        int[] iArr = this.f2813t;
        int[] iArr2 = this.f2812s;
        if (c4) {
            i6 = i - iArr[1];
            i7 = iArr2[1];
        } else {
            i6 = i;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z5 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3;
        boolean z6 = q(i6, 0, scrollY, scrollRange) && !this.f2818y.f(i5);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f2818y.d(0, scrollY2, 0, i6 - scrollY2, this.f2812s, i5, iArr);
        int i8 = i7 + iArr2[1];
        int i9 = i6 - iArr[1];
        int i10 = scrollY + i9;
        EdgeEffect edgeEffect = this.f2802f;
        EdgeEffect edgeEffect2 = this.f2801e;
        if (i10 < 0) {
            if (z5) {
                AbstractC0105a.J(edgeEffect2, (-i9) / getHeight(), i4 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i10 > scrollRange && z5) {
            AbstractC0105a.J(edgeEffect, i9 / getHeight(), 1.0f - (i4 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z4 = z6;
        } else {
            postInvalidateOnAnimation();
            z4 = false;
        }
        if (z4 && i5 == 0 && (velocityTracker = this.f2806l) != null) {
            velocityTracker.clear();
        }
        if (i5 == 1) {
            y(i5);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i8;
    }

    public final boolean u(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float y3 = AbstractC0105a.y(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f2797a * 0.015f;
        double log = Math.log(abs / f2);
        double d4 = f2792C;
        return ((float) (Math.exp((d4 / (d4 - 1.0d)) * log) * ((double) f2))) < y3;
    }

    public final void v(int i, int i4, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2798b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2800d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z3) {
                w(2, 1);
            } else {
                y(1);
            }
            this.f2815v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f2800d.isFinished()) {
                this.f2800d.abortAnimation();
                y(1);
            }
            scrollBy(i, i4);
        }
        this.f2798b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void w(int i, int i4) {
        this.f2818y.g(2, i4);
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f2801e;
        if (AbstractC0105a.y(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
            AbstractC0105a.J(edgeEffect, BitmapDescriptorFactory.HUE_RED, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f2802f;
        if (AbstractC0105a.y(edgeEffect2) == BitmapDescriptorFactory.HUE_RED) {
            return z3;
        }
        AbstractC0105a.J(edgeEffect2, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i) {
        this.f2818y.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
