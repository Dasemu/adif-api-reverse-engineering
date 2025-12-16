package com.adif.elcanomovil.serviceStorage.di;

import Z2.G;
import android.content.Context;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes.dex */
public final class StorageModule_ProvidePreferenceStorageFactory implements Factory<PreferenceStorage> {
    private final Provider<Context> contextProvider;
    private final Provider<G> moshiProvider;

    public StorageModule_ProvidePreferenceStorageFactory(Provider<Context> provider, Provider<G> provider2) {
        this.contextProvider = provider;
        this.moshiProvider = provider2;
    }

    public static StorageModule_ProvidePreferenceStorageFactory create(Provider<Context> provider, Provider<G> provider2) {
        return new StorageModule_ProvidePreferenceStorageFactory(provider, provider2);
    }

    public static PreferenceStorage providePreferenceStorage(Context context, G g4) {
        return (PreferenceStorage) Preconditions.checkNotNullFromProvides(StorageModule.INSTANCE.providePreferenceStorage(context, g4));
    }

    @Override // javax.inject.Provider
    public PreferenceStorage get() {
        return providePreferenceStorage(this.contextProvider.get(), this.moshiProvider.get());
    }
}
