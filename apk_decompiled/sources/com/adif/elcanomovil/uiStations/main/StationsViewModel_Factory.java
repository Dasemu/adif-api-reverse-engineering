package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.domain.usecases.stations.GetLastVisitedStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetOneStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.domain.usecases.stations.SetLastVisitedStationUseCase;
import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class StationsViewModel_Factory implements Factory<StationsViewModel> {
    private final Provider<GetLastVisitedStationUseCase> getLastVisitedStationUseCaseProvider;
    private final Provider<GetOneStationUseCase> getOneStationUseCaseProvider;
    private final Provider<GetStationByIdUseCase> getStationByIdUseCaseProvider;
    private final Provider<SetLastVisitedStationUseCase> setLastVisitedStationUseCaseProvider;
    private final Provider<TabDataHolder> tabDataHolderProvider;

    public StationsViewModel_Factory(Provider<GetOneStationUseCase> provider, Provider<GetStationByIdUseCase> provider2, Provider<GetLastVisitedStationUseCase> provider3, Provider<SetLastVisitedStationUseCase> provider4, Provider<TabDataHolder> provider5) {
        this.getOneStationUseCaseProvider = provider;
        this.getStationByIdUseCaseProvider = provider2;
        this.getLastVisitedStationUseCaseProvider = provider3;
        this.setLastVisitedStationUseCaseProvider = provider4;
        this.tabDataHolderProvider = provider5;
    }

    public static StationsViewModel_Factory create(Provider<GetOneStationUseCase> provider, Provider<GetStationByIdUseCase> provider2, Provider<GetLastVisitedStationUseCase> provider3, Provider<SetLastVisitedStationUseCase> provider4, Provider<TabDataHolder> provider5) {
        return new StationsViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static StationsViewModel newInstance(GetOneStationUseCase getOneStationUseCase, GetStationByIdUseCase getStationByIdUseCase, GetLastVisitedStationUseCase getLastVisitedStationUseCase, SetLastVisitedStationUseCase setLastVisitedStationUseCase, TabDataHolder tabDataHolder) {
        return new StationsViewModel(getOneStationUseCase, getStationByIdUseCase, getLastVisitedStationUseCase, setLastVisitedStationUseCase, tabDataHolder);
    }

    @Override // javax.inject.Provider
    public StationsViewModel get() {
        return newInstance(this.getOneStationUseCaseProvider.get(), this.getStationByIdUseCaseProvider.get(), this.getLastVisitedStationUseCaseProvider.get(), this.setLastVisitedStationUseCaseProvider.get(), this.tabDataHolderProvider.get());
    }
}
