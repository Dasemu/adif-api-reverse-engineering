package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.PushIdTokenProvider;
import com.adif.elcanomovil.domain.providers.TokenJwtProvider;
import com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository;
import com.adif.elcanomovil.domain.usecases.avisa.user.RegisterAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePasswordUseCase;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePersistentUserIdUseCase;
import com.adif.elcanomovil.domain.usecases.credentials.GenerateUserIdUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class UseCases_ProvideRegisterAvisaUserUseCaseFactory implements Factory<RegisterAvisaUserUseCase> {
    private final Provider<AvisaLoginRepository> avisaLoginRepositoryProvider;
    private final Provider<GeneratePasswordUseCase> generatePasswordUseCaseProvider;
    private final Provider<GeneratePersistentUserIdUseCase> generateSubscriptionUserIdUseCaseProvider;
    private final Provider<GenerateUserIdUseCase> generateUserIdUseCaseProvider;
    private final Provider<PushIdTokenProvider> pushIdTokenProvider;
    private final Provider<TokenJwtProvider> tokenProvider;

    public UseCases_ProvideRegisterAvisaUserUseCaseFactory(Provider<AvisaLoginRepository> provider, Provider<GeneratePasswordUseCase> provider2, Provider<GenerateUserIdUseCase> provider3, Provider<GeneratePersistentUserIdUseCase> provider4, Provider<PushIdTokenProvider> provider5, Provider<TokenJwtProvider> provider6) {
        this.avisaLoginRepositoryProvider = provider;
        this.generatePasswordUseCaseProvider = provider2;
        this.generateUserIdUseCaseProvider = provider3;
        this.generateSubscriptionUserIdUseCaseProvider = provider4;
        this.pushIdTokenProvider = provider5;
        this.tokenProvider = provider6;
    }

    public static UseCases_ProvideRegisterAvisaUserUseCaseFactory create(Provider<AvisaLoginRepository> provider, Provider<GeneratePasswordUseCase> provider2, Provider<GenerateUserIdUseCase> provider3, Provider<GeneratePersistentUserIdUseCase> provider4, Provider<PushIdTokenProvider> provider5, Provider<TokenJwtProvider> provider6) {
        return new UseCases_ProvideRegisterAvisaUserUseCaseFactory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static RegisterAvisaUserUseCase provideRegisterAvisaUserUseCase(AvisaLoginRepository avisaLoginRepository, GeneratePasswordUseCase generatePasswordUseCase, GenerateUserIdUseCase generateUserIdUseCase, GeneratePersistentUserIdUseCase generatePersistentUserIdUseCase, PushIdTokenProvider pushIdTokenProvider, TokenJwtProvider tokenJwtProvider) {
        return (RegisterAvisaUserUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideRegisterAvisaUserUseCase(avisaLoginRepository, generatePasswordUseCase, generateUserIdUseCase, generatePersistentUserIdUseCase, pushIdTokenProvider, tokenJwtProvider));
    }

    @Override // javax.inject.Provider
    public RegisterAvisaUserUseCase get() {
        return provideRegisterAvisaUserUseCase(this.avisaLoginRepositoryProvider.get(), this.generatePasswordUseCaseProvider.get(), this.generateUserIdUseCaseProvider.get(), this.generateSubscriptionUserIdUseCaseProvider.get(), this.pushIdTokenProvider.get(), this.tokenProvider.get());
    }
}
