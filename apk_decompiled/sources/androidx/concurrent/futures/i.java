package androidx.concurrent.futures;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f2531c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Thread f2532a;

    /* renamed from: b, reason: collision with root package name */
    public volatile i f2533b;

    public i() {
        j.ATOMIC_HELPER.e(this, Thread.currentThread());
    }
}
