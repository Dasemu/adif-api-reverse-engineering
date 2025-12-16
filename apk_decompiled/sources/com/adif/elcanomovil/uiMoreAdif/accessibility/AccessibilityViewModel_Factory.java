package com.adif.elcanomovil.uiMoreAdif.accessibility;

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
public final class AccessibilityViewModel_Factory implements Factory<AccessibilityViewModel> {
    private final Provider<GetAppVersionUseCase> getAppVersionUseCaseProvider;

    public AccessibilityViewModel_Factory(Provider<GetAppVersionUseCase> provider) {
        this.getAppVersionUseCaseProvider = provider;
    }

    public static AccessibilityViewModel_Factory create(Provider<GetAppVersionUseCase> provider) {
        return new AccessibilityViewModel_Factory(provider);
    }

    public static AccessibilityViewModel newInstance(GetAppVersionUseCase getAppVersionUseCase) {
        return new AccessibilityViewModel(getAppVersionUseCase);
    }

    @Override // javax.inject.Provider
    public AccessibilityViewModel get() {
        return newInstance(this.getAppVersionUseCaseProvider.get());
    }
}
