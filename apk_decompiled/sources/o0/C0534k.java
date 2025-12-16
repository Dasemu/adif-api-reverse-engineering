package o0;

import androidx.lifecycle.A0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import kotlin.jvm.internal.Intrinsics;
import m0.C0503c;
import v0.C0639d;

/* renamed from: o0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534k extends A0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public C0639d f8000a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.C f8001b;

    @Override // androidx.lifecycle.A0
    public final void a(w0 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C0639d c0639d = this.f8000a;
        if (c0639d != null) {
            Intrinsics.checkNotNull(c0639d);
            androidx.lifecycle.C c4 = this.f8001b;
            Intrinsics.checkNotNull(c4);
            q0.b(viewModel, c0639d, c4);
        }
    }

    @Override // androidx.lifecycle.y0
    public final w0 create(Class modelClass, l0.c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String key = (String) extras.a(C0503c.f7792a);
        if (key != null) {
            C0639d c0639d = this.f8000a;
            if (c0639d != null) {
                Intrinsics.checkNotNull(c0639d);
                androidx.lifecycle.C c4 = this.f8001b;
                Intrinsics.checkNotNull(c4);
                o0 c5 = q0.c(c0639d, c4, key, null);
                n0 handle = c5.f3413b;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(handle, "handle");
                C0535l c0535l = new C0535l(handle);
                c0535l.addCloseable("androidx.lifecycle.savedstate.vm.tag", c5);
                return c0535l;
            }
            n0 handle2 = q0.e(extras);
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle2, "handle");
            return new C0535l(handle2);
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.y0
    public final w0 create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String key = modelClass.getCanonicalName();
        if (key != null) {
            if (this.f8001b != null) {
                C0639d c0639d = this.f8000a;
                Intrinsics.checkNotNull(c0639d);
                androidx.lifecycle.C c4 = this.f8001b;
                Intrinsics.checkNotNull(c4);
                o0 c5 = q0.c(c0639d, c4, key, null);
                n0 handle = c5.f3413b;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(handle, "handle");
                C0535l c0535l = new C0535l(handle);
                c0535l.addCloseable("androidx.lifecycle.savedstate.vm.tag", c5);
                return c0535l;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
