package r3;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: r3.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0574f implements G {
    @Override // r3.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // r3.G, java.io.Flushable
    public final void flush() {
    }

    @Override // r3.G
    public final K timeout() {
        return K.f8261d;
    }

    @Override // r3.G
    public final void z(C0576h source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.l(j4);
    }
}
