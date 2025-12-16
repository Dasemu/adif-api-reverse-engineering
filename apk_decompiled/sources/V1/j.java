package V1;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1841a;

    public j(ArrayList arrayList) {
        this.f1841a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return this.f1841a.equals(((j) ((q) obj)).f1841a);
    }

    public final int hashCode() {
        return this.f1841a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f1841a + "}";
    }
}
