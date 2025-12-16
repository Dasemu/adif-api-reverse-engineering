package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.CreateSubscriptionsUseCase;
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
public final class UseCases_ProvideCreateSubscriptionsdUseCaseFactory implements Factory<CreateSubscriptionsUseCase> {
    private final Provider<SubscriptionRepository> subscriptionRepositoryProvider;

    public UseCases_ProvideCreateSubscriptionsdUseCaseFactory(Provider<SubscriptionRepository> provider) {
        this.subscriptionRepositoryProvider = provider;
    }

    public static UseCases_ProvideCreateSubscriptionsdUseCaseFactory create(Provider<SubscriptionRepository> provider) {
        return new UseCases_ProvideCreateSubscriptionsdUseCaseFactory(provider);
    }

    public static CreateSubscriptionsUseCase provideCreateSubscriptionsdUseCase(SubscriptionRepository subscriptionRepository) {
        return (CreateSubscriptionsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideCreateSubscriptionsdUseCase(subscriptionRepository));
    }

    @Override // javax.inject.Provider
    public CreateSubscriptionsUseCase get() {
        return provideCreateSubscriptionsdUseCase(this.subscriptionRepositoryProvider.get());
    }
}
