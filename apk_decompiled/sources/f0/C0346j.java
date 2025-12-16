package f0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346j implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f6463a;

    /* renamed from: b, reason: collision with root package name */
    public C0345i f6464b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6465c = true;

    public C0346j(EditText editText) {
        this.f6463a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            d0.h a2 = d0.h.a();
            if (editableText == null) {
                length = 0;
            } else {
                a2.getClass();
                length = editableText.length();
            }
            a2.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        EditText editText = this.f6463a;
        if (editText.isInEditMode() || !this.f6465c || d0.h.f6123k == null || i4 > i5 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b4 = d0.h.a().b();
        if (b4 != 0) {
            if (b4 == 1) {
                d0.h.a().e((Spannable) charSequence, i, i5 + i);
                return;
            } else if (b4 != 3) {
                return;
            }
        }
        d0.h a2 = d0.h.a();
        if (this.f6464b == null) {
            this.f6464b = new C0345i(editText);
        }
        a2.f(this.f6464b);
    }
}
