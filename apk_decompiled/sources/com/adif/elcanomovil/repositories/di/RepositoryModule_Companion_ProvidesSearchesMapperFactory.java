package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.searches.SearchesMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.r;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvidesSearchesMapperFactory implements Factory<SearchesMapper> {
    public static RepositoryModule_Companion_ProvidesSearchesMapperFactory create() {
        return r.f8408a;
    }

    public static SearchesMapper providesSearchesMapper() {
        return (SearchesMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.providesSearchesMapper());
    }

    @Override // javax.inject.Provider
    public SearchesMapper get() {
        return providesSearchesMapper();
    }
}
