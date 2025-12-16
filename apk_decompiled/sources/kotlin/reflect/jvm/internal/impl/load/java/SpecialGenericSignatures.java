package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.measurement.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

@SourceDebugExtension({"SMAP\nSpecialGenericSignatures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,155:1\n1549#2:156\n1620#2,3:157\n1549#2:160\n1620#2,3:161\n1549#2:164\n1620#2,3:165\n1238#2,4:171\n1549#2:175\n1620#2,3:176\n1549#2:179\n1620#2,3:180\n1238#2,4:186\n1549#2:193\n1620#2,3:194\n1549#2:197\n1620#2,3:198\n1208#2,2:201\n1238#2,4:203\n13#3:168\n13#3:183\n468#4:169\n414#4:170\n468#4:184\n414#4:185\n152#5,3:190\n*S KotlinDebug\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n*L\n57#1:156\n57#1:157,3\n59#1:160\n59#1:161,3\n60#1:164\n60#1:165,3\n98#1:171,4\n104#1:175\n104#1:176,3\n105#1:179\n105#1:180,3\n129#1:186,4\n137#1:193\n137#1:194,3\n141#1:197\n141#1:198,3\n142#1:201,2\n142#1:203,4\n63#1:168\n114#1:183\n98#1:169\n98#1:170\n129#1:184\n129#1:185\n133#1:190,3\n*E\n"})
/* loaded from: classes3.dex */
public class SpecialGenericSignatures {
    public static final Companion Companion = new Companion(null);
    private static final List<String> ERASED_COLLECTION_PARAMETER_NAMES;
    private static final List<Companion.NameAndSignature> ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
    private static final List<String> ERASED_COLLECTION_PARAMETER_SIGNATURES;
    private static final Set<Name> ERASED_VALUE_PARAMETERS_SHORT_NAMES;
    private static final Set<String> ERASED_VALUE_PARAMETERS_SIGNATURES;
    private static final Map<Companion.NameAndSignature, TypeSafeBarrierDescription> GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP;
    private static final Map<Name, Name> JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;
    private static final Set<String> JVM_SIGNATURES_FOR_RENAMED_BUILT_INS;
    private static final Map<Companion.NameAndSignature, Name> NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;
    private static final List<Name> ORIGINAL_SHORT_NAMES;
    private static final Companion.NameAndSignature REMOVE_AT_NAME_AND_SIGNATURE;
    private static final Map<String, TypeSafeBarrierDescription> SIGNATURE_TO_DEFAULT_VALUES_MAP;
    private static final Map<String, Name> SIGNATURE_TO_JVM_REPRESENTATION_NAME;

    /* loaded from: classes3.dex */
    public static final class Companion {

        /* loaded from: classes3.dex */
        public static final class NameAndSignature {
            private final String classInternalName;
            private final Name name;
            private final String parameters;
            private final String returnType;
            private final String signature;

            public NameAndSignature(String classInternalName, Name name, String parameters, String returnType) {
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                this.classInternalName = classInternalName;
                this.name = name;
                this.parameters = parameters;
                this.returnType = returnType;
                this.signature = SignatureBuildingComponents.INSTANCE.signature(classInternalName, name + '(' + parameters + ')' + returnType);
            }

            public static /* synthetic */ NameAndSignature copy$default(NameAndSignature nameAndSignature, String str, Name name, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = nameAndSignature.classInternalName;
                }
                if ((i & 2) != 0) {
                    name = nameAndSignature.name;
                }
                if ((i & 4) != 0) {
                    str2 = nameAndSignature.parameters;
                }
                if ((i & 8) != 0) {
                    str3 = nameAndSignature.returnType;
                }
                return nameAndSignature.copy(str, name, str2, str3);
            }

