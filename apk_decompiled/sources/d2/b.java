package d2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f6177a;

    /* renamed from: b, reason: collision with root package name */
    public final W1.j f6178b;

    /* renamed from: c, reason: collision with root package name */
    public final W1.i f6179c;

    public b(long j4, W1.j jVar, W1.i iVar) {
        this.f6177a = j4;
        this.f6178b = jVar;
        this.f6179c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f6177a == bVar.f6177a && this.f6178b.equals(bVar.f6178b) && this.f6179c.equals(bVar.f6179c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f6177a;
        return this.f6179c.hashCode() ^ ((((((int) ((j4 >>> 32) ^ j4)) ^ 1000003) * 1000003) ^ this.f6178b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f6177a + ", transportContext=" + this.f6178b + ", event=" + this.f6179c + "}";
    }
}
