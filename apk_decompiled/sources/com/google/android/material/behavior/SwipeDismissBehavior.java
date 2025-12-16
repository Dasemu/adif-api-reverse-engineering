package com.google.android.material.behavior;

import A.b;
import G2.f;
import O.X;
import X.d;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;
import l2.C0437a;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public d f5530a;

    /* renamed from: b, reason: collision with root package name */
    public f f5531b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5532c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5533d;

    /* renamed from: e, reason: collision with root package name */
    public int f5534e = 2;

    /* renamed from: f, reason: collision with root package name */
    public float f5535f = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: g, reason: collision with root package name */
    public float f5536g = 0.5f;
    public final C0437a h = new C0437a(this);

    @Override // A.b
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z3 = this.f5532c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z3 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f5532c = z3;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5532c = false;
        }
        if (z3) {
            if (this.f5530a == null) {
                this.f5530a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.h);
            }
            if (!this.f5533d && this.f5530a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // A.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = X.f1226a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            X.h(view, 1048576);
            X.e(view, 0);
            if (v(view)) {
                X.i(view, P.f.f1333j, new h3.d(this, 4));
            }
        }
        return false;
    }

    @Override // A.b
    public final boolean u(View view, MotionEvent motionEvent) {
        if (this.f5530a == null) {
            return false;
        }
        if (this.f5533d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f5530a.j(motionEvent);
        return true;
    }

    public boolean v(View view) {
        return true;
    }
}
