package K0;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final d f1012a;

    public i(d dVar) {
        this.f1012a = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1012a.close();
    }
}
