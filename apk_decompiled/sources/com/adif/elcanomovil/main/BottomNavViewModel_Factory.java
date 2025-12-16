package com.adif.elcanomovil.main;

import androidx.lifecycle.n0;
import com.adif.elcanomovil.domain.usecases.GetVersionUpdateStatusUseCase;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BottomNavViewModel_Factory implements Factory<BottomNavViewModel> {
    private final Provider<GetVersionUpdateStatusUseCase> getVersionUpdateStatusUseCaseProvider;
    private final Provider<PreferenceStorage> preferenceStorageProvider;
    private final Provider<d1.f> rootDetectorProvider;
    private final Provider<n0> savedStateHandleProvider;
    private final Provider<d1.g> stringProvider;

    public BottomNavViewModel_Factory(Provider<n0> provider, Provider<GetVersionUpdateStatusUseCase> provider2, Provider<PreferenceStorage> provider3, Provider<d1.g> provider4, Provider<d1.f> provider5) {
        this.savedStateHandleProvider = provider;
        this.getVersionUpdateStatusUseCaseProvider = provider2;
        this.preferenceStorageProvider = provider3;
        this.stringProvider = provider4;
        this.rootDetectorProvider = provider5;
    }

    public static BottomNavViewModel_Factory create(Provider<n0> provider, Provider<GetVersionUpdateStatusUseCase> provider2, Provider<PreferenceStorage> provider3, Provider<d1.g> provider4, Provider<d1.f> provider5) {
        return new BottomNavViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static BottomNavViewModel newInstance(n0 n0Var, GetVersionUpdateStatusUseCase getVersionUpdateStatusUseCase, PreferenceStorage preferenceStorage, d1.g gVar, d1.f fVar) {
        return new BottomNavViewModel(n0Var, getVersionUpdateStatusUseCase, preferenceStorage, gVar, fVar);
    }

    @Override // javax.inject.Provider
    public BottomNavViewModel get() {
        return newInstance(this.savedStateHandleProvider.get(), this.getVersionUpdateStatusUseCaseProvider.get(), this.preferenceStorageProvider.get(), this.stringProvider.get(), this.rootDetectorProvider.get());
    }
}
