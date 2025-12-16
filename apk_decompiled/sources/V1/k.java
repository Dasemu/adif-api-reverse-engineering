package V1;

/* loaded from: classes3.dex */
public final class k extends s {

    /* renamed from: a, reason: collision with root package name */
    public final i f1842a;

    public k(i iVar) {
        this.f1842a = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        Object obj2 = r.f1866a;
        ((k) sVar).getClass();
        return obj2.equals(obj2) && this.f1842a.equals(((k) sVar).f1842a);
    }

    public final int hashCode() {
        return this.f1842a.hashCode() ^ ((r.f1866a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + r.f1866a + ", androidClientInfo=" + this.f1842a + "}";
    }
}
