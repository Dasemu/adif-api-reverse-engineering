package W1;

import java.io.Closeable;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class l implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public Provider f1937a;

    /* renamed from: b, reason: collision with root package name */
    public X1.e f1938b;

    /* renamed from: c, reason: collision with root package name */
    public Provider f1939c;

    /* renamed from: d, reason: collision with root package name */
    public X1.e f1940d;

    /* renamed from: e, reason: collision with root package name */
    public Provider f1941e;

    /* renamed from: f, reason: collision with root package name */
    public Provider f1942f;

    /* renamed from: g, reason: collision with root package name */
    public Provider f1943g;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((d2.h) ((d2.d) this.f1942f.get())).close();
    }
}
