package e3;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class L {
    public static K a(A a2, byte[] bArr, int i, int i4) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        long length = bArr.length;
        long j4 = i;
        long j5 = i4;
        byte[] bArr2 = f3.c.f6469a;
        if ((j4 | j5) < 0 || j4 > length || length - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new K(a2, bArr, i4, i);
    }

    public static K b(String str, A a2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Charset charset = Charsets.UTF_8;
        if (a2 != null) {
            Pattern pattern = A.f6197d;
            Charset a4 = a2.a(null);
            if (a4 == null) {
                String str2 = a2 + "; charset=utf-8";
                Intrinsics.checkNotNullParameter(str2, "<this>");
                try {
                    a2 = z.a(str2);
                } catch (IllegalArgumentException unused) {
                    a2 = null;
                }
            } else {
                charset = a4;
            }
        }
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return a(a2, bytes, 0, bytes.length);
    }

    public static /* synthetic */ K c(L l4, byte[] bArr, A a2, int i, int i4) {
        if ((i4 & 1) != 0) {
            a2 = null;
        }
        if ((i4 & 2) != 0) {
            i = 0;
        }
        int length = bArr.length;
        l4.getClass();
        return a(a2, bArr, i, length);
    }
}
