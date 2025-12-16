package r3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r3.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0573e extends K {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f8275j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f8276k;

    /* renamed from: l, reason: collision with root package name */
    public static C0573e f8277l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8278e;

    /* renamed from: f, reason: collision with root package name */
    public C0573e f8279f;

    /* renamed from: g, reason: collision with root package name */
    public long f8280g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f8275j = millis;
        f8276k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, r3.e] */
    public final void h() {
        long j4 = this.f8264c;
        boolean z3 = this.f8262a;
        if (j4 != 0 || z3) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f8278e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f8278e = true;
                if (f8277l == null) {
                    f8277l = new Object();
                    Thread thread = new Thread("Okio Watchdog");
                    thread.setDaemon(true);
                    thread.start();
                }
                long nanoTime = System.nanoTime();
                if (j4 != 0 && z3) {
                    this.f8280g = Math.min(j4, c() - nanoTime) + nanoTime;
                } else if (j4 != 0) {
                    this.f8280g = j4 + nanoTime;
                } else {
                    if (!z3) {
                        throw new AssertionError();
                    }
                    this.f8280g = c();
                }
                long j5 = this.f8280g - nanoTime;
                C0573e c0573e = f8277l;
                Intrinsics.checkNotNull(c0573e);
                while (true) {
                    C0573e c0573e2 = c0573e.f8279f;
                    if (c0573e2 == null) {
                        break;
                    }
                    Intrinsics.checkNotNull(c0573e2);
                    if (j5 < c0573e2.f8280g - nanoTime) {
                        break;
                    }
                    c0573e = c0573e.f8279f;
                    Intrinsics.checkNotNull(c0573e);
                }
                this.f8279f = c0573e.f8279f;
                c0573e.f8279f = this;
                if (c0573e == f8277l) {
                    i.signal();
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.f8278e) {
                return false;
            }
            this.f8278e = false;
            C0573e c0573e = f8277l;
            while (c0573e != null) {
                C0573e c0573e2 = c0573e.f8279f;
                if (c0573e2 == this) {
                    c0573e.f8279f = this.f8279f;
                    this.f8279f = null;
                    return false;
                }
                c0573e = c0573e2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
