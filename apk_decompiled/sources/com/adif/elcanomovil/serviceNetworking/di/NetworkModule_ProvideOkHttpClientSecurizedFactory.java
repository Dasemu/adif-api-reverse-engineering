package com.adif.elcanomovil.serviceNetworking.di;

import com.adif.elcanomovil.domain.usecases.credentials.GeneratePersistentUserIdUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import e3.C0322h;
import e3.F;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes.dex */
public final class NetworkModule_ProvideOkHttpClientSecurizedFactory implements Factory<F> {
    private final Provider<C0322h> certificatePinnerProvider;
    private final Provider<GeneratePersistentUserIdUseCase> generatePersistentUserIdUseCaseProvider;

    public NetworkModule_ProvideOkHttpClientSecurizedFactory(Provider<GeneratePersistentUserIdUseCase> provider, Provider<C0322h> provider2) {
        this.generatePersistentUserIdUseCaseProvider = provider;
        this.certificatePinnerProvider = provider2;
    }

    public static NetworkModule_ProvideOkHttpClientSecurizedFactory create(Provider<GeneratePersistentUserIdUseCase> provider, Provider<C0322h> provider2) {
        return new NetworkModule_ProvideOkHttpClientSecurizedFactory(provider, provider2);
    }

    public static F provideOkHttpClientSecurized(GeneratePersistentUserIdUseCase generatePersistentUserIdUseCase, C0322h c0322h) {
        return (F) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideOkHttpClientSecurized(generatePersistentUserIdUseCase, c0322h));
    }

    @Override // javax.inject.Provider
    public F get() {
        return provideOkHttpClientSecurized(this.generatePersistentUserIdUseCaseProvider.get(), this.certificatePinnerProvider.get());
    }
}
