package Z2;

import f0.C0338b;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import kotlin.text.Charsets;
import r3.C0576h;
import r3.C0579k;
import r3.InterfaceC0578j;

/* loaded from: classes3.dex */
public final class s extends r {

    /* renamed from: m, reason: collision with root package name */
    public static final C0579k f2286m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0579k f2287n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0579k f2288o;
    public static final C0579k p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0579k f2289q;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0578j f2290g;
    public final C0576h h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f2291j;

    /* renamed from: k, reason: collision with root package name */
    public int f2292k;

    /* renamed from: l, reason: collision with root package name */
    public String f2293l;

    static {
        C0579k c0579k = C0579k.f8285d;
        f2286m = C0338b.n("'\\");
        f2287n = C0338b.n("\"\\");
        f2288o = C0338b.n("{}[]:, \n\t\r\f/\\;#=");
        p = C0338b.n("\n\r");
        f2289q = C0338b.n("*/");
    }

    public s(InterfaceC0578j interfaceC0578j) {
        this.i = 0;
        if (interfaceC0578j != null) {
            this.f2290g = interfaceC0578j;
            this.h = interfaceC0578j.a();
            i0(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // Z2.r
    public final boolean Y() {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // Z2.r
    public final boolean Z() {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i == 5) {
            this.i = 0;
            int[] iArr = this.f2283d;
            int i4 = this.f2280a - 1;
            iArr[i4] = iArr[i4] + 1;
            return true;
        }
        if (i == 6) {
            this.i = 0;
            int[] iArr2 = this.f2283d;
            int i5 = this.f2280a - 1;
            iArr2[i5] = iArr2[i5] + 1;
            return false;
        }
        throw new RuntimeException("Expected a boolean but was " + f0() + " at path " + O());
    }

    @Override // Z2.r
    public final double a0() {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i == 16) {
            this.i = 0;
            int[] iArr = this.f2283d;
            int i4 = this.f2280a - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f2291j;
        }
        if (i == 17) {
            long j4 = this.f2292k;
            C0576h c0576h = this.h;
            c0576h.getClass();
            this.f2293l = c0576h.d0(j4, Charsets.UTF_8);
        } else if (i == 9) {
            this.f2293l = w0(f2287n);
        } else if (i == 8) {
            this.f2293l = w0(f2286m);
        } else if (i == 10) {
            this.f2293l = x0();
        } else if (i != 11) {
            throw new RuntimeException("Expected a double but was " + f0() + " at path " + O());
        }
        this.i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f2293l);
            if (!this.f2284e && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new IOException("JSON forbids NaN and infinities: " + parseDouble + " at path " + O());
            }
            this.f2293l = null;
            this.i = 0;
            int[] iArr2 = this.f2283d;
            int i5 = this.f2280a - 1;
            iArr2[i5] = iArr2[i5] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new RuntimeException("Expected a double but was " + this.f2293l + " at path " + O());
        }
    }

