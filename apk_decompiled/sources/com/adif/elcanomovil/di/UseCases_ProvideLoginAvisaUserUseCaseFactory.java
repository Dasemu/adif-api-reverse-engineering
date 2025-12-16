package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository;
import com.adif.elcanomovil.domain.usecases.avisa.user.LoginAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePasswordUseCase;
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
public final class UseCases_ProvideLoginAvisaUserUseCaseFactory implements Factory<LoginAvisaUserUseCase> {
    private final Provider<AvisaLoginRepository> avisaLoginRepositoryProvider;
    private final Provider<GeneratePasswordUseCase> generatePasswordUseCaseProvider;
    private final Provider<GenerateUserIdUseCase> generateUserIdUseCaseProvider;

    public UseCases_ProvideLoginAvisaUserUseCaseFactory(Provider<AvisaLoginRepository> provider, Provider<GeneratePasswordUseCase> provider2, Provider<GenerateUserIdUseCase> provider3) {
        this.avisaLoginRepositoryProvider = provider;
        this.generatePasswordUseCaseProvider = provider2;
        this.generateUserIdUseCaseProvider = provider3;
    }

    public static UseCases_ProvideLoginAvisaUserUseCaseFactory create(Provider<AvisaLoginRepository> provider, Provider<GeneratePasswordUseCase> provider2, Provider<GenerateUserIdUseCase> provider3) {
        return new UseCases_ProvideLoginAvisaUserUseCaseFactory(provider, provider2, provider3);
    }

    public static LoginAvisaUserUseCase provideLoginAvisaUserUseCase(AvisaLoginRepository avisaLoginRepository, GeneratePasswordUseCase generatePasswordUseCase, GenerateUserIdUseCase generateUserIdUseCase) {
        return (LoginAvisaUserUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideLoginAvisaUserUseCase(avisaLoginRepository, generatePasswordUseCase, generateUserIdUseCase));
    }

    @Override // javax.inject.Provider
    public LoginAvisaUserUseCase get() {
        return provideLoginAvisaUserUseCase(this.avisaLoginRepositoryProvider.get(), this.generatePasswordUseCaseProvider.get(), this.generateUserIdUseCaseProvider.get());
    }
}
