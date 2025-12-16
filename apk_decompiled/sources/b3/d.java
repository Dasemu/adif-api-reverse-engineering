package b3;

import Z2.L;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes3.dex */
public final class d implements ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f4188a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f4189b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f4190c;

    public d(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || L.d(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        this.f4188a = type == null ? null : f.a(type);
        this.f4189b = f.a(type2);
        this.f4190c = (Type[]) typeArr.clone();
        int i = 0;
        while (true) {
            Type[] typeArr2 = this.f4190c;
            if (i >= typeArr2.length) {
                return;
            }
            typeArr2[i].getClass();
            f.b(this.f4190c[i]);
            Type[] typeArr3 = this.f4190c;
            typeArr3[i] = f.a(typeArr3[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && L.b(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f4190c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f4188a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f4189b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f4190c) ^ this.f4189b.hashCode();
        Set set = f.f4193a;
        Type type = this.f4188a;
        return (type != null ? type.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f4190c;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(f.k(this.f4189b));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(f.k(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(f.k(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
