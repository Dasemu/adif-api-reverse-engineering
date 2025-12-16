package G;

import C.w;
import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f557e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f558a;

    /* renamed from: b, reason: collision with root package name */
    public final int f559b;

    /* renamed from: c, reason: collision with root package name */
    public final int f560c;

    /* renamed from: d, reason: collision with root package name */
    public final int f561d;

    public c(int i, int i4, int i5, int i6) {
        this.f558a = i;
        this.f559b = i4;
        this.f560c = i5;
        this.f561d = i6;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f558a, cVar2.f558a), Math.max(cVar.f559b, cVar2.f559b), Math.max(cVar.f560c, cVar2.f560c), Math.max(cVar.f561d, cVar2.f561d));
    }

    public static c b(int i, int i4, int i5, int i6) {
        return (i == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f557e : new c(i, i4, i5, i6);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f558a, this.f559b, this.f560c, this.f561d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f561d == cVar.f561d && this.f558a == cVar.f558a && this.f560c == cVar.f560c && this.f559b == cVar.f559b;
    }

    public final int hashCode() {
        return (((((this.f558a * 31) + this.f559b) * 31) + this.f560c) * 31) + this.f561d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f558a);
        sb.append(", top=");
        sb.append(this.f559b);
        sb.append(", right=");
        sb.append(this.f560c);
        sb.append(", bottom=");
        return w.p(sb, this.f561d, '}');
    }
}
