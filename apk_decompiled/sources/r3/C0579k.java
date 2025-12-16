package r3;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* renamed from: r3.k */
/* loaded from: classes3.dex */
public class C0579k implements Serializable, Comparable {

    /* renamed from: d */
    public static final C0579k f8285d = new C0579k(new byte[0]);

    /* renamed from: a */
    public final byte[] f8286a;

    /* renamed from: b */
    public transient int f8287b;

    /* renamed from: c */
    public transient String f8288c;

    public C0579k(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f8286a = data;
    }

    public static int g(C0579k c0579k, C0579k other) {
        c0579k.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return c0579k.f(0, other.f8286a);
    }

    public static int k(C0579k c0579k, C0579k other) {
        c0579k.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return c0579k.j(other.f8286a);
    }

    public static /* synthetic */ C0579k o(C0579k c0579k, int i, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = -1234567890;
        }
        return c0579k.n(i, i4);
    }

    public String a() {
        byte[] map = AbstractC0569a.f8269a;
        byte[] bArr = this.f8286a;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i4 = 0;
        while (i < length) {
            byte b4 = bArr[i];
            int i5 = i + 2;
            byte b5 = bArr[i + 1];
            i += 3;
            byte b6 = bArr[i5];
            bArr2[i4] = map[(b4 & UByte.MAX_VALUE) >> 2];
            bArr2[i4 + 1] = map[((b4 & 3) << 4) | ((b5 & UByte.MAX_VALUE) >> 4)];
            int i6 = i4 + 3;
            bArr2[i4 + 2] = map[((b5 & 15) << 2) | ((b6 & UByte.MAX_VALUE) >> 6)];
            i4 += 4;
            bArr2[i6] = map[b6 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b7 = bArr[i];
            bArr2[i4] = map[(b7 & UByte.MAX_VALUE) >> 2];
            bArr2[i4 + 1] = map[(b7 & 3) << 4];
            bArr2[i4 + 2] = Base64.padSymbol;
            bArr2[i4 + 3] = Base64.padSymbol;
        } else if (length2 == 2) {
            int i7 = i + 1;
            byte b8 = bArr[i];
            byte b9 = bArr[i7];
            bArr2[i4] = map[(b8 & UByte.MAX_VALUE) >> 2];
            bArr2[i4 + 1] = map[((b8 & 3) << 4) | ((b9 & UByte.MAX_VALUE) >> 4)];
            bArr2[i4 + 2] = map[(b9 & 15) << 2];
            bArr2[i4 + 3] = Base64.padSymbol;
        }
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        return new String(bArr2, Charsets.UTF_8);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(C0579k other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int d4 = d();
        int d5 = other.d();
        int min = Math.min(d4, d5);
        for (int i = 0; i < min; i++) {
            int i4 = i(i) & UByte.MAX_VALUE;
            int i5 = other.i(i) & UByte.MAX_VALUE;
            if (i4 != i5) {
                return i4 < i5 ? -1 : 1;
            }
        }
        if (d4 == d5) {
            return 0;
        }
        return d4 < d5 ? -1 : 1;
    }

    public C0579k c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f8286a, 0, d());
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        return new C0579k(digest);
    }

    public int d() {
        return this.f8286a.length;
    }

    public String e() {
        byte[] bArr = this.f8286a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b4 : bArr) {
            int i4 = i + 1;
            char[] cArr2 = s3.b.f8473a;
            cArr[i] = cArr2[(b4 >> 4) & 15];
            i += 2;
            cArr[i4] = cArr2[b4 & 15];
        }
        return StringsKt.concatToString(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0579k) {
            C0579k c0579k = (C0579k) obj;
            int d4 = c0579k.d();
            byte[] bArr = this.f8286a;
            if (d4 == bArr.length && c0579k.m(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        byte[] bArr = this.f8286a;
        int length = bArr.length - other.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!m3.d.c(bArr, other, max, 0, other.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public byte[] h() {
        return this.f8286a;
    }

    public int hashCode() {
        int i = this.f8287b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f8286a);
        this.f8287b = hashCode;
        return hashCode;
    }

    public byte i(int i) {
        return this.f8286a[i];
    }

    public int j(byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(this, "<this>");
        int d4 = d();
        byte[] bArr = this.f8286a;
        for (int min = Math.min(d4, bArr.length - other.length); -1 < min; min--) {
            if (m3.d.c(bArr, other, min, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i, C0579k other, int i4) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.m(0, this.f8286a, i, i4);
    }

    public boolean m(int i, byte[] other, int i4, int i5) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.f8286a;
        return i <= bArr.length - i5 && i4 >= 0 && i4 <= other.length - i5 && m3.d.c(bArr, other, i, i4, i5);
    }

    public C0579k n(int i, int i4) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i4 == -1234567890) {
            i4 = d();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f8286a;
        if (i4 > bArr.length) {
            throw new IllegalArgumentException(C.w.p(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i4 - i >= 0) {
            return (i == 0 && i4 == bArr.length) ? this : new C0579k(ArraysKt.copyOfRange(bArr, i, i4));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public C0579k p() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f8286a;
            if (i >= bArr.length) {
                return this;
            }
            byte b4 = bArr[i];
            if (b4 >= 65 && b4 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b4 + 32);
                for (int i4 = i + 1; i4 < copyOf.length; i4++) {
                    byte b5 = copyOf[i4];
                    if (b5 >= 65 && b5 <= 90) {
                        copyOf[i4] = (byte) (b5 + 32);
                    }
                }
                return new C0579k(copyOf);
            }
            i++;
        }
    }

    public final String q() {
        String str = this.f8288c;
        if (str != null) {
            return str;
        }
        byte[] h = h();
        Intrinsics.checkNotNullParameter(h, "<this>");
        String str2 = new String(h, Charsets.UTF_8);
        this.f8288c = str2;
        return str2;
    }

    public void r(C0576h buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.i0(this.f8286a, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0102, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00fa, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0138, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x013c, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00da, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0096, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00c8, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0085, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x017b, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0182, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0174, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b7, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ba, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bd, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0148, code lost:
    
        if (r8 == 64) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c0, code lost:
    
        if (r8 == 64) goto L437;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.C0579k.toString():java.lang.String");
    }
}
