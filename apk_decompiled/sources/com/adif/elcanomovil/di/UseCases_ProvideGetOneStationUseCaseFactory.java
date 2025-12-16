package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.GetOneStationUseCase;
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
public final class UseCases_ProvideGetOneStationUseCaseFactory implements Factory<GetOneStationUseCase> {
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideGetOneStationUseCaseFactory(Provider<StationsRepository> provider) {
        this.stationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetOneStationUseCaseFactory create(Provider<StationsRepository> provider) {
        return new UseCases_ProvideGetOneStationUseCaseFactory(provider);
    }

    public static GetOneStationUseCase provideGetOneStationUseCase(StationsRepository stationsRepository) {
        return (GetOneStationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetOneStationUseCase(stationsRepository));
    }

    @Override // javax.inject.Provider
    public GetOneStationUseCase get() {
        return provideGetOneStationUseCase(this.stationsRepositoryProvider.get());
    }
}
