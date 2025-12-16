package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;
import t.AbstractC0613a;

/* loaded from: classes.dex */
public final class f implements Collection, Set, KMutableCollection, KMutableSet {

    /* renamed from: a, reason: collision with root package name */
    public int[] f8341a = AbstractC0613a.f8506a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8342b = AbstractC0613a.f8507b;

    /* renamed from: c, reason: collision with root package name */
    public int f8343c;

    public f(int i) {
        if (i > 0) {
            h.b(this, i);
        }
    }

    public final Object a(int i) {
        int i4 = this.f8343c;
        Object[] objArr = this.f8342b;
        Object obj = objArr[i];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i5 = i4 - 1;
        int[] iArr = this.f8341a;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i < i5) {
                int i6 = i + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i, i6, i4);
                Object[] objArr2 = this.f8342b;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i, i6, i4);
            }
            this.f8342b[i5] = null;
        } else {
            h.b(this, i4 > 8 ? i4 + (i4 >> 1) : 8);
            if (i > 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(iArr, this.f8341a, 0, 0, i, 6, (Object) null);
                ArraysKt___ArraysJvmKt.copyInto$default(objArr, this.f8342b, 0, 0, i, 6, (Object) null);
            }
            if (i < i5) {
                int i7 = i + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, this.f8341a, i, i7, i4);
                ArraysKt___ArraysJvmKt.copyInto(objArr, this.f8342b, i, i7, i4);
            }
        }
        if (i4 != this.f8343c) {
            throw new ConcurrentModificationException();
        }
        this.f8343c = i5;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int c4;
        int i4 = this.f8343c;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            c4 = h.c(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            c4 = h.c(this, obj, hashCode);
        }
        if (c4 >= 0) {
            return false;
        }
        int i5 = ~c4;
        int[] iArr = this.f8341a;
        if (i4 >= iArr.length) {
            int i6 = 8;
            if (i4 >= 8) {
                i6 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f8342b;
            h.b(this, i6);
            if (i4 != this.f8343c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f8341a;
            if (iArr2.length != 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, iArr.length, 6, (Object) null);
                ArraysKt___ArraysJvmKt.copyInto$default(objArr, this.f8342b, 0, 0, objArr.length, 6, (Object) null);
            }
        }
        if (i5 < i4) {
            int[] iArr3 = this.f8341a;
            int i7 = i5 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr3, iArr3, i7, i5, i4);
            Object[] objArr2 = this.f8342b;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i7, i5, i4);
        }
        int i8 = this.f8343c;
        if (i4 == i8) {
            int[] iArr4 = this.f8341a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                this.f8342b[i5] = obj;
                this.f8343c = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.f8343c;
        int i = this.f8343c;
        int[] iArr = this.f8341a;
        if (iArr.length < size) {
            Object[] objArr = this.f8342b;
            h.b(this, size);
            int i4 = this.f8343c;
            if (i4 > 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(iArr, this.f8341a, 0, 0, i4, 6, (Object) null);
                ArraysKt___ArraysJvmKt.copyInto$default(objArr, this.f8342b, 0, 0, this.f8343c, 6, (Object) null);
            }
        }
        if (this.f8343c != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= add(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f8343c != 0) {
            int[] iArr = AbstractC0613a.f8506a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f8341a = iArr;
            Object[] objArr = AbstractC0613a.f8507b;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.f8342b = objArr;
            this.f8343c = 0;
        }
        if (this.f8343c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int c4;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            c4 = h.c(this, null, 0);
        } else {
            c4 = h.c(this, obj, obj.hashCode());
        }
        return c4 >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f8343c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f8343c;
            for (int i4 = 0; i4 < i; i4++) {
                if (!((Set) obj).contains(this.f8342b[i4])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f8341a;
        int i = this.f8343c;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8343c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0581a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c4;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            c4 = h.c(this, null, 0);
        } else {
            c4 = h.c(this, obj, obj.hashCode());
        }
        if (c4 < 0) {
            return false;
        }
        a(c4);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z3 = false;
        for (int i = this.f8343c - 1; -1 < i; i--) {
            if (!CollectionsKt.contains(elements, this.f8342b[i])) {
                a(i);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f8343c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.copyOfRange(this.f8342b, 0, this.f8343c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8343c * 14);
        sb.append('{');
        int i = this.f8343c;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = this.f8342b[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] result) {
        Intrinsics.checkNotNullParameter(result, "array");
        int i = this.f8343c;
        if (result.length < i) {
            result = (Object[]) Array.newInstance(result.getClass().getComponentType(), i);
        } else if (result.length > i) {
            result[i] = null;
        }
        ArraysKt___ArraysJvmKt.copyInto(this.f8342b, result, 0, 0, this.f8343c);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
