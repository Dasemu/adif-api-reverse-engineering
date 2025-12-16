package m;

import a.AbstractC0106b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import f.AbstractC0336a;
import kotlin.jvm.internal.IntCompanionObject;
import l.InterfaceC0420C;

/* renamed from: m.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0496x0 implements InterfaceC0420C {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7760a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f7761b;

    /* renamed from: c, reason: collision with root package name */
    public C0475m0 f7762c;

    /* renamed from: f, reason: collision with root package name */
    public int f7765f;

    /* renamed from: g, reason: collision with root package name */
    public int f7766g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7767j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7768k;

    /* renamed from: n, reason: collision with root package name */
    public F0.i f7771n;

    /* renamed from: o, reason: collision with root package name */
    public View f7772o;
    public AdapterView.OnItemClickListener p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f7773q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f7778v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f7780x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7781y;

    /* renamed from: z, reason: collision with root package name */
    public final C0497y f7782z;

    /* renamed from: d, reason: collision with root package name */
    public final int f7763d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f7764e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f7769l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f7770m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final RunnableC0490u0 f7774r = new RunnableC0490u0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final ViewOnTouchListenerC0494w0 f7775s = new ViewOnTouchListenerC0494w0(this);

    /* renamed from: t, reason: collision with root package name */
    public final C0492v0 f7776t = new C0492v0(this);

    /* renamed from: u, reason: collision with root package name */
    public final RunnableC0490u0 f7777u = new RunnableC0490u0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f7779w = new Rect();

    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.PopupWindow, m.y] */
    public C0496x0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f7760a = context;
        this.f7778v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0336a.f6434o, i, 0);
        this.f7765f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f7766g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0336a.f6437s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            U.l.c(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0106b.m(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f7782z = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // l.InterfaceC0420C
    public final boolean a() {
        return this.f7782z.isShowing();
    }

    public final int b() {
        return this.f7765f;
    }

    @Override // l.InterfaceC0420C
    public final void c() {
        int i;
        int paddingBottom;
        C0475m0 c0475m0;
        C0475m0 c0475m02 = this.f7762c;
        C0497y c0497y = this.f7782z;
        Context context = this.f7760a;
        if (c0475m02 == null) {
            C0475m0 q4 = q(context, !this.f7781y);
            this.f7762c = q4;
            q4.setAdapter(this.f7761b);
            this.f7762c.setOnItemClickListener(this.p);
            this.f7762c.setFocusable(true);
            this.f7762c.setFocusableInTouchMode(true);
            this.f7762c.setOnItemSelectedListener(new C0484r0(this));
            this.f7762c.setOnScrollListener(this.f7776t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f7773q;
            if (onItemSelectedListener != null) {
                this.f7762c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0497y.setContentView(this.f7762c);
        }
        Drawable background = c0497y.getBackground();
        Rect rect = this.f7779w;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.i) {
                this.f7766g = -i4;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = AbstractC0486s0.a(c0497y, this.f7772o, this.f7766g, c0497y.getInputMethodMode() == 2);
        int i5 = this.f7763d;
        if (i5 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i6 = this.f7764e;
            int a4 = this.f7762c.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), IntCompanionObject.MIN_VALUE), a2);
            paddingBottom = a4 + (a4 > 0 ? this.f7762c.getPaddingBottom() + this.f7762c.getPaddingTop() + i : 0);
        }
        boolean z3 = this.f7782z.getInputMethodMode() == 2;
        U.l.d(c0497y, this.h);
        if (c0497y.isShowing()) {
            if (this.f7772o.isAttachedToWindow()) {
                int i7 = this.f7764e;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = this.f7772o.getWidth();
                }
                if (i5 == -1) {
                    i5 = z3 ? paddingBottom : -1;
                    if (z3) {
                        c0497y.setWidth(this.f7764e == -1 ? -1 : 0);
                        c0497y.setHeight(0);
                    } else {
                        c0497y.setWidth(this.f7764e == -1 ? -1 : 0);
                        c0497y.setHeight(-1);
                    }
                } else if (i5 == -2) {
                    i5 = paddingBottom;
                }
                c0497y.setOutsideTouchable(true);
                View view = this.f7772o;
                int i8 = this.f7765f;
                int i9 = this.f7766g;
                if (i7 < 0) {
                    i7 = -1;
                }
                c0497y.update(view, i8, i9, i7, i5 < 0 ? -1 : i5);
                return;
            }
            return;
        }
        int i10 = this.f7764e;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = this.f7772o.getWidth();
        }
        if (i5 == -1) {
            i5 = -1;
        } else if (i5 == -2) {
            i5 = paddingBottom;
        }
        c0497y.setWidth(i10);
        c0497y.setHeight(i5);
        AbstractC0488t0.b(c0497y, true);
        c0497y.setOutsideTouchable(true);
        c0497y.setTouchInterceptor(this.f7775s);
        if (this.f7768k) {
            U.l.c(c0497y, this.f7767j);
        }
        AbstractC0488t0.a(c0497y, this.f7780x);
        c0497y.showAsDropDown(this.f7772o, this.f7765f, this.f7766g, this.f7769l);
        this.f7762c.setSelection(-1);
        if ((!this.f7781y || this.f7762c.isInTouchMode()) && (c0475m0 = this.f7762c) != null) {
            c0475m0.setListSelectionHidden(true);
            c0475m0.requestLayout();
        }
        if (this.f7781y) {
            return;
        }
        this.f7778v.post(this.f7777u);
    }

    public final Drawable d() {
        return this.f7782z.getBackground();
    }

    @Override // l.InterfaceC0420C
    public final void dismiss() {
        C0497y c0497y = this.f7782z;
        c0497y.dismiss();
        c0497y.setContentView(null);
        this.f7762c = null;
        this.f7778v.removeCallbacks(this.f7774r);
    }

    @Override // l.InterfaceC0420C
    public final C0475m0 f() {
        return this.f7762c;
    }

    public final void h(Drawable drawable) {
        this.f7782z.setBackgroundDrawable(drawable);
    }

    public final void i(int i) {
        this.f7766g = i;
        this.i = true;
    }

    public final void k(int i) {
        this.f7765f = i;
    }

    public final int n() {
        if (this.i) {
            return this.f7766g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        F0.i iVar = this.f7771n;
        if (iVar == null) {
            this.f7771n = new F0.i(this, 2);
        } else {
            ListAdapter listAdapter2 = this.f7761b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(iVar);
            }
        }
        this.f7761b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f7771n);
        }
        C0475m0 c0475m0 = this.f7762c;
        if (c0475m0 != null) {
            c0475m0.setAdapter(this.f7761b);
        }
    }

    public C0475m0 q(Context context, boolean z3) {
        return new C0475m0(context, z3);
    }

    public final void r(int i) {
        Drawable background = this.f7782z.getBackground();
        if (background == null) {
            this.f7764e = i;
            return;
        }
        Rect rect = this.f7779w;
        background.getPadding(rect);
        this.f7764e = rect.left + rect.right + i;
    }
}
