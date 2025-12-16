package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.avisa.IncidenceRepository;
import com.adif.elcanomovil.domain.usecases.avisa.incidence.CreateIncidenceUseCase;
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
public final class UseCases_ProvideCreateIncidenceUseCaseFactory implements Factory<CreateIncidenceUseCase> {
    private final Provider<IncidenceRepository> incidenceRepositoryProvider;

    public UseCases_ProvideCreateIncidenceUseCaseFactory(Provider<IncidenceRepository> provider) {
        this.incidenceRepositoryProvider = provider;
    }

    public static UseCases_ProvideCreateIncidenceUseCaseFactory create(Provider<IncidenceRepository> provider) {
        return new UseCases_ProvideCreateIncidenceUseCaseFactory(provider);
    }

    public static CreateIncidenceUseCase provideCreateIncidenceUseCase(IncidenceRepository incidenceRepository) {
        return (CreateIncidenceUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideCreateIncidenceUseCase(incidenceRepository));
    }

    @Override // javax.inject.Provider
    public CreateIncidenceUseCase get() {
        return provideCreateIncidenceUseCase(this.incidenceRepositoryProvider.get());
    }
}
