package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class p0 extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Unsafe unsafe, int i) {
        super(unsafe);
        this.f2953b = i;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean c(long j4, Object obj) {
        switch (this.f2953b) {
            case 0:
                if (s0.h) {
                    if (s0.g(j4, obj) == 0) {
                        return false;
                    }
                } else if (s0.h(j4, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (s0.h) {
                    if (s0.g(j4, obj) == 0) {
                        return false;
                    }
                } else if (s0.h(j4, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final byte d(long j4, Object obj) {
        switch (this.f2953b) {
            case 0:
                return s0.h ? s0.g(j4, obj) : s0.h(j4, obj);
            default:
                return s0.h ? s0.g(j4, obj) : s0.h(j4, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final double e(long j4, Object obj) {
        switch (this.f2953b) {
            case 0:
                return Double.longBitsToDouble(h(j4, obj));
            default:
                return Double.longBitsToDouble(h(j4, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final float f(long j4, Object obj) {
        switch (this.f2953b) {
            case 0:
                return Float.intBitsToFloat(g(j4, obj));
            default:
                return Float.intBitsToFloat(g(j4, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void k(Object obj, long j4, boolean z3) {
        switch (this.f2953b) {
            case 0:
                if (s0.h) {
                    s0.k(obj, j4, z3 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    s0.l(obj, j4, z3 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (s0.h) {
                    s0.k(obj, j4, z3 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    s0.l(obj, j4, z3 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void l(Object obj, long j4, byte b4) {
        switch (this.f2953b) {
            case 0:
                if (s0.h) {
                    s0.k(obj, j4, b4);
                    return;
                } else {
                    s0.l(obj, j4, b4);
                    return;
                }
            default:
                if (s0.h) {
                    s0.k(obj, j4, b4);
                    return;
                } else {
                    s0.l(obj, j4, b4);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void m(Object obj, long j4, double d4) {
        switch (this.f2953b) {
            case 0:
                p(obj, j4, Double.doubleToLongBits(d4));
                return;
            default:
                p(obj, j4, Double.doubleToLongBits(d4));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void n(Object obj, long j4, float f2) {
        switch (this.f2953b) {
            case 0:
                o(obj, j4, Float.floatToIntBits(f2));
                return;
            default:
                o(obj, j4, Float.floatToIntBits(f2));
                return;
        }
    }
}
