package u0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f8606a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8607b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8608c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8609d;

    public d(String from, int i, int i4, String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.f8606a = i;
        this.f8607b = i4;
        this.f8608c = from;
        this.f8609d = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d other = (d) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i = this.f8606a - other.f8606a;
        return i == 0 ? this.f8607b - other.f8607b : i;
    }
}
