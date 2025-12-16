package o0;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Q extends T {

    /* renamed from: m, reason: collision with root package name */
    public final Class f7952m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Serializable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
        try {
            this.f7952m = Class.forName("[L" + type.getName() + ';');
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // o0.T
    public final Object a(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Serializable[]) bundle.get(key);
    }

    @Override // o0.T
    public final String b() {
        String name = this.f7952m.getName();
        Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
        return name;
    }

    @Override // o0.T
    public final Object c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
    @Override // o0.T
    public final void d(Bundle bundle, String key, Object obj) {
        ?? r4 = (Serializable[]) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f7952m.cast(r4);
        bundle.putSerializable(key, r4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(Q.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f7952m, ((Q) obj).f7952m);
    }

    public final int hashCode() {
        return this.f7952m.hashCode();
    }
}
