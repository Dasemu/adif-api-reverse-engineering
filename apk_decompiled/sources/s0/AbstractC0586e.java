package s0;

import android.view.Choreographer;

/* renamed from: s0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0586e {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new kotlinx.coroutines.android.b(runnable, 1));
    }
}
