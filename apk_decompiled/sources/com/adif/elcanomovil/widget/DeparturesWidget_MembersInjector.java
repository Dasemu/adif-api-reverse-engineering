package com.adif.elcanomovil.widget;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class DeparturesWidget_MembersInjector implements MembersInjector<DeparturesWidget> {
    private final Provider<DeparturesWidgetViewModel> viewModelProvider;
    private final Provider<WidgetPayloadHandler> widgetPayloadHandlerProvider;

    public DeparturesWidget_MembersInjector(Provider<DeparturesWidgetViewModel> provider, Provider<WidgetPayloadHandler> provider2) {
        this.viewModelProvider = provider;
        this.widgetPayloadHandlerProvider = provider2;
    }

    public static MembersInjector<DeparturesWidget> create(Provider<DeparturesWidgetViewModel> provider, Provider<WidgetPayloadHandler> provider2) {
        return new DeparturesWidget_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.adif.elcanomovil.widget.DeparturesWidget.viewModel")
    public static void injectViewModel(DeparturesWidget departuresWidget, DeparturesWidgetViewModel departuresWidgetViewModel) {
        departuresWidget.viewModel = departuresWidgetViewModel;
    }

    @InjectedFieldSignature("com.adif.elcanomovil.widget.DeparturesWidget.widgetPayloadHandler")
    public static void injectWidgetPayloadHandler(DeparturesWidget departuresWidget, WidgetPayloadHandler widgetPayloadHandler) {
        departuresWidget.widgetPayloadHandler = widgetPayloadHandler;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DeparturesWidget departuresWidget) {
        injectViewModel(departuresWidget, this.viewModelProvider.get());
        injectWidgetPayloadHandler(departuresWidget, this.widgetPayloadHandlerProvider.get());
    }
}
