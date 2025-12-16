package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f5910a;

    public b(ClockFaceView clockFaceView) {
        this.f5910a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f5910a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f5884d.f5899d) - clockFaceView.f5890l;
        if (height != clockFaceView.f5913b) {
            clockFaceView.f5913b = height;
            clockFaceView.i();
            int i = clockFaceView.f5913b;
            ClockHandView clockHandView = clockFaceView.f5884d;
            clockHandView.f5905l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
