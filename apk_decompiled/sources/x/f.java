package x;

import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends e {

    /* renamed from: m, reason: collision with root package name */
    public int f8831m;

    public f(n nVar) {
        super(nVar);
        if (nVar instanceof j) {
            this.f8825e = 2;
        } else {
            this.f8825e = 3;
        }
    }

    @Override // x.e
    public final void d(int i) {
        if (this.f8828j) {
            return;
        }
        this.f8828j = true;
        this.f8827g = i;
        Iterator it = this.f8829k.iterator();
        while (it.hasNext()) {
            InterfaceC0655d interfaceC0655d = (InterfaceC0655d) it.next();
            interfaceC0655d.a(interfaceC0655d);
        }
    }
}
