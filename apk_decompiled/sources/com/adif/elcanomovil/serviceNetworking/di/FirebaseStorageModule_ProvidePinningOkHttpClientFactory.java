package com.adif.elcanomovil.serviceNetworking.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import e3.F;
import y1.AbstractC0661b;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"com.adif.elcanomovil.serviceNetworking.di.PinningHttpClient"})
/* loaded from: classes.dex */
public final class FirebaseStorageModule_ProvidePinningOkHttpClientFactory implements Factory<F> {
    public static FirebaseStorageModule_ProvidePinningOkHttpClientFactory create() {
        return AbstractC0661b.f8980a;
    }

    public static F providePinningOkHttpClient() {
        return (F) Preconditions.checkNotNullFromProvides(FirebaseStorageModule.INSTANCE.providePinningOkHttpClient());
    }

    @Override // javax.inject.Provider
    public F get() {
        return providePinningOkHttpClient();
    }
}
