package S1;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class k implements GestureDetector.OnDoubleTapListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f1547a;

    public k(o oVar) {
        this.f1547a = oVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        o oVar = this.f1547a;
        try {
            float d4 = oVar.d();
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float f2 = oVar.f1562d;
            if (d4 < f2) {
                oVar.e(f2, x3, y3, true);
            } else {
                if (d4 >= f2) {
                    float f4 = oVar.f1563e;
                    if (d4 < f4) {
                        oVar.e(f4, x3, y3, true);
                    }
                }
                oVar.e(oVar.f1561c, x3, y3, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF rectF;
        o oVar = this.f1547a;
        View.OnClickListener onClickListener = oVar.p;
        if (onClickListener != null) {
            onClickListener.onClick(oVar.h);
        }
        oVar.b();
        Matrix c4 = oVar.c();
        if (oVar.h.getDrawable() != null) {
            rectF = oVar.f1570n;
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, r1.getIntrinsicWidth(), r1.getIntrinsicHeight());
            c4.mapRect(rectF);
        } else {
            rectF = null;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (rectF == null || !rectF.contains(x3, y3)) {
            return false;
        }
        rectF.width();
        rectF.height();
        return true;
    }
}
