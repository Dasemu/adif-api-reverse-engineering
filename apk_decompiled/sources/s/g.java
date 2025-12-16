package s;

import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import t.AbstractC0613a;

/* loaded from: classes.dex */
public final class g implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f8344a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f8345b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f8346c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f8347d;

    public g() {
        int i;
        int i4 = 4;
        while (true) {
            i = 80;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (80 <= i5) {
                i = i5;
                break;
            }
            i4++;
        }
        int i6 = i / 8;
        this.f8345b = new long[i6];
        this.f8346c = new Object[i6];
    }

    public final void a() {
        int i = this.f8347d;
        Object[] objArr = this.f8346c;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        this.f8347d = 0;
        this.f8344a = false;
    }

    public final Object b(long j4) {
        Object obj;
        int b4 = AbstractC0613a.b(this.f8345b, this.f8347d, j4);
        if (b4 < 0 || (obj = this.f8346c[b4]) == h.f8348a) {
            return null;
        }
        return obj;
    }

    public final int c(long j4) {
        if (this.f8344a) {
            int i = this.f8347d;
            long[] jArr = this.f8345b;
            Object[] objArr = this.f8346c;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                if (obj != h.f8348a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f8344a = false;
            this.f8347d = i4;
        }
        return AbstractC0613a.b(this.f8345b, this.f8347d, j4);
    }

    public final Object clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        g gVar = (g) clone;
        gVar.f8345b = (long[]) this.f8345b.clone();
        gVar.f8346c = (Object[]) this.f8346c.clone();
        return gVar;
    }

    public final long d(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.f8347d)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f8344a) {
            long[] jArr = this.f8345b;
            Object[] objArr = this.f8346c;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != h.f8348a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f8344a = false;
            this.f8347d = i5;
        }
        return this.f8345b[i];
    }

    public final void e(long j4, Object obj) {
        int b4 = AbstractC0613a.b(this.f8345b, this.f8347d, j4);
        if (b4 >= 0) {
            this.f8346c[b4] = obj;
            return;
        }
        int i = ~b4;
        int i4 = this.f8347d;
        Object obj2 = h.f8348a;
        if (i < i4) {
            Object[] objArr = this.f8346c;
            if (objArr[i] == obj2) {
                this.f8345b[i] = j4;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f8344a) {
            long[] jArr = this.f8345b;
            if (i4 >= jArr.length) {
                Object[] objArr2 = this.f8346c;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    Object obj3 = objArr2[i6];
                    if (obj3 != obj2) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr2[i5] = obj3;
                            objArr2[i6] = null;
                        }
                        i5++;
                    }
                }
                this.f8344a = false;
                this.f8347d = i5;
                i = ~AbstractC0613a.b(this.f8345b, i5, j4);
            }
        }
        int i7 = this.f8347d;
        if (i7 >= this.f8345b.length) {
            int i8 = (i7 + 1) * 8;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 8;
            long[] copyOf = Arrays.copyOf(this.f8345b, i11);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f8345b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f8346c, i11);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f8346c = copyOf2;
        }
        int i12 = this.f8347d;
        if (i12 - i != 0) {
            long[] jArr2 = this.f8345b;
            int i13 = i + 1;
            ArraysKt___ArraysJvmKt.copyInto(jArr2, jArr2, i13, i, i12);
            Object[] objArr3 = this.f8346c;
            ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, i13, i, this.f8347d);
        }
        this.f8345b[i] = j4;
        this.f8346c[i] = obj;
        this.f8347d++;
    }

    public final void f(long j4) {
        int b4 = AbstractC0613a.b(this.f8345b, this.f8347d, j4);
        if (b4 >= 0) {
            Object[] objArr = this.f8346c;
            Object obj = objArr[b4];
            Object obj2 = h.f8348a;
            if (obj != obj2) {
                objArr[b4] = obj2;
                this.f8344a = true;
            }
        }
    }

    public final int g() {
        if (this.f8344a) {
            int i = this.f8347d;
            long[] jArr = this.f8345b;
            Object[] objArr = this.f8346c;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                if (obj != h.f8348a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f8344a = false;
            this.f8347d = i4;
        }
        return this.f8347d;
    }

    public final Object h(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.f8347d)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f8344a) {
            long[] jArr = this.f8345b;
            Object[] objArr = this.f8346c;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != h.f8348a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f8344a = false;
            this.f8347d = i5;
        }
        return this.f8346c[i];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8347d * 28);
        sb.append('{');
        int i = this.f8347d;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(d(i4));
            sb.append('=');
            Object h = h(i4);
            if (h != sb) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
