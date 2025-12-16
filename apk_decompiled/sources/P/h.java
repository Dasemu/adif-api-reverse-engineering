package P;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class h {
    public static j a(boolean z3, int i, int i4, int i5, int i6, boolean z4, String str, String str2) {
        return new j(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z3).setColumnIndex(i).setRowIndex(i4).setColumnSpan(i5).setRowSpan(i6).setSelected(z4).setRowTitle(str).setColumnTitle(str2).build());
    }

    public static k b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i4) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i, i4);
        if (child != null) {
            return new k(child, 0);
        }
        return null;
    }

    public static String c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static k f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i);
        if (parent != null) {
            return new k(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
        accessibilityNodeInfo.setTextSelectable(z3);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
