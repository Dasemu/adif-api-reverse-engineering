package m;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: m.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0488t0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z3) {
        popupWindow.setIsClippedToScreen(z3);
    }
}
