package e3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

/* renamed from: e3.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0329o implements InterfaceC0316b {

    /* renamed from: b, reason: collision with root package name */
    public static final C0329o f6387b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final C0329o f6388c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final C0329o f6389d = new Object();

    public static final C0324j a(C0329o c0329o, String str) {
        C0324j c0324j = new C0324j(str);
        C0324j.f6351d.put(str, c0324j);
        return c0324j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [r3.h] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, r3.h] */
    public static String b(int i, int i4, int i5, String str, String encodeSet) {
        boolean contains$default;
        boolean contains$default2;
        int i6 = (i5 & 1) != 0 ? 0 : i;
        int length = (i5 & 2) != 0 ? str.length() : i4;
        boolean z3 = (i5 & 8) == 0;
        boolean z4 = (i5 & 16) == 0;
        boolean z5 = (i5 & 32) == 0;
        boolean z6 = (i5 & 64) == 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int i7 = i6;
        while (i7 < length) {
            int codePointAt = str.codePointAt(i7);
            int i8 = 32;
            int i9 = 128;
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z6)) {
                contains$default2 = StringsKt__StringsKt.contains$default(encodeSet, (char) codePointAt, false, 2, (Object) null);
                if (!contains$default2 && ((codePointAt != 37 || (z3 && (!z4 || d(str, i7, length)))) && (codePointAt != 43 || !z5))) {
                    i7 += Character.charCount(codePointAt);
                }
            }
            ?? obj = new Object();
            obj.p0(str, i6, i7);
            ?? r22 = 0;
            while (i7 < length) {
                int codePointAt2 = str.codePointAt(i7);
                if (!z3 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                    if (codePointAt2 == 43 && z5) {
                        obj.o0(z3 ? "+" : "%2B");
                    } else {
                        if (codePointAt2 >= i8 && codePointAt2 != 127 && (codePointAt2 < i9 || z6)) {
                            contains$default = StringsKt__StringsKt.contains$default(encodeSet, (char) codePointAt2, false, 2, (Object) null);
                            if (!contains$default && (codePointAt2 != 37 || (z3 && (!z4 || d(str, i7, length))))) {
                                obj.q0(codePointAt2);
                            }
                        }
                        if (r22 == 0) {
                            r22 = new Object();
                        }
                        r22.q0(codePointAt2);
                        while (!r22.x()) {
                            byte readByte = r22.readByte();
                            int i10 = readByte & UByte.MAX_VALUE;
                            obj.j0(37);
                            char[] cArr = w.f6412k;
                            obj.j0(cArr[(i10 >> 4) & 15]);
                            obj.j0(cArr[readByte & 15]);
                        }
                    }
                }
                i7 += Character.charCount(codePointAt2);
                i8 = 32;
                i9 = 128;
                r22 = r22;
            }
            return obj.e0();
        }
        String substring = str.substring(i6, length);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(String str, int i, int i4) {
        int i5 = i + 2;
        return i5 < i4 && str.charAt(i) == '%' && f3.c.q(str.charAt(i + 1)) != -1 && f3.c.q(str.charAt(i5)) != -1;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r3.h] */
    public static String e(String str, int i, int i4, int i5) {
        int i6;
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = str.length();
        }
        boolean z3 = (i5 & 4) == 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i7 = i;
        while (i7 < i4) {
            char charAt = str.charAt(i7);
            if (charAt == '%' || (charAt == '+' && z3)) {
                ?? obj = new Object();
                obj.p0(str, i, i7);
                while (i7 < i4) {
                    int codePointAt = str.codePointAt(i7);
                    if (codePointAt != 37 || (i6 = i7 + 2) >= i4) {
                        if (codePointAt == 43 && z3) {
                            obj.j0(32);
                            i7++;
                        }
                        obj.q0(codePointAt);
                        i7 += Character.charCount(codePointAt);
                    } else {
                        int q4 = f3.c.q(str.charAt(i7 + 1));
                        int q5 = f3.c.q(str.charAt(i6));
                        if (q4 != -1 && q5 != -1) {
                            obj.j0((q4 << 4) + q5);
                            i7 = Character.charCount(codePointAt) + i6;
                        }
                        obj.q0(codePointAt);
                        i7 += Character.charCount(codePointAt);
                    }
                }
                return obj.e0();
            }
            i7++;
        }
        String substring = str.substring(i, i4);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String f(String str) {
        boolean startsWith$default;
        boolean startsWith$default2;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "TLS_", false, 2, null);
        if (startsWith$default) {
            StringBuilder sb = new StringBuilder("SSL_");
            String substring = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str, "SSL_", false, 2, null);
        if (!startsWith$default2) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder("TLS_");
        String substring2 = str.substring(4);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring2);
        return sb2.toString();
    }

    public static ArrayList g(String str) {
        int indexOf$default;
        int indexOf$default2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            indexOf$default = StringsKt__StringsKt.indexOf$default(str, Typography.amp, i, false, 4, (Object) null);
            if (indexOf$default == -1) {
                indexOf$default = str.length();
            }
            indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', i, false, 4, (Object) null);
            if (indexOf$default2 == -1 || indexOf$default2 > indexOf$default) {
                String substring = str.substring(i, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i, indexOf$default2);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(indexOf$default2 + 1, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i = indexOf$default + 1;
        }
        return arrayList;
    }

    public static void h(ArrayList arrayList, StringBuilder out) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        IntProgression g4 = RangesKt.g(RangesKt.until(0, arrayList.size()), 2);
        int first = g4.getFirst();
        int last = g4.getLast();
        int step = g4.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            String str = (String) arrayList.get(first);
            String str2 = (String) arrayList.get(first + 1);
            if (first > 0) {
                out.append(Typography.amp);
            }
            out.append(str);
            if (str2 != null) {
                out.append('=');
                out.append(str2);
            }
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    public synchronized C0324j c(String javaName) {
        C0324j c0324j;
        try {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            LinkedHashMap linkedHashMap = C0324j.f6351d;
            c0324j = (C0324j) linkedHashMap.get(javaName);
            if (c0324j == null) {
                c0324j = (C0324j) linkedHashMap.get(f(javaName));
                if (c0324j == null) {
                    c0324j = new C0324j(javaName);
                }
                linkedHashMap.put(javaName, c0324j);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0324j;
    }
}
