package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185f {

    /* renamed from: a, reason: collision with root package name */
    public final int f3360a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3361b;

    public C0185f(Method method, int i) {
        this.f3360a = i;
        this.f3361b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0185f)) {
            return false;
        }
        C0185f c0185f = (C0185f) obj;
        return this.f3360a == c0185f.f3360a && this.f3361b.getName().equals(c0185f.f3361b.getName());
    }

    public final int hashCode() {
        return this.f3361b.getName().hashCode() + (this.f3360a * 31);
    }
}
