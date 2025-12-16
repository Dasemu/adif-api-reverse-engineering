package U;

import O.C0064f;
import O.InterfaceC0062e;
import O.InterfaceC0081w;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class w implements InterfaceC0081w {
    public final C0064f a(View view, C0064f c0064f) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0064f);
        }
        if (c0064f.f1244a.getSource() == 2) {
            return c0064f;
        }
        InterfaceC0062e interfaceC0062e = c0064f.f1244a;
        ClipData d4 = interfaceC0062e.d();
        int e4 = interfaceC0062e.e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z3 = false;
        for (int i = 0; i < d4.getItemCount(); i++) {
            ClipData.Item itemAt = d4.getItemAt(i);
            if ((e4 & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z3) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z3 = true;
                }
            }
        }
        return null;
    }
}
