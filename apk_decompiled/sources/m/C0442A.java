package m;

import a.AbstractC0106b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.recyclerview.widget.C0207b;
import com.adif.elcanomovil.R;

/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0442A extends RadioButton implements U.x {

    /* renamed from: a, reason: collision with root package name */
    public final C0485s f7497a;

    /* renamed from: b, reason: collision with root package name */
    public final C0207b f7498b;

    /* renamed from: c, reason: collision with root package name */
    public final T f7499c;

    /* renamed from: d, reason: collision with root package name */
    public C0491v f7500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0442A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        L0.a(context);
        K0.a(this, getContext());
        C0485s c0485s = new C0485s(this);
        this.f7497a = c0485s;
        c0485s.c(attributeSet, R.attr.radioButtonStyle);
        C0207b c0207b = new C0207b(this);
        this.f7498b = c0207b;
        c0207b.k(attributeSet, R.attr.radioButtonStyle);
        T t2 = new T(this);
        this.f7499c = t2;
        t2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private C0491v getEmojiTextViewHelper() {
        if (this.f7500d == null) {
            this.f7500d = new C0491v(this);
        }
        return this.f7500d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0207b c0207b = this.f7498b;
        if (c0207b != null) {
            c0207b.a();
        }
        T t2 = this.f7499c;
        if (t2 != null) {
            t2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207b c0207b = this.f7498b;
        if (c0207b != null) {
            return c0207b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207b c0207b = this.f7498b;
        if (c0207b != null) {
            return c0207b.i();
        }
        return null;
    }

    @Override // U.x
    public ColorStateList getSupportButtonTintList() {
        C0485s c0485s = this.f7497a;
        if (c0485s != null) {
            return c0485s.f7737a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0485s c0485s = this.f7497a;
        if (c0485s != null) {
            return c0485s.f7738b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7499c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7499c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207b c0207b = this.f7498b;
        if (c0207b != null) {
            c0207b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0207b c0207b = this.f7498b;
        if (c0207b != null) {
            c0207b.n(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0485s c0485s = this.f7497a;
        if (c0485s != null) {
            if (c0485s.f7741e) {
                c0485s.f7741e = false;
            } else {
                c0485s.f7741e = true;
                c0485s.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f7499c;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f7499c;
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
        C0207b c0207b = this.f7498b;
        if (c0207b != null) {
            c0207b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207b c0207b = this.f7498b;
        if (c0207b != null) {
            c0207b.t(mode);
        }
    }

    @Override // U.x
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0485s c0485s = this.f7497a;
        if (c0485s != null) {
            c0485s.f7737a = colorStateList;
            c0485s.f7739c = true;
            c0485s.a();
        }
    }

    @Override // U.x
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0485s c0485s = this.f7497a;
        if (c0485s != null) {
            c0485s.f7738b = mode;
            c0485s.f7740d = true;
            c0485s.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f7499c;
        t2.i(colorStateList);
        t2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f7499c;
        t2.j(mode);
        t2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0106b.m(getContext(), i));
    }
}
