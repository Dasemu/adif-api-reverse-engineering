package O;

import android.view.VelocityTracker;

/* loaded from: classes.dex */
public abstract class C {
    public static float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static float b(VelocityTracker velocityTracker, int i, int i4) {
        return velocityTracker.getAxisVelocity(i, i4);
    }

    public static boolean c(VelocityTracker velocityTracker, int i) {
        return velocityTracker.isAxisSupported(i);
    }
}
