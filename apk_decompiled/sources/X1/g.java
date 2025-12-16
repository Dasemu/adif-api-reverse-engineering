package X1;

import android.content.Context;
import d2.C0310a;
import d2.j;
import f0.C0338b;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class g implements Y1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2024a;

    /* renamed from: b, reason: collision with root package name */
    public final Y1.b f2025b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f2026c;

    public /* synthetic */ g(Y1.b bVar, Provider provider, int i) {
        this.f2024a = i;
        this.f2025b = bVar;
        this.f2026c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f2024a) {
            case 0:
                return new f((Context) ((e) this.f2025b).f2020b, (d) ((e) this.f2026c).get());
            default:
                return new d2.h(new C0338b(3), new C0338b(2), C0310a.f6171f, (j) ((e) this.f2025b).get(), this.f2026c);
        }
    }
}
