package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.SetWorkStationUseCase;
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
public final class UseCases_ProvideSetWorkStationUseCaseFactory implements Factory<SetWorkStationUseCase> {
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideSetWorkStationUseCaseFactory(Provider<StationsRepository> provider) {
        this.stationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideSetWorkStationUseCaseFactory create(Provider<StationsRepository> provider) {
        return new UseCases_ProvideSetWorkStationUseCaseFactory(provider);
    }

    public static SetWorkStationUseCase provideSetWorkStationUseCase(StationsRepository stationsRepository) {
        return (SetWorkStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideSetWorkStationUseCase(stationsRepository));
    }

    @Override // javax.inject.Provider
    public SetWorkStationUseCase get() {
        return provideSetWorkStationUseCase(this.stationsRepositoryProvider.get());
    }
}
