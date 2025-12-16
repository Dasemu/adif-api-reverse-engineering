package r3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends K {

    /* renamed from: e, reason: collision with root package name */
    public K f8301e;

    public q(K delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f8301e = delegate;
    }

    @Override // r3.K
    public final K a() {
        return this.f8301e.a();
    }

    @Override // r3.K
    public final K b() {
        return this.f8301e.b();
    }

    @Override // r3.K
    public final long c() {
        return this.f8301e.c();
    }

    @Override // r3.K
    public final K d(long j4) {
        return this.f8301e.d(j4);
    }

    @Override // r3.K
    public final boolean e() {
        return this.f8301e.e();
    }

    @Override // r3.K
    public final void f() {
        this.f8301e.f();
    }

    @Override // r3.K
    public final K g(long j4) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f8301e.g(j4);
    }
}
