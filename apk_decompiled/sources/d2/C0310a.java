package d2;

import com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCaseKt;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0310a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0310a f6171f = new C0310a(10485760, ManageLogosUseCaseKt.OPERATOR_LOGO_CACHE_TIMEOUT, 200, 10000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f6172a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6173b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6174c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6175d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6176e;

    public C0310a(long j4, long j5, int i, int i4, int i5) {
        this.f6172a = j4;
        this.f6173b = i;
        this.f6174c = i4;
        this.f6175d = j5;
        this.f6176e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0310a) {
            C0310a c0310a = (C0310a) obj;
            if (this.f6172a == c0310a.f6172a && this.f6173b == c0310a.f6173b && this.f6174c == c0310a.f6174c && this.f6175d == c0310a.f6175d && this.f6176e == c0310a.f6176e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f6172a;
        int i = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f6173b) * 1000003) ^ this.f6174c) * 1000003;
        long j5 = this.f6175d;
        return this.f6176e ^ ((i ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f6172a);
        sb.append(", loadBatchSize=");
        sb.append(this.f6173b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f6174c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f6175d);
        sb.append(", maxBlobByteSizePerRow=");
        return com.google.android.gms.measurement.internal.a.m(sb, this.f6176e, "}");
    }
}
