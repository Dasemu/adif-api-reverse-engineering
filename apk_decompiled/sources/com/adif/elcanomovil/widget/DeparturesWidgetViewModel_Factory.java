package com.adif.elcanomovil.widget;

import com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.adif.elcanomovil.widget.domain.usecases.GetWidgetInfoUseCase;
import d1.InterfaceC0307a;
import d1.i;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class DeparturesWidgetViewModel_Factory implements Factory<DeparturesWidgetViewModel> {
    private final Provider<InterfaceC0307a> appDispatcherProvider;
    private final Provider<GetDepartureCirculationsUseCase> getDepartureCirculationsUseCaseProvider;
    private final Provider<GetStationByIdUseCase> getStationByIdUseCaseProvider;
    private final Provider<GetWidgetInfoUseCase> getWidgetInfoUseCaseProvider;
    private final Provider<X0.a> isBackgroundConnectivityRestrictedProvider;
    private final Provider<PreferenceStorage> preferenceStorageProvider;
    private final Provider<i> systemWrapperProvider;
    private final Provider<DeparturesWidgetView> viewProvider;

    public DeparturesWidgetViewModel_Factory(Provider<GetDepartureCirculationsUseCase> provider, Provider<GetStationByIdUseCase> provider2, Provider<PreferenceStorage> provider3, Provider<DeparturesWidgetView> provider4, Provider<InterfaceC0307a> provider5, Provider<i> provider6, Provider<X0.a> provider7, Provider<GetWidgetInfoUseCase> provider8) {
        this.getDepartureCirculationsUseCaseProvider = provider;
        this.getStationByIdUseCaseProvider = provider2;
        this.preferenceStorageProvider = provider3;
        this.viewProvider = provider4;
        this.appDispatcherProvider = provider5;
        this.systemWrapperProvider = provider6;
        this.isBackgroundConnectivityRestrictedProvider = provider7;
        this.getWidgetInfoUseCaseProvider = provider8;
    }

    public static DeparturesWidgetViewModel_Factory create(Provider<GetDepartureCirculationsUseCase> provider, Provider<GetStationByIdUseCase> provider2, Provider<PreferenceStorage> provider3, Provider<DeparturesWidgetView> provider4, Provider<InterfaceC0307a> provider5, Provider<i> provider6, Provider<X0.a> provider7, Provider<GetWidgetInfoUseCase> provider8) {
        return new DeparturesWidgetViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static DeparturesWidgetViewModel newInstance(GetDepartureCirculationsUseCase getDepartureCirculationsUseCase, GetStationByIdUseCase getStationByIdUseCase, PreferenceStorage preferenceStorage, DeparturesWidgetView departuresWidgetView, InterfaceC0307a interfaceC0307a, i iVar, X0.a aVar, GetWidgetInfoUseCase getWidgetInfoUseCase) {
        return new DeparturesWidgetViewModel(getDepartureCirculationsUseCase, getStationByIdUseCase, preferenceStorage, departuresWidgetView, interfaceC0307a, iVar, aVar, getWidgetInfoUseCase);
    }

    @Override // javax.inject.Provider
    public DeparturesWidgetViewModel get() {
        return newInstance(this.getDepartureCirculationsUseCaseProvider.get(), this.getStationByIdUseCaseProvider.get(), this.preferenceStorageProvider.get(), this.viewProvider.get(), this.appDispatcherProvider.get(), this.systemWrapperProvider.get(), this.isBackgroundConnectivityRestrictedProvider.get(), this.getWidgetInfoUseCaseProvider.get());
    }
}
