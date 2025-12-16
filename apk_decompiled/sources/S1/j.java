package S1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class j extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f1546a;

    public j(o oVar) {
        this.f1546a = oVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f4) {
        this.f1546a.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        o oVar = this.f1546a;
        View.OnLongClickListener onLongClickListener = oVar.f1572q;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(oVar.h);
        }
    }
}
