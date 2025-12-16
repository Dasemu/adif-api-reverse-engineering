package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F extends AbstractC0197s {
    @Override // androidx.lifecycle.AbstractC0197s, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = k0.f3396a;
        i0.b(activity);
    }
}
