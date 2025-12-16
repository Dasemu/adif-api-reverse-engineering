package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.stationObservations.StationObservationsMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0604m;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideStationObservationsMapperFactory implements Factory<StationObservationsMapper> {
    public static RepositoryModule_Companion_ProvideStationObservationsMapperFactory create() {
        return AbstractC0604m.f8403a;
    }

    public static StationObservationsMapper provideStationObservationsMapper() {
        return (StationObservationsMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideStationObservationsMapper());
    }

    @Override // javax.inject.Provider
    public StationObservationsMapper get() {
        return provideStationObservationsMapper();
    }
}
