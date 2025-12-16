package s3;

import C.w;
import com.google.firebase.sessions.settings.RemoteSettings;
import f0.C0338b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.C0579k;
import r3.z;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0579k f8474a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0579k f8475b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0579k f8476c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0579k f8477d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0579k f8478e;

    static {
        C0579k c0579k = C0579k.f8285d;
        f8474a = C0338b.n(RemoteSettings.FORWARD_SLASH_STRING);
        f8475b = C0338b.n("\\");
        f8476c = C0338b.n("/\\");
        f8477d = C0338b.n(".");
        f8478e = C0338b.n("..");
    }

    public static final int a(z zVar) {
        if (zVar.f8322a.d() != 0) {
            C0579k c0579k = zVar.f8322a;
            if (c0579k.i(0) != 47) {
                if (c0579k.i(0) == 92) {
                    if (c0579k.d() > 2 && c0579k.i(1) == 92) {
                        C0579k other = f8475b;
                        Intrinsics.checkNotNullParameter(other, "other");
                        int f2 = c0579k.f(2, other.f8286a);
                        return f2 == -1 ? c0579k.d() : f2;
                    }
                } else if (c0579k.d() > 2 && c0579k.i(1) == 58 && c0579k.i(2) == 92) {
                    char i = (char) c0579k.i(0);
                    if ('a' <= i && i < '{') {
                        return 3;
                    }
                    if ('A' <= i && i < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, r3.h] */
    public static final z b(z zVar, z child, boolean z3) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        child.getClass();
        if (a(child) != -1 || child.g() != null) {
            return child;
        }
        C0579k c4 = c(zVar);
        if (c4 == null && (c4 = c(child)) == null) {
            c4 = f(z.f8321b);
        }
        ?? obj = new Object();
        obj.h0(zVar.f8322a);
        if (obj.f8284b > 0) {
            obj.h0(c4);
        }
        obj.h0(child.f8322a);
        return d(obj, z3);
    }

    public static final C0579k c(z zVar) {
        C0579k c0579k = zVar.f8322a;
        C0579k c0579k2 = f8474a;
        if (C0579k.g(c0579k, c0579k2) != -1) {
            return c0579k2;
        }
        C0579k c0579k3 = f8475b;
        if (C0579k.g(zVar.f8322a, c0579k3) != -1) {
            return c0579k3;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, r3.h] */
    public static final z d(C0576h c0576h, boolean z3) {
        C0579k c0579k;
        C0579k c0579k2;
        char O2;
        C0579k c0579k3;
        C0579k h;
        Intrinsics.checkNotNullParameter(c0576h, "<this>");
        ?? obj = new Object();
        C0579k c0579k4 = null;
        int i = 0;
        while (true) {
            if (!c0576h.H(f8474a)) {
                c0579k = f8475b;
                if (!c0576h.H(c0579k)) {
                    break;
                }
            }
            byte readByte = c0576h.readByte();
            if (c0579k4 == null) {
                c0579k4 = e(readByte);
            }
            i++;
        }
        boolean z4 = i >= 2 && Intrinsics.areEqual(c0579k4, c0579k);
        C0579k c0579k5 = f8476c;
        long j4 = 0;
        if (z4) {
            Intrinsics.checkNotNull(c0579k4);
            obj.h0(c0579k4);
            obj.h0(c0579k4);
        } else if (i > 0) {
            Intrinsics.checkNotNull(c0579k4);
            obj.h0(c0579k4);
        } else {
            long A3 = c0576h.A(c0579k5);
            if (c0579k4 == null) {
                c0579k4 = A3 == -1 ? f(z.f8321b) : e(c0576h.O(A3));
            }
            if (Intrinsics.areEqual(c0579k4, c0579k)) {
                c0579k2 = c0579k4;
                if (c0576h.f8284b >= 2 && c0576h.O(1L) == 58 && (('a' <= (O2 = (char) c0576h.O(0L)) && O2 < '{') || ('A' <= O2 && O2 < '['))) {
                    if (A3 == 2) {
                        obj.z(c0576h, 3L);
                    } else {
                        obj.z(c0576h, 2L);
                    }
                }
            } else {
                c0579k2 = c0579k4;
            }
            c0579k4 = c0579k2;
        }
        boolean z5 = obj.f8284b > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean x3 = c0576h.x();
            c0579k3 = f8477d;
            if (x3) {
                break;
            }
            long j5 = j4;
            long A4 = c0576h.A(c0579k5);
            if (A4 == -1) {
                h = c0576h.h(c0576h.f8284b);
            } else {
                h = c0576h.h(A4);
                c0576h.readByte();
            }
            C0579k c0579k6 = f8478e;
            if (Intrinsics.areEqual(h, c0579k6)) {
                if (!z5 || !arrayList.isEmpty()) {
                    if (!z3 || (!z5 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt.last((List) arrayList), c0579k6)))) {
                        arrayList.add(h);
                    } else if (!z4 || arrayList.size() != 1) {
                        CollectionsKt__MutableCollectionsKt.removeLastOrNull(arrayList);
                    }
                }
            } else if (!Intrinsics.areEqual(h, c0579k3) && !Intrinsics.areEqual(h, C0579k.f8285d)) {
                arrayList.add(h);
            }
            j4 = j5;
        }
        long j6 = j4;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 > 0) {
                obj.h0(c0579k4);
            }
            obj.h0((C0579k) arrayList.get(i4));
        }
        if (obj.f8284b == j6) {
            obj.h0(c0579k3);
        }
        return new z(obj.h(obj.f8284b));
    }

    public static final C0579k e(byte b4) {
        if (b4 == 47) {
            return f8474a;
        }
        if (b4 == 92) {
            return f8475b;
        }
        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(b4, "not a directory separator: "));
    }

    public static final C0579k f(String str) {
        if (Intrinsics.areEqual(str, RemoteSettings.FORWARD_SLASH_STRING)) {
            return f8474a;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return f8475b;
        }
        throw new IllegalArgumentException(w.z("not a directory separator: ", str));
    }
}
