package androidx.lifecycle;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import v0.C0639d;

/* loaded from: classes.dex */
public final class o0 implements H, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f3412a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f3413b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3414c;

    public o0(String key, n0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f3412a = key;
        this.f3413b = handle;
    }

    public final void Y(C0639d registry, C lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f3414c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3414c = true;
        lifecycle.a(this);
        registry.c(this.f3412a, this.f3413b.f3408e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.H
    public final void onStateChanged(J source, A event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == A.ON_DESTROY) {
            this.f3414c = false;
            source.getLifecycle().c(this);
        }
    }
}
