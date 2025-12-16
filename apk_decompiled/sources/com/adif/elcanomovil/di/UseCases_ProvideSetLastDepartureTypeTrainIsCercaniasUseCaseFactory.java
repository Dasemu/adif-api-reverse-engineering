package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDepartureTypeTrainIsCercaniasUseCase;
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
public final class UseCases_ProvideSetLastDepartureTypeTrainIsCercaniasUseCaseFactory implements Factory<SetLastDepartureTypeTrainIsCercaniasUseCase> {
    private final Provider<CirculationRepository> circulationRepositoryProvider;

    public UseCases_ProvideSetLastDepartureTypeTrainIsCercaniasUseCaseFactory(Provider<CirculationRepository> provider) {
        this.circulationRepositoryProvider = provider;
    }

    public static UseCases_ProvideSetLastDepartureTypeTrainIsCercaniasUseCaseFactory create(Provider<CirculationRepository> provider) {
        return new UseCases_ProvideSetLastDepartureTypeTrainIsCercaniasUseCaseFactory(provider);
    }

    public static SetLastDepartureTypeTrainIsCercaniasUseCase provideSetLastDepartureTypeTrainIsCercaniasUseCase(CirculationRepository circulationRepository) {
        return (SetLastDepartureTypeTrainIsCercaniasUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideSetLastDepartureTypeTrainIsCercaniasUseCase(circulationRepository));
    }

    @Override // javax.inject.Provider
    public SetLastDepartureTypeTrainIsCercaniasUseCase get() {
        return provideSetLastDepartureTypeTrainIsCercaniasUseCase(this.circulationRepositoryProvider.get());
    }
}