            public final NameAndSignature copy(String classInternalName, Name name, String parameters, String returnType) {
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                return new NameAndSignature(classInternalName, name, parameters, returnType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return Intrinsics.areEqual(this.classInternalName, nameAndSignature.classInternalName) && Intrinsics.areEqual(this.name, nameAndSignature.name) && Intrinsics.areEqual(this.parameters, nameAndSignature.parameters) && Intrinsics.areEqual(this.returnType, nameAndSignature.returnType);
            }

            public final Name getName() {
                return this.name;
            }

            public final String getSignature() {
                return this.signature;
            }

            public int hashCode() {
                return this.returnType.hashCode() + a.d(this.parameters, (this.name.hashCode() + (this.classInternalName.hashCode() * 31)) * 31, 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
                sb.append(this.classInternalName);
                sb.append(", name=");
                sb.append(this.name);
                sb.append(", parameters=");
                sb.append(this.parameters);
                sb.append(", returnType=");
                return a.n(sb, this.returnType, ')');
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NameAndSignature method(String str, String str2, String str3, String str4) {
            Name identifier = Name.identifier(str2);
            Intrinsics.checkNotNullExpressionValue(identifier, "identifier(...)");
            return new NameAndSignature(str, identifier, str3, str4);
        }

        public final Name getBuiltinFunctionNamesByJvmName(Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(name);
        }

        public final List<String> getERASED_COLLECTION_PARAMETER_SIGNATURES() {
            return SpecialGenericSignatures.ERASED_COLLECTION_PARAMETER_SIGNATURES;
        }

        public final Set<Name> getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
            return SpecialGenericSignatures.ERASED_VALUE_PARAMETERS_SHORT_NAMES;
        }

        public final Set<String> getERASED_VALUE_PARAMETERS_SIGNATURES() {
            return SpecialGenericSignatures.ERASED_VALUE_PARAMETERS_SIGNATURES;
        }

        public final Map<Name, Name> getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
            return SpecialGenericSignatures.JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;
        }

        public final List<Name> getORIGINAL_SHORT_NAMES() {
            return SpecialGenericSignatures.ORIGINAL_SHORT_NAMES;
        }

        public final NameAndSignature getREMOVE_AT_NAME_AND_SIGNATURE() {
            return SpecialGenericSignatures.REMOVE_AT_NAME_AND_SIGNATURE;
        }

        public final Map<String, TypeSafeBarrierDescription> getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
            return SpecialGenericSignatures.SIGNATURE_TO_DEFAULT_VALUES_MAP;
        }

        public final Map<String, Name> getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
            return SpecialGenericSignatures.SIGNATURE_TO_JVM_REPRESENTATION_NAME;
        }

        public final boolean getSameAsRenamedInJvmBuiltin(Name name) {
            Intrinsics.checkNotNullParameter(name, "<this>");
            return getORIGINAL_SHORT_NAMES().contains(name);
        }

