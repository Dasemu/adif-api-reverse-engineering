package m;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: m.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0494w0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0496x0 f7755a;

    public ViewOnTouchListenerC0494w0(C0496x0 c0496x0) {
        this.f7755a = c0496x0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0497y c0497y;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        C0496x0 c0496x0 = this.f7755a;
        if (action == 0 && (c0497y = c0496x0.f7782z) != null && c0497y.isShowing() && x3 >= 0 && x3 < c0496x0.f7782z.getWidth() && y3 >= 0 && y3 < c0496x0.f7782z.getHeight()) {
            c0496x0.f7778v.postDelayed(c0496x0.f7774r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c0496x0.f7778v.removeCallbacks(c0496x0.f7774r);
        return false;
    }
}
