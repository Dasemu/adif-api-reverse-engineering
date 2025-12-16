package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.avisa.AvisaStationsRepository;
import com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationsUseCase;
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
public final class UseCases_ProvideGetAvisaStationsUseCaseFactory implements Factory<GetAvisaStationsUseCase> {
    private final Provider<AvisaStationsRepository> avisaStationsRepositoryProvider;

    public UseCases_ProvideGetAvisaStationsUseCaseFactory(Provider<AvisaStationsRepository> provider) {
        this.avisaStationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetAvisaStationsUseCaseFactory create(Provider<AvisaStationsRepository> provider) {
        return new UseCases_ProvideGetAvisaStationsUseCaseFactory(provider);
    }

    public static GetAvisaStationsUseCase provideGetAvisaStationsUseCase(AvisaStationsRepository avisaStationsRepository) {
        return (GetAvisaStationsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetAvisaStationsUseCase(avisaStationsRepository));
    }

    @Override // javax.inject.Provider
    public GetAvisaStationsUseCase get() {
        return provideGetAvisaStationsUseCase(this.avisaStationsRepositoryProvider.get());
    }
}
