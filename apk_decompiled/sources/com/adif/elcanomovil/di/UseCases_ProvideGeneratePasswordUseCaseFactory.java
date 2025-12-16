package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.CredentialsProvider;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePasswordUseCase;
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
public final class UseCases_ProvideGeneratePasswordUseCaseFactory implements Factory<GeneratePasswordUseCase> {
    private final Provider<CredentialsProvider> credentialsProvider;

    public UseCases_ProvideGeneratePasswordUseCaseFactory(Provider<CredentialsProvider> provider) {
        this.credentialsProvider = provider;
    }

    public static UseCases_ProvideGeneratePasswordUseCaseFactory create(Provider<CredentialsProvider> provider) {
        return new UseCases_ProvideGeneratePasswordUseCaseFactory(provider);
    }

    public static GeneratePasswordUseCase provideGeneratePasswordUseCase(CredentialsProvider credentialsProvider) {
        return (GeneratePasswordUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGeneratePasswordUseCase(credentialsProvider));
    }

    @Override // javax.inject.Provider
    public GeneratePasswordUseCase get() {
        return provideGeneratePasswordUseCase(this.credentialsProvider.get());
    }
}
