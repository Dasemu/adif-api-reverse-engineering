package r3;

import a.AbstractC0105a;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r3.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0572d implements I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8272a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8273b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8274c;

    public C0572d(InputStream input, K timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f8273b = input;
        this.f8274c = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj = this.f8273b;
        switch (this.f8272a) {
            case 0:
                C0572d c0572d = (C0572d) this.f8274c;
                H h = (H) obj;
                h.h();
                try {
                    c0572d.close();
                    Unit unit = Unit.INSTANCE;
                    if (h.i()) {
                        throw h.k(null);
                    }
                    return;
                } catch (IOException e4) {
                    if (!h.i()) {
                        throw e4;
                    }
                    throw h.k(e4);
                } finally {
                    h.i();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // r3.I
    public final long read(C0576h sink, long j4) {
        switch (this.f8272a) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                C0572d c0572d = (C0572d) this.f8274c;
                H h = (H) this.f8273b;
                h.h();
                try {
                    long read = c0572d.read(sink, j4);
                    if (h.i()) {
                        throw h.k(null);
                    }
                    return read;
                } catch (IOException e4) {
                    if (h.i()) {
                        throw h.k(e4);
                    }
                    throw e4;
                } finally {
                    h.i();
                }
            default:
                Intrinsics.checkNotNullParameter(sink, "sink");
                if (j4 == 0) {
                    return 0L;
                }
                if (j4 < 0) {
                    throw new IllegalArgumentException(C.w.l("byteCount < 0: ", j4).toString());
                }
                try {
                    ((K) this.f8274c).f();
                    D g02 = sink.g0(1);
                    int read2 = ((InputStream) this.f8273b).read(g02.f8248a, g02.f8250c, (int) Math.min(j4, 8192 - g02.f8250c));
                    if (read2 == -1) {
                        if (g02.f8249b == g02.f8250c) {
                            sink.f8283a = g02.a();
                            E.a(g02);
                        }
                        return -1L;
                    }
                    g02.f8250c += read2;
                    long j5 = read2;
                    sink.f8284b += j5;
                    return j5;
                } catch (AssertionError e5) {
                    if (AbstractC0105a.E(e5)) {
                        throw new IOException(e5);
                    }
                    throw e5;
                }
        }
    }

    @Override // r3.I
    public final K timeout() {
        switch (this.f8272a) {
            case 0:
                return (H) this.f8273b;
            default:
                return (K) this.f8274c;
        }
    }

    public final String toString() {
        switch (this.f8272a) {
            case 0:
                return "AsyncTimeout.source(" + ((C0572d) this.f8274c) + ')';
            default:
                return "source(" + ((InputStream) this.f8273b) + ')';
        }
    }

    public C0572d(H h, C0572d c0572d) {
        this.f8273b = h;
        this.f8274c = c0572d;
    }
}
