package r3;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r3.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0580l implements I {

    /* renamed from: a, reason: collision with root package name */
    public final t f8289a;

    /* renamed from: b, reason: collision with root package name */
    public long f8290b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8291c;

    public C0580l(t fileHandle, long j4) {
        Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
        this.f8289a = fileHandle;
        this.f8290b = j4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8291c) {
            return;
        }
        this.f8291c = true;
        t tVar = this.f8289a;
        ReentrantLock reentrantLock = tVar.f8313c;
        reentrantLock.lock();
        try {
            int i = tVar.f8312b - 1;
            tVar.f8312b = i;
            if (i == 0 && tVar.f8311a) {
                Unit unit = Unit.INSTANCE;
                synchronized (tVar) {
                    tVar.f8314d.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // r3.I
    public final long read(C0576h sink, long j4) {
        long j5;
        long j6;
        int i;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f8291c) {
            throw new IllegalStateException("closed");
        }
        t tVar = this.f8289a;
        long j7 = this.f8290b;
        tVar.getClass();
        if (j4 < 0) {
            throw new IllegalArgumentException(C.w.l("byteCount < 0: ", j4).toString());
        }
        long j8 = j4 + j7;
        long j9 = j7;
        while (true) {
            if (j9 >= j8) {
                j5 = -1;
                break;
            }
            D g02 = sink.g0(1);
            byte[] array = g02.f8248a;
            int i4 = g02.f8250c;
            j5 = -1;
            int min = (int) Math.min(j8 - j9, 8192 - i4);
            synchronized (tVar) {
                Intrinsics.checkNotNullParameter(array, "array");
                tVar.f8314d.seek(j9);
                i = 0;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int read = tVar.f8314d.read(array, i4, min - i);
                    if (read != -1) {
                        i += read;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (g02.f8249b == g02.f8250c) {
                    sink.f8283a = g02.a();
                    E.a(g02);
                }
                if (j7 == j9) {
                    j6 = -1;
                }
            } else {
                g02.f8250c += i;
                long j10 = i;
                j9 += j10;
                sink.f8284b += j10;
            }
        }
        j6 = j9 - j7;
        if (j6 != j5) {
            this.f8290b += j6;
        }
        return j6;
    }

    @Override // r3.I
    public final K timeout() {
        return K.f8261d;
    }
}
