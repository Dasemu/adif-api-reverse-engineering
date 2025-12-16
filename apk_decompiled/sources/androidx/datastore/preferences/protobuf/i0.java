package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class i0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f2929b;

    public /* synthetic */ i0(Map map, int i) {
        this.f2928a = i;
        this.f2929b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f2928a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((d0) this.f2929b).f((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f2928a) {
            case 0:
                ((d0) this.f2929b).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f2928a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((d0) this.f2929b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f2928a) {
            case 0:
                return new h0((d0) this.f2929b);
            default:
                return new s.c((s.e) this.f2929b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f2928a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((d0) this.f2929b).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2928a) {
            case 0:
                return ((d0) this.f2929b).size();
            default:
                return ((s.e) this.f2929b).f8352c;
        }
    }
}
