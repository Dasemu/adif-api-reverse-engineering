package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.avisa.IncidenceRepository;
import com.adif.elcanomovil.domain.usecases.avisa.incidence.GetIncidenceDetailsUseCase;
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
public final class UseCases_ProvideGetIncidenceDetailUseCaseFactory implements Factory<GetIncidenceDetailsUseCase> {
    private final Provider<IncidenceRepository> incidenceRepositoryProvider;

    public UseCases_ProvideGetIncidenceDetailUseCaseFactory(Provider<IncidenceRepository> provider) {
        this.incidenceRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetIncidenceDetailUseCaseFactory create(Provider<IncidenceRepository> provider) {
        return new UseCases_ProvideGetIncidenceDetailUseCaseFactory(provider);
    }

    public static GetIncidenceDetailsUseCase provideGetIncidenceDetailUseCase(IncidenceRepository incidenceRepository) {
        return (GetIncidenceDetailsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetIncidenceDetailUseCase(incidenceRepository));
    }

    @Override // javax.inject.Provider
    public GetIncidenceDetailsUseCase get() {
        return provideGetIncidenceDetailUseCase(this.incidenceRepositoryProvider.get());
    }
}
