package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import kotlin.time.DurationKt;

/* loaded from: classes.dex */
public abstract class x {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E) {
        Objects.requireNonNull(layoutInflaterFactory2C0351E);
        b.u uVar = new b.u(layoutInflaterFactory2C0351E, 1);
        P.e.f(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, uVar);
        return uVar;
    }

    public static void c(Object obj, Object obj2) {
        P.e.f(obj).unregisterOnBackInvokedCallback(P.e.b(obj2));
    }
}
