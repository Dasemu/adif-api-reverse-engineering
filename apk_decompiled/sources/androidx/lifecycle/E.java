package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes.dex */
public final class E implements H, CoroutineScope {

    /* renamed from: a, reason: collision with root package name */
    public final C f3291a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f3292b;

    public E(C lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f3291a = lifecycle;
        this.f3292b = coroutineContext;
        if (lifecycle.b() == B.f3280a) {
            JobKt__JobKt.cancel$default(coroutineContext, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f3292b;
    }

    @Override // androidx.lifecycle.H
    public final void onStateChanged(J source, A event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        C c4 = this.f3291a;
        if (c4.b().compareTo(B.f3280a) <= 0) {
            c4.c(this);
            JobKt__JobKt.cancel$default(this.f3292b, (CancellationException) null, 1, (Object) null);
        }
    }
}
