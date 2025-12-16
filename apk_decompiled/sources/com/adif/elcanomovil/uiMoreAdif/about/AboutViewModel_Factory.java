package com.adif.elcanomovil.uiMoreAdif.about;

import com.adif.elcanomovil.domain.usecases.GetAppVersionUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class AboutViewModel_Factory implements Factory<AboutViewModel> {
    private final Provider<GetAppVersionUseCase> getAppVersionUseCaseProvider;

    public AboutViewModel_Factory(Provider<GetAppVersionUseCase> provider) {
        this.getAppVersionUseCaseProvider = provider;
    }

    public static AboutViewModel_Factory create(Provider<GetAppVersionUseCase> provider) {
        return new AboutViewModel_Factory(provider);
    }

    public static AboutViewModel newInstance(GetAppVersionUseCase getAppVersionUseCase) {
        return new AboutViewModel(getAppVersionUseCase);
    }

    @Override // javax.inject.Provider
    public AboutViewModel get() {
        return newInstance(this.getAppVersionUseCaseProvider.get());
    }
}
