package T0;

import kotlin.jvm.internal.Intrinsics;
import m3.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f1642c;

    /* renamed from: a, reason: collision with root package name */
    public final l f1643a;

    /* renamed from: b, reason: collision with root package name */
    public final l f1644b;

    static {
        b bVar = b.f1632a;
        f1642c = new h(bVar, bVar);
    }

    public h(l lVar, l lVar2) {
        this.f1643a = lVar;
        this.f1644b = lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f1643a, hVar.f1643a) && Intrinsics.areEqual(this.f1644b, hVar.f1644b);
    }

    public final int hashCode() {
        return this.f1644b.hashCode() + (this.f1643a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f1643a + ", height=" + this.f1644b + ')';
    }
}
