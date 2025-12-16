package r3;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class K {

    /* renamed from: d, reason: collision with root package name */
    public static final J f8261d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f8262a;

    /* renamed from: b, reason: collision with root package name */
    public long f8263b;

    /* renamed from: c, reason: collision with root package name */
    public long f8264c;

    public K a() {
        this.f8262a = false;
        return this;
    }

    public K b() {
        this.f8264c = 0L;
        return this;
    }

    public long c() {
        if (this.f8262a) {
            return this.f8263b;
        }
        throw new IllegalStateException("No deadline");
    }

    public K d(long j4) {
        this.f8262a = true;
        this.f8263b = j4;
        return this;
    }

    public boolean e() {
        return this.f8262a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f8262a && this.f8263b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public K g(long j4) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j4 < 0) {
            throw new IllegalArgumentException(C.w.l("timeout < 0: ", j4).toString());
        }
        this.f8264c = unit.toNanos(j4);
        return this;
    }
}
