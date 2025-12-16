package l3;

import f0.C0338b;
import kotlin.jvm.internal.Intrinsics;
import r3.C0579k;

/* renamed from: l3.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0440c {

    /* renamed from: d, reason: collision with root package name */
    public static final C0579k f7380d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0579k f7381e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0579k f7382f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0579k f7383g;
    public static final C0579k h;
    public static final C0579k i;

    /* renamed from: a, reason: collision with root package name */
    public final C0579k f7384a;

    /* renamed from: b, reason: collision with root package name */
    public final C0579k f7385b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7386c;

    static {
        C0579k c0579k = C0579k.f8285d;
        f7380d = C0338b.n(":");
        f7381e = C0338b.n(":status");
        f7382f = C0338b.n(":method");
        f7383g = C0338b.n(":path");
        h = C0338b.n(":scheme");
        i = C0338b.n(":authority");
    }

    public C0440c(C0579k name, C0579k value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7384a = name;
        this.f7385b = value;
        this.f7386c = value.d() + name.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0440c)) {
            return false;
        }
        C0440c c0440c = (C0440c) obj;
        return Intrinsics.areEqual(this.f7384a, c0440c.f7384a) && Intrinsics.areEqual(this.f7385b, c0440c.f7385b);
    }

    public final int hashCode() {
        return this.f7385b.hashCode() + (this.f7384a.hashCode() * 31);
    }

    public final String toString() {
        return this.f7384a.q() + ": " + this.f7385b.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0440c(String name, String value) {
        this(C0338b.n(name), C0338b.n(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C0579k c0579k = C0579k.f8285d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0440c(C0579k name, String value) {
        this(name, C0338b.n(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C0579k c0579k = C0579k.f8285d;
    }
}
