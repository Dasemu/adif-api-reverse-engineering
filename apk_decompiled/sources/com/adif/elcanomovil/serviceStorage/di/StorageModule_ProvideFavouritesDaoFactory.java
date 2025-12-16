package com.adif.elcanomovil.serviceStorage.di;

import com.adif.elcanomovil.serviceStorage.database.FavouritesDao;
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
public final class StorageModule_ProvideFavouritesDaoFactory implements Factory<FavouritesDao> {
    private final Provider<StationDatabase> databaseProvider;

    public StorageModule_ProvideFavouritesDaoFactory(Provider<StationDatabase> provider) {
        this.databaseProvider = provider;
    }

    public static StorageModule_ProvideFavouritesDaoFactory create(Provider<StationDatabase> provider) {
        return new StorageModule_ProvideFavouritesDaoFactory(provider);
    }

    public static FavouritesDao provideFavouritesDao(StationDatabase stationDatabase) {
        return (FavouritesDao) Preconditions.checkNotNullFromProvides(StorageModule.INSTANCE.provideFavouritesDao(stationDatabase));
    }

    @Override // javax.inject.Provider
    public FavouritesDao get() {
        return provideFavouritesDao(this.databaseProvider.get());
    }
}
