package com.adif.elcanomovil.uiAvisa.components.create;

import android.content.Context;
import c1.C0283c;
import c1.C0284d;
import com.adif.elcanomovil.domain.usecases.avisa.incidence.CreateIncidenceUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationCategoriesUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationsUseCase;
import d1.InterfaceC0307a;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes.dex */
public final class NewIssueViewModel_Factory implements Factory<NewIssueViewModel> {
    private final Provider<InterfaceC0307a> appDispatcherProvider;
    private final Provider<Context> contextProvider;
    private final Provider<CreateIncidenceUseCase> createIncidenceUseCaseProvider;
    private final Provider<d1.e> fileUtilsProvider;
    private final Provider<GetAvisaStationCategoriesUseCase> getAvisaStationCategoriesUseCaseProvider;
    private final Provider<GetAvisaStationsUseCase> getStationsUseCaseProvider;
    private final Provider<C0283c> notificationsPermissionRequesterProvider;
    private final Provider<C0284d> permissionHelperProvider;

    public NewIssueViewModel_Factory(Provider<CreateIncidenceUseCase> provider, Provider<GetAvisaStationsUseCase> provider2, Provider<GetAvisaStationCategoriesUseCase> provider3, Provider<Context> provider4, Provider<C0284d> provider5, Provider<InterfaceC0307a> provider6, Provider<d1.e> provider7, Provider<C0283c> provider8) {
        this.createIncidenceUseCaseProvider = provider;
        this.getStationsUseCaseProvider = provider2;
        this.getAvisaStationCategoriesUseCaseProvider = provider3;
        this.contextProvider = provider4;
        this.permissionHelperProvider = provider5;
        this.appDispatcherProvider = provider6;
        this.fileUtilsProvider = provider7;
        this.notificationsPermissionRequesterProvider = provider8;
    }

    public static NewIssueViewModel_Factory create(Provider<CreateIncidenceUseCase> provider, Provider<GetAvisaStationsUseCase> provider2, Provider<GetAvisaStationCategoriesUseCase> provider3, Provider<Context> provider4, Provider<C0284d> provider5, Provider<InterfaceC0307a> provider6, Provider<d1.e> provider7, Provider<C0283c> provider8) {
        return new NewIssueViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static NewIssueViewModel newInstance(CreateIncidenceUseCase createIncidenceUseCase, GetAvisaStationsUseCase getAvisaStationsUseCase, GetAvisaStationCategoriesUseCase getAvisaStationCategoriesUseCase, Context context, C0284d c0284d, InterfaceC0307a interfaceC0307a, d1.e eVar, C0283c c0283c) {
        return new NewIssueViewModel(createIncidenceUseCase, getAvisaStationsUseCase, getAvisaStationCategoriesUseCase, context, c0284d, interfaceC0307a, eVar, c0283c);
    }

    @Override // javax.inject.Provider
    public NewIssueViewModel get() {
        return newInstance(this.createIncidenceUseCaseProvider.get(), this.getStationsUseCaseProvider.get(), this.getAvisaStationCategoriesUseCaseProvider.get(), this.contextProvider.get(), this.permissionHelperProvider.get(), this.appDispatcherProvider.get(), this.fileUtilsProvider.get(), this.notificationsPermissionRequesterProvider.get());
    }
}
