package u2;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC0634a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f8623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8625c;

    public ViewOnTouchListenerC0634a(Dialog dialog, Rect rect) {
        this.f8623a = dialog;
        this.f8624b = rect.left;
        this.f8625c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f8624b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f8625c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        view.performClick();
        return this.f8623a.onTouchEvent(obtain);
    }
}
