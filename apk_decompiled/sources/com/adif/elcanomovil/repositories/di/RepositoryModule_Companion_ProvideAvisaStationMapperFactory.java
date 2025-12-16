package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.avisa.AvisaStationMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0593b;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideAvisaStationMapperFactory implements Factory<AvisaStationMapper> {
    public static RepositoryModule_Companion_ProvideAvisaStationMapperFactory create() {
        return AbstractC0593b.f8392a;
    }

    public static AvisaStationMapper provideAvisaStationMapper() {
        return (AvisaStationMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideAvisaStationMapper());
    }

    @Override // javax.inject.Provider
    public AvisaStationMapper get() {
        return provideAvisaStationMapper();
    }
}
