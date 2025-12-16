package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.serviceNetworking.avisa.IncidenceService;
import com.adif.elcanomovil.serviceStorage.database.IncidenceDao;
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
public final class DefaultIncidenceRepository_Factory implements Factory<DefaultIncidenceRepository> {
    private final Provider<InterfaceC0307a> appDispatcherProvider;
    private final Provider<IncidenceDao> incidenceDaoProvider;
    private final Provider<IncidenceMapper> incidenceMapperProvider;
    private final Provider<IncidencePictureMapper> incidencePictureMapperProvider;
    private final Provider<IncidenceService> incidenceServiceProvider;
    private final Provider<PreferenceStorage> preferenceStorageProvider;

    public DefaultIncidenceRepository_Factory(Provider<IncidenceService> provider, Provider<IncidenceDao> provider2, Provider<IncidencePictureMapper> provider3, Provider<IncidenceMapper> provider4, Provider<PreferenceStorage> provider5, Provider<InterfaceC0307a> provider6) {
        this.incidenceServiceProvider = provider;
        this.incidenceDaoProvider = provider2;
        this.incidencePictureMapperProvider = provider3;
        this.incidenceMapperProvider = provider4;
        this.preferenceStorageProvider = provider5;
        this.appDispatcherProvider = provider6;
    }

    public static DefaultIncidenceRepository_Factory create(Provider<IncidenceService> provider, Provider<IncidenceDao> provider2, Provider<IncidencePictureMapper> provider3, Provider<IncidenceMapper> provider4, Provider<PreferenceStorage> provider5, Provider<InterfaceC0307a> provider6) {
        return new DefaultIncidenceRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DefaultIncidenceRepository newInstance(IncidenceService incidenceService, IncidenceDao incidenceDao, IncidencePictureMapper incidencePictureMapper, IncidenceMapper incidenceMapper, PreferenceStorage preferenceStorage, InterfaceC0307a interfaceC0307a) {
        return new DefaultIncidenceRepository(incidenceService, incidenceDao, incidencePictureMapper, incidenceMapper, preferenceStorage, interfaceC0307a);
    }

    @Override // javax.inject.Provider
    public DefaultIncidenceRepository get() {
        return newInstance(this.incidenceServiceProvider.get(), this.incidenceDaoProvider.get(), this.incidencePictureMapperProvider.get(), this.incidenceMapperProvider.get(), this.preferenceStorageProvider.get(), this.appDispatcherProvider.get());
    }
}
