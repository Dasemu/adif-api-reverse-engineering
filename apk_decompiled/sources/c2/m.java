package c2;

import W1.u;
import android.content.Context;
import e2.InterfaceC0314c;
import f0.C0338b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class m implements Y1.b {

    /* renamed from: a, reason: collision with root package name */
    public final X1.e f4274a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f4275b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f4276c;

    /* renamed from: d, reason: collision with root package name */
    public final u f4277d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f4278e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f4279f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider f4280g;

    public m(X1.e eVar, Provider provider, Provider provider2, u uVar, Provider provider3, Provider provider4, Provider provider5) {
        this.f4274a = eVar;
        this.f4275b = provider;
        this.f4276c = provider2;
        this.f4277d = uVar;
        this.f4278e = provider3;
        this.f4279f = provider4;
        this.f4280g = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((Context) this.f4274a.f2020b, (X1.f) this.f4275b.get(), (d2.d) this.f4276c.get(), (d) this.f4277d.get(), (Executor) this.f4278e.get(), (InterfaceC0314c) this.f4279f.get(), new C0338b(3), new C0338b(2), (d2.c) this.f4280g.get());
    }
}
