package com.adif.elcanomovil.uiTrain.di;

import P1.b;
import com.adif.elcanomovil.uiTrain.entities.TrainInfoMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class TrainModule_ProvidesTrainInfoMapperFactory implements Factory<TrainInfoMapper> {
    public static TrainModule_ProvidesTrainInfoMapperFactory create() {
        return b.f1346a;
    }

    public static TrainInfoMapper providesTrainInfoMapper() {
        return (TrainInfoMapper) Preconditions.checkNotNullFromProvides(TrainModule.INSTANCE.providesTrainInfoMapper());
    }

    @Override // javax.inject.Provider
    public TrainInfoMapper get() {
        return providesTrainInfoMapper();
    }
}
