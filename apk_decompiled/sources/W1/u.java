package W1;

import android.content.Context;
import b2.C0270c;
import b2.C0272e;
import b2.InterfaceC0271d;
import f0.C0338b;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class u implements Y1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1962a;

    /* renamed from: b, reason: collision with root package name */
    public final Y1.b f1963b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f1964c;

    /* renamed from: d, reason: collision with root package name */
    public final Y1.b f1965d;

    public /* synthetic */ u(Y1.b bVar, Provider provider, Y1.b bVar2, int i) {
        this.f1962a = i;
        this.f1963b = bVar;
        this.f1964c = provider;
        this.f1965d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f1962a) {
            case 0:
                return new t(new C0338b(3), new C0338b(2), (InterfaceC0271d) ((C0270c) this.f1963b).get(), (c2.l) ((c2.m) this.f1964c).get(), (c2.n) ((c2.o) this.f1965d).get());
            default:
                return new c2.d((Context) ((X1.e) this.f1963b).f2020b, (d2.d) this.f1964c.get(), (c2.b) ((C0272e) this.f1965d).get());
        }
    }
}
