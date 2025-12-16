package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension({"SMAP\nBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,47:1\n1549#2:48\n1620#2,3:49\n1490#2:52\n1520#2,3:53\n1523#2,3:63\n1238#2,4:68\n1549#2:75\n1620#2,3:76\n372#3,7:56\n453#3:66\n403#3:67\n152#4,3:72\n*S KotlinDebug\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n*L\n28#1:48\n28#1:49,3\n29#1:52\n29#1:53,3\n29#1:63,3\n30#1:68,4\n39#1:75\n39#1:76,3\n29#1:56,7\n30#1:66\n30#1:67\n34#1:72,3\n*E\n"})
/* loaded from: classes3.dex */
public final class BuiltinSpecialProperties {
    private static final Set<FqName> GETTER_FQ_NAMES;
    private static final Map<Name, List<Name>> GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP;
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();
    private static final Map<FqName, Name> PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    private static final Set<FqName> SPECIAL_FQ_NAMES;
    private static final Set<Name> SPECIAL_SHORT_NAMES;

    static {
        FqName childSafe;
        FqName childSafe2;
        FqName child;
        FqName child2;
        FqName childSafe3;
        FqName child3;
        FqName child4;
        FqName child5;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames._enum;
        childSafe = BuiltinSpecialPropertiesKt.childSafe(fqNameUnsafe, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Pair pair = TuplesKt.to(childSafe, StandardNames.NAME);
        childSafe2 = BuiltinSpecialPropertiesKt.childSafe(fqNameUnsafe, "ordinal");
        Pair pair2 = TuplesKt.to(childSafe2, Name.identifier("ordinal"));
        child = BuiltinSpecialPropertiesKt.child(StandardNames.FqNames.collection, "size");
        Pair pair3 = TuplesKt.to(child, Name.identifier("size"));
        FqName fqName = StandardNames.FqNames.map;
        child2 = BuiltinSpecialPropertiesKt.child(fqName, "size");
        Pair pair4 = TuplesKt.to(child2, Name.identifier("size"));
        childSafe3 = BuiltinSpecialPropertiesKt.childSafe(StandardNames.FqNames.charSequence, "length");
        Pair pair5 = TuplesKt.to(childSafe3, Name.identifier("length"));
        child3 = BuiltinSpecialPropertiesKt.child(fqName, UserMetadata.KEYDATA_FILENAME);
        Pair pair6 = TuplesKt.to(child3, Name.identifier("keySet"));
        child4 = BuiltinSpecialPropertiesKt.child(fqName, "values");
        Pair pair7 = TuplesKt.to(child4, Name.identifier("values"));
        child5 = BuiltinSpecialPropertiesKt.child(fqName, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        Map<FqName, Name> mapOf = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, TuplesKt.to(child5, Name.identifier("entrySet")));
        PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP = mapOf;
        Set<Map.Entry<FqName, Name>> entrySet = mapOf.entrySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair8 = (Pair) it2.next();
            Name name = (Name) pair8.getSecond();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add((Name) pair8.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.distinct((Iterable) entry2.getValue()));
        }
        GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP = linkedHashMap2;
        Map<FqName, Name> map = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<FqName, Name> entry3 : map.entrySet()) {
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            FqNameUnsafe unsafe = entry3.getKey().parent().toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "toUnsafe(...)");
            ClassId mapKotlinToJava = javaToKotlinClassMap.mapKotlinToJava(unsafe);
            Intrinsics.checkNotNull(mapKotlinToJava);
            linkedHashSet.add(mapKotlinToJava.asSingleFqName().child(entry3.getValue()));
        }
        GETTER_FQ_NAMES = linkedHashSet;
        Set<FqName> keySet = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.keySet();
        SPECIAL_FQ_NAMES = keySet;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator<T> it3 = keySet.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((FqName) it3.next()).shortName());
        }
        SPECIAL_SHORT_NAMES = CollectionsKt.toSet(arrayList2);
    }

    private BuiltinSpecialProperties() {
    }

    public final Map<FqName, Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    }

    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(Name name1) {
        Intrinsics.checkNotNullParameter(name1, "name1");
        List<Name> list = GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP.get(name1);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final Set<FqName> getSPECIAL_FQ_NAMES() {
        return SPECIAL_FQ_NAMES;
    }

    public final Set<Name> getSPECIAL_SHORT_NAMES() {
        return SPECIAL_SHORT_NAMES;
    }
}
