package com.adif.elcanomovil.uiSubscriptions.create;

import c1.C0283c;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class SubscriptionCreationFragment_MembersInjector implements MembersInjector<SubscriptionCreationFragment> {
    private final Provider<C0283c> notificationsPermissionRequesterProvider;

    public SubscriptionCreationFragment_MembersInjector(Provider<C0283c> provider) {
        this.notificationsPermissionRequesterProvider = provider;
    }

    public static MembersInjector<SubscriptionCreationFragment> create(Provider<C0283c> provider) {
        return new SubscriptionCreationFragment_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment.notificationsPermissionRequester")
    public static void injectNotificationsPermissionRequester(SubscriptionCreationFragment subscriptionCreationFragment, C0283c c0283c) {
        subscriptionCreationFragment.notificationsPermissionRequester = c0283c;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SubscriptionCreationFragment subscriptionCreationFragment) {
        injectNotificationsPermissionRequester(subscriptionCreationFragment, this.notificationsPermissionRequesterProvider.get());
    }
}
