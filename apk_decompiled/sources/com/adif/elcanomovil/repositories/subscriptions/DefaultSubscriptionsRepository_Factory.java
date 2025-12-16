package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.serviceNetworking.subscriptions.SubscriptionsService;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsAuxDataDao;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao;
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
public final class DefaultSubscriptionsRepository_Factory implements Factory<DefaultSubscriptionsRepository> {
    private final Provider<InterfaceC0307a> appDispatcherProvider;
    private final Provider<PreferenceStorage> preferenceStorageProvider;
    private final Provider<SubscriptionMapper> subscriptionMapperProvider;
    private final Provider<SubscriptionsAuxDataDao> subscriptionsAuxDataDaoProvider;
    private final Provider<SubscriptionsDao> subscriptionsDaoProvider;
    private final Provider<SubscriptionsService> subscriptionsServiceProvider;

    public DefaultSubscriptionsRepository_Factory(Provider<SubscriptionsService> provider, Provider<SubscriptionMapper> provider2, Provider<PreferenceStorage> provider3, Provider<SubscriptionsDao> provider4, Provider<SubscriptionsAuxDataDao> provider5, Provider<InterfaceC0307a> provider6) {
        this.subscriptionsServiceProvider = provider;
        this.subscriptionMapperProvider = provider2;
        this.preferenceStorageProvider = provider3;
        this.subscriptionsDaoProvider = provider4;
        this.subscriptionsAuxDataDaoProvider = provider5;
        this.appDispatcherProvider = provider6;
    }

    public static DefaultSubscriptionsRepository_Factory create(Provider<SubscriptionsService> provider, Provider<SubscriptionMapper> provider2, Provider<PreferenceStorage> provider3, Provider<SubscriptionsDao> provider4, Provider<SubscriptionsAuxDataDao> provider5, Provider<InterfaceC0307a> provider6) {
        return new DefaultSubscriptionsRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DefaultSubscriptionsRepository newInstance(SubscriptionsService subscriptionsService, SubscriptionMapper subscriptionMapper, PreferenceStorage preferenceStorage, SubscriptionsDao subscriptionsDao, SubscriptionsAuxDataDao subscriptionsAuxDataDao, InterfaceC0307a interfaceC0307a) {
        return new DefaultSubscriptionsRepository(subscriptionsService, subscriptionMapper, preferenceStorage, subscriptionsDao, subscriptionsAuxDataDao, interfaceC0307a);
    }

    @Override // javax.inject.Provider
    public DefaultSubscriptionsRepository get() {
        return newInstance(this.subscriptionsServiceProvider.get(), this.subscriptionMapperProvider.get(), this.preferenceStorageProvider.get(), this.subscriptionsDaoProvider.get(), this.subscriptionsAuxDataDaoProvider.get(), this.appDispatcherProvider.get());
    }
}
