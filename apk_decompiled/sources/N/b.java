package N;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1119a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1120b;

    public b(Object obj, Object obj2) {
        this.f1119a = obj;
        this.f1120b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f1119a, this.f1119a) && Objects.equals(bVar.f1120b, this.f1120b);
    }

    public final int hashCode() {
        Object obj = this.f1119a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f1120b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f1119a + " " + this.f1120b + "}";
    }
}
