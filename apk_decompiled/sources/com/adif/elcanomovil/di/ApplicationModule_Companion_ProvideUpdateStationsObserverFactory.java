package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.usecases.stations.GetStationsUseCase;
import com.adif.elcanomovil.observers.UpdateStationsObserver;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ApplicationModule_Companion_ProvideUpdateStationsObserverFactory implements Factory<UpdateStationsObserver> {
    private final Provider<GetStationsUseCase> getStationsUseCaseProvider;

    public ApplicationModule_Companion_ProvideUpdateStationsObserverFactory(Provider<GetStationsUseCase> provider) {
        this.getStationsUseCaseProvider = provider;
    }

    public static ApplicationModule_Companion_ProvideUpdateStationsObserverFactory create(Provider<GetStationsUseCase> provider) {
        return new ApplicationModule_Companion_ProvideUpdateStationsObserverFactory(provider);
    }

    public static UpdateStationsObserver provideUpdateStationsObserver(GetStationsUseCase getStationsUseCase) {
        return (UpdateStationsObserver) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideUpdateStationsObserver(getStationsUseCase));
    }

    @Override // javax.inject.Provider
    public UpdateStationsObserver get() {
        return provideUpdateStationsObserver(this.getStationsUseCaseProvider.get());
    }
}
