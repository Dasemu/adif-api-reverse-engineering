package e3;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import r3.InterfaceC0578j;

/* loaded from: classes3.dex */
public final class S {
    public static Q a(A a2, long j4, InterfaceC0578j interfaceC0578j) {
        Intrinsics.checkNotNullParameter(interfaceC0578j, "<this>");
        return new Q(a2, j4, interfaceC0578j);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [r3.j, java.lang.Object, r3.h] */
    public static Q b(String string, A a2) {
        Intrinsics.checkNotNullParameter(string, "<this>");
        Charset charset = Charsets.UTF_8;
        if (a2 != null) {
            Pattern pattern = A.f6197d;
            Charset a4 = a2.a(null);
            if (a4 == null) {
                String str = a2 + "; charset=utf-8";
                Intrinsics.checkNotNullParameter(str, "<this>");
                try {
                    a2 = z.a(str);
                } catch (IllegalArgumentException unused) {
                    a2 = null;
                }
            } else {
                charset = a4;
            }
        }
        ?? obj = new Object();
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        int length = string.length();
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (length < 0) {
            throw new IllegalArgumentException(C.w.k("endIndex < beginIndex: ", length, 0, " < ").toString());
        }
        if (length > string.length()) {
            StringBuilder t2 = C.w.t(length, "endIndex > string.length: ", " > ");
            t2.append(string.length());
            throw new IllegalArgumentException(t2.toString().toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            obj.p0(string, 0, length);
        } else {
            String substring = string.substring(0, length);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            byte[] bytes = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            obj.i0(bytes, 0, bytes.length);
        }
        return a(a2, obj.f8284b, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [r3.j, java.lang.Object, r3.h] */
    public static Q c(byte[] source, A a2) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        ?? obj = new Object();
        Intrinsics.checkNotNullParameter(source, "source");
        obj.i0(source, 0, source.length);
        return a(a2, source.length, obj);
    }
}
