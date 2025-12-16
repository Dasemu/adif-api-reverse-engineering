package m0;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501a implements AutoCloseable, CoroutineScope {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f7787a;

    public C0501a(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f7787a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        JobKt__JobKt.cancel$default(this.f7787a, (CancellationException) null, 1, (Object) null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f7787a;
    }
}
