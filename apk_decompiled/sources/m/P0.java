package m;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import kotlin.time.DurationKt;

/* loaded from: classes.dex */
public abstract class P0 {
    public static OnBackInvokedDispatcher a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new b.u(runnable, 2);
    }

    public static void c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, (OnBackInvokedCallback) obj2);
    }

    public static void d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
