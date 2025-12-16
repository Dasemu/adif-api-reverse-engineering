package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.subscriptions.SubscriptionMapper;
import d1.g;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideSubscriptionMapperFactory implements Factory<SubscriptionMapper> {
    private final Provider<g> stringProvider;

    public RepositoryModule_Companion_ProvideSubscriptionMapperFactory(Provider<g> provider) {
        this.stringProvider = provider;
    }

    public static RepositoryModule_Companion_ProvideSubscriptionMapperFactory create(Provider<g> provider) {
        return new RepositoryModule_Companion_ProvideSubscriptionMapperFactory(provider);
    }

    public static SubscriptionMapper provideSubscriptionMapper(g gVar) {
        return (SubscriptionMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideSubscriptionMapper(gVar));
    }

    @Override // javax.inject.Provider
    public SubscriptionMapper get() {
        return provideSubscriptionMapper(this.stringProvider.get());
    }
}
