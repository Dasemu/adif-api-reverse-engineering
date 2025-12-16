package com.adif.elcanomovil.uiAvisa.components.details;

import android.content.Context;
import com.adif.elcanomovil.domain.usecases.avisa.incidence.GetIncidenceDetailsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes.dex */
public final class IssueDetailsViewModel_Factory implements Factory<IssueDetailsViewModel> {
    private final Provider<Context> contextProvider;
    private final Provider<GetIncidenceDetailsUseCase> getIncidenceDetailsUseCaseProvider;

    public IssueDetailsViewModel_Factory(Provider<GetIncidenceDetailsUseCase> provider, Provider<Context> provider2) {
        this.getIncidenceDetailsUseCaseProvider = provider;
        this.contextProvider = provider2;
    }

    public static IssueDetailsViewModel_Factory create(Provider<GetIncidenceDetailsUseCase> provider, Provider<Context> provider2) {
        return new IssueDetailsViewModel_Factory(provider, provider2);
    }

    public static IssueDetailsViewModel newInstance(GetIncidenceDetailsUseCase getIncidenceDetailsUseCase, Context context) {
        return new IssueDetailsViewModel(getIncidenceDetailsUseCase, context);
    }

    @Override // javax.inject.Provider
    public IssueDetailsViewModel get() {
        return newInstance(this.getIncidenceDetailsUseCaseProvider.get(), this.contextProvider.get());
    }
}
