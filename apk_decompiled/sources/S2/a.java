package S2;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a implements GenericArrayType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f1580a;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f1580a = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f1580a;
    }

    public final int hashCode() {
        return this.f1580a.hashCode();
    }

    public final String toString() {
        return d.i(this.f1580a) + "[]";
    }
}
