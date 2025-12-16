package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.InterfaceC0200v;
import kotlin.jvm.internal.Intrinsics;
import v0.C0639d;
import v0.C0640e;

/* loaded from: classes.dex */
public final class F0 implements InterfaceC0200v, v0.f, androidx.lifecycle.D0 {

    /* renamed from: a, reason: collision with root package name */
    public final K f2997a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.C0 f2998b;

    /* renamed from: c, reason: collision with root package name */
    public final RunnableC0175z f2999c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.y0 f3000d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.L f3001e = null;

    /* renamed from: f, reason: collision with root package name */
    public C0640e f3002f = null;

    public F0(K k4, androidx.lifecycle.C0 c02, RunnableC0175z runnableC0175z) {
        this.f2997a = k4;
        this.f2998b = c02;
        this.f2999c = runnableC0175z;
    }

    public final void a(androidx.lifecycle.A a2) {
        this.f3001e.f(a2);
    }

    public final void b() {
        if (this.f3001e == null) {
            this.f3001e = new androidx.lifecycle.L(this);
            Intrinsics.checkNotNullParameter(this, "owner");
            C0640e c0640e = new C0640e(this);
            this.f3002f = c0640e;
            c0640e.a();
            this.f2999c.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0200v
    public final l0.c getDefaultViewModelCreationExtras() {
        Application application;
        K k4 = this.f2997a;
        Context applicationContext = k4.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        l0.d dVar = new l0.d(0);
        if (application != null) {
            dVar.b(androidx.lifecycle.x0.f3440d, application);
        }
        dVar.b(androidx.lifecycle.q0.f3417a, k4);
        dVar.b(androidx.lifecycle.q0.f3418b, this);
        if (k4.getArguments() != null) {
            dVar.b(androidx.lifecycle.q0.f3419c, k4.getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.InterfaceC0200v
    public final androidx.lifecycle.y0 getDefaultViewModelProviderFactory() {
        Application application;
        K k4 = this.f2997a;
        androidx.lifecycle.y0 defaultViewModelProviderFactory = k4.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(k4.mDefaultFactory)) {
            this.f3000d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f3000d == null) {
            Context applicationContext = k4.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f3000d = new androidx.lifecycle.t0(application, k4, k4.getArguments());
        }
        return this.f3000d;
    }

    @Override // androidx.lifecycle.J
    public final androidx.lifecycle.C getLifecycle() {
        b();
        return this.f3001e;
    }

    @Override // v0.f
    public final C0639d getSavedStateRegistry() {
        b();
        return this.f3002f.f8636b;
    }

    @Override // androidx.lifecycle.D0
    public final androidx.lifecycle.C0 getViewModelStore() {
        b();
        return this.f2998b;
    }
}
