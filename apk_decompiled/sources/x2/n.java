package x2;

import O.J;
import O.X;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class n implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = X.f1226a;
        J.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
