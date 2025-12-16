package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.DeleteSubscriptionsUseCase;
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
public final class UseCases_ProvideDeleteSubscriptionsdUseCaseFactory implements Factory<DeleteSubscriptionsUseCase> {
    private final Provider<SubscriptionRepository> subscriptionRepositoryProvider;

    public UseCases_ProvideDeleteSubscriptionsdUseCaseFactory(Provider<SubscriptionRepository> provider) {
        this.subscriptionRepositoryProvider = provider;
    }

    public static UseCases_ProvideDeleteSubscriptionsdUseCaseFactory create(Provider<SubscriptionRepository> provider) {
        return new UseCases_ProvideDeleteSubscriptionsdUseCaseFactory(provider);
    }

    public static DeleteSubscriptionsUseCase provideDeleteSubscriptionsdUseCase(SubscriptionRepository subscriptionRepository) {
        return (DeleteSubscriptionsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideDeleteSubscriptionsdUseCase(subscriptionRepository));
    }

    @Override // javax.inject.Provider
    public DeleteSubscriptionsUseCase get() {
        return provideDeleteSubscriptionsdUseCase(this.subscriptionRepositoryProvider.get());
    }
}
