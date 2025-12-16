package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationToUseCase;
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
public final class UseCases_ProvideGetLastDeparturesArrivalsStationToUseCaseFactory implements Factory<GetLastDeparturesArrivalsStationToUseCase> {
    private final Provider<CirculationRepository> circulationRepositoryProvider;

    public UseCases_ProvideGetLastDeparturesArrivalsStationToUseCaseFactory(Provider<CirculationRepository> provider) {
        this.circulationRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetLastDeparturesArrivalsStationToUseCaseFactory create(Provider<CirculationRepository> provider) {
        return new UseCases_ProvideGetLastDeparturesArrivalsStationToUseCaseFactory(provider);
    }

    public static GetLastDeparturesArrivalsStationToUseCase provideGetLastDeparturesArrivalsStationToUseCase(CirculationRepository circulationRepository) {
        return (GetLastDeparturesArrivalsStationToUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetLastDeparturesArrivalsStationToUseCase(circulationRepository));
    }

    @Override // javax.inject.Provider
    public GetLastDeparturesArrivalsStationToUseCase get() {
        return provideGetLastDeparturesArrivalsStationToUseCase(this.circulationRepositoryProvider.get());
    }
}
