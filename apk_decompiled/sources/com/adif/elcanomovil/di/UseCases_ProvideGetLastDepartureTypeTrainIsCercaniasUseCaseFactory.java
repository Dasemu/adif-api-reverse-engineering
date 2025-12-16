package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDepartureTypeTrainIsCercaniasUseCase;
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
public final class UseCases_ProvideGetLastDepartureTypeTrainIsCercaniasUseCaseFactory implements Factory<GetLastDepartureTypeTrainIsCercaniasUseCase> {
    private final Provider<CirculationRepository> circulationRepositoryProvider;

    public UseCases_ProvideGetLastDepartureTypeTrainIsCercaniasUseCaseFactory(Provider<CirculationRepository> provider) {
        this.circulationRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetLastDepartureTypeTrainIsCercaniasUseCaseFactory create(Provider<CirculationRepository> provider) {
        return new UseCases_ProvideGetLastDepartureTypeTrainIsCercaniasUseCaseFactory(provider);
    }

    public static GetLastDepartureTypeTrainIsCercaniasUseCase provideGetLastDepartureTypeTrainIsCercaniasUseCase(CirculationRepository circulationRepository) {
        return (GetLastDepartureTypeTrainIsCercaniasUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetLastDepartureTypeTrainIsCercaniasUseCase(circulationRepository));
    }

    @Override // javax.inject.Provider
    public GetLastDepartureTypeTrainIsCercaniasUseCase get() {
        return provideGetLastDepartureTypeTrainIsCercaniasUseCase(this.circulationRepositoryProvider.get());
    }
}
