package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase;
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
public final class UseCases_ProvideGetHomeStationUseCaseFactory implements Factory<GetHomeStationUseCase> {
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideGetHomeStationUseCaseFactory(Provider<StationsRepository> provider) {
        this.stationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetHomeStationUseCaseFactory create(Provider<StationsRepository> provider) {
        return new UseCases_ProvideGetHomeStationUseCaseFactory(provider);
    }

    public static GetHomeStationUseCase provideGetHomeStationUseCase(StationsRepository stationsRepository) {
        return (GetHomeStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetHomeStationUseCase(stationsRepository));
    }

    @Override // javax.inject.Provider
    public GetHomeStationUseCase get() {
        return provideGetHomeStationUseCase(this.stationsRepositoryProvider.get());
    }
}
