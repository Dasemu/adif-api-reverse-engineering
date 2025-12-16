package J0;

import a.AbstractC0105a;
import r3.C;
import r3.InterfaceC0578j;
import r3.z;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public final z f951a;

    /* renamed from: b, reason: collision with root package name */
    public final r3.n f952b;

    /* renamed from: c, reason: collision with root package name */
    public final String f953c;

    /* renamed from: d, reason: collision with root package name */
    public final K0.i f954d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f955e;

    /* renamed from: f, reason: collision with root package name */
    public C f956f;

    public o(z zVar, r3.n nVar, String str, K0.i iVar) {
        this.f951a = zVar;
        this.f952b = nVar;
        this.f953c = str;
        this.f954d = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f955e = true;
            C c4 = this.f956f;
            if (c4 != null) {
                W0.f.a(c4);
            }
            K0.i iVar = this.f954d;
            if (iVar != null) {
                W0.f.a(iVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // J0.p
    public final m3.l d() {
        return null;
    }

    @Override // J0.p
    public final synchronized InterfaceC0578j e() {
        if (this.f955e) {
            throw new IllegalStateException("closed");
        }
        C c4 = this.f956f;
        if (c4 != null) {
            return c4;
        }
        C d4 = AbstractC0105a.d(this.f952b.h(this.f951a));
        this.f956f = d4;
        return d4;
    }
}
