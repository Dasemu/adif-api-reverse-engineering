package r3;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class B implements InterfaceC0577i {

    /* renamed from: a, reason: collision with root package name */
    public final G f8242a;

    /* renamed from: b, reason: collision with root package name */
    public final C0576h f8243b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8244c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, r3.h] */
    public B(G sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f8242a = sink;
        this.f8243b = new Object();
    }

    @Override // r3.InterfaceC0577i
    public final long D(I source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j4 = 0;
        while (true) {
            long read = ((C0572d) source).read(this.f8243b, 8192L);
            if (read == -1) {
                return j4;
            }
            j4 += read;
            d();
        }
    }

    @Override // r3.InterfaceC0577i
    public final InterfaceC0577i E(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        C0576h c0576h = this.f8243b;
        Intrinsics.checkNotNullParameter(source, "source");
        c0576h.i0(source, 0, source.length);
        d();
        return this;
    }

    @Override // r3.InterfaceC0577i
    public final InterfaceC0577i F(C0579k byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        this.f8243b.h0(byteString);
        d();
        return this;
    }

    @Override // r3.InterfaceC0577i
    public final InterfaceC0577i L(int i, int i4, byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        this.f8243b.i0(source, i, i4);
        d();
        return this;
    }

    @Override // r3.InterfaceC0577i
    public final InterfaceC0577i Q(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        this.f8243b.o0(string);
        d();
        return this;
    }

    @Override // r3.InterfaceC0577i
    public final InterfaceC0577i R(long j4) {
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        this.f8243b.k0(j4);
        d();
        return this;
    }

    @Override // r3.InterfaceC0577i
    public final C0576h a() {
        return this.f8243b;
    }

    @Override // r3.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        G g4 = this.f8242a;
        if (this.f8244c) {
            return;
        }
        try {
            C0576h c0576h = this.f8243b;
            long j4 = c0576h.f8284b;
            if (j4 > 0) {
                g4.z(c0576h, j4);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            g4.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f8244c = true;
        if (th != null) {
            throw th;
        }
    }

    public final InterfaceC0577i d() {
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        C0576h c0576h = this.f8243b;
        long e4 = c0576h.e();
        if (e4 > 0) {
            this.f8242a.z(c0576h, e4);
        }
        return this;
    }

    @Override // r3.InterfaceC0577i
    public final InterfaceC0577i f(String string, int i, int i4) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        this.f8243b.p0(string, i, i4);
        d();
        return this;
    }

    @Override // r3.InterfaceC0577i, r3.G, java.io.Flushable
    public final void flush() {
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        C0576h c0576h = this.f8243b;
        long j4 = c0576h.f8284b;
        G g4 = this.f8242a;
        if (j4 > 0) {
            g4.z(c0576h, j4);
        }
        g4.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f8244c;
    }

    @Override // r3.InterfaceC0577i
    public final InterfaceC0577i m(int i) {
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        this.f8243b.n0(i);
        d();
        return this;
    }

    @Override // r3.InterfaceC0577i
    public final InterfaceC0577i r(int i) {
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        this.f8243b.m0(i);
        d();
        return this;
    }

    @Override // r3.G
    public final K timeout() {
        return this.f8242a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f8242a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f8243b.write(source);
        d();
        return write;
    }

    @Override // r3.InterfaceC0577i
    public final InterfaceC0577i y(int i) {
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        this.f8243b.j0(i);
        d();
        return this;
    }

    @Override // r3.G
    public final void z(C0576h source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f8244c) {
            throw new IllegalStateException("closed");
        }
        this.f8243b.z(source, j4);
        d();
    }
}
