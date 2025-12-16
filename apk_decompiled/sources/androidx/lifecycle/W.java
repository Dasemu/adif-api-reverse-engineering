package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import o.C0516b;
import o.C0520f;

/* loaded from: classes.dex */
public class W extends X {

    /* renamed from: l, reason: collision with root package name */
    public final C0520f f3331l = new C0520f();

    @Override // androidx.lifecycle.Q
    public void g() {
        Iterator it = this.f3331l.iterator();
        while (true) {
            C0516b c0516b = (C0516b) it;
            if (!c0516b.hasNext()) {
                return;
            }
            V v3 = (V) ((Map.Entry) c0516b.next()).getValue();
            v3.f3328a.f(v3);
        }
    }

    @Override // androidx.lifecycle.Q
    public void h() {
        Iterator it = this.f3331l.iterator();
        while (true) {
            C0516b c0516b = (C0516b) it;
            if (!c0516b.hasNext()) {
                return;
            }
            V v3 = (V) ((Map.Entry) c0516b.next()).getValue();
            v3.f3328a.i(v3);
        }
    }
}
