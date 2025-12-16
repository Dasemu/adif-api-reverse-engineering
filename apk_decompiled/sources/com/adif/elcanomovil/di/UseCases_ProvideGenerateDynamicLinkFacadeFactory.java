package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.providers.DynamicLinkFacade;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
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
public final class UseCases_ProvideGenerateDynamicLinkFacadeFactory implements Factory<DynamicLinkFacade> {
    private final Provider<FirebaseDynamicLinks> firebaseDynamicLinksProvider;

    public UseCases_ProvideGenerateDynamicLinkFacadeFactory(Provider<FirebaseDynamicLinks> provider) {
        this.firebaseDynamicLinksProvider = provider;
    }

    public static UseCases_ProvideGenerateDynamicLinkFacadeFactory create(Provider<FirebaseDynamicLinks> provider) {
        return new UseCases_ProvideGenerateDynamicLinkFacadeFactory(provider);
    }

    public static DynamicLinkFacade provideGenerateDynamicLinkFacade(FirebaseDynamicLinks firebaseDynamicLinks) {
        return (DynamicLinkFacade) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGenerateDynamicLinkFacade(firebaseDynamicLinks));
    }

    @Override // javax.inject.Provider
    public DynamicLinkFacade get() {
        return provideGenerateDynamicLinkFacade(this.firebaseDynamicLinksProvider.get());
    }
}
