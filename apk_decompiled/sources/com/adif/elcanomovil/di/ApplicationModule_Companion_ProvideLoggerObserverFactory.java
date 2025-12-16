package com.adif.elcanomovil.di;

import com.adif.elcanomovil.observers.LoggerObserver;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
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
public final class ApplicationModule_Companion_ProvideLoggerObserverFactory implements Factory<LoggerObserver> {
    private final Provider<FirebaseCrashlytics> firebaseCrashlyticsProvider;

    public ApplicationModule_Companion_ProvideLoggerObserverFactory(Provider<FirebaseCrashlytics> provider) {
        this.firebaseCrashlyticsProvider = provider;
    }

    public static ApplicationModule_Companion_ProvideLoggerObserverFactory create(Provider<FirebaseCrashlytics> provider) {
        return new ApplicationModule_Companion_ProvideLoggerObserverFactory(provider);
    }

    public static LoggerObserver provideLoggerObserver(FirebaseCrashlytics firebaseCrashlytics) {
        return (LoggerObserver) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideLoggerObserver(firebaseCrashlytics));
    }

    @Override // javax.inject.Provider
    public LoggerObserver get() {
        return provideLoggerObserver(this.firebaseCrashlyticsProvider.get());
    }
}
