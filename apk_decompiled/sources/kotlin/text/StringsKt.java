package kotlin.text;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"kotlin/text/StringsKt__AppendableKt", "kotlin/text/StringsKt__IndentKt", "kotlin/text/StringsKt__RegexExtensionsJVMKt", "kotlin/text/StringsKt__RegexExtensionsKt", "kotlin/text/StringsKt__StringBuilderJVMKt", "kotlin/text/StringsKt__StringBuilderKt", "kotlin/text/StringsKt__StringNumberConversionsJVMKt", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/StringsKt__StringsJVMKt", "kotlin/text/StringsKt__StringsKt", "kotlin/text/StringsKt___StringsJvmKt", "kotlin/text/StringsKt___StringsKt"}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes3.dex */
public final class StringsKt extends StringsKt___StringsKt {
    private StringsKt() {
    }

    public static /* bridge */ /* synthetic */ boolean D(String str, String str2) {
        return StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null);
    }

    public static /* bridge */ /* synthetic */ CharSequence P(String str) {
        return StringsKt__StringsKt.trim((CharSequence) str);
    }

    public static /* bridge */ /* synthetic */ void a(StringBuilder sb, String... strArr) {
        StringsKt__StringBuilderKt.append(sb, strArr);
    }

    public static /* bridge */ /* synthetic */ boolean d(CharSequence charSequence, char c4) {
        return StringsKt__StringsKt.contains$default(charSequence, c4, false, 2, (Object) null);
    }

    public static /* bridge */ /* synthetic */ boolean e(CharSequence charSequence, String str) {
        return StringsKt__StringsKt.contains$default(charSequence, (CharSequence) str, false, 2, (Object) null);
    }

    public static /* bridge */ /* synthetic */ boolean i(String str, String str2) {
        return StringsKt__StringsJVMKt.endsWith$default(str, str2, false, 2, null);
    }

    public static /* bridge */ /* synthetic */ boolean j(String str, String str2) {
        return StringsKt__StringsJVMKt.equals(str, str2, true);
    }

    public static /* bridge */ /* synthetic */ int l(CharSequence charSequence, char c4, int i, int i4) {
        return StringsKt__StringsKt.indexOf$default(charSequence, c4, i, false, i4, (Object) null);
    }

    public static /* bridge */ /* synthetic */ String s(String str, String str2) {
        return StringsKt__StringsKt.removePrefix(str, (CharSequence) str2);
    }

    public static /* bridge */ /* synthetic */ String t(String str, String str2) {
        return StringsKt__StringsKt.removeSuffix(str, (CharSequence) str2);
    }

    public static /* bridge */ /* synthetic */ String w(String str, String str2, String str3) {
        return StringsKt__StringsJVMKt.replace$default(str, str2, str3, false, 4, (Object) null);
    }

    public static /* bridge */ /* synthetic */ List x(CharSequence charSequence, String[] strArr, int i, int i4) {
        return StringsKt__StringsKt.split$default(charSequence, strArr, false, i, i4, (Object) null);
    }

    public static /* bridge */ /* synthetic */ List y(String str, char[] cArr) {
        return StringsKt__StringsKt.split$default((CharSequence) str, cArr, false, 0, 6, (Object) null);
    }
}
