package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.recyclerview.widget.C0207b;

/* renamed from: m.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453b0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0207b f7655a;

    /* renamed from: b, reason: collision with root package name */
    public final T f7656b;

    /* renamed from: c, reason: collision with root package name */
    public C0491v f7657c;

    public C0453b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        K0.a(this, getContext());
        C0207b c0207b = new C0207b(this);
        this.f7655a = c0207b;
        c0207b.k(attributeSet, R.attr.buttonStyleToggle);
        T t2 = new T(this);
        this.f7656b = t2;
        t2.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0491v getEmojiTextViewHelper() {
        if (this.f7657c == null) {
            this.f7657c = new C0491v(this);
        }
        return this.f7657c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0207b c0207b = this.f7655a;
        if (c0207b != null) {
            c0207b.a();
        }
        T t2 = this.f7656b;
        if (t2 != null) {
            t2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207b c0207b = this.f7655a;
        if (c0207b != null) {
            return c0207b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207b c0207b = this.f7655a;
        if (c0207b != null) {
            return c0207b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7656b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7656b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207b c0207b = this.f7655a;
        if (c0207b != null) {
            c0207b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0207b c0207b = this.f7655a;
        if (c0207b != null) {
            c0207b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f7656b;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f7656b;
        if (t2 != null) {
            t2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207b c0207b = this.f7655a;
        if (c0207b != null) {
            c0207b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207b c0207b = this.f7655a;
        if (c0207b != null) {
            c0207b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f7656b;
        t2.i(colorStateList);
        t2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f7656b;
        t2.j(mode);
        t2.b();
    }
}
