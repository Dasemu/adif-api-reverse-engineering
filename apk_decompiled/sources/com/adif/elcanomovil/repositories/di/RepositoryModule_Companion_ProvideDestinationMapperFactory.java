package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.subscriptions.DestinationMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0596e;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideDestinationMapperFactory implements Factory<DestinationMapper> {
    public static RepositoryModule_Companion_ProvideDestinationMapperFactory create() {
        return AbstractC0596e.f8395a;
    }

    public static DestinationMapper provideDestinationMapper() {
        return (DestinationMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideDestinationMapper());
    }

    @Override // javax.inject.Provider
    public DestinationMapper get() {
        return provideDestinationMapper();
    }
}
