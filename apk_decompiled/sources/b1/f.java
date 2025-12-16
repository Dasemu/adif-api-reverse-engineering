package b1;

import androidx.lifecycle.C0191l;
import androidx.lifecycle.J;
import androidx.lifecycle.Q;
import androidx.lifecycle.X;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements InterfaceC0266a {

    /* renamed from: a, reason: collision with root package name */
    public final X f4168a = new Q();

    /* renamed from: b, reason: collision with root package name */
    public final c f4169b = new Object();

    public final void a(J lifecycleOwner, Function1 observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f4168a.e(lifecycleOwner, new C0191l(new e(0, observer, this)));
    }

    public final void b(Object obj) {
        this.f4168a.k(new C0267b(obj));
    }
}
