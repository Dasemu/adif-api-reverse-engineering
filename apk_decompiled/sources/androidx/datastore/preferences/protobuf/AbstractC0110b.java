package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0110b extends AbstractList implements InterfaceC0132x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2891a = true;

    public final void a() {
        if (!this.f2891a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        a();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i = (i * 31) + get(i4).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        a();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        a();
        return super.addAll(i, collection);
    }
}
