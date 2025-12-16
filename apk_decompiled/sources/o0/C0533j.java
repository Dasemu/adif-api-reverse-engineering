package o0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: o0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533j {

    /* renamed from: a, reason: collision with root package name */
    public final T f7996a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7997b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7998c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7999d;

    public C0533j(T type, boolean z3, Object obj, boolean z4) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!type.f7963a && z3) {
            throw new IllegalArgumentException(type.b().concat(" does not allow nullable values").toString());
        }
        if (!z3 && z4 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.b() + " has null value but is not nullable.").toString());
        }
        this.f7996a = type;
        this.f7997b = z3;
        this.f7999d = obj;
        this.f7998c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(C0533j.class, obj.getClass())) {
            C0533j c0533j = (C0533j) obj;
            if (this.f7997b != c0533j.f7997b || this.f7998c != c0533j.f7998c || !Intrinsics.areEqual(this.f7996a, c0533j.f7996a)) {
                return false;
            }
            Object obj2 = c0533j.f7999d;
            Object obj3 = this.f7999d;
            if (obj3 != null) {
                return Intrinsics.areEqual(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f7996a.hashCode() * 31) + (this.f7997b ? 1 : 0)) * 31) + (this.f7998c ? 1 : 0)) * 31;
        Object obj = this.f7999d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0533j.class.getSimpleName());
        sb.append(" Type: " + this.f7996a);
        sb.append(" Nullable: " + this.f7997b);
        if (this.f7998c) {
            sb.append(" DefaultValue: " + this.f7999d);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
