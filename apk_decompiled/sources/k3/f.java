package k3;

import C.w;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;

/* loaded from: classes3.dex */
public final class f extends a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f7112d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7098b) {
            return;
        }
        if (!this.f7112d) {
            d();
        }
        this.f7098b = true;
    }

    @Override // k3.a, r3.I
    public final long read(C0576h sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(w.l("byteCount < 0: ", j4).toString());
        }
        if (this.f7098b) {
            throw new IllegalStateException("closed");
        }
        if (this.f7112d) {
            return -1L;
        }
        long read = super.read(sink, j4);
        if (read != -1) {
            return read;
        }
        this.f7112d = true;
        d();
        return -1L;
    }
}
