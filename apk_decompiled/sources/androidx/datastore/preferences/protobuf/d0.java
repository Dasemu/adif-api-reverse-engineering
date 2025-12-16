package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class d0 extends AbstractMap {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2898g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f2899a;

    /* renamed from: b, reason: collision with root package name */
    public List f2900b = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    public Map f2901c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2902d;

    /* renamed from: e, reason: collision with root package name */
    public volatile i0 f2903e;

    /* renamed from: f, reason: collision with root package name */
    public Map f2904f;

    public d0(int i) {
        this.f2899a = i;
        Map map = Collections.EMPTY_MAP;
        this.f2901c = map;
        this.f2904f = map;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.f2900b.size();
        int i4 = size - 1;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((g0) this.f2900b.get(i4)).f2913a);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i4;
            }
        }
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) / 2;
            int compareTo2 = comparable.compareTo(((g0) this.f2900b.get(i6)).f2913a);
            if (compareTo2 < 0) {
                i4 = i6 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i6;
                }
                i5 = i6 + 1;
            }
        }
        i = i5 + 1;
        return -i;
    }

    public final void b() {
        if (this.f2902d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.f2900b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f2900b.isEmpty()) {
            this.f2900b.clear();
        }
        if (this.f2901c.isEmpty()) {
            return;
        }
        this.f2901c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f2901c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f2901c.isEmpty() ? Q.f2862b : this.f2901c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f2901c.isEmpty() && !(this.f2901c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2901c = treeMap;
            this.f2904f = treeMap.descendingMap();
        }
        return (SortedMap) this.f2901c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2903e == null) {
            this.f2903e = new i0(this, 0);
        }
        return this.f2903e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        int size = size();
        if (size == d0Var.size()) {
            int size2 = this.f2900b.size();
            if (size2 != d0Var.f2900b.size()) {
                return ((AbstractSet) entrySet()).equals(d0Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(d0Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.f2901c.equals(d0Var.f2901c);
            }
            return true;
        }
        return false;
    }

    public final Object f(Comparable comparable, Object obj) {
        b();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((g0) this.f2900b.get(a2)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f2900b.isEmpty();
        int i = this.f2899a;
        if (isEmpty && !(this.f2900b instanceof ArrayList)) {
            this.f2900b = new ArrayList(i);
        }
        int i4 = -(a2 + 1);
        if (i4 >= i) {
            return e().put(comparable, obj);
        }
        if (this.f2900b.size() == i) {
            g0 g0Var = (g0) this.f2900b.remove(i - 1);
            e().put(g0Var.f2913a, g0Var.f2914b);
        }
        this.f2900b.add(i4, new g0(this, comparable, obj));
        return null;
    }

    public final Object g(int i) {
        b();
        Object obj = ((g0) this.f2900b.remove(i)).f2914b;
        if (!this.f2901c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f2900b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new g0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? ((g0) this.f2900b.get(a2)).f2914b : this.f2901c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2900b.size();
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i += ((g0) this.f2900b.get(i4)).hashCode();
        }
        return this.f2901c.size() > 0 ? this.f2901c.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj == null) {
            return f(null, obj2);
        }
        throw new ClassCastException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return g(a2);
        }
        if (this.f2901c.isEmpty()) {
            return null;
        }
        return this.f2901c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2901c.size() + this.f2900b.size();
    }
}
