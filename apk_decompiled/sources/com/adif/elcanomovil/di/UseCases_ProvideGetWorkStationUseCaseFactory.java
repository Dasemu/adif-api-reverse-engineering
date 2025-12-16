package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase;
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
public final class UseCases_ProvideGetWorkStationUseCaseFactory implements Factory<GetWorkStationUseCase> {
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideGetWorkStationUseCaseFactory(Provider<StationsRepository> provider) {
        this.stationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetWorkStationUseCaseFactory create(Provider<StationsRepository> provider) {
        return new UseCases_ProvideGetWorkStationUseCaseFactory(provider);
    }

    public static GetWorkStationUseCase provideGetWorkStationUseCase(StationsRepository stationsRepository) {
        return (GetWorkStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetWorkStationUseCase(stationsRepository));
    }

    @Override // javax.inject.Provider
    public GetWorkStationUseCase get() {
        return provideGetWorkStationUseCase(this.stationsRepositoryProvider.get());
    }
}
