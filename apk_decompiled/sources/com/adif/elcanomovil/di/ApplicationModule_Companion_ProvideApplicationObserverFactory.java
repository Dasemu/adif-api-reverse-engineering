package com.adif.elcanomovil.di;

import com.adif.elcanomovil.observers.ApplicationObserver;
import com.adif.elcanomovil.observers.LoggerObserver;
import com.adif.elcanomovil.observers.RemoteConfigurationObserver;
import com.adif.elcanomovil.observers.UpdateStationsObserver;
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
public final class ApplicationModule_Companion_ProvideApplicationObserverFactory implements Factory<ApplicationObserver> {
    private final Provider<LoggerObserver> loggerObserverProvider;
    private final Provider<RemoteConfigurationObserver> remoteConfigurationObserverProvider;
    private final Provider<UpdateStationsObserver> updateStationsObserverProvider;

    public ApplicationModule_Companion_ProvideApplicationObserverFactory(Provider<LoggerObserver> provider, Provider<RemoteConfigurationObserver> provider2, Provider<UpdateStationsObserver> provider3) {
        this.loggerObserverProvider = provider;
        this.remoteConfigurationObserverProvider = provider2;
        this.updateStationsObserverProvider = provider3;
    }

    public static ApplicationModule_Companion_ProvideApplicationObserverFactory create(Provider<LoggerObserver> provider, Provider<RemoteConfigurationObserver> provider2, Provider<UpdateStationsObserver> provider3) {
        return new ApplicationModule_Companion_ProvideApplicationObserverFactory(provider, provider2, provider3);
    }

    public static ApplicationObserver provideApplicationObserver(LoggerObserver loggerObserver, RemoteConfigurationObserver remoteConfigurationObserver, UpdateStationsObserver updateStationsObserver) {
        return (ApplicationObserver) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideApplicationObserver(loggerObserver, remoteConfigurationObserver, updateStationsObserver));
    }

    @Override // javax.inject.Provider
    public ApplicationObserver get() {
        return provideApplicationObserver(this.loggerObserverProvider.get(), this.remoteConfigurationObserverProvider.get(), this.updateStationsObserverProvider.get());
    }
}
