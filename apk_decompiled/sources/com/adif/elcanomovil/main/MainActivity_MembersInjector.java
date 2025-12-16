package com.adif.elcanomovil.main;

import c1.C0283c;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
    private final Provider<C0283c> notificationsPermissionRequesterProvider;

    public MainActivity_MembersInjector(Provider<C0283c> provider) {
        this.notificationsPermissionRequesterProvider = provider;
    }

    public static MembersInjector<MainActivity> create(Provider<C0283c> provider) {
        return new MainActivity_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.adif.elcanomovil.main.MainActivity.notificationsPermissionRequester")
    public static void injectNotificationsPermissionRequester(MainActivity mainActivity, C0283c c0283c) {
        mainActivity.notificationsPermissionRequester = c0283c;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MainActivity mainActivity) {
        injectNotificationsPermissionRequester(mainActivity, this.notificationsPermissionRequesterProvider.get());
    }
}
