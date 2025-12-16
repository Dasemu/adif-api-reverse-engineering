package com.adif.elcanomovil;

import android.net.ConnectivityManager;
import c1.C0283c;
import com.adif.commonHelpers.di.CommonHelpersModule;
import com.adif.elcanomovil.DaggerElcanoApplication_HiltComponents_SingletonC;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationIntents;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvideApplicationObserverFactory;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvideAuthtenticationProviderFactory;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvideFirebaseCrashlyticsFactory;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvideLifeCicleProviderFactory;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvideLoggerObserverFactory;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvideNotificationPayloadHandlerFactory;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvideRemoteConfigurationObserverFactory;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvideUpdateStationsObserverFactory;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvideWidgetPayloadHandlerFactory;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvidesDateFormatFactory;
import com.adif.elcanomovil.di.UseCases_ProvideActiveSubscriptionsUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideCreateSubscriptionsdUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideDeleteSubscriptionsdUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideFetchVersionUpdateUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGenerateDynamicLinkFacadeFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGenerateDynamicLinkUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGeneratePasswordUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGeneratePersistentUserIdUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGenerateUserIdUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetBetweenStationsUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetCirculationUpdateTimeUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetCompositionsUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetDepartureCirculationsUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetHomeStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetLastDepartureTypeTrainIsCercaniasUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetLastDeparturesArrivalsStationToUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetLastDeparturesArrivalsStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetStationArrivalsUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetStationDeparturesUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetStationsForRegionUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetStationsUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetSubscriptionsdUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetUserLastLocationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetWorkStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideLoginAvisaUserUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideManageLogosUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideModifySubscriptionsdUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideMuteSubscriptionsdUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideRefreshAvisaUserUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideRegisterAvisaUserUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideSetHomeStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideSetLastDepartureTypeTrainIsCercaniasUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideSetLastDeparturesArrivalsStationToUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideSetLastDeparturesArrivalsStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideSetWorkStationUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideTabDataHolderFactory;
import com.adif.elcanomovil.domain.providers.Check24hProvider;
import com.adif.elcanomovil.domain.providers.CredentialsProvider;
import com.adif.elcanomovil.domain.providers.DynamicLinkFacade;
import com.adif.elcanomovil.domain.providers.LocationProvider;
import com.adif.elcanomovil.domain.providers.LogoProvider;
import com.adif.elcanomovil.domain.providers.PushIdTokenProvider;
import com.adif.elcanomovil.domain.providers.TokenJwtProvider;
import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository;
import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.repositories.compositions.CompositionsRepository;
import com.adif.elcanomovil.domain.repositories.linecolours.LineColoursRepository;
import com.adif.elcanomovil.domain.repositories.logos.LogosInfoRepository;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository;
import com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePasswordUseCase;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePersistentUserIdUseCase;
import com.adif.elcanomovil.domain.usecases.credentials.GenerateUserIdUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase;
import com.adif.elcanomovil.notifications.DefaultNotificationProvider;
import com.adif.elcanomovil.notifications.NotificationPayloadHandler;
import com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository;
import com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideAppVersionProviderFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideAvisaLoginRepositoryFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideAvisaStationCategoryMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideAvisaStationMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideCheck24hProviderFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideCirculationMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideCirculationRepositoryFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideCompositionsMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideCompositionsRepositoryFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideCredentialsProviderFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideFavouritesRepositoryFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideFiltersRepositoryFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideFirebaseDynamicLinkFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideFirebaseRemoteConfigFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideFusedLocationProviderClientFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideIncidenceMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideIncidencePictureMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideLineColoursRepositoryFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideLogoProviderFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideLogosInfoRepositoryFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvidePushIdTokenProviderFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideRemoteConfigVersionRepositoryFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideSearchesRepositoryFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideStationMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideStationObservationsMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideStationsObservationsRepositoryFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideSubscriptionMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideTokenJwtProviderFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvideTokenMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvidesFavoritableMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvidesFavoritableTrainMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvidesSearchesMapperFactory;
import com.adif.elcanomovil.repositories.di.RepositoryModule_Companion_ProvidesTrainSearchesMapperFactory;
import com.adif.elcanomovil.repositories.providers.DefaultLocationProvider;
import com.adif.elcanomovil.repositories.providers.DefaultLocationStatusProvider;
import com.adif.elcanomovil.repositories.stations.DefaultStationsRepository;
import com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository;
import com.adif.elcanomovil.serviceNetworking.di.FirebaseStorageModule_ProvideFirebaseStorageFactory;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule_ProvideAvisaLoginServiceFactory;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule_ProvideAvisaStationsServiceFactory;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule_ProvideCertificatePinnerFactory;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule_ProvideCirculationServiceFactory;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule_ProvideIncidenceServiceFactory;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule_ProvideOkHttpClientFactory;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule_ProvideStationObservationsServiceFactory;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule_ProvideStationsServiceFactory;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule_ProvideSubscriptionServiceFactory;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule_ProvideTrainCompositionServiceFactory;
import com.adif.elcanomovil.serviceNetworking.pinning.PinningRemoteDataSource;
import com.adif.elcanomovil.serviceNetworking.pinning.PinningRepository;
import com.adif.elcanomovil.serviceStorage.di.StorageModule_ProvideAvisaStationDaoFactory;
import com.adif.elcanomovil.serviceStorage.di.StorageModule_ProvideFavouritesDaoFactory;
import com.adif.elcanomovil.serviceStorage.di.StorageModule_ProvideIncidenceDaoFactory;
import com.adif.elcanomovil.serviceStorage.di.StorageModule_ProvideStationsDaoFactory;
import com.adif.elcanomovil.serviceStorage.di.StorageModule_ProvideSubscriptionAuxDataDaoFactory;
import com.adif.elcanomovil.serviceStorage.di.StorageModule_ProvideSubscriptionDaoFactory;
import com.adif.elcanomovil.uiDepartures.di.DepartureModule_DateFormatterFactory;
import com.adif.elcanomovil.uiDepartures.di.DepartureModule_ProvidesAvldmdCirculationMapperFactory;
import com.adif.elcanomovil.uiDepartures.di.DepartureModule_ProvidesCirculationMapperFactory;
import com.adif.elcanomovil.uiDepartures.di.DepartureModule_ProvidesOtherCirculationMapperFactory;
import com.adif.elcanomovil.uiHome.di.HomeModule_ProvideHomeMapViewModelFactory;
import com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper;
import com.adif.elcanomovil.uiMoreAdif.di.MoreAdifModule_ProvideHelpItemsProviderFactory;
import com.adif.elcanomovil.uiMoreAdif.di.MoreAdifModule_ProvideOptionsProviderFactory;
import com.adif.elcanomovil.uiSelectStation.di.SelectedStationModule_ProvidesCollatorFactory;
import com.adif.elcanomovil.widget.DeparturesWidgetView;
import com.adif.elcanomovil.widget.DeparturesWidgetViewModel;
import com.adif.elcanomovil.widget.di.WidgetsModule_ProvideConnectivityManagerFactory;
import com.adif.elcanomovil.widget.domain.usecases.GetWidgetInfoUseCase;
import com.google.firebase.storage.FirebaseStorage;
import d1.C0309c;
import d1.InterfaceC0307a;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import e3.C0322h;

