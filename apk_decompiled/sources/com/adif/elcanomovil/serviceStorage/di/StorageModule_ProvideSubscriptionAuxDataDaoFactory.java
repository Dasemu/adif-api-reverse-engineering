package com.adif.elcanomovil.serviceStorage.di;

import com.adif.elcanomovil.serviceStorage.database.StationDatabase;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsAuxDataDao;
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
public final class StorageModule_ProvideSubscriptionAuxDataDaoFactory implements Factory<SubscriptionsAuxDataDao> {
    private final Provider<StationDatabase> databaseProvider;

    public StorageModule_ProvideSubscriptionAuxDataDaoFactory(Provider<StationDatabase> provider) {
        this.databaseProvider = provider;
    }

    public static StorageModule_ProvideSubscriptionAuxDataDaoFactory create(Provider<StationDatabase> provider) {
        return new StorageModule_ProvideSubscriptionAuxDataDaoFactory(provider);
    }

    public static SubscriptionsAuxDataDao provideSubscriptionAuxDataDao(StationDatabase stationDatabase) {
        return (SubscriptionsAuxDataDao) Preconditions.checkNotNullFromProvides(StorageModule.INSTANCE.provideSubscriptionAuxDataDao(stationDatabase));
    }

    @Override // javax.inject.Provider
    public SubscriptionsAuxDataDao get() {
        return provideSubscriptionAuxDataDao(this.databaseProvider.get());
    }
}
