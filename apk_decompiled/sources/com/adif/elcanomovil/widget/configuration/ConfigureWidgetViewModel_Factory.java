package com.adif.elcanomovil.widget.configuration;

import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ConfigureWidgetViewModel_Factory implements Factory<ConfigureWidgetViewModel> {
    private final Provider<GetStationByIdUseCase> getStationByIdUseCaseProvider;
    private final Provider<PreferenceStorage> preferenceStorageProvider;

    public ConfigureWidgetViewModel_Factory(Provider<PreferenceStorage> provider, Provider<GetStationByIdUseCase> provider2) {
        this.preferenceStorageProvider = provider;
        this.getStationByIdUseCaseProvider = provider2;
    }

    public static ConfigureWidgetViewModel_Factory create(Provider<PreferenceStorage> provider, Provider<GetStationByIdUseCase> provider2) {
        return new ConfigureWidgetViewModel_Factory(provider, provider2);
    }

    public static ConfigureWidgetViewModel newInstance(PreferenceStorage preferenceStorage, GetStationByIdUseCase getStationByIdUseCase) {
        return new ConfigureWidgetViewModel(preferenceStorage, getStationByIdUseCase);
    }

    @Override // javax.inject.Provider
    public ConfigureWidgetViewModel get() {
        return newInstance(this.preferenceStorageProvider.get(), this.getStationByIdUseCaseProvider.get());
    }
}
