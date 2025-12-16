package com.adif.elcanomovil;

import C.w;
import Z2.G;
import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.K;
import androidx.lifecycle.I;
import androidx.lifecycle.n0;
import c1.C0283c;
import com.adif.elcanomovil.ElcanoApplication_HiltComponents;
import com.adif.elcanomovil.di.ApplicationModule_Companion_ProvideStringProviderFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetStationByIdUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetStationsForRegionUseCaseFactory;
import com.adif.elcanomovil.di.UseCases_ProvideGetUserLastLocationUseCaseFactory;
import com.adif.elcanomovil.domain.providers.Check24hProvider;
import com.adif.elcanomovil.domain.providers.LocationProvider;
import com.adif.elcanomovil.domain.providers.PushIdTokenProvider;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePersistentUserIdUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase;
import com.adif.elcanomovil.main.BottomNavFragment;
import com.adif.elcanomovil.main.BottomNavViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.main.MainActivity;
import com.adif.elcanomovil.main.MainActivity_MembersInjector;
import com.adif.elcanomovil.main.MainViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.notifications.NotificationProvider;
import com.adif.elcanomovil.observers.ApplicationObserver;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule_ProvideMoshiFactory;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule_ProvideOkHttpClientSecurizedFactory;
import com.adif.elcanomovil.serviceStorage.database.StationDatabase;
import com.adif.elcanomovil.serviceStorage.di.StorageModule_ProvideMoshiPolymorphicFactoryFactory;
import com.adif.elcanomovil.serviceStorage.di.StorageModule_ProvideMoshiPolymorphicFactoryTrainFactory;
import com.adif.elcanomovil.serviceStorage.di.StorageModule_ProvidePreferenceStorageFactory;
import com.adif.elcanomovil.serviceStorage.di.StorageModule_ProvideStationDatabaseFactory;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.adif.elcanomovil.splash.SplashFragment;
import com.adif.elcanomovil.splash.SplashViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment;
import com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsFragment;
import com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeFragment;
import com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiDepartures.main.DeparturesFragment;
import com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsFragment;
import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiHome.HomeFragment;
import com.adif.elcanomovil.uiHome.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiHome.di.HomeModule_ProvideHomeMapViewModelFactory;
import com.adif.elcanomovil.uiHome.views.HomeMapView;
import com.adif.elcanomovil.uiHome.views.HomeMapViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiHome.views.HomeMapView_MembersInjector;
import com.adif.elcanomovil.uiMoreAdif.about.AboutFragment;
import com.adif.elcanomovil.uiMoreAdif.about.AboutViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityFragment;
import com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiMoreAdif.help.HelpFragment;
import com.adif.elcanomovil.uiMoreAdif.help.HelpViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiMoreAdif.main.MoreAdifFragment;
import com.adif.elcanomovil.uiMoreAdif.main.MoreAdifViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiSelectStation.main.SelectStationFragment;
import com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiSelectTrain.main.SelectTrainFragment;
import com.adif.elcanomovil.uiSelectTrain.main.SelectTrainViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiStations.main.StationsFragment;
import com.adif.elcanomovil.uiStations.main.StationsPageActivitiesFragment;
import com.adif.elcanomovil.uiStations.main.StationsPageActivitiesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiStations.main.StationsPageCommercialFragment;
import com.adif.elcanomovil.uiStations.main.StationsPageCommercialViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiStations.main.StationsPageServicesFragment;
import com.adif.elcanomovil.uiStations.main.StationsPageServicesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiStations.main.StationsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment;
import com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment_MembersInjector;
import com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment;
import com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.uiTrain.main.TrainSituationFragment;
import com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.widget.DeparturesWidget;
import com.adif.elcanomovil.widget.DeparturesWidgetConfigureActivity;
import com.adif.elcanomovil.widget.DeparturesWidgetViewModel;
import com.adif.elcanomovil.widget.DeparturesWidget_MembersInjector;
import com.adif.elcanomovil.widget.WidgetPayloadHandler;
import com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment;
import com.adif.elcanomovil.widget.configuration.ConfigureWidgetViewModel_HiltModules_KeyModule_ProvideFactory;
import com.adif.elcanomovil.widget.di.WidgetsModule;
import d1.g;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SetBuilder;
import e3.C0322h;
import e3.F;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

@DaggerGenerated
/* loaded from: classes.dex */
public final class DaggerElcanoApplication_HiltComponents_SingletonC {

