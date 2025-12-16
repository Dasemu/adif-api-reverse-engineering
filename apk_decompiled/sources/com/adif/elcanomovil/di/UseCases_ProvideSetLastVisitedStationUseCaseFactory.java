package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.SetLastVisitedStationUseCase;
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
public final class UseCases_ProvideSetLastVisitedStationUseCaseFactory implements Factory<SetLastVisitedStationUseCase> {
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideSetLastVisitedStationUseCaseFactory(Provider<StationsRepository> provider) {
        this.stationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideSetLastVisitedStationUseCaseFactory create(Provider<StationsRepository> provider) {
        return new UseCases_ProvideSetLastVisitedStationUseCaseFactory(provider);
    }

    public static SetLastVisitedStationUseCase provideSetLastVisitedStationUseCase(StationsRepository stationsRepository) {
        return (SetLastVisitedStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideSetLastVisitedStationUseCase(stationsRepository));
    }

    @Override // javax.inject.Provider
    public SetLastVisitedStationUseCase get() {
        return provideSetLastVisitedStationUseCase(this.stationsRepositoryProvider.get());
    }
}
