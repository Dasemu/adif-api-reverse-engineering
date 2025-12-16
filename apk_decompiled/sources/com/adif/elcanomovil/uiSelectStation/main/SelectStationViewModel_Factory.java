package com.adif.elcanomovil.uiSelectStation.main;

import android.icu.text.Collator;
import com.adif.elcanomovil.domain.usecases.recentSearch.SaveRecentSearchUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByNameUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.ObserveRecentlySearchedStationsWithDistanceUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class SelectStationViewModel_Factory implements Factory<SelectStationViewModel> {
    private final Provider<Collator> collatorProvider;
    private final Provider<GetClosestStationUseCase> getClosestStationUseCaseProvider;
    private final Provider<GetHomeStationUseCase> getHomeStationUseCaseProvider;
    private final Provider<GetStationByNameUseCase> getStationByNameUseCaseProvider;
    private final Provider<GetWorkStationUseCase> getWorkStationUseCaseProvider;
    private final Provider<ObserveRecentlySearchedStationsWithDistanceUseCase> observeRecentlySearchedStationsWithDistanceProvider;
    private final Provider<SaveRecentSearchUseCase> saveRecentSearchUseCaseProvider;
    private final Provider<d1.g> stringProvider;

    public SelectStationViewModel_Factory(Provider<SaveRecentSearchUseCase> provider, Provider<GetClosestStationUseCase> provider2, Provider<GetHomeStationUseCase> provider3, Provider<GetWorkStationUseCase> provider4, Provider<GetStationByNameUseCase> provider5, Provider<ObserveRecentlySearchedStationsWithDistanceUseCase> provider6, Provider<d1.g> provider7, Provider<Collator> provider8) {
        this.saveRecentSearchUseCaseProvider = provider;
        this.getClosestStationUseCaseProvider = provider2;
        this.getHomeStationUseCaseProvider = provider3;
        this.getWorkStationUseCaseProvider = provider4;
        this.getStationByNameUseCaseProvider = provider5;
        this.observeRecentlySearchedStationsWithDistanceProvider = provider6;
        this.stringProvider = provider7;
        this.collatorProvider = provider8;
    }

    public static SelectStationViewModel_Factory create(Provider<SaveRecentSearchUseCase> provider, Provider<GetClosestStationUseCase> provider2, Provider<GetHomeStationUseCase> provider3, Provider<GetWorkStationUseCase> provider4, Provider<GetStationByNameUseCase> provider5, Provider<ObserveRecentlySearchedStationsWithDistanceUseCase> provider6, Provider<d1.g> provider7, Provider<Collator> provider8) {
        return new SelectStationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static SelectStationViewModel newInstance(SaveRecentSearchUseCase saveRecentSearchUseCase, GetClosestStationUseCase getClosestStationUseCase, GetHomeStationUseCase getHomeStationUseCase, GetWorkStationUseCase getWorkStationUseCase, GetStationByNameUseCase getStationByNameUseCase, ObserveRecentlySearchedStationsWithDistanceUseCase observeRecentlySearchedStationsWithDistanceUseCase, d1.g gVar, Collator collator) {
        return new SelectStationViewModel(saveRecentSearchUseCase, getClosestStationUseCase, getHomeStationUseCase, getWorkStationUseCase, getStationByNameUseCase, observeRecentlySearchedStationsWithDistanceUseCase, gVar, collator);
    }

    @Override // javax.inject.Provider
    public SelectStationViewModel get() {
        return newInstance(this.saveRecentSearchUseCaseProvider.get(), this.getClosestStationUseCaseProvider.get(), this.getHomeStationUseCaseProvider.get(), this.getWorkStationUseCaseProvider.get(), this.getStationByNameUseCaseProvider.get(), this.observeRecentlySearchedStationsWithDistanceProvider.get(), this.stringProvider.get(), this.collatorProvider.get());
    }
}
