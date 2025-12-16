package kotlin.collections;

import L.b;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"kotlin/collections/ArraysKt__ArraysJVMKt", "kotlin/collections/ArraysKt__ArraysKt", "kotlin/collections/ArraysKt___ArraysJvmKt", "kotlin/collections/ArraysKt___ArraysKt"}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes3.dex */
public final class ArraysKt extends ArraysKt___ArraysKt {
    private ArraysKt() {
    }

    public static /* bridge */ /* synthetic */ List n(char[] cArr, b bVar) {
        return ArraysKt___ArraysKt.sortedWith(cArr, (Comparator<? super Character>) bVar);
    }
}
