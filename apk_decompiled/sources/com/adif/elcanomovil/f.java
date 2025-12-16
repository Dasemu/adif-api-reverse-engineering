package com.adif.elcanomovil;

import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;

/* loaded from: classes.dex */
public final class f implements ComponentSupplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Hilt_ElcanoApplication f4535a;

    public f(Hilt_ElcanoApplication hilt_ElcanoApplication) {
        this.f4535a = hilt_ElcanoApplication;
    }

    @Override // dagger.hilt.android.internal.managers.ComponentSupplier
    public final Object get() {
        return DaggerElcanoApplication_HiltComponents_SingletonC.builder().applicationContextModule(new ApplicationContextModule(this.f4535a)).build();
    }
}
