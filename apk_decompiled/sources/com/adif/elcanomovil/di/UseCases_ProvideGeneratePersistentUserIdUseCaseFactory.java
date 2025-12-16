package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.CredentialsProvider;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePersistentUserIdUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class UseCases_ProvideGeneratePersistentUserIdUseCaseFactory implements Factory<GeneratePersistentUserIdUseCase> {
    private final Provider<CredentialsProvider> credentialsProvider;

    public UseCases_ProvideGeneratePersistentUserIdUseCaseFactory(Provider<CredentialsProvider> provider) {
        this.credentialsProvider = provider;
    }

    public static UseCases_ProvideGeneratePersistentUserIdUseCaseFactory create(Provider<CredentialsProvider> provider) {
        return new UseCases_ProvideGeneratePersistentUserIdUseCaseFactory(provider);
    }

    public static GeneratePersistentUserIdUseCase provideGeneratePersistentUserIdUseCase(CredentialsProvider credentialsProvider) {
        return (GeneratePersistentUserIdUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGeneratePersistentUserIdUseCase(credentialsProvider));
    }

    @Override // javax.inject.Provider
    public GeneratePersistentUserIdUseCase get() {
        return provideGeneratePersistentUserIdUseCase(this.credentialsProvider.get());
    }
}
