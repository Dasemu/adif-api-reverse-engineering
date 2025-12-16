package T1;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1653a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1654b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1655c;

    public a(Object obj, d dVar, b bVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f1653a = obj;
        this.f1654b = dVar;
        this.f1655c = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            aVar.getClass();
            if (this.f1653a.equals(aVar.f1653a) && this.f1654b.equals(aVar.f1654b)) {
                b bVar = aVar.f1655c;
                b bVar2 = this.f1655c;
                if (bVar2 != null ? bVar2.equals(bVar) : bVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.f1653a.hashCode()) * 1000003) ^ this.f1654b.hashCode()) * 1000003;
        b bVar = this.f1655c;
        return (bVar == null ? 0 : bVar.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f1653a + ", priority=" + this.f1654b + ", productData=" + this.f1655c + "}";
    }
}
