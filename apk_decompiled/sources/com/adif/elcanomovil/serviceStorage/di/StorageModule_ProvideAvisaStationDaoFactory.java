package com.adif.elcanomovil.serviceStorage.di;

import com.adif.elcanomovil.serviceStorage.database.AvisaStationDao;
import com.adif.elcanomovil.serviceStorage.database.StationDatabase;
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
public final class StorageModule_ProvideAvisaStationDaoFactory implements Factory<AvisaStationDao> {
    private final Provider<StationDatabase> databaseProvider;

    public StorageModule_ProvideAvisaStationDaoFactory(Provider<StationDatabase> provider) {
        this.databaseProvider = provider;
    }

    public static StorageModule_ProvideAvisaStationDaoFactory create(Provider<StationDatabase> provider) {
        return new StorageModule_ProvideAvisaStationDaoFactory(provider);
    }

    public static AvisaStationDao provideAvisaStationDao(StationDatabase stationDatabase) {
        return (AvisaStationDao) Preconditions.checkNotNullFromProvides(StorageModule.INSTANCE.provideAvisaStationDao(stationDatabase));
    }

    @Override // javax.inject.Provider
    public AvisaStationDao get() {
        return provideAvisaStationDao(this.databaseProvider.get());
    }
}
