package com.adif.elcanomovil;

import android.icu.text.Collator;
import c1.C0283c;
import c1.C0284d;
import com.adif.elcanomovil.DaggerElcanoApplication_HiltComponents_SingletonC;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationIntents;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvideFirebaseMessagingFactory;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvidesDateFormatFactory;
import com.adif.elcanomovil.di.UseCases_ProvideCreateIncidenceUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetAppVersionUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetAvisaStationsCategoriesUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetAvisaStationsUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetClosestStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetCurrentOneStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetDistanceStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetFiltersUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetIncidenceDetailUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetIncidencesUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetLastVisitedStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetOnePathsUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetOneStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetRecentSearchesUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetRecentTrainSearchesUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetRelationStationsFavoritesUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetSeveralPathsUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetStationByNameUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetStationIsFavoriteUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetStationsObservationsUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetTrainIsFavoriteUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetTrainsFavoritesUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetVersionUpdateStatusUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideRemoveFavoriteStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideRemoveFavoriteTrainUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideSaveFavoriteStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideSaveFavoriteTrainUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideSaveFilterUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideSaveRecentSearchUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideSaveRecentTrainSearchUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideSetLastVisitedStationUseCaseFactory;
import com.adif.elcanomovil.domain.providers.AppVersionProvider;
import com.adif.elcanomovil.domain.providers.Check24hProvider;
import com.adif.elcanomovil.domain.providers.LocationProvider;
import com.adif.elcanomovil.domain.providers.LocationStatusProvider;
import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import com.adif.elcanomovil.domain.repositories.avisa.AvisaStationsRepository;
import com.adif.elcanomovil.domain.repositories.avisa.IncidenceRepository;
import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.repositories.filters.FiltersRepository;
import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.domain.repositories.stations.StationsObservationsRepository;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import com.adif.elcanomovil.domain.usecases.GetCirculationUpdateTimeUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetCompositionsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDepartureTypeTrainIsCercaniasUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDepartureTypeTrainIsCercaniasUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.SetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.SetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.ActiveSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.CreateSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.DeleteSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.GetSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.ModifySubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.MuteSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import com.adif.elcanomovil.main.BottomNavViewModel;
import com.adif.elcanomovil.main.MainViewModel;
import com.adif.elcanomovil.notifications.NotificationProvider;
import com.adif.elcanomovil.splash.SplashViewModel;
import com.adif.elcanomovil.uiAvisa.components.authenticator.AuthenticationProvider;
import com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewModel;
import com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsViewModel;
import com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeViewModel;
import com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel;
import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel;
import com.adif.elcanomovil.uiHome.HomeViewModel;
import com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper;
import com.adif.elcanomovil.uiMoreAdif.HelpItemsProvider;
import com.adif.elcanomovil.uiMoreAdif.OptionsProvider;
import com.adif.elcanomovil.uiMoreAdif.about.AboutViewModel;
import com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityViewModel;
import com.adif.elcanomovil.uiMoreAdif.help.HelpViewModel;
import com.adif.elcanomovil.uiMoreAdif.main.MoreAdifViewModel;
import com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel;
import com.adif.elcanomovil.uiSelectTrain.main.SelectTrainViewModel;
import com.adif.elcanomovil.uiStations.main.StationsPageActivitiesViewModel;
import com.adif.elcanomovil.uiStations.main.StationsPageCommercialViewModel;
import com.adif.elcanomovil.uiStations.main.StationsPageServicesViewModel;
import com.adif.elcanomovil.uiStations.main.StationsViewModel;
import com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel;
import com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeViewModel;
import com.adif.elcanomovil.uiTrain.di.TrainModule_ProvidesStepMapperFactory;
import com.adif.elcanomovil.uiTrain.di.TrainModule_ProvidesTrainInfoMapperFactory;
import com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel;
import com.adif.elcanomovil.widget.configuration.ConfigureWidgetViewModel;
import d1.InterfaceC0307a;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.Provider;

