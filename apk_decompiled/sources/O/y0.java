package O;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class y0 extends x0 {
    public y0(D0 d02, WindowInsets windowInsets) {
        super(d02, windowInsets);
    }

    @Override // O.B0
    public D0 a() {
        return D0.f(null, this.f1305c.consumeDisplayCutout());
    }

    @Override // O.B0
    public C0068i e() {
        DisplayCutout displayCutout = this.f1305c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0068i(displayCutout);
    }

    @Override // O.B0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Objects.equals(this.f1305c, y0Var.f1305c) && Objects.equals(this.f1309g, y0Var.f1309g);
    }

    @Override // O.B0
    public int hashCode() {
        return this.f1305c.hashCode();
    }
}
