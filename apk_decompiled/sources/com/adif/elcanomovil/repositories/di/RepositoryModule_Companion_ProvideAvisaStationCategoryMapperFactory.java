package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.avisa.AvisaStationCategoryMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0592a;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideAvisaStationCategoryMapperFactory implements Factory<AvisaStationCategoryMapper> {
    public static RepositoryModule_Companion_ProvideAvisaStationCategoryMapperFactory create() {
        return AbstractC0592a.f8391a;
    }

    public static AvisaStationCategoryMapper provideAvisaStationCategoryMapper() {
        return (AvisaStationCategoryMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideAvisaStationCategoryMapper());
    }

    @Override // javax.inject.Provider
    public AvisaStationCategoryMapper get() {
        return provideAvisaStationCategoryMapper();
    }
}
