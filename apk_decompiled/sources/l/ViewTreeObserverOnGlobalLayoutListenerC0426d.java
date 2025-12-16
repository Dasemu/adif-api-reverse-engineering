package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import m.C0;
import m.K;
import m.N;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0426d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7196b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0426d(Object obj, int i) {
        this.f7195a = i;
        this.f7196b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f7195a) {
            case 0:
                ViewOnKeyListenerC0429g viewOnKeyListenerC0429g = (ViewOnKeyListenerC0429g) this.f7196b;
                if (viewOnKeyListenerC0429g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0429g.h;
                    if (arrayList.size() <= 0 || ((C0428f) arrayList.get(0)).f7201a.f7781y) {
                        return;
                    }
                    View view = viewOnKeyListenerC0429g.f7215o;
                    if (view == null || !view.isShown()) {
                        viewOnKeyListenerC0429g.dismiss();
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C0428f) it.next()).f7201a.c();
                    }
                    return;
                }
                return;
            case 1:
                ViewOnKeyListenerC0421D viewOnKeyListenerC0421D = (ViewOnKeyListenerC0421D) this.f7196b;
                if (viewOnKeyListenerC0421D.a()) {
                    C0 c02 = viewOnKeyListenerC0421D.h;
                    if (c02.f7781y) {
                        return;
                    }
                    View view2 = viewOnKeyListenerC0421D.f7171m;
                    if (view2 == null || !view2.isShown()) {
                        viewOnKeyListenerC0421D.dismiss();
                        return;
                    } else {
                        c02.c();
                        return;
                    }
                }
                return;
            case 2:
                N n4 = (N) this.f7196b;
                if (!n4.getInternalPopup().a()) {
                    n4.f7595f.l(n4.getTextDirection(), n4.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = n4.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                K k4 = (K) this.f7196b;
                N n5 = k4.f7580E;
                k4.getClass();
                if (!n5.isAttachedToWindow() || !n5.getGlobalVisibleRect(k4.f7578C)) {
                    k4.dismiss();
                    return;
                } else {
                    k4.s();
                    k4.c();
                    return;
                }
        }
    }
}
