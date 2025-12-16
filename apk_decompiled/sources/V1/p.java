package V1;

/* loaded from: classes3.dex */
public final class p extends x {

    /* renamed from: a, reason: collision with root package name */
    public final w f1864a;

    /* renamed from: b, reason: collision with root package name */
    public final v f1865b;

    public p(w wVar, v vVar) {
        this.f1864a = wVar;
        this.f1865b = vVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            w wVar = this.f1864a;
            if (wVar != null ? wVar.equals(((p) xVar).f1864a) : ((p) xVar).f1864a == null) {
                v vVar = this.f1865b;
                if (vVar != null ? vVar.equals(((p) xVar).f1865b) : ((p) xVar).f1865b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        w wVar = this.f1864a;
        int hashCode = ((wVar == null ? 0 : wVar.hashCode()) ^ 1000003) * 1000003;
        v vVar = this.f1865b;
        return hashCode ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f1864a + ", mobileSubtype=" + this.f1865b + "}";
    }
}
