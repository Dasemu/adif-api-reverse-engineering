package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.avisa.AvisaStationsRepository;
import com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationCategoriesUseCase;
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
public final class UseCases_ProvideGetAvisaStationsCategoriesUseCaseFactory implements Factory<GetAvisaStationCategoriesUseCase> {
    private final Provider<AvisaStationsRepository> avisaStationsRepositoryProvider;

    public UseCases_ProvideGetAvisaStationsCategoriesUseCaseFactory(Provider<AvisaStationsRepository> provider) {
        this.avisaStationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetAvisaStationsCategoriesUseCaseFactory create(Provider<AvisaStationsRepository> provider) {
        return new UseCases_ProvideGetAvisaStationsCategoriesUseCaseFactory(provider);
    }

    public static GetAvisaStationCategoriesUseCase provideGetAvisaStationsCategoriesUseCase(AvisaStationsRepository avisaStationsRepository) {
        return (GetAvisaStationCategoriesUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetAvisaStationsCategoriesUseCase(avisaStationsRepository));
    }

    @Override // javax.inject.Provider
    public GetAvisaStationCategoriesUseCase get() {
        return provideGetAvisaStationsCategoriesUseCase(this.avisaStationsRepositoryProvider.get());
    }
}
