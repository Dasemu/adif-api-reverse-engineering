package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationToUseCase;
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
public final class UseCases_ProvideSetLastDeparturesArrivalsStationToUseCaseFactory implements Factory<SetLastDeparturesArrivalsStationToUseCase> {
    private final Provider<CirculationRepository> circulationRepositoryProvider;

    public UseCases_ProvideSetLastDeparturesArrivalsStationToUseCaseFactory(Provider<CirculationRepository> provider) {
        this.circulationRepositoryProvider = provider;
    }

    public static UseCases_ProvideSetLastDeparturesArrivalsStationToUseCaseFactory create(Provider<CirculationRepository> provider) {
        return new UseCases_ProvideSetLastDeparturesArrivalsStationToUseCaseFactory(provider);
    }

    public static SetLastDeparturesArrivalsStationToUseCase provideSetLastDeparturesArrivalsStationToUseCase(CirculationRepository circulationRepository) {
        return (SetLastDeparturesArrivalsStationToUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideSetLastDeparturesArrivalsStationToUseCase(circulationRepository));
    }

    @Override // javax.inject.Provider
    public SetLastDeparturesArrivalsStationToUseCase get() {
        return provideSetLastDeparturesArrivalsStationToUseCase(this.circulationRepositoryProvider.get());
    }
}
