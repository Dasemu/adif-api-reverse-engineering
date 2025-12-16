package kotlin.reflect.jvm.internal.impl.renderer;

import C.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt__StringsJVMKt;

@SourceDebugExtension({"SMAP\nRenderingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,78:1\n1083#2,2:79\n*S KotlinDebug\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n*L\n30#1:79,2\n*E\n"})
/* loaded from: classes3.dex */
public final class RenderingUtilsKt {
    public static final String render(Name name) {
        Intrinsics.checkNotNullParameter(name, "<this>");
        if (!shouldBeEscaped(name)) {
            String asString = name.asString();
            Intrinsics.checkNotNullExpressionValue(asString, "asString(...)");
            return asString;
        }
        StringBuilder sb = new StringBuilder();
        String asString2 = name.asString();
        Intrinsics.checkNotNullExpressionValue(asString2, "asString(...)");
        sb.append("`" + asString2);
        sb.append('`');
        return sb.toString();
    }

    public static final String renderFqName(List<Name> pathSegments) {
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (Name name : pathSegments) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(render(name));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final String replacePrefixesInTypeRepresentations(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        boolean startsWith$default;
        boolean startsWith$default2;
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(lowerPrefix, "lowerPrefix");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(upperPrefix, "upperPrefix");
        Intrinsics.checkNotNullParameter(foldedPrefix, "foldedPrefix");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(lowerRendered, lowerPrefix, false, 2, null);
        if (!startsWith$default) {
            return null;
        }
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(upperRendered, upperPrefix, false, 2, null);
        if (!startsWith$default2) {
            return null;
        }
        String substring = lowerRendered.substring(lowerPrefix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = upperRendered.substring(upperPrefix.length());
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        String n4 = w.n(foldedPrefix, substring);
        if (Intrinsics.areEqual(substring, substring2)) {
            return n4;
        }
        if (!typeStringsDifferOnlyInNullability(substring, substring2)) {
            return null;
        }
        return n4 + '!';
    }

    private static final boolean shouldBeEscaped(Name name) {
        String asString = name.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "asString(...)");
        if (KeywordStringsGenerated.KEYWORDS.contains(asString)) {
            return true;
        }
        for (int i = 0; i < asString.length(); i++) {
            char charAt = asString.charAt(i);
            if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                return true;
            }
        }
        return asString.length() == 0 || !Character.isJavaIdentifierStart(asString.codePointAt(0));
    }

    public static final boolean typeStringsDifferOnlyInNullability(String lower, String upper) {
        String replace$default;
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(lower, "lower");
        Intrinsics.checkNotNullParameter(upper, "upper");
        replace$default = StringsKt__StringsJVMKt.replace$default(upper, "?", "", false, 4, (Object) null);
        if (Intrinsics.areEqual(lower, replace$default)) {
            return true;
        }
        endsWith$default = StringsKt__StringsJVMKt.endsWith$default(upper, "?", false, 2, null);
        if (endsWith$default) {
            if (Intrinsics.areEqual(lower + '?', upper)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(lower);
        sb.append(")?");
        return Intrinsics.areEqual(sb.toString(), upper);
    }

    public static final String render(FqNameUnsafe fqNameUnsafe) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe, "<this>");
        List<Name> pathSegments = fqNameUnsafe.pathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "pathSegments(...)");
        return renderFqName(pathSegments);
    }
}
