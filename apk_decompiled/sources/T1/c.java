package T1;

import C.w;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1657a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f1657a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f1657a.equals(((c) obj).f1657a);
    }

    public final int hashCode() {
        return this.f1657a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return w.r(new StringBuilder("Encoding{name=\""), this.f1657a, "\"}");
    }
}
