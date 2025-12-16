package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.MuteSubscriptionsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class UseCases_ProvideMuteSubscriptionsdUseCaseFactory implements Factory<MuteSubscriptionsUseCase> {
    private final Provider<SubscriptionRepository> subscriptionRepositoryProvider;

    public UseCases_ProvideMuteSubscriptionsdUseCaseFactory(Provider<SubscriptionRepository> provider) {
        this.subscriptionRepositoryProvider = provider;
    }

    public static UseCases_ProvideMuteSubscriptionsdUseCaseFactory create(Provider<SubscriptionRepository> provider) {
        return new UseCases_ProvideMuteSubscriptionsdUseCaseFactory(provider);
    }

    public static MuteSubscriptionsUseCase provideMuteSubscriptionsdUseCase(SubscriptionRepository subscriptionRepository) {
        return (MuteSubscriptionsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideMuteSubscriptionsdUseCase(subscriptionRepository));
    }

    @Override // javax.inject.Provider
    public MuteSubscriptionsUseCase get() {
        return provideMuteSubscriptionsdUseCase(this.subscriptionRepositoryProvider.get());
    }
}
