package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import com.adif.elcanomovil.domain.usecases.GetCirculationUpdateTimeUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDepartureTypeTrainIsCercaniasUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDepartureTypeTrainIsCercaniasUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.GetStationIsFavoriteUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteStationUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteStationUseCase;
import com.adif.elcanomovil.domain.usecases.filters.GetFiltersUseCase;
import com.adif.elcanomovil.domain.usecases.filters.SaveFilterUseCase;
import com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationsObservationsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class CirculationsViewModel_Factory implements Factory<CirculationsViewModel> {
    private final Provider<DynamicLinkUseCase> dynamicLinkUseCaseProvider;
    private final Provider<GetStationIsFavoriteUseCase> fetchFavoriteStationUseCaseProvider;
    private final Provider<GetCirculationUpdateTimeUseCase> getCirculationUpdateTimeUseCaseProvider;
    private final Provider<GetDepartureCirculationsUseCase> getDepartureCirculationsUseCaseProvider;
    private final Provider<GetFiltersUseCase> getFiltersUseCaseProvider;
    private final Provider<GetLastDepartureTypeTrainIsCercaniasUseCase> getLastDepartureTypeTrainIsCercaniasUseCaseProvider;
    private final Provider<GetLastDeparturesArrivalsStationToUseCase> getLastDeparturesArrivalsStationToUseCaseProvider;
    private final Provider<GetLastDeparturesArrivalsStationUseCase> getLastDeparturesArrivalsStationUseCaseProvider;
    private final Provider<GetStationByIdUseCase> getStationByIdUseCaseProvider;
    private final Provider<GetStationsObservationsUseCase> getStationsObservationsUseCaseProvider;
    private final Provider<ManageLogosUseCase> manageLogosUseCaseProvider;
    private final Provider<RemoveFavoriteStationUseCase> removeFavoriteStationUseCaseProvider;
    private final Provider<SaveFavoriteStationUseCase> saveFavoriteStationUseCaseProvider;
    private final Provider<SaveFilterUseCase> saveFilterUseCaseProvider;
    private final Provider<SetLastDepartureTypeTrainIsCercaniasUseCase> setLastDepartureTypeTrainIsCercaniasUseCaseProvider;
    private final Provider<SetLastDeparturesArrivalsStationToUseCase> setLastDeparturesArrivalsStationToUseCaseProvider;
    private final Provider<SetLastDeparturesArrivalsStationUseCase> setLastDeparturesArrivalsStationUseCaseProvider;
    private final Provider<d1.g> stringProvider;

    public CirculationsViewModel_Factory(Provider<GetStationsObservationsUseCase> provider, Provider<GetDepartureCirculationsUseCase> provider2, Provider<GetLastDeparturesArrivalsStationUseCase> provider3, Provider<SetLastDeparturesArrivalsStationUseCase> provider4, Provider<GetLastDeparturesArrivalsStationToUseCase> provider5, Provider<GetLastDepartureTypeTrainIsCercaniasUseCase> provider6, Provider<SetLastDeparturesArrivalsStationToUseCase> provider7, Provider<SetLastDepartureTypeTrainIsCercaniasUseCase> provider8, Provider<GetStationIsFavoriteUseCase> provider9, Provider<SaveFavoriteStationUseCase> provider10, Provider<RemoveFavoriteStationUseCase> provider11, Provider<GetStationByIdUseCase> provider12, Provider<DynamicLinkUseCase> provider13, Provider<GetCirculationUpdateTimeUseCase> provider14, Provider<GetFiltersUseCase> provider15, Provider<SaveFilterUseCase> provider16, Provider<d1.g> provider17, Provider<ManageLogosUseCase> provider18) {
        this.getStationsObservationsUseCaseProvider = provider;
        this.getDepartureCirculationsUseCaseProvider = provider2;
        this.getLastDeparturesArrivalsStationUseCaseProvider = provider3;
        this.setLastDeparturesArrivalsStationUseCaseProvider = provider4;
        this.getLastDeparturesArrivalsStationToUseCaseProvider = provider5;
        this.getLastDepartureTypeTrainIsCercaniasUseCaseProvider = provider6;
        this.setLastDeparturesArrivalsStationToUseCaseProvider = provider7;
        this.setLastDepartureTypeTrainIsCercaniasUseCaseProvider = provider8;
        this.fetchFavoriteStationUseCaseProvider = provider9;
        this.saveFavoriteStationUseCaseProvider = provider10;
        this.removeFavoriteStationUseCaseProvider = provider11;
        this.getStationByIdUseCaseProvider = provider12;
        this.dynamicLinkUseCaseProvider = provider13;
        this.getCirculationUpdateTimeUseCaseProvider = provider14;
        this.getFiltersUseCaseProvider = provider15;
        this.saveFilterUseCaseProvider = provider16;
        this.stringProvider = provider17;
        this.manageLogosUseCaseProvider = provider18;
    }

    public static CirculationsViewModel_Factory create(Provider<GetStationsObservationsUseCase> provider, Provider<GetDepartureCirculationsUseCase> provider2, Provider<GetLastDeparturesArrivalsStationUseCase> provider3, Provider<SetLastDeparturesArrivalsStationUseCase> provider4, Provider<GetLastDeparturesArrivalsStationToUseCase> provider5, Provider<GetLastDepartureTypeTrainIsCercaniasUseCase> provider6, Provider<SetLastDeparturesArrivalsStationToUseCase> provider7, Provider<SetLastDepartureTypeTrainIsCercaniasUseCase> provider8, Provider<GetStationIsFavoriteUseCase> provider9, Provider<SaveFavoriteStationUseCase> provider10, Provider<RemoveFavoriteStationUseCase> provider11, Provider<GetStationByIdUseCase> provider12, Provider<DynamicLinkUseCase> provider13, Provider<GetCirculationUpdateTimeUseCase> provider14, Provider<GetFiltersUseCase> provider15, Provider<SaveFilterUseCase> provider16, Provider<d1.g> provider17, Provider<ManageLogosUseCase> provider18) {
        return new CirculationsViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    public static CirculationsViewModel newInstance(GetStationsObservationsUseCase getStationsObservationsUseCase, GetDepartureCirculationsUseCase getDepartureCirculationsUseCase, GetLastDeparturesArrivalsStationUseCase getLastDeparturesArrivalsStationUseCase, SetLastDeparturesArrivalsStationUseCase setLastDeparturesArrivalsStationUseCase, GetLastDeparturesArrivalsStationToUseCase getLastDeparturesArrivalsStationToUseCase, GetLastDepartureTypeTrainIsCercaniasUseCase getLastDepartureTypeTrainIsCercaniasUseCase, SetLastDeparturesArrivalsStationToUseCase setLastDeparturesArrivalsStationToUseCase, SetLastDepartureTypeTrainIsCercaniasUseCase setLastDepartureTypeTrainIsCercaniasUseCase, GetStationIsFavoriteUseCase getStationIsFavoriteUseCase, SaveFavoriteStationUseCase saveFavoriteStationUseCase, RemoveFavoriteStationUseCase removeFavoriteStationUseCase, GetStationByIdUseCase getStationByIdUseCase, DynamicLinkUseCase dynamicLinkUseCase, GetCirculationUpdateTimeUseCase getCirculationUpdateTimeUseCase, GetFiltersUseCase getFiltersUseCase, SaveFilterUseCase saveFilterUseCase, d1.g gVar, ManageLogosUseCase manageLogosUseCase) {
        return new CirculationsViewModel(getStationsObservationsUseCase, getDepartureCirculationsUseCase, getLastDeparturesArrivalsStationUseCase, setLastDeparturesArrivalsStationUseCase, getLastDeparturesArrivalsStationToUseCase, getLastDepartureTypeTrainIsCercaniasUseCase, setLastDeparturesArrivalsStationToUseCase, setLastDepartureTypeTrainIsCercaniasUseCase, getStationIsFavoriteUseCase, saveFavoriteStationUseCase, removeFavoriteStationUseCase, getStationByIdUseCase, dynamicLinkUseCase, getCirculationUpdateTimeUseCase, getFiltersUseCase, saveFilterUseCase, gVar, manageLogosUseCase);
    }

    @Override // javax.inject.Provider
    public CirculationsViewModel get() {
        return newInstance(this.getStationsObservationsUseCaseProvider.get(), this.getDepartureCirculationsUseCaseProvider.get(), this.getLastDeparturesArrivalsStationUseCaseProvider.get(), this.setLastDeparturesArrivalsStationUseCaseProvider.get(), this.getLastDeparturesArrivalsStationToUseCaseProvider.get(), this.getLastDepartureTypeTrainIsCercaniasUseCaseProvider.get(), this.setLastDeparturesArrivalsStationToUseCaseProvider.get(), this.setLastDepartureTypeTrainIsCercaniasUseCaseProvider.get(), this.fetchFavoriteStationUseCaseProvider.get(), this.saveFavoriteStationUseCaseProvider.get(), this.removeFavoriteStationUseCaseProvider.get(), this.getStationByIdUseCaseProvider.get(), this.dynamicLinkUseCaseProvider.get(), this.getCirculationUpdateTimeUseCaseProvider.get(), this.getFiltersUseCaseProvider.get(), this.saveFilterUseCaseProvider.get(), this.stringProvider.get(), this.manageLogosUseCaseProvider.get());
    }
}
