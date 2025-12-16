package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.domain.usecases.favorites.GetStationIsFavoriteUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteStationUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteStationUseCase;
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
public final class StationsPageServicesViewModel_Factory implements Factory<StationsPageServicesViewModel> {
    private final Provider<GetCurrentOneStationUseCase> getCurrentOneStationUseCaseProvider;
    private final Provider<GetStationIsFavoriteUseCase> getStationIsFavoriteUseCaseProvider;
    private final Provider<RemoveFavoriteStationUseCase> removeFavoriteStationUseCaseProvider;
    private final Provider<SaveFavoriteStationUseCase> saveFavoriteStationUseCaseProvider;

    public StationsPageServicesViewModel_Factory(Provider<GetCurrentOneStationUseCase> provider, Provider<SaveFavoriteStationUseCase> provider2, Provider<GetStationIsFavoriteUseCase> provider3, Provider<RemoveFavoriteStationUseCase> provider4) {
        this.getCurrentOneStationUseCaseProvider = provider;
        this.saveFavoriteStationUseCaseProvider = provider2;
        this.getStationIsFavoriteUseCaseProvider = provider3;
        this.removeFavoriteStationUseCaseProvider = provider4;
    }

    public static StationsPageServicesViewModel_Factory create(Provider<GetCurrentOneStationUseCase> provider, Provider<SaveFavoriteStationUseCase> provider2, Provider<GetStationIsFavoriteUseCase> provider3, Provider<RemoveFavoriteStationUseCase> provider4) {
        return new StationsPageServicesViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static StationsPageServicesViewModel newInstance(GetCurrentOneStationUseCase getCurrentOneStationUseCase, SaveFavoriteStationUseCase saveFavoriteStationUseCase, GetStationIsFavoriteUseCase getStationIsFavoriteUseCase, RemoveFavoriteStationUseCase removeFavoriteStationUseCase) {
        return new StationsPageServicesViewModel(getCurrentOneStationUseCase, saveFavoriteStationUseCase, getStationIsFavoriteUseCase, removeFavoriteStationUseCase);
    }

    @Override // javax.inject.Provider
    public StationsPageServicesViewModel get() {
        return newInstance(this.getCurrentOneStationUseCaseProvider.get(), this.saveFavoriteStationUseCaseProvider.get(), this.getStationIsFavoriteUseCaseProvider.get(), this.removeFavoriteStationUseCaseProvider.get());
    }
}
