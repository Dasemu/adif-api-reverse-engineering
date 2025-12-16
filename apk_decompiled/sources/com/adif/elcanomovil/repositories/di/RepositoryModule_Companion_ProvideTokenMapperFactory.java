package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.avisa.TokenMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0606o;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideTokenMapperFactory implements Factory<TokenMapper> {
    public static RepositoryModule_Companion_ProvideTokenMapperFactory create() {
        return AbstractC0606o.f8405a;
    }

    public static TokenMapper provideTokenMapper() {
        return (TokenMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideTokenMapper());
    }

    @Override // javax.inject.Provider
    public TokenMapper get() {
        return provideTokenMapper();
    }
}
