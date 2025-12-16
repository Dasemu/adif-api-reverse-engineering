package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.stations.StationsObservationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.GetStationsObservationsUseCase;
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
public final class UseCases_ProvideGetStationsObservationsUseCaseFactory implements Factory<GetStationsObservationsUseCase> {
    private final Provider<StationsObservationsRepository> stationsObservationsRepositoryProvider;

    public UseCases_ProvideGetStationsObservationsUseCaseFactory(Provider<StationsObservationsRepository> provider) {
        this.stationsObservationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetStationsObservationsUseCaseFactory create(Provider<StationsObservationsRepository> provider) {
        return new UseCases_ProvideGetStationsObservationsUseCaseFactory(provider);
    }

    public static GetStationsObservationsUseCase provideGetStationsObservationsUseCase(StationsObservationsRepository stationsObservationsRepository) {
        return (GetStationsObservationsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetStationsObservationsUseCase(stationsObservationsRepository));
    }

    @Override // javax.inject.Provider
    public GetStationsObservationsUseCase get() {
        return provideGetStationsObservationsUseCase(this.stationsObservationsRepositoryProvider.get());
    }
}
