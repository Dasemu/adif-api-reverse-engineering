package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import f.AbstractC0336a;
import l.AbstractC0425c;
import l.C0424b;
import l.InterfaceC0434l;
import l.m;
import l.o;
import l.z;
import m.InterfaceC0474m;
import m.W;
import m.W0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends W implements z, View.OnClickListener, InterfaceC0474m {

    /* renamed from: g, reason: collision with root package name */
    public o f2336g;
    public CharSequence h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0434l f2337j;

    /* renamed from: k, reason: collision with root package name */
    public C0424b f2338k;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0425c f2339l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2340m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2341n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2342o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2343q;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f2340m = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0336a.f6424c, 0, 0);
        this.f2342o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f2343q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.p = -1;
        setSaveEnabled(false);
    }

    @Override // m.InterfaceC0474m
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.z
    public final void b(o oVar) {
        this.f2336g = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f7268a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f2338k == null) {
            this.f2338k = new C0424b(this);
        }
    }

    @Override // m.InterfaceC0474m
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f2336g.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.z
    public o getItemData() {
        return this.f2336g;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i4 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void i() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.h);
        if (this.i != null && ((this.f2336g.f7289y & 4) != 4 || (!this.f2340m && !this.f2341n))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        setText(z5 ? this.h : null);
        CharSequence charSequence = this.f2336g.f7281q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z5 ? null : this.f2336g.f7272e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f2336g.f7282r;
        if (TextUtils.isEmpty(charSequence2)) {
            W0.a(this, z5 ? null : this.f2336g.f7272e);
        } else {
            W0.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0434l interfaceC0434l = this.f2337j;
        if (interfaceC0434l != null) {
            interfaceC0434l.c(this.f2336g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2340m = h();
        i();
    }

    @Override // m.W, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i5 = this.p) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i4);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i6 = this.f2342o;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i6) : i6;
        if (mode != 1073741824 && i6 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i4);
        }
        if (!isEmpty || this.i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0424b c0424b;
        if (this.f2336g.hasSubMenu() && (c0424b = this.f2338k) != null && c0424b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f2341n != z3) {
            this.f2341n = z3;
            o oVar = this.f2336g;
            if (oVar != null) {
                m mVar = oVar.f7279n;
                mVar.f7249k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f2343q;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(InterfaceC0434l interfaceC0434l) {
        this.f2337j = interfaceC0434l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i4, int i5, int i6) {
        this.p = i;
        super.setPadding(i, i4, i5, i6);
    }

    public void setPopupCallback(AbstractC0425c abstractC0425c) {
        this.f2339l = abstractC0425c;
    }

    public void setTitle(CharSequence charSequence) {
        this.h = charSequence;
        i();
    }
}
