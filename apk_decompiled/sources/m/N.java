package m;

import a.AbstractC0106b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.recyclerview.widget.C0207b;
import l.ViewTreeObserverOnGlobalLayoutListenerC0426d;

/* loaded from: classes.dex */
public final class N extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0207b f7590a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f7591b;

    /* renamed from: c, reason: collision with root package name */
    public final C0447F f7592c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f7593d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7594e;

    /* renamed from: f, reason: collision with root package name */
    public final M f7595f;

    /* renamed from: g, reason: collision with root package name */
    public int f7596g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public N(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130904166(0x7f030466, float:1.741517E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.h = r1
            android.content.Context r1 = r12.getContext()
            m.K0.a(r12, r1)
            int[] r1 = f.AbstractC0336a.f6439u
            R0.h r2 = R0.h.l(r13, r14, r1, r0)
            androidx.recyclerview.widget.b r3 = new androidx.recyclerview.widget.b
            r3.<init>(r12)
            r12.f7590a = r3
            java.lang.Object r3 = r2.f1414b
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            k.d r6 = new k.d
            r6.<init>(r13, r4)
            r12.f7591b = r6
            goto L37
        L35:
            r12.f7591b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = m.N.i     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r12 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r12 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            m.K r4 = new m.K
            android.content.Context r9 = r12.f7591b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f7591b
            R0.h r1 = R0.h.l(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f1414b
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f7596g = r9
            android.graphics.drawable.Drawable r9 = r1.f(r8)
            r4.h(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f7576A = r7
            r1.n()
            r12.f7595f = r4
            m.F r1 = new m.F
            r1.<init>(r12, r12, r4)
            r12.f7592c = r1
            goto Laa
        L9d:
            m.H r1 = new m.H
            r1.<init>(r12)
            r12.f7595f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f7529c = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131493046(0x7f0c00b6, float:1.8609561E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.n()
            r12.f7594e = r8
            android.widget.SpinnerAdapter r13 = r12.f7593d
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f7593d = r6
        Lcf:
            androidx.recyclerview.widget.b r12 = r12.f7590a
            r12.k(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m.N.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i5 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i5;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return rect.left + rect.right + i5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0207b c0207b = this.f7590a;
        if (c0207b != null) {
            c0207b.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        M m4 = this.f7595f;
        return m4 != null ? m4.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        M m4 = this.f7595f;
        return m4 != null ? m4.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f7595f != null ? this.f7596g : super.getDropDownWidth();
    }

    public final M getInternalPopup() {
        return this.f7595f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        M m4 = this.f7595f;
        return m4 != null ? m4.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f7591b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        M m4 = this.f7595f;
        return m4 != null ? m4.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207b c0207b = this.f7590a;
        if (c0207b != null) {
            return c0207b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207b c0207b = this.f7590a;
        if (c0207b != null) {
            return c0207b.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        M m4 = this.f7595f;
        if (m4 == null || !m4.a()) {
            return;
        }
        m4.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f7595f == null || View.MeasureSpec.getMode(i4) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        L l4 = (L) parcelable;
        super.onRestoreInstanceState(l4.getSuperState());
        if (!l4.f7588a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0426d(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, m.L] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        M m4 = this.f7595f;
        baseSavedState.f7588a = m4 != null && m4.a();
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0447F c0447f = this.f7592c;
        if (c0447f == null || !c0447f.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        M m4 = this.f7595f;
        if (m4 == null) {
            return super.performClick();
        }
        if (m4.a()) {
            return true;
        }
        this.f7595f.l(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207b c0207b = this.f7590a;
        if (c0207b != null) {
            c0207b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0207b c0207b = this.f7590a;
        if (c0207b != null) {
            c0207b.n(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i4) {
        M m4 = this.f7595f;
        if (m4 == null) {
            super.setDropDownHorizontalOffset(i4);
        } else {
            m4.j(i4);
            m4.k(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i4) {
        M m4 = this.f7595f;
        if (m4 != null) {
            m4.i(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i4) {
        if (this.f7595f != null) {
            this.f7596g = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        M m4 = this.f7595f;
        if (m4 != null) {
            m4.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i4) {
        setPopupBackgroundDrawable(AbstractC0106b.m(getPopupContext(), i4));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        M m4 = this.f7595f;
        if (m4 != null) {
            m4.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207b c0207b = this.f7590a;
        if (c0207b != null) {
            c0207b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207b c0207b = this.f7590a;
        if (c0207b != null) {
            c0207b.t(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.widget.ListAdapter, m.I, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f7594e) {
            this.f7593d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        M m4 = this.f7595f;
        if (m4 != 0) {
            Context context = this.f7591b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f7531a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f7532b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0448G.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            m4.p(obj);
        }
    }
}
