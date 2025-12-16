package o0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class P extends T {

    /* renamed from: m, reason: collision with root package name */
    public final Class f7951m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
            this.f7951m = type;
            return;
        }
        throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // o0.T
    public final Object a(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.get(key);
    }

    @Override // o0.T
    public final String b() {
        String name = this.f7951m.getName();
        Intrinsics.checkNotNullExpressionValue(name, "type.name");
        return name;
    }

    @Override // o0.T
    public final Object c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // o0.T
    public final void d(Bundle bundle, String key, Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f7951m.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(key, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(key, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(P.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f7951m, ((P) obj).f7951m);
    }

    public final int hashCode() {
        return this.f7951m.hashCode();
    }
}
