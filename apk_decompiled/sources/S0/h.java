package S0;

import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0192m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends C {

    /* renamed from: b, reason: collision with root package name */
    public static final h f1460b = new C();

    /* renamed from: c, reason: collision with root package name */
    public static final g f1461c = new Object();

    @Override // androidx.lifecycle.C
    public final void a(I i) {
        if (!(i instanceof InterfaceC0192m)) {
            throw new IllegalArgumentException((i + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        InterfaceC0192m interfaceC0192m = (InterfaceC0192m) i;
        interfaceC0192m.getClass();
        g owner = f1461c;
        Intrinsics.checkNotNullParameter(owner, "owner");
        interfaceC0192m.x(owner);
        interfaceC0192m.d(owner);
    }

    @Override // androidx.lifecycle.C
    public final B b() {
        return B.f3284e;
    }

    @Override // androidx.lifecycle.C
    public final void c(I i) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
