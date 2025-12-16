package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.repositories.circulation.CirculationMapper;
import com.adif.elcanomovil.serviceNetworking.circulations.CirculationService;
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
public final class RepositoryModule_Companion_ProvideCirculationRepositoryFactory implements Factory<CirculationRepository> {
    private final Provider<CirculationMapper> circulationMapperProvider;
    private final Provider<CirculationService> circulationServiceProvider;
    private final Provider<PreferenceStorage> storageProvider;

    public RepositoryModule_Companion_ProvideCirculationRepositoryFactory(Provider<CirculationService> provider, Provider<PreferenceStorage> provider2, Provider<CirculationMapper> provider3) {
        this.circulationServiceProvider = provider;
        this.storageProvider = provider2;
        this.circulationMapperProvider = provider3;
    }

    public static RepositoryModule_Companion_ProvideCirculationRepositoryFactory create(Provider<CirculationService> provider, Provider<PreferenceStorage> provider2, Provider<CirculationMapper> provider3) {
        return new RepositoryModule_Companion_ProvideCirculationRepositoryFactory(provider, provider2, provider3);
    }

    public static CirculationRepository provideCirculationRepository(CirculationService circulationService, PreferenceStorage preferenceStorage, CirculationMapper circulationMapper) {
        return (CirculationRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideCirculationRepository(circulationService, preferenceStorage, circulationMapper));
    }

    @Override // javax.inject.Provider
    public CirculationRepository get() {
        return provideCirculationRepository(this.circulationServiceProvider.get(), this.storageProvider.get(), this.circulationMapperProvider.get());
    }
}
