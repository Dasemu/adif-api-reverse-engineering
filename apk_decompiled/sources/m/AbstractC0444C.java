package m;

import O.C0060d;
import O.InterfaceC0058c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: m.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0444C {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0058c interfaceC0058c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0058c = new A.a(clipData, 3);
            } else {
                C0060d c0060d = new C0060d();
                c0060d.f1236b = clipData;
                c0060d.f1237c = 3;
                interfaceC0058c = c0060d;
            }
            O.X.g(textView, interfaceC0058c.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0058c interfaceC0058c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0058c = new A.a(clipData, 3);
        } else {
            C0060d c0060d = new C0060d();
            c0060d.f1236b = clipData;
            c0060d.f1237c = 3;
            interfaceC0058c = c0060d;
        }
        O.X.g(view, interfaceC0058c.build());
        return true;
    }
}
