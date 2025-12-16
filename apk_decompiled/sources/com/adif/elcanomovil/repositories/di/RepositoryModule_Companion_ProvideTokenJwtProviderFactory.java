package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.domain.providers.TokenJwtProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0605n;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideTokenJwtProviderFactory implements Factory<TokenJwtProvider> {
    public static RepositoryModule_Companion_ProvideTokenJwtProviderFactory create() {
        return AbstractC0605n.f8404a;
    }

    public static TokenJwtProvider provideTokenJwtProvider() {
        return (TokenJwtProvider) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideTokenJwtProvider());
    }

    @Override // javax.inject.Provider
    public TokenJwtProvider get() {
        return provideTokenJwtProvider();
    }
}
