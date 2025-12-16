package b0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: b0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260e {

    /* renamed from: a, reason: collision with root package name */
    public final String f4159a;

    public C0260e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f4159a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0260e)) {
            return false;
        }
        return Intrinsics.areEqual(this.f4159a, ((C0260e) obj).f4159a);
    }

    public final int hashCode() {
        return this.f4159a.hashCode();
    }

    public final String toString() {
        return this.f4159a;
    }
}
