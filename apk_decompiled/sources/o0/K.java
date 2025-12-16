package o0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7937a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7938b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7939c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7940d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7941e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7942f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7943g;
    public final int h;
    public final int i;

    public K(boolean z3, boolean z4, int i, boolean z5, boolean z6, int i4, int i5, int i6, int i7) {
        this.f7937a = z3;
        this.f7938b = z4;
        this.f7939c = i;
        this.f7940d = z5;
        this.f7941e = z6;
        this.f7942f = i4;
        this.f7943g = i5;
        this.h = i6;
        this.i = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(K.class, obj.getClass())) {
            return false;
        }
        K k4 = (K) obj;
        return this.f7937a == k4.f7937a && this.f7938b == k4.f7938b && this.f7939c == k4.f7939c && Intrinsics.areEqual((Object) null, (Object) null) && this.f7940d == k4.f7940d && this.f7941e == k4.f7941e && this.f7942f == k4.f7942f && this.f7943g == k4.f7943g && this.h == k4.h && this.i == k4.i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f7937a ? 1 : 0) * 31) + (this.f7938b ? 1 : 0)) * 31) + this.f7939c) * 961) + (this.f7940d ? 1 : 0)) * 31) + (this.f7941e ? 1 : 0)) * 31) + this.f7942f) * 31) + this.f7943g) * 31) + this.h) * 31) + this.i;
    }
}
