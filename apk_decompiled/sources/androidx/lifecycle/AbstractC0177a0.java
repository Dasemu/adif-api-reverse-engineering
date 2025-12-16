package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0177a0 {
    @JvmStatic
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
