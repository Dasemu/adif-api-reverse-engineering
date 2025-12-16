package Q2;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class k extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f1390a;

    public k(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f1390a = bool;
    }

    public static boolean c(k kVar) {
        Serializable serializable = kVar.f1390a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final Number a() {
        Serializable serializable = this.f1390a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new S2.j((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String b() {
        Serializable serializable = this.f1390a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return a().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        Serializable serializable = this.f1390a;
        Serializable serializable2 = kVar.f1390a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (c(this) && c(kVar)) {
            return a().longValue() == kVar.a().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double doubleValue = a().doubleValue();
        double doubleValue2 = kVar.a().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f1390a;
        if (serializable == null) {
            return 31;
        }
        if (c(this)) {
            doubleToLongBits = a().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(a().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public k(Number number) {
        Objects.requireNonNull(number);
        this.f1390a = number;
    }

    public k(String str) {
        Objects.requireNonNull(str);
        this.f1390a = str;
    }
}
