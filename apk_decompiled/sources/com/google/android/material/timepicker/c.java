package com.google.android.material.timepicker;

import O.C0056b;
import P.j;
import P.k;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.adif.elcanomovil.R;

/* loaded from: classes3.dex */
public final class c extends C0056b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f5911d;

    public c(ClockFaceView clockFaceView) {
        this.f5911d = clockFaceView;
    }

    @Override // O.C0056b
    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1232a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f1341a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f5911d.h.get(intValue - 1));
        }
        kVar.i(j.a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        kVar.b(P.f.f1330e);
    }

    @Override // O.C0056b
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f5911d;
        view.getHitRect(clockFaceView.f5885e);
        float centerX = clockFaceView.f5885e.centerX();
        float centerY = clockFaceView.f5885e.centerY();
        clockFaceView.f5884d.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f5884d.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
