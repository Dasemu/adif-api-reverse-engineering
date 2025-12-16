package o0;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class S extends T {

    /* renamed from: m, reason: collision with root package name */
    public final Class f7953m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (Serializable.class.isAssignableFrom(type)) {
            if (!type.isEnum()) {
                this.f7953m = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }
        throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
    }

    @Override // o0.T
    public final Object a(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Serializable) bundle.get(key);
    }

    @Override // o0.T
    public String b() {
        String name = this.f7953m.getName();
        Intrinsics.checkNotNullExpressionValue(name, "type.name");
        return name;
    }

    @Override // o0.T
    public final void d(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7953m.cast(value);
        bundle.putSerializable(key, value);
    }

    @Override // o0.T
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Serializable c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        return Intrinsics.areEqual(this.f7953m, ((S) obj).f7953m);
    }

    public final int hashCode() {
        return this.f7953m.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Class type, int i) {
        super(false);
        Intrinsics.checkNotNullParameter(type, "type");
        if (Serializable.class.isAssignableFrom(type)) {
            this.f7953m = type;
            return;
        }
        throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
    }
}
