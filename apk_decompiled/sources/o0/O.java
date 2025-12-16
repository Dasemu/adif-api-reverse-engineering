package o0;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class O extends T {

    /* renamed from: m, reason: collision with root package name */
    public final Class f7950m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Parcelable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
        }
        try {
            this.f7950m = Class.forName("[L" + type.getName() + ';');
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // o0.T
    public final Object a(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Parcelable[]) bundle.get(key);
    }

    @Override // o0.T
    public final String b() {
        String name = this.f7950m.getName();
        Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
        return name;
    }

    @Override // o0.T
    public final Object c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // o0.T
    public final void d(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f7950m.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(O.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f7950m, ((O) obj).f7950m);
    }

    public final int hashCode() {
        return this.f7950m.hashCode();
    }
}
