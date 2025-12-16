package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

@SourceDebugExtension({"SMAP\nValueClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1549#2:47\n1620#2,3:48\n1549#2:51\n1620#2,3:52\n1549#2:55\n1620#2,3:56\n*S KotlinDebug\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n*L\n25#1:47\n25#1:48,3\n29#1:51\n29#1:52,3\n32#1:55\n32#1:56,3\n*E\n"})
/* loaded from: classes3.dex */
public final class ValueClassUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    public static final <T extends SimpleTypeMarker> ValueClassRepresentation<T> loadValueClassRepresentation(ProtoBuf.Class r4, NameResolver nameResolver, TypeTable typeTable, Function1<? super ProtoBuf.Type, ? extends T> typeDeserializer, Function1<? super Name, ? extends T> typeOfPublicProperty) {
        T invoke;
        int collectionSizeOrDefault;
        ?? multiFieldValueClassUnderlyingTypeList;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        Intrinsics.checkNotNullParameter(typeOfPublicProperty, "typeOfPublicProperty");
        if (r4.getMultiFieldValueClassUnderlyingNameCount() <= 0) {
            if (!r4.hasInlineClassUnderlyingPropertyName()) {
                return null;
            }
            Name name = NameResolverUtilKt.getName(nameResolver, r4.getInlineClassUnderlyingPropertyName());
            ProtoBuf.Type inlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(r4, typeTable);
            if ((inlineClassUnderlyingType != null && (invoke = typeDeserializer.invoke(inlineClassUnderlyingType)) != null) || (invoke = typeOfPublicProperty.invoke(name)) != null) {
                return new InlineClassRepresentation(name, invoke);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.getName(nameResolver, r4.getFqName()) + " with property " + name).toString());
        }
        List<Integer> multiFieldValueClassUnderlyingNameList = r4.getMultiFieldValueClassUnderlyingNameList();
        Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingNameList, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = multiFieldValueClassUnderlyingNameList;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : list) {
            Intrinsics.checkNotNull(num);
            arrayList.add(NameResolverUtilKt.getName(nameResolver, num.intValue()));
        }
        Pair pair = TuplesKt.to(Integer.valueOf(r4.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(r4.getMultiFieldValueClassUnderlyingTypeCount()));
        if (Intrinsics.areEqual(pair, TuplesKt.to(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> multiFieldValueClassUnderlyingTypeIdList = r4.getMultiFieldValueClassUnderlyingTypeIdList();
            Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingTypeIdList, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = multiFieldValueClassUnderlyingTypeIdList;
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            multiFieldValueClassUnderlyingTypeList = new ArrayList(collectionSizeOrDefault3);
            for (Integer num2 : list2) {
                Intrinsics.checkNotNull(num2);
                multiFieldValueClassUnderlyingTypeList.add(typeTable.get(num2.intValue()));
            }
        } else {
            if (!Intrinsics.areEqual(pair, TuplesKt.to(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + NameResolverUtilKt.getName(nameResolver, r4.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            multiFieldValueClassUnderlyingTypeList = r4.getMultiFieldValueClassUnderlyingTypeList();
        }
        Intrinsics.checkNotNull(multiFieldValueClassUnderlyingTypeList);
        Iterable iterable = (Iterable) multiFieldValueClassUnderlyingTypeList;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new MultiFieldValueClassRepresentation(CollectionsKt.zip(arrayList, arrayList2));
    }
}
