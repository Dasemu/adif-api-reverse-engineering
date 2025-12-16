package m;

import a.AbstractC0106b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.recyclerview.widget.C0207b;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0480p extends AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f7717d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0207b f7718a;

    /* renamed from: b, reason: collision with root package name */
    public final T f7719b;

    /* renamed from: c, reason: collision with root package name */
    public final C0499z f7720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0480p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.adif.elcanomovil.R.attr.autoCompleteTextViewStyle);
        L0.a(context);
        K0.a(this, getContext());
        R0.h l4 = R0.h.l(getContext(), attributeSet, f7717d, com.adif.elcanomovil.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) l4.f1414b).hasValue(0)) {
            setDropDownBackgroundDrawable(l4.f(0));
        }
        l4.n();
        C0207b c0207b = new C0207b(this);
        this.f7718a = c0207b;
        c0207b.k(attributeSet, com.adif.elcanomovil.R.attr.autoCompleteTextViewStyle);
        T t2 = new T(this);
        this.f7719b = t2;
        t2.f(attributeSet, com.adif.elcanomovil.R.attr.autoCompleteTextViewStyle);
        t2.b();
        C0499z c0499z = new C0499z(this);
        this.f7720c = c0499z;
        c0499z.e(attributeSet, com.adif.elcanomovil.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener d4 = c0499z.d(keyListener);
        if (d4 == keyListener) {
            return;
        }
        super.setKeyListener(d4);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0207b c0207b = this.f7718a;
        if (c0207b != null) {
            c0207b.a();
        }
        T t2 = this.f7719b;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207b c0207b = this.f7718a;
        if (c0207b != null) {
            return c0207b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207b c0207b = this.f7718a;
        if (c0207b != null) {
            return c0207b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7719b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7719b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0106b.x(editorInfo, onCreateInputConnection, this);
        return this.f7720c.f(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207b c0207b = this.f7718a;
        if (c0207b != null) {
            c0207b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0207b c0207b = this.f7718a;
        if (c0207b != null) {
            c0207b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f7719b;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f7719b;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0106b.m(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f7720c.g(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f7720c.d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207b c0207b = this.f7718a;
        if (c0207b != null) {
            c0207b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207b c0207b = this.f7718a;
        if (c0207b != null) {
            c0207b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f7719b;
        t2.i(colorStateList);
        t2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f7719b;
        t2.j(mode);
        t2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        T t2 = this.f7719b;
        if (t2 != null) {
            t2.g(context, i);
        }
    }
}
