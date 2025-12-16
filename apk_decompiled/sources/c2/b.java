package c2;

import f0.C0338b;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0338b f4235a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4236b;

    public b(C0338b c0338b, HashMap hashMap) {
        this.f4235a = c0338b;
        this.f4236b = hashMap;
    }

    public final long a(T1.d dVar, long j4, int i) {
        long q4 = j4 - this.f4235a.q();
        c cVar = (c) this.f4236b.get(dVar);
        long j5 = cVar.f4237a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j5 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j5 > 1 ? j5 : 2L) * r12))), q4), cVar.f4238b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4235a.equals(bVar.f4235a) && this.f4236b.equals(bVar.f4236b);
    }

    public final int hashCode() {
        return this.f4236b.hashCode() ^ ((this.f4235a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f4235a + ", values=" + this.f4236b + "}";
    }
}
