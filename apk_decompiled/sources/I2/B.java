package I2;

import O.C0056b;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import m.W;

/* loaded from: classes3.dex */
public final class B extends C0056b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f797d;

    public B(TextInputLayout textInputLayout) {
        this.f797d = textInputLayout;
    }

    @Override // O.C0056b
    public final void d(View view, P.k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1232a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f1341a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f797d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z3 = textInputLayout.f5871u0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z4 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        z zVar = textInputLayout.f5835b;
        W w3 = zVar.f912b;
        if (w3.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(w3);
            accessibilityNodeInfo.setTraversalAfter(w3);
        } else {
            accessibilityNodeInfo.setTraversalAfter(zVar.f914d);
        }
        if (!isEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setText(charSequence);
            if (!z3 && placeholderText != null) {
                accessibilityNodeInfo.setText(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setHintText(charSequence);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z4) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        W w4 = textInputLayout.f5849j.f895y;
        if (w4 != null) {
            accessibilityNodeInfo.setLabelFor(w4);
        }
        textInputLayout.f5837c.b().n(kVar);
    }

    @Override // O.C0056b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f797d.f5837c.b().o(accessibilityEvent);
    }
}
