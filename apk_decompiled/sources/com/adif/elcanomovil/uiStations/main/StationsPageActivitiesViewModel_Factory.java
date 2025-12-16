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
public final class StationsPageActivitiesViewModel_Factory implements Factory<StationsPageActivitiesViewModel> {
    private final Provider<GetCurrentOneStationUseCase> getCurrentOneStationUseCaseProvider;

    public StationsPageActivitiesViewModel_Factory(Provider<GetCurrentOneStationUseCase> provider) {
        this.getCurrentOneStationUseCaseProvider = provider;
    }

    public static StationsPageActivitiesViewModel_Factory create(Provider<GetCurrentOneStationUseCase> provider) {
        return new StationsPageActivitiesViewModel_Factory(provider);
    }

    public static StationsPageActivitiesViewModel newInstance(GetCurrentOneStationUseCase getCurrentOneStationUseCase) {
        return new StationsPageActivitiesViewModel(getCurrentOneStationUseCase);
    }

    @Override // javax.inject.Provider
    public StationsPageActivitiesViewModel get() {
        return newInstance(this.getCurrentOneStationUseCaseProvider.get());
    }
}
