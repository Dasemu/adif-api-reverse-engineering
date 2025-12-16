package e3;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class O implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final I f6291a;

    /* renamed from: b, reason: collision with root package name */
    public final G f6292b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6293c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6294d;

    /* renamed from: e, reason: collision with root package name */
    public final C0332s f6295e;

    /* renamed from: f, reason: collision with root package name */
    public final C0334u f6296f;

    /* renamed from: g, reason: collision with root package name */
    public final T f6297g;
    public final O h;
    public final O i;

    /* renamed from: j, reason: collision with root package name */
    public final O f6298j;

    /* renamed from: k, reason: collision with root package name */
    public final long f6299k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6300l;

    /* renamed from: m, reason: collision with root package name */
    public final i3.e f6301m;

    /* renamed from: n, reason: collision with root package name */
    public C0317c f6302n;

    public O(I request, G protocol, String message, int i, C0332s c0332s, C0334u headers, T t2, O o4, O o5, O o6, long j4, long j5, i3.e eVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f6291a = request;
        this.f6292b = protocol;
        this.f6293c = message;
        this.f6294d = i;
        this.f6295e = c0332s;
        this.f6296f = headers;
        this.f6297g = t2;
        this.h = o4;
        this.i = o5;
        this.f6298j = o6;
        this.f6299k = j4;
        this.f6300l = j5;
        this.f6301m = eVar;
    }

    public static String d(O o4, String name) {
        o4.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String a2 = o4.f6296f.a(name);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        T t2 = this.f6297g;
        if (t2 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        t2.close();
    }

    public final boolean e() {
        int i = this.f6294d;
        return 200 <= i && i < 300;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e3.N, java.lang.Object] */
    public final N s() {
        Intrinsics.checkNotNullParameter(this, "response");
        ?? obj = new Object();
        obj.f6280a = this.f6291a;
        obj.f6281b = this.f6292b;
        obj.f6282c = this.f6294d;
        obj.f6283d = this.f6293c;
        obj.f6284e = this.f6295e;
        obj.f6285f = this.f6296f.c();
        obj.f6286g = this.f6297g;
        obj.h = this.h;
        obj.i = this.i;
        obj.f6287j = this.f6298j;
        obj.f6288k = this.f6299k;
        obj.f6289l = this.f6300l;
        obj.f6290m = this.f6301m;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.f6292b + ", code=" + this.f6294d + ", message=" + this.f6293c + ", url=" + this.f6291a.f6267a + '}';
    }
}
