package F;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f495a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f496b;

    public m(Resources resources, Resources.Theme theme) {
        this.f495a = resources;
        this.f496b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f495a.equals(mVar.f495a) && Objects.equals(this.f496b, mVar.f496b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f495a, this.f496b);
    }
}
