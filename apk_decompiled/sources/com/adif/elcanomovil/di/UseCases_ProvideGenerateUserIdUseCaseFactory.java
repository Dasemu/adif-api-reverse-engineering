package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.CredentialsProvider;
import com.adif.elcanomovil.domain.usecases.credentials.GenerateUserIdUseCase;
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
public final class UseCases_ProvideGenerateUserIdUseCaseFactory implements Factory<GenerateUserIdUseCase> {
    private final Provider<CredentialsProvider> credentialsProvider;

    public UseCases_ProvideGenerateUserIdUseCaseFactory(Provider<CredentialsProvider> provider) {
        this.credentialsProvider = provider;
    }

    public static UseCases_ProvideGenerateUserIdUseCaseFactory create(Provider<CredentialsProvider> provider) {
        return new UseCases_ProvideGenerateUserIdUseCaseFactory(provider);
    }

    public static GenerateUserIdUseCase provideGenerateUserIdUseCase(CredentialsProvider credentialsProvider) {
        return (GenerateUserIdUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGenerateUserIdUseCase(credentialsProvider));
    }

    @Override // javax.inject.Provider
    public GenerateUserIdUseCase get() {
        return provideGenerateUserIdUseCase(this.credentialsProvider.get());
    }
}
