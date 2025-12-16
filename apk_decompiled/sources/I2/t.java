package I2;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* loaded from: classes3.dex */
public final class t extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f871a;

    public t(u uVar) {
        this.f871a = uVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f871a.h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
