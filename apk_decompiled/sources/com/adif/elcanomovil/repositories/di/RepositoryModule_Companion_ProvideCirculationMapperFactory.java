package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.circulation.CirculationMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0594c;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideCirculationMapperFactory implements Factory<CirculationMapper> {
    public static RepositoryModule_Companion_ProvideCirculationMapperFactory create() {
        return AbstractC0594c.f8393a;
    }

    public static CirculationMapper provideCirculationMapper() {
        return (CirculationMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideCirculationMapper());
    }

    @Override // javax.inject.Provider
    public CirculationMapper get() {
        return provideCirculationMapper();
    }
}
