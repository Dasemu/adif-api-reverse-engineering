package androidx.fragment.app;

import android.animation.AnimatorSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157l {

    /* renamed from: a, reason: collision with root package name */
    public static final C0157l f3142a = new Object();

    public final void a(AnimatorSet animatorSet) {
        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j4) {
        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j4);
    }
}
