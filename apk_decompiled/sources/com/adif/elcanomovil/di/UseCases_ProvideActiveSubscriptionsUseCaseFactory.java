package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.ActiveSubscriptionsUseCase;
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
public final class UseCases_ProvideActiveSubscriptionsUseCaseFactory implements Factory<ActiveSubscriptionsUseCase> {
    private final Provider<SubscriptionRepository> subscriptionRepositoryProvider;

    public UseCases_ProvideActiveSubscriptionsUseCaseFactory(Provider<SubscriptionRepository> provider) {
        this.subscriptionRepositoryProvider = provider;
    }

    public static UseCases_ProvideActiveSubscriptionsUseCaseFactory create(Provider<SubscriptionRepository> provider) {
        return new UseCases_ProvideActiveSubscriptionsUseCaseFactory(provider);
    }

    public static ActiveSubscriptionsUseCase provideActiveSubscriptionsUseCase(SubscriptionRepository subscriptionRepository) {
        return (ActiveSubscriptionsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideActiveSubscriptionsUseCase(subscriptionRepository));
    }

    @Override // javax.inject.Provider
    public ActiveSubscriptionsUseCase get() {
        return provideActiveSubscriptionsUseCase(this.subscriptionRepositoryProvider.get());
    }
}
