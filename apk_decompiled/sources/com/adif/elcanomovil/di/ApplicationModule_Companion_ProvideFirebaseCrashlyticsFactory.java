package com.adif.elcanomovil.di;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import g1.AbstractC0374a;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ApplicationModule_Companion_ProvideFirebaseCrashlyticsFactory implements Factory<FirebaseCrashlytics> {
    public static ApplicationModule_Companion_ProvideFirebaseCrashlyticsFactory create() {
        return AbstractC0374a.f6736a;
    }

    public static FirebaseCrashlytics provideFirebaseCrashlytics() {
        return (FirebaseCrashlytics) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideFirebaseCrashlytics());
    }

    @Override // javax.inject.Provider
    public FirebaseCrashlytics get() {
        return provideFirebaseCrashlytics();
    }
}
