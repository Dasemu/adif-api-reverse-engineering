package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import androidx.lifecycle.k0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, A event) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(event, "event");
        if (activity instanceof J) {
            C lifecycle = ((J) activity).getLifecycle();
            if (lifecycle instanceof L) {
                ((L) lifecycle).f(event);
            }
        }
    }

    public static void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        k0.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new k0.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
