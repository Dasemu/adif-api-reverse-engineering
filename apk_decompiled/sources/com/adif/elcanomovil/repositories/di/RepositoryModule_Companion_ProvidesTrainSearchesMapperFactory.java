package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.searches.TrainSearchesMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.s;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvidesTrainSearchesMapperFactory implements Factory<TrainSearchesMapper> {
    public static RepositoryModule_Companion_ProvidesTrainSearchesMapperFactory create() {
        return s.f8409a;
    }

    public static TrainSearchesMapper providesTrainSearchesMapper() {
        return (TrainSearchesMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.providesTrainSearchesMapper());
    }

    @Override // javax.inject.Provider
    public TrainSearchesMapper get() {
        return providesTrainSearchesMapper();
    }
}
