package r3;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y implements G {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f8319a;

    /* renamed from: b, reason: collision with root package name */
    public final K f8320b;

    public y(OutputStream out, K timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f8319a = out;
        this.f8320b = timeout;
    }

    @Override // r3.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8319a.close();
    }

    @Override // r3.G, java.io.Flushable
    public final void flush() {
        this.f8319a.flush();
    }

    @Override // r3.G
    public final K timeout() {
        return this.f8320b;
    }

    public final String toString() {
        return "sink(" + this.f8319a + ')';
    }

    @Override // r3.G
    public final void z(C0576h source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        m3.d.j(source.f8284b, 0L, j4);
        while (j4 > 0) {
            this.f8320b.f();
            D d4 = source.f8283a;
            Intrinsics.checkNotNull(d4);
            int min = (int) Math.min(j4, d4.f8250c - d4.f8249b);
            this.f8319a.write(d4.f8248a, d4.f8249b, min);
            int i = d4.f8249b + min;
            d4.f8249b = i;
            long j5 = min;
            j4 -= j5;
            source.f8284b -= j5;
            if (i == d4.f8250c) {
                source.f8283a = d4.a();
                E.a(d4);
            }
        }
    }
}
