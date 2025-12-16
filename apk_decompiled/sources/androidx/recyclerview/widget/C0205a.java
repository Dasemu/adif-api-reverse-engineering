package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205a {

    /* renamed from: a, reason: collision with root package name */
    public int f3782a;

    /* renamed from: b, reason: collision with root package name */
    public int f3783b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3784c;

    /* renamed from: d, reason: collision with root package name */
    public int f3785d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0205a)) {
                return false;
            }
            C0205a c0205a = (C0205a) obj;
            int i = this.f3782a;
            if (i != c0205a.f3782a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f3785d - this.f3783b) != 1 || this.f3785d != c0205a.f3783b || this.f3783b != c0205a.f3785d) {
                if (this.f3785d != c0205a.f3785d || this.f3783b != c0205a.f3783b) {
                    return false;
                }
                Object obj2 = this.f3784c;
                if (obj2 != null) {
                    if (!obj2.equals(c0205a.f3784c)) {
                        return false;
                    }
                } else if (c0205a.f3784c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f3782a * 31) + this.f3783b) * 31) + this.f3785d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f3782a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f3783b);
        sb.append("c:");
        sb.append(this.f3785d);
        sb.append(",p:");
        sb.append(this.f3784c);
        sb.append("]");
        return sb.toString();
    }
}
