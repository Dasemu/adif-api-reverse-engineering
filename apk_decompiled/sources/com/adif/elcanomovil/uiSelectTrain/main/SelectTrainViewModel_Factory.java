package com.adif.elcanomovil.uiSelectTrain.main;

import androidx.lifecycle.n0;
import com.adif.elcanomovil.domain.usecases.circulation.GetSeveralPathsUseCase;
import com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentTrainSearchesUseCase;
import com.adif.elcanomovil.domain.usecases.recentSearch.SaveRecentTrainSearchUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class SelectTrainViewModel_Factory implements Factory<SelectTrainViewModel> {
    private final Provider<GetRecentTrainSearchesUseCase> getRecentTrainSearchesUseCaseProvider;
    private final Provider<GetSeveralPathsUseCase> getSeveralPathsUseCaseProvider;
    private final Provider<GetStationByIdUseCase> getStationByIdUseCaseProvider;
    private final Provider<SaveRecentTrainSearchUseCase> saveRecentTrainSearchesUseCaseProvider;
    private final Provider<n0> savedStateHandleProvider;

    public SelectTrainViewModel_Factory(Provider<GetSeveralPathsUseCase> provider, Provider<GetRecentTrainSearchesUseCase> provider2, Provider<SaveRecentTrainSearchUseCase> provider3, Provider<GetStationByIdUseCase> provider4, Provider<n0> provider5) {
        this.getSeveralPathsUseCaseProvider = provider;
        this.getRecentTrainSearchesUseCaseProvider = provider2;
        this.saveRecentTrainSearchesUseCaseProvider = provider3;
        this.getStationByIdUseCaseProvider = provider4;
        this.savedStateHandleProvider = provider5;
    }

    public static SelectTrainViewModel_Factory create(Provider<GetSeveralPathsUseCase> provider, Provider<GetRecentTrainSearchesUseCase> provider2, Provider<SaveRecentTrainSearchUseCase> provider3, Provider<GetStationByIdUseCase> provider4, Provider<n0> provider5) {
        return new SelectTrainViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static SelectTrainViewModel newInstance(GetSeveralPathsUseCase getSeveralPathsUseCase, GetRecentTrainSearchesUseCase getRecentTrainSearchesUseCase, SaveRecentTrainSearchUseCase saveRecentTrainSearchUseCase, GetStationByIdUseCase getStationByIdUseCase, n0 n0Var) {
        return new SelectTrainViewModel(getSeveralPathsUseCase, getRecentTrainSearchesUseCase, saveRecentTrainSearchUseCase, getStationByIdUseCase, n0Var);
    }

    @Override // javax.inject.Provider
    public SelectTrainViewModel get() {
        return newInstance(this.getSeveralPathsUseCaseProvider.get(), this.getRecentTrainSearchesUseCaseProvider.get(), this.saveRecentTrainSearchesUseCaseProvider.get(), this.getStationByIdUseCaseProvider.get(), this.savedStateHandleProvider.get());
    }
}
