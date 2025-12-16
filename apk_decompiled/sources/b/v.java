package b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f4140a = new Object();

    public final OnBackInvokedCallback a(Function0<Unit> onBackInvoked) {
        Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        return new u(onBackInvoked, 0);
    }

    public final void b(Object dispatcher, int i, Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) callback);
    }

    public final void c(Object dispatcher, Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
