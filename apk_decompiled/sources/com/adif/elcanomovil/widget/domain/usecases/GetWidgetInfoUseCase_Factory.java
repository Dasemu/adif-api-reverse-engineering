package com.adif.elcanomovil.widget.domain.usecases;

import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class GetWidgetInfoUseCase_Factory implements Factory<GetWidgetInfoUseCase> {
    private final Provider<GetStationByIdUseCase> getStationByIdUseCaseProvider;

    public GetWidgetInfoUseCase_Factory(Provider<GetStationByIdUseCase> provider) {
        this.getStationByIdUseCaseProvider = provider;
    }

    public static GetWidgetInfoUseCase_Factory create(Provider<GetStationByIdUseCase> provider) {
        return new GetWidgetInfoUseCase_Factory(provider);
    }

    public static GetWidgetInfoUseCase newInstance(GetStationByIdUseCase getStationByIdUseCase) {
        return new GetWidgetInfoUseCase(getStationByIdUseCase);
    }

    @Override // javax.inject.Provider
    public GetWidgetInfoUseCase get() {
        return newInstance(this.getStationByIdUseCaseProvider.get());
    }
}
