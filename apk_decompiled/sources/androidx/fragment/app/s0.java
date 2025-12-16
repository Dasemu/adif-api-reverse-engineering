package androidx.fragment.app;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s0 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f3235a;

    public s0(View view) {
        this.f3235a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f3235a;
        view2.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = O.X.f1226a;
        O.J.c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