    @Override // Z2.r
    public final int b0() {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i == 16) {
            long j4 = this.f2291j;
            int i4 = (int) j4;
            if (j4 == i4) {
                this.i = 0;
                int[] iArr = this.f2283d;
                int i5 = this.f2280a - 1;
                iArr[i5] = iArr[i5] + 1;
                return i4;
            }
            throw new RuntimeException("Expected an int but was " + this.f2291j + " at path " + O());
        }
        if (i == 17) {
            long j5 = this.f2292k;
            C0576h c0576h = this.h;
            c0576h.getClass();
            this.f2293l = c0576h.d0(j5, Charsets.UTF_8);
        } else if (i == 9 || i == 8) {
            String w02 = i == 9 ? w0(f2287n) : w0(f2286m);
            this.f2293l = w02;
            try {
                int parseInt = Integer.parseInt(w02);
                this.i = 0;
                int[] iArr2 = this.f2283d;
                int i6 = this.f2280a - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new RuntimeException("Expected an int but was " + f0() + " at path " + O());
        }
        this.i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f2293l);
            int i7 = (int) parseDouble;
            if (i7 != parseDouble) {
                throw new RuntimeException("Expected an int but was " + this.f2293l + " at path " + O());
            }
            this.f2293l = null;
            this.i = 0;
            int[] iArr3 = this.f2283d;
            int i8 = this.f2280a - 1;
            iArr3[i8] = iArr3[i8] + 1;
            return i7;
        } catch (NumberFormatException unused2) {
            throw new RuntimeException("Expected an int but was " + this.f2293l + " at path " + O());
        }
    }

    @Override // Z2.r
    public final long c0() {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i == 16) {
            this.i = 0;
            int[] iArr = this.f2283d;
            int i4 = this.f2280a - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f2291j;
        }
        if (i == 17) {
            long j4 = this.f2292k;
            C0576h c0576h = this.h;
            c0576h.getClass();
            this.f2293l = c0576h.d0(j4, Charsets.UTF_8);
        } else if (i == 9 || i == 8) {
            String w02 = i == 9 ? w0(f2287n) : w0(f2286m);
            this.f2293l = w02;
            try {
                long parseLong = Long.parseLong(w02);
                this.i = 0;
                int[] iArr2 = this.f2283d;
                int i5 = this.f2280a - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new RuntimeException("Expected a long but was " + f0() + " at path " + O());
        }
        this.i = 11;
        try {
            long longValueExact = new BigDecimal(this.f2293l).longValueExact();
            this.f2293l = null;
            this.i = 0;
            int[] iArr3 = this.f2283d;
            int i6 = this.f2280a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new RuntimeException("Expected a long but was " + this.f2293l + " at path " + O());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i = 0;
        this.f2281b[0] = 8;
        this.f2280a = 1;
        this.h.d();
        this.f2290g.close();
    }

    @Override // Z2.r
    public final void d() {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i == 3) {
            i0(1);
            this.f2283d[this.f2280a - 1] = 0;
            this.i = 0;
        } else {
            throw new RuntimeException("Expected BEGIN_ARRAY but was " + f0() + " at path " + O());
        }
    }

    @Override // Z2.r
    public final void d0() {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i == 7) {
            this.i = 0;
            int[] iArr = this.f2283d;
            int i4 = this.f2280a - 1;
            iArr[i4] = iArr[i4] + 1;
            return;
        }
        throw new RuntimeException("Expected null but was " + f0() + " at path " + O());
    }

    @Override // Z2.r
    public final void e() {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i == 1) {
            i0(3);
            this.i = 0;
        } else {
            throw new RuntimeException("Expected BEGIN_OBJECT but was " + f0() + " at path " + O());
        }
    }

    @Override // Z2.r
    public final String e0() {
        String d02;
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i == 10) {
            d02 = x0();
        } else if (i == 9) {
            d02 = w0(f2287n);
        } else if (i == 8) {
            d02 = w0(f2286m);
        } else if (i == 11) {
            d02 = this.f2293l;
            this.f2293l = null;
        } else if (i == 16) {
            d02 = Long.toString(this.f2291j);
        } else {
            if (i != 17) {
                throw new RuntimeException("Expected a string but was " + f0() + " at path " + O());
            }
            long j4 = this.f2292k;
            C0576h c0576h = this.h;
            c0576h.getClass();
            d02 = c0576h.d0(j4, Charsets.UTF_8);
        }
        this.i = 0;
        int[] iArr = this.f2283d;
        int i4 = this.f2280a - 1;
        iArr[i4] = iArr[i4] + 1;
        return d02;
    }

    @Override // Z2.r
    public final q f0() {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        switch (i) {
            case 1:
                return q.f2273c;
            case 2:
                return q.f2274d;
            case 3:
                return q.f2271a;
            case 4:
                return q.f2272b;
            case 5:
            case 6:
                return q.h;
            case 7:
                return q.i;
            case 8:
            case 9:
            case 10:
            case 11:
                return q.f2276f;
            case 12:
            case 13:
            case 14:
            case 15:
                return q.f2275e;
            case 16:
            case 17:
                return q.f2277g;
            case 18:
                return q.f2278j;
            default:
                throw new AssertionError();
        }
    }

    @Override // Z2.r
    public final r g0() {
        return new s(this);
    }

    @Override // Z2.r
    public final void h0() {
        if (Y()) {
            this.f2293l = u0();
            this.i = 11;
        }
    }

    @Override // Z2.r
    public final int j0(p pVar) {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return r0(this.f2293l, pVar);
        }
        int C3 = this.f2290g.C(pVar.f2270b);
        if (C3 != -1) {
            this.i = 0;
            this.f2282c[this.f2280a - 1] = pVar.f2269a[C3];
            return C3;
        }
        String str = this.f2282c[this.f2280a - 1];
        String u02 = u0();
        int r02 = r0(u02, pVar);
        if (r02 == -1) {
            this.i = 15;
            this.f2293l = u02;
            this.f2282c[this.f2280a - 1] = str;
        }
        return r02;
    }

    @Override // Z2.r
    public final int k0(p pVar) {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return s0(this.f2293l, pVar);
        }
        int C3 = this.f2290g.C(pVar.f2270b);
        if (C3 != -1) {
            this.i = 0;
            int[] iArr = this.f2283d;
            int i4 = this.f2280a - 1;
            iArr[i4] = iArr[i4] + 1;
            return C3;
        }
        String e02 = e0();
        int s02 = s0(e02, pVar);
        if (s02 == -1) {
            this.i = 11;
            this.f2293l = e02;
            this.f2283d[this.f2280a - 1] = r0[r4] - 1;
        }
        return s02;
    }

    @Override // Z2.r
    public final void l0() {
        if (this.f2285f) {
            q f02 = f0();
            u0();
            throw new RuntimeException("Cannot skip unexpected " + f02 + " at " + O());
        }
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i == 14) {
            long A3 = this.f2290g.A(f2288o);
            C0576h c0576h = this.h;
            if (A3 == -1) {
                A3 = c0576h.f8284b;
            }
            c0576h.l(A3);
        } else if (i == 13) {
            z0(f2287n);
        } else if (i == 12) {
            z0(f2286m);
        } else if (i != 15) {
            throw new RuntimeException("Expected a name but was " + f0() + " at path " + O());
        }
        this.i = 0;
        this.f2282c[this.f2280a - 1] = "null";
    }

    @Override // Z2.r
    public final void m0() {
        if (this.f2285f) {
            throw new RuntimeException("Cannot skip unexpected " + f0() + " at " + O());
        }
        int i = 0;
        do {
            int i4 = this.i;
            if (i4 == 0) {
                i4 = q0();
            }
            if (i4 == 3) {
                i0(1);
            } else if (i4 == 1) {
                i0(3);
            } else {
                if (i4 == 4) {
                    i--;
                    if (i < 0) {
                        throw new RuntimeException("Expected a value but was " + f0() + " at path " + O());
                    }
                    this.f2280a--;
                } else if (i4 == 2) {
                    i--;
                    if (i < 0) {
                        throw new RuntimeException("Expected a value but was " + f0() + " at path " + O());
                    }
                    this.f2280a--;
                } else {
                    C0576h c0576h = this.h;
                    if (i4 == 14 || i4 == 10) {
                        long A3 = this.f2290g.A(f2288o);
                        if (A3 == -1) {
                            A3 = c0576h.f8284b;
                        }
                        c0576h.l(A3);
                    } else if (i4 == 9 || i4 == 13) {
                        z0(f2287n);
                    } else if (i4 == 8 || i4 == 12) {
                        z0(f2286m);
                    } else if (i4 == 17) {
                        c0576h.l(this.f2292k);
                    } else if (i4 == 18) {
                        throw new RuntimeException("Expected a value but was " + f0() + " at path " + O());
                    }
                }
                this.i = 0;
            }
            i++;
            this.i = 0;
        } while (i != 0);
        int[] iArr = this.f2283d;
        int i5 = this.f2280a - 1;
        iArr[i5] = iArr[i5] + 1;
        this.f2282c[i5] = "null";
    }

    public final void p0() {
        if (this.f2284e) {
            return;
        }
        n0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01cf, code lost:
    
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d5, code lost:
    
        r23.f2291j = r8;
        r11.l(r4);
        r10 = 16;
        r23.i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d2, code lost:
    
        r8 = -r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c5, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e0, code lost:
    
        if (r2 == r3) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e3, code lost:
    
        if (r2 == 4) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e6, code lost:
    
        if (r2 != 7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e8, code lost:
    
        r23.f2292k = r4;
        r10 = 17;
        r23.i = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b5, code lost:
    
        if (t0(r7) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0146, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b8, code lost:
    
        if (r2 != 2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ba, code lost:
    
        if (r5 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c0, code lost:
    
        if (r18 != Long.MIN_VALUE) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c2, code lost:
    
        if (r6 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c9, code lost:
    
        if (r18 != r16) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cb, code lost:
    
        if (r6 != 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cd, code lost:
    
        if (r6 == 0) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q0() {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.s.q0():int");
    }

    public final int r0(String str, p pVar) {
        int length = pVar.f2269a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(pVar.f2269a[i])) {
                this.i = 0;
                this.f2282c[this.f2280a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // Z2.r
    public final void s() {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i != 4) {
            throw new RuntimeException("Expected END_ARRAY but was " + f0() + " at path " + O());
        }
        int i4 = this.f2280a;
        this.f2280a = i4 - 1;
        int[] iArr = this.f2283d;
        int i5 = i4 - 2;
        iArr[i5] = iArr[i5] + 1;
        this.i = 0;
    }

    public final int s0(String str, p pVar) {
        int length = pVar.f2269a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(pVar.f2269a[i])) {
                this.i = 0;
                int[] iArr = this.f2283d;
                int i4 = this.f2280a - 1;
                iArr[i4] = iArr[i4] + 1;
                return i;
            }
        }
        return -1;
    }

    public final boolean t0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        p0();
        return false;
    }

    public final String toString() {
        return "JsonReader(" + this.f2290g + ")";
    }

    public final String u0() {
        String str;
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i == 14) {
            str = x0();
        } else if (i == 13) {
            str = w0(f2287n);
        } else if (i == 12) {
            str = w0(f2286m);
        } else {
            if (i != 15) {
                throw new RuntimeException("Expected a name but was " + f0() + " at path " + O());
            }
            str = this.f2293l;
            this.f2293l = null;
        }
        this.i = 0;
        this.f2282c[this.f2280a - 1] = str;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r1.l(r3);
        r2 = Z2.s.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r6 != 47) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r6 != 35) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        p0();
        r5 = r5.A(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r5 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        r1.l(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        r5 = r1.f8284b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
    
        if (r5.n(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        p0();
        r10 = r1.O(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if (r10 == 42) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.u(Z2.s.f2289q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        if (r5 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        r5 = r5 + r2.f8286a.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        r1.l(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r3 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        n0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007c, code lost:
    
        r5 = r1.f8284b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0048, code lost:
    
        if (r10 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x004b, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.A(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0057, code lost:
    
        if (r5 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0059, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005d, code lost:
    
        r1.l(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005b, code lost:
    
        r5 = r1.f8284b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int v0(boolean r13) {
        /*
            r12 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r1 + 1
            long r3 = (long) r2
            r3.j r5 = r12.f2290g
            boolean r3 = r5.n(r3)
            if (r3 == 0) goto La8
            long r3 = (long) r1
            r3.h r1 = r12.h
            byte r6 = r1.O(r3)
            r7 = 10
            if (r6 == r7) goto La5
            r7 = 32
            if (r6 == r7) goto La5
            r7 = 13
            if (r6 == r7) goto La5
            r7 = 9
            if (r6 != r7) goto L26
            goto La5
        L26:
            r1.l(r3)
            r3.k r2 = Z2.s.p
            r3 = -1
            r7 = 1
            r9 = 47
            if (r6 != r9) goto L8c
            r10 = 2
            boolean r10 = r5.n(r10)
            if (r10 != 0) goto L3d
            goto La4
        L3d:
            r12.p0()
            byte r10 = r1.O(r7)
            r11 = 42
            if (r10 == r11) goto L61
            if (r10 == r9) goto L4b
            goto La4
        L4b:
            r1.readByte()
            r1.readByte()
            long r5 = r5.A(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L5b
            long r5 = r5 + r7
            goto L5d
        L5b:
            long r5 = r1.f8284b
        L5d:
            r1.l(r5)
            goto L1
        L61:
            r1.readByte()
            r1.readByte()
            r3.k r2 = Z2.s.f2289q
            long r5 = r5.u(r2)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = r0
        L74:
            if (r3 == 0) goto L7c
            byte[] r2 = r2.f8286a
            int r2 = r2.length
            long r7 = (long) r2
            long r5 = r5 + r7
            goto L7e
        L7c:
            long r5 = r1.f8284b
        L7e:
            r1.l(r5)
            if (r3 == 0) goto L85
            goto L1
        L85:
            java.lang.String r13 = "Unterminated comment"
            r12.n0(r13)
            r12 = 0
            throw r12
        L8c:
            r9 = 35
            if (r6 != r9) goto La4
            r12.p0()
            long r5 = r5.A(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L9d
            long r5 = r5 + r7
            goto L9f
        L9d:
            long r5 = r1.f8284b
        L9f:
            r1.l(r5)
            goto L1
        La4:
            return r6
        La5:
            r1 = r2
            goto L2
        La8:
            if (r13 != 0) goto Lac
            r12 = -1
            return r12
        Lac:
            java.io.EOFException r12 = new java.io.EOFException
            java.lang.String r13 = "End of input"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.s.v0(boolean):int");
    }

    public final String w0(C0579k c0579k) {
        StringBuilder sb = null;
        while (true) {
            long A3 = this.f2290g.A(c0579k);
            if (A3 == -1) {
                n0("Unterminated string");
                throw null;
            }
            C0576h c0576h = this.h;
            if (c0576h.O(A3) != 92) {
                if (sb == null) {
                    String d02 = c0576h.d0(A3, Charsets.UTF_8);
                    c0576h.readByte();
                    return d02;
                }
                sb.append(c0576h.d0(A3, Charsets.UTF_8));
                c0576h.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c0576h.d0(A3, Charsets.UTF_8));
            c0576h.readByte();
            sb.append(y0());
        }
    }

    @Override // Z2.r
    public final void x() {
        int i = this.i;
        if (i == 0) {
            i = q0();
        }
        if (i != 2) {
            throw new RuntimeException("Expected END_OBJECT but was " + f0() + " at path " + O());
        }
        int i4 = this.f2280a;
        int i5 = i4 - 1;
        this.f2280a = i5;
        this.f2282c[i5] = null;
        int[] iArr = this.f2283d;
        int i6 = i4 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.i = 0;
    }

    public final String x0() {
        long A3 = this.f2290g.A(f2288o);
        C0576h c0576h = this.h;
        if (A3 == -1) {
            return c0576h.e0();
        }
        c0576h.getClass();
        return c0576h.d0(A3, Charsets.UTF_8);
    }

    public final char y0() {
        int i;
        InterfaceC0578j interfaceC0578j = this.f2290g;
        if (!interfaceC0578j.n(1L)) {
            n0("Unterminated escape sequence");
            throw null;
        }
        C0576h c0576h = this.h;
        byte readByte = c0576h.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            if (this.f2284e) {
                return (char) readByte;
            }
            n0("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!interfaceC0578j.n(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + O());
        }
        char c4 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            byte O2 = c0576h.O(i4);
            char c5 = (char) (c4 << 4);
            if (O2 >= 48 && O2 <= 57) {
                i = O2 - 48;
            } else if (O2 >= 97 && O2 <= 102) {
                i = O2 - 87;
            } else {
                if (O2 < 65 || O2 > 70) {
                    n0("\\u".concat(c0576h.d0(4L, Charsets.UTF_8)));
                    throw null;
                }
                i = O2 - 55;
            }
            c4 = (char) (i + c5);
        }
        c0576h.l(4L);
        return c4;
    }

    public final void z0(C0579k c0579k) {
        while (true) {
            long A3 = this.f2290g.A(c0579k);
            if (A3 == -1) {
                n0("Unterminated string");
                throw null;
            }
            C0576h c0576h = this.h;
            if (c0576h.O(A3) != 92) {
                c0576h.l(A3 + 1);
                return;
            } else {
                c0576h.l(A3 + 1);
                y0();
            }
        }
    }

    public s(s sVar) {
        super(sVar);
        this.i = 0;
        r3.C M3 = sVar.f2290g.M();
        this.f2290g = M3;
        this.h = M3.f8246b;
        this.i = sVar.i;
        this.f2291j = sVar.f2291j;
        this.f2292k = sVar.f2292k;
        this.f2293l = sVar.f2293l;
        try {
            M3.P(sVar.h.f8284b);
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
