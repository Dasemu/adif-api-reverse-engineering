package S0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class p implements Iterable, KMappedMarker {

    /* renamed from: b, reason: collision with root package name */
    public static final p f1515b = new p(MapsKt.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    public final Map f1516a;

    public p(Map map) {
        this.f1516a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return Intrinsics.areEqual(this.f1516a, ((p) obj).f1516a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1516a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f1516a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(TuplesKt.to(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f1516a + ')';
    }
}
