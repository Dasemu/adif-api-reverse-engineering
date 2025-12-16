package r3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class o implements G {

    /* renamed from: a, reason: collision with root package name */
    public final G f8300a;

    public o(G delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f8300a = delegate;
    }

    @Override // r3.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8300a.close();
    }

    @Override // r3.G, java.io.Flushable
    public void flush() {
        this.f8300a.flush();
    }

    @Override // r3.G
    public final K timeout() {
        return this.f8300a.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f8300a + ')';
    }

    @Override // r3.G
    public void z(C0576h source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f8300a.z(source, j4);
    }
}
