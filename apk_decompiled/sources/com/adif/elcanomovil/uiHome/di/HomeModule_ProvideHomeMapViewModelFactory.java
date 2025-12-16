package com.adif.elcanomovil.uiHome.di;

import android.content.Context;
import com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationsForRegionUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.user.GetUserLastLocationUseCase;
import com.adif.elcanomovil.uiHome.views.HomeMapViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes2.dex */
public final class HomeModule_ProvideHomeMapViewModelFactory implements Factory<HomeMapViewModel> {
    private final Provider<Context> contextProvider;
    private final Provider<GetHomeStationUseCase> getHomeStationUseCaseProvider;
    private final Provider<GetStationsForRegionUseCase> getStationsUseCaseProvider;
    private final Provider<GetUserLastLocationUseCase> getUserLastLocationUseCaseProvider;
    private final Provider<GetWorkStationUseCase> getWorkStationUseCaseProvider;

    public HomeModule_ProvideHomeMapViewModelFactory(Provider<Context> provider, Provider<GetStationsForRegionUseCase> provider2, Provider<GetUserLastLocationUseCase> provider3, Provider<GetHomeStationUseCase> provider4, Provider<GetWorkStationUseCase> provider5) {
        this.contextProvider = provider;
        this.getStationsUseCaseProvider = provider2;
        this.getUserLastLocationUseCaseProvider = provider3;
        this.getHomeStationUseCaseProvider = provider4;
        this.getWorkStationUseCaseProvider = provider5;
    }

    public static HomeModule_ProvideHomeMapViewModelFactory create(Provider<Context> provider, Provider<GetStationsForRegionUseCase> provider2, Provider<GetUserLastLocationUseCase> provider3, Provider<GetHomeStationUseCase> provider4, Provider<GetWorkStationUseCase> provider5) {
        return new HomeModule_ProvideHomeMapViewModelFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static HomeMapViewModel provideHomeMapViewModel(Context context, GetStationsForRegionUseCase getStationsForRegionUseCase, GetUserLastLocationUseCase getUserLastLocationUseCase, GetHomeStationUseCase getHomeStationUseCase, GetWorkStationUseCase getWorkStationUseCase) {
        return (HomeMapViewModel) Preconditions.checkNotNullFromProvides(HomeModule.INSTANCE.provideHomeMapViewModel(context, getStationsForRegionUseCase, getUserLastLocationUseCase, getHomeStationUseCase, getWorkStationUseCase));
    }

    @Override // javax.inject.Provider
    public HomeMapViewModel get() {
        return provideHomeMapViewModel(this.contextProvider.get(), this.getStationsUseCaseProvider.get(), this.getUserLastLocationUseCaseProvider.get(), this.getHomeStationUseCaseProvider.get(), this.getWorkStationUseCaseProvider.get());
    }
}
