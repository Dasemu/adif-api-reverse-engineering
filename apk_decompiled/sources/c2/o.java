package c2;

import W1.u;
import e2.InterfaceC0314c;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class o implements Y1.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f4285a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f4286b;

    /* renamed from: c, reason: collision with root package name */
    public final u f4287c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f4288d;

    public o(Provider provider, Provider provider2, u uVar, Provider provider3) {
        this.f4285a = provider;
        this.f4286b = provider2;
        this.f4287c = uVar;
        this.f4288d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((Executor) this.f4285a.get(), (d2.d) this.f4286b.get(), (d) this.f4287c.get(), (InterfaceC0314c) this.f4288d.get());
    }
}
