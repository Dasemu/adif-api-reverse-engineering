package com.adif.elcanomovil.repositories.di;

import com.adif.elcanomovil.repositories.compositions.CompositionsMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0595d;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideCompositionsMapperFactory implements Factory<CompositionsMapper> {
    public static RepositoryModule_Companion_ProvideCompositionsMapperFactory create() {
        return AbstractC0595d.f8394a;
    }

    public static CompositionsMapper provideCompositionsMapper() {
        return (CompositionsMapper) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideCompositionsMapper());
    }

    @Override // javax.inject.Provider
    public CompositionsMapper get() {
        return provideCompositionsMapper();
    }
}
