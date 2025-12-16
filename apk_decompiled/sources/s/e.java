package s;

import androidx.datastore.preferences.protobuf.i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends j implements Map {

    /* renamed from: d, reason: collision with root package name */
    public i0 f8338d;

    /* renamed from: e, reason: collision with root package name */
    public b f8339e;

    /* renamed from: f, reason: collision with root package name */
    public d f8340f;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        i0 i0Var = this.f8338d;
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(this, 1);
        this.f8338d = i0Var2;
        return i0Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.f8352c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f8352c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f8339e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f8339e = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        int i = this.f8352c;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            if (!collection.contains(f(i4))) {
                g(i4);
            }
        }
        return i != this.f8352c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f8352c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f8340f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f8340f = dVar2;
        return dVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j map) {
        super(0);
        Intrinsics.checkNotNullParameter(map, "map");
        int i = map.f8352c;
        b(this.f8352c + i);
        if (this.f8352c != 0) {
            for (int i4 = 0; i4 < i; i4++) {
                put(map.f(i4), map.i(i4));
            }
        } else if (i > 0) {
            ArraysKt___ArraysJvmKt.copyInto(map.f8350a, this.f8350a, 0, 0, i);
            ArraysKt___ArraysJvmKt.copyInto(map.f8351b, this.f8351b, 0, 0, i << 1);
            this.f8352c = i;
        }
    }
}
