package r3;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8311a;

    /* renamed from: b, reason: collision with root package name */
    public int f8312b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f8313c;

    /* renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f8314d;

    public t(RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f8313c = new ReentrantLock();
        this.f8314d = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f8313c;
        reentrantLock.lock();
        try {
            if (this.f8311a) {
                return;
            }
            this.f8311a = true;
            if (this.f8312b != 0) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            synchronized (this) {
                this.f8314d.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long d() {
        long length;
        ReentrantLock reentrantLock = this.f8313c;
        reentrantLock.lock();
        try {
            if (this.f8311a) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.INSTANCE;
            synchronized (this) {
                length = this.f8314d.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final C0580l e(long j4) {
        ReentrantLock reentrantLock = this.f8313c;
        reentrantLock.lock();
        try {
            if (this.f8311a) {
                throw new IllegalStateException("closed");
            }
            this.f8312b++;
            reentrantLock.unlock();
            return new C0580l(this, j4);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
