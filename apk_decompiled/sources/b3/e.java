package b3;

import Z2.L;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes3.dex */
public final class e implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f4191a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f4192b;

    public e(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            f.b(typeArr[0]);
            this.f4192b = null;
            this.f4191a = f.a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        f.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f4192b = f.a(typeArr2[0]);
        this.f4191a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && L.b(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f4192b;
        return type != null ? new Type[]{type} : f.f4194b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f4191a};
    }

    public final int hashCode() {
        Type type = this.f4192b;
        return (this.f4191a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f4192b;
        if (type != null) {
            return "? super " + f.k(type);
        }
        Type type2 = this.f4191a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + f.k(type2);
    }
}
