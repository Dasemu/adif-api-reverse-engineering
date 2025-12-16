package com.adif.elcanomovil.uiTrain.main;

import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetCompositionsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetOnePathsUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.GetTrainIsFavoriteUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteTrainUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteTrainUseCase;
import com.adif.elcanomovil.domain.usecases.filters.GetFiltersUseCase;
import com.adif.elcanomovil.domain.usecases.filters.SaveFilterUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.adif.elcanomovil.uiTrain.entities.StepMapper;
import com.adif.elcanomovil.uiTrain.entities.TrainInfoMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.text.DateFormat;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class TrainSituationViewModel_Factory implements Factory<TrainSituationViewModel> {
    private final Provider<DynamicLinkUseCase> dynamicLinkUseCaseProvider;
    private final Provider<DateFormat> formatterProvider;
    private final Provider<GetCompositionsUseCase> getCompositionsUseCaseProvider;
    private final Provider<GetFiltersUseCase> getFiltersUseCaseProvider;
    private final Provider<GetOnePathsUseCase> getOnePathsUseCaseProvider;
    private final Provider<GetStationByIdUseCase> getStationByIdUseCaseProvider;
    private final Provider<GetTrainIsFavoriteUseCase> getTrainIsFavoriteUseCaseProvider;
    private final Provider<PreferenceStorage> preferenceStorageProvider;
    private final Provider<RemoveFavoriteTrainUseCase> removeFavoriteTrainUseCaseProvider;
    private final Provider<SaveFavoriteTrainUseCase> saveFavoriteTrainUseCaseProvider;
    private final Provider<SaveFilterUseCase> saveFilterUseCaseProvider;
    private final Provider<StepMapper> stepMapperProvider;
    private final Provider<d1.g> stringProvider;
    private final Provider<TabDataHolder> tabDataHolderProvider;
    private final Provider<TrainInfoMapper> trainInfoMapperProvider;

    public TrainSituationViewModel_Factory(Provider<d1.g> provider, Provider<PreferenceStorage> provider2, Provider<GetStationByIdUseCase> provider3, Provider<GetOnePathsUseCase> provider4, Provider<GetCompositionsUseCase> provider5, Provider<TrainInfoMapper> provider6, Provider<StepMapper> provider7, Provider<DateFormat> provider8, Provider<RemoveFavoriteTrainUseCase> provider9, Provider<GetTrainIsFavoriteUseCase> provider10, Provider<SaveFavoriteTrainUseCase> provider11, Provider<DynamicLinkUseCase> provider12, Provider<GetFiltersUseCase> provider13, Provider<SaveFilterUseCase> provider14, Provider<TabDataHolder> provider15) {
        this.stringProvider = provider;
        this.preferenceStorageProvider = provider2;
        this.getStationByIdUseCaseProvider = provider3;
        this.getOnePathsUseCaseProvider = provider4;
        this.getCompositionsUseCaseProvider = provider5;
        this.trainInfoMapperProvider = provider6;
        this.stepMapperProvider = provider7;
        this.formatterProvider = provider8;
        this.removeFavoriteTrainUseCaseProvider = provider9;
        this.getTrainIsFavoriteUseCaseProvider = provider10;
        this.saveFavoriteTrainUseCaseProvider = provider11;
        this.dynamicLinkUseCaseProvider = provider12;
        this.getFiltersUseCaseProvider = provider13;
        this.saveFilterUseCaseProvider = provider14;
        this.tabDataHolderProvider = provider15;
    }

    public static TrainSituationViewModel_Factory create(Provider<d1.g> provider, Provider<PreferenceStorage> provider2, Provider<GetStationByIdUseCase> provider3, Provider<GetOnePathsUseCase> provider4, Provider<GetCompositionsUseCase> provider5, Provider<TrainInfoMapper> provider6, Provider<StepMapper> provider7, Provider<DateFormat> provider8, Provider<RemoveFavoriteTrainUseCase> provider9, Provider<GetTrainIsFavoriteUseCase> provider10, Provider<SaveFavoriteTrainUseCase> provider11, Provider<DynamicLinkUseCase> provider12, Provider<GetFiltersUseCase> provider13, Provider<SaveFilterUseCase> provider14, Provider<TabDataHolder> provider15) {
        return new TrainSituationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static TrainSituationViewModel newInstance(d1.g gVar, PreferenceStorage preferenceStorage, GetStationByIdUseCase getStationByIdUseCase, GetOnePathsUseCase getOnePathsUseCase, GetCompositionsUseCase getCompositionsUseCase, TrainInfoMapper trainInfoMapper, StepMapper stepMapper, DateFormat dateFormat, RemoveFavoriteTrainUseCase removeFavoriteTrainUseCase, GetTrainIsFavoriteUseCase getTrainIsFavoriteUseCase, SaveFavoriteTrainUseCase saveFavoriteTrainUseCase, DynamicLinkUseCase dynamicLinkUseCase, GetFiltersUseCase getFiltersUseCase, SaveFilterUseCase saveFilterUseCase, TabDataHolder tabDataHolder) {
        return new TrainSituationViewModel(gVar, preferenceStorage, getStationByIdUseCase, getOnePathsUseCase, getCompositionsUseCase, trainInfoMapper, stepMapper, dateFormat, removeFavoriteTrainUseCase, getTrainIsFavoriteUseCase, saveFavoriteTrainUseCase, dynamicLinkUseCase, getFiltersUseCase, saveFilterUseCase, tabDataHolder);
    }

    @Override // javax.inject.Provider
    public TrainSituationViewModel get() {
        return newInstance(this.stringProvider.get(), this.preferenceStorageProvider.get(), this.getStationByIdUseCaseProvider.get(), this.getOnePathsUseCaseProvider.get(), this.getCompositionsUseCaseProvider.get(), this.trainInfoMapperProvider.get(), this.stepMapperProvider.get(), this.formatterProvider.get(), this.removeFavoriteTrainUseCaseProvider.get(), this.getTrainIsFavoriteUseCaseProvider.get(), this.saveFavoriteTrainUseCaseProvider.get(), this.dynamicLinkUseCaseProvider.get(), this.getFiltersUseCaseProvider.get(), this.saveFilterUseCaseProvider.get(), this.tabDataHolderProvider.get());
    }
}
