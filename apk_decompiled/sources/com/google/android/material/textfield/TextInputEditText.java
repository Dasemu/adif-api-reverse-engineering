package com.google.android.material.textfield;

import K2.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.adif.elcanomovil.R;
import h2.AbstractC0379a;
import java.util.Locale;
import x2.m;

/* loaded from: classes3.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: f, reason: collision with root package name */
    public final Rect f5807f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5808g;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.editTextStyle, 0), attributeSet, 0);
        this.f5807f = new Rect();
        int[] iArr = AbstractC0379a.f6752F;
        m.a(context, attributeSet, R.attr.editTextStyle, 2132018092);
        m.b(context, attributeSet, iArr, R.attr.editTextStyle, 2132018092, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.editTextStyle, 2132018092);
        setTextInputLayoutFocusedRectEnabled(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f5808g || rect == null) {
            return;
        }
        Rect rect2 = this.f5807f;
        textInputLayout.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f5808g) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.f5815E) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f5815E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f5808g || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = textInputLayout.getHeight() - getHeight();
        int i = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom + height;
        Rect rect2 = this.f5807f;
        rect2.set(i, i4, i5, i6);
        return super.requestRectangleOnScreen(rect2);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z3) {
        this.f5808g = z3;
    }
}
