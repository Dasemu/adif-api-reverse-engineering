package com.adif.elcanomovil.uiTrain.di;

import com.adif.elcanomovil.uiTrain.entities.StepMapper;
import com.adif.elcanomovil.uiTrain.entities.TrainInfoMapper;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/di/TrainModule;", "", "()V", "providesStepMapper", "Lcom/adif/elcanomovil/uiTrain/entities/StepMapper;", "providesTrainInfoMapper", "Lcom/adif/elcanomovil/uiTrain/entities/TrainInfoMapper;", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public final class TrainModule {
    public static final TrainModule INSTANCE = new TrainModule();

    private TrainModule() {
    }

    @Provides
    public final StepMapper providesStepMapper() {
        return new StepMapper();
    }

    @Provides
    public final TrainInfoMapper providesTrainInfoMapper() {
        return new TrainInfoMapper();
    }
}
