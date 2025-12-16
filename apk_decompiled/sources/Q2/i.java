package Q2;

import S2.o;

/* loaded from: classes3.dex */
public final class i extends f {

    /* renamed from: a, reason: collision with root package name */
    public final o f1389a = new o(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof i) && ((i) obj).f1389a.equals(this.f1389a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f1389a.hashCode();
    }
}
