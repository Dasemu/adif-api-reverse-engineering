package b;

import android.window.OnBackInvokedCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f4145a = new Object();

    public final OnBackInvokedCallback a(Function1<? super C0253b, Unit> onBackStarted, Function1<? super C0253b, Unit> onBackProgressed, Function0<Unit> onBackInvoked, Function0<Unit> onBackCancelled) {
        Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
        Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
        Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
        return new w(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
