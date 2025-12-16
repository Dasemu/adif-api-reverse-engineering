package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
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
public final class UseCases_ProvideGetStationByIdUseCaseFactory implements Factory<GetStationByIdUseCase> {
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public UseCases_ProvideGetStationByIdUseCaseFactory(Provider<StationsRepository> provider) {
        this.stationsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetStationByIdUseCaseFactory create(Provider<StationsRepository> provider) {
        return new UseCases_ProvideGetStationByIdUseCaseFactory(provider);
    }

    public static GetStationByIdUseCase provideGetStationByIdUseCase(StationsRepository stationsRepository) {
        return (GetStationByIdUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetStationByIdUseCase(stationsRepository));
    }

    @Override // javax.inject.Provider
    public GetStationByIdUseCase get() {
        return provideGetStationByIdUseCase(this.stationsRepositoryProvider.get());
    }
}
