package l3;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.C0579k;
import r3.I;
import r3.InterfaceC0578j;
import r3.K;

/* loaded from: classes3.dex */
public final class t implements I {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0578j f7458a;

    /* renamed from: b, reason: collision with root package name */
    public int f7459b;

    /* renamed from: c, reason: collision with root package name */
    public int f7460c;

    /* renamed from: d, reason: collision with root package name */
    public int f7461d;

    /* renamed from: e, reason: collision with root package name */
    public int f7462e;

    /* renamed from: f, reason: collision with root package name */
    public int f7463f;

    public t(InterfaceC0578j source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7458a = source;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // r3.I
    public final long read(C0576h sink, long j4) {
        int i;
        int readInt;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            int i4 = this.f7462e;
            InterfaceC0578j interfaceC0578j = this.f7458a;
            if (i4 == 0) {
                interfaceC0578j.l(this.f7463f);
                this.f7463f = 0;
                if ((this.f7460c & 4) == 0) {
                    i = this.f7461d;
                    int s4 = f3.c.s(interfaceC0578j);
                    this.f7462e = s4;
                    this.f7459b = s4;
                    int readByte = interfaceC0578j.readByte() & UByte.MAX_VALUE;
                    this.f7460c = interfaceC0578j.readByte() & UByte.MAX_VALUE;
                    Logger logger = u.f7464d;
                    if (logger.isLoggable(Level.FINE)) {
                        C0579k c0579k = g.f7403a;
                        logger.fine(g.a(true, this.f7461d, this.f7459b, readByte, this.f7460c));
                    }
                    readInt = interfaceC0578j.readInt() & Integer.MAX_VALUE;
                    this.f7461d = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long read = interfaceC0578j.read(sink, Math.min(j4, i4));
                if (read != -1) {
                    this.f7462e -= (int) read;
                    return read;
                }
            }
            return -1L;
        } while (readInt == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // r3.I
    public final K timeout() {
        return this.f7458a.timeout();
    }
}
