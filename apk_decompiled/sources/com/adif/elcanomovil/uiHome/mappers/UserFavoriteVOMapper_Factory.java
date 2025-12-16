package com.adif.elcanomovil.uiHome.mappers;

import android.content.Context;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes2.dex */
public final class UserFavoriteVOMapper_Factory implements Factory<UserFavoriteVOMapper> {
    private final Provider<Context> contextProvider;
    private final Provider<GetStationByIdUseCase> getStationByIdUseCaseProvider;

    public UserFavoriteVOMapper_Factory(Provider<Context> provider, Provider<GetStationByIdUseCase> provider2) {
        this.contextProvider = provider;
        this.getStationByIdUseCaseProvider = provider2;
    }

    public static UserFavoriteVOMapper_Factory create(Provider<Context> provider, Provider<GetStationByIdUseCase> provider2) {
        return new UserFavoriteVOMapper_Factory(provider, provider2);
    }

    public static UserFavoriteVOMapper newInstance(Context context, GetStationByIdUseCase getStationByIdUseCase) {
        return new UserFavoriteVOMapper(context, getStationByIdUseCase);
    }

    @Override // javax.inject.Provider
    public UserFavoriteVOMapper get() {
        return newInstance(this.contextProvider.get(), this.getStationByIdUseCaseProvider.get());
    }
}
