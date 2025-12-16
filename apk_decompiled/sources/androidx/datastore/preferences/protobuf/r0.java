package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f2960a;

    public r0(Unsafe unsafe) {
        this.f2960a = unsafe;
    }

    public final int a(Class cls) {
        return this.f2960a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f2960a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j4, Object obj);

    public abstract byte d(long j4, Object obj);

    public abstract double e(long j4, Object obj);

    public abstract float f(long j4, Object obj);

    public final int g(long j4, Object obj) {
        return this.f2960a.getInt(obj, j4);
    }

    public final long h(long j4, Object obj) {
        return this.f2960a.getLong(obj, j4);
    }

    public final Object i(long j4, Object obj) {
        return this.f2960a.getObject(obj, j4);
    }

    public final long j(Field field) {
        return this.f2960a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j4, boolean z3);

    public abstract void l(Object obj, long j4, byte b4);

    public abstract void m(Object obj, long j4, double d4);

    public abstract void n(Object obj, long j4, float f2);

    public final void o(Object obj, long j4, int i) {
        this.f2960a.putInt(obj, j4, i);
    }

    public final void p(Object obj, long j4, long j5) {
        this.f2960a.putLong(obj, j4, j5);
    }

    public final void q(Object obj, long j4, Object obj2) {
        this.f2960a.putObject(obj, j4, obj2);
    }
}
