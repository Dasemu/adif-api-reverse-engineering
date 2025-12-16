package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import g1.g;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class UseCases_ProvideTabDataHolderFactory implements Factory<TabDataHolder> {
    public static UseCases_ProvideTabDataHolderFactory create() {
        return g.f6742a;
    }

    public static TabDataHolder provideTabDataHolder() {
        return (TabDataHolder) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideTabDataHolder());
    }

    @Override // javax.inject.Provider
    public TabDataHolder get() {
        return provideTabDataHolder();
    }
}
