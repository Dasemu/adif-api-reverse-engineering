package Z2;

import java.io.IOException;
import r3.InterfaceC0577i;

/* loaded from: classes3.dex */
public final class t extends x {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f2294m = new String[128];

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0577i f2295j;

    /* renamed from: k, reason: collision with root package name */
    public String f2296k = ":";

    /* renamed from: l, reason: collision with root package name */
    public String f2297l;

    static {
        for (int i = 0; i <= 31; i++) {
            f2294m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f2294m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public t(InterfaceC0577i interfaceC0577i) {
        if (interfaceC0577i == null) {
            throw new NullPointerException("sink == null");
        }
        this.f2295j = interfaceC0577i;
        c0(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n0(r3.InterfaceC0577i r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = Z2.t.f2294m
            r1 = 34
            r7.y(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.f(r8, r4, r3)
        L2e:
            r7.Q(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.f(r8, r4, r2)
        L3b:
            r7.y(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.t.n0(r3.i, java.lang.String):void");
    }

    @Override // Z2.x
    public final x O() {
        this.h = false;
        k0(3, 5, '}');
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
        int b02 = b0();
        if ((b02 != 3 && b02 != 5) || this.f2297l != null || this.h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f2297l = str;
        this.f2306c[this.f2304a - 1] = str;
        return this;
    }

    @Override // Z2.x
    public final x a0() {
        if (this.h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + Y());
        }
        if (this.f2297l != null) {
            if (!this.f2310g) {
                this.f2297l = null;
                return this;
            }
            o0();
        }
        j0();
        this.f2295j.Q("null");
        int[] iArr = this.f2307d;
        int i = this.f2304a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2295j.close();
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
        o0();
        m0(1, 2, '[');
        return this;
    }

    @Override // Z2.x
    public final void d0(String str) {
        super.d0(str);
        this.f2296k = !str.isEmpty() ? ": " : ":";
    }

    @Override // Z2.x
    public final x e() {
        if (this.h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + Y());
        }
        o0();
        m0(3, 5, '{');
        return this;
    }

    @Override // Z2.x
    public final x e0(double d4) {
        if (!this.f2309f && (Double.isNaN(d4) || Double.isInfinite(d4))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
        if (this.h) {
            this.h = false;
            Z(Double.toString(d4));
            return this;
        }
        o0();
        j0();
        this.f2295j.Q(Double.toString(d4));
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
        o0();
        j0();
        this.f2295j.Q(Long.toString(j4));
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
        this.f2295j.flush();
    }

    @Override // Z2.x
    public final x g0(Float f2) {
        if (f2 == null) {
            a0();
            return this;
        }
        String obj = f2.toString();
        if (!this.f2309f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f2);
        }
        if (this.h) {
            this.h = false;
            Z(obj);
            return this;
        }
        o0();
        j0();
        this.f2295j.Q(obj);
        int[] iArr = this.f2307d;
        int i = this.f2304a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // Z2.x
    public final x h0(String str) {
        if (str == null) {
            a0();
            return this;
        }
        if (this.h) {
            this.h = false;
            Z(str);
            return this;
        }
        o0();
        j0();
        n0(this.f2295j, str);
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
        o0();
        j0();
        this.f2295j.Q(z3 ? "true" : "false");
        int[] iArr = this.f2307d;
        int i = this.f2304a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void j0() {
        int b02 = b0();
        int i = 2;
        if (b02 != 1) {
            InterfaceC0577i interfaceC0577i = this.f2295j;
            if (b02 != 2) {
                if (b02 == 4) {
                    interfaceC0577i.Q(this.f2296k);
                    i = 5;
                } else {
                    if (b02 == 9) {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                    if (b02 != 6) {
                        if (b02 != 7) {
                            throw new IllegalStateException("Nesting problem.");
                        }
                        if (!this.f2309f) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    }
                    i = 7;
                }
                this.f2305b[this.f2304a - 1] = i;
            }
            interfaceC0577i.y(44);
        }
        l0();
        this.f2305b[this.f2304a - 1] = i;
    }

    public final void k0(int i, int i4, char c4) {
        int b02 = b0();
        if (b02 != i4 && b02 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f2297l != null) {
            throw new IllegalStateException("Dangling name: " + this.f2297l);
        }
        int i5 = this.f2304a;
        int i6 = ~this.i;
        if (i5 == i6) {
            this.i = i6;
            return;
        }
        int i7 = i5 - 1;
        this.f2304a = i7;
        this.f2306c[i7] = null;
        int[] iArr = this.f2307d;
        int i8 = i5 - 2;
        iArr[i8] = iArr[i8] + 1;
        if (b02 == i4) {
            l0();
        }
        this.f2295j.y(c4);
    }

    public final void l0() {
        if (this.f2308e == null) {
            return;
        }
        InterfaceC0577i interfaceC0577i = this.f2295j;
        interfaceC0577i.y(10);
        int i = this.f2304a;
        for (int i4 = 1; i4 < i; i4++) {
            interfaceC0577i.Q(this.f2308e);
        }
    }

    public final void m0(int i, int i4, char c4) {
        int i5;
        int i6 = this.f2304a;
        int i7 = this.i;
        if (i6 == i7 && ((i5 = this.f2305b[i6 - 1]) == i || i5 == i4)) {
            this.i = ~i7;
            return;
        }
        j0();
        s();
        c0(i);
        this.f2307d[this.f2304a - 1] = 0;
        this.f2295j.y(c4);
    }

    public final void o0() {
        if (this.f2297l != null) {
            int b02 = b0();
            InterfaceC0577i interfaceC0577i = this.f2295j;
            if (b02 == 5) {
                interfaceC0577i.y(44);
            } else if (b02 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            l0();
            this.f2305b[this.f2304a - 1] = 4;
            n0(interfaceC0577i, this.f2297l);
            this.f2297l = null;
        }
    }

    @Override // Z2.x
    public final x x() {
        k0(1, 2, ']');
        return this;
    }
}
