package S0;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f1524b = new s(MapsKt.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    public final Map f1525a;

    public s(Map map) {
        this.f1525a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return Intrinsics.areEqual(this.f1525a, ((s) obj).f1525a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1525a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f1525a + ')';
    }
}
