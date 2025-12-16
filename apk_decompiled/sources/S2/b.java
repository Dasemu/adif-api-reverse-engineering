package S2;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b implements ParameterizedType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f1581a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f1582b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f1583c;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z3 = true;
            boolean z4 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z4) {
                z3 = false;
            }
            d.b(z3);
        }
        this.f1581a = type == null ? null : d.a(type);
        this.f1582b = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f1583c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f1583c[i]);
            d.c(this.f1583c[i]);
            Type[] typeArr3 = this.f1583c;
            typeArr3[i] = d.a(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f1583c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f1581a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f1582b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f1583c) ^ this.f1582b.hashCode();
        Type type = this.f1581a;
        return (type != null ? type.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f1583c;
        int length = typeArr.length;
        Type type = this.f1582b;
        if (length == 0) {
            return d.i(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.i(type));
        sb.append("<");
        sb.append(d.i(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(d.i(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
