package com.adif.elcanomovil.uiHome;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J*\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/uiHome/SwipeGestureDetector;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "()V", "onViewPagerSwipe", "Lcom/adif/elcanomovil/uiHome/OnViewPagerSwipe;", "getSlope", "", "x1", "", "y1", "x2", "y2", "onFling", "", "e1", "Landroid/view/MotionEvent;", "e2", "velocityX", "velocityY", "onSingleTapUp", "e", "setViewPagerSwipeListener", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwipeGestureDetector extends GestureDetector.SimpleOnGestureListener {
    private OnViewPagerSwipe onViewPagerSwipe;

    private final int getSlope(float x12, float y12, float x22, float y22) {
        double degrees = Math.toDegrees(Math.atan2(y12 - y22, x22 - x12));
        if (degrees > 35.0d && degrees <= 160.0d) {
            return 1;
        }
        if (degrees > 160.0d && degrees <= 180.0d) {
            return 2;
        }
        if (degrees < -160.0d && degrees > -180.0d) {
            return 2;
        }
        if (degrees >= -35.0d || degrees < -160.0d) {
            return (degrees <= -35.0d || degrees > 35.0d) ? 0 : 4;
        }
        return 3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent e1, MotionEvent e22, float velocityX, float velocityY) {
        Intrinsics.checkNotNullParameter(e22, "e2");
        if (e1 == null) {
            return false;
        }
        int slope = getSlope(e1.getX(), e1.getY(), e22.getX(), e22.getY());
        Gestures gestures = Gestures.SWIPE_TOP;
        if (slope == gestures.getValue()) {
            OnViewPagerSwipe onViewPagerSwipe = this.onViewPagerSwipe;
            if (onViewPagerSwipe != null) {
                onViewPagerSwipe.onViewPagerSwipe(gestures);
            }
            return true;
        }
        Gestures gestures2 = Gestures.SWIPE_DOWN;
        if (slope == gestures2.getValue()) {
            OnViewPagerSwipe onViewPagerSwipe2 = this.onViewPagerSwipe;
            if (onViewPagerSwipe2 != null) {
                onViewPagerSwipe2.onViewPagerSwipe(gestures2);
            }
            return true;
        }
        Gestures gestures3 = Gestures.SWIPE_LEFT;
        if (slope == gestures3.getValue()) {
            OnViewPagerSwipe onViewPagerSwipe3 = this.onViewPagerSwipe;
            if (onViewPagerSwipe3 != null) {
                onViewPagerSwipe3.onViewPagerSwipe(gestures3);
            }
            return true;
        }
        Gestures gestures4 = Gestures.SWIPE_RIGHT;
        if (slope != gestures4.getValue()) {
            return false;
        }
        OnViewPagerSwipe onViewPagerSwipe4 = this.onViewPagerSwipe;
        if (onViewPagerSwipe4 != null) {
            onViewPagerSwipe4.onViewPagerSwipe(gestures4);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        return true;
    }

    public final void setViewPagerSwipeListener(OnViewPagerSwipe onViewPagerSwipe) {
        this.onViewPagerSwipe = onViewPagerSwipe;
    }
}
