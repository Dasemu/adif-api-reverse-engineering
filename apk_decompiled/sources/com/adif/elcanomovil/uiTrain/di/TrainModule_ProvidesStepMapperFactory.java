package com.adif.elcanomovil.uiTrain.di;

import P1.a;
import com.adif.elcanomovil.uiTrain.entities.StepMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class TrainModule_ProvidesStepMapperFactory implements Factory<StepMapper> {
    public static TrainModule_ProvidesStepMapperFactory create() {
        return a.f1345a;
    }

    public static StepMapper providesStepMapper() {
        return (StepMapper) Preconditions.checkNotNullFromProvides(TrainModule.INSTANCE.providesStepMapper());
    }

    @Override // javax.inject.Provider
    public StepMapper get() {
        return providesStepMapper();
    }
}
