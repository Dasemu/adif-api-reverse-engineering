package com.adif.elcanomovil.repositories.di;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0598g;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideFirebaseRemoteConfigFactory implements Factory<FirebaseRemoteConfig> {
    public static RepositoryModule_Companion_ProvideFirebaseRemoteConfigFactory create() {
        return AbstractC0598g.f8397a;
    }

    public static FirebaseRemoteConfig provideFirebaseRemoteConfig() {
        return (FirebaseRemoteConfig) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideFirebaseRemoteConfig());
    }

    @Override // javax.inject.Provider
    public FirebaseRemoteConfig get() {
        return provideFirebaseRemoteConfig();
    }
}
