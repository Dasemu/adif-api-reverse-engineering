package d0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f6134a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final q f6135b;

    /* renamed from: c, reason: collision with root package name */
    public q f6136c;

    /* renamed from: d, reason: collision with root package name */
    public q f6137d;

    /* renamed from: e, reason: collision with root package name */
    public int f6138e;

    /* renamed from: f, reason: collision with root package name */
    public int f6139f;

    public n(q qVar) {
        this.f6135b = qVar;
        this.f6136c = qVar;
    }

    public final void a() {
        this.f6134a = 1;
        this.f6136c = this.f6135b;
        this.f6139f = 0;
    }

    public final boolean b() {
        e0.a b4 = this.f6136c.f6149b.b();
        int a2 = b4.a(6);
        return !(a2 == 0 || ((ByteBuffer) b4.f1221d).get(a2 + b4.f1218a) == 0) || this.f6138e == 65039;
    }
}
