package b3;

import Z2.AbstractC0104l;
import Z2.q;
import Z2.r;
import Z2.x;

/* loaded from: classes3.dex */
public final class a extends AbstractC0104l {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0104l f4185a;

    public a(AbstractC0104l abstractC0104l) {
        this.f4185a = abstractC0104l;
    }

    @Override // Z2.AbstractC0104l
    public final Object fromJson(r rVar) {
        if (rVar.f0() != q.i) {
            return this.f4185a.fromJson(rVar);
        }
        throw new RuntimeException("Unexpected null at " + rVar.O());
    }

    @Override // Z2.AbstractC0104l
    public final void toJson(x xVar, Object obj) {
        if (obj != null) {
            this.f4185a.toJson(xVar, obj);
        } else {
            throw new RuntimeException("Unexpected null at " + xVar.Y());
        }
    }

    public final String toString() {
        return this.f4185a + ".nonNull()";
    }
}
