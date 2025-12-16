package c2;

import java.util.Set;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f4237a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4238b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f4239c;

    public c(long j4, long j5, Set set) {
        this.f4237a = j4;
        this.f4238b = j5;
        this.f4239c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f4237a == cVar.f4237a && this.f4238b == cVar.f4238b && this.f4239c.equals(cVar.f4239c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f4237a;
        int i = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j5 = this.f4238b;
        return this.f4239c.hashCode() ^ ((i ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f4237a + ", maxAllowedDelay=" + this.f4238b + ", flags=" + this.f4239c + "}";
    }
}
