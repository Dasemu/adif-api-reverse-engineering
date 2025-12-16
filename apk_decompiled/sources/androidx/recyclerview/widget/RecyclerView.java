package androidx.recyclerview.widget;

import O.C0079u;
import a.AbstractC0105a;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import t0.AbstractC0615a;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static boolean A0 = false;

    /* renamed from: B0 */
    public static boolean f3642B0 = false;

    /* renamed from: C0 */
    public static final int[] f3643C0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: D0 */
    public static final float f3644D0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean E0 = true;

    /* renamed from: F0 */
    public static final boolean f3645F0 = true;

    /* renamed from: G0 */
    public static final boolean f3646G0 = true;

    /* renamed from: H0 */
    public static final Class[] f3647H0;

    /* renamed from: I0 */
    public static final J f3648I0;

    /* renamed from: J0 */
    public static final F0 f3649J0;

    /* renamed from: A */
    public boolean f3650A;

    /* renamed from: B */
    public final AccessibilityManager f3651B;

    /* renamed from: C */
    public ArrayList f3652C;

    /* renamed from: D */
    public boolean f3653D;

    /* renamed from: E */
    public boolean f3654E;

    /* renamed from: F */
    public int f3655F;

    /* renamed from: G */
    public int f3656G;

    /* renamed from: H */
    public AbstractC0228l0 f3657H;

    /* renamed from: I */
    public EdgeEffect f3658I;
    public EdgeEffect J;

    /* renamed from: K */
    public EdgeEffect f3659K;

    /* renamed from: L */
    public EdgeEffect f3660L;

    /* renamed from: M */
    public AbstractC0230m0 f3661M;

    /* renamed from: N */
    public int f3662N;

    /* renamed from: O */
    public int f3663O;

    /* renamed from: P */
    public VelocityTracker f3664P;

    /* renamed from: Q */
    public int f3665Q;

    /* renamed from: R */
    public int f3666R;

    /* renamed from: S */
    public int f3667S;

    /* renamed from: T */
    public int f3668T;

    /* renamed from: U */
    public int f3669U;

    /* renamed from: V */
    public t0 f3670V;

    /* renamed from: W */
    public final int f3671W;

    /* renamed from: a */
    public final float f3672a;

    /* renamed from: a0 */
    public final int f3673a0;

    /* renamed from: b */
    public final H2.m f3674b;

    /* renamed from: b0 */
    public final float f3675b0;

    /* renamed from: c */
    public final y0 f3676c;

    /* renamed from: c0 */
    public final float f3677c0;

    /* renamed from: d */
    public B0 f3678d;

    /* renamed from: d0 */
    public boolean f3679d0;

    /* renamed from: e */
    public final C0207b f3680e;

    /* renamed from: e0 */
    public final H0 f3681e0;

    /* renamed from: f */
    public final C0223j f3682f;

    /* renamed from: f0 */
    public E f3683f0;

    /* renamed from: g */
    public final F.i f3684g;

    /* renamed from: g0 */
    public final Z2.y f3685g0;
    public boolean h;

    /* renamed from: h0 */
    public final E0 f3686h0;
    public final RunnableC0214e0 i;

    /* renamed from: i0 */
    public v0 f3687i0;

    /* renamed from: j */
    public final Rect f3688j;

    /* renamed from: j0 */
    public ArrayList f3689j0;

    /* renamed from: k */
    public final Rect f3690k;

    /* renamed from: k0 */
    public boolean f3691k0;

    /* renamed from: l */
    public final RectF f3692l;

    /* renamed from: l0 */
    public boolean f3693l0;

    /* renamed from: m */
    public AbstractC0220h0 f3694m;

    /* renamed from: m0 */
    public final C0216f0 f3695m0;

    /* renamed from: n */
    public AbstractC0238q0 f3696n;

    /* renamed from: n0 */
    public boolean f3697n0;

    /* renamed from: o */
    public final ArrayList f3698o;

    /* renamed from: o0 */
    public K0 f3699o0;
    public final ArrayList p;

    /* renamed from: p0 */
    public final int[] f3700p0;

    /* renamed from: q */
    public final ArrayList f3701q;

    /* renamed from: q0 */
    public O.r f3702q0;

    /* renamed from: r */
    public u0 f3703r;

    /* renamed from: r0 */
    public final int[] f3704r0;

    /* renamed from: s */
    public boolean f3705s;

    /* renamed from: s0 */
    public final int[] f3706s0;

    /* renamed from: t */
    public boolean f3707t;

    /* renamed from: t0 */
    public final int[] f3708t0;

    /* renamed from: u */
    public boolean f3709u;

    /* renamed from: u0 */
    public final ArrayList f3710u0;

    /* renamed from: v */
    public int f3711v;

    /* renamed from: v0 */
    public final RunnableC0214e0 f3712v0;

    /* renamed from: w */
    public boolean f3713w;

    /* renamed from: w0 */
    public boolean f3714w0;

    /* renamed from: x */
    public boolean f3715x;

    /* renamed from: x0 */
    public int f3716x0;

    /* renamed from: y */
    public boolean f3717y;

    /* renamed from: y0 */
    public int f3718y0;

    /* renamed from: z */
    public int f3719z;

    /* renamed from: z0 */
    public final C0216f0 f3720z0;

    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.recyclerview.widget.F0, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        f3647H0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f3648I0 = new J(2);
        f3649J0 = new Object();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.adif.elcanomovil.R.attr.recyclerViewStyle);
    }

    public static RecyclerView I(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView I3 = I(viewGroup.getChildAt(i));
            if (I3 != null) {
                return I3;
            }
        }
        return null;
    }

    public static I0 N(View view) {
        if (view == null) {
            return null;
        }
        return ((C0239r0) view.getLayoutParams()).f3897a;
    }

    public static void O(Rect rect, View view) {
        C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
        Rect rect2 = c0239r0.f3898b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0239r0).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0239r0).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0239r0).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0239r0).bottomMargin);
    }

    private O.r getScrollingChildHelper() {
        if (this.f3702q0 == null) {
            this.f3702q0 = new O.r(this);
        }
        return this.f3702q0;
    }

    public static void m(I0 i02) {
        WeakReference<RecyclerView> weakReference = i02.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == i02.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            i02.mNestedRecyclerView = null;
        }
    }

    public static int p(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i4) {
        if (i > 0 && edgeEffect != null && AbstractC0105a.y(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
            int round = Math.round(AbstractC0105a.J(edgeEffect, ((-i) * 4.0f) / i4, 0.5f) * ((-i4) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC0105a.y(edgeEffect2) == BitmapDescriptorFactory.HUE_RED) {
            return i;
        }
        float f2 = i4;
        int round2 = Math.round(AbstractC0105a.J(edgeEffect2, (i * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public static void setDebugAssertionsEnabled(boolean z3) {
        A0 = z3;
    }

    public static void setVerboseLoggingEnabled(boolean z3) {
        f3642B0 = z3;
    }

    public final void A() {
        if (this.f3658I != null) {
            return;
        }
        ((F0) this.f3657H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3658I = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.f3659K != null) {
            return;
        }
        ((F0) this.f3657H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3659K = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void C() {
        if (this.J != null) {
            return;
        }
        ((F0) this.f3657H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String D() {
        return " " + super.toString() + ", adapter:" + this.f3694m + ", layout:" + this.f3696n + ", context:" + getContext();
    }

    public final void E(E0 e02) {
        if (getScrollState() != 2) {
            e02.getClass();
            return;
        }
        OverScroller overScroller = this.f3681e0.f3546c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        e02.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View F(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.F(android.view.View):android.view.View");
    }

    public final boolean G(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f3701q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            u0 u0Var = (u0) arrayList.get(i);
            if (u0Var.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.f3703r = u0Var;
                return true;
            }
        }
        return false;
    }

    public final void H(int[] iArr) {
        int e4 = this.f3682f.e();
        if (e4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i4 = IntCompanionObject.MIN_VALUE;
        for (int i5 = 0; i5 < e4; i5++) {
            I0 N3 = N(this.f3682f.d(i5));
            if (!N3.shouldIgnore()) {
                int layoutPosition = N3.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i4) {
                    i4 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i4;
    }

    public final I0 J(int i) {
        I0 i02 = null;
        if (this.f3653D) {
            return null;
        }
        int h = this.f3682f.h();
        for (int i4 = 0; i4 < h; i4++) {
            I0 N3 = N(this.f3682f.g(i4));
            if (N3 != null && !N3.isRemoved() && K(N3) == i) {
                C0223j c0223j = this.f3682f;
                if (!c0223j.f3828c.contains(N3.itemView)) {
                    return N3;
                }
                i02 = N3;
            }
        }
        return i02;
    }

    public final int K(I0 i02) {
        if (i02.hasAnyOfTheFlags(524) || !i02.isBound()) {
            return -1;
        }
        C0207b c0207b = this.f3680e;
        int i = i02.mPosition;
        ArrayList arrayList = (ArrayList) c0207b.f3789c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0205a c0205a = (C0205a) arrayList.get(i4);
            int i5 = c0205a.f3782a;
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = c0205a.f3783b;
                    if (i6 <= i) {
                        int i7 = c0205a.f3785d;
                        if (i6 + i7 > i) {
                            return -1;
                        }
                        i -= i7;
                    } else {
                        continue;
                    }
                } else if (i5 == 8) {
                    int i8 = c0205a.f3783b;
                    if (i8 == i) {
                        i = c0205a.f3785d;
                    } else {
                        if (i8 < i) {
                            i--;
                        }
                        if (c0205a.f3785d <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0205a.f3783b <= i) {
                i += c0205a.f3785d;
            }
        }
        return i;
    }

    public final long L(I0 i02) {
        return this.f3694m.hasStableIds() ? i02.getItemId() : i02.mPosition;
    }

    public final I0 M(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return N(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect P(View view) {
        C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
        boolean z3 = c0239r0.f3899c;
        Rect rect = c0239r0.f3898b;
        if (z3) {
            E0 e02 = this.f3686h0;
            if (!e02.f3515g || (!c0239r0.f3897a.isUpdated() && !c0239r0.f3897a.isInvalid())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.p;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.f3688j;
                    rect2.set(0, 0, 0, 0);
                    ((AbstractC0232n0) arrayList.get(i)).getItemOffsets(rect2, view, this, e02);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                c0239r0.f3899c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean Q() {
        return !this.f3709u || this.f3653D || this.f3680e.j();
    }

    public final boolean R() {
        return this.f3655F > 0;
    }

    public final void S(int i) {
        if (this.f3696n == null) {
            return;
        }
        setScrollState(2);
        this.f3696n.v0(i);
        awakenScrollBars();
    }

    public final void T() {
        int h = this.f3682f.h();
        for (int i = 0; i < h; i++) {
            ((C0239r0) this.f3682f.g(i).getLayoutParams()).f3899c = true;
        }
        ArrayList arrayList = this.f3676c.f3938c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0239r0 c0239r0 = (C0239r0) ((I0) arrayList.get(i4)).itemView.getLayoutParams();
            if (c0239r0 != null) {
                c0239r0.f3899c = true;
            }
        }
    }

    public final void U(int i, int i4, boolean z3) {
        int i5 = i + i4;
        int h = this.f3682f.h();
        for (int i6 = 0; i6 < h; i6++) {
            I0 N3 = N(this.f3682f.g(i6));
            if (N3 != null && !N3.shouldIgnore()) {
                int i7 = N3.mPosition;
                E0 e02 = this.f3686h0;
                if (i7 >= i5) {
                    if (f3642B0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i6 + " holder " + N3 + " now at position " + (N3.mPosition - i4));
                    }
                    N3.offsetPosition(-i4, z3);
                    e02.f3514f = true;
                } else if (i7 >= i) {
                    if (f3642B0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i6 + " holder " + N3 + " now REMOVED");
                    }
                    N3.flagRemovedAndOffsetPosition(i - 1, -i4, z3);
                    e02.f3514f = true;
                }
            }
        }
        y0 y0Var = this.f3676c;
        ArrayList arrayList = y0Var.f3938c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            I0 i02 = (I0) arrayList.get(size);
            if (i02 != null) {
                int i8 = i02.mPosition;
                if (i8 >= i5) {
                    if (f3642B0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + i02 + " now at position " + (i02.mPosition - i4));
                    }
                    i02.offsetPosition(-i4, z3);
                } else if (i8 >= i) {
                    i02.addFlags(8);
                    y0Var.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void V() {
        this.f3655F++;
    }

    public final void W(boolean z3) {
        int i;
        AccessibilityManager accessibilityManager;
        int i4 = this.f3655F - 1;
        this.f3655F = i4;
        if (i4 < 1) {
            if (A0 && i4 < 0) {
                throw new IllegalStateException(C.w.j(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f3655F = 0;
            if (z3) {
                int i5 = this.f3719z;
                this.f3719z = 0;
                if (i5 != 0 && (accessibilityManager = this.f3651B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i5);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f3710u0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    I0 i02 = (I0) arrayList.get(size);
                    if (i02.itemView.getParent() == this && !i02.shouldIgnore() && (i = i02.mPendingAccessibilityState) != -1) {
                        View view = i02.itemView;
                        WeakHashMap weakHashMap = O.X.f1226a;
                        view.setImportantForAccessibility(i);
                        i02.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3663O) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3663O = motionEvent.getPointerId(i);
            int x3 = (int) (motionEvent.getX(i) + 0.5f);
            this.f3667S = x3;
            this.f3665Q = x3;
            int y3 = (int) (motionEvent.getY(i) + 0.5f);
            this.f3668T = y3;
            this.f3666R = y3;
        }
    }

    public final void Y() {
        if (this.f3697n0 || !this.f3705s) {
            return;
        }
        WeakHashMap weakHashMap = O.X.f1226a;
        postOnAnimation(this.f3712v0);
        this.f3697n0 = true;
    }

    public final void Z() {
        boolean z3;
        boolean z4 = false;
        if (this.f3653D) {
            C0207b c0207b = this.f3680e;
            c0207b.q((ArrayList) c0207b.f3789c);
            c0207b.q((ArrayList) c0207b.f3790d);
            c0207b.f3787a = 0;
            if (this.f3654E) {
                this.f3696n.d0();
            }
        }
        if (this.f3661M == null || !this.f3696n.H0()) {
            this.f3680e.d();
        } else {
            this.f3680e.p();
        }
        boolean z5 = this.f3691k0 || this.f3693l0;
        boolean z6 = this.f3709u && this.f3661M != null && ((z3 = this.f3653D) || z5 || this.f3696n.f3888f) && (!z3 || this.f3694m.hasStableIds());
        E0 e02 = this.f3686h0;
        e02.f3516j = z6;
        if (z6 && z5 && !this.f3653D && this.f3661M != null && this.f3696n.H0()) {
            z4 = true;
        }
        e02.f3517k = z4;
    }

    public final void a0(boolean z3) {
        this.f3654E = z3 | this.f3654E;
        this.f3653D = true;
        int h = this.f3682f.h();
        for (int i = 0; i < h; i++) {
            I0 N3 = N(this.f3682f.g(i));
            if (N3 != null && !N3.shouldIgnore()) {
                N3.addFlags(6);
            }
        }
        T();
        y0 y0Var = this.f3676c;
        ArrayList arrayList = y0Var.f3938c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            I0 i02 = (I0) arrayList.get(i4);
            if (i02 != null) {
                i02.addFlags(6);
                i02.addChangePayload(null);
            }
        }
        AbstractC0220h0 abstractC0220h0 = y0Var.h.f3694m;
        if (abstractC0220h0 == null || !abstractC0220h0.hasStableIds()) {
            y0Var.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i4) {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null) {
            abstractC0238q0.getClass();
        }
        super.addFocusables(arrayList, i, i4);
    }

    public final void b0(I0 i02, C0079u c0079u) {
        i02.setFlags(0, 8192);
        boolean z3 = this.f3686h0.h;
        F.i iVar = this.f3684g;
        if (z3 && i02.isUpdated() && !i02.isRemoved() && !i02.shouldIgnore()) {
            ((s.g) iVar.f491c).e(L(i02), i02);
        }
        s.j jVar = (s.j) iVar.f490b;
        S0 s02 = (S0) jVar.get(i02);
        if (s02 == null) {
            s02 = S0.a();
            jVar.put(i02, s02);
        }
        s02.f3728b = c0079u;
        s02.f3727a |= 4;
    }

    public final int c0(int i, float f2) {
        float height = f2 / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f3658I;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (edgeEffect == null || AbstractC0105a.y(edgeEffect) == BitmapDescriptorFactory.HUE_RED) {
            EdgeEffect edgeEffect2 = this.f3659K;
            if (edgeEffect2 != null && AbstractC0105a.y(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                if (canScrollHorizontally(1)) {
                    this.f3659K.onRelease();
                } else {
                    float J = AbstractC0105a.J(this.f3659K, width, height);
                    if (AbstractC0105a.y(this.f3659K) == BitmapDescriptorFactory.HUE_RED) {
                        this.f3659K.onRelease();
                    }
                    f4 = J;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f3658I.onRelease();
            } else {
                float f5 = -AbstractC0105a.J(this.f3658I, -width, 1.0f - height);
                if (AbstractC0105a.y(this.f3658I) == BitmapDescriptorFactory.HUE_RED) {
                    this.f3658I.onRelease();
                }
                f4 = f5;
            }
            invalidate();
        }
        return Math.round(f4 * getWidth());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0239r0) && this.f3696n.f((C0239r0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null && abstractC0238q0.d()) {
            return this.f3696n.j(this.f3686h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null && abstractC0238q0.d()) {
            return this.f3696n.k(this.f3686h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null && abstractC0238q0.d()) {
            return this.f3696n.l(this.f3686h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null && abstractC0238q0.e()) {
            return this.f3696n.m(this.f3686h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null && abstractC0238q0.e()) {
            return this.f3696n.n(this.f3686h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null && abstractC0238q0.e()) {
            return this.f3696n.o(this.f3686h0);
        }
        return 0;
    }

    public final int d0(int i, float f2) {
        float width = f2 / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.J;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (edgeEffect == null || AbstractC0105a.y(edgeEffect) == BitmapDescriptorFactory.HUE_RED) {
            EdgeEffect edgeEffect2 = this.f3660L;
            if (edgeEffect2 != null && AbstractC0105a.y(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                if (canScrollVertically(1)) {
                    this.f3660L.onRelease();
                } else {
                    float J = AbstractC0105a.J(this.f3660L, height, 1.0f - width);
                    if (AbstractC0105a.y(this.f3660L) == BitmapDescriptorFactory.HUE_RED) {
                        this.f3660L.onRelease();
                    }
                    f4 = J;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.J.onRelease();
            } else {
                float f5 = -AbstractC0105a.J(this.J, -height, width);
                if (AbstractC0105a.y(this.J) == BitmapDescriptorFactory.HUE_RED) {
                    this.J.onRelease();
                }
                f4 = f5;
            }
            invalidate();
        }
        return Math.round(f4 * getHeight());
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f4, boolean z3) {
        return getScrollingChildHelper().a(f2, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f4) {
        return getScrollingChildHelper().b(f2, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(iArr, iArr2, i, i4, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().d(i, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z3;
        super.draw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0232n0) arrayList.get(i)).onDrawOver(canvas, this, this.f3686h0);
        }
        EdgeEffect edgeEffect = this.f3658I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, BitmapDescriptorFactory.HUE_RED);
            EdgeEffect edgeEffect2 = this.f3658I;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3659K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f3659K;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3660L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f3660L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 |= z4;
            canvas.restoreToCount(save4);
        }
        if ((z3 || this.f3661M == null || arrayList.size() <= 0 || !this.f3661M.f()) ? z3 : true) {
            WeakHashMap weakHashMap = O.X.f1226a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public final void e0(AbstractC0232n0 abstractC0232n0) {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null) {
            abstractC0238q0.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        arrayList.remove(abstractC0232n0);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        T();
        requestLayout();
    }

    public final void f0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f3688j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0239r0) {
            C0239r0 c0239r0 = (C0239r0) layoutParams;
            if (!c0239r0.f3899c) {
                int i = rect.left;
                Rect rect2 = c0239r0.f3898b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f3696n.s0(this, view, this.f3688j, !this.f3709u, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017f, code lost:
    
        if (r5 < 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0187, code lost:
    
        if ((r5 * r6) <= 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018f, code lost:
    
        if ((r5 * r6) >= 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (r7 > 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0179, code lost:
    
        if (r5 > 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017c, code lost:
    
        if (r7 < 0) goto L276;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0() {
        VelocityTracker velocityTracker = this.f3664P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z3 = false;
        p0(0);
        EdgeEffect edgeEffect = this.f3658I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.f3658I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3659K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.f3659K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3660L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.f3660L.isFinished();
        }
        if (z3) {
            WeakHashMap weakHashMap = O.X.f1226a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null) {
            return abstractC0238q0.r();
        }
        throw new IllegalStateException(C.w.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null) {
            return abstractC0238q0.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(C.w.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0220h0 getAdapter() {
        return this.f3694m;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 == null) {
            return super.getBaseline();
        }
        abstractC0238q0.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        return super.getChildDrawingOrder(i, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public K0 getCompatAccessibilityDelegate() {
        return this.f3699o0;
    }

    public AbstractC0228l0 getEdgeEffectFactory() {
        return this.f3657H;
    }

    public AbstractC0230m0 getItemAnimator() {
        return this.f3661M;
    }

    public int getItemDecorationCount() {
        return this.p.size();
    }

    public AbstractC0238q0 getLayoutManager() {
        return this.f3696n;
    }

    public int getMaxFlingVelocity() {
        return this.f3673a0;
    }

    public int getMinFlingVelocity() {
        return this.f3671W;
    }

    public long getNanoTime() {
        if (f3646G0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public t0 getOnFlingListener() {
        return this.f3670V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3679d0;
    }

    public x0 getRecycledViewPool() {
        return this.f3676c.c();
    }

    public int getScrollState() {
        return this.f3662N;
    }

    public final void h(I0 i02) {
        View view = i02.itemView;
        boolean z3 = view.getParent() == this;
        this.f3676c.l(M(view));
        if (i02.isTmpDetached()) {
            this.f3682f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z3) {
            this.f3682f.a(view, -1, true);
            return;
        }
        C0223j c0223j = this.f3682f;
        int indexOfChild = c0223j.f3826a.f3809a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0223j.f3827b.i(indexOfChild);
            c0223j.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h0(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.h0(int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(AbstractC0232n0 abstractC0232n0) {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null) {
            abstractC0238q0.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0232n0);
        T();
        requestLayout();
    }

    public final void i0(int[] iArr, int i, int i4) {
        I0 i02;
        n0();
        V();
        Trace.beginSection("RV Scroll");
        E0 e02 = this.f3686h0;
        E(e02);
        y0 y0Var = this.f3676c;
        int u02 = i != 0 ? this.f3696n.u0(i, y0Var, e02) : 0;
        int w02 = i4 != 0 ? this.f3696n.w0(i4, y0Var, e02) : 0;
        Trace.endSection();
        int e4 = this.f3682f.e();
        for (int i5 = 0; i5 < e4; i5++) {
            View d4 = this.f3682f.d(i5);
            I0 M3 = M(d4);
            if (M3 != null && (i02 = M3.mShadowingHolder) != null) {
                View view = i02.itemView;
                int left = d4.getLeft();
                int top = d4.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        W(true);
        o0(false);
        if (iArr != null) {
            iArr[0] = u02;
            iArr[1] = w02;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f3705s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f3715x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f1290d;
    }

    public final void j(u0 u0Var) {
        this.f3701q.add(u0Var);
    }

    public final void j0(int i) {
        X x3;
        if (this.f3715x) {
            return;
        }
        setScrollState(0);
        H0 h02 = this.f3681e0;
        h02.f3550g.removeCallbacks(h02);
        h02.f3546c.abortAnimation();
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null && (x3 = abstractC0238q0.f3887e) != null) {
            x3.i();
        }
        AbstractC0238q0 abstractC0238q02 = this.f3696n;
        if (abstractC0238q02 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0238q02.v0(i);
            awakenScrollBars();
        }
    }

    public final void k(v0 v0Var) {
        if (this.f3689j0 == null) {
            this.f3689j0 = new ArrayList();
        }
        this.f3689j0.add(v0Var);
    }

    public final boolean k0(EdgeEffect edgeEffect, int i, int i4) {
        if (i > 0) {
            return true;
        }
        float y3 = AbstractC0105a.y(edgeEffect) * i4;
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f3672a * 0.015f;
        double log = Math.log(abs / f2);
        double d4 = f3644D0;
        return ((float) (Math.exp((d4 / (d4 - 1.0d)) * log) * ((double) f2))) < y3;
    }

    public final void l(String str) {
        if (R()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(C.w.j(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f3656G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C.w.j(this, new StringBuilder(""))));
        }
    }

    public final void l0(int i, int i4, boolean z3) {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3715x) {
            return;
        }
        if (!abstractC0238q0.d()) {
            i = 0;
        }
        if (!this.f3696n.e()) {
            i4 = 0;
        }
        if (i == 0 && i4 == 0) {
            return;
        }
        if (z3) {
            int i5 = i != 0 ? 1 : 0;
            if (i4 != 0) {
                i5 |= 2;
            }
            getScrollingChildHelper().g(i5, 1);
        }
        this.f3681e0.c(i, i4, IntCompanionObject.MIN_VALUE, null);
    }

    public final void m0(int i) {
        if (this.f3715x) {
            return;
        }
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0238q0.F0(this, i);
        }
    }

    public final void n() {
        int h = this.f3682f.h();
        for (int i = 0; i < h; i++) {
            I0 N3 = N(this.f3682f.g(i));
            if (!N3.shouldIgnore()) {
                N3.clearOldPosition();
            }
        }
        y0 y0Var = this.f3676c;
        ArrayList arrayList = y0Var.f3938c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((I0) arrayList.get(i4)).clearOldPosition();
        }
        ArrayList arrayList2 = y0Var.f3936a;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((I0) arrayList2.get(i5)).clearOldPosition();
        }
        ArrayList arrayList3 = y0Var.f3937b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i6 = 0; i6 < size3; i6++) {
                ((I0) y0Var.f3937b.get(i6)).clearOldPosition();
            }
        }
    }

    public final void n0() {
        int i = this.f3711v + 1;
        this.f3711v = i;
        if (i != 1 || this.f3715x) {
            return;
        }
        this.f3713w = false;
    }

    public final void o(int i, int i4) {
        boolean z3;
        EdgeEffect edgeEffect = this.f3658I;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z3 = false;
        } else {
            this.f3658I.onRelease();
            z3 = this.f3658I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3659K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3659K.onRelease();
            z3 |= this.f3659K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.J.onRelease();
            z3 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3660L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f3660L.onRelease();
            z3 |= this.f3660L.isFinished();
        }
        if (z3) {
            WeakHashMap weakHashMap = O.X.f1226a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0(boolean z3) {
        if (this.f3711v < 1) {
            if (A0) {
                throw new IllegalStateException(C.w.j(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f3711v = 1;
        }
        if (!z3 && !this.f3715x) {
            this.f3713w = false;
        }
        if (this.f3711v == 1) {
            if (z3 && this.f3713w && !this.f3715x && this.f3696n != null && this.f3694m != null) {
                t();
            }
            if (!this.f3715x) {
                this.f3713w = false;
            }
        }
        this.f3711v--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r1 >= 30.0f) goto L55;
     */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.recyclerview.widget.E, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f3655F = r0
            r1 = 1
            r5.f3705s = r1
            boolean r2 = r5.f3709u
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f3709u = r2
            androidx.recyclerview.widget.y0 r2 = r5.f3676c
            r2.d()
            androidx.recyclerview.widget.q0 r2 = r5.f3696n
            if (r2 == 0) goto L26
            r2.f3889g = r1
            r2.V(r5)
        L26:
            r5.f3697n0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f3646G0
            if (r0 == 0) goto L91
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.E.f3503e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.E r1 = (androidx.recyclerview.widget.E) r1
            r5.f3683f0 = r1
            if (r1 != 0) goto L74
            androidx.recyclerview.widget.E r1 = new androidx.recyclerview.widget.E
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3505a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3508d = r2
            r5.f3683f0 = r1
            java.util.WeakHashMap r1 = O.X.f1226a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L66
            if (r1 == 0) goto L66
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L66
            goto L68
        L66:
            r1 = 1114636288(0x42700000, float:60.0)
        L68:
            androidx.recyclerview.widget.E r2 = r5.f3683f0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3507c = r3
            r0.set(r2)
        L74:
            androidx.recyclerview.widget.E r0 = r5.f3683f0
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.A0
            java.util.ArrayList r0 = r0.f3505a
            if (r1 == 0) goto L8e
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L86
            goto L8e
        L86:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "RecyclerView already present in worker list!"
            r5.<init>(r0)
            throw r5
        L8e:
            r0.add(r5)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        y0 y0Var;
        E e4;
        X x3;
        super.onDetachedFromWindow();
        AbstractC0230m0 abstractC0230m0 = this.f3661M;
        if (abstractC0230m0 != null) {
            abstractC0230m0.e();
        }
        int i = 0;
        setScrollState(0);
        H0 h02 = this.f3681e0;
        h02.f3550g.removeCallbacks(h02);
        h02.f3546c.abortAnimation();
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null && (x3 = abstractC0238q0.f3887e) != null) {
            x3.i();
        }
        this.f3705s = false;
        AbstractC0238q0 abstractC0238q02 = this.f3696n;
        if (abstractC0238q02 != null) {
            abstractC0238q02.f3889g = false;
            abstractC0238q02.W(this);
        }
        this.f3710u0.clear();
        removeCallbacks(this.f3712v0);
        this.f3684g.getClass();
        do {
        } while (S0.f3726d.a() != null);
        int i4 = 0;
        while (true) {
            y0Var = this.f3676c;
            ArrayList arrayList = y0Var.f3938c;
            if (i4 >= arrayList.size()) {
                break;
            }
            AbstractC0105a.f(((I0) arrayList.get(i4)).itemView);
            i4++;
        }
        y0Var.e(y0Var.h.f3694m, false);
        Intrinsics.checkNotNullParameter(this, "<this>");
        while (i < getChildCount()) {
            int i5 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            V.a aVar = (V.a) childAt.getTag(com.adif.elcanomovil.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new V.a();
                childAt.setTag(com.adif.elcanomovil.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.f1792a;
            int lastIndex = CollectionsKt.getLastIndex(arrayList2);
            if (-1 < lastIndex) {
                arrayList2.get(lastIndex).getClass();
                throw new ClassCastException();
            }
            i = i5;
        }
        if (!f3646G0 || (e4 = this.f3683f0) == null) {
            return;
        }
        boolean remove = e4.f3505a.remove(this);
        if (A0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f3683f0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0232n0) arrayList.get(i)).onDraw(canvas, this, this.f3686h0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        if (!this.f3715x) {
            this.f3703r = null;
            if (G(motionEvent)) {
                g0();
                setScrollState(0);
                return true;
            }
            AbstractC0238q0 abstractC0238q0 = this.f3696n;
            if (abstractC0238q0 != null) {
                boolean d4 = abstractC0238q0.d();
                boolean e4 = this.f3696n.e();
                if (this.f3664P == null) {
                    this.f3664P = VelocityTracker.obtain();
                }
                this.f3664P.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f3717y) {
                        this.f3717y = false;
                    }
                    this.f3663O = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.f3667S = x3;
                    this.f3665Q = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.f3668T = y3;
                    this.f3666R = y3;
                    EdgeEffect edgeEffect = this.f3658I;
                    if (edgeEffect == null || AbstractC0105a.y(edgeEffect) == BitmapDescriptorFactory.HUE_RED || canScrollHorizontally(-1)) {
                        z3 = false;
                    } else {
                        AbstractC0105a.J(this.f3658I, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getY() / getHeight()));
                        z3 = true;
                    }
                    EdgeEffect edgeEffect2 = this.f3659K;
                    boolean z5 = z3;
                    if (edgeEffect2 != null) {
                        z5 = z3;
                        if (AbstractC0105a.y(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                            z5 = z3;
                            if (!canScrollHorizontally(1)) {
                                AbstractC0105a.J(this.f3659K, BitmapDescriptorFactory.HUE_RED, motionEvent.getY() / getHeight());
                                z5 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.J;
                    boolean z6 = z5;
                    if (edgeEffect3 != null) {
                        z6 = z5;
                        if (AbstractC0105a.y(edgeEffect3) != BitmapDescriptorFactory.HUE_RED) {
                            z6 = z5;
                            if (!canScrollVertically(-1)) {
                                AbstractC0105a.J(this.J, BitmapDescriptorFactory.HUE_RED, motionEvent.getX() / getWidth());
                                z6 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.f3660L;
                    boolean z7 = z6;
                    if (edgeEffect4 != null) {
                        z7 = z6;
                        if (AbstractC0105a.y(edgeEffect4) != BitmapDescriptorFactory.HUE_RED) {
                            z7 = z6;
                            if (!canScrollVertically(1)) {
                                AbstractC0105a.J(this.f3660L, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getX() / getWidth()));
                                z7 = true;
                            }
                        }
                    }
                    if (z7 || this.f3662N == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        p0(1);
                    }
                    int[] iArr = this.f3706s0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = d4;
                    if (e4) {
                        i = (d4 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.f3664P.clear();
                    p0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3663O);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3663O + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f3662N != 1) {
                        int i4 = x4 - this.f3665Q;
                        int i5 = y4 - this.f3666R;
                        if (d4 == 0 || Math.abs(i4) <= this.f3669U) {
                            z4 = false;
                        } else {
                            this.f3667S = x4;
                            z4 = true;
                        }
                        if (e4 && Math.abs(i5) > this.f3669U) {
                            this.f3668T = y4;
                            z4 = true;
                        }
                        if (z4) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    g0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f3663O = motionEvent.getPointerId(actionIndex);
                    int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f3667S = x5;
                    this.f3665Q = x5;
                    int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f3668T = y5;
                    this.f3666R = y5;
                } else if (actionMasked == 6) {
                    X(motionEvent);
                }
                if (this.f3662N == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        Trace.beginSection("RV OnLayout");
        t();
        Trace.endSection();
        this.f3709u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 == null) {
            r(i, i4);
            return;
        }
        boolean P3 = abstractC0238q0.P();
        boolean z3 = false;
        E0 e02 = this.f3686h0;
        if (P3) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i4);
            this.f3696n.f3884b.r(i, i4);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z3 = true;
            }
            this.f3714w0 = z3;
            if (z3 || this.f3694m == null) {
                return;
            }
            if (e02.f3512d == 1) {
                u();
            }
            this.f3696n.y0(i, i4);
            e02.i = true;
            v();
            this.f3696n.A0(i, i4);
            if (this.f3696n.D0()) {
                this.f3696n.y0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                e02.i = true;
                v();
                this.f3696n.A0(i, i4);
            }
            this.f3716x0 = getMeasuredWidth();
            this.f3718y0 = getMeasuredHeight();
            return;
        }
        if (this.f3707t) {
            this.f3696n.f3884b.r(i, i4);
            return;
        }
        if (this.f3650A) {
            n0();
            V();
            Z();
            W(true);
            if (e02.f3517k) {
                e02.f3515g = true;
            } else {
                this.f3680e.d();
                e02.f3515g = false;
            }
            this.f3650A = false;
            o0(false);
        } else if (e02.f3517k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0220h0 abstractC0220h0 = this.f3694m;
        if (abstractC0220h0 != null) {
            e02.f3513e = abstractC0220h0.getItemCount();
        } else {
            e02.f3513e = 0;
        }
        n0();
        this.f3696n.f3884b.r(i, i4);
        o0(false);
        e02.f3515g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (R()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof B0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        B0 b02 = (B0) parcelable;
        this.f3678d = b02;
        super.onRestoreInstanceState(b02.f1880a);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, W.b, androidx.recyclerview.widget.B0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new W.b(super.onSaveInstanceState());
        B0 b02 = this.f3678d;
        if (b02 != null) {
            bVar.f3463c = b02.f3463c;
            return bVar;
        }
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null) {
            bVar.f3463c = abstractC0238q0.k0();
            return bVar;
        }
        bVar.f3463c = null;
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i5, int i6) {
        super.onSizeChanged(i, i4, i5, i6);
        if (i == i5 && i4 == i6) {
            return;
        }
        this.f3660L = null;
        this.J = null;
        this.f3659K = null;
        this.f3658I = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x02b2, code lost:
    
        if (r5 == 0) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03d0, code lost:
    
        if (r1 < r2) goto L483;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void q() {
        if (!this.f3709u || this.f3653D) {
            Trace.beginSection("RV FullInvalidate");
            t();
            Trace.endSection();
            return;
        }
        if (this.f3680e.j()) {
            C0207b c0207b = this.f3680e;
            int i = c0207b.f3787a;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (c0207b.j()) {
                    Trace.beginSection("RV FullInvalidate");
                    t();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            n0();
            V();
            this.f3680e.p();
            if (!this.f3713w) {
                int e4 = this.f3682f.e();
                int i4 = 0;
                while (true) {
                    if (i4 < e4) {
                        I0 N3 = N(this.f3682f.d(i4));
                        if (N3 != null && !N3.shouldIgnore() && N3.isUpdated()) {
                            t();
                            break;
                        }
                        i4++;
                    } else {
                        this.f3680e.c();
                        break;
                    }
                }
            }
            o0(true);
            W(true);
            Trace.endSection();
        }
    }

    public final void r(int i, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = O.X.f1226a;
        setMeasuredDimension(AbstractC0238q0.g(i, paddingRight, getMinimumWidth()), AbstractC0238q0.g(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        I0 N3 = N(view);
        if (N3 != null) {
            if (N3.isTmpDetached()) {
                N3.clearTmpDetachFlag();
            } else if (!N3.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(N3);
                throw new IllegalArgumentException(C.w.j(this, sb));
            }
        } else if (A0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(C.w.j(this, sb2));
        }
        view.clearAnimation();
        s(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        X x3 = this.f3696n.f3887e;
        if ((x3 == null || !x3.f3772e) && !R() && view2 != null) {
            f0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f3696n.s0(this, view, rect, z3, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f3701q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((u0) arrayList.get(i)).onRequestDisallowInterceptTouchEvent(z3);
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3711v != 0 || this.f3715x) {
            this.f3713w = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(View view) {
        I0 N3 = N(view);
        AbstractC0220h0 abstractC0220h0 = this.f3694m;
        if (abstractC0220h0 != null && N3 != null) {
            abstractC0220h0.onViewDetachedFromWindow(N3);
        }
        ArrayList arrayList = this.f3652C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC0241s0) this.f3652C.get(size)).b(view);
            }
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i4) {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3715x) {
            return;
        }
        boolean d4 = abstractC0238q0.d();
        boolean e4 = this.f3696n.e();
        if (d4 || e4) {
            if (!d4) {
                i = 0;
            }
            if (!e4) {
                i4 = 0;
            }
            h0(i, i4, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!R()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f3719z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(K0 k02) {
        this.f3699o0 = k02;
        O.X.j(this, k02);
    }

    public void setAdapter(AbstractC0220h0 abstractC0220h0) {
        setLayoutFrozen(false);
        AbstractC0220h0 abstractC0220h02 = this.f3694m;
        H2.m mVar = this.f3674b;
        if (abstractC0220h02 != null) {
            abstractC0220h02.unregisterAdapterDataObserver(mVar);
            this.f3694m.onDetachedFromRecyclerView(this);
        }
        AbstractC0230m0 abstractC0230m0 = this.f3661M;
        if (abstractC0230m0 != null) {
            abstractC0230m0.e();
        }
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        y0 y0Var = this.f3676c;
        if (abstractC0238q0 != null) {
            abstractC0238q0.n0(y0Var);
            this.f3696n.o0(y0Var);
        }
        y0Var.f3936a.clear();
        y0Var.f();
        C0207b c0207b = this.f3680e;
        c0207b.q((ArrayList) c0207b.f3789c);
        c0207b.q((ArrayList) c0207b.f3790d);
        c0207b.f3787a = 0;
        AbstractC0220h0 abstractC0220h03 = this.f3694m;
        this.f3694m = abstractC0220h0;
        if (abstractC0220h0 != null) {
            abstractC0220h0.registerAdapterDataObserver(mVar);
            abstractC0220h0.onAttachedToRecyclerView(this);
        }
        AbstractC0238q0 abstractC0238q02 = this.f3696n;
        if (abstractC0238q02 != null) {
            abstractC0238q02.U();
        }
        AbstractC0220h0 abstractC0220h04 = this.f3694m;
        y0Var.f3936a.clear();
        y0Var.f();
        y0Var.e(abstractC0220h03, true);
        x0 c4 = y0Var.c();
        if (abstractC0220h03 != null) {
            c4.f3932b--;
        }
        if (c4.f3932b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c4.f3931a;
                if (i >= sparseArray.size()) {
                    break;
                }
                w0 w0Var = (w0) sparseArray.valueAt(i);
                Iterator it = w0Var.f3923a.iterator();
                while (it.hasNext()) {
                    AbstractC0105a.f(((I0) it.next()).itemView);
                }
                w0Var.f3923a.clear();
                i++;
            }
        }
        if (abstractC0220h04 != null) {
            c4.f3932b++;
        }
        y0Var.d();
        this.f3686h0.f3514f = true;
        a0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0226k0 interfaceC0226k0) {
        if (interfaceC0226k0 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(interfaceC0226k0 != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.h) {
            this.f3660L = null;
            this.J = null;
            this.f3659K = null;
            this.f3658I = null;
        }
        this.h = z3;
        super.setClipToPadding(z3);
        if (this.f3709u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC0228l0 abstractC0228l0) {
        abstractC0228l0.getClass();
        this.f3657H = abstractC0228l0;
        this.f3660L = null;
        this.J = null;
        this.f3659K = null;
        this.f3658I = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.f3707t = z3;
    }

    public void setItemAnimator(AbstractC0230m0 abstractC0230m0) {
        AbstractC0230m0 abstractC0230m02 = this.f3661M;
        if (abstractC0230m02 != null) {
            abstractC0230m02.e();
            this.f3661M.f3845a = null;
        }
        this.f3661M = abstractC0230m0;
        if (abstractC0230m0 != null) {
            abstractC0230m0.f3845a = this.f3695m0;
        }
    }

    public void setItemViewCacheSize(int i) {
        y0 y0Var = this.f3676c;
        y0Var.f3940e = i;
        y0Var.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(AbstractC0238q0 abstractC0238q0) {
        RecyclerView recyclerView;
        X x3;
        if (abstractC0238q0 == this.f3696n) {
            return;
        }
        setScrollState(0);
        H0 h02 = this.f3681e0;
        h02.f3550g.removeCallbacks(h02);
        h02.f3546c.abortAnimation();
        AbstractC0238q0 abstractC0238q02 = this.f3696n;
        if (abstractC0238q02 != null && (x3 = abstractC0238q02.f3887e) != null) {
            x3.i();
        }
        AbstractC0238q0 abstractC0238q03 = this.f3696n;
        y0 y0Var = this.f3676c;
        if (abstractC0238q03 != null) {
            AbstractC0230m0 abstractC0230m0 = this.f3661M;
            if (abstractC0230m0 != null) {
                abstractC0230m0.e();
            }
            this.f3696n.n0(y0Var);
            this.f3696n.o0(y0Var);
            y0Var.f3936a.clear();
            y0Var.f();
            if (this.f3705s) {
                AbstractC0238q0 abstractC0238q04 = this.f3696n;
                abstractC0238q04.f3889g = false;
                abstractC0238q04.W(this);
            }
            this.f3696n.B0(null);
            this.f3696n = null;
        } else {
            y0Var.f3936a.clear();
            y0Var.f();
        }
        C0223j c0223j = this.f3682f;
        c0223j.f3827b.h();
        ArrayList arrayList = c0223j.f3828c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c0223j.f3826a.f3809a;
            if (size < 0) {
                break;
            }
            I0 N3 = N((View) arrayList.get(size));
            if (N3 != null) {
                N3.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f3696n = abstractC0238q0;
        if (abstractC0238q0 != null) {
            if (abstractC0238q0.f3884b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC0238q0);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(C.w.j(abstractC0238q0.f3884b, sb));
            }
            abstractC0238q0.B0(this);
            if (this.f3705s) {
                AbstractC0238q0 abstractC0238q05 = this.f3696n;
                abstractC0238q05.f3889g = true;
                abstractC0238q05.V(this);
            }
        }
        y0Var.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        O.r scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f1290d) {
            WeakHashMap weakHashMap = O.X.f1226a;
            O.L.z(scrollingChildHelper.f1289c);
        }
        scrollingChildHelper.f1290d = z3;
    }

    public void setOnFlingListener(t0 t0Var) {
        this.f3670V = t0Var;
    }

    @Deprecated
    public void setOnScrollListener(v0 v0Var) {
        this.f3687i0 = v0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f3679d0 = z3;
    }

    public void setRecycledViewPool(x0 x0Var) {
        y0 y0Var = this.f3676c;
        RecyclerView recyclerView = y0Var.h;
        y0Var.e(recyclerView.f3694m, false);
        if (y0Var.f3942g != null) {
            r1.f3932b--;
        }
        y0Var.f3942g = x0Var;
        if (x0Var != null && recyclerView.getAdapter() != null) {
            y0Var.f3942g.f3932b++;
        }
        y0Var.d();
    }

    @Deprecated
    public void setRecyclerListener(z0 z0Var) {
    }

    public void setScrollState(int i) {
        X x3;
        if (i == this.f3662N) {
            return;
        }
        if (f3642B0) {
            StringBuilder t2 = C.w.t(i, "setting scroll state to ", " from ");
            t2.append(this.f3662N);
            Log.d("RecyclerView", t2.toString(), new Exception());
        }
        this.f3662N = i;
        if (i != 2) {
            H0 h02 = this.f3681e0;
            h02.f3550g.removeCallbacks(h02);
            h02.f3546c.abortAnimation();
            AbstractC0238q0 abstractC0238q0 = this.f3696n;
            if (abstractC0238q0 != null && (x3 = abstractC0238q0.f3887e) != null) {
                x3.i();
            }
        }
        AbstractC0238q0 abstractC0238q02 = this.f3696n;
        if (abstractC0238q02 != null) {
            abstractC0238q02.l0(i);
        }
        v0 v0Var = this.f3687i0;
        if (v0Var != null) {
            v0Var.onScrollStateChanged(this, i);
        }
        ArrayList arrayList = this.f3689j0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v0) this.f3689j0.get(size)).onScrollStateChanged(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f3669U = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f3669U = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(G0 g02) {
        this.f3676c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z3) {
        X x3;
        if (z3 != this.f3715x) {
            l("Do not suppressLayout in layout or scroll");
            if (!z3) {
                this.f3715x = false;
                if (this.f3713w && this.f3696n != null && this.f3694m != null) {
                    requestLayout();
                }
                this.f3713w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
            this.f3715x = true;
            this.f3717y = true;
            setScrollState(0);
            H0 h02 = this.f3681e0;
            h02.f3550g.removeCallbacks(h02);
            h02.f3546c.abortAnimation();
            AbstractC0238q0 abstractC0238q0 = this.f3696n;
            if (abstractC0238q0 == null || (x3 = abstractC0238q0.f3887e) == null) {
                return;
            }
            x3.i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0348, code lost:
    
        if (r21.f3682f.f3828c.contains(getFocusedChild()) == false) goto L484;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03c1  */
    /* JADX WARN: Type inference failed for: r13v7, types: [O.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [F.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [O.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [O.u, java.lang.Object] */
    public final void u() {
        S0 s02;
        View F3;
        E0 e02 = this.f3686h0;
        e02.a(1);
        E(e02);
        e02.i = false;
        n0();
        F.i iVar = this.f3684g;
        ((s.j) iVar.f490b).clear();
        s.g gVar = (s.g) iVar.f491c;
        gVar.a();
        V();
        Z();
        I0 i02 = null;
        View focusedChild = (this.f3679d0 && hasFocus() && this.f3694m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (F3 = F(focusedChild)) != null) {
            i02 = M(F3);
        }
        if (i02 == null) {
            e02.f3519m = -1L;
            e02.f3518l = -1;
            e02.f3520n = -1;
        } else {
            e02.f3519m = this.f3694m.hasStableIds() ? i02.getItemId() : -1L;
            e02.f3518l = this.f3653D ? -1 : i02.isRemoved() ? i02.mOldPosition : i02.getAbsoluteAdapterPosition();
            View view = i02.itemView;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            e02.f3520n = id;
        }
        e02.h = e02.f3516j && this.f3693l0;
        this.f3693l0 = false;
        this.f3691k0 = false;
        e02.f3515g = e02.f3517k;
        e02.f3513e = this.f3694m.getItemCount();
        H(this.f3700p0);
        boolean z3 = e02.f3516j;
        s.j jVar = (s.j) iVar.f490b;
        if (z3) {
            int e4 = this.f3682f.e();
            for (int i = 0; i < e4; i++) {
                I0 N3 = N(this.f3682f.d(i));
                if (!N3.shouldIgnore() && (!N3.isInvalid() || this.f3694m.hasStableIds())) {
                    AbstractC0230m0 abstractC0230m0 = this.f3661M;
                    AbstractC0230m0.b(N3);
                    N3.getUnmodifiedPayloads();
                    abstractC0230m0.getClass();
                    ?? obj = new Object();
                    obj.a(N3);
                    S0 s03 = (S0) jVar.get(N3);
                    if (s03 == null) {
                        s03 = S0.a();
                        jVar.put(N3, s03);
                    }
                    s03.f3728b = obj;
                    s03.f3727a |= 4;
                    if (e02.h && N3.isUpdated() && !N3.isRemoved() && !N3.shouldIgnore() && !N3.isInvalid()) {
                        gVar.e(L(N3), N3);
                    }
                }
            }
        }
        if (e02.f3517k) {
            int h = this.f3682f.h();
            for (int i4 = 0; i4 < h; i4++) {
                I0 N4 = N(this.f3682f.g(i4));
                if (A0 && N4.mPosition == -1 && !N4.isRemoved()) {
                    throw new IllegalStateException(C.w.j(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!N4.shouldIgnore()) {
                    N4.saveOldPosition();
                }
            }
            boolean z4 = e02.f3514f;
            e02.f3514f = false;
            this.f3696n.h0(this.f3676c, e02);
            e02.f3514f = z4;
            for (int i5 = 0; i5 < this.f3682f.e(); i5++) {
                I0 N5 = N(this.f3682f.d(i5));
                if (!N5.shouldIgnore() && ((s02 = (S0) jVar.get(N5)) == null || (s02.f3727a & 4) == 0)) {
                    AbstractC0230m0.b(N5);
                    boolean hasAnyOfTheFlags = N5.hasAnyOfTheFlags(8192);
                    AbstractC0230m0 abstractC0230m02 = this.f3661M;
                    N5.getUnmodifiedPayloads();
                    abstractC0230m02.getClass();
                    ?? obj2 = new Object();
                    obj2.a(N5);
                    if (hasAnyOfTheFlags) {
                        b0(N5, obj2);
                    } else {
                        S0 s04 = (S0) jVar.get(N5);
                        if (s04 == null) {
                            s04 = S0.a();
                            jVar.put(N5, s04);
                        }
                        s04.f3727a |= 2;
                        s04.f3728b = obj2;
                    }
                }
            }
            n();
        } else {
            n();
        }
        W(true);
        o0(false);
        e02.f3512d = 2;
    }

    public final void v() {
        n0();
        V();
        E0 e02 = this.f3686h0;
        e02.a(6);
        this.f3680e.d();
        e02.f3513e = this.f3694m.getItemCount();
        e02.f3511c = 0;
        if (this.f3678d != null && this.f3694m.canRestoreState()) {
            Parcelable parcelable = this.f3678d.f3463c;
            if (parcelable != null) {
                this.f3696n.j0(parcelable);
            }
            this.f3678d = null;
        }
        e02.f3515g = false;
        this.f3696n.h0(this.f3676c, e02);
        e02.f3514f = false;
        e02.f3516j = e02.f3516j && this.f3661M != null;
        e02.f3512d = 4;
        W(true);
        o0(false);
    }

    public final boolean w(int[] iArr, int[] iArr2, int i, int i4, int i5) {
        return getScrollingChildHelper().c(iArr, iArr2, i, i4, i5);
    }

    public final void x(int i, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        getScrollingChildHelper().d(i, i4, i5, i6, iArr, i7, iArr2);
    }

    public final void y(int i, int i4) {
        this.f3656G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i4);
        v0 v0Var = this.f3687i0;
        if (v0Var != null) {
            v0Var.onScrolled(this, i, i4);
        }
        ArrayList arrayList = this.f3689j0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v0) this.f3689j0.get(size)).onScrolled(this, i, i4);
            }
        }
        this.f3656G--;
    }

    public final void z() {
        if (this.f3660L != null) {
            return;
        }
        ((F0) this.f3657H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3660L = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.recyclerview.widget.m0, java.lang.Object, androidx.recyclerview.widget.q] */
    /* JADX WARN: Type inference failed for: r3v18, types: [androidx.recyclerview.widget.E0, java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        char c4;
        TypedArray typedArray;
        char c5;
        int i4;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.f3674b = new H2.m(this, 1);
        this.f3676c = new y0(this);
        this.f3684g = new F.i(12);
        this.i = new RunnableC0214e0(this, 0);
        this.f3688j = new Rect();
        this.f3690k = new Rect();
        this.f3692l = new RectF();
        this.f3698o = new ArrayList();
        this.p = new ArrayList();
        this.f3701q = new ArrayList();
        this.f3711v = 0;
        this.f3653D = false;
        this.f3654E = false;
        this.f3655F = 0;
        this.f3656G = 0;
        this.f3657H = f3649J0;
        ?? obj = new Object();
        obj.f3845a = null;
        obj.f3846b = new ArrayList();
        obj.f3847c = 120L;
        obj.f3848d = 120L;
        obj.f3849e = 250L;
        obj.f3850f = 250L;
        obj.f3874g = true;
        obj.h = new ArrayList();
        obj.i = new ArrayList();
        obj.f3875j = new ArrayList();
        obj.f3876k = new ArrayList();
        obj.f3877l = new ArrayList();
        obj.f3878m = new ArrayList();
        obj.f3879n = new ArrayList();
        obj.f3880o = new ArrayList();
        obj.p = new ArrayList();
        obj.f3881q = new ArrayList();
        obj.f3882r = new ArrayList();
        this.f3661M = obj;
        this.f3662N = 0;
        this.f3663O = -1;
        this.f3675b0 = Float.MIN_VALUE;
        this.f3677c0 = Float.MIN_VALUE;
        this.f3679d0 = true;
        this.f3681e0 = new H0(this);
        this.f3685g0 = f3646G0 ? new Object() : null;
        ?? obj2 = new Object();
        obj2.f3509a = -1;
        obj2.f3510b = 0;
        obj2.f3511c = 0;
        obj2.f3512d = 1;
        obj2.f3513e = 0;
        obj2.f3514f = false;
        obj2.f3515g = false;
        obj2.h = false;
        obj2.i = false;
        obj2.f3516j = false;
        obj2.f3517k = false;
        this.f3686h0 = obj2;
        this.f3691k0 = false;
        this.f3693l0 = false;
        C0216f0 c0216f0 = new C0216f0(this);
        this.f3695m0 = c0216f0;
        this.f3697n0 = false;
        this.f3700p0 = new int[2];
        this.f3704r0 = new int[2];
        this.f3706s0 = new int[2];
        this.f3708t0 = new int[2];
        this.f3710u0 = new ArrayList();
        this.f3712v0 = new RunnableC0214e0(this, 1);
        this.f3716x0 = 0;
        this.f3718y0 = 0;
        this.f3720z0 = new C0216f0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3669U = viewConfiguration.getScaledTouchSlop();
        this.f3675b0 = O.Y.a(viewConfiguration);
        this.f3677c0 = O.Y.b(viewConfiguration);
        this.f3671W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3673a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3672a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3661M.f3845a = c0216f0;
        this.f3680e = new C0207b(new C0216f0(this));
        this.f3682f = new C0223j(new C0216f0(this));
        WeakHashMap weakHashMap = O.X.f1226a;
        if (O.O.c(this) == 0) {
            O.O.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f3651B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new K0(this));
        int[] iArr = AbstractC0615a.f8509a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        O.S.d(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c4 = 3;
                c5 = 2;
                typedArray = obtainStyledAttributes;
                i4 = 4;
                new C(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.adif.elcanomovil.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.adif.elcanomovil.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.adif.elcanomovil.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(C.w.j(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            c4 = 3;
            typedArray = obtainStyledAttributes;
            c5 = 2;
            i4 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(AbstractC0238q0.class);
                    try {
                        constructor = asSubclass.getConstructor(f3647H0);
                        Object[] objArr2 = new Object[i4];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c5] = Integer.valueOf(i);
                        objArr2[c4] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e4) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e5) {
                            e5.initCause(e4);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e5);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC0238q0) constructor.newInstance(objArr));
                } catch (ClassCastException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e6);
                } catch (ClassNotFoundException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e7);
                } catch (IllegalAccessException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e8);
                } catch (InstantiationException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e9);
                } catch (InvocationTargetException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e10);
                }
            }
        }
        int[] iArr2 = f3643C0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        O.S.d(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
        Intrinsics.checkNotNullParameter(this, "<this>");
        setTag(com.adif.elcanomovil.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0238q0 abstractC0238q0 = this.f3696n;
        if (abstractC0238q0 != null) {
            return abstractC0238q0.t(layoutParams);
        }
        throw new IllegalStateException(C.w.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
