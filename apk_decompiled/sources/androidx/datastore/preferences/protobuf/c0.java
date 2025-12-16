package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2894a;

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f2895b;

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f2896c;

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f2897d;

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.datastore.preferences.protobuf.k0, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f2894a = cls;
        f2895b = w(false);
        f2896c = w(true);
        f2897d = new Object();
    }

    public static void A(int i, List list, J j4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j4.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((C0119j) j4.f2852a).G(i, (C0116g) list.get(i4));
        }
    }

    public static void B(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                double doubleValue = ((Double) list.get(i4)).doubleValue();
                c0119j.getClass();
                c0119j.K(i, Double.doubleToRawLongBits(doubleValue));
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Double) list.get(i6)).getClass();
            Logger logger = C0119j.h;
            i5 += 8;
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            c0119j.L(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void C(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0119j.M(i, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0119j.w(((Integer) list.get(i6)).intValue());
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            c0119j.N(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void D(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0119j.I(i, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0119j.h;
            i5 += 4;
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            c0119j.J(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void E(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0119j.K(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0119j.h;
            i5 += 8;
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            c0119j.L(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void F(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                float floatValue = ((Float) list.get(i4)).floatValue();
                c0119j.getClass();
                c0119j.I(i, Float.floatToRawIntBits(floatValue));
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Float) list.get(i6)).getClass();
            Logger logger = C0119j.h;
            i5 += 4;
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            c0119j.J(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void G(int i, List list, J j4, InterfaceC0111b0 interfaceC0111b0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j4.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            j4.b(i, list.get(i4), interfaceC0111b0);
        }
    }

    public static void H(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0119j.M(i, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0119j.w(((Integer) list.get(i6)).intValue());
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            c0119j.N(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void I(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0119j.U(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0119j.A(((Long) list.get(i6)).longValue());
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            c0119j.V(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void J(int i, List list, J j4, InterfaceC0111b0 interfaceC0111b0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j4.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((C0119j) j4.f2852a).O(i, (AbstractC0108a) list.get(i4), interfaceC0111b0);
        }
    }

    public static void K(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0119j.I(i, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0119j.h;
            i5 += 4;
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            c0119j.J(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void L(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0119j.K(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0119j.h;
            i5 += 8;
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            c0119j.L(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void M(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                int intValue = ((Integer) list.get(i4)).intValue();
                c0119j.S(i, (intValue >> 31) ^ (intValue << 1));
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue2 = ((Integer) list.get(i6)).intValue();
            i5 += C0119j.z((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            int intValue3 = ((Integer) list.get(i4)).intValue();
            c0119j.T((intValue3 >> 31) ^ (intValue3 << 1));
            i4++;
        }
    }

    public static void N(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                long longValue = ((Long) list.get(i4)).longValue();
                c0119j.U(i, (longValue >> 63) ^ (longValue << 1));
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long longValue2 = ((Long) list.get(i6)).longValue();
            i5 += C0119j.A((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            long longValue3 = ((Long) list.get(i4)).longValue();
            c0119j.V((longValue3 >> 63) ^ (longValue3 << 1));
            i4++;
        }
    }

    public static void O(int i, List list, J j4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j4.getClass();
        boolean z3 = list instanceof D;
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0119j.P(i, (String) list.get(i4));
                i4++;
            }
            return;
        }
        D d4 = (D) list;
        while (i4 < list.size()) {
            Object s4 = d4.s(i4);
            if (s4 instanceof String) {
                c0119j.P(i, (String) s4);
            } else {
                c0119j.G(i, (C0116g) s4);
            }
            i4++;
        }
    }

    public static void P(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0119j.S(i, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0119j.z(((Integer) list.get(i6)).intValue());
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            c0119j.T(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void Q(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0119j.U(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0119j.A(((Long) list.get(i6)).longValue());
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            c0119j.V(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y3 = C0119j.y(i) * size;
        for (int i4 = 0; i4 < list.size(); i4++) {
            y3 += C0119j.s((C0116g) list.get(i4));
        }
        return y3;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0119j.y(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0131w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i += C0119j.w(((Integer) list.get(i4)).intValue());
        }
        return i;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0119j.t(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0119j.u(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0119j.y(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0131w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i += C0119j.w(((Integer) list.get(i4)).intValue());
        }
        return i;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0119j.y(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof H) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i += C0119j.A(((Long) list.get(i4)).longValue());
        }
        return i;
    }

    public static int l(int i, List list, InterfaceC0111b0 interfaceC0111b0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y3 = C0119j.y(i) * size;
        for (int i4 = 0; i4 < size; i4++) {
            int b4 = ((AbstractC0108a) list.get(i4)).b(interfaceC0111b0);
            y3 += C0119j.z(b4) + b4;
        }
        return y3;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0119j.y(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof AbstractC0131w)) {
                int i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i += C0119j.z((intValue >> 31) ^ (intValue << 1));
                }
                return i;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0119j.y(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof H)) {
                int i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i += C0119j.A((longValue >> 63) ^ (longValue << 1));
                }
                return i;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int y3 = C0119j.y(i) * size;
        if (!(list instanceof D)) {
            while (i4 < size) {
                Object obj = list.get(i4);
                y3 = (obj instanceof C0116g ? C0119j.s((C0116g) obj) : C0119j.x((String) obj)) + y3;
                i4++;
            }
            return y3;
        }
        D d4 = (D) list;
        while (i4 < size) {
            Object s4 = d4.s(i4);
            y3 = (s4 instanceof C0116g ? C0119j.s((C0116g) s4) : C0119j.x((String) s4)) + y3;
            i4++;
        }
        return y3;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0119j.y(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0131w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i += C0119j.z(((Integer) list.get(i4)).intValue());
        }
        return i;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0119j.y(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof H) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i += C0119j.A(((Long) list.get(i4)).longValue());
        }
        return i;
    }

    public static Object v(int i, List list, Object obj, k0 k0Var) {
        return obj;
    }

    public static k0 w(boolean z3) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (k0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z3));
            } catch (Throwable unused2) {
                return null;
            }
        }
        return null;
    }

    public static void x(k0 k0Var, AbstractC0130v abstractC0130v, AbstractC0130v abstractC0130v2) {
        k0Var.getClass();
        j0 j0Var = abstractC0130v.unknownFields;
        j0 j0Var2 = abstractC0130v2.unknownFields;
        if (!j0Var2.equals(j0.f2935f)) {
            int i = j0Var.f2936a + j0Var2.f2936a;
            int[] copyOf = Arrays.copyOf(j0Var.f2937b, i);
            System.arraycopy(j0Var2.f2937b, 0, copyOf, j0Var.f2936a, j0Var2.f2936a);
            Object[] copyOf2 = Arrays.copyOf(j0Var.f2938c, i);
            System.arraycopy(j0Var2.f2938c, 0, copyOf2, j0Var.f2936a, j0Var2.f2936a);
            j0Var = new j0(i, copyOf, copyOf2, true);
        }
        abstractC0130v.unknownFields = j0Var;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void z(int i, List list, J j4, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0119j c0119j = (C0119j) j4.f2852a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0119j.F(i, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        c0119j.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            Logger logger = C0119j.h;
            i5++;
        }
        c0119j.T(i5);
        while (i4 < list.size()) {
            c0119j.D(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }
}
