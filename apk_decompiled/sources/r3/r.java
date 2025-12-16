package r3;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes3.dex */
public final class r implements I {

    /* renamed from: a, reason: collision with root package name */
    public byte f8302a;

    /* renamed from: b, reason: collision with root package name */
    public final C f8303b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f8304c;

    /* renamed from: d, reason: collision with root package name */
    public final s f8305d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f8306e;

    public r(I source) {
        Intrinsics.checkNotNullParameter(source, "source");
        C c4 = new C(source);
        this.f8303b = c4;
        Inflater inflater = new Inflater(true);
        this.f8304c = inflater;
        this.f8305d = new s(c4, inflater);
        this.f8306e = new CRC32();
    }

    public static void d(String str, int i, int i4) {
        if (i4 != i) {
            throw new IOException(C.w.s(new Object[]{str, Integer.valueOf(i4), Integer.valueOf(i)}, 3, "%s: actual 0x%08x != expected 0x%08x", "format(this, *args)"));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8305d.close();
    }

    public final void e(C0576h c0576h, long j4, long j5) {
        D d4 = c0576h.f8283a;
        Intrinsics.checkNotNull(d4);
        while (true) {
            int i = d4.f8250c;
            int i4 = d4.f8249b;
            if (j4 < i - i4) {
                break;
            }
            j4 -= i - i4;
            d4 = d4.f8253f;
            Intrinsics.checkNotNull(d4);
        }
        while (j5 > 0) {
            int min = (int) Math.min(d4.f8250c - r6, j5);
            this.f8306e.update(d4.f8248a, (int) (d4.f8249b + j4), min);
            j5 -= min;
            d4 = d4.f8253f;
            Intrinsics.checkNotNull(d4);
            j4 = 0;
        }
    }

    @Override // r3.I
    public final long read(C0576h sink, long j4) {
        r rVar = this;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(C.w.l("byteCount < 0: ", j4).toString());
        }
        if (j4 == 0) {
            return 0L;
        }
        byte b4 = rVar.f8302a;
        CRC32 crc32 = rVar.f8306e;
        C c4 = rVar.f8303b;
        if (b4 == 0) {
            c4.P(10L);
            C0576h c0576h = c4.f8246b;
            byte O2 = c0576h.O(3L);
            boolean z3 = ((O2 >> 1) & 1) == 1;
            if (z3) {
                rVar.e(c0576h, 0L, 10L);
            }
            d("ID1ID2", 8075, c4.readShort());
            c4.l(8L);
            if (((O2 >> 2) & 1) == 1) {
                c4.P(2L);
                if (z3) {
                    e(c0576h, 0L, 2L);
                }
                long c02 = c0576h.c0() & UShort.MAX_VALUE;
                c4.P(c02);
                if (z3) {
                    e(c0576h, 0L, c02);
                }
                c4.l(c02);
            }
            if (((O2 >> 3) & 1) == 1) {
                long e4 = c4.e((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (e4 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    e(c0576h, 0L, e4 + 1);
                }
                c4.l(e4 + 1);
            }
            if (((O2 >> 4) & 1) == 1) {
                long e5 = c4.e((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (e5 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    rVar = this;
                    rVar.e(c0576h, 0L, e5 + 1);
                } else {
                    rVar = this;
                }
                c4.l(e5 + 1);
            } else {
                rVar = this;
            }
            if (z3) {
                d("FHCRC", c4.Y(), (short) crc32.getValue());
                crc32.reset();
            }
            rVar.f8302a = (byte) 1;
        }
        if (rVar.f8302a == 1) {
            long j5 = sink.f8284b;
            long read = rVar.f8305d.read(sink, j4);
            if (read != -1) {
                rVar.e(sink, j5, read);
                return read;
            }
            rVar.f8302a = (byte) 2;
        }
        if (rVar.f8302a == 2) {
            d("CRC", c4.x(), (int) crc32.getValue());
            d("ISIZE", c4.x(), (int) rVar.f8304c.getBytesWritten());
            rVar.f8302a = (byte) 3;
            if (!c4.d()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // r3.I
    public final K timeout() {
        return this.f8303b.f8245a.timeout();
    }
}
