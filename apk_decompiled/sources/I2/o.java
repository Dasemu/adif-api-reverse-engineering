package I2;

import O.X;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import l.ViewOnKeyListenerC0421D;
import l.ViewOnKeyListenerC0429g;

/* loaded from: classes3.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f838b;

    public /* synthetic */ o(Object obj, int i) {
        this.f837a = i;
        this.f838b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f837a) {
            case 0:
                q qVar = (q) this.f838b;
                if (qVar.f860u == null || (accessibilityManager = qVar.f859t) == null) {
                    return;
                }
                WeakHashMap weakHashMap = X.f1226a;
                if (qVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(new P.b(qVar.f860u));
                    return;
                }
                return;
            case 1:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f837a) {
            case 0:
                q qVar = (q) this.f838b;
                k kVar = qVar.f860u;
                if (kVar == null || (accessibilityManager = qVar.f859t) == null) {
                    return;
                }
                accessibilityManager.removeTouchExplorationStateChangeListener(new P.b(kVar));
                return;
            case 1:
                ViewOnKeyListenerC0429g viewOnKeyListenerC0429g = (ViewOnKeyListenerC0429g) this.f838b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0429g.f7223x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0429g.f7223x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0429g.f7223x.removeGlobalOnLayoutListener(viewOnKeyListenerC0429g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ViewOnKeyListenerC0421D viewOnKeyListenerC0421D = (ViewOnKeyListenerC0421D) this.f838b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0421D.f7173o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0421D.f7173o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0421D.f7173o.removeGlobalOnLayoutListener(viewOnKeyListenerC0421D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
