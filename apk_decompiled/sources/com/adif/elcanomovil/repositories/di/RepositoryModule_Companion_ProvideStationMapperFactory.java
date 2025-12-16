package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.stations.StationMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0603l;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideStationMapperFactory implements Factory<StationMapper> {
    public static RepositoryModule_Companion_ProvideStationMapperFactory create() {
        return AbstractC0603l.f8402a;
    }

    public static StationMapper provideStationMapper() {
        return (StationMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideStationMapper());
    }

    @Override // javax.inject.Provider
    public StationMapper get() {
        return provideStationMapper();
    }
}
