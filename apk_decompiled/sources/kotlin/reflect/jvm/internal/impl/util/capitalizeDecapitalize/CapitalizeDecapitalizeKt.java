package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\ncapitalizeDecapitalize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1#2:145\n288#3,2:146\n288#3,2:148\n766#3:150\n857#3,2:151\n1864#3,3:153\n*S KotlinDebug\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n*L\n34#1:146,2\n57#1:148,2\n72#1:150\n72#1:151,2\n78#1:153,3\n*E\n"})
/* loaded from: classes3.dex */
public final class CapitalizeDecapitalizeKt {
    public static final String capitalizeAsciiOnly(String str) {
        char charAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || 'a' > (charAt = str.charAt(0)) || charAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return upperCase + substring;
    }

    public static final String decapitalizeAsciiOnly(String str) {
        char charAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || 'A' > (charAt = str.charAt(0)) || charAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return lowerCase + substring;
    }

    public static final String decapitalizeSmartForCompiler(String str, boolean z3) {
        IntRange indices;
        Integer num;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || !isUpperCaseCharAt(str, 0, z3)) {
            return str;
        }
        if (str.length() == 1 || !isUpperCaseCharAt(str, 1, z3)) {
            if (z3) {
                return decapitalizeAsciiOnly(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return lowerCase + substring;
        }
        indices = StringsKt__StringsKt.getIndices(str);
        Iterator<Integer> it = indices.iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (!isUpperCaseCharAt(str, num.intValue(), z3)) {
                break;
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return toLowerCase(str, z3);
        }
        int intValue = num2.intValue() - 1;
        StringBuilder sb = new StringBuilder();
        String substring2 = str.substring(0, intValue);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb.append(toLowerCase(substring2, z3));
        String substring3 = str.substring(intValue);
        Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
        sb.append(substring3);
        return sb.toString();
    }

    private static final boolean isUpperCaseCharAt(String str, int i, boolean z3) {
        char charAt = str.charAt(i);
        return z3 ? 'A' <= charAt && charAt < '[' : Character.isUpperCase(charAt);
    }

    private static final String toLowerCase(String str, boolean z3) {
        if (z3) {
            return toLowerCaseAsciiOnly(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String toLowerCaseAsciiOnly(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
