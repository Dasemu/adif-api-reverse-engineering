package androidx.concurrent.futures;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2524a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2525b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2526c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2527d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2528e;

    public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2524a = atomicReferenceFieldUpdater;
        this.f2525b = atomicReferenceFieldUpdater2;
        this.f2526c = atomicReferenceFieldUpdater3;
        this.f2527d = atomicReferenceFieldUpdater4;
        this.f2528e = atomicReferenceFieldUpdater5;
    }

    @Override // androidx.concurrent.futures.a
    public final boolean a(j jVar, e eVar, e eVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2527d;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, eVar, eVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == eVar);
        return false;
    }

    @Override // androidx.concurrent.futures.a
    public final boolean b(j jVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2528e;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == obj);
        return false;
    }

    @Override // androidx.concurrent.futures.a
    public final boolean c(j jVar, i iVar, i iVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2526c;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, iVar, iVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == iVar);
        return false;
    }

    @Override // androidx.concurrent.futures.a
    public final void d(i iVar, i iVar2) {
        this.f2525b.lazySet(iVar, iVar2);
    }

    @Override // androidx.concurrent.futures.a
    public final void e(i iVar, Thread thread) {
        this.f2524a.lazySet(iVar, thread);
    }
}
