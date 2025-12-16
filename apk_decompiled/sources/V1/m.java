package V1;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class m extends t {

    /* renamed from: a, reason: collision with root package name */
    public final long f1850a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1851b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1852c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1853d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1854e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1855f;

    /* renamed from: g, reason: collision with root package name */
    public final p f1856g;

    public m(long j4, Integer num, long j5, byte[] bArr, String str, long j6, p pVar) {
        this.f1850a = j4;
        this.f1851b = num;
        this.f1852c = j5;
        this.f1853d = bArr;
        this.f1854e = str;
        this.f1855f = j6;
        this.f1856g = pVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        m mVar = (m) tVar;
        if (this.f1850a != mVar.f1850a) {
            return false;
        }
        Integer num = this.f1851b;
        if (num == null) {
            if (mVar.f1851b != null) {
                return false;
            }
        } else if (!num.equals(mVar.f1851b)) {
            return false;
        }
        if (this.f1852c != mVar.f1852c) {
            return false;
        }
        if (!Arrays.equals(this.f1853d, tVar instanceof m ? ((m) tVar).f1853d : mVar.f1853d)) {
            return false;
        }
        String str = mVar.f1854e;
        String str2 = this.f1854e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f1855f != mVar.f1855f) {
            return false;
        }
        p pVar = mVar.f1856g;
        p pVar2 = this.f1856g;
        return pVar2 == null ? pVar == null : pVar2.equals(pVar);
    }

    public final int hashCode() {
        long j4 = this.f1850a;
        int i = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f1851b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j5 = this.f1852c;
        int hashCode2 = (((hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f1853d)) * 1000003;
        String str = this.f1854e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j6 = this.f1855f;
        int i4 = (hashCode3 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        p pVar = this.f1856g;
        return i4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f1850a + ", eventCode=" + this.f1851b + ", eventUptimeMs=" + this.f1852c + ", sourceExtension=" + Arrays.toString(this.f1853d) + ", sourceExtensionJsonProto3=" + this.f1854e + ", timezoneOffsetSeconds=" + this.f1855f + ", networkConnectionInfo=" + this.f1856g + "}";
    }
}
