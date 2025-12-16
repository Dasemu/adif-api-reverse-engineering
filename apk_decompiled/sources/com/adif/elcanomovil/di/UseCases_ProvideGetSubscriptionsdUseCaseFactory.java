package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.GetSubscriptionsUseCase;
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
public final class UseCases_ProvideGetSubscriptionsdUseCaseFactory implements Factory<GetSubscriptionsUseCase> {
    private final Provider<SubscriptionRepository> subscriptionRepositoryProvider;

    public UseCases_ProvideGetSubscriptionsdUseCaseFactory(Provider<SubscriptionRepository> provider) {
        this.subscriptionRepositoryProvider = provider;
    }

    public static UseCases_ProvideGetSubscriptionsdUseCaseFactory create(Provider<SubscriptionRepository> provider) {
        return new UseCases_ProvideGetSubscriptionsdUseCaseFactory(provider);
    }

    public static GetSubscriptionsUseCase provideGetSubscriptionsdUseCase(SubscriptionRepository subscriptionRepository) {
        return (GetSubscriptionsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetSubscriptionsdUseCase(subscriptionRepository));
    }

    @Override // javax.inject.Provider
    public GetSubscriptionsUseCase get() {
        return provideGetSubscriptionsdUseCase(this.subscriptionRepositoryProvider.get());
    }
}
