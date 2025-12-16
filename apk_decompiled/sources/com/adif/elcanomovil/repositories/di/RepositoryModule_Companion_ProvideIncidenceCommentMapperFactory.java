package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.avisa.IncidenceCommentMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0599h;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideIncidenceCommentMapperFactory implements Factory<IncidenceCommentMapper> {
    public static RepositoryModule_Companion_ProvideIncidenceCommentMapperFactory create() {
        return AbstractC0599h.f8398a;
    }

    public static IncidenceCommentMapper provideIncidenceCommentMapper() {
        return (IncidenceCommentMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideIncidenceCommentMapper());
    }

    @Override // javax.inject.Provider
    public IncidenceCommentMapper get() {
        return provideIncidenceCommentMapper();
    }
}
