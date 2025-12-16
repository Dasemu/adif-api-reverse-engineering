package Y2;

import C.w;
import E2.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import kotlin.text.Typography;
import u.AbstractC0629f;

/* loaded from: classes3.dex */
public class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final StringReader f2138a;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f2145j;

    /* renamed from: k, reason: collision with root package name */
    public String f2146k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f2147l;

    /* renamed from: n, reason: collision with root package name */
    public String[] f2149n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f2150o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2139b = false;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f2140c = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    public int f2141d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2142e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f2143f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f2144g = 0;
    public int h = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2148m = 1;

    static {
        e.f383b = new e(19);
    }

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f2147l = iArr;
        iArr[0] = 6;
        this.f2149n = new String[32];
        this.f2150o = new int[32];
        this.f2138a = stringReader;
    }

    public final void O() {
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        if (i != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + w.C(o0()) + d0());
        }
        int i4 = this.f2148m;
        this.f2148m = i4 - 1;
        int[] iArr = this.f2150o;
        int i5 = i4 - 2;
        iArr[i5] = iArr[i5] + 1;
        this.h = 0;
    }

    public final void Y() {
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        if (i != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + w.C(o0()) + d0());
        }
        int i4 = this.f2148m;
        int i5 = i4 - 1;
        this.f2148m = i5;
        this.f2149n[i5] = null;
        int[] iArr = this.f2150o;
        int i6 = i4 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.h = 0;
    }

    public final boolean Z(int i) {
        int i4;
        int i5;
        int i6 = this.f2144g;
        int i7 = this.f2141d;
        this.f2144g = i6 - i7;
        int i8 = this.f2142e;
        char[] cArr = this.f2140c;
        if (i8 != i7) {
            int i9 = i8 - i7;
            this.f2142e = i9;
            System.arraycopy(cArr, i7, cArr, 0, i9);
        } else {
            this.f2142e = 0;
        }
        this.f2141d = 0;
        do {
            int i10 = this.f2142e;
            int read = this.f2138a.read(cArr, i10, cArr.length - i10);
            if (read == -1) {
                return false;
            }
            i4 = this.f2142e + read;
            this.f2142e = i4;
            if (this.f2143f == 0 && (i5 = this.f2144g) == 0 && i4 > 0 && cArr[0] == 65279) {
                this.f2141d++;
                this.f2144g = i5 + 1;
                i++;
            }
        } while (i4 < i);
        return true;
    }

    public final String a0(boolean z3) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i4 = this.f2148m;
            if (i >= i4) {
                return sb.toString();
            }
            int i5 = this.f2147l[i];
            if (i5 == 1 || i5 == 2) {
                int i6 = this.f2150o[i];
                if (z3 && i6 > 0 && i == i4 - 1) {
                    i6--;
                }
                sb.append('[');
                sb.append(i6);
                sb.append(']');
            } else if (i5 == 3 || i5 == 4 || i5 == 5) {
                sb.append('.');
                String str = this.f2149n[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public final boolean b0() {
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final boolean c0(char c4) {
        if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
            return false;
        }
        if (c4 != '#') {
            if (c4 == ',') {
                return false;
            }
            if (c4 != '/' && c4 != '=') {
                if (c4 == '{' || c4 == '}' || c4 == ':') {
                    return false;
                }
                if (c4 != ';') {
                    switch (c4) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        s();
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h = 0;
        this.f2147l[0] = 8;
        this.f2148m = 1;
        this.f2138a.close();
    }

    public final void d() {
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        if (i == 3) {
            p0(1);
            this.f2150o[this.f2148m - 1] = 0;
            this.h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + w.C(o0()) + d0());
        }
    }

    public final String d0() {
        return " at line " + (this.f2143f + 1) + " column " + ((this.f2141d - this.f2144g) + 1) + " path " + a0(false);
    }

    public final void e() {
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        if (i == 1) {
            p0(3);
            this.h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + w.C(o0()) + d0());
        }
    }

    public final boolean e0() {
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        if (i == 5) {
            this.h = 0;
            int[] iArr = this.f2150o;
            int i4 = this.f2148m - 1;
            iArr[i4] = iArr[i4] + 1;
            return true;
        }
        if (i != 6) {
            throw new IllegalStateException("Expected a boolean but was " + w.C(o0()) + d0());
        }
        this.h = 0;
        int[] iArr2 = this.f2150o;
        int i5 = this.f2148m - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return false;
    }

    public final double f0() {
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.f2150o;
            int i4 = this.f2148m - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.i;
        }
        if (i == 16) {
            this.f2146k = new String(this.f2140c, this.f2141d, this.f2145j);
            this.f2141d += this.f2145j;
        } else if (i == 8 || i == 9) {
            this.f2146k = l0(i == 8 ? '\'' : Typography.quote);
        } else if (i == 10) {
            this.f2146k = n0();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + w.C(o0()) + d0());
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.f2146k);
        if (!this.f2139b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + d0());
        }
        this.f2146k = null;
        this.h = 0;
        int[] iArr2 = this.f2150o;
        int i5 = this.f2148m - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return parseDouble;
    }

    public final int g0() {
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        if (i == 15) {
            long j4 = this.i;
            int i4 = (int) j4;
            if (j4 != i4) {
                throw new NumberFormatException("Expected an int but was " + this.i + d0());
            }
            this.h = 0;
            int[] iArr = this.f2150o;
            int i5 = this.f2148m - 1;
            iArr[i5] = iArr[i5] + 1;
            return i4;
        }
        if (i == 16) {
            this.f2146k = new String(this.f2140c, this.f2141d, this.f2145j);
            this.f2141d += this.f2145j;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw new IllegalStateException("Expected an int but was " + w.C(o0()) + d0());
            }
            if (i == 10) {
                this.f2146k = n0();
            } else {
                this.f2146k = l0(i == 8 ? '\'' : Typography.quote);
            }
            try {
                int parseInt = Integer.parseInt(this.f2146k);
                this.h = 0;
                int[] iArr2 = this.f2150o;
                int i6 = this.f2148m - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.f2146k);
        int i7 = (int) parseDouble;
        if (i7 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f2146k + d0());
        }
        this.f2146k = null;
        this.h = 0;
        int[] iArr3 = this.f2150o;
        int i8 = this.f2148m - 1;
        iArr3[i8] = iArr3[i8] + 1;
        return i7;
    }

    public final long h0() {
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.f2150o;
            int i4 = this.f2148m - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.i;
        }
        if (i == 16) {
            this.f2146k = new String(this.f2140c, this.f2141d, this.f2145j);
            this.f2141d += this.f2145j;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw new IllegalStateException("Expected a long but was " + w.C(o0()) + d0());
            }
            if (i == 10) {
                this.f2146k = n0();
            } else {
                this.f2146k = l0(i == 8 ? '\'' : Typography.quote);
            }
            try {
                long parseLong = Long.parseLong(this.f2146k);
                this.h = 0;
                int[] iArr2 = this.f2150o;
                int i5 = this.f2148m - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.f2146k);
        long j4 = (long) parseDouble;
        if (j4 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f2146k + d0());
        }
        this.f2146k = null;
        this.h = 0;
        int[] iArr3 = this.f2150o;
        int i6 = this.f2148m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return j4;
    }

    public final String i0() {
        String l02;
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        if (i == 14) {
            l02 = n0();
        } else if (i == 12) {
            l02 = l0('\'');
        } else {
            if (i != 13) {
                throw new IllegalStateException("Expected a name but was " + w.C(o0()) + d0());
            }
            l02 = l0(Typography.quote);
        }
        this.h = 0;
        this.f2149n[this.f2148m - 1] = l02;
        return l02;
    }

    public final int j0(boolean z3) {
        char c4;
        int i = this.f2141d;
        int i4 = this.f2142e;
        while (true) {
            if (i == i4) {
                this.f2141d = i;
                if (!Z(1)) {
                    if (!z3) {
                        return -1;
                    }
                    throw new EOFException("End of input" + d0());
                }
                i = this.f2141d;
                i4 = this.f2142e;
            }
            int i5 = i + 1;
            char[] cArr = this.f2140c;
            c4 = cArr[i];
            if (c4 == '\n') {
                this.f2143f++;
                this.f2144g = i5;
            } else if (c4 != ' ' && c4 != '\r' && c4 != '\t') {
                if (c4 == '/') {
                    this.f2141d = i5;
                    if (i5 == i4) {
                        this.f2141d = i;
                        boolean Z = Z(2);
                        this.f2141d++;
                        if (!Z) {
                            break;
                        }
                    }
                    s();
                    int i6 = this.f2141d;
                    char c5 = cArr[i6];
                    if (c5 == '*') {
                        this.f2141d = i6 + 1;
                        while (true) {
                            if (this.f2141d + 2 > this.f2142e && !Z(2)) {
                                v0("Unterminated comment");
                                throw null;
                            }
                            int i7 = this.f2141d;
                            if (cArr[i7] != '\n') {
                                for (int i8 = 0; i8 < 2; i8++) {
                                    if (cArr[this.f2141d + i8] != "*/".charAt(i8)) {
                                        break;
                                    }
                                }
                                i = this.f2141d + 2;
                                i4 = this.f2142e;
                                break;
                            }
                            this.f2143f++;
                            this.f2144g = i7 + 1;
                            this.f2141d++;
                        }
                    } else {
                        if (c5 != '/') {
                            break;
                        }
                        this.f2141d = i6 + 1;
                        s0();
                        i = this.f2141d;
                        i4 = this.f2142e;
                    }
                } else {
                    if (c4 != '#') {
                        this.f2141d = i5;
                        return c4;
                    }
                    this.f2141d = i5;
                    s();
                    s0();
                    i = this.f2141d;
                    i4 = this.f2142e;
                }
            }
            i = i5;
        }
        return c4;
    }

    public final void k0() {
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        if (i != 7) {
            throw new IllegalStateException("Expected null but was " + w.C(o0()) + d0());
        }
        this.h = 0;
        int[] iArr = this.f2150o;
        int i4 = this.f2148m - 1;
        iArr[i4] = iArr[i4] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f2141d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r10.f2141d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String l0(char r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f2141d
            int r3 = r10.f2142e
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r10.f2140c
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r5[r2]
            if (r2 != r11) goto L29
            r10.f2141d = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r10 = new java.lang.String
            r10.<init>(r5, r3, r8)
            return r10
        L21:
            r1.append(r5, r3, r8)
            java.lang.String r10 = r1.toString()
            return r10
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.f2141d = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L3f:
            r1.append(r5, r3, r2)
            char r2 = r10.q0()
            r1.append(r2)
            int r2 = r10.f2141d
            int r3 = r10.f2142e
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.f2143f
            int r2 = r2 + r6
            r10.f2143f = r2
            r10.f2144g = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r10.f2141d = r2
            boolean r2 = r10.Z(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.v0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.a.l0(char):java.lang.String");
    }

    public final String m0() {
        String str;
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        if (i == 10) {
            str = n0();
        } else if (i == 8) {
            str = l0('\'');
        } else if (i == 9) {
            str = l0(Typography.quote);
        } else if (i == 11) {
            str = this.f2146k;
            this.f2146k = null;
        } else if (i == 15) {
            str = Long.toString(this.i);
        } else {
            if (i != 16) {
                throw new IllegalStateException("Expected a string but was " + w.C(o0()) + d0());
            }
            str = new String(this.f2140c, this.f2141d, this.f2145j);
            this.f2141d += this.f2145j;
        }
        this.h = 0;
        int[] iArr = this.f2150o;
        int i4 = this.f2148m - 1;
        iArr[i4] = iArr[i4] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        s();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String n0() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f2141d
            int r4 = r3 + r2
            int r5 = r7.f2142e
            char[] r6 = r7.f2140c
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.s()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.Z(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f2141d
            r0.append(r6, r3, r2)
            int r3 = r7.f2141d
            int r3 = r3 + r2
            r7.f2141d = r3
            r2 = 1
            boolean r2 = r7.Z(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f2141d
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f2141d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f2141d
            int r2 = r2 + r1
            r7.f2141d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.a.n0():java.lang.String");
    }

    public final int o0() {
        int i = this.h;
        if (i == 0) {
            i = x();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void p0(int i) {
        int i4 = this.f2148m;
        int[] iArr = this.f2147l;
        if (i4 == iArr.length) {
            int i5 = i4 * 2;
            this.f2147l = Arrays.copyOf(iArr, i5);
            this.f2150o = Arrays.copyOf(this.f2150o, i5);
            this.f2149n = (String[]) Arrays.copyOf(this.f2149n, i5);
        }
        int[] iArr2 = this.f2147l;
        int i6 = this.f2148m;
        this.f2148m = i6 + 1;
        iArr2[i6] = i;
    }

    public final char q0() {
        int i;
        if (this.f2141d == this.f2142e && !Z(1)) {
            v0("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.f2141d;
        int i5 = i4 + 1;
        this.f2141d = i5;
        char[] cArr = this.f2140c;
        char c4 = cArr[i4];
        if (c4 == '\n') {
            this.f2143f++;
            this.f2144g = i5;
            return c4;
        }
        if (c4 == '\"' || c4 == '\'' || c4 == '/' || c4 == '\\') {
            return c4;
        }
        if (c4 == 'b') {
            return '\b';
        }
        if (c4 == 'f') {
            return '\f';
        }
        if (c4 == 'n') {
            return '\n';
        }
        if (c4 == 'r') {
            return '\r';
        }
        if (c4 == 't') {
            return '\t';
        }
        if (c4 != 'u') {
            v0("Invalid escape sequence");
            throw null;
        }
        if (i4 + 5 > this.f2142e && !Z(4)) {
            v0("Unterminated escape sequence");
            throw null;
        }
        int i6 = this.f2141d;
        int i7 = i6 + 4;
        char c5 = 0;
        while (i6 < i7) {
            char c6 = cArr[i6];
            char c7 = (char) (c5 << 4);
            if (c6 >= '0' && c6 <= '9') {
                i = c6 - '0';
            } else if (c6 >= 'a' && c6 <= 'f') {
                i = c6 - 'W';
            } else {
                if (c6 < 'A' || c6 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f2141d, 4)));
                }
                i = c6 - '7';
            }
            c5 = (char) (i + c7);
            i6++;
        }
        this.f2141d += 4;
        return c5;
    }

    public final void r0(char c4) {
        do {
            int i = this.f2141d;
            int i4 = this.f2142e;
            while (i < i4) {
                int i5 = i + 1;
                char c5 = this.f2140c[i];
                if (c5 == c4) {
                    this.f2141d = i5;
                    return;
                }
                if (c5 == '\\') {
                    this.f2141d = i5;
                    q0();
                    i = this.f2141d;
                    i4 = this.f2142e;
                } else {
                    if (c5 == '\n') {
                        this.f2143f++;
                        this.f2144g = i5;
                    }
                    i = i5;
                }
            }
            this.f2141d = i;
        } while (Z(1));
        v0("Unterminated string");
        throw null;
    }

    public final void s() {
        if (this.f2139b) {
            return;
        }
        v0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final void s0() {
        char c4;
        do {
            if (this.f2141d >= this.f2142e && !Z(1)) {
                return;
            }
            int i = this.f2141d;
            int i4 = i + 1;
            this.f2141d = i4;
            c4 = this.f2140c[i];
            if (c4 == '\n') {
                this.f2143f++;
                this.f2144g = i4;
                return;
            }
        } while (c4 != '\r');
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void t0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f2141d
            int r2 = r1 + r0
            int r3 = r4.f2142e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f2140c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.s()
        L4b:
            int r1 = r4.f2141d
            int r1 = r1 + r0
            r4.f2141d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f2141d = r1
            r0 = 1
            boolean r0 = r4.Z(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.a.t0():void");
    }

    public final String toString() {
        return a.class.getSimpleName() + d0();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public final void u0() {
        int i = 0;
        do {
            int i4 = this.h;
            if (i4 == 0) {
                i4 = x();
            }
            switch (i4) {
                case 1:
                    p0(3);
                    i++;
                    this.h = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f2149n[this.f2148m - 1] = null;
                    }
                    this.f2148m--;
                    i--;
                    this.h = 0;
                    break;
                case 3:
                    p0(1);
                    i++;
                    this.h = 0;
                    break;
                case 4:
                    this.f2148m--;
                    i--;
                    this.h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.h = 0;
                    break;
                case 8:
                    r0('\'');
                    this.h = 0;
                    break;
                case 9:
                    r0(Typography.quote);
                    this.h = 0;
                    break;
                case 10:
                    t0();
                    this.h = 0;
                    break;
                case 12:
                    r0('\'');
                    if (i == 0) {
                        this.f2149n[this.f2148m - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 13:
                    r0(Typography.quote);
                    if (i == 0) {
                        this.f2149n[this.f2148m - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 14:
                    t0();
                    if (i == 0) {
                        this.f2149n[this.f2148m - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 16:
                    this.f2141d += this.f2145j;
                    this.h = 0;
                    break;
                case 17:
                    return;
            }
        } while (i > 0);
        int[] iArr = this.f2150o;
        int i5 = this.f2148m - 1;
        iArr[i5] = iArr[i5] + 1;
    }

    public final void v0(String str) {
        StringBuilder a2 = AbstractC0629f.a(str);
        a2.append(d0());
        throw new IOException(a2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x020f, code lost:
    
        if (c0(r7) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a0, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0212, code lost:
    
        if (r11 != 2) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0214, code lost:
    
        if (r14 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x021a, code lost:
    
        if (r1 != Long.MIN_VALUE) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x021c, code lost:
    
        if (r17 == 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0223, code lost:
    
        if (r1 != 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0225, code lost:
    
        if (r17 != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0227, code lost:
    
        if (r17 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022a, code lost:
    
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022b, code lost:
    
        r24.i = r1;
        r24.f2141d += r13;
        r10 = 15;
        r24.h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x021f, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0237, code lost:
    
        if (r11 == r8) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x023a, code lost:
    
        if (r11 == 4) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x023d, code lost:
    
        if (r11 != 7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x023f, code lost:
    
        r24.f2145j = r13;
        r10 = 16;
        r24.h = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0267 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int x() {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.a.x():int");
    }
}
