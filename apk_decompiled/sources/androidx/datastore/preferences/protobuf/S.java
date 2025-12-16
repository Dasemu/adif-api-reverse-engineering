package androidx.datastore.preferences.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class S implements InterfaceC0111b0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f2863o = new int[0];
    public static final Unsafe p = s0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2864a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2865b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2866c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2867d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0130v f2868e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2869f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2870g;
    public final int[] h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2871j;

    /* renamed from: k, reason: collision with root package name */
    public final U f2872k;

    /* renamed from: l, reason: collision with root package name */
    public final G f2873l;

    /* renamed from: m, reason: collision with root package name */
    public final k0 f2874m;

    /* renamed from: n, reason: collision with root package name */
    public final N f2875n;

    public S(int[] iArr, Object[] objArr, int i, int i4, AbstractC0130v abstractC0130v, boolean z3, int[] iArr2, int i5, int i6, U u3, G g4, k0 k0Var, C0123n c0123n, N n4) {
        this.f2864a = iArr;
        this.f2865b = objArr;
        this.f2866c = i;
        this.f2867d = i4;
        this.f2869f = Objects.nonNull(abstractC0130v);
        this.f2870g = z3;
        this.h = iArr2;
        this.i = i5;
        this.f2871j = i6;
        this.f2872k = u3;
        this.f2873l = g4;
        this.f2874m = k0Var;
        this.f2868e = abstractC0130v;
        this.f2875n = n4;
    }

    public static int A(long j4, Object obj) {
        return ((Integer) s0.f2966d.i(j4, obj)).intValue();
    }

    public static long B(long j4, Object obj) {
        return ((Long) s0.f2966d.i(j4, obj)).longValue();
    }

    public static Field H(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder p3 = com.google.android.gms.measurement.internal.a.p("Field ", str, " for ");
            p3.append(cls.getName());
            p3.append(" not found. Known fields are ");
            p3.append(Arrays.toString(declaredFields));
            throw new RuntimeException(p3.toString());
        }
    }

    public static int K(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void O(int i, Object obj, J j4) {
        if (!(obj instanceof String)) {
            j4.a(i, (C0116g) obj);
        } else {
            ((C0119j) j4.f2852a).P(i, (String) obj);
        }
    }

    public static List s(AbstractC0108a abstractC0108a, long j4) {
        return (List) s0.f2966d.i(j4, abstractC0108a);
    }

    public static S x(C0109a0 c0109a0, U u3, G g4, k0 k0Var, C0123n c0123n, N n4) {
        if (c0109a0 instanceof C0109a0) {
            return y(c0109a0, u3, g4, k0Var, c0123n, n4);
        }
        c0109a0.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.S y(androidx.datastore.preferences.protobuf.C0109a0 r36, androidx.datastore.preferences.protobuf.U r37, androidx.datastore.preferences.protobuf.G r38, androidx.datastore.preferences.protobuf.k0 r39, androidx.datastore.preferences.protobuf.C0123n r40, androidx.datastore.preferences.protobuf.N r41) {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.y(androidx.datastore.preferences.protobuf.a0, androidx.datastore.preferences.protobuf.U, androidx.datastore.preferences.protobuf.G, androidx.datastore.preferences.protobuf.k0, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.N):androidx.datastore.preferences.protobuf.S");
    }

    public static long z(int i) {
        return i & 1048575;
    }

    public final int C(int i) {
        if (i >= this.f2866c && i <= this.f2867d) {
            int[] iArr = this.f2864a;
            int length = (iArr.length / 3) - 1;
            int i4 = 0;
            while (i4 <= length) {
                int i5 = (length + i4) >>> 1;
                int i6 = i5 * 3;
                int i7 = iArr[i6];
                if (i == i7) {
                    return i6;
                }
                if (i < i7) {
                    length = i5 - 1;
                } else {
                    i4 = i5 + 1;
                }
            }
        }
        return -1;
    }

    public final void D(Object obj, long j4, Z2.y yVar, InterfaceC0111b0 interfaceC0111b0, C0122m c0122m) {
        int z3;
        List c4 = this.f2873l.c(j4, obj);
        int i = yVar.f2311a;
        if ((i & 7) != 3) {
            throw A.b();
        }
        do {
            c4.add(yVar.u(interfaceC0111b0, c0122m));
            C0117h c0117h = (C0117h) yVar.f2314d;
            if (c0117h.c() || yVar.f2313c != 0) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == i);
        yVar.f2313c = z3;
    }

    public final void E(Object obj, int i, Z2.y yVar, InterfaceC0111b0 interfaceC0111b0, C0122m c0122m) {
        int z3;
        List c4 = this.f2873l.c(i & 1048575, obj);
        int i4 = yVar.f2311a;
        if ((i4 & 7) != 2) {
            throw A.b();
        }
        do {
            c4.add(yVar.A(interfaceC0111b0, c0122m));
            C0117h c0117h = (C0117h) yVar.f2314d;
            if (c0117h.c() || yVar.f2313c != 0) {
                return;
            } else {
                z3 = c0117h.z();
            }
        } while (z3 == i4);
        yVar.f2313c = z3;
    }

    public final void F(Object obj, int i, Z2.y yVar) {
        if ((536870912 & i) != 0) {
            s0.o(obj, i & 1048575, yVar.M());
        } else if (this.f2869f) {
            s0.o(obj, i & 1048575, yVar.K());
        } else {
            s0.o(obj, i & 1048575, yVar.h());
        }
    }

    public final void G(Object obj, int i, Z2.y yVar) {
        boolean z3 = (536870912 & i) != 0;
        G g4 = this.f2873l;
        if (z3) {
            yVar.L(g4.c(i & 1048575, obj), true);
        } else {
            yVar.L(g4.c(i & 1048575, obj), false);
        }
    }

    public final void I(int i, Object obj) {
        if (this.f2870g) {
            return;
        }
        int i4 = this.f2864a[i + 2];
        long j4 = i4 & 1048575;
        s0.m(obj, j4, s0.f2966d.g(j4, obj) | (1 << (i4 >>> 20)));
    }

    public final void J(int i, int i4, Object obj) {
        s0.m(obj, this.f2864a[i4 + 2] & 1048575, i);
    }

    public final int L(int i) {
        return this.f2864a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0042. Please report as an issue. */
    public final void M(Object obj, J j4) {
        int i;
        int i4;
        boolean z3;
        int[] iArr = this.f2864a;
        int length = iArr.length;
        Unsafe unsafe = p;
        int i5 = -1;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int L3 = L(i7);
            int i8 = iArr[i7];
            int K3 = K(L3);
            if (this.f2870g || K3 > 17) {
                i = 1048575;
                i4 = 0;
            } else {
                int i9 = iArr[i7 + 2];
                i = 1048575;
                int i10 = i9 & 1048575;
                if (i10 != i5) {
                    i6 = unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i4 = 1 << (i9 >>> 20);
            }
            long j5 = L3 & i;
            switch (K3) {
                case 0:
                    if ((i4 & i6) != 0) {
                        double e4 = s0.f2966d.e(j5, obj);
                        C0119j c0119j = (C0119j) j4.f2852a;
                        c0119j.getClass();
                        c0119j.K(i8, Double.doubleToRawLongBits(e4));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i4 & i6) != 0) {
                        float f2 = s0.f2966d.f(j5, obj);
                        C0119j c0119j2 = (C0119j) j4.f2852a;
                        c0119j2.getClass();
                        c0119j2.I(i8, Float.floatToRawIntBits(f2));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i4 & i6) != 0) {
                        ((C0119j) j4.f2852a).U(i8, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i4 & i6) != 0) {
                        ((C0119j) j4.f2852a).U(i8, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i4 & i6) != 0) {
                        ((C0119j) j4.f2852a).M(i8, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i4 & i6) != 0) {
                        ((C0119j) j4.f2852a).K(i8, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i4 & i6) != 0) {
                        ((C0119j) j4.f2852a).I(i8, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i4 & i6) != 0) {
                        ((C0119j) j4.f2852a).F(i8, s0.f2966d.c(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i4 & i6) != 0) {
                        O(i8, unsafe.getObject(obj, j5), j4);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i4 & i6) != 0) {
                        ((C0119j) j4.f2852a).O(i8, (AbstractC0108a) unsafe.getObject(obj, j5), n(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i4 & i6) != 0) {
                        j4.a(i8, (C0116g) unsafe.getObject(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i4 & i6) != 0) {
                        ((C0119j) j4.f2852a).S(i8, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i4 & i6) != 0) {
                        ((C0119j) j4.f2852a).M(i8, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i4 & i6) != 0) {
                        ((C0119j) j4.f2852a).I(i8, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i4 & i6) != 0) {
                        ((C0119j) j4.f2852a).K(i8, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i4 & i6) != 0) {
                        int i11 = unsafe.getInt(obj, j5);
                        ((C0119j) j4.f2852a).S(i8, (i11 >> 31) ^ (i11 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i4 & i6) != 0) {
                        long j6 = unsafe.getLong(obj, j5);
                        ((C0119j) j4.f2852a).U(i8, (j6 << 1) ^ (j6 >> 63));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i4 & i6) != 0) {
                        j4.b(i8, unsafe.getObject(obj, j5), n(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c0.B(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 19:
                    c0.F(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 20:
                    c0.I(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 21:
                    c0.Q(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 22:
                    c0.H(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 23:
                    c0.E(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 24:
                    c0.D(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 25:
                    c0.z(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 26:
                    c0.O(iArr[i7], (List) unsafe.getObject(obj, j5), j4);
                    break;
                case 27:
                    c0.J(iArr[i7], (List) unsafe.getObject(obj, j5), j4, n(i7));
                    break;
                case 28:
                    c0.A(iArr[i7], (List) unsafe.getObject(obj, j5), j4);
                    break;
                case 29:
                    z3 = false;
                    c0.P(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 30:
                    z3 = false;
                    c0.C(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 31:
                    z3 = false;
                    c0.K(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 32:
                    z3 = false;
                    c0.L(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 33:
                    z3 = false;
                    c0.M(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 34:
                    z3 = false;
                    c0.N(iArr[i7], (List) unsafe.getObject(obj, j5), j4, false);
                    break;
                case 35:
                    c0.B(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 36:
                    c0.F(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 37:
                    c0.I(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 38:
                    c0.Q(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 39:
                    c0.H(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 40:
                    c0.E(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 41:
                    c0.D(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 42:
                    c0.z(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 43:
                    c0.P(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 44:
                    c0.C(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 45:
                    c0.K(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 46:
                    c0.L(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 47:
                    c0.M(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 48:
                    c0.N(iArr[i7], (List) unsafe.getObject(obj, j5), j4, true);
                    break;
                case 49:
                    c0.G(iArr[i7], (List) unsafe.getObject(obj, j5), j4, n(i7));
                    break;
                case 50:
                    N(j4, i8, unsafe.getObject(obj, j5), i7);
                    break;
                case 51:
                    if (r(i8, i7, obj)) {
                        double doubleValue = ((Double) s0.f2966d.i(j5, obj)).doubleValue();
                        C0119j c0119j3 = (C0119j) j4.f2852a;
                        c0119j3.getClass();
                        c0119j3.K(i8, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case 52:
                    if (r(i8, i7, obj)) {
                        float floatValue = ((Float) s0.f2966d.i(j5, obj)).floatValue();
                        C0119j c0119j4 = (C0119j) j4.f2852a;
                        c0119j4.getClass();
                        c0119j4.I(i8, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (r(i8, i7, obj)) {
                        ((C0119j) j4.f2852a).U(i8, B(j5, obj));
                    }
                    break;
                case 54:
                    if (r(i8, i7, obj)) {
                        ((C0119j) j4.f2852a).U(i8, B(j5, obj));
                    }
                    break;
                case 55:
                    if (r(i8, i7, obj)) {
                        ((C0119j) j4.f2852a).M(i8, A(j5, obj));
                    }
                    break;
                case 56:
                    if (r(i8, i7, obj)) {
                        ((C0119j) j4.f2852a).K(i8, B(j5, obj));
                    }
                    break;
                case 57:
                    if (r(i8, i7, obj)) {
                        ((C0119j) j4.f2852a).I(i8, A(j5, obj));
                    }
                    break;
                case 58:
                    if (r(i8, i7, obj)) {
                        ((C0119j) j4.f2852a).F(i8, ((Boolean) s0.f2966d.i(j5, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i8, i7, obj)) {
                        O(i8, unsafe.getObject(obj, j5), j4);
                    }
                    break;
                case 60:
                    if (r(i8, i7, obj)) {
                        ((C0119j) j4.f2852a).O(i8, (AbstractC0108a) unsafe.getObject(obj, j5), n(i7));
                    }
                    break;
                case 61:
                    if (r(i8, i7, obj)) {
                        j4.a(i8, (C0116g) unsafe.getObject(obj, j5));
                    }
                    break;
                case 62:
                    if (r(i8, i7, obj)) {
                        ((C0119j) j4.f2852a).S(i8, A(j5, obj));
                    }
                    break;
                case 63:
                    if (r(i8, i7, obj)) {
                        ((C0119j) j4.f2852a).M(i8, A(j5, obj));
                    }
                    break;
                case 64:
                    if (r(i8, i7, obj)) {
                        ((C0119j) j4.f2852a).I(i8, A(j5, obj));
                    }
                    break;
                case 65:
                    if (r(i8, i7, obj)) {
                        ((C0119j) j4.f2852a).K(i8, B(j5, obj));
                    }
                    break;
                case 66:
                    if (r(i8, i7, obj)) {
                        int A3 = A(j5, obj);
                        ((C0119j) j4.f2852a).S(i8, (A3 >> 31) ^ (A3 << 1));
                    }
                    break;
                case 67:
                    if (r(i8, i7, obj)) {
                        long B3 = B(j5, obj);
                        ((C0119j) j4.f2852a).U(i8, (B3 << 1) ^ (B3 >> 63));
                    }
                    break;
                case 68:
                    if (r(i8, i7, obj)) {
                        j4.b(i8, unsafe.getObject(obj, j5), n(i7));
                    }
                    break;
            }
        }
        this.f2874m.getClass();
        ((AbstractC0130v) obj).unknownFields.d(j4);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x013b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(androidx.datastore.preferences.protobuf.J r22, int r23, java.lang.Object r24, int r25) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.N(androidx.datastore.preferences.protobuf.J, int, java.lang.Object, int):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final void a(Object obj, J j4) {
        j4.getClass();
        if (!this.f2870g) {
            M(obj, j4);
            return;
        }
        int[] iArr = this.f2864a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int L3 = L(i);
            int i4 = iArr[i];
            int K3 = K(L3);
            C0119j c0119j = (C0119j) j4.f2852a;
            switch (K3) {
                case 0:
                    if (q(i, obj)) {
                        double e4 = s0.f2966d.e(L3 & 1048575, obj);
                        c0119j.getClass();
                        c0119j.K(i4, Double.doubleToRawLongBits(e4));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i, obj)) {
                        float f2 = s0.f2966d.f(L3 & 1048575, obj);
                        c0119j.getClass();
                        c0119j.I(i4, Float.floatToRawIntBits(f2));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i, obj)) {
                        c0119j.U(i4, s0.f2966d.h(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i, obj)) {
                        c0119j.U(i4, s0.f2966d.h(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i, obj)) {
                        c0119j.M(i4, s0.f2966d.g(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i, obj)) {
                        c0119j.K(i4, s0.f2966d.h(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i, obj)) {
                        c0119j.I(i4, s0.f2966d.g(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(i, obj)) {
                        c0119j.F(i4, s0.f2966d.c(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(i, obj)) {
                        O(i4, s0.f2966d.i(L3 & 1048575, obj), j4);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (q(i, obj)) {
                        c0119j.O(i4, (AbstractC0108a) s0.f2966d.i(L3 & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i, obj)) {
                        j4.a(i4, (C0116g) s0.f2966d.i(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i, obj)) {
                        c0119j.S(i4, s0.f2966d.g(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i, obj)) {
                        c0119j.M(i4, s0.f2966d.g(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i, obj)) {
                        c0119j.I(i4, s0.f2966d.g(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i, obj)) {
                        c0119j.K(i4, s0.f2966d.h(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(i, obj)) {
                        int g4 = s0.f2966d.g(L3 & 1048575, obj);
                        c0119j.S(i4, (g4 >> 31) ^ (g4 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i, obj)) {
                        long h = s0.f2966d.h(L3 & 1048575, obj);
                        c0119j.U(i4, (h >> 63) ^ (h << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i, obj)) {
                        j4.b(i4, s0.f2966d.i(L3 & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c0.B(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 19:
                    c0.F(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 20:
                    c0.I(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 21:
                    c0.Q(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 22:
                    c0.H(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 23:
                    c0.E(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 24:
                    c0.D(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 25:
                    c0.z(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 26:
                    c0.O(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4);
                    break;
                case 27:
                    c0.J(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, n(i));
                    break;
                case 28:
                    c0.A(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4);
                    break;
                case 29:
                    c0.P(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 30:
                    c0.C(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 31:
                    c0.K(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 32:
                    c0.L(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 33:
                    c0.M(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 34:
                    c0.N(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, false);
                    break;
                case 35:
                    c0.B(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 36:
                    c0.F(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 37:
                    c0.I(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 38:
                    c0.Q(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 39:
                    c0.H(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 40:
                    c0.E(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 41:
                    c0.D(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 42:
                    c0.z(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 43:
                    c0.P(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 44:
                    c0.C(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 45:
                    c0.K(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 46:
                    c0.L(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 47:
                    c0.M(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 48:
                    c0.N(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, true);
                    break;
                case 49:
                    c0.G(iArr[i], (List) s0.f2966d.i(L3 & 1048575, obj), j4, n(i));
                    break;
                case 50:
                    N(j4, i4, s0.f2966d.i(L3 & 1048575, obj), i);
                    break;
                case 51:
                    if (r(i4, i, obj)) {
                        double doubleValue = ((Double) s0.f2966d.i(L3 & 1048575, obj)).doubleValue();
                        c0119j.getClass();
                        c0119j.K(i4, Double.doubleToRawLongBits(doubleValue));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i4, i, obj)) {
                        float floatValue = ((Float) s0.f2966d.i(L3 & 1048575, obj)).floatValue();
                        c0119j.getClass();
                        c0119j.I(i4, Float.floatToRawIntBits(floatValue));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i4, i, obj)) {
                        c0119j.U(i4, B(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i4, i, obj)) {
                        c0119j.U(i4, B(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i4, i, obj)) {
                        c0119j.M(i4, A(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i4, i, obj)) {
                        c0119j.K(i4, B(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i4, i, obj)) {
                        c0119j.I(i4, A(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i4, i, obj)) {
                        c0119j.F(i4, ((Boolean) s0.f2966d.i(L3 & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i4, i, obj)) {
                        O(i4, s0.f2966d.i(L3 & 1048575, obj), j4);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (r(i4, i, obj)) {
                        c0119j.O(i4, (AbstractC0108a) s0.f2966d.i(L3 & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i4, i, obj)) {
                        j4.a(i4, (C0116g) s0.f2966d.i(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i4, i, obj)) {
                        c0119j.S(i4, A(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i4, i, obj)) {
                        c0119j.M(i4, A(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i4, i, obj)) {
                        c0119j.I(i4, A(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(i4, i, obj)) {
                        c0119j.K(i4, B(L3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i4, i, obj)) {
                        int A3 = A(L3 & 1048575, obj);
                        c0119j.S(i4, (A3 >> 31) ^ (A3 << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i4, i, obj)) {
                        long B3 = B(L3 & 1048575, obj);
                        c0119j.U(i4, (B3 >> 63) ^ (B3 << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i4, i, obj)) {
                        j4.b(i4, s0.f2966d.i(L3 & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f2874m.getClass();
        ((AbstractC0130v) obj).unknownFields.d(j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(androidx.datastore.preferences.protobuf.AbstractC0130v r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.b(androidx.datastore.preferences.protobuf.v):int");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final void c(Object obj, Z2.y yVar, C0122m c0122m) {
        c0122m.getClass();
        t(this.f2874m, obj, yVar, c0122m);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final void d(Object obj) {
        int[] iArr;
        int i;
        int i4 = this.i;
        while (true) {
            iArr = this.h;
            i = this.f2871j;
            if (i4 >= i) {
                break;
            }
            long L3 = L(iArr[i4]) & 1048575;
            Object i5 = s0.f2966d.i(L3, obj);
            if (i5 != null) {
                this.f2875n.getClass();
                ((M) i5).f2858a = false;
                s0.o(obj, L3, i5);
            }
            i4++;
        }
        int length = iArr.length;
        while (i < length) {
            this.f2873l.a(iArr[i], obj);
            i++;
        }
        this.f2874m.getClass();
        ((AbstractC0130v) obj).unknownFields.f2940e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final int e(AbstractC0108a abstractC0108a) {
        return this.f2870g ? p(abstractC0108a) : o(abstractC0108a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final boolean f(Object obj) {
        int i;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            boolean z3 = true;
            if (i5 >= this.i) {
                return true;
            }
            int i7 = this.h[i5];
            int[] iArr = this.f2864a;
            int i8 = iArr[i7];
            int L3 = L(i7);
            boolean z4 = this.f2870g;
            if (z4) {
                i = 0;
            } else {
                int i9 = iArr[i7 + 2];
                int i10 = i9 & 1048575;
                i = 1 << (i9 >>> 20);
                if (i10 != i4) {
                    i6 = p.getInt(obj, i10);
                    i4 = i10;
                }
            }
            if ((268435456 & L3) != 0) {
                if (!(z4 ? q(i7, obj) : (i6 & i) != 0)) {
                    break;
                }
            }
            int K3 = K(L3);
            if (K3 == 9 || K3 == 17) {
                if (z4) {
                    z3 = q(i7, obj);
                } else if ((i & i6) == 0) {
                    z3 = false;
                }
                if (z3) {
                    if (!n(i7).f(s0.f2966d.i(L3 & 1048575, obj))) {
                        break;
                    }
                } else {
                    continue;
                }
                i5++;
            } else {
                if (K3 != 27) {
                    if (K3 == 60 || K3 == 68) {
                        if (r(i8, i7, obj)) {
                            if (!n(i7).f(s0.f2966d.i(L3 & 1048575, obj))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                        i5++;
                    } else if (K3 != 49) {
                        if (K3 == 50) {
                            Object i11 = s0.f2966d.i(L3 & 1048575, obj);
                            this.f2875n.getClass();
                            M m4 = (M) i11;
                            if (!m4.isEmpty() && ((L) m(i7)).f2856a.f2854b.f2825a == B0.MESSAGE) {
                                InterfaceC0111b0 interfaceC0111b0 = null;
                                for (Object obj2 : m4.values()) {
                                    if (interfaceC0111b0 == null) {
                                        interfaceC0111b0 = Y.f2881c.a(obj2.getClass());
                                    }
                                    if (!interfaceC0111b0.f(obj2)) {
                                        break loop0;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                        i5++;
                    }
                }
                List list = (List) s0.f2966d.i(L3 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC0111b0 n4 = n(i7);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!n4.f(list.get(i12))) {
                            break loop0;
                        }
                    }
                }
                i5++;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.c0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.c0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.c0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.c0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r7, r12)) == java.lang.Float.floatToIntBits(r5.f(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r7, r12)) == java.lang.Double.doubleToLongBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.c0.y(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(androidx.datastore.preferences.protobuf.AbstractC0130v r12, androidx.datastore.preferences.protobuf.AbstractC0130v r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.g(androidx.datastore.preferences.protobuf.v, androidx.datastore.preferences.protobuf.v):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final void h(AbstractC0130v abstractC0130v, AbstractC0130v abstractC0130v2) {
        AbstractC0130v abstractC0130v3;
        abstractC0130v2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f2864a;
            if (i >= iArr.length) {
                AbstractC0130v abstractC0130v4 = abstractC0130v;
                if (this.f2870g) {
                    return;
                }
                c0.x(this.f2874m, abstractC0130v4, abstractC0130v2);
                return;
            }
            int L3 = L(i);
            long j4 = 1048575 & L3;
            int i4 = iArr[i];
            switch (K(L3)) {
                case 0:
                    if (q(i, abstractC0130v2)) {
                        r0 r0Var = s0.f2966d;
                        abstractC0130v3 = abstractC0130v;
                        r0Var.m(abstractC0130v3, j4, r0Var.e(j4, abstractC0130v2));
                        I(i, abstractC0130v3);
                        break;
                    }
                    break;
                case 1:
                    if (q(i, abstractC0130v2)) {
                        r0 r0Var2 = s0.f2966d;
                        r0Var2.n(abstractC0130v, j4, r0Var2.f(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 2:
                    if (q(i, abstractC0130v2)) {
                        s0.n(abstractC0130v, j4, s0.f2966d.h(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 3:
                    if (q(i, abstractC0130v2)) {
                        s0.n(abstractC0130v, j4, s0.f2966d.h(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 4:
                    if (q(i, abstractC0130v2)) {
                        s0.m(abstractC0130v, j4, s0.f2966d.g(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 5:
                    if (q(i, abstractC0130v2)) {
                        s0.n(abstractC0130v, j4, s0.f2966d.h(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 6:
                    if (q(i, abstractC0130v2)) {
                        s0.m(abstractC0130v, j4, s0.f2966d.g(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 7:
                    if (q(i, abstractC0130v2)) {
                        r0 r0Var3 = s0.f2966d;
                        r0Var3.k(abstractC0130v, j4, r0Var3.c(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 8:
                    if (q(i, abstractC0130v2)) {
                        s0.o(abstractC0130v, j4, s0.f2966d.i(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 9:
                    v(abstractC0130v, abstractC0130v2, i);
                    break;
                case 10:
                    if (q(i, abstractC0130v2)) {
                        s0.o(abstractC0130v, j4, s0.f2966d.i(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 11:
                    if (q(i, abstractC0130v2)) {
                        s0.m(abstractC0130v, j4, s0.f2966d.g(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 12:
                    if (q(i, abstractC0130v2)) {
                        s0.m(abstractC0130v, j4, s0.f2966d.g(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 13:
                    if (q(i, abstractC0130v2)) {
                        s0.m(abstractC0130v, j4, s0.f2966d.g(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 14:
                    if (q(i, abstractC0130v2)) {
                        s0.n(abstractC0130v, j4, s0.f2966d.h(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 15:
                    if (q(i, abstractC0130v2)) {
                        s0.m(abstractC0130v, j4, s0.f2966d.g(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 16:
                    if (q(i, abstractC0130v2)) {
                        s0.n(abstractC0130v, j4, s0.f2966d.h(j4, abstractC0130v2));
                        I(i, abstractC0130v);
                        break;
                    }
                    break;
                case 17:
                    v(abstractC0130v, abstractC0130v2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f2873l.b(abstractC0130v, abstractC0130v2, j4);
                    break;
                case 50:
                    Class cls = c0.f2894a;
                    r0 r0Var4 = s0.f2966d;
                    Object i5 = r0Var4.i(j4, abstractC0130v);
                    Object i6 = r0Var4.i(j4, abstractC0130v2);
                    this.f2875n.getClass();
                    s0.o(abstractC0130v, j4, N.b(i5, i6));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (r(i4, i, abstractC0130v2)) {
                        s0.o(abstractC0130v, j4, s0.f2966d.i(j4, abstractC0130v2));
                        J(i4, i, abstractC0130v);
                        break;
                    }
                    break;
                case 60:
                    w(abstractC0130v, abstractC0130v2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(i4, i, abstractC0130v2)) {
                        s0.o(abstractC0130v, j4, s0.f2966d.i(j4, abstractC0130v2));
                        J(i4, i, abstractC0130v);
                        break;
                    }
                    break;
                case 68:
                    w(abstractC0130v, abstractC0130v2, i);
                    break;
            }
            abstractC0130v3 = abstractC0130v;
            i += 3;
            abstractC0130v = abstractC0130v3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final Object i() {
        this.f2872k.getClass();
        return this.f2868e.d(4);
    }

    public final boolean j(AbstractC0130v abstractC0130v, AbstractC0130v abstractC0130v2, int i) {
        return q(i, abstractC0130v) == q(i, abstractC0130v2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i4 = this.f2864a[i];
        if (s0.f2966d.i(L(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.f2865b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object m(int i) {
        return this.f2865b[(i / 3) * 2];
    }

    public final InterfaceC0111b0 n(int i) {
        int i4 = (i / 3) * 2;
        Object[] objArr = this.f2865b;
        InterfaceC0111b0 interfaceC0111b0 = (InterfaceC0111b0) objArr[i4];
        if (interfaceC0111b0 != null) {
            return interfaceC0111b0;
        }
        InterfaceC0111b0 a2 = Y.f2881c.a((Class) objArr[i4 + 1]);
        objArr[i4] = a2;
        return a2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003d. Please report as an issue. */
    public final int o(AbstractC0108a abstractC0108a) {
        int i;
        int y3;
        int A3;
        int y4;
        int w3;
        int u3;
        int y5;
        int x3;
        int r4;
        int y6;
        int i4;
        Unsafe unsafe = p;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f2864a;
            if (i6 >= iArr.length) {
                this.f2874m.getClass();
                return ((AbstractC0130v) abstractC0108a).unknownFields.a() + i7;
            }
            int L3 = L(i6);
            int i9 = iArr[i6];
            int K3 = K(L3);
            if (K3 <= 17) {
                int i10 = iArr[i6 + 2];
                int i11 = i10 & 1048575;
                i = 1 << (i10 >>> 20);
                if (i11 != i5) {
                    i8 = unsafe.getInt(abstractC0108a, i11);
                    i5 = i11;
                }
            } else {
                i = 0;
            }
            long j4 = L3 & 1048575;
            switch (K3) {
                case 0:
                    if ((i & i8) != 0) {
                        i7 = C.w.a(i9, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i8 & i) != 0) {
                        i7 = C.w.a(i9, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i8 & i) != 0) {
                        long j5 = unsafe.getLong(abstractC0108a, j4);
                        y3 = C0119j.y(i9);
                        A3 = C0119j.A(j5);
                        y6 = A3 + y3;
                        i7 += y6;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i8 & i) != 0) {
                        long j6 = unsafe.getLong(abstractC0108a, j4);
                        y3 = C0119j.y(i9);
                        A3 = C0119j.A(j6);
                        y6 = A3 + y3;
                        i7 += y6;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i8 & i) != 0) {
                        int i12 = unsafe.getInt(abstractC0108a, j4);
                        y4 = C0119j.y(i9);
                        w3 = C0119j.w(i12);
                        u3 = w3 + y4;
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i8 & i) != 0) {
                        u3 = C0119j.u(i9);
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i8 & i) != 0) {
                        u3 = C0119j.t(i9);
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i8 & i) != 0) {
                        i7 = C.w.a(i9, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0108a, j4);
                        if (object instanceof C0116g) {
                            r4 = C0119j.r(i9, (C0116g) object);
                            i7 = r4 + i7;
                            break;
                        } else {
                            y5 = C0119j.y(i9);
                            x3 = C0119j.x((String) object);
                            r4 = x3 + y5;
                            i7 = r4 + i7;
                        }
                    }
                case 9:
                    if ((i8 & i) != 0) {
                        Object object2 = unsafe.getObject(abstractC0108a, j4);
                        InterfaceC0111b0 n4 = n(i6);
                        Class cls = c0.f2894a;
                        int y7 = C0119j.y(i9);
                        int b4 = ((AbstractC0108a) object2).b(n4);
                        i7 = C.w.b(b4, b4, y7, i7);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i8 & i) != 0) {
                        u3 = C0119j.r(i9, (C0116g) unsafe.getObject(abstractC0108a, j4));
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i8 & i) != 0) {
                        int i13 = unsafe.getInt(abstractC0108a, j4);
                        y4 = C0119j.y(i9);
                        w3 = C0119j.z(i13);
                        u3 = w3 + y4;
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i8 & i) != 0) {
                        int i14 = unsafe.getInt(abstractC0108a, j4);
                        y4 = C0119j.y(i9);
                        w3 = C0119j.w(i14);
                        u3 = w3 + y4;
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i8 & i) != 0) {
                        i7 = C.w.a(i9, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i & i8) != 0) {
                        i7 = C.w.a(i9, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i8 & i) != 0) {
                        int i15 = unsafe.getInt(abstractC0108a, j4);
                        y4 = C0119j.y(i9);
                        w3 = C0119j.z((i15 >> 31) ^ (i15 << 1));
                        u3 = w3 + y4;
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i8 & i) != 0) {
                        long j7 = unsafe.getLong(abstractC0108a, j4);
                        y3 = C0119j.y(i9);
                        A3 = C0119j.A((j7 >> 63) ^ (j7 << 1));
                        y6 = A3 + y3;
                        i7 += y6;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i8 & i) != 0) {
                        u3 = C0119j.v(i9, (AbstractC0108a) unsafe.getObject(abstractC0108a, j4), n(i6));
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    u3 = c0.f(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 19:
                    u3 = c0.d(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 20:
                    u3 = c0.j(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 21:
                    u3 = c0.t(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 22:
                    u3 = c0.h(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 23:
                    u3 = c0.f(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 24:
                    u3 = c0.d(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(abstractC0108a, j4);
                    Class cls2 = c0.f2894a;
                    int size = list.size();
                    y6 = size == 0 ? 0 : (C0119j.y(i9) + 1) * size;
                    i7 += y6;
                    break;
                case 26:
                    u3 = c0.q(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 27:
                    u3 = c0.l(i9, (List) unsafe.getObject(abstractC0108a, j4), n(i6));
                    i7 += u3;
                    break;
                case 28:
                    u3 = c0.a(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 29:
                    u3 = c0.r(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 30:
                    u3 = c0.b(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 31:
                    u3 = c0.d(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 32:
                    u3 = c0.f(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 33:
                    u3 = c0.m(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 34:
                    u3 = c0.o(i9, (List) unsafe.getObject(abstractC0108a, j4));
                    i7 += u3;
                    break;
                case 35:
                    int g4 = c0.g((List) unsafe.getObject(abstractC0108a, j4));
                    if (g4 > 0) {
                        i7 = C.w.b(g4, C0119j.y(i9), g4, i7);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e4 = c0.e((List) unsafe.getObject(abstractC0108a, j4));
                    if (e4 > 0) {
                        i7 = C.w.b(e4, C0119j.y(i9), e4, i7);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k4 = c0.k((List) unsafe.getObject(abstractC0108a, j4));
                    if (k4 > 0) {
                        i7 = C.w.b(k4, C0119j.y(i9), k4, i7);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int u4 = c0.u((List) unsafe.getObject(abstractC0108a, j4));
                    if (u4 > 0) {
                        i7 = C.w.b(u4, C0119j.y(i9), u4, i7);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i16 = c0.i((List) unsafe.getObject(abstractC0108a, j4));
                    if (i16 > 0) {
                        i7 = C.w.b(i16, C0119j.y(i9), i16, i7);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g5 = c0.g((List) unsafe.getObject(abstractC0108a, j4));
                    if (g5 > 0) {
                        i7 = C.w.b(g5, C0119j.y(i9), g5, i7);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int e5 = c0.e((List) unsafe.getObject(abstractC0108a, j4));
                    if (e5 > 0) {
                        i7 = C.w.b(e5, C0119j.y(i9), e5, i7);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list2 = (List) unsafe.getObject(abstractC0108a, j4);
                    Class cls3 = c0.f2894a;
                    int size2 = list2.size();
                    if (size2 > 0) {
                        i7 = C.w.b(size2, C0119j.y(i9), size2, i7);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int s4 = c0.s((List) unsafe.getObject(abstractC0108a, j4));
                    if (s4 > 0) {
                        i7 = C.w.b(s4, C0119j.y(i9), s4, i7);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int c4 = c0.c((List) unsafe.getObject(abstractC0108a, j4));
                    if (c4 > 0) {
                        i7 = C.w.b(c4, C0119j.y(i9), c4, i7);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int e6 = c0.e((List) unsafe.getObject(abstractC0108a, j4));
                    if (e6 > 0) {
                        i7 = C.w.b(e6, C0119j.y(i9), e6, i7);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int g6 = c0.g((List) unsafe.getObject(abstractC0108a, j4));
                    if (g6 > 0) {
                        i7 = C.w.b(g6, C0119j.y(i9), g6, i7);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int n5 = c0.n((List) unsafe.getObject(abstractC0108a, j4));
                    if (n5 > 0) {
                        i7 = C.w.b(n5, C0119j.y(i9), n5, i7);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int p3 = c0.p((List) unsafe.getObject(abstractC0108a, j4));
                    if (p3 > 0) {
                        i7 = C.w.b(p3, C0119j.y(i9), p3, i7);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list3 = (List) unsafe.getObject(abstractC0108a, j4);
                    InterfaceC0111b0 n6 = n(i6);
                    Class cls4 = c0.f2894a;
                    int size3 = list3.size();
                    if (size3 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i17 = 0; i17 < size3; i17++) {
                            i4 += C0119j.v(i9, (AbstractC0108a) list3.get(i17), n6);
                        }
                    }
                    i7 += i4;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0108a, j4);
                    Object m4 = m(i6);
                    this.f2875n.getClass();
                    u3 = N.a(i9, object3, m4);
                    i7 += u3;
                    break;
                case 51:
                    if (r(i9, i6, abstractC0108a)) {
                        i7 = C.w.a(i9, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i9, i6, abstractC0108a)) {
                        i7 = C.w.a(i9, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i9, i6, abstractC0108a)) {
                        long B3 = B(j4, abstractC0108a);
                        y3 = C0119j.y(i9);
                        A3 = C0119j.A(B3);
                        y6 = A3 + y3;
                        i7 += y6;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i9, i6, abstractC0108a)) {
                        long B4 = B(j4, abstractC0108a);
                        y3 = C0119j.y(i9);
                        A3 = C0119j.A(B4);
                        y6 = A3 + y3;
                        i7 += y6;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i9, i6, abstractC0108a)) {
                        int A4 = A(j4, abstractC0108a);
                        y4 = C0119j.y(i9);
                        w3 = C0119j.w(A4);
                        u3 = w3 + y4;
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i9, i6, abstractC0108a)) {
                        u3 = C0119j.u(i9);
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i9, i6, abstractC0108a)) {
                        u3 = C0119j.t(i9);
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i9, i6, abstractC0108a)) {
                        i7 = C.w.a(i9, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!r(i9, i6, abstractC0108a)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(abstractC0108a, j4);
                        if (object4 instanceof C0116g) {
                            r4 = C0119j.r(i9, (C0116g) object4);
                            i7 = r4 + i7;
                            break;
                        } else {
                            y5 = C0119j.y(i9);
                            x3 = C0119j.x((String) object4);
                            r4 = x3 + y5;
                            i7 = r4 + i7;
                        }
                    }
                case 60:
                    if (r(i9, i6, abstractC0108a)) {
                        Object object5 = unsafe.getObject(abstractC0108a, j4);
                        InterfaceC0111b0 n7 = n(i6);
                        Class cls5 = c0.f2894a;
                        int y8 = C0119j.y(i9);
                        int b5 = ((AbstractC0108a) object5).b(n7);
                        i7 = C.w.b(b5, b5, y8, i7);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i9, i6, abstractC0108a)) {
                        u3 = C0119j.r(i9, (C0116g) unsafe.getObject(abstractC0108a, j4));
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i9, i6, abstractC0108a)) {
                        int A5 = A(j4, abstractC0108a);
                        y4 = C0119j.y(i9);
                        w3 = C0119j.z(A5);
                        u3 = w3 + y4;
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i9, i6, abstractC0108a)) {
                        int A6 = A(j4, abstractC0108a);
                        y4 = C0119j.y(i9);
                        w3 = C0119j.w(A6);
                        u3 = w3 + y4;
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i9, i6, abstractC0108a)) {
                        i7 = C.w.a(i9, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(i9, i6, abstractC0108a)) {
                        i7 = C.w.a(i9, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i9, i6, abstractC0108a)) {
                        int A7 = A(j4, abstractC0108a);
                        y4 = C0119j.y(i9);
                        w3 = C0119j.z((A7 >> 31) ^ (A7 << 1));
                        u3 = w3 + y4;
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i9, i6, abstractC0108a)) {
                        long B5 = B(j4, abstractC0108a);
                        y3 = C0119j.y(i9);
                        A3 = C0119j.A((B5 >> 63) ^ (B5 << 1));
                        y6 = A3 + y3;
                        i7 += y6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i9, i6, abstractC0108a)) {
                        u3 = C0119j.v(i9, (AbstractC0108a) unsafe.getObject(abstractC0108a, j4), n(i6));
                        i7 += u3;
                        break;
                    } else {
                        break;
                    }
            }
            i6 += 3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002f. Please report as an issue. */
    public final int p(AbstractC0108a abstractC0108a) {
        int y3;
        int A3;
        int y4;
        int w3;
        int u3;
        int y5;
        int x3;
        int r4;
        int y6;
        int A4;
        int i;
        Unsafe unsafe = p;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f2864a;
            if (i4 >= iArr.length) {
                this.f2874m.getClass();
                return ((AbstractC0130v) abstractC0108a).unknownFields.a() + i5;
            }
            int L3 = L(i4);
            int K3 = K(L3);
            int i6 = iArr[i4];
            long j4 = L3 & 1048575;
            if (K3 >= EnumC0126q.f2954b.f2959a && K3 <= EnumC0126q.f2955c.f2959a) {
                int i7 = iArr[i4 + 2];
            }
            switch (K3) {
                case 0:
                    if (q(i4, abstractC0108a)) {
                        i5 = C.w.a(i6, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i4, abstractC0108a)) {
                        i5 = C.w.a(i6, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i4, abstractC0108a)) {
                        long h = s0.f2966d.h(j4, abstractC0108a);
                        y3 = C0119j.y(i6);
                        A3 = C0119j.A(h);
                        u3 = A3 + y3;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i4, abstractC0108a)) {
                        long h4 = s0.f2966d.h(j4, abstractC0108a);
                        y3 = C0119j.y(i6);
                        A3 = C0119j.A(h4);
                        u3 = A3 + y3;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i4, abstractC0108a)) {
                        int g4 = s0.f2966d.g(j4, abstractC0108a);
                        y4 = C0119j.y(i6);
                        w3 = C0119j.w(g4);
                        u3 = w3 + y4;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i4, abstractC0108a)) {
                        u3 = C0119j.u(i6);
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i4, abstractC0108a)) {
                        u3 = C0119j.t(i6);
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(i4, abstractC0108a)) {
                        i5 = C.w.a(i6, 1, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!q(i4, abstractC0108a)) {
                        break;
                    } else {
                        Object i8 = s0.f2966d.i(j4, abstractC0108a);
                        if (i8 instanceof C0116g) {
                            r4 = C0119j.r(i6, (C0116g) i8);
                            i5 = r4 + i5;
                            break;
                        } else {
                            y5 = C0119j.y(i6);
                            x3 = C0119j.x((String) i8);
                            r4 = x3 + y5;
                            i5 = r4 + i5;
                        }
                    }
                case 9:
                    if (q(i4, abstractC0108a)) {
                        Object i9 = s0.f2966d.i(j4, abstractC0108a);
                        InterfaceC0111b0 n4 = n(i4);
                        Class cls = c0.f2894a;
                        int y7 = C0119j.y(i6);
                        int b4 = ((AbstractC0108a) i9).b(n4);
                        i5 = C.w.b(b4, b4, y7, i5);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i4, abstractC0108a)) {
                        u3 = C0119j.r(i6, (C0116g) s0.f2966d.i(j4, abstractC0108a));
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i4, abstractC0108a)) {
                        int g5 = s0.f2966d.g(j4, abstractC0108a);
                        y4 = C0119j.y(i6);
                        w3 = C0119j.z(g5);
                        u3 = w3 + y4;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i4, abstractC0108a)) {
                        int g6 = s0.f2966d.g(j4, abstractC0108a);
                        y4 = C0119j.y(i6);
                        w3 = C0119j.w(g6);
                        u3 = w3 + y4;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i4, abstractC0108a)) {
                        i5 = C.w.a(i6, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i4, abstractC0108a)) {
                        i5 = C.w.a(i6, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(i4, abstractC0108a)) {
                        int g7 = s0.f2966d.g(j4, abstractC0108a);
                        y4 = C0119j.y(i6);
                        w3 = C0119j.z((g7 >> 31) ^ (g7 << 1));
                        u3 = w3 + y4;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i4, abstractC0108a)) {
                        long h5 = s0.f2966d.h(j4, abstractC0108a);
                        y6 = C0119j.y(i6);
                        A4 = C0119j.A((h5 >> 63) ^ (h5 << 1));
                        u3 = A4 + y6;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i4, abstractC0108a)) {
                        u3 = C0119j.v(i6, (AbstractC0108a) s0.f2966d.i(j4, abstractC0108a), n(i4));
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    u3 = c0.f(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 19:
                    u3 = c0.d(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 20:
                    u3 = c0.j(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 21:
                    u3 = c0.t(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 22:
                    u3 = c0.h(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 23:
                    u3 = c0.f(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 24:
                    u3 = c0.d(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 25:
                    List s4 = s(abstractC0108a, j4);
                    Class cls2 = c0.f2894a;
                    int size = s4.size();
                    i5 += size == 0 ? 0 : (C0119j.y(i6) + 1) * size;
                    break;
                case 26:
                    u3 = c0.q(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 27:
                    u3 = c0.l(i6, s(abstractC0108a, j4), n(i4));
                    i5 += u3;
                    break;
                case 28:
                    u3 = c0.a(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 29:
                    u3 = c0.r(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 30:
                    u3 = c0.b(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 31:
                    u3 = c0.d(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 32:
                    u3 = c0.f(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 33:
                    u3 = c0.m(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 34:
                    u3 = c0.o(i6, s(abstractC0108a, j4));
                    i5 += u3;
                    break;
                case 35:
                    int g8 = c0.g((List) unsafe.getObject(abstractC0108a, j4));
                    if (g8 > 0) {
                        i5 = C.w.b(g8, C0119j.y(i6), g8, i5);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e4 = c0.e((List) unsafe.getObject(abstractC0108a, j4));
                    if (e4 > 0) {
                        i5 = C.w.b(e4, C0119j.y(i6), e4, i5);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k4 = c0.k((List) unsafe.getObject(abstractC0108a, j4));
                    if (k4 > 0) {
                        i5 = C.w.b(k4, C0119j.y(i6), k4, i5);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int u4 = c0.u((List) unsafe.getObject(abstractC0108a, j4));
                    if (u4 > 0) {
                        i5 = C.w.b(u4, C0119j.y(i6), u4, i5);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i10 = c0.i((List) unsafe.getObject(abstractC0108a, j4));
                    if (i10 > 0) {
                        i5 = C.w.b(i10, C0119j.y(i6), i10, i5);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g9 = c0.g((List) unsafe.getObject(abstractC0108a, j4));
                    if (g9 > 0) {
                        i5 = C.w.b(g9, C0119j.y(i6), g9, i5);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int e5 = c0.e((List) unsafe.getObject(abstractC0108a, j4));
                    if (e5 > 0) {
                        i5 = C.w.b(e5, C0119j.y(i6), e5, i5);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(abstractC0108a, j4);
                    Class cls3 = c0.f2894a;
                    int size2 = list.size();
                    if (size2 > 0) {
                        i5 = C.w.b(size2, C0119j.y(i6), size2, i5);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int s5 = c0.s((List) unsafe.getObject(abstractC0108a, j4));
                    if (s5 > 0) {
                        i5 = C.w.b(s5, C0119j.y(i6), s5, i5);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int c4 = c0.c((List) unsafe.getObject(abstractC0108a, j4));
                    if (c4 > 0) {
                        i5 = C.w.b(c4, C0119j.y(i6), c4, i5);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int e6 = c0.e((List) unsafe.getObject(abstractC0108a, j4));
                    if (e6 > 0) {
                        i5 = C.w.b(e6, C0119j.y(i6), e6, i5);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int g10 = c0.g((List) unsafe.getObject(abstractC0108a, j4));
                    if (g10 > 0) {
                        i5 = C.w.b(g10, C0119j.y(i6), g10, i5);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int n5 = c0.n((List) unsafe.getObject(abstractC0108a, j4));
                    if (n5 > 0) {
                        i5 = C.w.b(n5, C0119j.y(i6), n5, i5);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int p3 = c0.p((List) unsafe.getObject(abstractC0108a, j4));
                    if (p3 > 0) {
                        i5 = C.w.b(p3, C0119j.y(i6), p3, i5);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List s6 = s(abstractC0108a, j4);
                    InterfaceC0111b0 n6 = n(i4);
                    Class cls4 = c0.f2894a;
                    int size3 = s6.size();
                    if (size3 == 0) {
                        i = 0;
                    } else {
                        i = 0;
                        for (int i11 = 0; i11 < size3; i11++) {
                            i += C0119j.v(i6, (AbstractC0108a) s6.get(i11), n6);
                        }
                    }
                    i5 += i;
                    break;
                case 50:
                    Object i12 = s0.f2966d.i(j4, abstractC0108a);
                    Object m4 = m(i4);
                    this.f2875n.getClass();
                    u3 = N.a(i6, i12, m4);
                    i5 += u3;
                    break;
                case 51:
                    if (r(i6, i4, abstractC0108a)) {
                        i5 = C.w.a(i6, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i6, i4, abstractC0108a)) {
                        i5 = C.w.a(i6, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i6, i4, abstractC0108a)) {
                        long B3 = B(j4, abstractC0108a);
                        y3 = C0119j.y(i6);
                        A3 = C0119j.A(B3);
                        u3 = A3 + y3;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i6, i4, abstractC0108a)) {
                        long B4 = B(j4, abstractC0108a);
                        y3 = C0119j.y(i6);
                        A3 = C0119j.A(B4);
                        u3 = A3 + y3;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i6, i4, abstractC0108a)) {
                        int A5 = A(j4, abstractC0108a);
                        y4 = C0119j.y(i6);
                        w3 = C0119j.w(A5);
                        u3 = w3 + y4;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i6, i4, abstractC0108a)) {
                        u3 = C0119j.u(i6);
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i6, i4, abstractC0108a)) {
                        u3 = C0119j.t(i6);
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i6, i4, abstractC0108a)) {
                        i5 = C.w.a(i6, 1, i5);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!r(i6, i4, abstractC0108a)) {
                        break;
                    } else {
                        Object i13 = s0.f2966d.i(j4, abstractC0108a);
                        if (i13 instanceof C0116g) {
                            r4 = C0119j.r(i6, (C0116g) i13);
                            i5 = r4 + i5;
                            break;
                        } else {
                            y5 = C0119j.y(i6);
                            x3 = C0119j.x((String) i13);
                            r4 = x3 + y5;
                            i5 = r4 + i5;
                        }
                    }
                case 60:
                    if (r(i6, i4, abstractC0108a)) {
                        Object i14 = s0.f2966d.i(j4, abstractC0108a);
                        InterfaceC0111b0 n7 = n(i4);
                        Class cls5 = c0.f2894a;
                        int y8 = C0119j.y(i6);
                        int b5 = ((AbstractC0108a) i14).b(n7);
                        i5 = C.w.b(b5, b5, y8, i5);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i6, i4, abstractC0108a)) {
                        u3 = C0119j.r(i6, (C0116g) s0.f2966d.i(j4, abstractC0108a));
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i6, i4, abstractC0108a)) {
                        int A6 = A(j4, abstractC0108a);
                        y4 = C0119j.y(i6);
                        w3 = C0119j.z(A6);
                        u3 = w3 + y4;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i6, i4, abstractC0108a)) {
                        int A7 = A(j4, abstractC0108a);
                        y4 = C0119j.y(i6);
                        w3 = C0119j.w(A7);
                        u3 = w3 + y4;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i6, i4, abstractC0108a)) {
                        i5 = C.w.a(i6, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(i6, i4, abstractC0108a)) {
                        i5 = C.w.a(i6, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i6, i4, abstractC0108a)) {
                        int A8 = A(j4, abstractC0108a);
                        y4 = C0119j.y(i6);
                        w3 = C0119j.z((A8 >> 31) ^ (A8 << 1));
                        u3 = w3 + y4;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i6, i4, abstractC0108a)) {
                        long B5 = B(j4, abstractC0108a);
                        y6 = C0119j.y(i6);
                        A4 = C0119j.A((B5 >> 63) ^ (B5 << 1));
                        u3 = A4 + y6;
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i6, i4, abstractC0108a)) {
                        u3 = C0119j.v(i6, (AbstractC0108a) s0.f2966d.i(j4, abstractC0108a), n(i4));
                        i5 += u3;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
        }
    }

    public final boolean q(int i, Object obj) {
        if (this.f2870g) {
            int L3 = L(i);
            long j4 = L3 & 1048575;
            switch (K(L3)) {
                case 0:
                    if (s0.f2966d.e(j4, obj) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        return false;
                    }
                    break;
                case 1:
                    if (s0.f2966d.f(j4, obj) == BitmapDescriptorFactory.HUE_RED) {
                        return false;
                    }
                    break;
                case 2:
                    if (s0.f2966d.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (s0.f2966d.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (s0.f2966d.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (s0.f2966d.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (s0.f2966d.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return s0.f2966d.c(j4, obj);
                case 8:
                    Object i4 = s0.f2966d.i(j4, obj);
                    if (i4 instanceof String) {
                        return !((String) i4).isEmpty();
                    }
                    if (i4 instanceof C0116g) {
                        return !C0116g.f2909c.equals(i4);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (s0.f2966d.i(j4, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0116g.f2909c.equals(s0.f2966d.i(j4, obj));
                case 11:
                    if (s0.f2966d.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (s0.f2966d.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (s0.f2966d.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (s0.f2966d.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (s0.f2966d.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (s0.f2966d.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (s0.f2966d.i(j4, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((s0.f2966d.g(r5 & 1048575, obj) & (1 << (this.f2864a[i + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(int i, int i4, Object obj) {
        return s0.f2966d.g((long) (this.f2864a[i4 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x006f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0608 A[Catch: all -> 0x04c4, TryCatch #0 {all -> 0x04c4, blocks: (B:59:0x0603, B:61:0x0608, B:63:0x060f, B:65:0x0616, B:140:0x045d, B:143:0x0469, B:144:0x047f, B:145:0x0495, B:146:0x04ab, B:147:0x04c7, B:148:0x04dd, B:149:0x04f3, B:151:0x04ff, B:152:0x051e, B:153:0x0532, B:154:0x0540, B:155:0x0558, B:156:0x056e, B:157:0x0584, B:158:0x059a, B:159:0x05b0, B:160:0x05c6, B:161:0x05dd, B:169:0x05f4), top: B:58:0x0603 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x061c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0636 A[LOOP:3: B:77:0x0634->B:78:0x0636, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0640  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(androidx.datastore.preferences.protobuf.k0 r17, java.lang.Object r18, Z2.y r19, androidx.datastore.preferences.protobuf.C0122m r20) {
        /*
            Method dump skipped, instructions count: 1752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.t(androidx.datastore.preferences.protobuf.k0, java.lang.Object, Z2.y, androidx.datastore.preferences.protobuf.m):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r9.put(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r10.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.lang.Object r8, int r9, java.lang.Object r10, androidx.datastore.preferences.protobuf.C0122m r11, Z2.y r12) {
        /*
            r7 = this;
            int r9 = r7.L(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            androidx.datastore.preferences.protobuf.r0 r9 = androidx.datastore.preferences.protobuf.s0.f2966d
            java.lang.Object r9 = r9.i(r0, r8)
            androidx.datastore.preferences.protobuf.N r7 = r7.f2875n
            if (r9 != 0) goto L20
            r7.getClass()
            androidx.datastore.preferences.protobuf.M r9 = androidx.datastore.preferences.protobuf.M.f2857b
            androidx.datastore.preferences.protobuf.M r9 = r9.b()
            androidx.datastore.preferences.protobuf.s0.o(r8, r0, r9)
            goto L37
        L20:
            r7.getClass()
            r2 = r9
            androidx.datastore.preferences.protobuf.M r2 = (androidx.datastore.preferences.protobuf.M) r2
            boolean r2 = r2.f2858a
            if (r2 != 0) goto L37
            androidx.datastore.preferences.protobuf.M r2 = androidx.datastore.preferences.protobuf.M.f2857b
            androidx.datastore.preferences.protobuf.M r2 = r2.b()
            androidx.datastore.preferences.protobuf.N.b(r2, r9)
            androidx.datastore.preferences.protobuf.s0.o(r8, r0, r2)
            r9 = r2
        L37:
            r7.getClass()
            androidx.datastore.preferences.protobuf.M r9 = (androidx.datastore.preferences.protobuf.M) r9
            androidx.datastore.preferences.protobuf.L r10 = (androidx.datastore.preferences.protobuf.L) r10
            androidx.datastore.preferences.protobuf.K r7 = r10.f2856a
            r8 = 2
            r12.S(r8)
            java.lang.Object r10 = r12.f2314d
            androidx.datastore.preferences.protobuf.h r10 = (androidx.datastore.preferences.protobuf.C0117h) r10
            int r0 = r10.A()
            int r0 = r10.e(r0)
            java.lang.String r1 = ""
            a0.j r2 = r7.f2855c
            r3 = r2
        L55:
            int r4 = r12.d()     // Catch: java.lang.Throwable -> L79
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L9b
            boolean r5 = r10.c()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L65
            goto L9b
        L65:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L86
            if (r4 == r8) goto L7b
            boolean r4 = r12.T()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0134z -> L8e
            if (r4 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.A r4 = new androidx.datastore.preferences.protobuf.A     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0134z -> L8e
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0134z -> L8e
            throw r4     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0134z -> L8e
        L79:
            r7 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.y0 r4 = r7.f2854b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0134z -> L8e
            java.lang.Class r5 = r2.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0134z -> L8e
            java.lang.Object r3 = r12.n(r4, r5, r11)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0134z -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.w0 r4 = r7.f2853a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0134z -> L8e
            r5 = 0
            java.lang.Object r1 = r12.n(r4, r5, r5)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0134z -> L8e
            goto L55
        L8e:
            boolean r4 = r12.T()     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.A r7 = new androidx.datastore.preferences.protobuf.A     // Catch: java.lang.Throwable -> L79
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L79
            throw r7     // Catch: java.lang.Throwable -> L79
        L9b:
            r9.put(r1, r3)     // Catch: java.lang.Throwable -> L79
            r10.d(r0)
            return
        La2:
            r10.d(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.u(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.m, Z2.y):void");
    }

    public final void v(AbstractC0130v abstractC0130v, AbstractC0130v abstractC0130v2, int i) {
        long L3 = L(i) & 1048575;
        if (q(i, abstractC0130v2)) {
            r0 r0Var = s0.f2966d;
            Object i4 = r0Var.i(L3, abstractC0130v);
            Object i5 = r0Var.i(L3, abstractC0130v2);
            if (i4 != null && i5 != null) {
                s0.o(abstractC0130v, L3, AbstractC0133y.c(i4, i5));
                I(i, abstractC0130v);
            } else if (i5 != null) {
                s0.o(abstractC0130v, L3, i5);
                I(i, abstractC0130v);
            }
        }
    }

    public final void w(AbstractC0130v abstractC0130v, AbstractC0130v abstractC0130v2, int i) {
        int L3 = L(i);
        int i4 = this.f2864a[i];
        long j4 = L3 & 1048575;
        if (r(i4, i, abstractC0130v2)) {
            r0 r0Var = s0.f2966d;
            Object i5 = r0Var.i(j4, abstractC0130v);
            Object i6 = r0Var.i(j4, abstractC0130v2);
            if (i5 != null && i6 != null) {
                s0.o(abstractC0130v, j4, AbstractC0133y.c(i5, i6));
                J(i4, i, abstractC0130v);
            } else if (i6 != null) {
                s0.o(abstractC0130v, j4, i6);
                J(i4, i, abstractC0130v);
            }
        }
    }
}
