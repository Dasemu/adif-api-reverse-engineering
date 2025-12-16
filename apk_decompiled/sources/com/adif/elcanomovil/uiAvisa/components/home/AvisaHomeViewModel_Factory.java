package com.adif.elcanomovil.uiAvisa.components.home;

import android.content.Context;
import com.adif.elcanomovil.domain.usecases.avisa.incidence.GetIncidencesUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationCategoriesUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationsUseCase;
import com.adif.elcanomovil.uiAvisa.components.authenticator.AuthenticationProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes.dex */
public final class AvisaHomeViewModel_Factory implements Factory<AvisaHomeViewModel> {
    private final Provider<AuthenticationProvider> authProvider;
    private final Provider<Context> contextProvider;
    private final Provider<GetAvisaStationCategoriesUseCase> getAvisaStationCategoriesUseCaseProvider;
    private final Provider<GetIncidencesUseCase> getIncidencesUseCaseProvider;
    private final Provider<GetAvisaStationsUseCase> getStationsUseCaseProvider;

    public AvisaHomeViewModel_Factory(Provider<GetIncidencesUseCase> provider, Provider<GetAvisaStationsUseCase> provider2, Provider<GetAvisaStationCategoriesUseCase> provider3, Provider<AuthenticationProvider> provider4, Provider<Context> provider5) {
        this.getIncidencesUseCaseProvider = provider;
        this.getStationsUseCaseProvider = provider2;
        this.getAvisaStationCategoriesUseCaseProvider = provider3;
        this.authProvider = provider4;
        this.contextProvider = provider5;
    }

    public static AvisaHomeViewModel_Factory create(Provider<GetIncidencesUseCase> provider, Provider<GetAvisaStationsUseCase> provider2, Provider<GetAvisaStationCategoriesUseCase> provider3, Provider<AuthenticationProvider> provider4, Provider<Context> provider5) {
        return new AvisaHomeViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static AvisaHomeViewModel newInstance(GetIncidencesUseCase getIncidencesUseCase, GetAvisaStationsUseCase getAvisaStationsUseCase, GetAvisaStationCategoriesUseCase getAvisaStationCategoriesUseCase, AuthenticationProvider authenticationProvider, Context context) {
        return new AvisaHomeViewModel(getIncidencesUseCase, getAvisaStationsUseCase, getAvisaStationCategoriesUseCase, authenticationProvider, context);
    }

    @Override // javax.inject.Provider
    public AvisaHomeViewModel get() {
        return newInstance(this.getIncidencesUseCaseProvider.get(), this.getStationsUseCaseProvider.get(), this.getAvisaStationCategoriesUseCaseProvider.get(), this.authProvider.get(), this.contextProvider.get());
    }
}
