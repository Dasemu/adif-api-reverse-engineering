package O;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class E0 extends m3.d {

    /* renamed from: a, reason: collision with root package name */
    public final Window f1213a;

    public E0(Window window, E2.e eVar) {
        this.f1213a = window;
    }

    @Override // m3.d
    public final void E(boolean z3) {
        if (!z3) {
            L(16);
            return;
        }
        Window window = this.f1213a;
        window.clearFlags(134217728);
        window.addFlags(IntCompanionObject.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
    }

    @Override // m3.d
    public final void F(boolean z3) {
        if (!z3) {
            L(8192);
            return;
        }
        Window window = this.f1213a;
        window.clearFlags(67108864);
        window.addFlags(IntCompanionObject.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    public final void L(int i) {
        View decorView = this.f1213a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // m3.d
    public final boolean v() {
        return (this.f1213a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
