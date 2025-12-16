package kotlin.reflect.jvm.internal.impl.name;

import com.google.android.gms.measurement.internal.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@SourceDebugExtension({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIds\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n1271#2,2:288\n1285#2,4:290\n1271#2,2:294\n1285#2,4:296\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIds\n*L\n86#1:288,2\n86#1:290,4\n90#1:294,2\n90#1:296,4\n*E\n"})
/* loaded from: classes3.dex */
public final class StandardClassIds {
    private static final ClassId Annotation;
    private static final ClassId AnnotationRetention;
    private static final ClassId AnnotationTarget;
    private static final ClassId Any;
    private static final ClassId Array;
    private static final FqName BASE_ANNOTATION_PACKAGE;
    private static final FqName BASE_COLLECTIONS_PACKAGE;
    private static final FqName BASE_CONCURRENT_PACKAGE;
    private static final FqName BASE_CONTRACTS_PACKAGE;
    private static final FqName BASE_COROUTINES_PACKAGE;
    private static final FqName BASE_ENUMS_PACKAGE;
    private static final FqName BASE_INTERNAL_IR_PACKAGE;
    private static final FqName BASE_INTERNAL_PACKAGE;
    private static final FqName BASE_JVM_INTERNAL_PACKAGE;
    private static final FqName BASE_JVM_PACKAGE;
    private static final FqName BASE_KOTLIN_PACKAGE;
    private static final FqName BASE_RANGES_PACKAGE;
    private static final FqName BASE_REFLECT_PACKAGE;
    private static final FqName BASE_TEST_PACKAGE;
    private static final ClassId Boolean;
    private static final ClassId Byte;
    private static final ClassId Char;
    private static final ClassId CharIterator;
    private static final ClassId CharRange;
    private static final ClassId CharSequence;
    private static final ClassId Cloneable;
    private static final ClassId Collection;
    private static final ClassId Comparable;
    private static final ClassId Continuation;
    private static final ClassId DeprecationLevel;
    private static final ClassId Double;
    private static final ClassId Enum;
    private static final ClassId EnumEntries;
    private static final ClassId Float;
    private static final ClassId Function;
    public static final StandardClassIds INSTANCE = new StandardClassIds();
    private static final ClassId Int;
    private static final ClassId IntRange;
    private static final ClassId Iterable;
    private static final ClassId Iterator;
    private static final ClassId KCallable;
    private static final ClassId KClass;
    private static final ClassId KFunction;
    private static final ClassId KMutableProperty;
    private static final ClassId KMutableProperty0;
    private static final ClassId KMutableProperty1;
    private static final ClassId KMutableProperty2;
    private static final ClassId KProperty;
    private static final ClassId KProperty0;
    private static final ClassId KProperty1;
    private static final ClassId KProperty2;
    private static final ClassId KType;
    private static final ClassId List;
    private static final ClassId ListIterator;
    private static final ClassId Long;
    private static final ClassId LongRange;
    private static final ClassId Map;
    private static final ClassId MapEntry;
    private static final ClassId MutableCollection;
    private static final ClassId MutableIterable;
    private static final ClassId MutableIterator;
    private static final ClassId MutableList;
    private static final ClassId MutableListIterator;
    private static final ClassId MutableMap;
    private static final ClassId MutableMapEntry;
    private static final ClassId MutableSet;
    private static final ClassId Nothing;
    private static final ClassId Number;
    private static final ClassId Result;
    private static final ClassId Set;
    private static final ClassId Short;
    private static final ClassId String;
    private static final ClassId Throwable;
    private static final ClassId UByte;
    private static final ClassId UInt;
    private static final ClassId ULong;
    private static final ClassId UShort;
    private static final ClassId Unit;
    private static final Set<FqName> builtInsPackages;
    private static final Set<ClassId> constantAllowedTypes;
    private static final Map<ClassId, ClassId> elementTypeByPrimitiveArrayType;
    private static final Map<ClassId, ClassId> elementTypeByUnsignedArrayType;
    private static final Map<ClassId, ClassId> primitiveArrayTypeByElementType;
    private static final Set<ClassId> primitiveTypes;
    private static final Map<ClassId, ClassId> unsignedArrayTypeByElementType;
    private static final Set<ClassId> unsignedTypes;

    static {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        FqName fqName = new FqName("kotlin");
        BASE_KOTLIN_PACKAGE = fqName;
        FqName x3 = a.x("reflect", fqName, "child(...)");
        BASE_REFLECT_PACKAGE = x3;
        FqName x4 = a.x("collections", fqName, "child(...)");
        BASE_COLLECTIONS_PACKAGE = x4;
        FqName x5 = a.x("ranges", fqName, "child(...)");
        BASE_RANGES_PACKAGE = x5;
        FqName x6 = a.x("jvm", fqName, "child(...)");
        BASE_JVM_PACKAGE = x6;
        BASE_JVM_INTERNAL_PACKAGE = a.x("internal", x6, "child(...)");
        FqName x7 = a.x("annotation", fqName, "child(...)");
        BASE_ANNOTATION_PACKAGE = x7;
        FqName x8 = a.x("internal", fqName, "child(...)");
        BASE_INTERNAL_PACKAGE = x8;
        BASE_INTERNAL_IR_PACKAGE = a.x("ir", x8, "child(...)");
        FqName x9 = a.x("coroutines", fqName, "child(...)");
        BASE_COROUTINES_PACKAGE = x9;
        BASE_ENUMS_PACKAGE = a.x("enums", fqName, "child(...)");
        BASE_CONTRACTS_PACKAGE = a.x("contracts", fqName, "child(...)");
        BASE_CONCURRENT_PACKAGE = a.x("concurrent", fqName, "child(...)");
        BASE_TEST_PACKAGE = a.x("test", fqName, "child(...)");
        builtInsPackages = SetsKt.setOf((Object[]) new FqName[]{fqName, x4, x5, x7, x3, x8, x9});
        Nothing = StandardClassIdsKt.access$baseId("Nothing");
        Unit = StandardClassIdsKt.access$baseId("Unit");
        Any = StandardClassIdsKt.access$baseId("Any");
        Enum = StandardClassIdsKt.access$baseId("Enum");
        Annotation = StandardClassIdsKt.access$baseId("Annotation");
        Array = StandardClassIdsKt.access$baseId("Array");
        ClassId access$baseId = StandardClassIdsKt.access$baseId("Boolean");
        Boolean = access$baseId;
        ClassId access$baseId2 = StandardClassIdsKt.access$baseId("Char");
        Char = access$baseId2;
        ClassId access$baseId3 = StandardClassIdsKt.access$baseId("Byte");
        Byte = access$baseId3;
        ClassId access$baseId4 = StandardClassIdsKt.access$baseId("Short");
        Short = access$baseId4;
        ClassId access$baseId5 = StandardClassIdsKt.access$baseId("Int");
        Int = access$baseId5;
        ClassId access$baseId6 = StandardClassIdsKt.access$baseId("Long");
        Long = access$baseId6;
        ClassId access$baseId7 = StandardClassIdsKt.access$baseId("Float");
        Float = access$baseId7;
        ClassId access$baseId8 = StandardClassIdsKt.access$baseId("Double");
        Double = access$baseId8;
        UByte = StandardClassIdsKt.access$unsignedId(access$baseId3);
        UShort = StandardClassIdsKt.access$unsignedId(access$baseId4);
        UInt = StandardClassIdsKt.access$unsignedId(access$baseId5);
        ULong = StandardClassIdsKt.access$unsignedId(access$baseId6);
        CharSequence = StandardClassIdsKt.access$baseId("CharSequence");
        String = StandardClassIdsKt.access$baseId("String");
        Throwable = StandardClassIdsKt.access$baseId("Throwable");
        Cloneable = StandardClassIdsKt.access$baseId("Cloneable");
        KProperty = StandardClassIdsKt.access$reflectId("KProperty");
        KMutableProperty = StandardClassIdsKt.access$reflectId("KMutableProperty");
        KProperty0 = StandardClassIdsKt.access$reflectId("KProperty0");
        KMutableProperty0 = StandardClassIdsKt.access$reflectId("KMutableProperty0");
        KProperty1 = StandardClassIdsKt.access$reflectId("KProperty1");
        KMutableProperty1 = StandardClassIdsKt.access$reflectId("KMutableProperty1");
        KProperty2 = StandardClassIdsKt.access$reflectId("KProperty2");
        KMutableProperty2 = StandardClassIdsKt.access$reflectId("KMutableProperty2");
        KFunction = StandardClassIdsKt.access$reflectId("KFunction");
        KClass = StandardClassIdsKt.access$reflectId("KClass");
        KCallable = StandardClassIdsKt.access$reflectId("KCallable");
        KType = StandardClassIdsKt.access$reflectId("KType");
        Comparable = StandardClassIdsKt.access$baseId("Comparable");
        Number = StandardClassIdsKt.access$baseId("Number");
        Function = StandardClassIdsKt.access$baseId("Function");
        Set<ClassId> of = SetsKt.setOf((Object[]) new ClassId[]{access$baseId, access$baseId2, access$baseId3, access$baseId4, access$baseId5, access$baseId6, access$baseId7, access$baseId8});
        primitiveTypes = of;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(of, 10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
        for (Object obj : of) {
            Name shortClassName = ((ClassId) obj).getShortClassName();
            Intrinsics.checkNotNullExpressionValue(shortClassName, "getShortClassName(...)");
            linkedHashMap.put(obj, StandardClassIdsKt.access$primitiveArrayId(shortClassName));
        }
        primitiveArrayTypeByElementType = linkedHashMap;
        elementTypeByPrimitiveArrayType = StandardClassIdsKt.access$inverseMap(linkedHashMap);
        Set<ClassId> of2 = SetsKt.setOf((Object[]) new ClassId[]{UByte, UShort, UInt, ULong});
        unsignedTypes = of2;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(of2, 10);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault2), 16));
        for (Object obj2 : of2) {
            Name shortClassName2 = ((ClassId) obj2).getShortClassName();
            Intrinsics.checkNotNullExpressionValue(shortClassName2, "getShortClassName(...)");
            linkedHashMap2.put(obj2, StandardClassIdsKt.access$primitiveArrayId(shortClassName2));
        }
        unsignedArrayTypeByElementType = linkedHashMap2;
        elementTypeByUnsignedArrayType = StandardClassIdsKt.access$inverseMap(linkedHashMap2);
        constantAllowedTypes = SetsKt.plus((Set<? extends ClassId>) SetsKt.plus((Set) primitiveTypes, (Iterable) unsignedTypes), String);
        Continuation = StandardClassIdsKt.access$coroutinesId("Continuation");
        Iterator = StandardClassIdsKt.access$collectionsId("Iterator");
        Iterable = StandardClassIdsKt.access$collectionsId("Iterable");
        Collection = StandardClassIdsKt.access$collectionsId("Collection");
        List = StandardClassIdsKt.access$collectionsId("List");
        ListIterator = StandardClassIdsKt.access$collectionsId("ListIterator");
        Set = StandardClassIdsKt.access$collectionsId("Set");
        ClassId access$collectionsId = StandardClassIdsKt.access$collectionsId("Map");
        Map = access$collectionsId;
        MutableIterator = StandardClassIdsKt.access$collectionsId("MutableIterator");
        CharIterator = StandardClassIdsKt.access$collectionsId("CharIterator");
        MutableIterable = StandardClassIdsKt.access$collectionsId("MutableIterable");
        MutableCollection = StandardClassIdsKt.access$collectionsId("MutableCollection");
        MutableList = StandardClassIdsKt.access$collectionsId("MutableList");
        MutableListIterator = StandardClassIdsKt.access$collectionsId("MutableListIterator");
        MutableSet = StandardClassIdsKt.access$collectionsId("MutableSet");
        ClassId access$collectionsId2 = StandardClassIdsKt.access$collectionsId("MutableMap");
        MutableMap = access$collectionsId2;
        ClassId createNestedClassId = access$collectionsId.createNestedClassId(Name.identifier("Entry"));
        Intrinsics.checkNotNullExpressionValue(createNestedClassId, "createNestedClassId(...)");
        MapEntry = createNestedClassId;
        ClassId createNestedClassId2 = access$collectionsId2.createNestedClassId(Name.identifier("MutableEntry"));
        Intrinsics.checkNotNullExpressionValue(createNestedClassId2, "createNestedClassId(...)");
        MutableMapEntry = createNestedClassId2;
        Result = StandardClassIdsKt.access$baseId("Result");
        IntRange = StandardClassIdsKt.access$rangesId("IntRange");
        LongRange = StandardClassIdsKt.access$rangesId("LongRange");
        CharRange = StandardClassIdsKt.access$rangesId("CharRange");
        AnnotationRetention = StandardClassIdsKt.access$annotationId("AnnotationRetention");
        AnnotationTarget = StandardClassIdsKt.access$annotationId("AnnotationTarget");
        DeprecationLevel = StandardClassIdsKt.access$baseId("DeprecationLevel");
        EnumEntries = StandardClassIdsKt.access$enumsId("EnumEntries");
    }

    private StandardClassIds() {
    }

    public final ClassId getArray() {
        return Array;
    }

    public final FqName getBASE_ANNOTATION_PACKAGE() {
        return BASE_ANNOTATION_PACKAGE;
    }

    public final FqName getBASE_COLLECTIONS_PACKAGE() {
        return BASE_COLLECTIONS_PACKAGE;
    }

    public final FqName getBASE_COROUTINES_PACKAGE() {
        return BASE_COROUTINES_PACKAGE;
    }

    public final FqName getBASE_ENUMS_PACKAGE() {
        return BASE_ENUMS_PACKAGE;
    }

    public final FqName getBASE_KOTLIN_PACKAGE() {
        return BASE_KOTLIN_PACKAGE;
    }

    public final FqName getBASE_RANGES_PACKAGE() {
        return BASE_RANGES_PACKAGE;
    }

    public final FqName getBASE_REFLECT_PACKAGE() {
        return BASE_REFLECT_PACKAGE;
    }

    public final ClassId getEnumEntries() {
        return EnumEntries;
    }

    public final ClassId getKClass() {
        return KClass;
    }

    public final ClassId getKFunction() {
        return KFunction;
    }

    public final ClassId getMutableList() {
        return MutableList;
    }

    public final ClassId getMutableMap() {
        return MutableMap;
    }

    public final ClassId getMutableSet() {
        return MutableSet;
    }
}
