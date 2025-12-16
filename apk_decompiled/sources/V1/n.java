package V1;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class n extends u {

    /* renamed from: a, reason: collision with root package name */
    public final long f1857a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1858b;

    /* renamed from: c, reason: collision with root package name */
    public final k f1859c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1860d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1861e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1862f;

    public n(long j4, long j5, k kVar, Integer num, String str, ArrayList arrayList) {
        y yVar = y.f1872a;
        this.f1857a = j4;
        this.f1858b = j5;
        this.f1859c = kVar;
        this.f1860d = num;
        this.f1861e = str;
        this.f1862f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        n nVar = (n) ((u) obj);
        if (this.f1857a != nVar.f1857a) {
            return false;
        }
        if (this.f1858b != nVar.f1858b) {
            return false;
        }
        if (!this.f1859c.equals(nVar.f1859c)) {
            return false;
        }
        Integer num = nVar.f1860d;
        Integer num2 = this.f1860d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = nVar.f1861e;
        String str2 = this.f1861e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f1862f.equals(nVar.f1862f)) {
            return false;
        }
        Object obj2 = y.f1872a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j4 = this.f1857a;
        long j5 = this.f1858b;
        int hashCode = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f1859c.hashCode()) * 1000003;
        Integer num = this.f1860d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f1861e;
        return ((this.f1862f.hashCode() ^ ((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ y.f1872a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f1857a + ", requestUptimeMs=" + this.f1858b + ", clientInfo=" + this.f1859c + ", logSource=" + this.f1860d + ", logSourceName=" + this.f1861e + ", logEvents=" + this.f1862f + ", qosTier=" + y.f1872a + "}";
    }
}