        public final SpecialSignatureInfo getSpecialSignatureInfo(String builtinSignature) {
            Object value;
            Intrinsics.checkNotNullParameter(builtinSignature, "builtinSignature");
            if (getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(builtinSignature)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            value = MapsKt__MapsKt.getValue(getSIGNATURE_TO_DEFAULT_VALUES_MAP(), builtinSignature);
            return ((TypeSafeBarrierDescription) value) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class SpecialSignatureInfo {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SpecialSignatureInfo[] $VALUES;
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;
        public static final SpecialSignatureInfo ONE_COLLECTION_PARAMETER = new SpecialSignatureInfo("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
        public static final SpecialSignatureInfo OBJECT_PARAMETER_NON_GENERIC = new SpecialSignatureInfo("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
        public static final SpecialSignatureInfo OBJECT_PARAMETER_GENERIC = new SpecialSignatureInfo("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);

        private static final /* synthetic */ SpecialSignatureInfo[] $values() {
            return new SpecialSignatureInfo[]{ONE_COLLECTION_PARAMETER, OBJECT_PARAMETER_NON_GENERIC, OBJECT_PARAMETER_GENERIC};
        }

        static {
            SpecialSignatureInfo[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private SpecialSignatureInfo(String str, int i, String str2, boolean z3) {
            this.valueParametersSignature = str2;
            this.isObjectReplacedWithTypeParameter = z3;
        }

        public static SpecialSignatureInfo valueOf(String str) {
            return (SpecialSignatureInfo) Enum.valueOf(SpecialSignatureInfo.class, str);
        }

        public static SpecialSignatureInfo[] values() {
            return (SpecialSignatureInfo[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class TypeSafeBarrierDescription {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES;
        private final Object defaultValue;
        public static final TypeSafeBarrierDescription NULL = new TypeSafeBarrierDescription("NULL", 0, null);
        public static final TypeSafeBarrierDescription INDEX = new TypeSafeBarrierDescription("INDEX", 1, -1);
        public static final TypeSafeBarrierDescription FALSE = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = new MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3);

        /* loaded from: classes3.dex */
        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public MAP_GET_OR_DEFAULT(java.lang.String r2, int r3) {
                /*
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT.<init>(java.lang.String, int):void");
            }
        }

        private static final /* synthetic */ TypeSafeBarrierDescription[] $values() {
            return new TypeSafeBarrierDescription[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        static {
            TypeSafeBarrierDescription[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, obj);
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }

        private TypeSafeBarrierDescription(String str, int i, Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        int collectionSizeOrDefault5;
        int collectionSizeOrDefault6;
        int collectionSizeOrDefault7;
        int collectionSizeOrDefault8;
        Set<String> of = SetsKt.setOf((Object[]) new String[]{"containsAll", "removeAll", "retainAll"});
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(of, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str : of) {
            Companion companion = Companion;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
            arrayList.add(companion.method("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES = arrayList;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Companion.NameAndSignature) it.next()).getSignature());
        }
        ERASED_COLLECTION_PARAMETER_SIGNATURES = arrayList2;
        List<Companion.NameAndSignature> list = ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Companion.NameAndSignature) it2.next()).getName().asString());
        }
        ERASED_COLLECTION_PARAMETER_NAMES = arrayList3;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Companion companion2 = Companion;
        String javaUtil = signatureBuildingComponents.javaUtil("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc2, "getDesc(...)");
        Companion.NameAndSignature method = companion2.method(javaUtil, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        Pair pair = TuplesKt.to(method, typeSafeBarrierDescription);
        String javaUtil2 = signatureBuildingComponents.javaUtil("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc3, "getDesc(...)");
        Pair pair2 = TuplesKt.to(companion2.method(javaUtil2, "remove", "Ljava/lang/Object;", desc3), typeSafeBarrierDescription);
        String javaUtil3 = signatureBuildingComponents.javaUtil("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc4, "getDesc(...)");
        Pair pair3 = TuplesKt.to(companion2.method(javaUtil3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription);
        String javaUtil4 = signatureBuildingComponents.javaUtil("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc5, "getDesc(...)");
        Pair pair4 = TuplesKt.to(companion2.method(javaUtil4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription);
        String javaUtil5 = signatureBuildingComponents.javaUtil("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc6, "getDesc(...)");
        Pair pair5 = TuplesKt.to(companion2.method(javaUtil5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription);
        Pair pair6 = TuplesKt.to(companion2.method(signatureBuildingComponents.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        Companion.NameAndSignature method2 = companion2.method(signatureBuildingComponents.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        Pair pair7 = TuplesKt.to(method2, typeSafeBarrierDescription2);
        Pair pair8 = TuplesKt.to(companion2.method(signatureBuildingComponents.javaUtil("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String javaUtil6 = signatureBuildingComponents.javaUtil("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc7, "getDesc(...)");
        Companion.NameAndSignature method3 = companion2.method(javaUtil6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        Pair pair9 = TuplesKt.to(method3, typeSafeBarrierDescription3);
        String javaUtil7 = signatureBuildingComponents.javaUtil("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc8, "getDesc(...)");
        Map<Companion.NameAndSignature, TypeSafeBarrierDescription> mapOf = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, TuplesKt.to(companion2.method(javaUtil7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP = mapOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapOf.size()));
        Iterator<T> it3 = mapOf.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        SIGNATURE_TO_DEFAULT_VALUES_MAP = linkedHashMap;
        Set plus = SetsKt.plus((Set) GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP.keySet(), (Iterable) ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES);
        collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault4);
        Iterator it4 = plus.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it4.next()).getName());
        }
        ERASED_VALUE_PARAMETERS_SHORT_NAMES = CollectionsKt.toSet(arrayList4);
        collectionSizeOrDefault5 = CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10);
        ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault5);
        Iterator it5 = plus.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it5.next()).getSignature());
        }
        ERASED_VALUE_PARAMETERS_SIGNATURES = CollectionsKt.toSet(arrayList5);
        Companion companion3 = Companion;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc9, "getDesc(...)");
        Companion.NameAndSignature method4 = companion3.method("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        REMOVE_AT_NAME_AND_SIGNATURE = method4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        String javaLang = signatureBuildingComponents2.javaLang("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc10, "getDesc(...)");
        Pair pair10 = TuplesKt.to(companion3.method(javaLang, "toByte", "", desc10), Name.identifier("byteValue"));
        String javaLang2 = signatureBuildingComponents2.javaLang("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc11, "getDesc(...)");
        Pair pair11 = TuplesKt.to(companion3.method(javaLang2, "toShort", "", desc11), Name.identifier("shortValue"));
        String javaLang3 = signatureBuildingComponents2.javaLang("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc12, "getDesc(...)");
        Pair pair12 = TuplesKt.to(companion3.method(javaLang3, "toInt", "", desc12), Name.identifier("intValue"));
        String javaLang4 = signatureBuildingComponents2.javaLang("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc13, "getDesc(...)");
        Pair pair13 = TuplesKt.to(companion3.method(javaLang4, "toLong", "", desc13), Name.identifier("longValue"));
        String javaLang5 = signatureBuildingComponents2.javaLang("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc14, "getDesc(...)");
        Pair pair14 = TuplesKt.to(companion3.method(javaLang5, "toFloat", "", desc14), Name.identifier("floatValue"));
        String javaLang6 = signatureBuildingComponents2.javaLang("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc15, "getDesc(...)");
        Pair pair15 = TuplesKt.to(companion3.method(javaLang6, "toDouble", "", desc15), Name.identifier("doubleValue"));
        Pair pair16 = TuplesKt.to(method4, Name.identifier("remove"));
        String javaLang7 = signatureBuildingComponents2.javaLang("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc16, "getDesc(...)");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc17, "getDesc(...)");
        Map<Companion.NameAndSignature, Name> mapOf2 = MapsKt.mapOf(pair10, pair11, pair12, pair13, pair14, pair15, pair16, TuplesKt.to(companion3.method(javaLang7, "get", desc16, desc17), Name.identifier("charAt")));
        NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP = mapOf2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(mapOf2.size()));
        Iterator<T> it6 = mapOf2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).getSignature(), entry2.getValue());
        }
        SIGNATURE_TO_JVM_REPRESENTATION_NAME = linkedHashMap2;
        Map<Companion.NameAndSignature, Name> map = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<Companion.NameAndSignature, Name> entry3 : map.entrySet()) {
            linkedHashSet.add(Companion.NameAndSignature.copy$default(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).getSignature());
        }
        JVM_SIGNATURES_FOR_RENAMED_BUILT_INS = linkedHashSet;
        Set<Companion.NameAndSignature> keySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.keySet();
        collectionSizeOrDefault6 = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
        ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault6);
        Iterator<T> it7 = keySet.iterator();
        while (it7.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it7.next()).getName());
        }
        ORIGINAL_SHORT_NAMES = arrayList6;
        Set<Map.Entry<Companion.NameAndSignature, Name>> entrySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.entrySet();
        collectionSizeOrDefault7 = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
        ArrayList arrayList7 = new ArrayList(collectionSizeOrDefault7);
        Iterator<T> it8 = entrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it8.next();
            arrayList7.add(new Pair(((Companion.NameAndSignature) entry4.getKey()).getName(), entry4.getValue()));
        }
        collectionSizeOrDefault8 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault8), 16));
        Iterator it9 = arrayList7.iterator();
        while (it9.hasNext()) {
            Pair pair17 = (Pair) it9.next();
            linkedHashMap3.put((Name) pair17.getSecond(), (Name) pair17.getFirst());
        }
        JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP = linkedHashMap3;
    }
}
