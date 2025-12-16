package b2;

import W1.u;
import X1.f;
import e2.InterfaceC0314c;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* renamed from: b2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0270c implements Y1.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f4180a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f4181b;

    /* renamed from: c, reason: collision with root package name */
    public final u f4182c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f4183d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f4184e;

    public C0270c(Provider provider, Provider provider2, u uVar, Provider provider3, Provider provider4) {
        this.f4180a = provider;
        this.f4181b = provider2;
        this.f4182c = uVar;
        this.f4183d = provider3;
        this.f4184e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C0269b((Executor) this.f4180a.get(), (f) this.f4181b.get(), (c2.d) this.f4182c.get(), (d2.d) this.f4183d.get(), (InterfaceC0314c) this.f4184e.get());
    }
}
