package o0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: o0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546x implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public String f8073a;

    /* renamed from: b, reason: collision with root package name */
    public String f8074b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0546x other = (C0546x) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i = Intrinsics.areEqual(this.f8073a, other.f8073a) ? 2 : 0;
        return Intrinsics.areEqual(this.f8074b, other.f8074b) ? i + 1 : i;
    }
}
