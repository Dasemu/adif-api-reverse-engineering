package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final C0127s f2851b = new C0127s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f2852a;

    public J(C0119j c0119j) {
        AbstractC0133y.a(c0119j, "output");
        this.f2852a = c0119j;
        c0119j.f2930c = this;
    }

    public void a(int i, C0116g c0116g) {
        ((C0119j) this.f2852a).G(i, c0116g);
    }

    public void b(int i, Object obj, InterfaceC0111b0 interfaceC0111b0) {
        C0119j c0119j = (C0119j) this.f2852a;
        c0119j.R(i, 3);
        interfaceC0111b0.a((AbstractC0108a) obj, c0119j.f2930c);
        c0119j.R(i, 4);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.datastore.preferences.protobuf.I, java.lang.Object] */
    public J() {
        P p;
        try {
            p = (P) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            p = f2851b;
        }
        P[] pArr = {C0127s.f2961b, p};
        ?? obj = new Object();
        obj.f2850a = pArr;
        Charset charset = AbstractC0133y.f2975a;
        this.f2852a = obj;
    }
}
