package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository;
import com.adif.elcanomovil.domain.usecases.avisa.user.RefreshAvisaUserUseCase;
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
public final class UseCases_ProvideRefreshAvisaUserUseCaseFactory implements Factory<RefreshAvisaUserUseCase> {
    private final Provider<AvisaLoginRepository> avisaLoginRepositoryProvider;

    public UseCases_ProvideRefreshAvisaUserUseCaseFactory(Provider<AvisaLoginRepository> provider) {
        this.avisaLoginRepositoryProvider = provider;
    }

    public static UseCases_ProvideRefreshAvisaUserUseCaseFactory create(Provider<AvisaLoginRepository> provider) {
        return new UseCases_ProvideRefreshAvisaUserUseCaseFactory(provider);
    }

    public static RefreshAvisaUserUseCase provideRefreshAvisaUserUseCase(AvisaLoginRepository avisaLoginRepository) {
        return (RefreshAvisaUserUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideRefreshAvisaUserUseCase(avisaLoginRepository));
    }

    @Override // javax.inject.Provider
    public RefreshAvisaUserUseCase get() {
        return provideRefreshAvisaUserUseCase(this.avisaLoginRepositoryProvider.get());
    }
}
