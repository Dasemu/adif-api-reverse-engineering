package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import l.ViewTreeObserverOnGlobalLayoutListenerC0426d;

/* loaded from: classes.dex */
public final class J implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0426d f7533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f7534b;

    public J(K k4, ViewTreeObserverOnGlobalLayoutListenerC0426d viewTreeObserverOnGlobalLayoutListenerC0426d) {
        this.f7534b = k4;
        this.f7533a = viewTreeObserverOnGlobalLayoutListenerC0426d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f7534b.f7580E.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f7533a);
        }
    }
}
