package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.avisa.IncidenceRepository;
import com.adif.elcanomovil.domain.usecases.avisa.incidence.GetIncidencesUseCase;
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
public final class UseCases_ProvideGetIncidencesUseCaseFactory implements Factory<GetIncidencesUseCase> {
    private final Provider<IncidenceRepository> incidenceRepositoryProvider;

    public UseCases_ProvideGetIncidencesUseCaseFactory(Provider<IncidenceRepository> provider) {
        this.incidenceRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetIncidencesUseCaseFactory create(Provider<IncidenceRepository> provider) {
        return new UseCases_ProvideGetIncidencesUseCaseFactory(provider);
    }

    public static GetIncidencesUseCase provideGetIncidencesUseCase(IncidenceRepository incidenceRepository) {
        return (GetIncidencesUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetIncidencesUseCase(incidenceRepository));
    }

    @Override // javax.inject.Provider
    public GetIncidencesUseCase get() {
        return provideGetIncidencesUseCase(this.incidenceRepositoryProvider.get());
    }
}
