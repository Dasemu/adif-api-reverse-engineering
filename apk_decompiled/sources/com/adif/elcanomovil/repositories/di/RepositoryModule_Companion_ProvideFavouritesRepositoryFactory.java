package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.repositories.favourites.FavouritesStationsMapper;
import com.adif.elcanomovil.repositories.favourites.FavouritesTrainsMapper;
import com.adif.elcanomovil.serviceNetworking.subscriptions.SubscriptionsService;
import com.adif.elcanomovil.serviceStorage.database.FavouritesDao;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideFavouritesRepositoryFactory implements Factory<FavoritesRepository> {
    private final Provider<FavouritesDao> favouritesDaoProvider;
    private final Provider<FavouritesStationsMapper> favouritesMapperProvider;
    private final Provider<FavouritesTrainsMapper> favouritesTrainMapperProvider;
    private final Provider<PreferenceStorage> storageProvider;
    private final Provider<SubscriptionsService> subscriptionsServiceProvider;

    public RepositoryModule_Companion_ProvideFavouritesRepositoryFactory(Provider<FavouritesDao> provider, Provider<FavouritesStationsMapper> provider2, Provider<SubscriptionsService> provider3, Provider<PreferenceStorage> provider4, Provider<FavouritesTrainsMapper> provider5) {
        this.favouritesDaoProvider = provider;
        this.favouritesMapperProvider = provider2;
        this.subscriptionsServiceProvider = provider3;
        this.storageProvider = provider4;
        this.favouritesTrainMapperProvider = provider5;
    }

    public static RepositoryModule_Companion_ProvideFavouritesRepositoryFactory create(Provider<FavouritesDao> provider, Provider<FavouritesStationsMapper> provider2, Provider<SubscriptionsService> provider3, Provider<PreferenceStorage> provider4, Provider<FavouritesTrainsMapper> provider5) {
        return new RepositoryModule_Companion_ProvideFavouritesRepositoryFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static FavoritesRepository provideFavouritesRepository(FavouritesDao favouritesDao, FavouritesStationsMapper favouritesStationsMapper, SubscriptionsService subscriptionsService, PreferenceStorage preferenceStorage, FavouritesTrainsMapper favouritesTrainsMapper) {
        return (FavoritesRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideFavouritesRepository(favouritesDao, favouritesStationsMapper, subscriptionsService, preferenceStorage, favouritesTrainsMapper));
    }

    @Override // javax.inject.Provider
    public FavoritesRepository get() {
        return provideFavouritesRepository(this.favouritesDaoProvider.get(), this.favouritesMapperProvider.get(), this.subscriptionsServiceProvider.get(), this.storageProvider.get(), this.favouritesTrainMapperProvider.get());
    }
}
