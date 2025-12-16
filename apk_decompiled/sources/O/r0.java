package O;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public q0 f1292a;

    public r0(int i, Interpolator interpolator, long j4) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1292a = new p0(n0.j(i, interpolator, j4));
        } else {
            this.f1292a = new q0(i, interpolator, j4);
        }
    }
}
