package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2950c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f2951a = new d0(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f2952b;

    static {
        new C0125p(0);
    }

    public C0125p() {
    }

    public static void b(C0119j c0119j, A0 a02, int i, Object obj) {
        if (a02 == A0.f2822d) {
            c0119j.R(i, 3);
            ((AbstractC0108a) obj).c(c0119j);
            c0119j.R(i, 4);
            return;
        }
        c0119j.R(i, a02.f2826b);
        switch (a02.ordinal()) {
            case 0:
                c0119j.L(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                c0119j.J(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                c0119j.V(((Long) obj).longValue());
                return;
            case 3:
                c0119j.V(((Long) obj).longValue());
                return;
            case 4:
                c0119j.N(((Integer) obj).intValue());
                return;
            case 5:
                c0119j.L(((Long) obj).longValue());
                return;
            case 6:
                c0119j.J(((Integer) obj).intValue());
                return;
            case 7:
                c0119j.D(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof C0116g) {
                    c0119j.H((C0116g) obj);
                    return;
                } else {
                    c0119j.Q((String) obj);
                    return;
                }
            case 9:
                ((AbstractC0108a) obj).c(c0119j);
                return;
            case 10:
                AbstractC0108a abstractC0108a = (AbstractC0108a) obj;
                c0119j.getClass();
                c0119j.T(abstractC0108a.a());
                abstractC0108a.c(c0119j);
                return;
            case 11:
                if (obj instanceof C0116g) {
                    c0119j.H((C0116g) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                c0119j.T(length);
                c0119j.E(bArr, 0, length);
                return;
            case 12:
                c0119j.T(((Integer) obj).intValue());
                return;
            case 13:
                c0119j.N(((Integer) obj).intValue());
                return;
            case 14:
                c0119j.J(((Integer) obj).intValue());
                return;
            case 15:
                c0119j.L(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0119j.T((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0119j.V((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        if (this.f2952b) {
            return;
        }
        d0 d0Var = this.f2951a;
        if (!d0Var.f2902d) {
            if (d0Var.f2900b.size() > 0) {
                d0Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = d0Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!d0Var.f2902d) {
            d0Var.f2901c = d0Var.f2901c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(d0Var.f2901c);
            d0Var.f2904f = d0Var.f2904f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(d0Var.f2904f);
            d0Var.f2902d = true;
        }
        this.f2952b = true;
    }

    public final Object clone() {
        C0125p c0125p = new C0125p();
        d0 d0Var = this.f2951a;
        if (d0Var.f2900b.size() > 0) {
            Map.Entry c4 = d0Var.c(0);
            if (c4.getKey() != null) {
                throw new ClassCastException();
            }
            c4.getValue();
            throw null;
        }
        Iterator it = d0Var.d().iterator();
        if (!it.hasNext()) {
            return c0125p;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0125p) {
            return this.f2951a.equals(((C0125p) obj).f2951a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2951a.hashCode();
    }

    public C0125p(int i) {
        a();
        a();
    }
}
