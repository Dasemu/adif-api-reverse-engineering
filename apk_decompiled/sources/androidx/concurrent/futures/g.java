package androidx.concurrent.futures;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final j f2529a;

    /* renamed from: b, reason: collision with root package name */
    public final L2.a f2530b;

    public g(j jVar, L2.a aVar) {
        this.f2529a = jVar;
        this.f2530b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2529a.value != this) {
            return;
        }
        if (j.ATOMIC_HELPER.b(this.f2529a, this, j.getFutureValue(this.f2530b))) {
            j.complete(this.f2529a);
        }
    }
}
