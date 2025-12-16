package W1;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1927a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1928b;

    /* renamed from: c, reason: collision with root package name */
    public final m f1929c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1930d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1931e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f1932f;

    public i(String str, Integer num, m mVar, long j4, long j5, HashMap hashMap) {
        this.f1927a = str;
        this.f1928b = num;
        this.f1929c = mVar;
        this.f1930d = j4;
        this.f1931e = j5;
        this.f1932f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f1932f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f1932f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [I0.g, java.lang.Object] */
    public final I0.g c() {
        ?? obj = new Object();
        String str = this.f1927a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        obj.f753a = str;
        obj.f754b = this.f1928b;
        m mVar = this.f1929c;
        if (mVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        obj.f755c = mVar;
        obj.f756d = Long.valueOf(this.f1930d);
        obj.f757e = Long.valueOf(this.f1931e);
        obj.f758f = new HashMap(this.f1932f);
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f1927a.equals(iVar.f1927a)) {
            return false;
        }
        Integer num = iVar.f1928b;
        Integer num2 = this.f1928b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        return this.f1929c.equals(iVar.f1929c) && this.f1930d == iVar.f1930d && this.f1931e == iVar.f1931e && this.f1932f.equals(iVar.f1932f);
    }

    public final int hashCode() {
        int hashCode = (this.f1927a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f1928b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f1929c.hashCode()) * 1000003;
        long j4 = this.f1930d;
        int i = (hashCode2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f1931e;
        return this.f1932f.hashCode() ^ ((i ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f1927a + ", code=" + this.f1928b + ", encodedPayload=" + this.f1929c + ", eventMillis=" + this.f1930d + ", uptimeMillis=" + this.f1931e + ", autoMetadata=" + this.f1932f + "}";
    }
}
