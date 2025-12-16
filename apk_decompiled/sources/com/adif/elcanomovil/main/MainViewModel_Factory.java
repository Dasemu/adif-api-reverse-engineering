package com.adif.elcanomovil.main;

import com.adif.elcanomovil.commonNavGraph.navigation.NavigationIntents;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.MuteSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import com.adif.elcanomovil.notifications.NotificationProvider;
import com.google.firebase.messaging.FirebaseMessaging;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class MainViewModel_Factory implements Factory<MainViewModel> {
    private final Provider<DynamicLinkUseCase> dynamicLinkUseCaseProvider;
    private final Provider<FirebaseMessaging> firebaseMessagingProvider;
    private final Provider<MuteSubscriptionsUseCase> muteSubscriptionsUseCaseProvider;
    private final Provider<NavigationIntents> navigationIntentsProvider;
    private final Provider<NotificationProvider> notificationProvider;
    private final Provider<TabDataHolder> tabDataHolderProvider;

    public MainViewModel_Factory(Provider<FirebaseMessaging> provider, Provider<DynamicLinkUseCase> provider2, Provider<TabDataHolder> provider3, Provider<NotificationProvider> provider4, Provider<MuteSubscriptionsUseCase> provider5, Provider<NavigationIntents> provider6) {
        this.firebaseMessagingProvider = provider;
        this.dynamicLinkUseCaseProvider = provider2;
        this.tabDataHolderProvider = provider3;
        this.notificationProvider = provider4;
        this.muteSubscriptionsUseCaseProvider = provider5;
        this.navigationIntentsProvider = provider6;
    }

    public static MainViewModel_Factory create(Provider<FirebaseMessaging> provider, Provider<DynamicLinkUseCase> provider2, Provider<TabDataHolder> provider3, Provider<NotificationProvider> provider4, Provider<MuteSubscriptionsUseCase> provider5, Provider<NavigationIntents> provider6) {
        return new MainViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static MainViewModel newInstance(FirebaseMessaging firebaseMessaging, DynamicLinkUseCase dynamicLinkUseCase, TabDataHolder tabDataHolder, NotificationProvider notificationProvider, MuteSubscriptionsUseCase muteSubscriptionsUseCase, NavigationIntents navigationIntents) {
        return new MainViewModel(firebaseMessaging, dynamicLinkUseCase, tabDataHolder, notificationProvider, muteSubscriptionsUseCase, navigationIntents);
    }

    @Override // javax.inject.Provider
    public MainViewModel get() {
        return newInstance(this.firebaseMessagingProvider.get(), this.dynamicLinkUseCaseProvider.get(), this.tabDataHolderProvider.get(), this.notificationProvider.get(), this.muteSubscriptionsUseCaseProvider.get(), this.navigationIntentsProvider.get());
    }
}
