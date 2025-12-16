package c3;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;

/* loaded from: classes3.dex */
public final class b extends AbstractMutableMap {

    /* renamed from: a, reason: collision with root package name */
    public final List f4294a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f4295b;

    public b(List parameterKeys, Object[] parameterValues) {
        Intrinsics.checkNotNullParameter(parameterKeys, "parameterKeys");
        Intrinsics.checkNotNullParameter(parameterValues, "parameterValues");
        this.f4294a = parameterKeys;
        this.f4295b = parameterValues;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof KParameter)) {
            return false;
        }
        KParameter key = (KParameter) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f4295b[key.getIndex()] != c.f4296a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof KParameter)) {
            return null;
        }
        KParameter key = (KParameter) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj2 = this.f4295b[key.getIndex()];
        if (obj2 != c.f4296a) {
            return obj2;
        }
        return null;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set getEntries() {
        int collectionSizeOrDefault;
        List list = this.f4294a;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i = 0;
        for (Object obj : list) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new AbstractMap.SimpleEntry((KParameter) obj, this.f4295b[i]));
            i = i4;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((AbstractMap.SimpleEntry) next).getValue() != c.f4296a) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof KParameter) ? obj2 : super.getOrDefault((KParameter) obj, obj2);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        KParameter key = (KParameter) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof KParameter) {
            return super.remove((KParameter) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj instanceof KParameter) {
            return super.remove((KParameter) obj, obj2);
        }
        return false;
    }
}
