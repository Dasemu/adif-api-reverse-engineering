package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.circulation.GetStationArrivalsUseCase;
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
public final class UseCases_ProvideGetStationArrivalsUseCaseFactory implements Factory<GetStationArrivalsUseCase> {
    private final Provider<CirculationRepository> circulationRepositoryProvider;

    public UseCases_ProvideGetStationArrivalsUseCaseFactory(Provider<CirculationRepository> provider) {
        this.circulationRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetStationArrivalsUseCaseFactory create(Provider<CirculationRepository> provider) {
        return new UseCases_ProvideGetStationArrivalsUseCaseFactory(provider);
    }

    public static GetStationArrivalsUseCase provideGetStationArrivalsUseCase(CirculationRepository circulationRepository) {
        return (GetStationArrivalsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetStationArrivalsUseCase(circulationRepository));
    }

    @Override // javax.inject.Provider
    public GetStationArrivalsUseCase get() {
        return provideGetStationArrivalsUseCase(this.circulationRepositoryProvider.get());
    }
}
