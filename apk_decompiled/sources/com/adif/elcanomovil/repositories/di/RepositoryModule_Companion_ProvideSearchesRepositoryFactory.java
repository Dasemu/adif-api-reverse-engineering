package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.repositories.searches.SearchesMapper;
import com.adif.elcanomovil.repositories.searches.TrainSearchesMapper;
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
public final class RepositoryModule_Companion_ProvideSearchesRepositoryFactory implements Factory<SearchesRepository> {
    private final Provider<SearchesMapper> searchesMapperProvider;
    private final Provider<PreferenceStorage> storageProvider;
    private final Provider<TrainSearchesMapper> trainSearchesMapperProvider;

    public RepositoryModule_Companion_ProvideSearchesRepositoryFactory(Provider<PreferenceStorage> provider, Provider<SearchesMapper> provider2, Provider<TrainSearchesMapper> provider3) {
        this.storageProvider = provider;
        this.searchesMapperProvider = provider2;
        this.trainSearchesMapperProvider = provider3;
    }

    public static RepositoryModule_Companion_ProvideSearchesRepositoryFactory create(Provider<PreferenceStorage> provider, Provider<SearchesMapper> provider2, Provider<TrainSearchesMapper> provider3) {
        return new RepositoryModule_Companion_ProvideSearchesRepositoryFactory(provider, provider2, provider3);
    }

    public static SearchesRepository provideSearchesRepository(PreferenceStorage preferenceStorage, SearchesMapper searchesMapper, TrainSearchesMapper trainSearchesMapper) {
        return (SearchesRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideSearchesRepository(preferenceStorage, searchesMapper, trainSearchesMapper));
    }

    @Override // javax.inject.Provider
    public SearchesRepository get() {
        return provideSearchesRepository(this.storageProvider.get(), this.searchesMapperProvider.get(), this.trainSearchesMapperProvider.get());
    }
}
