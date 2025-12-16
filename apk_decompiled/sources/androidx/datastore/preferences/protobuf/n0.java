package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n0 extends AbstractList implements D, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final C f2947a;

    public n0(C c4) {
        this.f2947a = c4;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final void e(C0116g c0116g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f2947a.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f2947a.f2846b);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final D getUnmodifiableView() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.m0, java.util.Iterator, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.f2946a = this.f2947a.iterator();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.l0, java.util.ListIterator, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ?? obj = new Object();
        obj.f2942a = this.f2947a.listIterator(i);
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final Object s(int i) {
        return this.f2947a.f2846b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2947a.size();
    }
}
