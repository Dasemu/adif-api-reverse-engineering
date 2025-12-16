package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationUseCase;
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
public final class UseCases_ProvideSetLastDeparturesArrivalsStationUseCaseFactory implements Factory<SetLastDeparturesArrivalsStationUseCase> {
    private final Provider<CirculationRepository> circulationRepositoryProvider;

    public UseCases_ProvideSetLastDeparturesArrivalsStationUseCaseFactory(Provider<CirculationRepository> provider) {
        this.circulationRepositoryProvider = provider;
    }

    public static UseCases_ProvideSetLastDeparturesArrivalsStationUseCaseFactory create(Provider<CirculationRepository> provider) {
        return new UseCases_ProvideSetLastDeparturesArrivalsStationUseCaseFactory(provider);
    }

    public static SetLastDeparturesArrivalsStationUseCase provideSetLastDeparturesArrivalsStationUseCase(CirculationRepository circulationRepository) {
        return (SetLastDeparturesArrivalsStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideSetLastDeparturesArrivalsStationUseCase(circulationRepository));
    }

    @Override // javax.inject.Provider
    public SetLastDeparturesArrivalsStationUseCase get() {
        return provideSetLastDeparturesArrivalsStationUseCase(this.circulationRepositoryProvider.get());
    }
}
