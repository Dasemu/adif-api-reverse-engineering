package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.DynamicLinkFacade;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
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
public final class UseCases_ProvideGenerateDynamicLinkUseCaseFactory implements Factory<DynamicLinkUseCase> {
    private final Provider<DynamicLinkFacade> dynamicLinkFacadeProvider;

    public UseCases_ProvideGenerateDynamicLinkUseCaseFactory(Provider<DynamicLinkFacade> provider) {
        this.dynamicLinkFacadeProvider = provider;
    }

    public static UseCases_ProvideGenerateDynamicLinkUseCaseFactory create(Provider<DynamicLinkFacade> provider) {
        return new UseCases_ProvideGenerateDynamicLinkUseCaseFactory(provider);
    }

    public static DynamicLinkUseCase provideGenerateDynamicLinkUseCase(DynamicLinkFacade dynamicLinkFacade) {
        return (DynamicLinkUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGenerateDynamicLinkUseCase(dynamicLinkFacade));
    }

    @Override // javax.inject.Provider
    public DynamicLinkUseCase get() {
        return provideGenerateDynamicLinkUseCase(this.dynamicLinkFacadeProvider.get());
    }
}
