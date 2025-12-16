package com.adif.elcanomovil;

import com.adif.commonHelpers.di.CommonHelpersModule;
import com.adif.elcanomovil.di.ApplicationModule;
import com.adif.elcanomovil.di.UseCases;
import com.adif.elcanomovil.main.BottomNavFragment_GeneratedInjector;
import com.adif.elcanomovil.main.BottomNavViewModel_HiltModules;
import com.adif.elcanomovil.main.MainActivity_GeneratedInjector;
import com.adif.elcanomovil.main.MainViewModel_HiltModules;
import com.adif.elcanomovil.notifications.AppFirebaseMessagingService;
import com.adif.elcanomovil.repositories.di.RepositoryModule;
import com.adif.elcanomovil.serviceNetworking.di.FirebaseStorageModule;
import com.adif.elcanomovil.serviceNetworking.di.NetworkModule;
import com.adif.elcanomovil.serviceStorage.di.StorageModule;
import com.adif.elcanomovil.splash.SplashFragment_GeneratedInjector;
import com.adif.elcanomovil.splash.SplashViewModel_HiltModules;
import com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment_GeneratedInjector;
import com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewModel_HiltModules;
import com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsFragment_GeneratedInjector;
import com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsViewModel_HiltModules;
import com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeFragment_GeneratedInjector;
import com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeViewModel_HiltModules;
import com.adif.elcanomovil.uiDepartures.di.DepartureModule;
import com.adif.elcanomovil.uiDepartures.main.DeparturesFragment_GeneratedInjector;
import com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel_HiltModules;
import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsFragment_GeneratedInjector;
import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel_HiltModules;
import com.adif.elcanomovil.uiHome.HomeFragment_GeneratedInjector;
import com.adif.elcanomovil.uiHome.HomeViewModel_HiltModules;
import com.adif.elcanomovil.uiHome.di.HomeModule;
import com.adif.elcanomovil.uiHome.views.HomeMapViewModel_HiltModules;
import com.adif.elcanomovil.uiHome.views.HomeMapView_GeneratedInjector;
import com.adif.elcanomovil.uiMoreAdif.about.AboutFragment_GeneratedInjector;
import com.adif.elcanomovil.uiMoreAdif.about.AboutViewModel_HiltModules;
import com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityFragment_GeneratedInjector;
import com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityViewModel_HiltModules;
import com.adif.elcanomovil.uiMoreAdif.di.MoreAdifModule;
import com.adif.elcanomovil.uiMoreAdif.help.HelpFragment_GeneratedInjector;
import com.adif.elcanomovil.uiMoreAdif.help.HelpViewModel_HiltModules;
import com.adif.elcanomovil.uiMoreAdif.main.MoreAdifFragment_GeneratedInjector;
import com.adif.elcanomovil.uiMoreAdif.main.MoreAdifViewModel_HiltModules;
import com.adif.elcanomovil.uiSelectStation.di.SelectedStationModule;
import com.adif.elcanomovil.uiSelectStation.main.SelectStationFragment_GeneratedInjector;
import com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel_HiltModules;
import com.adif.elcanomovil.uiSelectTrain.main.SelectTrainFragment_GeneratedInjector;
import com.adif.elcanomovil.uiSelectTrain.main.SelectTrainViewModel_HiltModules;
import com.adif.elcanomovil.uiStations.main.StationsFragment_GeneratedInjector;
import com.adif.elcanomovil.uiStations.main.StationsPageActivitiesFragment_GeneratedInjector;
import com.adif.elcanomovil.uiStations.main.StationsPageActivitiesViewModel_HiltModules;
import com.adif.elcanomovil.uiStations.main.StationsPageCommercialFragment_GeneratedInjector;
import com.adif.elcanomovil.uiStations.main.StationsPageCommercialViewModel_HiltModules;
import com.adif.elcanomovil.uiStations.main.StationsPageServicesFragment_GeneratedInjector;
import com.adif.elcanomovil.uiStations.main.StationsPageServicesViewModel_HiltModules;
import com.adif.elcanomovil.uiStations.main.StationsViewModel_HiltModules;
import com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment_GeneratedInjector;
import com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationViewModel_HiltModules;
import com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment_GeneratedInjector;
import com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeViewModel_HiltModules;
import com.adif.elcanomovil.uiTrain.di.TrainModule;
import com.adif.elcanomovil.uiTrain.main.TrainSituationFragment_GeneratedInjector;
import com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel_HiltModules;
import com.adif.elcanomovil.widget.DeparturesWidgetConfigureActivity_GeneratedInjector;
import com.adif.elcanomovil.widget.DeparturesWidget_GeneratedInjector;
import com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment_GeneratedInjector;
import com.adif.elcanomovil.widget.configuration.ConfigureWidgetViewModel_HiltModules;
import com.adif.elcanomovil.widget.di.WidgetsModule;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.HiltWrapper_SavedStateHandleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.inject.Singleton;

