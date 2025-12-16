package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.GetLastVisitedStationUseCase;
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
public final class UseCases_ProvideGetLastVisitedStationUseCaseFactory implements Factory<GetLastVisitedStationUseCase> {
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideGetLastVisitedStationUseCaseFactory(Provider<StationsRepository> provider) {
        this.stationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetLastVisitedStationUseCaseFactory create(Provider<StationsRepository> provider) {
        return new UseCases_ProvideGetLastVisitedStationUseCaseFactory(provider);
    }

    public static GetLastVisitedStationUseCase provideGetLastVisitedStationUseCase(StationsRepository stationsRepository) {
        return (GetLastVisitedStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetLastVisitedStationUseCase(stationsRepository));
    }

    @Override // javax.inject.Provider
    public GetLastVisitedStationUseCase get() {
        return provideGetLastVisitedStationUseCase(this.stationsRepositoryProvider.get());
    }
}
