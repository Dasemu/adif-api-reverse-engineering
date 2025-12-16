package com.adif.elcanomovil.serviceNetworking.pinning;

import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import d1.C0309c;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class PinningRepository_Factory implements Factory<PinningRepository> {
    private final Provider<PinningRemoteDataSource> dataSourceProvider;
    private final Provider<C0309c> dateUtilsProvider;
    private final Provider<PreferenceStorage> preferenceProvider;

    public PinningRepository_Factory(Provider<PinningRemoteDataSource> provider, Provider<PreferenceStorage> provider2, Provider<C0309c> provider3) {
        this.dataSourceProvider = provider;
        this.preferenceProvider = provider2;
        this.dateUtilsProvider = provider3;
    }

    public static PinningRepository_Factory create(Provider<PinningRemoteDataSource> provider, Provider<PreferenceStorage> provider2, Provider<C0309c> provider3) {
        return new PinningRepository_Factory(provider, provider2, provider3);
    }

    public static PinningRepository newInstance(PinningRemoteDataSource pinningRemoteDataSource, PreferenceStorage preferenceStorage, C0309c c0309c) {
        return new PinningRepository(pinningRemoteDataSource, preferenceStorage, c0309c);
    }

    @Override // javax.inject.Provider
    public PinningRepository get() {
        return newInstance(this.dataSourceProvider.get(), this.preferenceProvider.get(), this.dateUtilsProvider.get());
    }
}
