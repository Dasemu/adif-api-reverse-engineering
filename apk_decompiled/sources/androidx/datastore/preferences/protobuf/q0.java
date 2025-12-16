package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class q0 extends r0 {
    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean c(long j4, Object obj) {
        return this.f2960a.getBoolean(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final byte d(long j4, Object obj) {
        return this.f2960a.getByte(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final double e(long j4, Object obj) {
        return this.f2960a.getDouble(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final float f(long j4, Object obj) {
        return this.f2960a.getFloat(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void k(Object obj, long j4, boolean z3) {
        this.f2960a.putBoolean(obj, j4, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void l(Object obj, long j4, byte b4) {
        this.f2960a.putByte(obj, j4, b4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void m(Object obj, long j4, double d4) {
        this.f2960a.putDouble(obj, j4, d4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void n(Object obj, long j4, float f2) {
        this.f2960a.putFloat(obj, j4, f2);
    }
}
