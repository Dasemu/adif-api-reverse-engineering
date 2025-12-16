package S2;

import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class j extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f1601a;

    public j(String str) {
        this.f1601a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f1601a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        Object obj2 = ((j) obj).f1601a;
        String str = this.f1601a;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f1601a);
    }

    public final int hashCode() {
        return this.f1601a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f1601a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f1601a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f1601a;
    }
}
