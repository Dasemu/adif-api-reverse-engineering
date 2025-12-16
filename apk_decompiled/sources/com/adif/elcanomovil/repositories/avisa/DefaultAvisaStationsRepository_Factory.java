package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.serviceNetworking.avisa.AvisaStationsService;
import com.adif.elcanomovil.serviceStorage.database.AvisaStationDao;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import d1.InterfaceC0307a;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class DefaultAvisaStationsRepository_Factory implements Factory<DefaultAvisaStationsRepository> {
    private final Provider<InterfaceC0307a> appDispatcherProvider;
    private final Provider<AvisaStationCategoryMapper> avisaStationCategoryMapperProvider;
    private final Provider<AvisaStationMapper> avisaStationMapperProvider;
    private final Provider<PreferenceStorage> preferenceStorageProvider;
    private final Provider<AvisaStationDao> stationsDaoProvider;
    private final Provider<AvisaStationsService> stationsServiceProvider;

    public DefaultAvisaStationsRepository_Factory(Provider<AvisaStationsService> provider, Provider<AvisaStationDao> provider2, Provider<AvisaStationMapper> provider3, Provider<AvisaStationCategoryMapper> provider4, Provider<PreferenceStorage> provider5, Provider<InterfaceC0307a> provider6) {
        this.stationsServiceProvider = provider;
        this.stationsDaoProvider = provider2;
        this.avisaStationMapperProvider = provider3;
        this.avisaStationCategoryMapperProvider = provider4;
        this.preferenceStorageProvider = provider5;
        this.appDispatcherProvider = provider6;
    }

    public static DefaultAvisaStationsRepository_Factory create(Provider<AvisaStationsService> provider, Provider<AvisaStationDao> provider2, Provider<AvisaStationMapper> provider3, Provider<AvisaStationCategoryMapper> provider4, Provider<PreferenceStorage> provider5, Provider<InterfaceC0307a> provider6) {
        return new DefaultAvisaStationsRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DefaultAvisaStationsRepository newInstance(AvisaStationsService avisaStationsService, AvisaStationDao avisaStationDao, AvisaStationMapper avisaStationMapper, AvisaStationCategoryMapper avisaStationCategoryMapper, PreferenceStorage preferenceStorage, InterfaceC0307a interfaceC0307a) {
        return new DefaultAvisaStationsRepository(avisaStationsService, avisaStationDao, avisaStationMapper, avisaStationCategoryMapper, preferenceStorage, interfaceC0307a);
    }

    @Override // javax.inject.Provider
    public DefaultAvisaStationsRepository get() {
        return newInstance(this.stationsServiceProvider.get(), this.stationsDaoProvider.get(), this.avisaStationMapperProvider.get(), this.avisaStationCategoryMapperProvider.get(), this.preferenceStorageProvider.get(), this.appDispatcherProvider.get());
    }
}
