package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.usecases.FetchVersionUpdateUseCase;
import com.adif.elcanomovil.observers.RemoteConfigurationObserver;
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
public final class ApplicationModule_Companion_ProvideRemoteConfigurationObserverFactory implements Factory<RemoteConfigurationObserver> {
    private final Provider<FetchVersionUpdateUseCase> fetchVersionUpdateUseCaseProvider;

    public ApplicationModule_Companion_ProvideRemoteConfigurationObserverFactory(Provider<FetchVersionUpdateUseCase> provider) {
        this.fetchVersionUpdateUseCaseProvider = provider;
    }

    public static ApplicationModule_Companion_ProvideRemoteConfigurationObserverFactory create(Provider<FetchVersionUpdateUseCase> provider) {
        return new ApplicationModule_Companion_ProvideRemoteConfigurationObserverFactory(provider);
    }

    public static RemoteConfigurationObserver provideRemoteConfigurationObserver(FetchVersionUpdateUseCase fetchVersionUpdateUseCase) {
        return (RemoteConfigurationObserver) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideRemoteConfigurationObserver(fetchVersionUpdateUseCase));
    }

    @Override // javax.inject.Provider
    public RemoteConfigurationObserver get() {
        return provideRemoteConfigurationObserver(this.fetchVersionUpdateUseCaseProvider.get());
    }
}
