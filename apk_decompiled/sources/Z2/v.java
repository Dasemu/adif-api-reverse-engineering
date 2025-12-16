package Z2;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class v extends r {
    public static final Object h = new Object();

    /* renamed from: g, reason: collision with root package name */
    public Object[] f2301g;

    @Override // Z2.r
    public final boolean Y() {
        int i = this.f2280a;
        if (i == 0) {
            return false;
        }
        Object obj = this.f2301g[i - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // Z2.r
    public final boolean Z() {
        Boolean bool = (Boolean) s0(Boolean.class, q.h);
        r0();
        return bool.booleanValue();
    }

    @Override // Z2.r
    public final double a0() {
        double parseDouble;
        q qVar = q.f2277g;
        Object s02 = s0(Object.class, qVar);
        if (s02 instanceof Number) {
            parseDouble = ((Number) s02).doubleValue();
        } else {
            if (!(s02 instanceof String)) {
                throw o0(s02, qVar);
            }
            try {
                parseDouble = Double.parseDouble((String) s02);
            } catch (NumberFormatException unused) {
                throw o0(s02, qVar);
            }
        }
        if (this.f2284e || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            r0();
            return parseDouble;
        }
        throw new IOException("JSON forbids NaN and infinities: " + parseDouble + " at path " + O());
    }

    @Override // Z2.r
    public final int b0() {
        int intValueExact;
        q qVar = q.f2277g;
        Object s02 = s0(Object.class, qVar);
        if (s02 instanceof Number) {
            intValueExact = ((Number) s02).intValue();
        } else {
            if (!(s02 instanceof String)) {
                throw o0(s02, qVar);
            }
            try {
                try {
                    intValueExact = Integer.parseInt((String) s02);
                } catch (NumberFormatException unused) {
                    throw o0(s02, qVar);
                }
            } catch (NumberFormatException unused2) {
                intValueExact = new BigDecimal((String) s02).intValueExact();
            }
        }
        r0();
        return intValueExact;
    }

    @Override // Z2.r
    public final long c0() {
        long longValueExact;
        q qVar = q.f2277g;
        Object s02 = s0(Object.class, qVar);
        if (s02 instanceof Number) {
            longValueExact = ((Number) s02).longValue();
        } else {
            if (!(s02 instanceof String)) {
                throw o0(s02, qVar);
            }
            try {
                try {
                    longValueExact = Long.parseLong((String) s02);
                } catch (NumberFormatException unused) {
                    throw o0(s02, qVar);
                }
            } catch (NumberFormatException unused2) {
                longValueExact = new BigDecimal((String) s02).longValueExact();
            }
        }
        r0();
        return longValueExact;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Arrays.fill(this.f2301g, 0, this.f2280a, (Object) null);
        this.f2301g[0] = h;
        this.f2281b[0] = 8;
        this.f2280a = 1;
    }

    @Override // Z2.r
    public final void d() {
        List list = (List) s0(List.class, q.f2271a);
        u uVar = new u(q.f2272b, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f2301g;
        int i = this.f2280a;
        objArr[i - 1] = uVar;
        this.f2281b[i - 1] = 1;
        this.f2283d[i - 1] = 0;
        if (uVar.hasNext()) {
            q0(uVar.next());
        }
    }

    @Override // Z2.r
    public final void d0() {
        s0(Void.class, q.i);
        r0();
    }

    @Override // Z2.r
    public final void e() {
        Map map = (Map) s0(Map.class, q.f2273c);
        u uVar = new u(q.f2274d, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f2301g;
        int i = this.f2280a;
        objArr[i - 1] = uVar;
        this.f2281b[i - 1] = 3;
        if (uVar.hasNext()) {
            q0(uVar.next());
        }
    }

    @Override // Z2.r
    public final String e0() {
        int i = this.f2280a;
        Object obj = i != 0 ? this.f2301g[i - 1] : null;
        if (obj instanceof String) {
            r0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            r0();
            return obj.toString();
        }
        if (obj == h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw o0(obj, q.f2276f);
    }

    @Override // Z2.r
    public final q f0() {
        int i = this.f2280a;
        if (i == 0) {
            return q.f2278j;
        }
        Object obj = this.f2301g[i - 1];
        if (obj instanceof u) {
            return ((u) obj).f2298a;
        }
        if (obj instanceof List) {
            return q.f2271a;
        }
        if (obj instanceof Map) {
            return q.f2273c;
        }
        if (obj instanceof Map.Entry) {
            return q.f2275e;
        }
        if (obj instanceof String) {
            return q.f2276f;
        }
        if (obj instanceof Boolean) {
            return q.h;
        }
        if (obj instanceof Number) {
            return q.f2277g;
        }
        if (obj == null) {
            return q.i;
        }
        if (obj == h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw o0(obj, "a JSON value");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z2.r, Z2.v] */
    @Override // Z2.r
    public final r g0() {
        ?? rVar = new r(this);
        rVar.f2301g = (Object[]) this.f2301g.clone();
        for (int i = 0; i < rVar.f2280a; i++) {
            Object[] objArr = rVar.f2301g;
            Object obj = objArr[i];
            if (obj instanceof u) {
                u uVar = (u) obj;
                objArr[i] = new u(uVar.f2298a, uVar.f2299b, uVar.f2300c);
            }
        }
        return rVar;
    }

    @Override // Z2.r
    public final void h0() {
        if (Y()) {
            q0(p0());
        }
    }

    @Override // Z2.r
    public final int j0(p pVar) {
        q qVar = q.f2275e;
        Map.Entry entry = (Map.Entry) s0(Map.Entry.class, qVar);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw o0(key, qVar);
        }
        String str = (String) key;
        int length = pVar.f2269a.length;
        for (int i = 0; i < length; i++) {
            if (pVar.f2269a[i].equals(str)) {
                this.f2301g[this.f2280a - 1] = entry.getValue();
                this.f2282c[this.f2280a - 2] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // Z2.r
    public final int k0(p pVar) {
        int i = this.f2280a;
        Object obj = i != 0 ? this.f2301g[i - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != h) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = pVar.f2269a.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (pVar.f2269a[i4].equals(str)) {
                r0();
                return i4;
            }
        }
        return -1;
    }

    @Override // Z2.r
    public final void l0() {
        if (!this.f2285f) {
            this.f2301g[this.f2280a - 1] = ((Map.Entry) s0(Map.Entry.class, q.f2275e)).getValue();
            this.f2282c[this.f2280a - 2] = "null";
        } else {
            q f02 = f0();
            p0();
            throw new RuntimeException("Cannot skip unexpected " + f02 + " at " + O());
        }
    }

    @Override // Z2.r
    public final void m0() {
        if (this.f2285f) {
            throw new RuntimeException("Cannot skip unexpected " + f0() + " at " + O());
        }
        int i = this.f2280a;
        if (i > 1) {
            this.f2282c[i - 2] = "null";
        }
        Object obj = i != 0 ? this.f2301g[i - 1] : null;
        if (obj instanceof u) {
            throw new RuntimeException("Expected a value but was " + f0() + " at path " + O());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f2301g;
            int i4 = i - 1;
            objArr[i4] = ((Map.Entry) objArr[i4]).getValue();
        } else {
            if (i > 0) {
                r0();
                return;
            }
            throw new RuntimeException("Expected a value but was " + f0() + " at path " + O());
        }
    }

    public final String p0() {
        q qVar = q.f2275e;
        Map.Entry entry = (Map.Entry) s0(Map.Entry.class, qVar);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw o0(key, qVar);
        }
        String str = (String) key;
        this.f2301g[this.f2280a - 1] = entry.getValue();
        this.f2282c[this.f2280a - 2] = str;
        return str;
    }

    public final void q0(Object obj) {
        int i = this.f2280a;
        if (i == this.f2301g.length) {
            if (i == 256) {
                throw new RuntimeException("Nesting too deep at " + O());
            }
            int[] iArr = this.f2281b;
            this.f2281b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f2282c;
            this.f2282c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f2283d;
            this.f2283d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f2301g;
            this.f2301g = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f2301g;
        int i4 = this.f2280a;
        this.f2280a = i4 + 1;
        objArr2[i4] = obj;
    }

    public final void r0() {
        int i = this.f2280a;
        int i4 = i - 1;
        this.f2280a = i4;
        Object[] objArr = this.f2301g;
        objArr[i4] = null;
        this.f2281b[i4] = 0;
        if (i4 > 0) {
            int[] iArr = this.f2283d;
            int i5 = i - 2;
            iArr[i5] = iArr[i5] + 1;
            Object obj = objArr[i - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    q0(it.next());
                }
            }
        }
    }

    @Override // Z2.r
    public final void s() {
        q qVar = q.f2272b;
        u uVar = (u) s0(u.class, qVar);
        if (uVar.f2298a != qVar || uVar.hasNext()) {
            throw o0(uVar, qVar);
        }
        r0();
    }

    public final Object s0(Class cls, q qVar) {
        int i = this.f2280a;
        Object obj = i != 0 ? this.f2301g[i - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && qVar == q.i) {
            return null;
        }
        if (obj == h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw o0(obj, qVar);
    }

    @Override // Z2.r
    public final void x() {
        q qVar = q.f2274d;
        u uVar = (u) s0(u.class, qVar);
        if (uVar.f2298a != qVar || uVar.hasNext()) {
            throw o0(uVar, qVar);
        }
        this.f2282c[this.f2280a - 1] = null;
        r0();
    }
}
