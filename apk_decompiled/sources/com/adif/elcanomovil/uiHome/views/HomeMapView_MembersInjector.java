package com.adif.elcanomovil.uiHome.views;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class HomeMapView_MembersInjector implements MembersInjector<HomeMapView> {
    private final Provider<HomeMapViewModel> viewModelProvider;

    public HomeMapView_MembersInjector(Provider<HomeMapViewModel> provider) {
        this.viewModelProvider = provider;
    }

    public static MembersInjector<HomeMapView> create(Provider<HomeMapViewModel> provider) {
        return new HomeMapView_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.adif.elcanomovil.uiHome.views.HomeMapView.viewModel")
    public static void injectViewModel(HomeMapView homeMapView, HomeMapViewModel homeMapViewModel) {
        homeMapView.viewModel = homeMapViewModel;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HomeMapView homeMapView) {
        injectViewModel(homeMapView, this.viewModelProvider.get());
    }
}
