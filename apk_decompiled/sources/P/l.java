package P;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final A.a f1343a;

    public l(A.a aVar) {
        this.f1343a = aVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f1343a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        k m4 = this.f1343a.m(i);
        if (m4 == null) {
            return null;
        }
        return m4.f1341a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f1343a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        k o4 = this.f1343a.o(i);
        if (o4 == null) {
            return null;
        }
        return o4.f1341a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i4, Bundle bundle) {
        return this.f1343a.v(i, i4, bundle);
    }
}
