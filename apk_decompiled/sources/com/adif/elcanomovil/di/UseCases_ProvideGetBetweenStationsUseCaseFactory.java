package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.circulation.GetBetweenStationsUseCase;
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
public final class UseCases_ProvideGetBetweenStationsUseCaseFactory implements Factory<GetBetweenStationsUseCase> {
    private final Provider<CirculationRepository> circulationRepositoryProvider;

    public UseCases_ProvideGetBetweenStationsUseCaseFactory(Provider<CirculationRepository> provider) {
        this.circulationRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetBetweenStationsUseCaseFactory create(Provider<CirculationRepository> provider) {
        return new UseCases_ProvideGetBetweenStationsUseCaseFactory(provider);
    }

    public static GetBetweenStationsUseCase provideGetBetweenStationsUseCase(CirculationRepository circulationRepository) {
        return (GetBetweenStationsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetBetweenStationsUseCase(circulationRepository));
    }

    @Override // javax.inject.Provider
    public GetBetweenStationsUseCase get() {
        return provideGetBetweenStationsUseCase(this.circulationRepositoryProvider.get());
    }
}
