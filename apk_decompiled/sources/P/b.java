package P;

import O.X;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final I2.k f1329a;

    public b(I2.k kVar) {
        this.f1329a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f1329a.equals(((b) obj).f1329a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1329a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        I2.l lVar = (I2.l) this.f1329a.f823b;
        AutoCompleteTextView autoCompleteTextView = lVar.h;
        if (autoCompleteTextView == null || m3.l.E(autoCompleteTextView)) {
            return;
        }
        int i = z3 ? 2 : 1;
        WeakHashMap weakHashMap = X.f1226a;
        lVar.f865d.setImportantForAccessibility(i);
    }
}
