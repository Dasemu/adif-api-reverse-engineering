package Z2;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class w extends x {

    /* renamed from: j, reason: collision with root package name */
    public Object[] f2302j;

    /* renamed from: k, reason: collision with root package name */
    public String f2303k;

    @Override // Z2.x
    public final x O() {
        if (b0() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f2303k != null) {
            throw new IllegalStateException("Dangling name: " + this.f2303k);
        }
        int i = this.f2304a;
        int i4 = this.i;
        if (i == (~i4)) {
            this.i = ~i4;
            return this;
        }
        this.h = false;
        int i5 = i - 1;
        this.f2304a = i5;
        this.f2302j[i5] = null;
        this.f2306c[i5] = null;
        int[] iArr = this.f2307d;
        int i6 = i - 2;
        iArr[i6] = iArr[i6] + 1;
        return this;
    }

    @Override // Z2.x
    public final x Z(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f2304a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (b0() != 3 || this.f2303k != null || this.h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f2303k = str;
        this.f2306c[this.f2304a - 1] = str;
        return this;
    }

    @Override // Z2.x
    public final x a0() {
        if (this.h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + Y());
        }
        j0(null);
        int[] iArr = this.f2307d;
        int i = this.f2304a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f2304a;
        if (i > 1 || (i == 1 && this.f2305b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f2304a = 0;
    }

    @Override // Z2.x
    public final x d() {
        if (this.h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + Y());
        }
        int i = this.f2304a;
        int i4 = this.i;
        if (i == i4 && this.f2305b[i - 1] == 1) {
            this.i = ~i4;
            return this;
        }
        s();
        ArrayList arrayList = new ArrayList();
        j0(arrayList);
        Object[] objArr = this.f2302j;
        int i5 = this.f2304a;
        objArr[i5] = arrayList;
        this.f2307d[i5] = 0;
        c0(1);
        return this;
    }

    @Override // Z2.x
    public final x e() {
        if (this.h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + Y());
        }
        int i = this.f2304a;
        int i4 = this.i;
        if (i == i4 && this.f2305b[i - 1] == 3) {
            this.i = ~i4;
            return this;
        }
        s();
        C c4 = new C();
        j0(c4);
        this.f2302j[this.f2304a] = c4;
        c0(3);
        return this;
    }

    @Override // Z2.x
    public final x e0(double d4) {
        if (!this.f2309f && (Double.isNaN(d4) || d4 == Double.NEGATIVE_INFINITY || d4 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
        if (this.h) {
            this.h = false;
            Z(Double.toString(d4));
            return this;
        }
        j0(Double.valueOf(d4));
        int[] iArr = this.f2307d;
        int i = this.f2304a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // Z2.x
    public final x f0(long j4) {
        if (this.h) {
            this.h = false;
            Z(Long.toString(j4));
            return this;
        }
        j0(Long.valueOf(j4));
        int[] iArr = this.f2307d;
        int i = this.f2304a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f2304a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // Z2.x
    public final x g0(Float f2) {
        if (f2 != null) {
            e0(f2.doubleValue());
            return this;
        }
        if (f2 == null) {
            a0();
            return this;
        }
        BigDecimal bigDecimal = new BigDecimal(f2.toString());
        if (this.h) {
            this.h = false;
            Z(bigDecimal.toString());
            return this;
        }
        j0(bigDecimal);
        int[] iArr = this.f2307d;
        int i = this.f2304a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // Z2.x
    public final x h0(String str) {
        if (this.h) {
            this.h = false;
            Z(str);
            return this;
        }
        j0(str);
        int[] iArr = this.f2307d;
        int i = this.f2304a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // Z2.x
    public final x i0(boolean z3) {
        if (this.h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + Y());
        }
        j0(Boolean.valueOf(z3));
        int[] iArr = this.f2307d;
        int i = this.f2304a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void j0(Serializable serializable) {
        String str;
        Object put;
        int b02 = b0();
        int i = this.f2304a;
        if (i == 1) {
            if (b02 != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            int i4 = i - 1;
            this.f2305b[i4] = 7;
            this.f2302j[i4] = serializable;
            return;
        }
        if (b02 != 3 || (str = this.f2303k) == null) {
            if (b02 == 1) {
                ((List) this.f2302j[i - 1]).add(serializable);
                return;
            } else {
                if (b02 != 9) {
                    throw new IllegalStateException("Nesting problem.");
                }
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
        }
        if ((serializable == null && !this.f2310g) || (put = ((Map) this.f2302j[i - 1]).put(str, serializable)) == null) {
            this.f2303k = null;
            return;
        }
        throw new IllegalArgumentException("Map key '" + this.f2303k + "' has multiple values at path " + Y() + ": " + put + " and " + serializable);
    }

    @Override // Z2.x
    public final x x() {
        if (b0() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i = this.f2304a;
        int i4 = this.i;
        if (i == (~i4)) {
            this.i = ~i4;
            return this;
        }
        int i5 = i - 1;
        this.f2304a = i5;
        this.f2302j[i5] = null;
        int[] iArr = this.f2307d;
        int i6 = i - 2;
        iArr[i6] = iArr[i6] + 1;
        return this;
    }
}
