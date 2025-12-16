package T1;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1656a;

    public b(Integer num) {
        this.f1656a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Integer num = this.f1656a;
        return num == null ? bVar.f1656a == null : num.equals(bVar.f1656a);
    }

    public final int hashCode() {
        Integer num = this.f1656a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f1656a + "}";
    }
}
