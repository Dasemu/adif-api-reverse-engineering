package com.adif.elcanomovil.serviceStorage.di;

import com.adif.elcanomovil.serviceStorage.database.StationDatabase;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao;
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
public final class StorageModule_ProvideSubscriptionDaoFactory implements Factory<SubscriptionsDao> {
    private final Provider<StationDatabase> databaseProvider;

    public StorageModule_ProvideSubscriptionDaoFactory(Provider<StationDatabase> provider) {
        this.databaseProvider = provider;
    }

    public static StorageModule_ProvideSubscriptionDaoFactory create(Provider<StationDatabase> provider) {
        return new StorageModule_ProvideSubscriptionDaoFactory(provider);
    }

    public static SubscriptionsDao provideSubscriptionDao(StationDatabase stationDatabase) {
        return (SubscriptionsDao) Preconditions.checkNotNullFromProvides(StorageModule.INSTANCE.provideSubscriptionDao(stationDatabase));
    }

    @Override // javax.inject.Provider
    public SubscriptionsDao get() {
        return provideSubscriptionDao(this.databaseProvider.get());
    }
}
