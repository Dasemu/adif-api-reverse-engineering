package V0;

import B0.G;
import J0.g;
import S0.k;
import S0.r;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public final int f1793b;

    public a(int i) {
        this.f1793b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // V0.d
    public final e a(U0.a aVar, k kVar) {
        if ((kVar instanceof r) && ((r) kVar).f1519c != g.f933a) {
            return new G(aVar, kVar, this.f1793b);
        }
        return new c(aVar, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f1793b == ((a) obj).f1793b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f1793b * 31);
    }
}
