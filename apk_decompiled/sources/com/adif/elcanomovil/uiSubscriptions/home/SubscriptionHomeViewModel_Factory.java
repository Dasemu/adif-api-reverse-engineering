package com.adif.elcanomovil.uiSubscriptions.home;

import android.content.Context;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.ActiveSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.DeleteSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.GetSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.MuteSubscriptionsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes3.dex */
public final class SubscriptionHomeViewModel_Factory implements Factory<SubscriptionHomeViewModel> {
    private final Provider<ActiveSubscriptionsUseCase> activeSubscriptionsUseCaseProvider;
    private final Provider<Context> contextProvider;
    private final Provider<DeleteSubscriptionsUseCase> deleteSubscriptionsUseCaseProvider;
    private final Provider<GetSubscriptionsUseCase> getSubscriptionsUseCaseProvider;
    private final Provider<MuteSubscriptionsUseCase> muteSubscriptionsUseCaseProvider;

    public SubscriptionHomeViewModel_Factory(Provider<GetSubscriptionsUseCase> provider, Provider<DeleteSubscriptionsUseCase> provider2, Provider<ActiveSubscriptionsUseCase> provider3, Provider<MuteSubscriptionsUseCase> provider4, Provider<Context> provider5) {
        this.getSubscriptionsUseCaseProvider = provider;
        this.deleteSubscriptionsUseCaseProvider = provider2;
        this.activeSubscriptionsUseCaseProvider = provider3;
        this.muteSubscriptionsUseCaseProvider = provider4;
        this.contextProvider = provider5;
    }

    public static SubscriptionHomeViewModel_Factory create(Provider<GetSubscriptionsUseCase> provider, Provider<DeleteSubscriptionsUseCase> provider2, Provider<ActiveSubscriptionsUseCase> provider3, Provider<MuteSubscriptionsUseCase> provider4, Provider<Context> provider5) {
        return new SubscriptionHomeViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static SubscriptionHomeViewModel newInstance(GetSubscriptionsUseCase getSubscriptionsUseCase, DeleteSubscriptionsUseCase deleteSubscriptionsUseCase, ActiveSubscriptionsUseCase activeSubscriptionsUseCase, MuteSubscriptionsUseCase muteSubscriptionsUseCase, Context context) {
        return new SubscriptionHomeViewModel(getSubscriptionsUseCase, deleteSubscriptionsUseCase, activeSubscriptionsUseCase, muteSubscriptionsUseCase, context);
    }

    @Override // javax.inject.Provider
    public SubscriptionHomeViewModel get() {
        return newInstance(this.getSubscriptionsUseCaseProvider.get(), this.deleteSubscriptionsUseCaseProvider.get(), this.activeSubscriptionsUseCaseProvider.get(), this.muteSubscriptionsUseCaseProvider.get(), this.contextProvider.get());
    }
}
