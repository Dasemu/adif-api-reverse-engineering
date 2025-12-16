package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: androidx.recyclerview.widget.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210c0 extends X {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3797q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3798r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0210c0(Object obj, Context context, int i) {
        super(context);
        this.f3797q = i;
        this.f3798r = obj;
    }

    @Override // androidx.recyclerview.widget.X
    public int b(View view, int i) {
        switch (this.f3797q) {
            case 1:
                ((CarouselLayoutManager) this.f3798r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.X
    public int c(View view, int i) {
        switch (this.f3797q) {
            case 1:
                ((CarouselLayoutManager) this.f3798r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.X
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f3797q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.X
    public int e(int i) {
        switch (this.f3797q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // androidx.recyclerview.widget.X
    public PointF f(int i) {
        switch (this.f3797q) {
            case 1:
                ((CarouselLayoutManager) this.f3798r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // androidx.recyclerview.widget.X
    public void h(View view, C0 c02) {
        switch (this.f3797q) {
            case 0:
                C0212d0 c0212d0 = (C0212d0) this.f3798r;
                int[] b4 = c0212d0.b(c0212d0.f3802a.getLayoutManager(), view);
                int i = b4[0];
                int i4 = b4[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i4))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f3775j;
                    c02.f3491a = i;
                    c02.f3492b = i4;
                    c02.f3493c = ceil;
                    c02.f3495e = decelerateInterpolator;
                    c02.f3496f = true;
                    return;
                }
                return;
            default:
                super.h(view, c02);
                return;
        }
    }
}
