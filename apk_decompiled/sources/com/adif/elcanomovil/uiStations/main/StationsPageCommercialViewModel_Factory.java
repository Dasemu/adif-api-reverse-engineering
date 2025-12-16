package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.domain.usecases.stations.GetCurrentOneStationUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class StationsPageCommercialViewModel_Factory implements Factory<StationsPageCommercialViewModel> {
    private final Provider<GetCurrentOneStationUseCase> getCurrentOneStationUseCaseProvider;

    public StationsPageCommercialViewModel_Factory(Provider<GetCurrentOneStationUseCase> provider) {
        this.getCurrentOneStationUseCaseProvider = provider;
    }

    public static StationsPageCommercialViewModel_Factory create(Provider<GetCurrentOneStationUseCase> provider) {
        return new StationsPageCommercialViewModel_Factory(provider);
    }

    public static StationsPageCommercialViewModel newInstance(GetCurrentOneStationUseCase getCurrentOneStationUseCase) {
        return new StationsPageCommercialViewModel(getCurrentOneStationUseCase);
    }

    @Override // javax.inject.Provider
    public StationsPageCommercialViewModel get() {
        return newInstance(this.getCurrentOneStationUseCaseProvider.get());
    }
}
