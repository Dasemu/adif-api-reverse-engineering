package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Z extends AbstractC0110b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Z f2884d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2885b;

    /* renamed from: c, reason: collision with root package name */
    public int f2886c;

    static {
        Z z3 = new Z(new Object[0], 0);
        f2884d = z3;
        z3.f2891a = false;
    }

    public Z(Object[] objArr, int i) {
        this.f2885b = objArr;
        this.f2886c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0110b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f2886c;
        Object[] objArr = this.f2885b;
        if (i == objArr.length) {
            this.f2885b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2885b;
        int i4 = this.f2886c;
        this.f2886c = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.f2886c) {
            StringBuilder t2 = C.w.t(i, "Index:", ", Size:");
            t2.append(this.f2886c);
            throw new IndexOutOfBoundsException(t2.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0132x
    public final InterfaceC0132x d(int i) {
        if (i >= this.f2886c) {
            return new Z(Arrays.copyOf(this.f2885b, i), this.f2886c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.f2885b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.f2885b;
        Object obj = objArr[i];
        if (i < this.f2886c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f2886c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.f2885b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2886c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        a();
        if (i >= 0 && i <= (i4 = this.f2886c)) {
            Object[] objArr = this.f2885b;
            if (i4 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i4 - i);
            } else {
                Object[] objArr2 = new Object[((i4 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f2885b, i, objArr2, i + 1, this.f2886c - i);
                this.f2885b = objArr2;
            }
            this.f2885b[i] = obj;
            this.f2886c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder t2 = C.w.t(i, "Index:", ", Size:");
        t2.append(this.f2886c);
        throw new IndexOutOfBoundsException(t2.toString());
    }
}
