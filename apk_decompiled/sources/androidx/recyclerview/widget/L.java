package androidx.recyclerview.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class L extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3560a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f3561b;

    public L(N n4) {
        this.f3561b = n4;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        N n4;
        View g4;
        I0 M3;
        if (this.f3560a && (g4 = (n4 = this.f3561b).g(motionEvent)) != null && (M3 = n4.f3601r.M(g4)) != null && n4.f3597m.hasDragFlag(n4.f3601r, M3)) {
            int pointerId = motionEvent.getPointerId(0);
            int i = n4.f3596l;
            if (pointerId == i) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x3 = motionEvent.getX(findPointerIndex);
                float y3 = motionEvent.getY(findPointerIndex);
                n4.f3590d = x3;
                n4.f3591e = y3;
                n4.i = BitmapDescriptorFactory.HUE_RED;
                n4.h = BitmapDescriptorFactory.HUE_RED;
                if (n4.f3597m.isLongPressDragEnabled()) {
                    n4.l(M3, 2);
                }
            }
        }
    }
}
