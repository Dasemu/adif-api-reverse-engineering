package Y2;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class b implements Closeable, Flushable {
    public static final Pattern i = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f2151j = new String[128];

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f2152k;

    /* renamed from: a, reason: collision with root package name */
    public final Writer f2153a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2154b;

    /* renamed from: c, reason: collision with root package name */
    public int f2155c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2156d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2157e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2158f;

    /* renamed from: g, reason: collision with root package name */
    public String f2159g;
    public boolean h;

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            f2151j[i4] = String.format("\\u%04x", Integer.valueOf(i4));
        }
        String[] strArr = f2151j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f2152k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f2154b = iArr;
        this.f2155c = 0;
        if (iArr.length == 0) {
            this.f2154b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f2154b;
        int i4 = this.f2155c;
        this.f2155c = i4 + 1;
        iArr2[i4] = 6;
        this.f2156d = ":";
        this.h = true;
        Objects.requireNonNull(writer, "out == null");
        this.f2153a = writer;
    }

    public void O() {
        x(1, 2, ']');
    }

    public void Y() {
        x(3, 5, '}');
    }

    public void Z(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f2159g != null) {
            throw new IllegalStateException();
        }
        if (this.f2155c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f2159g = str;
    }

    public final void a0() {
    }

    public b b0() {
        if (this.f2159g != null) {
            if (!this.h) {
                this.f2159g = null;
                return this;
            }
            j0();
        }
        d();
        this.f2153a.write("null");
        return this;
    }

    public final int c0() {
        int i4 = this.f2155c;
        if (i4 != 0) {
            return this.f2154b[i4 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2153a.close();
        int i4 = this.f2155c;
        if (i4 > 1 || (i4 == 1 && this.f2154b[i4 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f2155c = 0;
    }

    public final void d() {
        int c02 = c0();
        if (c02 == 1) {
            this.f2154b[this.f2155c - 1] = 2;
            a0();
            return;
        }
        Writer writer = this.f2153a;
        if (c02 == 2) {
            writer.append(',');
            a0();
        } else {
            if (c02 == 4) {
                writer.append((CharSequence) this.f2156d);
                this.f2154b[this.f2155c - 1] = 5;
                return;
            }
            if (c02 != 6) {
                if (c02 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f2157e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f2154b[this.f2155c - 1] = 7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.f2158f
            if (r0 == 0) goto L7
            java.lang.String[] r0 = Y2.b.f2152k
            goto L9
        L7:
            java.lang.String[] r0 = Y2.b.f2151j
        L9:
            java.io.Writer r7 = r7.f2153a
            r1 = 34
            r7.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L41
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L3e
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3e
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L39
            int r6 = r3 - r4
            r7.write(r8, r4, r6)
        L39:
            r7.write(r5)
            int r4 = r3 + 1
        L3e:
            int r3 = r3 + 1
            goto L16
        L41:
            if (r4 >= r2) goto L47
            int r2 = r2 - r4
            r7.write(r8, r4, r2)
        L47:
            r7.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.b.d0(java.lang.String):void");
    }

    public void e() {
        j0();
        d();
        int i4 = this.f2155c;
        int[] iArr = this.f2154b;
        if (i4 == iArr.length) {
            this.f2154b = Arrays.copyOf(iArr, i4 * 2);
        }
        int[] iArr2 = this.f2154b;
        int i5 = this.f2155c;
        this.f2155c = i5 + 1;
        iArr2[i5] = 1;
        this.f2153a.write(91);
    }

    public void e0(double d4) {
        j0();
        if (this.f2157e || !(Double.isNaN(d4) || Double.isInfinite(d4))) {
            d();
            this.f2153a.append((CharSequence) Double.toString(d4));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
    }

    public void f0(long j4) {
        j0();
        d();
        this.f2153a.write(Long.toString(j4));
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f2155c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f2153a.flush();
    }

    public void g0(Number number) {
        if (number == null) {
            b0();
            return;
        }
        j0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !i.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f2157e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        d();
        this.f2153a.append((CharSequence) obj);
    }

    public void h0(String str) {
        if (str == null) {
            b0();
            return;
        }
        j0();
        d();
        d0(str);
    }

    public void i0(boolean z3) {
        j0();
        d();
        this.f2153a.write(z3 ? "true" : "false");
    }

    public final void j0() {
        if (this.f2159g != null) {
            int c02 = c0();
            if (c02 == 5) {
                this.f2153a.write(44);
            } else if (c02 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            a0();
            this.f2154b[this.f2155c - 1] = 4;
            d0(this.f2159g);
            this.f2159g = null;
        }
    }

    public void s() {
        j0();
        d();
        int i4 = this.f2155c;
        int[] iArr = this.f2154b;
        if (i4 == iArr.length) {
            this.f2154b = Arrays.copyOf(iArr, i4 * 2);
        }
        int[] iArr2 = this.f2154b;
        int i5 = this.f2155c;
        this.f2155c = i5 + 1;
        iArr2[i5] = 3;
        this.f2153a.write(123);
    }

    public final void x(int i4, int i5, char c4) {
        int c02 = c0();
        if (c02 != i5 && c02 != i4) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f2159g != null) {
            throw new IllegalStateException("Dangling name: " + this.f2159g);
        }
        this.f2155c--;
        if (c02 == i5) {
            a0();
        }
        this.f2153a.write(c4);
    }
}
