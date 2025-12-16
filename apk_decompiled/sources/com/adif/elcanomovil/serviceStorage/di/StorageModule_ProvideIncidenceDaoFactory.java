package com.adif.elcanomovil.serviceStorage.di;

import com.adif.elcanomovil.serviceStorage.database.IncidenceDao;
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
public final class StorageModule_ProvideIncidenceDaoFactory implements Factory<IncidenceDao> {
    private final Provider<StationDatabase> databaseProvider;

    public StorageModule_ProvideIncidenceDaoFactory(Provider<StationDatabase> provider) {
        this.databaseProvider = provider;
    }

    public static StorageModule_ProvideIncidenceDaoFactory create(Provider<StationDatabase> provider) {
        return new StorageModule_ProvideIncidenceDaoFactory(provider);
    }

    public static IncidenceDao provideIncidenceDao(StationDatabase stationDatabase) {
        return (IncidenceDao) Preconditions.checkNotNullFromProvides(StorageModule.INSTANCE.provideIncidenceDao(stationDatabase));
    }

    @Override // javax.inject.Provider
    public IncidenceDao get() {
        return provideIncidenceDao(this.databaseProvider.get());
    }
}
