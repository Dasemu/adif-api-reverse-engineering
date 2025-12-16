package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByNameUseCase;
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
public final class UseCases_ProvideGetStationByNameUseCaseFactory implements Factory<GetStationByNameUseCase> {
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideGetStationByNameUseCaseFactory(Provider<StationsRepository> provider) {
        this.stationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetStationByNameUseCaseFactory create(Provider<StationsRepository> provider) {
        return new UseCases_ProvideGetStationByNameUseCaseFactory(provider);
    }

    public static GetStationByNameUseCase provideGetStationByNameUseCase(StationsRepository stationsRepository) {
        return (GetStationByNameUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetStationByNameUseCase(stationsRepository));
    }

    @Override // javax.inject.Provider
    public GetStationByNameUseCase get() {
        return provideGetStationByNameUseCase(this.stationsRepositoryProvider.get());
    }
}
