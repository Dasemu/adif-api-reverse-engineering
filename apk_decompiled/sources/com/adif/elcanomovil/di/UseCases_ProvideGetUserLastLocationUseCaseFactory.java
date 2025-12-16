package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.LocationProvider;
import com.adif.elcanomovil.domain.usecases.user.GetUserLastLocationUseCase;
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
public final class UseCases_ProvideGetUserLastLocationUseCaseFactory implements Factory<GetUserLastLocationUseCase> {
    private final Provider<LocationProvider> locationProvider;

    public UseCases_ProvideGetUserLastLocationUseCaseFactory(Provider<LocationProvider> provider) {
        this.locationProvider = provider;
    }

    public static UseCases_ProvideGetUserLastLocationUseCaseFactory create(Provider<LocationProvider> provider) {
        return new UseCases_ProvideGetUserLastLocationUseCaseFactory(provider);
    }

    public static GetUserLastLocationUseCase provideGetUserLastLocationUseCase(LocationProvider locationProvider) {
        return (GetUserLastLocationUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetUserLastLocationUseCase(locationProvider));
    }

    @Override // javax.inject.Provider
    public GetUserLastLocationUseCase get() {
        return provideGetUserLastLocationUseCase(this.locationProvider.get());
    }
}
