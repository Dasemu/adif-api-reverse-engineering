package P;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f1340a;

    public j(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f1340a = collectionItemInfo;
    }

    public static j a(boolean z3, int i, int i4, int i5, int i6) {
        return new j(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i4, i5, i6, false, z3));
    }
}
