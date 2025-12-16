package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;
import m0.C0503c;
import v0.C0639d;

/* loaded from: classes.dex */
public final class t0 extends A0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f3432a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f3433b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f3434c;

    /* renamed from: d, reason: collision with root package name */
    public final C f3435d;

    /* renamed from: e, reason: collision with root package name */
    public final C0639d f3436e;

    public t0(Application application, v0.f owner, Bundle bundle) {
        x0 x0Var;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f3436e = owner.getSavedStateRegistry();
        this.f3435d = owner.getLifecycle();
        this.f3434c = bundle;
        this.f3432a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (x0.f3439c == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                x0.f3439c = new x0(application);
            }
            x0Var = x0.f3439c;
            Intrinsics.checkNotNull(x0Var);
        } else {
            x0Var = new x0(null);
        }
        this.f3433b = x0Var;
    }

    @Override // androidx.lifecycle.A0
    public final void a(w0 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C c4 = this.f3435d;
        if (c4 != null) {
            C0639d c0639d = this.f3436e;
            Intrinsics.checkNotNull(c0639d);
            Intrinsics.checkNotNull(c4);
            q0.b(viewModel, c0639d, c4);
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.lifecycle.z0, java.lang.Object] */
    public final w0 b(Class modelClass, String key) {
        w0 b4;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        C c4 = this.f3435d;
        if (c4 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0176a.class.isAssignableFrom(modelClass);
        Application application = this.f3432a;
        Constructor a2 = (!isAssignableFrom || application == null) ? u0.a(modelClass, u0.f3438b) : u0.a(modelClass, u0.f3437a);
        if (a2 == null) {
            if (application != null) {
                return this.f3433b.create(modelClass);
            }
            if (z0.f3442a == null) {
                z0.f3442a = new Object();
            }
            z0 z0Var = z0.f3442a;
            Intrinsics.checkNotNull(z0Var);
            return z0Var.create(modelClass);
        }
        C0639d c0639d = this.f3436e;
        Intrinsics.checkNotNull(c0639d);
        o0 c5 = q0.c(c0639d, c4, key, this.f3434c);
        n0 n0Var = c5.f3413b;
        if (!isAssignableFrom || application == null) {
            b4 = u0.b(modelClass, a2, n0Var);
        } else {
            Intrinsics.checkNotNull(application);
            b4 = u0.b(modelClass, a2, application, n0Var);
        }
        b4.addCloseable("androidx.lifecycle.savedstate.vm.tag", c5);
        return b4;
    }

    @Override // androidx.lifecycle.y0
    public final w0 create(Class modelClass, l0.c extras) {
        Constructor a2;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(C0503c.f7792a);
        if (str != null) {
            if (extras.a(q0.f3417a) != null && extras.a(q0.f3418b) != null) {
                Application application = (Application) extras.a(x0.f3440d);
                boolean isAssignableFrom = AbstractC0176a.class.isAssignableFrom(modelClass);
                if (isAssignableFrom && application != null) {
                    a2 = u0.a(modelClass, u0.f3437a);
                } else {
                    a2 = u0.a(modelClass, u0.f3438b);
                }
                if (a2 == null) {
                    return this.f3433b.create(modelClass, extras);
                }
                if (isAssignableFrom && application != null) {
                    return u0.b(modelClass, a2, application, q0.e(extras));
                }
                return u0.b(modelClass, a2, q0.e(extras));
            }
            if (this.f3435d != null) {
                return b(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.y0
    public final w0 create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return b(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
