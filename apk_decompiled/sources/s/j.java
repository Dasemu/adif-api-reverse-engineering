package s;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import t.AbstractC0613a;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f8350a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8351b;

    /* renamed from: c, reason: collision with root package name */
    public int f8352c;

    public j(int i) {
        this.f8350a = i == 0 ? AbstractC0613a.f8506a : new int[i];
        this.f8351b = i == 0 ? AbstractC0613a.f8507b : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.f8352c * 2;
        Object[] objArr = this.f8351b;
        if (obj == null) {
            for (int i4 = 1; i4 < i; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i; i5 += 2) {
            if (Intrinsics.areEqual(obj, objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i4 = this.f8352c;
        int[] iArr = this.f8350a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f8350a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f8351b, i * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f8351b = copyOf2;
        }
        if (this.f8352c != i4) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i4 = this.f8352c;
        if (i4 == 0) {
            return -1;
        }
        int a2 = AbstractC0613a.a(this.f8350a, i4, i);
        if (a2 < 0 || Intrinsics.areEqual(obj, this.f8351b[a2 << 1])) {
            return a2;
        }
        int i5 = a2 + 1;
        while (i5 < i4 && this.f8350a[i5] == i) {
            if (Intrinsics.areEqual(obj, this.f8351b[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a2 - 1; i6 >= 0 && this.f8350a[i6] == i; i6--) {
            if (Intrinsics.areEqual(obj, this.f8351b[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    public final void clear() {
        if (this.f8352c > 0) {
            this.f8350a = AbstractC0613a.f8506a;
            this.f8351b = AbstractC0613a.f8507b;
            this.f8352c = 0;
        }
        if (this.f8352c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.f8352c;
        if (i == 0) {
            return -1;
        }
        int a2 = AbstractC0613a.a(this.f8350a, i, 0);
        if (a2 < 0 || this.f8351b[a2 << 1] == null) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i && this.f8350a[i4] == 0) {
            if (this.f8351b[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.f8350a[i5] == 0; i5--) {
            if (this.f8351b[i5 << 1] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j) {
                int i = this.f8352c;
                if (i != ((j) obj).f8352c) {
                    return false;
                }
                j jVar = (j) obj;
                for (int i4 = 0; i4 < i; i4++) {
                    Object f2 = f(i4);
                    Object i5 = i(i4);
                    Object obj2 = jVar.get(f2);
                    if (i5 == null) {
                        if (obj2 != null || !jVar.containsKey(f2)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(i5, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f8352c != ((Map) obj).size()) {
                return false;
            }
            int i6 = this.f8352c;
            for (int i7 = 0; i7 < i6; i7++) {
                Object f4 = f(i7);
                Object i8 = i(i7);
                Object obj3 = ((Map) obj).get(f4);
                if (i8 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f4)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(i8, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i < 0 || i >= this.f8352c) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f8351b[i << 1];
    }

    public final Object g(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.f8352c)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f8351b;
        int i5 = i << 1;
        Object obj = objArr[i5 + 1];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i6 = i4 - 1;
        int[] iArr = this.f8350a;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i < i6) {
                int i7 = i + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i, i7, i4);
                Object[] objArr2 = this.f8351b;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i5, i7 << 1, i4 << 1);
            }
            Object[] objArr3 = this.f8351b;
            int i8 = i6 << 1;
            objArr3[i8] = null;
            objArr3[i8 + 1] = null;
        } else {
            int i9 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i9);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f8350a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f8351b, i9 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f8351b = copyOf2;
            if (i4 != this.f8352c) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, this.f8350a, 0, 0, i);
                ArraysKt___ArraysJvmKt.copyInto(objArr, this.f8351b, 0, 0, i5);
            }
            if (i < i6) {
                int i10 = i + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, this.f8350a, i, i10, i4);
                ArraysKt___ArraysJvmKt.copyInto(objArr, this.f8351b, i5, i10 << 1, i4 << 1);
            }
        }
        if (i4 != this.f8352c) {
            throw new ConcurrentModificationException();
        }
        this.f8352c = i6;
        return obj;
    }

    public Object get(Object obj) {
        int d4 = d(obj);
        if (d4 >= 0) {
            return this.f8351b[(d4 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d4 = d(obj);
        return d4 >= 0 ? this.f8351b[(d4 << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        if (i < 0 || i >= this.f8352c) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i4 = (i << 1) + 1;
        Object[] objArr = this.f8351b;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f8350a;
        Object[] objArr = this.f8351b;
        int i = this.f8352c;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            Object obj = objArr[i4];
            i6 += (obj != null ? obj.hashCode() : 0) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public final Object i(int i) {
        if (i < 0 || i >= this.f8352c) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f8351b[(i << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f8352c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f8352c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c4 = obj != null ? c(hashCode, obj) : e();
        if (c4 >= 0) {
            int i4 = (c4 << 1) + 1;
            Object[] objArr = this.f8351b;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~c4;
        int[] iArr = this.f8350a;
        if (i >= iArr.length) {
            int i6 = 8;
            if (i >= 8) {
                i6 = (i >> 1) + i;
            } else if (i < 4) {
                i6 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f8350a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f8351b, i6 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f8351b = copyOf2;
            if (i != this.f8352c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i) {
            int[] iArr2 = this.f8350a;
            int i7 = i5 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i7, i5, i);
            Object[] objArr2 = this.f8351b;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i7 << 1, i5 << 1, this.f8352c << 1);
        }
        int i8 = this.f8352c;
        if (i == i8) {
            int[] iArr3 = this.f8350a;
            if (i5 < iArr3.length) {
                iArr3[i5] = hashCode;
                Object[] objArr3 = this.f8351b;
                int i9 = i5 << 1;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.f8352c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d4 = d(obj);
        if (d4 >= 0) {
            return g(d4);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d4 = d(obj);
        if (d4 >= 0) {
            return h(d4, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f8352c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8352c * 28);
        sb.append('{');
        int i = this.f8352c;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object f2 = f(i4);
            if (f2 != sb) {
                sb.append(f2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i5 = i(i4);
            if (i5 != sb) {
                sb.append(i5);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d4 = d(obj);
        if (d4 < 0 || !Intrinsics.areEqual(obj2, i(d4))) {
            return false;
        }
        g(d4);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d4 = d(obj);
        if (d4 < 0 || !Intrinsics.areEqual(obj2, i(d4))) {
            return false;
        }
        h(d4, obj3);
        return true;
    }
}
