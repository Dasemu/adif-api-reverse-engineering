package f0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340d extends d0.f {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f6451a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f6452b;

    public C0340d(TextView textView, C0341e c0341e) {
        this.f6451a = new WeakReference(textView);
        this.f6452b = new WeakReference(c0341e);
    }

    @Override // d0.f
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f6451a.get();
        InputFilter inputFilter = (InputFilter) this.f6452b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    d0.h a2 = d0.h.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a2.getClass();
                        length = text.length();
                    }
                    CharSequence e4 = a2.e(text, 0, length);
                    if (text == e4) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e4);
                    int selectionEnd = Selection.getSelectionEnd(e4);
                    textView.setText(e4);
                    if (e4 instanceof Spannable) {
                        Spannable spannable = (Spannable) e4;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
