package O;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: O.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f1256a;

    public C0068i(DisplayCutout displayCutout) {
        this.f1256a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0068i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f1256a, ((C0068i) obj).f1256a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f1256a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f1256a + "}";
    }
}
