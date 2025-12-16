package Z2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2206a;

    /* renamed from: b, reason: collision with root package name */
    public int f2207b;

    public D(ArrayList routes) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.f2206a = routes;
    }

    public void a(InterfaceC0103k interfaceC0103k) {
        if (interfaceC0103k == null) {
            throw new IllegalArgumentException("factory == null");
        }
        ArrayList arrayList = this.f2206a;
        int i = this.f2207b;
        this.f2207b = i + 1;
        arrayList.add(i, interfaceC0103k);
    }

    public boolean b() {
        return this.f2207b < this.f2206a.size();
    }

    public D() {
        this.f2206a = new ArrayList();
        this.f2207b = 0;
    }
}
