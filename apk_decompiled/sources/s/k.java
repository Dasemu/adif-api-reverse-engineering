package s;

import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import o0.C0529f;
import t.AbstractC0613a;

/* loaded from: classes.dex */
public final class k implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f8353a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f8354b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f8355c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f8356d;

    public k() {
        int i;
        int i4 = 4;
        while (true) {
            i = 40;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (40 <= i5) {
                i = i5;
                break;
            }
            i4++;
        }
        int i6 = i / 4;
        this.f8354b = new int[i6];
        this.f8355c = new Object[i6];
    }

    public final void a(int i, Object obj) {
        int i4 = this.f8356d;
        if (i4 != 0 && i <= this.f8354b[i4 - 1]) {
            e(i, obj);
            return;
        }
        if (this.f8353a && i4 >= this.f8354b.length) {
            h.a(this);
        }
        int i5 = this.f8356d;
        if (i5 >= this.f8354b.length) {
            int i6 = (i5 + 1) * 4;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 4;
            int[] copyOf = Arrays.copyOf(this.f8354b, i9);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f8354b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f8355c, i9);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f8355c = copyOf2;
        }
        this.f8354b[i5] = i;
        this.f8355c[i5] = obj;
        this.f8356d = i5 + 1;
    }

    public final boolean b(C0529f c0529f) {
        if (this.f8353a) {
            h.a(this);
        }
        int i = this.f8356d;
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                i4 = -1;
                break;
            }
            if (this.f8355c[i4] == c0529f) {
                break;
            }
            i4++;
        }
        return i4 >= 0;
    }

    public final Object c(int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int a2 = AbstractC0613a.a(this.f8354b, this.f8356d, i);
        if (a2 < 0 || (obj = this.f8355c[a2]) == h.f8349b) {
            return null;
        }
        return obj;
    }

    public final Object clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) clone;
        kVar.f8354b = (int[]) this.f8354b.clone();
        kVar.f8355c = (Object[]) this.f8355c.clone();
        return kVar;
    }

    public final int d(int i) {
        if (this.f8353a) {
            h.a(this);
        }
        return this.f8354b[i];
    }

    public final void e(int i, Object obj) {
        int a2 = AbstractC0613a.a(this.f8354b, this.f8356d, i);
        if (a2 >= 0) {
            this.f8355c[a2] = obj;
            return;
        }
        int i4 = ~a2;
        int i5 = this.f8356d;
        if (i4 < i5) {
            Object[] objArr = this.f8355c;
            if (objArr[i4] == h.f8349b) {
                this.f8354b[i4] = i;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f8353a && i5 >= this.f8354b.length) {
            h.a(this);
            i4 = ~AbstractC0613a.a(this.f8354b, this.f8356d, i);
        }
        int i6 = this.f8356d;
        if (i6 >= this.f8354b.length) {
            int i7 = (i6 + 1) * 4;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 4;
            int[] copyOf = Arrays.copyOf(this.f8354b, i10);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f8354b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f8355c, i10);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f8355c = copyOf2;
        }
        int i11 = this.f8356d;
        if (i11 - i4 != 0) {
            int[] iArr = this.f8354b;
            int i12 = i4 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i12, i4, i11);
            Object[] objArr2 = this.f8355c;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i12, i4, this.f8356d);
        }
        this.f8354b[i4] = i;
        this.f8355c[i4] = obj;
        this.f8356d++;
    }

    public final int f() {
        if (this.f8353a) {
            h.a(this);
        }
        return this.f8356d;
    }

    public final Object g(int i) {
        if (this.f8353a) {
            h.a(this);
        }
        return this.f8355c[i];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8356d * 28);
        sb.append('{');
        int i = this.f8356d;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(d(i4));
            sb.append('=');
            Object g4 = g(i4);
            if (g4 != this) {
                sb.append(g4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "buffer.toString()");
        return sb2;
    }
}
