package com.adif.elcanomovil.repositories.stations;

import android.content.Context;
import com.adif.elcanomovil.serviceNetworking.stations.StationsService;
import com.adif.elcanomovil.serviceStorage.database.StationsDao;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import d1.InterfaceC0307a;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes.dex */
public final class DefaultStationsRepository_Factory implements Factory<DefaultStationsRepository> {
    private final Provider<InterfaceC0307a> appDispatcherProvider;
    private final Provider<Context> contextProvider;
    private final Provider<StationMapper> stationMapperProvider;
    private final Provider<StationsDao> stationsDaoProvider;
    private final Provider<StationsService> stationsServiceProvider;
    private final Provider<PreferenceStorage> storageProvider;

    public DefaultStationsRepository_Factory(Provider<StationsService> provider, Provider<StationsDao> provider2, Provider<StationMapper> provider3, Provider<PreferenceStorage> provider4, Provider<Context> provider5, Provider<InterfaceC0307a> provider6) {
        this.stationsServiceProvider = provider;
        this.stationsDaoProvider = provider2;
        this.stationMapperProvider = provider3;
        this.storageProvider = provider4;
        this.contextProvider = provider5;
        this.appDispatcherProvider = provider6;
    }

    public static DefaultStationsRepository_Factory create(Provider<StationsService> provider, Provider<StationsDao> provider2, Provider<StationMapper> provider3, Provider<PreferenceStorage> provider4, Provider<Context> provider5, Provider<InterfaceC0307a> provider6) {
        return new DefaultStationsRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DefaultStationsRepository newInstance(StationsService stationsService, StationsDao stationsDao, StationMapper stationMapper, PreferenceStorage preferenceStorage, Context context, InterfaceC0307a interfaceC0307a) {
        return new DefaultStationsRepository(stationsService, stationsDao, stationMapper, preferenceStorage, context, interfaceC0307a);
    }

    @Override // javax.inject.Provider
    public DefaultStationsRepository get() {
        return newInstance(this.stationsServiceProvider.get(), this.stationsDaoProvider.get(), this.stationMapperProvider.get(), this.storageProvider.get(), this.contextProvider.get(), this.appDispatcherProvider.get());
    }
}
