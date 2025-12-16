package P;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class g {
    public static Object a(int i, float f2, float f4, float f5) {
        return new AccessibilityNodeInfo.RangeInfo(i, f2, f4, f5);
    }

    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
