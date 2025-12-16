package B0;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* loaded from: classes.dex */
public abstract class s {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j4) {
        ((AnimatorSet) animator).setCurrentPlayTime(j4);
    }
}
