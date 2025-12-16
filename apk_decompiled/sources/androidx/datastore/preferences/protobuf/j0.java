package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f2935f = new j0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f2936a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2937b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2938c;

    /* renamed from: d, reason: collision with root package name */
    public int f2939d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2940e;

    public j0(int i, int[] iArr, Object[] objArr, boolean z3) {
        this.f2936a = i;
        this.f2937b = iArr;
        this.f2938c = objArr;
        this.f2940e = z3;
    }

    public static j0 b() {
        return new j0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int y3;
        int A3;
        int u3;
        int i = this.f2939d;
        if (i != -1) {
            return i;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f2936a; i5++) {
            int i6 = this.f2937b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 != 0) {
                if (i8 == 1) {
                    ((Long) this.f2938c[i5]).getClass();
                    u3 = C0119j.u(i7);
                } else if (i8 == 2) {
                    u3 = C0119j.r(i7, (C0116g) this.f2938c[i5]);
                } else if (i8 == 3) {
                    y3 = C0119j.y(i7) * 2;
                    A3 = ((j0) this.f2938c[i5]).a();
                } else {
                    if (i8 != 5) {
                        throw new IllegalStateException(A.b());
                    }
                    ((Integer) this.f2938c[i5]).getClass();
                    u3 = C0119j.t(i7);
                }
                i4 = u3 + i4;
            } else {
                long longValue = ((Long) this.f2938c[i5]).longValue();
                y3 = C0119j.y(i7);
                A3 = C0119j.A(longValue);
            }
            i4 = A3 + y3 + i4;
        }
        this.f2939d = i4;
        return i4;
    }

    public final void c(int i, Object obj) {
        if (!this.f2940e) {
            throw new UnsupportedOperationException();
        }
        int i4 = this.f2936a;
        int[] iArr = this.f2937b;
        if (i4 == iArr.length) {
            int i5 = i4 + (i4 < 4 ? 8 : i4 >> 1);
            this.f2937b = Arrays.copyOf(iArr, i5);
            this.f2938c = Arrays.copyOf(this.f2938c, i5);
        }
        int[] iArr2 = this.f2937b;
        int i6 = this.f2936a;
        iArr2[i6] = i;
        this.f2938c[i6] = obj;
        this.f2936a = i6 + 1;
    }

    public final void d(J j4) {
        if (this.f2936a == 0) {
            return;
        }
        j4.getClass();
        for (int i = 0; i < this.f2936a; i++) {
            int i4 = this.f2937b[i];
            Object obj = this.f2938c[i];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            C0119j c0119j = (C0119j) j4.f2852a;
            if (i6 == 0) {
                c0119j.U(i5, ((Long) obj).longValue());
            } else if (i6 == 1) {
                c0119j.K(i5, ((Long) obj).longValue());
            } else if (i6 == 2) {
                j4.a(i5, (C0116g) obj);
            } else if (i6 == 3) {
                c0119j.R(i5, 3);
                ((j0) obj).d(j4);
                c0119j.R(i5, 4);
            } else {
                if (i6 != 5) {
                    throw new RuntimeException(A.b());
                }
                c0119j.I(i5, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        int i = this.f2936a;
        if (i == j0Var.f2936a) {
            int[] iArr = this.f2937b;
            int[] iArr2 = j0Var.f2937b;
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    Object[] objArr = this.f2938c;
                    Object[] objArr2 = j0Var.f2938c;
                    int i5 = this.f2936a;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (objArr[i6].equals(objArr2[i6])) {
                        }
                    }
                    return true;
                }
                if (iArr[i4] != iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f2936a;
        int i4 = (527 + i) * 31;
        int[] iArr = this.f2937b;
        int i5 = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i4 + i6) * 31;
        Object[] objArr = this.f2938c;
        int i9 = this.f2936a;
        for (int i10 = 0; i10 < i9; i10++) {
            i5 = (i5 * 31) + objArr[i10].hashCode();
        }
        return i8 + i5;
    }
}
