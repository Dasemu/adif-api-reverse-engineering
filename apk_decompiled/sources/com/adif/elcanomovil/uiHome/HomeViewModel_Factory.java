package com.adif.elcanomovil.uiHome;

import android.content.Context;
import c1.C0284d;
import com.adif.elcanomovil.domain.providers.LocationStatusProvider;
import com.adif.elcanomovil.domain.usecases.favorites.GetRelationStationsFavoritesUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.GetTrainsFavoritesUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.SetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.SetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes2.dex */
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
    private final Provider<Context> contextProvider;
    private final Provider<GetClosestStationUseCase> getClosestStationUseCaseProvider;
    private final Provider<GetHomeStationUseCase> getHomeStationUseCaseProvider;
    private final Provider<GetRelationStationsFavoritesUseCase> getRelationFavoritesUseCaseProvider;
    private final Provider<GetTrainsFavoritesUseCase> getTrainsFavoritesUseCaseProvider;
    private final Provider<GetWorkStationUseCase> getWorkStationUseCaseProvider;
    private final Provider<LocationStatusProvider> locationStatusProvider;
    private final Provider<C0284d> permissionHelperProvider;
    private final Provider<SetHomeStationUseCase> setHomeStationUseCaseProvider;
    private final Provider<SetWorkStationUseCase> setWorkStationUseCaseProvider;
    private final Provider<TabDataHolder> tabDataHolderProvider;
    private final Provider<UserFavoriteVOMapper> userFavoriteVOMapperProvider;

    public HomeViewModel_Factory(Provider<Context> provider, Provider<GetHomeStationUseCase> provider2, Provider<GetWorkStationUseCase> provider3, Provider<GetClosestStationUseCase> provider4, Provider<SetHomeStationUseCase> provider5, Provider<SetWorkStationUseCase> provider6, Provider<GetRelationStationsFavoritesUseCase> provider7, Provider<GetTrainsFavoritesUseCase> provider8, Provider<TabDataHolder> provider9, Provider<C0284d> provider10, Provider<UserFavoriteVOMapper> provider11, Provider<LocationStatusProvider> provider12) {
        this.contextProvider = provider;
        this.getHomeStationUseCaseProvider = provider2;
        this.getWorkStationUseCaseProvider = provider3;
        this.getClosestStationUseCaseProvider = provider4;
        this.setHomeStationUseCaseProvider = provider5;
        this.setWorkStationUseCaseProvider = provider6;
        this.getRelationFavoritesUseCaseProvider = provider7;
        this.getTrainsFavoritesUseCaseProvider = provider8;
        this.tabDataHolderProvider = provider9;
        this.permissionHelperProvider = provider10;
        this.userFavoriteVOMapperProvider = provider11;
        this.locationStatusProvider = provider12;
    }

    public static HomeViewModel_Factory create(Provider<Context> provider, Provider<GetHomeStationUseCase> provider2, Provider<GetWorkStationUseCase> provider3, Provider<GetClosestStationUseCase> provider4, Provider<SetHomeStationUseCase> provider5, Provider<SetWorkStationUseCase> provider6, Provider<GetRelationStationsFavoritesUseCase> provider7, Provider<GetTrainsFavoritesUseCase> provider8, Provider<TabDataHolder> provider9, Provider<C0284d> provider10, Provider<UserFavoriteVOMapper> provider11, Provider<LocationStatusProvider> provider12) {
        return new HomeViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static HomeViewModel newInstance(Context context, GetHomeStationUseCase getHomeStationUseCase, GetWorkStationUseCase getWorkStationUseCase, GetClosestStationUseCase getClosestStationUseCase, SetHomeStationUseCase setHomeStationUseCase, SetWorkStationUseCase setWorkStationUseCase, GetRelationStationsFavoritesUseCase getRelationStationsFavoritesUseCase, GetTrainsFavoritesUseCase getTrainsFavoritesUseCase, TabDataHolder tabDataHolder, C0284d c0284d, UserFavoriteVOMapper userFavoriteVOMapper, LocationStatusProvider locationStatusProvider) {
        return new HomeViewModel(context, getHomeStationUseCase, getWorkStationUseCase, getClosestStationUseCase, setHomeStationUseCase, setWorkStationUseCase, getRelationStationsFavoritesUseCase, getTrainsFavoritesUseCase, tabDataHolder, c0284d, userFavoriteVOMapper, locationStatusProvider);
    }

    @Override // javax.inject.Provider
    public HomeViewModel get() {
        return newInstance(this.contextProvider.get(), this.getHomeStationUseCaseProvider.get(), this.getWorkStationUseCaseProvider.get(), this.getClosestStationUseCaseProvider.get(), this.setHomeStationUseCaseProvider.get(), this.setWorkStationUseCaseProvider.get(), this.getRelationFavoritesUseCaseProvider.get(), this.getTrainsFavoritesUseCaseProvider.get(), this.tabDataHolderProvider.get(), this.permissionHelperProvider.get(), this.userFavoriteVOMapperProvider.get(), this.locationStatusProvider.get());
    }
}
