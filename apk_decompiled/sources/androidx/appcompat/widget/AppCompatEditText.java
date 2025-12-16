package androidx.appcompat.widget;

import A.a;
import I2.k;
import O.C0060d;
import O.C0064f;
import O.InterfaceC0058c;
import O.InterfaceC0082x;
import O.X;
import T.b;
import U.w;
import a.AbstractC0106b;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.recyclerview.widget.C0207b;
import com.adif.elcanomovil.R;
import m.AbstractC0444C;
import m.C0489u;
import m.C0499z;
import m.K0;
import m.L0;
import m.T;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC0082x {

    /* renamed from: a, reason: collision with root package name */
    public final C0207b f2427a;

    /* renamed from: b, reason: collision with root package name */
    public final T f2428b;

    /* renamed from: c, reason: collision with root package name */
    public final w f2429c;

    /* renamed from: d, reason: collision with root package name */
    public final C0499z f2430d;

    /* renamed from: e, reason: collision with root package name */
    public C0489u f2431e;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private C0489u getSuperCaller() {
        if (this.f2431e == null) {
            this.f2431e = new C0489u(this);
        }
        return this.f2431e;
    }

    @Override // O.InterfaceC0082x
    public final C0064f a(C0064f c0064f) {
        return this.f2429c.a(this, c0064f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0207b c0207b = this.f2427a;
        if (c0207b != null) {
            c0207b.a();
        }
        T t2 = this.f2428b;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207b c0207b = this.f2427a;
        if (c0207b != null) {
            return c0207b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207b c0207b = this.f2427a;
        if (c0207b != null) {
            return c0207b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2428b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2428b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] d4;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2428b.getClass();
        T.h(editorInfo, onCreateInputConnection, this);
        AbstractC0106b.x(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (d4 = X.d(this)) != null) {
            editorInfo.contentMimeTypes = d4;
            onCreateInputConnection = new b(onCreateInputConnection, new k(this, 1));
        }
        return this.f2430d.f(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z3 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && X.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z3 = AbstractC0444C.a(dragEvent, this, activity);
            }
        }
        if (z3) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0058c interfaceC0058c;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 || X.d(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i4 >= 31) {
                interfaceC0058c = new a(primaryClip, 1);
            } else {
                C0060d c0060d = new C0060d();
                c0060d.f1236b = primaryClip;
                c0060d.f1237c = 1;
                interfaceC0058c = c0060d;
            }
            interfaceC0058c.k(i == 16908322 ? 0 : 1);
            X.g(this, interfaceC0058c.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207b c0207b = this.f2427a;
        if (c0207b != null) {
            c0207b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0207b c0207b = this.f2427a;
        if (c0207b != null) {
            c0207b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f2428b;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f2428b;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f2430d.g(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2430d.d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207b c0207b = this.f2427a;
        if (c0207b != null) {
            c0207b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207b c0207b = this.f2427a;
        if (c0207b != null) {
            c0207b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f2428b;
        t2.i(colorStateList);
        t2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f2428b;
        t2.j(mode);
        t2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        T t2 = this.f2428b;
        if (t2 != null) {
            t2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, U.w] */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.editTextStyle);
        L0.a(context);
        K0.a(this, getContext());
        C0207b c0207b = new C0207b(this);
        this.f2427a = c0207b;
        c0207b.k(attributeSet, R.attr.editTextStyle);
        T t2 = new T(this);
        this.f2428b = t2;
        t2.f(attributeSet, R.attr.editTextStyle);
        t2.b();
        this.f2429c = new Object();
        C0499z c0499z = new C0499z(this);
        this.f2430d = c0499z;
        c0499z.e(attributeSet, R.attr.editTextStyle);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
