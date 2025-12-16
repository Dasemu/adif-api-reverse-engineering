package androidx.fragment.app;

import android.animation.AnimatorSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155k {

    /* renamed from: a, reason: collision with root package name */
    public static final C0155k f3138a = new Object();

    public final long a(AnimatorSet animatorSet) {
        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
        return animatorSet.getTotalDuration();
    }
}
