package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import u.AbstractC0629f;

@SourceDebugExtension({"SMAP\npropertiesConventionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n766#2:103\n857#2,2:104\n*S KotlinDebug\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n*L\n90#1:103\n90#1:104,2\n*E\n"})
/* loaded from: classes3.dex */
public final class PropertiesConventionUtilKt {
    public static final List<Name> getPropertyNamesCandidatesByAccessorName(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String asString = name.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "asString(...)");
        return JvmAbi.isGetterName(asString) ? CollectionsKt.listOfNotNull(propertyNameByGetMethodName(name)) : JvmAbi.isSetterName(asString) ? propertyNamesBySetMethodName(name) : BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }

    public static final Name propertyNameByGetMethodName(Name methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Name propertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(methodName, "get", false, null, 12, null);
        return propertyNameFromAccessorMethodName$default == null ? propertyNameFromAccessorMethodName$default(methodName, "is", false, null, 8, null) : propertyNameFromAccessorMethodName$default;
    }

    public static final Name propertyNameBySetMethodName(Name methodName, boolean z3) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return propertyNameFromAccessorMethodName$default(methodName, "set", false, z3 ? "is" : null, 4, null);
    }

    private static final Name propertyNameFromAccessorMethodName(Name name, String str, boolean z3, String str2) {
        boolean startsWith$default;
        String removePrefix;
        String removePrefix2;
        if (name.isSpecial()) {
            return null;
        }
        String identifier = name.getIdentifier();
        Intrinsics.checkNotNullExpressionValue(identifier, "getIdentifier(...)");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(identifier, str, false, 2, null);
        if (!startsWith$default || identifier.length() == str.length()) {
            return null;
        }
        char charAt = identifier.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            return null;
        }
        if (str2 != null) {
            StringBuilder a2 = AbstractC0629f.a(str2);
            removePrefix2 = StringsKt__StringsKt.removePrefix(identifier, (CharSequence) str);
            a2.append(removePrefix2);
            return Name.identifier(a2.toString());
        }
        if (!z3) {
            return name;
        }
        removePrefix = StringsKt__StringsKt.removePrefix(identifier, (CharSequence) str);
        String decapitalizeSmartForCompiler = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(removePrefix, true);
        if (Name.isValidIdentifier(decapitalizeSmartForCompiler)) {
            return Name.identifier(decapitalizeSmartForCompiler);
        }
        return null;
    }

    public static /* synthetic */ Name propertyNameFromAccessorMethodName$default(Name name, String str, boolean z3, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return propertyNameFromAccessorMethodName(name, str, z3, str2);
    }

    public static final List<Name> propertyNamesBySetMethodName(Name methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return CollectionsKt.listOfNotNull((Object[]) new Name[]{propertyNameBySetMethodName(methodName, false), propertyNameBySetMethodName(methodName, true)});
    }
}
