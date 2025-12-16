package T0;

import m3.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final int f1631a;

    public a(int i) {
        this.f1631a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f1631a == ((a) obj).f1631a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1631a;
    }

    public final String toString() {
        return String.valueOf(this.f1631a);
    }
}
