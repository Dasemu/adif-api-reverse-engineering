package h3;

import f0.C0338b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes3.dex */
public final class e {
    public static final C0338b h = new C0338b(5);
    public static final e i;

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f6792j;

    /* renamed from: a, reason: collision with root package name */
    public final d f6793a;

    /* renamed from: b, reason: collision with root package name */
    public int f6794b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6795c;

    /* renamed from: d, reason: collision with root package name */
    public long f6796d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f6797e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6798f;

    /* renamed from: g, reason: collision with root package name */
    public final F0.c f6799g;

    static {
        String name = f3.c.f6475g + " TaskRunner";
        Intrinsics.checkNotNullParameter(name, "name");
        i = new e(new d(new f3.b(name, true)));
        Logger logger = Logger.getLogger(e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f6792j = logger;
    }

    public e(d backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f6793a = backend;
        this.f6794b = 10000;
        this.f6797e = new ArrayList();
        this.f6798f = new ArrayList();
        this.f6799g = new F0.c(this, 8);
    }

    public static final void a(e eVar, a aVar) {
        eVar.getClass();
        byte[] bArr = f3.c.f6469a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f6778a);
        try {
            long a2 = aVar.a();
            synchronized (eVar) {
                eVar.b(aVar, a2);
                Unit unit = Unit.INSTANCE;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (eVar) {
                eVar.b(aVar, -1L);
                Unit unit2 = Unit.INSTANCE;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j4) {
        byte[] bArr = f3.c.f6469a;
        c cVar = aVar.f6780c;
        Intrinsics.checkNotNull(cVar);
        if (cVar.f6787d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z3 = cVar.f6789f;
        cVar.f6789f = false;
        cVar.f6787d = null;
        this.f6797e.remove(cVar);
        if (j4 != -1 && !z3 && !cVar.f6786c) {
            cVar.d(aVar, j4, true);
        }
        if (cVar.f6788e.isEmpty()) {
            return;
        }
        this.f6798f.add(cVar);
    }

    public final a c() {
        long j4;
        a aVar;
        boolean z3;
        byte[] bArr = f3.c.f6469a;
        while (true) {
            ArrayList arrayList = this.f6798f;
            if (arrayList.isEmpty()) {
                return null;
            }
            d dVar = this.f6793a;
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j5 = LongCompanionObject.MAX_VALUE;
            a aVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j4 = nanoTime;
                    aVar = null;
                    z3 = false;
                    break;
                }
                a aVar3 = (a) ((c) it.next()).f6788e.get(0);
                j4 = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.f6781d - j4);
                if (max > 0) {
                    j5 = Math.min(max, j5);
                } else {
                    if (aVar2 != null) {
                        z3 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j4;
            }
            ArrayList arrayList2 = this.f6797e;
            if (aVar2 != null) {
                byte[] bArr2 = f3.c.f6469a;
                aVar2.f6781d = -1L;
                c cVar = aVar2.f6780c;
                Intrinsics.checkNotNull(cVar);
                cVar.f6788e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f6787d = aVar2;
                arrayList2.add(cVar);
                if (z3 || (!this.f6795c && !arrayList.isEmpty())) {
                    F0.c runnable = this.f6799g;
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    ((ThreadPoolExecutor) dVar.f6791b).execute(runnable);
                }
                return aVar2;
            }
            if (this.f6795c) {
                if (j5 >= this.f6796d - j4) {
                    return aVar;
                }
                Intrinsics.checkNotNullParameter(this, "taskRunner");
                notify();
                return aVar;
            }
            this.f6795c = true;
            this.f6796d = j4 + j5;
            try {
                try {
                    Intrinsics.checkNotNullParameter(this, "taskRunner");
                    long j6 = j5 / 1000000;
                    long j7 = j5 - (1000000 * j6);
                    if (j6 > 0 || j5 > 0) {
                        wait(j6, (int) j7);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f6788e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f6795c = false;
            }
        }
    }

    public final void d(c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = f3.c.f6469a;
        if (taskQueue.f6787d == null) {
            boolean isEmpty = taskQueue.f6788e.isEmpty();
            ArrayList arrayList = this.f6798f;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z3 = this.f6795c;
        d dVar = this.f6793a;
        if (z3) {
            Intrinsics.checkNotNullParameter(this, "taskRunner");
            notify();
        } else {
            F0.c runnable = this.f6799g;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            ((ThreadPoolExecutor) dVar.f6791b).execute(runnable);
        }
    }

    public final c e() {
        int i4;
        synchronized (this) {
            i4 = this.f6794b;
            this.f6794b = i4 + 1;
        }
        return new c(this, com.google.android.gms.measurement.internal.a.l(i4, "Q"));
    }
}
