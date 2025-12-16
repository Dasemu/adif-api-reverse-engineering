package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.avisa.IncidencePictureMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0601j;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideIncidencePictureMapperFactory implements Factory<IncidencePictureMapper> {
    public static RepositoryModule_Companion_ProvideIncidencePictureMapperFactory create() {
        return AbstractC0601j.f8400a;
    }

    public static IncidencePictureMapper provideIncidencePictureMapper() {
        return (IncidencePictureMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideIncidencePictureMapper());
    }

    @Override // javax.inject.Provider
    public IncidencePictureMapper get() {
        return provideIncidencePictureMapper();
    }
}
