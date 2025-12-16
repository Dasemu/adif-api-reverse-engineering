package h3;

import f0.C0338b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f6784a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6785b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6786c;

    /* renamed from: d, reason: collision with root package name */
    public a f6787d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f6788e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6789f;

    public c(e taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f6784a = taskRunner;
        this.f6785b = name;
        this.f6788e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = f3.c.f6469a;
        synchronized (this.f6784a) {
            try {
                if (b()) {
                    this.f6784a.d(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f6787d;
        if (aVar != null) {
            Intrinsics.checkNotNull(aVar);
            if (aVar.f6779b) {
                this.f6789f = true;
            }
        }
        ArrayList arrayList = this.f6788e;
        boolean z3 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f6779b) {
                a aVar2 = (a) arrayList.get(size);
                C0338b c0338b = e.h;
                if (e.f6792j.isLoggable(Level.FINE)) {
                    m3.d.b(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z3 = true;
            }
        }
        return z3;
    }

    public final void c(a task, long j4) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f6784a) {
            if (!this.f6786c) {
                if (d(task, j4, false)) {
                    this.f6784a.d(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.f6779b) {
                C0338b c0338b = e.h;
                if (e.f6792j.isLoggable(Level.FINE)) {
                    m3.d.b(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                C0338b c0338b2 = e.h;
                if (e.f6792j.isLoggable(Level.FINE)) {
                    m3.d.b(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a task, long j4, boolean z3) {
        Intrinsics.checkNotNullParameter(task, "task");
        task.getClass();
        Intrinsics.checkNotNullParameter(this, "queue");
        c cVar = task.f6780c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f6780c = this;
        }
        d dVar = this.f6784a.f6793a;
        long nanoTime = System.nanoTime();
        long j5 = nanoTime + j4;
        ArrayList arrayList = this.f6788e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f6781d <= j5) {
                C0338b c0338b = e.h;
                if (e.f6792j.isLoggable(Level.FINE)) {
                    m3.d.b(task, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        task.f6781d = j5;
        C0338b c0338b2 = e.h;
        if (e.f6792j.isLoggable(Level.FINE)) {
            m3.d.b(task, this, z3 ? "run again after ".concat(m3.d.q(j5 - nanoTime)) : "scheduled after ".concat(m3.d.q(j5 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((a) it.next()).f6781d - nanoTime > j4) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, task);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = f3.c.f6469a;
        synchronized (this.f6784a) {
            try {
                this.f6786c = true;
                if (b()) {
                    this.f6784a.d(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.f6785b;
    }
}
