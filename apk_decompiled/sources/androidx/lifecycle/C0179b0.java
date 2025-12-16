package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179b0 extends AbstractC0197s {
    final /* synthetic */ C0181c0 this$0;

    /* renamed from: androidx.lifecycle.b0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC0197s {
        final /* synthetic */ C0181c0 this$0;

        public a(C0181c0 c0181c0) {
            this.this$0 = c0181c0;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C0181c0 c0181c0 = this.this$0;
            int i = c0181c0.f3338b + 1;
            c0181c0.f3338b = i;
            if (i == 1) {
                if (c0181c0.f3339c) {
                    c0181c0.f3342f.f(A.ON_RESUME);
                    c0181c0.f3339c = false;
                } else {
                    Handler handler = c0181c0.f3341e;
                    Intrinsics.checkNotNull(handler);
                    handler.removeCallbacks(c0181c0.f3343g);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C0181c0 c0181c0 = this.this$0;
            int i = c0181c0.f3337a + 1;
            c0181c0.f3337a = i;
            if (i == 1 && c0181c0.f3340d) {
                c0181c0.f3342f.f(A.ON_START);
                c0181c0.f3340d = false;
            }
        }
    }

    public C0179b0(C0181c0 c0181c0) {
        this.this$0 = c0181c0;
    }

    @Override // androidx.lifecycle.AbstractC0197s, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // androidx.lifecycle.AbstractC0197s, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C0181c0 c0181c0 = this.this$0;
        int i = c0181c0.f3338b - 1;
        c0181c0.f3338b = i;
        if (i == 0) {
            Handler handler = c0181c0.f3341e;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(c0181c0.f3343g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AbstractC0177a0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0197s, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C0181c0 c0181c0 = this.this$0;
        int i = c0181c0.f3337a - 1;
        c0181c0.f3337a = i;
        if (i == 0 && c0181c0.f3339c) {
            c0181c0.f3342f.f(A.ON_STOP);
            c0181c0.f3340d = true;
        }
    }
}
