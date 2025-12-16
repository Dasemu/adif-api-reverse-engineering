package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.BaseInterpolator;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3491a;

    /* renamed from: b, reason: collision with root package name */
    public int f3492b;

    /* renamed from: c, reason: collision with root package name */
    public int f3493c;

    /* renamed from: d, reason: collision with root package name */
    public int f3494d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f3495e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3496f;

    /* renamed from: g, reason: collision with root package name */
    public int f3497g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f3494d;
        if (i >= 0) {
            this.f3494d = -1;
            recyclerView.S(i);
            this.f3496f = false;
            return;
        }
        if (!this.f3496f) {
            this.f3497g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f3495e;
        if (baseInterpolator != null && this.f3493c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i4 = this.f3493c;
        if (i4 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f3681e0.c(this.f3491a, this.f3492b, i4, baseInterpolator);
        int i5 = this.f3497g + 1;
        this.f3497g = i5;
        if (i5 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f3496f = false;
    }
}