    /* loaded from: classes.dex */
    public static final class ActivityCBuilder implements ElcanoApplication_HiltComponents.ActivityC.Builder {
        private Activity activity;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        private ActivityCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public ActivityCBuilder activity(Activity activity) {
            this.activity = (Activity) Preconditions.checkNotNull(activity);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public ElcanoApplication_HiltComponents.ActivityC build() {
            Preconditions.checkBuilderRequirement(this.activity, Activity.class);
            return new ActivityCImpl(this.singletonCImpl, this.activityRetainedCImpl);
        }
    }

    /* loaded from: classes.dex */
    public static final class ActivityCImpl extends ElcanoApplication_HiltComponents.ActivityC {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4298a;

        /* renamed from: b, reason: collision with root package name */
        public final ActivityRetainedCImpl f4299b;

        /* renamed from: c, reason: collision with root package name */
        public final ActivityCImpl f4300c = this;

        public ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.f4298a = singletonCImpl;
            this.f4299b = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint
        public final FragmentComponentBuilder fragmentComponentBuilder() {
            return new FragmentCBuilder(this.f4298a, this.f4299b, this.f4300c);
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
        public final DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(this.f4298a, this.f4299b));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public final ViewModelComponentBuilder getViewModelComponentBuilder() {
            return new ViewModelCBuilder(this.f4298a, this.f4299b);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public final Set getViewModelKeys() {
            return SetBuilder.newSetBuilder(24).add(AboutViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(AccessibilityViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(AvisaHomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(BottomNavViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(CirculationsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ConfigureWidgetViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(DeparturesViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HelpViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HomeMapViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(IssueDetailsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MainViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MoreAdifViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(NewIssueViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SelectStationViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SelectTrainViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SplashViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(StationsPageActivitiesViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(StationsPageCommercialViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(StationsPageServicesViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(StationsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SubscriptionCreationViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SubscriptionHomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(TrainSituationViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
        }

        @Override // com.adif.elcanomovil.widget.DeparturesWidgetConfigureActivity_GeneratedInjector
        public final void injectDeparturesWidgetConfigureActivity(DeparturesWidgetConfigureActivity departuresWidgetConfigureActivity) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.adif.elcanomovil.main.MainActivity_GeneratedInjector
        public final void injectMainActivity(MainActivity mainActivity) {
            MainActivity_MembersInjector.injectNotificationsPermissionRequester(mainActivity, (C0283c) this.f4298a.f4309B.get());
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint
        public final ViewComponentBuilder viewComponentBuilder() {
            return new ViewCBuilder(this.f4298a, this.f4299b, this.f4300c);
        }
    }

    /* loaded from: classes.dex */
    public static final class ActivityRetainedCBuilder implements ElcanoApplication_HiltComponents.ActivityRetainedC.Builder {
        private SavedStateHandleHolder savedStateHandleHolder;
        private final SingletonCImpl singletonCImpl;

        private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public ElcanoApplication_HiltComponents.ActivityRetainedC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandleHolder, SavedStateHandleHolder.class);
            return new ActivityRetainedCImpl(this.singletonCImpl);
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public ActivityRetainedCBuilder savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder) {
            this.savedStateHandleHolder = (SavedStateHandleHolder) Preconditions.checkNotNull(savedStateHandleHolder);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class ActivityRetainedCImpl extends ElcanoApplication_HiltComponents.ActivityRetainedC {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4301a;

        /* renamed from: b, reason: collision with root package name */
        public final ActivityRetainedCImpl f4302b = this;

        /* renamed from: c, reason: collision with root package name */
        public final Provider f4303c = DoubleCheck.provider(new Object());

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, dagger.internal.Provider] */
        public ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
            this.f4301a = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
        public final ActivityComponentBuilder activityComponentBuilder() {
            return new ActivityCBuilder(this.f4301a, this.f4302b);
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
        public final ActivityRetainedLifecycle getActivityRetainedLifecycle() {
            return (ActivityRetainedLifecycle) this.f4303c.get();
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private ApplicationContextModule applicationContextModule;
        private WidgetsModule widgetsModule;

        public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
            this.applicationContextModule = (ApplicationContextModule) Preconditions.checkNotNull(applicationContextModule);
            return this;
        }

        public ElcanoApplication_HiltComponents.SingletonC build() {
            Preconditions.checkBuilderRequirement(this.applicationContextModule, ApplicationContextModule.class);
            if (this.widgetsModule == null) {
                this.widgetsModule = new WidgetsModule();
            }
            return new SingletonCImpl(this.applicationContextModule, this.widgetsModule);
        }

        public Builder widgetsModule(WidgetsModule widgetsModule) {
            this.widgetsModule = (WidgetsModule) Preconditions.checkNotNull(widgetsModule);
            return this;
        }

        private Builder() {
        }
    }

    /* loaded from: classes.dex */
    public static final class FragmentCBuilder implements ElcanoApplication_HiltComponents.FragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private K fragment;
        private final SingletonCImpl singletonCImpl;

        private FragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public ElcanoApplication_HiltComponents.FragmentC build() {
            Preconditions.checkBuilderRequirement(this.fragment, K.class);
            return new FragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public FragmentCBuilder fragment(K k4) {
            this.fragment = (K) Preconditions.checkNotNull(k4);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class FragmentCImpl extends ElcanoApplication_HiltComponents.FragmentC {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4304a;

        /* renamed from: b, reason: collision with root package name */
        public final ActivityRetainedCImpl f4305b;

        /* renamed from: c, reason: collision with root package name */
        public final ActivityCImpl f4306c;

        /* renamed from: d, reason: collision with root package name */
        public final FragmentCImpl f4307d = this;

        public FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.f4304a = singletonCImpl;
            this.f4305b = activityRetainedCImpl;
            this.f4306c = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint
        public final DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return this.f4306c.getHiltInternalFactoryFactory();
        }

        @Override // com.adif.elcanomovil.uiMoreAdif.about.AboutFragment_GeneratedInjector
        public final void injectAboutFragment(AboutFragment aboutFragment) {
        }

        @Override // com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityFragment_GeneratedInjector
        public final void injectAccessibilityFragment(AccessibilityFragment accessibilityFragment) {
        }

        @Override // com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeFragment_GeneratedInjector
        public final void injectAvisaHomeFragment(AvisaHomeFragment avisaHomeFragment) {
        }

        @Override // com.adif.elcanomovil.main.BottomNavFragment_GeneratedInjector
        public final void injectBottomNavFragment(BottomNavFragment bottomNavFragment) {
        }

        @Override // com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsFragment_GeneratedInjector
        public final void injectCirculationsFragment(CirculationsFragment circulationsFragment) {
        }

        @Override // com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment_GeneratedInjector
        public final void injectConfigureWidgetFragment(ConfigureWidgetFragment configureWidgetFragment) {
        }

        @Override // com.adif.elcanomovil.uiDepartures.main.DeparturesFragment_GeneratedInjector
        public final void injectDeparturesFragment(DeparturesFragment departuresFragment) {
        }

        @Override // com.adif.elcanomovil.uiMoreAdif.help.HelpFragment_GeneratedInjector
        public final void injectHelpFragment(HelpFragment helpFragment) {
        }

        @Override // com.adif.elcanomovil.uiHome.HomeFragment_GeneratedInjector
        public final void injectHomeFragment(HomeFragment homeFragment) {
        }

        @Override // com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsFragment_GeneratedInjector
        public final void injectIssueDetailsFragment(IssueDetailsFragment issueDetailsFragment) {
        }

        @Override // com.adif.elcanomovil.uiMoreAdif.main.MoreAdifFragment_GeneratedInjector
        public final void injectMoreAdifFragment(MoreAdifFragment moreAdifFragment) {
        }

        @Override // com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment_GeneratedInjector
        public final void injectNewIssueFragment(NewIssueFragment newIssueFragment) {
        }

        @Override // com.adif.elcanomovil.uiSelectStation.main.SelectStationFragment_GeneratedInjector
        public final void injectSelectStationFragment(SelectStationFragment selectStationFragment) {
        }

        @Override // com.adif.elcanomovil.uiSelectTrain.main.SelectTrainFragment_GeneratedInjector
        public final void injectSelectTrainFragment(SelectTrainFragment selectTrainFragment) {
        }

        @Override // com.adif.elcanomovil.splash.SplashFragment_GeneratedInjector
        public final void injectSplashFragment(SplashFragment splashFragment) {
        }

        @Override // com.adif.elcanomovil.uiStations.main.StationsFragment_GeneratedInjector
        public final void injectStationsFragment(StationsFragment stationsFragment) {
        }

        @Override // com.adif.elcanomovil.uiStations.main.StationsPageActivitiesFragment_GeneratedInjector
        public final void injectStationsPageActivitiesFragment(StationsPageActivitiesFragment stationsPageActivitiesFragment) {
        }

        @Override // com.adif.elcanomovil.uiStations.main.StationsPageCommercialFragment_GeneratedInjector
        public final void injectStationsPageCommercialFragment(StationsPageCommercialFragment stationsPageCommercialFragment) {
        }

        @Override // com.adif.elcanomovil.uiStations.main.StationsPageServicesFragment_GeneratedInjector
        public final void injectStationsPageServicesFragment(StationsPageServicesFragment stationsPageServicesFragment) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment_GeneratedInjector
        public final void injectSubscriptionCreationFragment(SubscriptionCreationFragment subscriptionCreationFragment) {
            SubscriptionCreationFragment_MembersInjector.injectNotificationsPermissionRequester(subscriptionCreationFragment, (C0283c) this.f4304a.f4309B.get());
        }

        @Override // com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment_GeneratedInjector
        public final void injectSubscriptionHomeFragment(SubscriptionHomeFragment subscriptionHomeFragment) {
        }

        @Override // com.adif.elcanomovil.uiTrain.main.TrainSituationFragment_GeneratedInjector
        public final void injectTrainSituationFragment(TrainSituationFragment trainSituationFragment) {
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint
        public final ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
            return new ViewWithFragmentCBuilder(this.f4304a, this.f4305b, this.f4306c, this.f4307d);
        }
    }

    /* loaded from: classes.dex */
    public static final class ServiceCBuilder implements ElcanoApplication_HiltComponents.ServiceC.Builder {
        private Service service;
        private final SingletonCImpl singletonCImpl;

        private ServiceCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public ElcanoApplication_HiltComponents.ServiceC build() {
            Preconditions.checkBuilderRequirement(this.service, Service.class);
            return new ElcanoApplication_HiltComponents.ServiceC();
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public ServiceCBuilder service(Service service) {
            this.service = (Service) Preconditions.checkNotNull(service);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class ServiceCImpl extends ElcanoApplication_HiltComponents.ServiceC {
    }

    /* loaded from: classes.dex */
    public static final class SingletonCImpl extends ElcanoApplication_HiltComponents.SingletonC {

        /* renamed from: a, reason: collision with root package name */
        public final ApplicationContextModule f4332a;

        /* renamed from: b, reason: collision with root package name */
        public final WidgetsModule f4334b;

        /* renamed from: c, reason: collision with root package name */
        public final SingletonCImpl f4336c = this;

        /* renamed from: d, reason: collision with root package name */
        public final Provider f4338d = w.f(this, 1);

        /* renamed from: e, reason: collision with root package name */
        public final Provider f4340e = w.f(this, 4);

        /* renamed from: f, reason: collision with root package name */
        public final Provider f4342f = w.f(this, 3);

        /* renamed from: g, reason: collision with root package name */
        public final Provider f4344g = w.f(this, 8);
        public final Provider h = w.f(this, 9);
        public final Provider i = w.f(this, 7);

        /* renamed from: j, reason: collision with root package name */
        public final Provider f4348j = w.f(this, 10);

        /* renamed from: k, reason: collision with root package name */
        public final Provider f4350k = w.f(this, 6);

        /* renamed from: l, reason: collision with root package name */
        public final Provider f4352l = w.f(this, 5);

        /* renamed from: m, reason: collision with root package name */
        public final Provider f4354m = w.f(this, 2);

        /* renamed from: n, reason: collision with root package name */
        public final Provider f4356n = w.f(this, 11);

        /* renamed from: o, reason: collision with root package name */
        public final Provider f4358o = w.f(this, 0);
        public final Provider p = w.f(this, 12);

        /* renamed from: q, reason: collision with root package name */
        public final Provider f4361q = w.f(this, 13);

        /* renamed from: r, reason: collision with root package name */
        public final Provider f4363r = w.f(this, 15);

        /* renamed from: s, reason: collision with root package name */
        public final Provider f4365s = w.f(this, 16);

        /* renamed from: t, reason: collision with root package name */
        public final Provider f4367t = DoubleCheck.provider(new c(this, 14));

        /* renamed from: u, reason: collision with root package name */
        public final Provider f4369u = w.f(this, 19);

        /* renamed from: v, reason: collision with root package name */
        public final Provider f4371v = w.f(this, 20);

        /* renamed from: w, reason: collision with root package name */
        public final Provider f4373w = w.f(this, 18);

        /* renamed from: x, reason: collision with root package name */
        public final Provider f4375x = w.f(this, 22);

        /* renamed from: y, reason: collision with root package name */
        public final Provider f4377y = w.f(this, 21);

        /* renamed from: z, reason: collision with root package name */
        public final Provider f4379z = w.f(this, 17);

        /* renamed from: A, reason: collision with root package name */
        public final Provider f4308A = w.f(this, 23);

        /* renamed from: B, reason: collision with root package name */
        public final Provider f4309B = w.f(this, 24);

        /* renamed from: C, reason: collision with root package name */
        public final Provider f4310C = DoubleCheck.provider(new c(this, 25));

        /* renamed from: D, reason: collision with root package name */
        public final Provider f4311D = w.f(this, 26);

        /* renamed from: E, reason: collision with root package name */
        public final Provider f4312E = w.f(this, 27);

        /* renamed from: F, reason: collision with root package name */
        public final Provider f4313F = w.f(this, 28);

        /* renamed from: G, reason: collision with root package name */
        public final Provider f4314G = w.f(this, 29);

        /* renamed from: H, reason: collision with root package name */
        public final Provider f4315H = w.f(this, 30);

        /* renamed from: I, reason: collision with root package name */
        public final Provider f4316I = w.f(this, 32);
        public final Provider J = w.f(this, 33);

        /* renamed from: K, reason: collision with root package name */
        public final Provider f4317K = w.f(this, 34);

        /* renamed from: L, reason: collision with root package name */
        public final Provider f4318L = w.f(this, 35);

        /* renamed from: M, reason: collision with root package name */
        public final Provider f4319M = w.f(this, 31);

        /* renamed from: N, reason: collision with root package name */
        public final Provider f4320N = w.f(this, 36);

        /* renamed from: O, reason: collision with root package name */
        public final Provider f4321O = w.f(this, 37);

        /* renamed from: P, reason: collision with root package name */
        public final Provider f4322P = w.f(this, 38);

        /* renamed from: Q, reason: collision with root package name */
        public final Provider f4323Q = w.f(this, 39);

        /* renamed from: R, reason: collision with root package name */
        public final Provider f4324R = w.f(this, 40);

        /* renamed from: S, reason: collision with root package name */
        public final Provider f4325S = w.f(this, 41);

        /* renamed from: T, reason: collision with root package name */
        public final Provider f4326T = w.f(this, 42);

        /* renamed from: U, reason: collision with root package name */
        public final Provider f4327U = w.f(this, 43);

        /* renamed from: V, reason: collision with root package name */
        public final Provider f4328V = w.f(this, 44);

        /* renamed from: W, reason: collision with root package name */
        public final Provider f4329W = w.f(this, 46);

        /* renamed from: X, reason: collision with root package name */
        public final Provider f4330X = w.f(this, 45);

        /* renamed from: Y, reason: collision with root package name */
        public final Provider f4331Y = w.f(this, 47);
        public final Provider Z = w.f(this, 48);

        /* renamed from: a0, reason: collision with root package name */
        public final Provider f4333a0 = w.f(this, 50);

        /* renamed from: b0, reason: collision with root package name */
        public final Provider f4335b0 = w.f(this, 51);

        /* renamed from: c0, reason: collision with root package name */
        public final Provider f4337c0 = w.f(this, 49);

        /* renamed from: d0, reason: collision with root package name */
        public final Provider f4339d0 = w.f(this, 52);

        /* renamed from: e0, reason: collision with root package name */
        public final Provider f4341e0 = w.f(this, 53);

        /* renamed from: f0, reason: collision with root package name */
        public final c f4343f0 = new c(this, 54);

        /* renamed from: g0, reason: collision with root package name */
        public final Provider f4345g0 = w.f(this, 55);

        /* renamed from: h0, reason: collision with root package name */
        public final Provider f4346h0 = w.f(this, 56);

        /* renamed from: i0, reason: collision with root package name */
        public final Provider f4347i0 = w.f(this, 57);

        /* renamed from: j0, reason: collision with root package name */
        public final Provider f4349j0 = w.f(this, 58);

        /* renamed from: k0, reason: collision with root package name */
        public final Provider f4351k0 = w.f(this, 60);

        /* renamed from: l0, reason: collision with root package name */
        public final Provider f4353l0 = w.f(this, 61);

        /* renamed from: m0, reason: collision with root package name */
        public final Provider f4355m0 = DoubleCheck.provider(new c(this, 59));

        /* renamed from: n0, reason: collision with root package name */
        public final Provider f4357n0 = w.f(this, 63);

        /* renamed from: o0, reason: collision with root package name */
        public final Provider f4359o0 = w.f(this, 62);

        /* renamed from: p0, reason: collision with root package name */
        public final Provider f4360p0 = w.f(this, 64);

        /* renamed from: q0, reason: collision with root package name */
        public final Provider f4362q0 = w.f(this, 65);

        /* renamed from: r0, reason: collision with root package name */
        public final Provider f4364r0 = w.f(this, 66);

        /* renamed from: s0, reason: collision with root package name */
        public final Provider f4366s0 = w.f(this, 67);

        /* renamed from: t0, reason: collision with root package name */
        public final Provider f4368t0 = w.f(this, 68);

        /* renamed from: u0, reason: collision with root package name */
        public final Provider f4370u0 = w.f(this, 69);

        /* renamed from: v0, reason: collision with root package name */
        public final Provider f4372v0 = w.f(this, 70);

        /* renamed from: w0, reason: collision with root package name */
        public final Provider f4374w0 = w.f(this, 71);

        /* renamed from: x0, reason: collision with root package name */
        public final Provider f4376x0 = w.f(this, 72);

        /* renamed from: y0, reason: collision with root package name */
        public final Provider f4378y0 = w.f(this, 74);

        /* renamed from: z0, reason: collision with root package name */
        public final Provider f4380z0 = w.f(this, 73);

        public SingletonCImpl(ApplicationContextModule applicationContextModule, WidgetsModule widgetsModule) {
            this.f4332a = applicationContextModule;
            this.f4334b = widgetsModule;
        }

        public static PreferenceStorage a(SingletonCImpl singletonCImpl) {
            return StorageModule_ProvidePreferenceStorageFactory.providePreferenceStorage(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a), c());
        }

        public static G c() {
            return NetworkModule_ProvideMoshiFactory.provideMoshi(StorageModule_ProvideMoshiPolymorphicFactoryFactory.provideMoshiPolymorphicFactory(), StorageModule_ProvideMoshiPolymorphicFactoryTrainFactory.provideMoshiPolymorphicFactoryTrain());
        }

        public final GetStationByIdUseCase b() {
            return UseCases_ProvideGetStationByIdUseCaseFactory.provideGetStationByIdUseCase((StationsRepository) this.f4354m.get());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final F d() {
            return NetworkModule_ProvideOkHttpClientSecurizedFactory.provideOkHttpClientSecurized((GeneratePersistentUserIdUseCase) this.f4342f.get(), (C0322h) this.f4352l.get());
        }

        public final StationDatabase e() {
            return StorageModule_ProvideStationDatabaseFactory.provideStationDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(this.f4332a), c());
        }

        public final g f() {
            return ApplicationModule_Companion_ProvideStringProviderFactory.provideStringProvider(ApplicationContextModule_ProvideContextFactory.provideContext(this.f4332a));
        }

        @Override // dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint
        public final Set getDisableFragmentGetContextFix() {
            return Collections.EMPTY_SET;
        }

        @Override // com.adif.elcanomovil.notifications.AppFirebaseMessagingService.MyMessagingServiceInterface
        public final NotificationProvider getNotificationProvider() {
            return (NotificationProvider) this.f4367t.get();
        }

        @Override // com.adif.elcanomovil.notifications.AppFirebaseMessagingService.MyMessagingServiceInterface
        public final PushIdTokenProvider getTokenProvider() {
            return (PushIdTokenProvider) this.f4361q.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.adif.elcanomovil.widget.DeparturesWidget_GeneratedInjector
        public final void injectDeparturesWidget(DeparturesWidget departuresWidget) {
            DeparturesWidget_MembersInjector.injectViewModel(departuresWidget, (DeparturesWidgetViewModel) this.f4379z.get());
            DeparturesWidget_MembersInjector.injectWidgetPayloadHandler(departuresWidget, (WidgetPayloadHandler) this.f4308A.get());
        }

        @Override // com.adif.elcanomovil.ElcanoApplication_GeneratedInjector
        public final void injectElcanoApplication(ElcanoApplication elcanoApplication) {
            ElcanoApplication_MembersInjector.injectApplicationObserver(elcanoApplication, (ApplicationObserver) this.f4358o.get());
            ElcanoApplication_MembersInjector.injectMyLifecycleProvider(elcanoApplication, (I) this.p.get());
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint
        public final ActivityRetainedComponentBuilder retainedComponentBuilder() {
            return new ActivityRetainedCBuilder(this.f4336c);
        }

        @Override // dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint
        public final ServiceComponentBuilder serviceComponentBuilder() {
            return new ServiceCBuilder(this.f4336c);
        }
    }

    /* loaded from: classes.dex */
    public static final class ViewCBuilder implements ElcanoApplication_HiltComponents.ViewC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public ElcanoApplication_HiltComponents.ViewC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewCImpl(this.singletonCImpl);
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public ViewCBuilder view(View view) {
            this.view = (View) Preconditions.checkNotNull(view);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class ViewCImpl extends ElcanoApplication_HiltComponents.ViewC {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4381a;

        public ViewCImpl(SingletonCImpl singletonCImpl) {
            this.f4381a = singletonCImpl;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.adif.elcanomovil.uiHome.views.HomeMapView_GeneratedInjector
        public final void injectHomeMapView(HomeMapView homeMapView) {
            SingletonCImpl singletonCImpl = this.f4381a;
            HomeMapView_MembersInjector.injectViewModel(homeMapView, HomeModule_ProvideHomeMapViewModelFactory.provideHomeMapViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.f4332a), UseCases_ProvideGetStationsForRegionUseCaseFactory.provideGetStationsForRegionUseCase((LocationProvider) singletonCImpl.f4310C.get(), (StationsRepository) singletonCImpl.f4354m.get(), (Check24hProvider) singletonCImpl.f4356n.get()), UseCases_ProvideGetUserLastLocationUseCaseFactory.provideGetUserLastLocationUseCase((LocationProvider) singletonCImpl.f4310C.get()), (GetHomeStationUseCase) singletonCImpl.f4311D.get(), (GetWorkStationUseCase) singletonCImpl.f4312E.get()));
        }
    }

    /* loaded from: classes.dex */
    public static final class ViewModelCBuilder implements ElcanoApplication_HiltComponents.ViewModelC.Builder {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private n0 savedStateHandle;
        private final SingletonCImpl singletonCImpl;
        private ViewModelLifecycle viewModelLifecycle;

        private ViewModelCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ElcanoApplication_HiltComponents.ViewModelC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandle, n0.class);
            Preconditions.checkBuilderRequirement(this.viewModelLifecycle, ViewModelLifecycle.class);
            return new ViewModelCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.savedStateHandle);
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ViewModelCBuilder savedStateHandle(n0 n0Var) {
            this.savedStateHandle = (n0) Preconditions.checkNotNull(n0Var);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
            this.viewModelLifecycle = (ViewModelLifecycle) Preconditions.checkNotNull(viewModelLifecycle);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class ViewModelCImpl extends ElcanoApplication_HiltComponents.ViewModelC {

        /* renamed from: a, reason: collision with root package name */
        public final n0 f4382a;

        /* renamed from: b, reason: collision with root package name */
        public final SingletonCImpl f4383b;

        /* renamed from: c, reason: collision with root package name */
        public final d f4384c;

        /* renamed from: d, reason: collision with root package name */
        public final d f4385d;

        /* renamed from: e, reason: collision with root package name */
        public final d f4386e;

        /* renamed from: f, reason: collision with root package name */
        public final d f4387f;

        /* renamed from: g, reason: collision with root package name */
        public final d f4388g;
        public final d h;
        public final d i;

        /* renamed from: j, reason: collision with root package name */
        public final d f4389j;

        /* renamed from: k, reason: collision with root package name */
        public final d f4390k;

        /* renamed from: l, reason: collision with root package name */
        public final d f4391l;

        /* renamed from: m, reason: collision with root package name */
        public final d f4392m;

        /* renamed from: n, reason: collision with root package name */
        public final d f4393n;

        /* renamed from: o, reason: collision with root package name */
        public final d f4394o;
        public final d p;

        /* renamed from: q, reason: collision with root package name */
        public final d f4395q;

        /* renamed from: r, reason: collision with root package name */
        public final d f4396r;

        /* renamed from: s, reason: collision with root package name */
        public final d f4397s;

        /* renamed from: t, reason: collision with root package name */
        public final d f4398t;

        /* renamed from: u, reason: collision with root package name */
        public final d f4399u;

        /* renamed from: v, reason: collision with root package name */
        public final d f4400v;

        /* renamed from: w, reason: collision with root package name */
        public final d f4401w;

        /* renamed from: x, reason: collision with root package name */
        public final d f4402x;

        /* renamed from: y, reason: collision with root package name */
        public final d f4403y;

        public ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, n0 n0Var) {
            this.f4383b = singletonCImpl;
            this.f4382a = n0Var;
            this.f4384c = new d(singletonCImpl, this, 0);
            this.f4385d = new d(singletonCImpl, this, 1);
            this.f4386e = new d(singletonCImpl, this, 2);
            this.f4387f = new d(singletonCImpl, this, 3);
            this.f4388g = new d(singletonCImpl, this, 4);
            this.h = new d(singletonCImpl, this, 5);
            this.i = new d(singletonCImpl, this, 6);
            this.f4389j = new d(singletonCImpl, this, 7);
            this.f4390k = new d(singletonCImpl, this, 8);
            this.f4391l = new d(singletonCImpl, this, 9);
            this.f4392m = new d(singletonCImpl, this, 10);
            this.f4393n = new d(singletonCImpl, this, 11);
            this.f4394o = new d(singletonCImpl, this, 12);
            this.p = new d(singletonCImpl, this, 13);
            this.f4395q = new d(singletonCImpl, this, 14);
            this.f4396r = new d(singletonCImpl, this, 15);
            this.f4397s = new d(singletonCImpl, this, 16);
            this.f4398t = new d(singletonCImpl, this, 17);
            this.f4399u = new d(singletonCImpl, this, 18);
            this.f4400v = new d(singletonCImpl, this, 19);
            this.f4401w = new d(singletonCImpl, this, 20);
            this.f4402x = new d(singletonCImpl, this, 21);
            this.f4403y = new d(singletonCImpl, this, 22);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public final Map getHiltViewModelAssistedMap() {
            return Collections.EMPTY_MAP;
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public final Map getHiltViewModelMap() {
            return MapBuilder.newMapBuilder(24).put("com.adif.elcanomovil.uiMoreAdif.about.AboutViewModel", this.f4384c).put("com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityViewModel", this.f4385d).put("com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeViewModel", this.f4386e).put("com.adif.elcanomovil.main.BottomNavViewModel", this.f4387f).put("com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel", this.f4388g).put("com.adif.elcanomovil.widget.configuration.ConfigureWidgetViewModel", this.h).put("com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel", this.i).put("com.adif.elcanomovil.uiMoreAdif.help.HelpViewModel", this.f4389j).put("com.adif.elcanomovil.uiHome.views.HomeMapViewModel", this.f4383b.f4343f0).put("com.adif.elcanomovil.uiHome.HomeViewModel", this.f4390k).put("com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsViewModel", this.f4391l).put("com.adif.elcanomovil.main.MainViewModel", this.f4392m).put("com.adif.elcanomovil.uiMoreAdif.main.MoreAdifViewModel", this.f4393n).put("com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewModel", this.f4394o).put("com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel", this.p).put("com.adif.elcanomovil.uiSelectTrain.main.SelectTrainViewModel", this.f4395q).put("com.adif.elcanomovil.splash.SplashViewModel", this.f4396r).put("com.adif.elcanomovil.uiStations.main.StationsPageActivitiesViewModel", this.f4397s).put("com.adif.elcanomovil.uiStations.main.StationsPageCommercialViewModel", this.f4398t).put("com.adif.elcanomovil.uiStations.main.StationsPageServicesViewModel", this.f4399u).put("com.adif.elcanomovil.uiStations.main.StationsViewModel", this.f4400v).put("com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel", this.f4401w).put("com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeViewModel", this.f4402x).put("com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel", this.f4403y).build();
        }
    }

    /* loaded from: classes.dex */
    public static final class ViewWithFragmentCBuilder implements ElcanoApplication_HiltComponents.ViewWithFragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        public ElcanoApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ElcanoApplication_HiltComponents.ViewWithFragmentC();
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        public ViewWithFragmentCBuilder view(View view) {
            this.view = (View) Preconditions.checkNotNull(view);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class ViewWithFragmentCImpl extends ElcanoApplication_HiltComponents.ViewWithFragmentC {
    }

    private DaggerElcanoApplication_HiltComponents_SingletonC() {
    }

    public static Builder builder() {
        return new Builder();
    }
}
