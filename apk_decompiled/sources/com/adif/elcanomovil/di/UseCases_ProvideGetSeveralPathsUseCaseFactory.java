package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.circulation.GetSeveralPathsUseCase;
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
public final class UseCases_ProvideGetSeveralPathsUseCaseFactory implements Factory<GetSeveralPathsUseCase> {
    private final Provider<CirculationRepository> circulationRepositoryProvider;

    public UseCases_ProvideGetSeveralPathsUseCaseFactory(Provider<CirculationRepository> provider) {
        this.circulationRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetSeveralPathsUseCaseFactory create(Provider<CirculationRepository> provider) {
        return new UseCases_ProvideGetSeveralPathsUseCaseFactory(provider);
    }

    public static GetSeveralPathsUseCase provideGetSeveralPathsUseCase(CirculationRepository circulationRepository) {
        return (GetSeveralPathsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetSeveralPathsUseCase(circulationRepository));
    }

    @Override // javax.inject.Provider
    public GetSeveralPathsUseCase get() {
        return provideGetSeveralPathsUseCase(this.circulationRepositoryProvider.get());
    }
}
