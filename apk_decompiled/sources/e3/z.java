package e3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public abstract class z {
    public static A a(String str) {
        boolean startsWith$default;
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Matcher matcher = A.f6197d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + Typography.quote).toString());
        }
        String group = matcher.group(1);
        Intrinsics.checkNotNullExpressionValue(group, "typeSubtype.group(1)");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = group.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        Intrinsics.checkNotNullExpressionValue(group2, "typeSubtype.group(2)");
        Intrinsics.checkNotNullExpressionValue(US, "US");
        Intrinsics.checkNotNullExpressionValue(group2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = A.f6198e.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.n(sb, str, Typography.quote).toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else {
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(group4, "'", false, 2, null);
                    if (startsWith$default) {
                        endsWith$default = StringsKt__StringsJVMKt.endsWith$default(group4, "'", false, 2, null);
                        if (endsWith$default && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            Intrinsics.checkNotNullExpressionValue(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                    }
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new A(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }
}
