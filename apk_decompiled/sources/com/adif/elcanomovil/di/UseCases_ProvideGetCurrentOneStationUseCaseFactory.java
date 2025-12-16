package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.GetCurrentOneStationUseCase;
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
public final class UseCases_ProvideGetCurrentOneStationUseCaseFactory implements Factory<GetCurrentOneStationUseCase> {
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideGetCurrentOneStationUseCaseFactory(Provider<StationsRepository> provider) {
        this.stationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetCurrentOneStationUseCaseFactory create(Provider<StationsRepository> provider) {
        return new UseCases_ProvideGetCurrentOneStationUseCaseFactory(provider);
    }

    public static GetCurrentOneStationUseCase provideGetCurrentOneStationUseCase(StationsRepository stationsRepository) {
        return (GetCurrentOneStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetCurrentOneStationUseCase(stationsRepository));
    }

    @Override // javax.inject.Provider
    public GetCurrentOneStationUseCase get() {
        return provideGetCurrentOneStationUseCase(this.stationsRepositoryProvider.get());
    }
}
