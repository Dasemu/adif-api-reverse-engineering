package com.adif.elcanomovil.serviceStorage.di;

import Z2.G;
import android.content.Context;
import com.adif.elcanomovil.serviceStorage.database.StationDatabase;
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
public final class StorageModule_ProvideStationDatabaseFactory implements Factory<StationDatabase> {
    private final Provider<Context> contextProvider;
    private final Provider<G> moshiProvider;

    public StorageModule_ProvideStationDatabaseFactory(Provider<Context> provider, Provider<G> provider2) {
        this.contextProvider = provider;
        this.moshiProvider = provider2;
    }

    public static StorageModule_ProvideStationDatabaseFactory create(Provider<Context> provider, Provider<G> provider2) {
        return new StorageModule_ProvideStationDatabaseFactory(provider, provider2);
    }

    public static StationDatabase provideStationDatabase(Context context, G g4) {
        return (StationDatabase) Preconditions.checkNotNullFromProvides(StorageModule.INSTANCE.provideStationDatabase(context, g4));
    }

    @Override // javax.inject.Provider
    public StationDatabase get() {
        return provideStationDatabase(this.contextProvider.get(), this.moshiProvider.get());
    }
}
