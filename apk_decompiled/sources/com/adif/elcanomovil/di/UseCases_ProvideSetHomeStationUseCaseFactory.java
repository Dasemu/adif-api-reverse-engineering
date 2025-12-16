package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.SetHomeStationUseCase;
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
public final class UseCases_ProvideSetHomeStationUseCaseFactory implements Factory<SetHomeStationUseCase> {
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideSetHomeStationUseCaseFactory(Provider<StationsRepository> provider) {
        this.stationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideSetHomeStationUseCaseFactory create(Provider<StationsRepository> provider) {
        return new UseCases_ProvideSetHomeStationUseCaseFactory(provider);
    }

    public static SetHomeStationUseCase provideSetHomeStationUseCase(StationsRepository stationsRepository) {
        return (SetHomeStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideSetHomeStationUseCase(stationsRepository));
    }

    @Override // javax.inject.Provider
    public SetHomeStationUseCase get() {
        return provideSetHomeStationUseCase(this.stationsRepositoryProvider.get());
    }
}
