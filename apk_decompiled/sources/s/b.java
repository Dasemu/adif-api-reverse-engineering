package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f8332a;

    public b(e eVar) {
        this.f8332a = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f8332a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8332a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f8332a.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        e eVar = this.f8332a;
        try {
            if (eVar.f8352c == set.size()) {
                return eVar.j(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        e eVar = this.f8332a;
        int i = 0;
        for (int i4 = eVar.f8352c - 1; i4 >= 0; i4--) {
            Object f2 = eVar.f(i4);
            i += f2 == null ? 0 : f2.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f8332a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0581a(this.f8332a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f8332a;
        int d4 = eVar.d(obj);
        if (d4 < 0) {
            return false;
        }
        eVar.g(d4);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f8332a.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f8332a.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f8332a.f8352c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f8332a;
        int i = eVar.f8352c;
        Object[] objArr = new Object[i];
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = eVar.f(i4);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f8332a;
        int i = eVar.f8352c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = eVar.f(i4);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
