package dagger.hilt.android.migration;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.view.View;
import androidx.fragment.app.K;
import b.o;
import dagger.hilt.android.internal.migration.InjectedByHilt;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes3.dex */
public final class OptionalInjectCheck {
    private OptionalInjectCheck() {
    }

    private static boolean check(Object obj) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkArgument(obj instanceof InjectedByHilt, "'%s' is not an optionally injected android entry point. Check that you have annotated the class with both @AndroidEntryPoint and @OptionalInject.", obj.getClass());
        return ((InjectedByHilt) obj).wasInjectedByHilt();
    }

    public static boolean wasInjectedByHilt(o oVar) {
        return check(oVar);
    }

    public static boolean wasInjectedByHilt(BroadcastReceiver broadcastReceiver) {
        return check(broadcastReceiver);
    }

    public static boolean wasInjectedByHilt(K k4) {
        return check(k4);
    }

    public static boolean wasInjectedByHilt(Service service) {
        return check(service);
    }

    public static boolean wasInjectedByHilt(View view) {
        return check(view);
    }
}