/* loaded from: classes.dex */
public final class d implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl f4456a;

    /* renamed from: b, reason: collision with root package name */
    public final DaggerElcanoApplication_HiltComponents_SingletonC.ViewModelCImpl f4457b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4458c;

    public d(DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl singletonCImpl, DaggerElcanoApplication_HiltComponents_SingletonC.ViewModelCImpl viewModelCImpl, int i) {
        this.f4456a = singletonCImpl;
        this.f4457b = viewModelCImpl;
        this.f4458c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        DaggerElcanoApplication_HiltComponents_SingletonC.ViewModelCImpl viewModelCImpl = this.f4457b;
        DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl singletonCImpl = this.f4456a;
        int i = this.f4458c;
        switch (i) {
            case 0:
                return new AboutViewModel(UseCases_ProvideGetAppVersionUseCaseFactory.provideGetAppVersionUseCase((AppVersionProvider) singletonCImpl.f4313F.get()));
            case 1:
                return new AccessibilityViewModel(UseCases_ProvideGetAppVersionUseCaseFactory.provideGetAppVersionUseCase((AppVersionProvider) singletonCImpl.f4313F.get()));
            case 2:
                return new AvisaHomeViewModel(UseCases_ProvideGetIncidencesUseCaseFactory.provideGetIncidencesUseCase((IncidenceRepository) singletonCImpl.f4314G.get()), UseCases_ProvideGetAvisaStationsUseCaseFactory.provideGetAvisaStationsUseCase((AvisaStationsRepository) singletonCImpl.f4315H.get()), UseCases_ProvideGetAvisaStationsCategoriesUseCaseFactory.provideGetAvisaStationsCategoriesUseCase((AvisaStationsRepository) singletonCImpl.f4315H.get()), (AuthenticationProvider) singletonCImpl.f4319M.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a));
            case 3:
                return new BottomNavViewModel(viewModelCImpl.f4382a, UseCases_ProvideGetVersionUpdateStatusUseCaseFactory.provideGetVersionUpdateStatusUseCase((AppVersionProvider) singletonCImpl.f4313F.get(), (RemoteConfigVersionRepository) singletonCImpl.f4338d.get()), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), singletonCImpl.f(), (d1.f) singletonCImpl.f4320N.get());
            case 4:
                return new CirculationsViewModel(UseCases_ProvideGetStationsObservationsUseCaseFactory.provideGetStationsObservationsUseCase((StationsObservationsRepository) singletonCImpl.f4321O.get()), (GetDepartureCirculationsUseCase) singletonCImpl.f4373w.get(), (GetLastDeparturesArrivalsStationUseCase) singletonCImpl.f4322P.get(), (SetLastDeparturesArrivalsStationUseCase) singletonCImpl.f4323Q.get(), (GetLastDeparturesArrivalsStationToUseCase) singletonCImpl.f4324R.get(), (GetLastDepartureTypeTrainIsCercaniasUseCase) singletonCImpl.f4325S.get(), (SetLastDeparturesArrivalsStationToUseCase) singletonCImpl.f4326T.get(), (SetLastDepartureTypeTrainIsCercaniasUseCase) singletonCImpl.f4327U.get(), UseCases_ProvideGetStationIsFavoriteUseCaseFactory.provideGetStationIsFavoriteUseCase((FavoritesRepository) singletonCImpl.f4328V.get()), UseCases_ProvideSaveFavoriteStationUseCaseFactory.provideSaveFavoriteStationUseCase((FavoritesRepository) singletonCImpl.f4328V.get()), UseCases_ProvideRemoveFavoriteStationUseCaseFactory.provideRemoveFavoriteStationUseCase((FavoritesRepository) singletonCImpl.f4328V.get()), singletonCImpl.b(), (DynamicLinkUseCase) singletonCImpl.f4330X.get(), (GetCirculationUpdateTimeUseCase) singletonCImpl.f4331Y.get(), UseCases_ProvideGetFiltersUseCaseFactory.provideGetFiltersUseCase((FiltersRepository) singletonCImpl.Z.get()), UseCases_ProvideSaveFilterUseCaseFactory.provideSaveFilterUseCase((FiltersRepository) singletonCImpl.Z.get()), singletonCImpl.f(), (ManageLogosUseCase) singletonCImpl.f4337c0.get());
            case 5:
                return new ConfigureWidgetViewModel(DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), singletonCImpl.b());
            case 6:
                return new DeparturesViewModel(singletonCImpl.b(), (GetLastDeparturesArrivalsStationUseCase) singletonCImpl.f4322P.get(), (GetLastDeparturesArrivalsStationToUseCase) singletonCImpl.f4324R.get(), (SetLastDeparturesArrivalsStationUseCase) singletonCImpl.f4323Q.get(), (SetLastDeparturesArrivalsStationToUseCase) singletonCImpl.f4326T.get(), (SetLastDepartureTypeTrainIsCercaniasUseCase) singletonCImpl.f4327U.get(), (TabDataHolder) singletonCImpl.f4339d0.get());
            case 7:
                return new HelpViewModel((HelpItemsProvider) singletonCImpl.f4341e0.get());
            case 8:
                return new HomeViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a), (GetHomeStationUseCase) singletonCImpl.f4311D.get(), (GetWorkStationUseCase) singletonCImpl.f4312E.get(), UseCases_ProvideGetClosestStationUseCaseFactory.provideGetClosestStationUseCase((LocationProvider) singletonCImpl.f4310C.get(), (StationsRepository) singletonCImpl.f4354m.get(), (Check24hProvider) singletonCImpl.f4356n.get()), (SetHomeStationUseCase) singletonCImpl.f4345g0.get(), (SetWorkStationUseCase) singletonCImpl.f4346h0.get(), UseCases_ProvideGetRelationStationsFavoritesUseCaseFactory.provideGetRelationStationsFavoritesUseCase((FavoritesRepository) singletonCImpl.f4328V.get()), UseCases_ProvideGetTrainsFavoritesUseCaseFactory.provideGetTrainsFavoritesUseCase((FavoritesRepository) singletonCImpl.f4328V.get()), (TabDataHolder) singletonCImpl.f4339d0.get(), (C0284d) singletonCImpl.f4347i0.get(), (UserFavoriteVOMapper) singletonCImpl.f4349j0.get(), (LocationStatusProvider) singletonCImpl.f4355m0.get());
            case 9:
                return new IssueDetailsViewModel(UseCases_ProvideGetIncidenceDetailUseCaseFactory.provideGetIncidenceDetailUseCase((IncidenceRepository) singletonCImpl.f4314G.get()), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a));
            case 10:
                return new MainViewModel(ApplicationModule_Companion_ProvideFirebaseMessagingFactory.provideFirebaseMessaging(), (DynamicLinkUseCase) singletonCImpl.f4330X.get(), (TabDataHolder) singletonCImpl.f4339d0.get(), (NotificationProvider) singletonCImpl.f4367t.get(), (MuteSubscriptionsUseCase) singletonCImpl.f4359o0.get(), (NavigationIntents) singletonCImpl.f4365s.get());
            case 11:
                return new MoreAdifViewModel((OptionsProvider) singletonCImpl.f4360p0.get());
            case 12:
                return new NewIssueViewModel(UseCases_ProvideCreateIncidenceUseCaseFactory.provideCreateIncidenceUseCase((IncidenceRepository) singletonCImpl.f4314G.get()), UseCases_ProvideGetAvisaStationsUseCaseFactory.provideGetAvisaStationsUseCase((AvisaStationsRepository) singletonCImpl.f4315H.get()), UseCases_ProvideGetAvisaStationsCategoriesUseCaseFactory.provideGetAvisaStationsCategoriesUseCase((AvisaStationsRepository) singletonCImpl.f4315H.get()), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a), (C0284d) singletonCImpl.f4347i0.get(), (InterfaceC0307a) singletonCImpl.h.get(), (d1.e) singletonCImpl.f4362q0.get(), (C0283c) singletonCImpl.f4309B.get());
            case 13:
                return new SelectStationViewModel(UseCases_ProvideSaveRecentSearchUseCaseFactory.provideSaveRecentSearchUseCase((SearchesRepository) singletonCImpl.f4364r0.get()), UseCases_ProvideGetClosestStationUseCaseFactory.provideGetClosestStationUseCase((LocationProvider) singletonCImpl.f4310C.get(), (StationsRepository) singletonCImpl.f4354m.get(), (Check24hProvider) singletonCImpl.f4356n.get()), (GetHomeStationUseCase) singletonCImpl.f4311D.get(), (GetWorkStationUseCase) singletonCImpl.f4312E.get(), UseCases_ProvideGetStationByNameUseCaseFactory.provideGetStationByNameUseCase((StationsRepository) singletonCImpl.f4354m.get()), UseCases_ProvideGetDistanceStationUseCaseFactory.provideGetDistanceStationUseCase((LocationProvider) singletonCImpl.f4310C.get(), UseCases_ProvideGetRecentSearchesUseCaseFactory.provideGetRecentSearchesUseCase((SearchesRepository) singletonCImpl.f4364r0.get(), singletonCImpl.b())), singletonCImpl.f(), (Collator) singletonCImpl.f4366s0.get());
            case 14:
                return new SelectTrainViewModel(UseCases_ProvideGetSeveralPathsUseCaseFactory.provideGetSeveralPathsUseCase((CirculationRepository) singletonCImpl.f4369u.get()), UseCases_ProvideGetRecentTrainSearchesUseCaseFactory.provideGetRecentTrainSearchesUseCase((SearchesRepository) singletonCImpl.f4364r0.get()), UseCases_ProvideSaveRecentTrainSearchUseCaseFactory.provideSaveRecentTrainSearchUseCase((SearchesRepository) singletonCImpl.f4364r0.get()), singletonCImpl.b(), viewModelCImpl.f4382a);
            case 15:
                return new SplashViewModel((AuthenticationProvider) singletonCImpl.f4319M.get());
            case 16:
                return new StationsPageActivitiesViewModel(UseCases_ProvideGetCurrentOneStationUseCaseFactory.provideGetCurrentOneStationUseCase((StationsRepository) singletonCImpl.f4354m.get()));
            case 17:
                return new StationsPageCommercialViewModel(UseCases_ProvideGetCurrentOneStationUseCaseFactory.provideGetCurrentOneStationUseCase((StationsRepository) singletonCImpl.f4354m.get()));
            case 18:
                return new StationsPageServicesViewModel(UseCases_ProvideGetCurrentOneStationUseCaseFactory.provideGetCurrentOneStationUseCase((StationsRepository) singletonCImpl.f4354m.get()), UseCases_ProvideSaveFavoriteStationUseCaseFactory.provideSaveFavoriteStationUseCase((FavoritesRepository) singletonCImpl.f4328V.get()), UseCases_ProvideGetStationIsFavoriteUseCaseFactory.provideGetStationIsFavoriteUseCase((FavoritesRepository) singletonCImpl.f4328V.get()), UseCases_ProvideRemoveFavoriteStationUseCaseFactory.provideRemoveFavoriteStationUseCase((FavoritesRepository) singletonCImpl.f4328V.get()));
            case 19:
                return new StationsViewModel(UseCases_ProvideGetOneStationUseCaseFactory.provideGetOneStationUseCase((StationsRepository) singletonCImpl.f4354m.get()), singletonCImpl.b(), UseCases_ProvideGetLastVisitedStationUseCaseFactory.provideGetLastVisitedStationUseCase((StationsRepository) singletonCImpl.f4354m.get()), UseCases_ProvideSetLastVisitedStationUseCaseFactory.provideSetLastVisitedStationUseCase((StationsRepository) singletonCImpl.f4354m.get()), (TabDataHolder) singletonCImpl.f4339d0.get());
            case 20:
                return new SubscriptionCreationViewModel((CreateSubscriptionsUseCase) singletonCImpl.f4368t0.get(), singletonCImpl.b(), (DeleteSubscriptionsUseCase) singletonCImpl.f4370u0.get(), (ModifySubscriptionsUseCase) singletonCImpl.f4372v0.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a));
            case 21:
                return new SubscriptionHomeViewModel((GetSubscriptionsUseCase) singletonCImpl.f4374w0.get(), (DeleteSubscriptionsUseCase) singletonCImpl.f4370u0.get(), (ActiveSubscriptionsUseCase) singletonCImpl.f4376x0.get(), (MuteSubscriptionsUseCase) singletonCImpl.f4359o0.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a));
            case 22:
                return new TrainSituationViewModel(singletonCImpl.f(), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), singletonCImpl.b(), UseCases_ProvideGetOnePathsUseCaseFactory.provideGetOnePathsUseCase((CirculationRepository) singletonCImpl.f4369u.get(), (RemoteConfigVersionRepository) singletonCImpl.f4338d.get()), (GetCompositionsUseCase) singletonCImpl.f4380z0.get(), TrainModule_ProvidesTrainInfoMapperFactory.providesTrainInfoMapper(), TrainModule_ProvidesStepMapperFactory.providesStepMapper(), ApplicationModule_Companion_ProvidesDateFormatFactory.providesDateFormat(), UseCases_ProvideRemoveFavoriteTrainUseCaseFactory.provideRemoveFavoriteTrainUseCase((FavoritesRepository) singletonCImpl.f4328V.get()), UseCases_ProvideGetTrainIsFavoriteUseCaseFactory.provideGetTrainIsFavoriteUseCase((FavoritesRepository) singletonCImpl.f4328V.get()), UseCases_ProvideSaveFavoriteTrainUseCaseFactory.provideSaveFavoriteTrainUseCase((FavoritesRepository) singletonCImpl.f4328V.get()), (DynamicLinkUseCase) singletonCImpl.f4330X.get(), UseCases_ProvideGetFiltersUseCaseFactory.provideGetFiltersUseCase((FiltersRepository) singletonCImpl.Z.get()), UseCases_ProvideSaveFilterUseCaseFactory.provideSaveFilterUseCase((FiltersRepository) singletonCImpl.Z.get()), (TabDataHolder) singletonCImpl.f4339d0.get());
            default:
                throw new AssertionError(i);
        }
    }
}
