package r3;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r3.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0575g extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0578j f8282b;

    public /* synthetic */ C0575g(InterfaceC0578j interfaceC0578j, int i) {
        this.f8281a = i;
        this.f8282b = interfaceC0578j;
    }

    private final void d() {
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f8281a) {
            case 0:
                return (int) Math.min(((C0576h) this.f8282b).f8284b, Integer.MAX_VALUE);
            default:
                C c4 = (C) this.f8282b;
                if (c4.f8247c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c4.f8246b.f8284b, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f8281a) {
            case 0:
                return;
            default:
                ((C) this.f8282b).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f8281a) {
            case 0:
                C0576h c0576h = (C0576h) this.f8282b;
                if (c0576h.f8284b > 0) {
                    return c0576h.readByte() & UByte.MAX_VALUE;
                }
                return -1;
            default:
                C c4 = (C) this.f8282b;
                if (!c4.f8247c) {
                    C0576h c0576h2 = c4.f8246b;
                    if (c0576h2.f8284b == 0 && c4.f8245a.read(c0576h2, 8192L) == -1) {
                        return -1;
                    }
                    return c0576h2.readByte() & UByte.MAX_VALUE;
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        switch (this.f8281a) {
            case 0:
                return ((C0576h) this.f8282b) + ".inputStream()";
            default:
                return ((C) this.f8282b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i, int i4) {
        switch (this.f8281a) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                return ((C0576h) this.f8282b).a0(sink, i, i4);
            default:
                Intrinsics.checkNotNullParameter(sink, "data");
                C c4 = (C) this.f8282b;
                if (!c4.f8247c) {
                    m3.d.j(sink.length, i, i4);
                    C0576h c0576h = c4.f8246b;
                    if (c0576h.f8284b == 0 && c4.f8245a.read(c0576h, 8192L) == -1) {
                        return -1;
                    }
                    return c0576h.a0(sink, i, i4);
                }
                throw new IOException("closed");
        }
    }
}
