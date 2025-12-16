package Q0;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f1356a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f1357b;

    public c(Bitmap bitmap, Map map) {
        this.f1356a = bitmap;
        this.f1357b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f1356a, cVar.f1356a) && Intrinsics.areEqual(this.f1357b, cVar.f1357b);
    }

    public final int hashCode() {
        return this.f1357b.hashCode() + (this.f1356a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f1356a + ", extras=" + this.f1357b + ')';
    }
}
