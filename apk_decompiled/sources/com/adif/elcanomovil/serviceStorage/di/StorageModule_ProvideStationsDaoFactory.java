package com.adif.elcanomovil.serviceStorage.di;

import com.adif.elcanomovil.serviceStorage.database.StationDatabase;
import com.adif.elcanomovil.serviceStorage.database.StationsDao;
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
public final class StorageModule_ProvideStationsDaoFactory implements Factory<StationsDao> {
    private final Provider<StationDatabase> databaseProvider;

    public StorageModule_ProvideStationsDaoFactory(Provider<StationDatabase> provider) {
        this.databaseProvider = provider;
    }

    public static StorageModule_ProvideStationsDaoFactory create(Provider<StationDatabase> provider) {
        return new StorageModule_ProvideStationsDaoFactory(provider);
    }

    public static StationsDao provideStationsDao(StationDatabase stationDatabase) {
        return (StationsDao) Preconditions.checkNotNullFromProvides(StorageModule.INSTANCE.provideStationsDao(stationDatabase));
    }

    @Override // javax.inject.Provider
    public StationsDao get() {
        return provideStationsDao(this.databaseProvider.get());
    }
}
