package androidx.concurrent.futures;

import C.w;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class j implements L2.a {
    static final a ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile e listeners;
    volatile Object value;
    volatile i waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(j.class.getName());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.concurrent.futures.a] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        ?? r32;
        try {
            th = null;
            r32 = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j.class, i.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(j.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "value"));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        ATOMIC_HELPER = r32;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    public static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof b) {
            CancellationException cancellationException = ((b) obj).f2517b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f2519a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static <T> T checkNotNull(T t2) {
        t2.getClass();
        return t2;
    }

    public static void complete(j jVar) {
        e eVar;
        e eVar2;
        e eVar3 = null;
        while (true) {
            i iVar = jVar.waiters;
            if (ATOMIC_HELPER.c(jVar, iVar, i.f2531c)) {
                while (iVar != null) {
                    Thread thread = iVar.f2532a;
                    if (thread != null) {
                        iVar.f2532a = null;
                        LockSupport.unpark(thread);
                    }
                    iVar = iVar.f2533b;
                }
                jVar.afterDone();
                do {
                    eVar = jVar.listeners;
                } while (!ATOMIC_HELPER.a(jVar, eVar, e.f2520d));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.f2523c;
                    eVar3.f2523c = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.f2523c;
                    Runnable runnable = eVar2.f2521a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        jVar = gVar.f2529a;
                        if (jVar.value == gVar) {
                            if (ATOMIC_HELPER.b(jVar, gVar, getFutureValue(gVar.f2530b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, eVar2.f2522b);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
        }
    }

    public static Object getFutureValue(L2.a aVar) {
        if (aVar instanceof j) {
            Object obj = ((j) aVar).value;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            return bVar.f2516a ? bVar.f2517b != null ? new b(false, bVar.f2517b) : b.f2515d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            return b.f2515d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(aVar);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e4) {
            if (isCancelled) {
                return new b(false, e4);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e4));
        } catch (ExecutionException e5) {
            return new d(e5.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    public static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v3;
        boolean z3 = false;
        while (true) {
            try {
                v3 = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return v3;
    }

    public final void a(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(uninterruptibly == this ? "this future" : String.valueOf(uninterruptibly));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    @Override // L2.a
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        e eVar = this.listeners;
        e eVar2 = e.f2520d;
        if (eVar != eVar2) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f2523c = eVar;
                if (ATOMIC_HELPER.a(this, eVar, eVar3)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != eVar2);
        }
        b(runnable, executor);
    }

    public void afterDone() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.value
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof androidx.concurrent.futures.g
            r3 = r3 | r4
            if (r3 == 0) goto L5e
            boolean r3 = androidx.concurrent.futures.j.GENERATE_CANCELLATION_CAUSES
            if (r3 == 0) goto L1f
            androidx.concurrent.futures.b r3 = new androidx.concurrent.futures.b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r7, r4)
            goto L26
        L1f:
            if (r7 == 0) goto L24
            androidx.concurrent.futures.b r3 = androidx.concurrent.futures.b.f2514c
            goto L26
        L24:
            androidx.concurrent.futures.b r3 = androidx.concurrent.futures.b.f2515d
        L26:
            r4 = r2
        L27:
            androidx.concurrent.futures.a r5 = androidx.concurrent.futures.j.ATOMIC_HELPER
            boolean r5 = r5.b(r6, r0, r3)
            if (r5 == 0) goto L57
            if (r7 == 0) goto L34
            r6.interruptTask()
        L34:
            complete(r6)
            boolean r6 = r0 instanceof androidx.concurrent.futures.g
            if (r6 == 0) goto L56
            androidx.concurrent.futures.g r0 = (androidx.concurrent.futures.g) r0
            L2.a r6 = r0.f2530b
            boolean r0 = r6 instanceof androidx.concurrent.futures.j
            if (r0 == 0) goto L53
            androidx.concurrent.futures.j r6 = (androidx.concurrent.futures.j) r6
            java.lang.Object r0 = r6.value
            if (r0 != 0) goto L4b
            r4 = r1
            goto L4c
        L4b:
            r4 = r2
        L4c:
            boolean r5 = r0 instanceof androidx.concurrent.futures.g
            r4 = r4 | r5
            if (r4 == 0) goto L56
            r4 = r1
            goto L27
        L53:
            r6.cancel(r7)
        L56:
            return r1
        L57:
            java.lang.Object r0 = r6.value
            boolean r5 = r0 instanceof androidx.concurrent.futures.g
            if (r5 != 0) goto L27
            return r4
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.j.cancel(boolean):boolean");
    }

    public final void d(i iVar) {
        iVar.f2532a = null;
        while (true) {
            i iVar2 = this.waiters;
            if (iVar2 == i.f2531c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f2533b;
                if (iVar2.f2532a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f2533b = iVar4;
                    if (iVar3.f2532a == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z3;
        long nanos = timeUnit.toNanos(j4);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if ((obj != null) & (!(obj instanceof g))) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.waiters;
                i iVar2 = i.f2531c;
                if (iVar != iVar2) {
                    i iVar3 = new i();
                    z3 = true;
                    do {
                        a aVar = ATOMIC_HELPER;
                        aVar.d(iVar3, iVar);
                        if (aVar.c(this, iVar, iVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    d(iVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            d(iVar3);
                        } else {
                            iVar = this.waiters;
                        }
                    } while (iVar != iVar2);
                }
                return c(this.value);
            }
            z3 = true;
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null ? z3 : false) & (!(obj3 instanceof g))) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String jVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String n4 = w.n(str, " (plus ");
                long j5 = -nanos;
                long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
                long nanos2 = j5 - timeUnit.toNanos(convert);
                boolean z4 = (convert == 0 || nanos2 > 1000) ? z3 : false;
                if (convert > 0) {
                    String str2 = n4 + convert + " " + lowerCase;
                    if (z4) {
                        str2 = w.n(str2, ",");
                    }
                    n4 = w.n(str2, " ");
                }
                if (z4) {
                    n4 = n4 + nanos2 + " nanoseconds ";
                }
                str = w.n(n4, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(w.n(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + jVar);
        }
        throw new InterruptedException();
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r2 instanceof g)) & (this.value != null);
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof g) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            L2.a aVar = ((g) obj).f2530b;
            return w.r(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.b(this, null, new d((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setFuture(L2.a aVar) {
        d dVar;
        checkNotNull(aVar);
        Object obj = this.value;
        if (obj == null) {
            if (aVar.isDone()) {
                if (ATOMIC_HELPER.b(this, null, getFutureValue(aVar))) {
                    complete(this);
                    return true;
                }
                return false;
            }
            g gVar = new g(this, aVar);
            if (ATOMIC_HELPER.b(this, null, gVar)) {
                try {
                    aVar.addListener(gVar, k.f2534a);
                    return true;
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f2518b;
                    }
                    ATOMIC_HELPER.b(this, gVar, dVar);
                    return true;
                }
            }
            obj = this.value;
        }
        if (obj instanceof b) {
            aVar.cancel(((b) obj).f2516a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = pendingToString();
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).f2516a;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return c(obj2);
            }
            i iVar = this.waiters;
            i iVar2 = i.f2531c;
            if (iVar != iVar2) {
                i iVar3 = new i();
                do {
                    a aVar = ATOMIC_HELPER;
                    aVar.d(iVar3, iVar);
                    if (aVar.c(this, iVar, iVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                d(iVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return c(obj);
                    }
                    iVar = this.waiters;
                } while (iVar != iVar2);
            }
            return c(this.value);
        }
        throw new InterruptedException();
    }
}
