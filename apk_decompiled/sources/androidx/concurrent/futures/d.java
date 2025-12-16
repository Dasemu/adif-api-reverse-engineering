package androidx.concurrent.futures;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f2518b = new d(new Throwable("Failure occurred while trying to finish a future."));

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2519a;

    public d(Throwable th) {
        this.f2519a = (Throwable) j.checkNotNull(th);
    }
}
