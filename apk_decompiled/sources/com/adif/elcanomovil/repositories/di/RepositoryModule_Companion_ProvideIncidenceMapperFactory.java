package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.avisa.IncidenceMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0600i;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideIncidenceMapperFactory implements Factory<IncidenceMapper> {
    public static RepositoryModule_Companion_ProvideIncidenceMapperFactory create() {
        return AbstractC0600i.f8399a;
    }

    public static IncidenceMapper provideIncidenceMapper() {
        return (IncidenceMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideIncidenceMapper());
    }

    @Override // javax.inject.Provider
    public IncidenceMapper get() {
        return provideIncidenceMapper();
    }
}
