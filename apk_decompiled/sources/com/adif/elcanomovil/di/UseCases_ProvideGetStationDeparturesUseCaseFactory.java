package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.circulation.GetStationDeparturesUseCase;
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
public final class UseCases_ProvideGetStationDeparturesUseCaseFactory implements Factory<GetStationDeparturesUseCase> {
    private final Provider<CirculationRepository> circulationRepositoryProvider;

    public UseCases_ProvideGetStationDeparturesUseCaseFactory(Provider<CirculationRepository> provider) {
        this.circulationRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetStationDeparturesUseCaseFactory create(Provider<CirculationRepository> provider) {
        return new UseCases_ProvideGetStationDeparturesUseCaseFactory(provider);
    }

    public static GetStationDeparturesUseCase provideGetStationDeparturesUseCase(CirculationRepository circulationRepository) {
        return (GetStationDeparturesUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetStationDeparturesUseCase(circulationRepository));
    }

    @Override // javax.inject.Provider
    public GetStationDeparturesUseCase get() {
        return provideGetStationDeparturesUseCase(this.circulationRepositoryProvider.get());
    }
}
