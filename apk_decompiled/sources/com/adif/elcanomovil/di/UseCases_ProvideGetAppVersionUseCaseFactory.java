package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.AppVersionProvider;
import com.adif.elcanomovil.domain.usecases.GetAppVersionUseCase;
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
public final class UseCases_ProvideGetAppVersionUseCaseFactory implements Factory<GetAppVersionUseCase> {
    private final Provider<AppVersionProvider> appVersionProvider;

    public UseCases_ProvideGetAppVersionUseCaseFactory(Provider<AppVersionProvider> provider) {
        this.appVersionProvider = provider;
    }

    public static UseCases_ProvideGetAppVersionUseCaseFactory create(Provider<AppVersionProvider> provider) {
        return new UseCases_ProvideGetAppVersionUseCaseFactory(provider);
    }

    public static GetAppVersionUseCase provideGetAppVersionUseCase(AppVersionProvider appVersionProvider) {
        return (GetAppVersionUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetAppVersionUseCase(appVersionProvider));
    }

    @Override // javax.inject.Provider
    public GetAppVersionUseCase get() {
        return provideGetAppVersionUseCase(this.appVersionProvider.get());
    }
}
