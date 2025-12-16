package b;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0252a f4105a = new Object();

    public final BackEvent a(float f2, float f4, float f5, int i) {
        return new BackEvent(f2, f4, f5, i);
    }

    public final float b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
