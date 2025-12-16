package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.subscriptions.OriginMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0602k;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideOriginMapperFactory implements Factory<OriginMapper> {
    public static RepositoryModule_Companion_ProvideOriginMapperFactory create() {
        return AbstractC0602k.f8401a;
    }

    public static OriginMapper provideOriginMapper() {
        return (OriginMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideOriginMapper());
    }

    @Override // javax.inject.Provider
    public OriginMapper get() {
        return provideOriginMapper();
    }
}
