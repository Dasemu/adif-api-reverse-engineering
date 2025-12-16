package u0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0631a {
    public static boolean a(String current, String str) {
        CharSequence trim;
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.areEqual(current, str)) {
            return true;
        }
        if (current.length() != 0) {
            int i = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i < current.length()) {
                    char charAt = current.charAt(i);
                    int i6 = i5 + 1;
                    if (i5 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i4 - 1 == 0 && i5 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i4++;
                    }
                    i++;
                    i5 = i6;
                } else if (i4 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    trim = StringsKt__StringsKt.trim((CharSequence) substring);
                    return Intrinsics.areEqual(trim.toString(), str);
                }
            }
        }
        return false;
    }
}
