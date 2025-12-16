package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.recyclerview.widget.C0207b;
import com.adif.elcanomovil.R;
import m.C0491v;
import m.K0;
import m.L0;
import m.T;

/* loaded from: classes.dex */
public class AppCompatButton extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C0207b f2424a;

    /* renamed from: b, reason: collision with root package name */
    public final T f2425b;

    /* renamed from: c, reason: collision with root package name */
    public C0491v f2426c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private C0491v getEmojiTextViewHelper() {
        if (this.f2426c == null) {
            this.f2426c = new C0491v(this);
        }
        return this.f2426c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0207b c0207b = this.f2424a;
        if (c0207b != null) {
            c0207b.a();
        }
        T t2 = this.f2425b;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207b c0207b = this.f2424a;
        if (c0207b != null) {
            return c0207b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207b c0207b = this.f2424a;
        if (c0207b != null) {
            return c0207b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2425b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2425b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        T t2 = this.f2425b;
        if (t2 != null) {
            t2.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        super.onTextChanged(charSequence, i, i4, i5);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207b c0207b = this.f2424a;
        if (c0207b != null) {
            c0207b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0207b c0207b = this.f2424a;
        if (c0207b != null) {
            c0207b.n(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z3) {
        T t2 = this.f2425b;
        if (t2 != null) {
            t2.f7608a.setAllCaps(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207b c0207b = this.f2424a;
        if (c0207b != null) {
            c0207b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207b c0207b = this.f2424a;
        if (c0207b != null) {
            c0207b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f2425b;
        t2.i(colorStateList);
        t2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f2425b;
        t2.j(mode);
        t2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        T t2 = this.f2425b;
        if (t2 != null) {
            t2.g(context, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        L0.a(context);
        K0.a(this, getContext());
        C0207b c0207b = new C0207b(this);
        this.f2424a = c0207b;
        c0207b.k(attributeSet, i);
        T t2 = new T(this);
        this.f2425b = t2;
        t2.f(attributeSet, i);
        t2.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }
}