/* loaded from: classes.dex */
public final class ElcanoApplication_HiltComponents {

    @ActivityScoped
    @Subcomponent(modules = {FragmentCBuilderModule.class, ViewCBuilderModule.class, HiltWrapper_ActivityModule.class, HiltWrapper_DefaultViewModelFactories_ActivityModule.class})
    /* loaded from: classes.dex */
    public static abstract class ActivityC implements MainActivity_GeneratedInjector, DeparturesWidgetConfigureActivity_GeneratedInjector, ActivityComponent, DefaultViewModelFactories.ActivityEntryPoint, HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint, FragmentComponentManager.FragmentComponentBuilderEntryPoint, ViewComponentManager.ViewComponentBuilderEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes.dex */
        public interface Builder extends ActivityComponentBuilder {
        }
    }

    @DisableInstallInCheck
    @Module(subcomponents = {ActivityC.class})
    /* loaded from: classes.dex */
    public interface ActivityCBuilderModule {
        @Binds
        ActivityComponentBuilder bind(ActivityC.Builder builder);
    }

    @ActivityRetainedScoped
    @Subcomponent(modules = {AboutViewModel_HiltModules.KeyModule.class, AccessibilityViewModel_HiltModules.KeyModule.class, AvisaHomeViewModel_HiltModules.KeyModule.class, BottomNavViewModel_HiltModules.KeyModule.class, CirculationsViewModel_HiltModules.KeyModule.class, ConfigureWidgetViewModel_HiltModules.KeyModule.class, DeparturesViewModel_HiltModules.KeyModule.class, ActivityCBuilderModule.class, ViewModelCBuilderModule.class, HelpViewModel_HiltModules.KeyModule.class, HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class, HiltWrapper_SavedStateHandleModule.class, HomeMapViewModel_HiltModules.KeyModule.class, HomeViewModel_HiltModules.KeyModule.class, IssueDetailsViewModel_HiltModules.KeyModule.class, MainViewModel_HiltModules.KeyModule.class, MoreAdifViewModel_HiltModules.KeyModule.class, NewIssueViewModel_HiltModules.KeyModule.class, SelectStationViewModel_HiltModules.KeyModule.class, SelectTrainViewModel_HiltModules.KeyModule.class, SplashViewModel_HiltModules.KeyModule.class, StationsPageActivitiesViewModel_HiltModules.KeyModule.class, StationsPageCommercialViewModel_HiltModules.KeyModule.class, StationsPageServicesViewModel_HiltModules.KeyModule.class, StationsViewModel_HiltModules.KeyModule.class, SubscriptionCreationViewModel_HiltModules.KeyModule.class, SubscriptionHomeViewModel_HiltModules.KeyModule.class, TrainSituationViewModel_HiltModules.KeyModule.class})
    /* loaded from: classes.dex */
    public static abstract class ActivityRetainedC implements ActivityRetainedComponent, ActivityComponentManager.ActivityComponentBuilderEntryPoint, HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes.dex */
        public interface Builder extends ActivityRetainedComponentBuilder {
        }
    }

    @DisableInstallInCheck
    @Module(subcomponents = {ActivityRetainedC.class})
    /* loaded from: classes.dex */
    public interface ActivityRetainedCBuilderModule {
        @Binds
        ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
    }

    @FragmentScoped
    @Subcomponent(modules = {ViewWithFragmentCBuilderModule.class})
    /* loaded from: classes.dex */
    public static abstract class FragmentC implements BottomNavFragment_GeneratedInjector, SplashFragment_GeneratedInjector, NewIssueFragment_GeneratedInjector, IssueDetailsFragment_GeneratedInjector, AvisaHomeFragment_GeneratedInjector, DeparturesFragment_GeneratedInjector, CirculationsFragment_GeneratedInjector, HomeFragment_GeneratedInjector, AboutFragment_GeneratedInjector, AccessibilityFragment_GeneratedInjector, HelpFragment_GeneratedInjector, MoreAdifFragment_GeneratedInjector, SelectStationFragment_GeneratedInjector, SelectTrainFragment_GeneratedInjector, StationsFragment_GeneratedInjector, StationsPageActivitiesFragment_GeneratedInjector, StationsPageCommercialFragment_GeneratedInjector, StationsPageServicesFragment_GeneratedInjector, SubscriptionCreationFragment_GeneratedInjector, SubscriptionHomeFragment_GeneratedInjector, TrainSituationFragment_GeneratedInjector, ConfigureWidgetFragment_GeneratedInjector, FragmentComponent, DefaultViewModelFactories.FragmentEntryPoint, ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes.dex */
        public interface Builder extends FragmentComponentBuilder {
        }
    }

    @DisableInstallInCheck
    @Module(subcomponents = {FragmentC.class})
    /* loaded from: classes.dex */
    public interface FragmentCBuilderModule {
        @Binds
        FragmentComponentBuilder bind(FragmentC.Builder builder);
    }

    @ServiceScoped
    @Subcomponent
    /* loaded from: classes.dex */
    public static abstract class ServiceC implements ServiceComponent, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes.dex */
        public interface Builder extends ServiceComponentBuilder {
        }
    }

    @DisableInstallInCheck
    @Module(subcomponents = {ServiceC.class})
    /* loaded from: classes.dex */
    public interface ServiceCBuilderModule {
        @Binds
        ServiceComponentBuilder bind(ServiceC.Builder builder);
    }

    @Component(modules = {ApplicationContextModule.class, ApplicationModule.class, CommonHelpersModule.class, DepartureModule.class, ActivityRetainedCBuilderModule.class, ServiceCBuilderModule.class, FirebaseStorageModule.class, HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class, HomeModule.class, MoreAdifModule.class, NetworkModule.class, RepositoryModule.class, SelectedStationModule.class, StorageModule.class, TrainModule.class, UseCases.class, WidgetsModule.class})
    @Singleton
    /* loaded from: classes.dex */
    public static abstract class SingletonC implements ElcanoApplication_GeneratedInjector, AppFirebaseMessagingService.MyMessagingServiceInterface, DeparturesWidget_GeneratedInjector, FragmentGetContextFix.FragmentGetContextFixEntryPoint, HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint, ServiceComponentManager.ServiceComponentBuilderEntryPoint, SingletonComponent, GeneratedComponent {
    }

    @ViewScoped
    @Subcomponent
    /* loaded from: classes.dex */
    public static abstract class ViewC implements HomeMapView_GeneratedInjector, ViewComponent, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes.dex */
        public interface Builder extends ViewComponentBuilder {
        }
    }

    @DisableInstallInCheck
    @Module(subcomponents = {ViewC.class})
    /* loaded from: classes.dex */
    public interface ViewCBuilderModule {
        @Binds
        ViewComponentBuilder bind(ViewC.Builder builder);
    }

    @ViewModelScoped
    @Subcomponent(modules = {AboutViewModel_HiltModules.BindsModule.class, AccessibilityViewModel_HiltModules.BindsModule.class, AvisaHomeViewModel_HiltModules.BindsModule.class, BottomNavViewModel_HiltModules.BindsModule.class, CirculationsViewModel_HiltModules.BindsModule.class, ConfigureWidgetViewModel_HiltModules.BindsModule.class, DeparturesViewModel_HiltModules.BindsModule.class, HelpViewModel_HiltModules.BindsModule.class, HiltWrapper_HiltViewModelFactory_ViewModelModule.class, HomeMapViewModel_HiltModules.BindsModule.class, HomeViewModel_HiltModules.BindsModule.class, IssueDetailsViewModel_HiltModules.BindsModule.class, MainViewModel_HiltModules.BindsModule.class, MoreAdifViewModel_HiltModules.BindsModule.class, NewIssueViewModel_HiltModules.BindsModule.class, SelectStationViewModel_HiltModules.BindsModule.class, SelectTrainViewModel_HiltModules.BindsModule.class, SplashViewModel_HiltModules.BindsModule.class, StationsPageActivitiesViewModel_HiltModules.BindsModule.class, StationsPageCommercialViewModel_HiltModules.BindsModule.class, StationsPageServicesViewModel_HiltModules.BindsModule.class, StationsViewModel_HiltModules.BindsModule.class, SubscriptionCreationViewModel_HiltModules.BindsModule.class, SubscriptionHomeViewModel_HiltModules.BindsModule.class, TrainSituationViewModel_HiltModules.BindsModule.class})
    /* loaded from: classes.dex */
    public static abstract class ViewModelC implements ViewModelComponent, HiltViewModelFactory.ViewModelFactoriesEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes.dex */
        public interface Builder extends ViewModelComponentBuilder {
        }
    }

    @DisableInstallInCheck
    @Module(subcomponents = {ViewModelC.class})
    /* loaded from: classes.dex */
    public interface ViewModelCBuilderModule {
        @Binds
        ViewModelComponentBuilder bind(ViewModelC.Builder builder);
    }

    @ViewScoped
    @Subcomponent
    /* loaded from: classes.dex */
    public static abstract class ViewWithFragmentC implements ViewWithFragmentComponent, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes.dex */
        public interface Builder extends ViewWithFragmentComponentBuilder {
        }
    }

    @DisableInstallInCheck
    @Module(subcomponents = {ViewWithFragmentC.class})
    /* loaded from: classes.dex */
    public interface ViewWithFragmentCBuilderModule {
        @Binds
        ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
    }

    private ElcanoApplication_HiltComponents() {
    }
}
