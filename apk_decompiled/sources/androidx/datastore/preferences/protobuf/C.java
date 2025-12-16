package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class C extends AbstractC0110b implements D, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2846b;

    static {
        new C(10).f2891a = false;
    }

    public C(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.f2846b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0110b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f2846b.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0110b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f2846b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0132x
    public final InterfaceC0132x d(int i) {
        ArrayList arrayList = this.f2846b;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C(arrayList2);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final void e(C0116g c0116g) {
        a();
        this.f2846b.add(c0116g);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f2846b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C0116g)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC0133y.f2975a);
            Q q4 = v0.f2974a;
            if (v0.f2974a.i(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        C0116g c0116g = (C0116g) obj;
        c0116g.getClass();
        Charset charset = AbstractC0133y.f2975a;
        if (c0116g.size() == 0) {
            str = "";
        } else {
            str = new String(c0116g.f2912b, c0116g.b(), c0116g.size(), charset);
        }
        int b4 = c0116g.b();
        if (v0.f2974a.i(c0116g.f2912b, b4, c0116g.size() + b4) == 0) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f2846b);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final D getUnmodifiableView() {
        return this.f2891a ? new n0(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object remove = this.f2846b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof C0116g)) {
            return new String((byte[]) remove, AbstractC0133y.f2975a);
        }
        C0116g c0116g = (C0116g) remove;
        c0116g.getClass();
        Charset charset = AbstractC0133y.f2975a;
        if (c0116g.size() == 0) {
            return "";
        }
        return new String(c0116g.f2912b, c0116g.b(), c0116g.size(), charset);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final Object s(int i) {
        return this.f2846b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.f2846b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0116g)) {
            return new String((byte[]) obj2, AbstractC0133y.f2975a);
        }
        C0116g c0116g = (C0116g) obj2;
        c0116g.getClass();
        Charset charset = AbstractC0133y.f2975a;
        if (c0116g.size() == 0) {
            return "";
        }
        return new String(c0116g.f2912b, c0116g.b(), c0116g.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2846b.size();
    }

    public C(ArrayList arrayList) {
        this.f2846b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0110b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof D) {
            collection = ((D) collection).getUnderlyingElements();
        }
        boolean addAll = this.f2846b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
