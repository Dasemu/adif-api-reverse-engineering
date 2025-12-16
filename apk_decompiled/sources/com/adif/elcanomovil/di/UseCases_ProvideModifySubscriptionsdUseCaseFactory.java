package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.ModifySubscriptionsUseCase;
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
public final class UseCases_ProvideModifySubscriptionsdUseCaseFactory implements Factory<ModifySubscriptionsUseCase> {
    private final Provider<SubscriptionRepository> subscriptionRepositoryProvider;

    public UseCases_ProvideModifySubscriptionsdUseCaseFactory(Provider<SubscriptionRepository> provider) {
        this.subscriptionRepositoryProvider = provider;
    }

    public static UseCases_ProvideModifySubscriptionsdUseCaseFactory create(Provider<SubscriptionRepository> provider) {
        return new UseCases_ProvideModifySubscriptionsdUseCaseFactory(provider);
    }

    public static ModifySubscriptionsUseCase provideModifySubscriptionsdUseCase(SubscriptionRepository subscriptionRepository) {
        return (ModifySubscriptionsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideModifySubscriptionsdUseCase(subscriptionRepository));
    }

    @Override // javax.inject.Provider
    public ModifySubscriptionsUseCase get() {
        return provideModifySubscriptionsdUseCase(this.subscriptionRepositoryProvider.get());
    }
}
