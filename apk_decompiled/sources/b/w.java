package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f4141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f4142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f4143c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f4144d;

    public w(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
        this.f4141a = function1;
        this.f4142b = function12;
        this.f4143c = function0;
        this.f4144d = function02;
    }

    public final void onBackCancelled() {
        this.f4144d.invoke();
    }

    public final void onBackInvoked() {
        this.f4143c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f4142b.invoke(new C0253b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f4141a.invoke(new C0253b(backEvent));
    }
}
