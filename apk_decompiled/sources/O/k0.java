package O;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class k0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f1257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D0 f1258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D0 f1259c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f1261e;

    public k0(r0 r0Var, D0 d02, D0 d03, int i, View view) {
        this.f1257a = r0Var;
        this.f1258b = d02;
        this.f1259c = d03;
        this.f1260d = i;
        this.f1261e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        int i;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        r0 r0Var = this.f1257a;
        r0Var.f1292a.d(animatedFraction);
        float b4 = r0Var.f1292a.b();
        PathInterpolator pathInterpolator = m0.f1270e;
        int i4 = Build.VERSION.SDK_INT;
        D0 d02 = this.f1258b;
        v0 u0Var = i4 >= 30 ? new u0(d02) : new t0(d02);
        int i5 = 1;
        while (i5 <= 256) {
            int i6 = this.f1260d & i5;
            B0 b02 = d02.f1207a;
            if (i6 == 0) {
                u0Var.c(i5, b02.f(i5));
                f2 = b4;
                i = 1;
            } else {
                G.c f4 = b02.f(i5);
                G.c f5 = this.f1259c.f1207a.f(i5);
                float f6 = 1.0f - b4;
                int i7 = (int) (((f4.f558a - f5.f558a) * f6) + 0.5d);
                int i8 = (int) (((f4.f559b - f5.f559b) * f6) + 0.5d);
                f2 = b4;
                i = 1;
                int i9 = (int) (((f4.f560c - f5.f560c) * f6) + 0.5d);
                int i10 = (int) (((f4.f561d - f5.f561d) * f6) + 0.5d);
                int max = Math.max(0, f4.f558a - i7);
                int max2 = Math.max(0, f4.f559b - i8);
                int max3 = Math.max(0, f4.f560c - i9);
                int max4 = Math.max(0, f4.f561d - i10);
                if (max != i7 || max2 != i8 || max3 != i9 || max4 != i10) {
                    f4 = G.c.b(max, max2, max3, max4);
                }
                u0Var.c(i5, f4);
            }
            i5 <<= i;
            b4 = f2;
        }
        m0.g(this.f1261e, u0Var.b(), Collections.singletonList(r0Var));
    }
}