/* loaded from: classes.dex */
public final class c implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl f4404a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4405b;

    public c(DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl singletonCImpl, int i) {
        this.f4404a = singletonCImpl;
        this.f4405b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [d1.i, java.lang.Object] */
    @Override // javax.inject.Provider
    public final Object get() {
        DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl singletonCImpl = this.f4404a;
        int i = this.f4405b;
        switch (i) {
            case 0:
                singletonCImpl.getClass();
                return ApplicationModule_Companion_ProvideApplicationObserverFactory.provideApplicationObserver(ApplicationModule_Companion_ProvideLoggerObserverFactory.provideLoggerObserver(ApplicationModule_Companion_ProvideFirebaseCrashlyticsFactory.provideFirebaseCrashlytics()), ApplicationModule_Companion_ProvideRemoteConfigurationObserverFactory.provideRemoteConfigurationObserver(UseCases_ProvideFetchVersionUpdateUseCaseFactory.provideFetchVersionUpdateUseCase((RemoteConfigVersionRepository) singletonCImpl.f4338d.get())), ApplicationModule_Companion_ProvideUpdateStationsObserverFactory.provideUpdateStationsObserver(UseCases_ProvideGetStationsUseCaseFactory.provideGetStationsUseCase((StationsRepository) singletonCImpl.f4354m.get(), (Check24hProvider) singletonCImpl.f4356n.get())));
            case 1:
                return RepositoryModule_Companion_ProvideRemoteConfigVersionRepositoryFactory.provideRemoteConfigVersionRepository(RepositoryModule_Companion_ProvideFirebaseRemoteConfigFactory.provideFirebaseRemoteConfig(), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl));
            case 2:
                return new DefaultStationsRepository(NetworkModule_ProvideStationsServiceFactory.provideStationsService(singletonCImpl.d(), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.c()), StorageModule_ProvideStationsDaoFactory.provideStationsDao(singletonCImpl.e()), RepositoryModule_Companion_ProvideStationMapperFactory.provideStationMapper(), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a), (InterfaceC0307a) singletonCImpl.h.get());
            case 3:
                return UseCases_ProvideGeneratePersistentUserIdUseCaseFactory.provideGeneratePersistentUserIdUseCase((CredentialsProvider) singletonCImpl.f4340e.get());
            case 4:
                return RepositoryModule_Companion_ProvideCredentialsProviderFactory.provideCredentialsProvider(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a));
            case 5:
                return NetworkModule_ProvideCertificatePinnerFactory.provideCertificatePinner((PinningRepository) singletonCImpl.f4350k.get());
            case 6:
                return new PinningRepository((PinningRemoteDataSource) singletonCImpl.i.get(), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), (C0309c) singletonCImpl.f4348j.get());
            case 7:
                return new PinningRemoteDataSource((FirebaseStorage) singletonCImpl.f4344g.get(), (InterfaceC0307a) singletonCImpl.h.get());
            case 8:
                return FirebaseStorageModule_ProvideFirebaseStorageFactory.provideFirebaseStorage();
            case 9:
                return (InterfaceC0307a) Preconditions.checkNotNullFromProvides(CommonHelpersModule.INSTANCE.provideAppDispatcher());
            case 10:
                return new Object();
            case 11:
                return RepositoryModule_Companion_ProvideCheck24hProviderFactory.provideCheck24hProvider(DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl));
            case 12:
                return ApplicationModule_Companion_ProvideLifeCicleProviderFactory.provideLifeCicleProvider();
            case 13:
                return RepositoryModule_Companion_ProvidePushIdTokenProviderFactory.providePushIdTokenProvider(DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl));
            case 14:
                return new DefaultNotificationProvider(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a), (NotificationPayloadHandler) singletonCImpl.f4363r.get(), (NavigationIntents) singletonCImpl.f4365s.get());
            case 15:
                return ApplicationModule_Companion_ProvideNotificationPayloadHandlerFactory.provideNotificationPayloadHandler();
            case 16:
                return new NavigationIntents(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a));
            case 17:
                return new DeparturesWidgetViewModel((GetDepartureCirculationsUseCase) singletonCImpl.f4373w.get(), singletonCImpl.b(), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), new DeparturesWidgetView(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a), (NavigationIntents) singletonCImpl.f4365s.get()), (InterfaceC0307a) singletonCImpl.h.get(), new Object(), (X0.a) singletonCImpl.f4377y.get(), new GetWidgetInfoUseCase(singletonCImpl.b()));
            case 18:
                return UseCases_ProvideGetDepartureCirculationsUseCaseFactory.provideGetDepartureCirculationsUseCase(UseCases_ProvideGetStationArrivalsUseCaseFactory.provideGetStationArrivalsUseCase((CirculationRepository) singletonCImpl.f4369u.get()), UseCases_ProvideGetStationDeparturesUseCaseFactory.provideGetStationDeparturesUseCase((CirculationRepository) singletonCImpl.f4369u.get()), UseCases_ProvideGetBetweenStationsUseCaseFactory.provideGetBetweenStationsUseCase((CirculationRepository) singletonCImpl.f4369u.get()), DepartureModule_ProvidesCirculationMapperFactory.providesCirculationMapper(DepartureModule_DateFormatterFactory.dateFormatter(), (LineColoursRepository) singletonCImpl.f4371v.get()), DepartureModule_ProvidesAvldmdCirculationMapperFactory.providesAvldmdCirculationMapper(DepartureModule_DateFormatterFactory.dateFormatter()), DepartureModule_ProvidesOtherCirculationMapperFactory.providesOtherCirculationMapper(DepartureModule_DateFormatterFactory.dateFormatter()), ApplicationModule_Companion_ProvidesDateFormatFactory.providesDateFormat());
            case 19:
                return RepositoryModule_Companion_ProvideCirculationRepositoryFactory.provideCirculationRepository(NetworkModule_ProvideCirculationServiceFactory.provideCirculationService(singletonCImpl.d(), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.c()), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), RepositoryModule_Companion_ProvideCirculationMapperFactory.provideCirculationMapper());
            case 20:
                return RepositoryModule_Companion_ProvideLineColoursRepositoryFactory.provideLineColoursRepository(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a), (StationsRepository) singletonCImpl.f4354m.get());
            case 21:
                return new X0.a((ConnectivityManager) singletonCImpl.f4375x.get());
            case 22:
                return WidgetsModule_ProvideConnectivityManagerFactory.provideConnectivityManager(singletonCImpl.f4334b, ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a));
            case 23:
                return ApplicationModule_Companion_ProvideWidgetPayloadHandlerFactory.provideWidgetPayloadHandler();
            case 24:
                return new C0283c();
            case 25:
                return new DefaultLocationProvider(RepositoryModule_Companion_ProvideFusedLocationProviderClientFactory.provideFusedLocationProviderClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a)), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a));
            case 26:
                return UseCases_ProvideGetHomeStationUseCaseFactory.provideGetHomeStationUseCase((StationsRepository) singletonCImpl.f4354m.get());
            case 27:
                return UseCases_ProvideGetWorkStationUseCaseFactory.provideGetWorkStationUseCase((StationsRepository) singletonCImpl.f4354m.get());
            case 28:
                return RepositoryModule_Companion_ProvideAppVersionProviderFactory.provideAppVersionProvider(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a));
            case 29:
                return new DefaultIncidenceRepository(NetworkModule_ProvideIncidenceServiceFactory.provideIncidenceService(NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient((C0322h) singletonCImpl.f4352l.get()), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.c()), StorageModule_ProvideIncidenceDaoFactory.provideIncidenceDao(singletonCImpl.e()), RepositoryModule_Companion_ProvideIncidencePictureMapperFactory.provideIncidencePictureMapper(), RepositoryModule_Companion_ProvideIncidenceMapperFactory.provideIncidenceMapper(), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), (InterfaceC0307a) singletonCImpl.h.get());
            case 30:
                return new DefaultAvisaStationsRepository(NetworkModule_ProvideAvisaStationsServiceFactory.provideAvisaStationsService(NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient((C0322h) singletonCImpl.f4352l.get()), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.c()), StorageModule_ProvideAvisaStationDaoFactory.provideAvisaStationDao(singletonCImpl.e()), RepositoryModule_Companion_ProvideAvisaStationMapperFactory.provideAvisaStationMapper(), RepositoryModule_Companion_ProvideAvisaStationCategoryMapperFactory.provideAvisaStationCategoryMapper(), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), (InterfaceC0307a) singletonCImpl.h.get());
            case 31:
                return ApplicationModule_Companion_ProvideAuthtenticationProviderFactory.provideAuthtenticationProvider(UseCases_ProvideRegisterAvisaUserUseCaseFactory.provideRegisterAvisaUserUseCase((AvisaLoginRepository) singletonCImpl.f4316I.get(), (GeneratePasswordUseCase) singletonCImpl.J.get(), (GenerateUserIdUseCase) singletonCImpl.f4317K.get(), (GeneratePersistentUserIdUseCase) singletonCImpl.f4342f.get(), (PushIdTokenProvider) singletonCImpl.f4361q.get(), (TokenJwtProvider) singletonCImpl.f4318L.get()), UseCases_ProvideLoginAvisaUserUseCaseFactory.provideLoginAvisaUserUseCase((AvisaLoginRepository) singletonCImpl.f4316I.get(), (GeneratePasswordUseCase) singletonCImpl.J.get(), (GenerateUserIdUseCase) singletonCImpl.f4317K.get()), UseCases_ProvideRefreshAvisaUserUseCaseFactory.provideRefreshAvisaUserUseCase((AvisaLoginRepository) singletonCImpl.f4316I.get()), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl));
            case 32:
                return RepositoryModule_Companion_ProvideAvisaLoginRepositoryFactory.provideAvisaLoginRepository(NetworkModule_ProvideAvisaLoginServiceFactory.provideAvisaLoginService(NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient((C0322h) singletonCImpl.f4352l.get()), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.c()), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), RepositoryModule_Companion_ProvideTokenMapperFactory.provideTokenMapper());
            case 33:
                return UseCases_ProvideGeneratePasswordUseCaseFactory.provideGeneratePasswordUseCase((CredentialsProvider) singletonCImpl.f4340e.get());
            case 34:
                return UseCases_ProvideGenerateUserIdUseCaseFactory.provideGenerateUserIdUseCase((CredentialsProvider) singletonCImpl.f4340e.get());
            case 35:
                return RepositoryModule_Companion_ProvideTokenJwtProviderFactory.provideTokenJwtProvider();
            case 36:
                return new Object();
            case 37:
                return RepositoryModule_Companion_ProvideStationsObservationsRepositoryFactory.provideStationsObservationsRepository(NetworkModule_ProvideStationObservationsServiceFactory.provideStationObservationsService(singletonCImpl.d(), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.c()), RepositoryModule_Companion_ProvideStationObservationsMapperFactory.provideStationObservationsMapper());
            case 38:
                return UseCases_ProvideGetLastDeparturesArrivalsStationUseCaseFactory.provideGetLastDeparturesArrivalsStationUseCase((CirculationRepository) singletonCImpl.f4369u.get());
            case 39:
                return UseCases_ProvideSetLastDeparturesArrivalsStationUseCaseFactory.provideSetLastDeparturesArrivalsStationUseCase((CirculationRepository) singletonCImpl.f4369u.get());
            case 40:
                return UseCases_ProvideGetLastDeparturesArrivalsStationToUseCaseFactory.provideGetLastDeparturesArrivalsStationToUseCase((CirculationRepository) singletonCImpl.f4369u.get());
            case 41:
                return UseCases_ProvideGetLastDepartureTypeTrainIsCercaniasUseCaseFactory.provideGetLastDepartureTypeTrainIsCercaniasUseCase((CirculationRepository) singletonCImpl.f4369u.get());
            case 42:
                return UseCases_ProvideSetLastDeparturesArrivalsStationToUseCaseFactory.provideSetLastDeparturesArrivalsStationToUseCase((CirculationRepository) singletonCImpl.f4369u.get());
            case 43:
                return UseCases_ProvideSetLastDepartureTypeTrainIsCercaniasUseCaseFactory.provideSetLastDepartureTypeTrainIsCercaniasUseCase((CirculationRepository) singletonCImpl.f4369u.get());
            case 44:
                return RepositoryModule_Companion_ProvideFavouritesRepositoryFactory.provideFavouritesRepository(StorageModule_ProvideFavouritesDaoFactory.provideFavouritesDao(singletonCImpl.e()), RepositoryModule_Companion_ProvidesFavoritableMapperFactory.providesFavoritableMapper(), NetworkModule_ProvideSubscriptionServiceFactory.provideSubscriptionService(NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient((C0322h) singletonCImpl.f4352l.get()), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.c()), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), RepositoryModule_Companion_ProvidesFavoritableTrainMapperFactory.providesFavoritableTrainMapper());
            case 45:
                return UseCases_ProvideGenerateDynamicLinkUseCaseFactory.provideGenerateDynamicLinkUseCase((DynamicLinkFacade) singletonCImpl.f4329W.get());
            case 46:
                return UseCases_ProvideGenerateDynamicLinkFacadeFactory.provideGenerateDynamicLinkFacade(RepositoryModule_Companion_ProvideFirebaseDynamicLinkFactory.provideFirebaseDynamicLink());
            case 47:
                return UseCases_ProvideGetCirculationUpdateTimeUseCaseFactory.provideGetCirculationUpdateTimeUseCase((RemoteConfigVersionRepository) singletonCImpl.f4338d.get());
            case 48:
                return RepositoryModule_Companion_ProvideFiltersRepositoryFactory.provideFiltersRepository(DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl));
            case 49:
                return UseCases_ProvideManageLogosUseCaseFactory.provideManageLogosUseCase((LogosInfoRepository) singletonCImpl.f4333a0.get(), (LogoProvider) singletonCImpl.f4335b0.get());
            case 50:
                return RepositoryModule_Companion_ProvideLogosInfoRepositoryFactory.provideLogosInfoRepository(DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl));
            case 51:
                return RepositoryModule_Companion_ProvideLogoProviderFactory.provideLogoProvider(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a));
            case 52:
                return UseCases_ProvideTabDataHolderFactory.provideTabDataHolder();
            case 53:
                return MoreAdifModule_ProvideHelpItemsProviderFactory.provideHelpItemsProvider();
            case 54:
                return HomeModule_ProvideHomeMapViewModelFactory.provideHomeMapViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a), UseCases_ProvideGetStationsForRegionUseCaseFactory.provideGetStationsForRegionUseCase((LocationProvider) singletonCImpl.f4310C.get(), (StationsRepository) singletonCImpl.f4354m.get(), (Check24hProvider) singletonCImpl.f4356n.get()), UseCases_ProvideGetUserLastLocationUseCaseFactory.provideGetUserLastLocationUseCase((LocationProvider) singletonCImpl.f4310C.get()), (GetHomeStationUseCase) singletonCImpl.f4311D.get(), (GetWorkStationUseCase) singletonCImpl.f4312E.get());
            case 55:
                return UseCases_ProvideSetHomeStationUseCaseFactory.provideSetHomeStationUseCase((StationsRepository) singletonCImpl.f4354m.get());
            case 56:
                return UseCases_ProvideSetWorkStationUseCaseFactory.provideSetWorkStationUseCase((StationsRepository) singletonCImpl.f4354m.get());
            case 57:
                return new Object();
            case 58:
                return new UserFavoriteVOMapper(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a), singletonCImpl.b());
            case 59:
                return new DefaultLocationStatusProvider((Z0.c) singletonCImpl.f4351k0.get(), (Z0.a) singletonCImpl.f4353l0.get(), (InterfaceC0307a) singletonCImpl.h.get());
            case 60:
                return new Z0.c(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a), (InterfaceC0307a) singletonCImpl.h.get());
            case 61:
                return new Z0.a(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a));
            case 62:
                return UseCases_ProvideMuteSubscriptionsdUseCaseFactory.provideMuteSubscriptionsdUseCase((SubscriptionRepository) singletonCImpl.f4357n0.get());
            case 63:
                return new DefaultSubscriptionsRepository(NetworkModule_ProvideSubscriptionServiceFactory.provideSubscriptionService(NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient((C0322h) singletonCImpl.f4352l.get()), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.c()), RepositoryModule_Companion_ProvideSubscriptionMapperFactory.provideSubscriptionMapper(singletonCImpl.f()), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), StorageModule_ProvideSubscriptionDaoFactory.provideSubscriptionDao(singletonCImpl.e()), StorageModule_ProvideSubscriptionAuxDataDaoFactory.provideSubscriptionAuxDataDao(singletonCImpl.e()), (InterfaceC0307a) singletonCImpl.h.get());
            case 64:
                return MoreAdifModule_ProvideOptionsProviderFactory.provideOptionsProvider();
            case 65:
                return new Object();
            case 66:
                return RepositoryModule_Companion_ProvideSearchesRepositoryFactory.provideSearchesRepository(DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl), RepositoryModule_Companion_ProvidesSearchesMapperFactory.providesSearchesMapper(), RepositoryModule_Companion_ProvidesTrainSearchesMapperFactory.providesTrainSearchesMapper());
            case 67:
                return SelectedStationModule_ProvidesCollatorFactory.providesCollator();
            case 68:
                return UseCases_ProvideCreateSubscriptionsdUseCaseFactory.provideCreateSubscriptionsdUseCase((SubscriptionRepository) singletonCImpl.f4357n0.get());
            case 69:
                return UseCases_ProvideDeleteSubscriptionsdUseCaseFactory.provideDeleteSubscriptionsdUseCase((SubscriptionRepository) singletonCImpl.f4357n0.get());
            case 70:
                return UseCases_ProvideModifySubscriptionsdUseCaseFactory.provideModifySubscriptionsdUseCase((SubscriptionRepository) singletonCImpl.f4357n0.get());
            case 71:
                return UseCases_ProvideGetSubscriptionsdUseCaseFactory.provideGetSubscriptionsdUseCase((SubscriptionRepository) singletonCImpl.f4357n0.get());
            case 72:
                return UseCases_ProvideActiveSubscriptionsUseCaseFactory.provideActiveSubscriptionsUseCase((SubscriptionRepository) singletonCImpl.f4357n0.get());
            case 73:
                return UseCases_ProvideGetCompositionsUseCaseFactory.provideGetCompositionsUseCase((CompositionsRepository) singletonCImpl.f4378y0.get());
            case 74:
                return RepositoryModule_Companion_ProvideCompositionsRepositoryFactory.provideCompositionsRepository(NetworkModule_ProvideTrainCompositionServiceFactory.provideTrainCompositionService(singletonCImpl.d(), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.c()), RepositoryModule_Companion_ProvideCompositionsMapperFactory.provideCompositionsMapper(), DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl.a(singletonCImpl));
            default:
                throw new AssertionError(i);
        }
    }
}
