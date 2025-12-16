package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import r3.C0579k;

@Metadata(d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes3.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static /* bridge */ /* synthetic */ void a(Collection collection, Iterable iterable) {
        CollectionsKt__MutableCollectionsKt.addAll(collection, iterable);
    }

    public static /* bridge */ /* synthetic */ void c(List list, Object[] objArr) {
        CollectionsKt__MutableCollectionsKt.addAll(list, objArr);
    }

    public static /* bridge */ /* synthetic */ int f(List list, C0579k c0579k) {
        return CollectionsKt__CollectionsKt.binarySearch$default(list, c0579k, 0, 0, 6, (Object) null);
    }

    public static /* bridge */ /* synthetic */ int g(Iterable iterable) {
        return CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
    }

    public static /* bridge */ /* synthetic */ List h(List list) {
        return CollectionsKt___CollectionsKt.dropLast(list, 1);
    }

    public static /* bridge */ /* synthetic */ Object i(Collection collection) {
        return CollectionsKt___CollectionsKt.first(collection);
    }

    public static /* bridge */ /* synthetic */ Appendable k(Iterable iterable, StringBuilder sb, String str, String str2, String str3, Function1 function1, int i) {
        return CollectionsKt___CollectionsKt.joinTo$default(iterable, sb, str, str2, str3, 0, null, function1, i, null);
    }

    public static /* bridge */ /* synthetic */ String l(Iterable iterable, String str, String str2, String str3, Function1 function1, int i) {
        return CollectionsKt___CollectionsKt.joinToString$default(iterable, str, str2, str3, 0, null, function1, i, null);
    }

    public static /* bridge */ /* synthetic */ void r(java.util.AbstractSet abstractSet, Function1 function1) {
        CollectionsKt__MutableCollectionsKt.retainAll(abstractSet, function1);
    }

    public static /* bridge */ /* synthetic */ int[] s(ArrayList arrayList) {
        return CollectionsKt___CollectionsKt.toIntArray(arrayList);
    }
}
