package O;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class A0 extends z0 {

    /* renamed from: q, reason: collision with root package name */
    public static final D0 f1199q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f1199q = D0.f(null, windowInsets);
    }

    public A0(D0 d02, WindowInsets windowInsets) {
        super(d02, windowInsets);
    }

    @Override // O.w0, O.B0
    public final void d(View view) {
    }

    @Override // O.w0, O.B0
    public G.c f(int i) {
        Insets insets;
        insets = this.f1305c.getInsets(C0.a(i));
        return G.c.c(insets);
    }
}
