package com.adif.elcanomovil.serviceNetworking.pinning;

import com.google.firebase.storage.FirebaseStorage;
import d1.InterfaceC0307a;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class PinningRemoteDataSource_Factory implements Factory<PinningRemoteDataSource> {
    private final Provider<InterfaceC0307a> appDispatcherProvider;
    private final Provider<FirebaseStorage> firebaseStorageProvider;

    public PinningRemoteDataSource_Factory(Provider<FirebaseStorage> provider, Provider<InterfaceC0307a> provider2) {
        this.firebaseStorageProvider = provider;
        this.appDispatcherProvider = provider2;
    }

    public static PinningRemoteDataSource_Factory create(Provider<FirebaseStorage> provider, Provider<InterfaceC0307a> provider2) {
        return new PinningRemoteDataSource_Factory(provider, provider2);
    }

    public static PinningRemoteDataSource newInstance(FirebaseStorage firebaseStorage, InterfaceC0307a interfaceC0307a) {
        return new PinningRemoteDataSource(firebaseStorage, interfaceC0307a);
    }

    @Override // javax.inject.Provider
    public PinningRemoteDataSource get() {
        return newInstance(this.firebaseStorageProvider.get(), this.appDispatcherProvider.get());
    }
}
