package b3;

import Z2.L;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class c implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f4187a;

    public c(Type type) {
        this.f4187a = f.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && L.b(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f4187a;
    }

    public final int hashCode() {
        return this.f4187a.hashCode();
    }

    public final String toString() {
        return f.k(this.f4187a) + "[]";
    }
}
