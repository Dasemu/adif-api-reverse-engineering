package S1;

import android.view.ScaleGestureDetector;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class a implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f1537a;

    public a(b bVar) {
        this.f1537a = bVar;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        if (scaleFactor < BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        this.f1537a.f1545j.t(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
