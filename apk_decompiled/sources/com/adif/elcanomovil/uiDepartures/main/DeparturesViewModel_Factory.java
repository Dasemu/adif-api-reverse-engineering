package com.adif.elcanomovil.uiDepartures.main;

import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDepartureTypeTrainIsCercaniasUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
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
public final class DeparturesViewModel_Factory implements Factory<DeparturesViewModel> {
    private final Provider<GetLastDeparturesArrivalsStationToUseCase> getLastDeparturesArrivalsStationToUseCaseProvider;
    private final Provider<GetLastDeparturesArrivalsStationUseCase> getLastDeparturesArrivalsStationUseCaseProvider;
    private final Provider<GetStationByIdUseCase> getStationByIdUseCaseProvider;
    private final Provider<SetLastDepartureTypeTrainIsCercaniasUseCase> setLastDepartureTypeTrainIsCercaniasUseCaseProvider;
    private final Provider<SetLastDeparturesArrivalsStationToUseCase> setLastDeparturesArrivalsStationToUseCaseProvider;
    private final Provider<SetLastDeparturesArrivalsStationUseCase> setLastDeparturesArrivalsStationUseCaseProvider;
    private final Provider<TabDataHolder> tabDataHolderProvider;

    public DeparturesViewModel_Factory(Provider<GetStationByIdUseCase> provider, Provider<GetLastDeparturesArrivalsStationUseCase> provider2, Provider<GetLastDeparturesArrivalsStationToUseCase> provider3, Provider<SetLastDeparturesArrivalsStationUseCase> provider4, Provider<SetLastDeparturesArrivalsStationToUseCase> provider5, Provider<SetLastDepartureTypeTrainIsCercaniasUseCase> provider6, Provider<TabDataHolder> provider7) {
        this.getStationByIdUseCaseProvider = provider;
        this.getLastDeparturesArrivalsStationUseCaseProvider = provider2;
        this.getLastDeparturesArrivalsStationToUseCaseProvider = provider3;
        this.setLastDeparturesArrivalsStationUseCaseProvider = provider4;
        this.setLastDeparturesArrivalsStationToUseCaseProvider = provider5;
        this.setLastDepartureTypeTrainIsCercaniasUseCaseProvider = provider6;
        this.tabDataHolderProvider = provider7;
    }

    public static DeparturesViewModel_Factory create(Provider<GetStationByIdUseCase> provider, Provider<GetLastDeparturesArrivalsStationUseCase> provider2, Provider<GetLastDeparturesArrivalsStationToUseCase> provider3, Provider<SetLastDeparturesArrivalsStationUseCase> provider4, Provider<SetLastDeparturesArrivalsStationToUseCase> provider5, Provider<SetLastDepartureTypeTrainIsCercaniasUseCase> provider6, Provider<TabDataHolder> provider7) {
        return new DeparturesViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static DeparturesViewModel newInstance(GetStationByIdUseCase getStationByIdUseCase, GetLastDeparturesArrivalsStationUseCase getLastDeparturesArrivalsStationUseCase, GetLastDeparturesArrivalsStationToUseCase getLastDeparturesArrivalsStationToUseCase, SetLastDeparturesArrivalsStationUseCase setLastDeparturesArrivalsStationUseCase, SetLastDeparturesArrivalsStationToUseCase setLastDeparturesArrivalsStationToUseCase, SetLastDepartureTypeTrainIsCercaniasUseCase setLastDepartureTypeTrainIsCercaniasUseCase, TabDataHolder tabDataHolder) {
        return new DeparturesViewModel(getStationByIdUseCase, getLastDeparturesArrivalsStationUseCase, getLastDeparturesArrivalsStationToUseCase, setLastDeparturesArrivalsStationUseCase, setLastDeparturesArrivalsStationToUseCase, setLastDepartureTypeTrainIsCercaniasUseCase, tabDataHolder);
    }

    @Override // javax.inject.Provider
    public DeparturesViewModel get() {
        return newInstance(this.getStationByIdUseCaseProvider.get(), this.getLastDeparturesArrivalsStationUseCaseProvider.get(), this.getLastDeparturesArrivalsStationToUseCaseProvider.get(), this.setLastDeparturesArrivalsStationUseCaseProvider.get(), this.setLastDeparturesArrivalsStationToUseCaseProvider.get(), this.setLastDepartureTypeTrainIsCercaniasUseCaseProvider.get(), this.tabDataHolderProvider.get());
    }
}
