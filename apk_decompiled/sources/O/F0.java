package O;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class F0 extends m3.d {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f1214a;

    /* renamed from: b, reason: collision with root package name */
    public Window f1215b;

    public F0(WindowInsetsController windowInsetsController, E2.e eVar) {
        this.f1214a = windowInsetsController;
    }

    @Override // m3.d
    public final void E(boolean z3) {
        Window window = this.f1215b;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f1214a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f1214a.setSystemBarsAppearance(0, 16);
    }

    @Override // m3.d
    public final void F(boolean z3) {
        Window window = this.f1215b;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f1214a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f1214a.setSystemBarsAppearance(0, 8);
    }

    @Override // m3.d
    public final boolean v() {
        int systemBarsAppearance;
        this.f1214a.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.f1214a.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }
}
