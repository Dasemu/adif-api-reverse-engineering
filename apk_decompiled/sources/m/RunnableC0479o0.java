package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: m.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0479o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0481p0 f7716b;

    public /* synthetic */ RunnableC0479o0(AbstractViewOnTouchListenerC0481p0 abstractViewOnTouchListenerC0481p0, int i) {
        this.f7715a = i;
        this.f7716b = abstractViewOnTouchListenerC0481p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7715a) {
            case 0:
                ViewParent parent = this.f7716b.f7724d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                AbstractViewOnTouchListenerC0481p0 abstractViewOnTouchListenerC0481p0 = this.f7716b;
                abstractViewOnTouchListenerC0481p0.a();
                View view = abstractViewOnTouchListenerC0481p0.f7724d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0481p0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0481p0.f7727g = true;
                    return;
                }
                return;
        }
    }
}
