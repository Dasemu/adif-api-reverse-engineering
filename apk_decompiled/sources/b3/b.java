package b3;

import Z2.AbstractC0104l;
import Z2.q;
import Z2.r;
import Z2.x;

/* loaded from: classes3.dex */
public final class b extends AbstractC0104l {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0104l f4186a;

    public b(AbstractC0104l abstractC0104l) {
        this.f4186a = abstractC0104l;
    }

    @Override // Z2.AbstractC0104l
    public final Object fromJson(r rVar) {
        if (rVar.f0() != q.i) {
            return this.f4186a.fromJson(rVar);
        }
        rVar.d0();
        return null;
    }

    @Override // Z2.AbstractC0104l
    public final void toJson(x xVar, Object obj) {
        if (obj == null) {
            xVar.a0();
        } else {
            this.f4186a.toJson(xVar, obj);
        }
    }

    public final String toString() {
        return this.f4186a + ".nullSafe()";
    }
}
