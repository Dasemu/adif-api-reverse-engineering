package m;

import a.AbstractC0106b;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.recyclerview.widget.C0207b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class W extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0207b f7637a;

    /* renamed from: b, reason: collision with root package name */
    public final T f7638b;

    /* renamed from: c, reason: collision with root package name */
    public C0491v f7639c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7640d;

    /* renamed from: e, reason: collision with root package name */
    public C0499z f7641e;

    /* renamed from: f, reason: collision with root package name */
    public Future f7642f;

    public W(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public static /* synthetic */ void d(W w3, int i) {
        super.setFirstBaselineToTopHeight(i);
    }

    public static /* synthetic */ void e(W w3, int i) {
        super.setLastBaselineToBottomHeight(i);
    }

    private C0491v getEmojiTextViewHelper() {
        if (this.f7639c == null) {
            this.f7639c = new C0491v(this);
        }
        return this.f7639c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0207b c0207b = this.f7637a;
        if (c0207b != null) {
            c0207b.a();
        }
        T t2 = this.f7638b;
        if (t2 != null) {
            t2.b();
        }
    }

    public final void g() {
        Future future = this.f7642f;
        if (future == null) {
            return;
        }
        try {
            this.f7642f = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public U getSuperCaller() {
        if (this.f7641e == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f7641e = new V(this);
            } else {
                this.f7641e = new C0499z(this);
            }
        }
        return this.f7641e;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207b c0207b = this.f7637a;
        if (c0207b != null) {
            return c0207b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207b c0207b = this.f7637a;
        if (c0207b != null) {
            return c0207b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7638b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7638b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public M.d getTextMetricsParamsCompat() {
        return new M.d(U.u.c(this));
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f7638b.getClass();
        T.h(editorInfo, onCreateInputConnection, this);
        AbstractC0106b.x(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        T t2 = this.f7638b;
        if (t2 != null) {
            t2.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i4) {
        g();
        super.onMeasure(i, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        super.onTextChanged(charSequence, i, i4, i5);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i4, int i5, int i6) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i4, i5, i6);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207b c0207b = this.f7637a;
        if (c0207b != null) {
            c0207b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0207b c0207b = this.f7637a;
        if (c0207b != null) {
            c0207b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f7638b;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f7638b;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f7638b;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f7638b;
        if (t2 != null) {
            t2.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        getSuperCaller().b(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        getSuperCaller().a(i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        m3.d.G(this, i);
    }

    public void setPrecomputedText(M.e eVar) {
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207b c0207b = this.f7637a;
        if (c0207b != null) {
            c0207b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207b c0207b = this.f7637a;
        if (c0207b != null) {
            c0207b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f7638b;
        t2.i(colorStateList);
        t2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f7638b;
        t2.j(mode);
        t2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        T t2 = this.f7638b;
        if (t2 != null) {
            t2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<M.e> future) {
        this.f7642f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(M.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f1071b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(dVar.f1070a);
        U.t.e(this, dVar.f1072c);
        U.t.h(this, dVar.f1073d);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f7640d) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            E2.e eVar = G.g.f565a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f7640d = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f7640d = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        L0.a(context);
        this.f7640d = false;
        this.f7641e = null;
        K0.a(this, getContext());
        C0207b c0207b = new C0207b(this);
        this.f7637a = c0207b;
        c0207b.k(attributeSet, i);
        T t2 = new T(this);
        this.f7638b = t2;
        t2.f(attributeSet, i);
        t2.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            getSuperCaller().c(i, f2);
        } else if (i4 >= 34) {
            U.v.a(this, i, f2);
        } else {
            m3.d.G(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0106b.m(context, i) : null, i4 != 0 ? AbstractC0106b.m(context, i4) : null, i5 != 0 ? AbstractC0106b.m(context, i5) : null, i6 != 0 ? AbstractC0106b.m(context, i6) : null);
        T t2 = this.f7638b;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0106b.m(context, i) : null, i4 != 0 ? AbstractC0106b.m(context, i4) : null, i5 != 0 ? AbstractC0106b.m(context, i5) : null, i6 != 0 ? AbstractC0106b.m(context, i6) : null);
        T t2 = this.f7638b;
        if (t2 != null) {
            t2.b();
        }
    }
}
