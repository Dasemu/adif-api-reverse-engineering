package e3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public I f6280a;

    /* renamed from: b, reason: collision with root package name */
    public G f6281b;

    /* renamed from: d, reason: collision with root package name */
    public String f6283d;

    /* renamed from: e, reason: collision with root package name */
    public C0332s f6284e;

    /* renamed from: g, reason: collision with root package name */
    public T f6286g;
    public O h;
    public O i;

    /* renamed from: j, reason: collision with root package name */
    public O f6287j;

    /* renamed from: k, reason: collision with root package name */
    public long f6288k;

    /* renamed from: l, reason: collision with root package name */
    public long f6289l;

    /* renamed from: m, reason: collision with root package name */
    public i3.e f6290m;

    /* renamed from: c, reason: collision with root package name */
    public int f6282c = -1;

    /* renamed from: f, reason: collision with root package name */
    public C0333t f6285f = new C0333t();

    public static void b(O o4, String str) {
        if (o4 != null) {
            if (o4.f6297g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (o4.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (o4.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (o4.f6298j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final O a() {
        int i = this.f6282c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f6282c).toString());
        }
        I i4 = this.f6280a;
        if (i4 == null) {
            throw new IllegalStateException("request == null");
        }
        G g4 = this.f6281b;
        if (g4 == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f6283d;
        if (str != null) {
            return new O(i4, g4, str, i, this.f6284e, this.f6285f.d(), this.f6286g, this.h, this.i, this.f6287j, this.f6288k, this.f6289l, this.f6290m);
        }
        throw new IllegalStateException("message == null");
    }

    public final void c(C0334u headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f6285f = headers.c();
    }
}
