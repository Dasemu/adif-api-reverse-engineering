package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationUseCase;
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
public final class UseCases_ProvideGetLastDeparturesArrivalsStationUseCaseFactory implements Factory<GetLastDeparturesArrivalsStationUseCase> {
    private final Provider<CirculationRepository> circulationRepositoryProvider;

    public UseCases_ProvideGetLastDeparturesArrivalsStationUseCaseFactory(Provider<CirculationRepository> provider) {
        this.circulationRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetLastDeparturesArrivalsStationUseCaseFactory create(Provider<CirculationRepository> provider) {
        return new UseCases_ProvideGetLastDeparturesArrivalsStationUseCaseFactory(provider);
    }

    public static GetLastDeparturesArrivalsStationUseCase provideGetLastDeparturesArrivalsStationUseCase(CirculationRepository circulationRepository) {
        return (GetLastDeparturesArrivalsStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetLastDeparturesArrivalsStationUseCase(circulationRepository));
    }

    @Override // javax.inject.Provider
    public GetLastDeparturesArrivalsStationUseCase get() {
        return provideGetLastDeparturesArrivalsStationUseCase(this.circulationRepositoryProvider.get());
    }
}
