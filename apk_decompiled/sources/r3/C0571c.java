package r3;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r3.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0571c implements G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f8270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f8271b;

    public C0571c(H h, y yVar) {
        this.f8270a = h;
        this.f8271b = yVar;
    }

    @Override // r3.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y yVar = this.f8271b;
        H h = this.f8270a;
        h.h();
        try {
            yVar.close();
            Unit unit = Unit.INSTANCE;
            if (h.i()) {
                throw h.k(null);
            }
        } catch (IOException e4) {
            if (!h.i()) {
                throw e4;
            }
            throw h.k(e4);
        } finally {
            h.i();
        }
    }

    @Override // r3.G, java.io.Flushable
    public final void flush() {
        y yVar = this.f8271b;
        H h = this.f8270a;
        h.h();
        try {
            yVar.flush();
            Unit unit = Unit.INSTANCE;
            if (h.i()) {
                throw h.k(null);
            }
        } catch (IOException e4) {
            if (!h.i()) {
                throw e4;
            }
            throw h.k(e4);
        } finally {
            h.i();
        }
    }

    @Override // r3.G
    public final K timeout() {
        return this.f8270a;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f8271b + ')';
    }

    @Override // r3.G
    public final void z(C0576h source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        m3.d.j(source.f8284b, 0L, j4);
        while (true) {
            long j5 = 0;
            if (j4 <= 0) {
                return;
            }
            D d4 = source.f8283a;
            Intrinsics.checkNotNull(d4);
            while (true) {
                if (j5 >= 65536) {
                    break;
                }
                j5 += d4.f8250c - d4.f8249b;
                if (j5 >= j4) {
                    j5 = j4;
                    break;
                } else {
                    d4 = d4.f8253f;
                    Intrinsics.checkNotNull(d4);
                }
            }
            y yVar = this.f8271b;
            H h = this.f8270a;
            h.h();
            try {
                try {
                    yVar.z(source, j5);
                    Unit unit = Unit.INSTANCE;
                    if (h.i()) {
                        throw h.k(null);
                    }
                    j4 -= j5;
                } catch (IOException e4) {
                    if (!h.i()) {
                        throw e4;
                    }
                    throw h.k(e4);
                }
            } catch (Throwable th) {
                h.i();
                throw th;
            }
        }
    }
}
