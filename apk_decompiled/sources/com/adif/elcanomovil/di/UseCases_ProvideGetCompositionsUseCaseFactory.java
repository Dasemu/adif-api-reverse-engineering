package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.compositions.CompositionsRepository;
import com.adif.elcanomovil.domain.usecases.circulation.GetCompositionsUseCase;
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
public final class UseCases_ProvideGetCompositionsUseCaseFactory implements Factory<GetCompositionsUseCase> {
    private final Provider<CompositionsRepository> compositionsRepositoryProvider;

    public UseCases_ProvideGetCompositionsUseCaseFactory(Provider<CompositionsRepository> provider) {
        this.compositionsRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetCompositionsUseCaseFactory create(Provider<CompositionsRepository> provider) {
        return new UseCases_ProvideGetCompositionsUseCaseFactory(provider);
    }

    public static GetCompositionsUseCase provideGetCompositionsUseCase(CompositionsRepository compositionsRepository) {
        return (GetCompositionsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetCompositionsUseCase(compositionsRepository));
    }

    @Override // javax.inject.Provider
    public GetCompositionsUseCase get() {
        return provideGetCompositionsUseCase(this.compositionsRepositoryProvider.get());
    }
}
