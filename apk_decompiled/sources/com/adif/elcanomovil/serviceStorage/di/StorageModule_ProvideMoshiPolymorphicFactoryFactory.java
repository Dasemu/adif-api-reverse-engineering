package com.adif.elcanomovil.serviceStorage.di;

import B1.a;
import Z2.InterfaceC0103k;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes.dex */
public final class StorageModule_ProvideMoshiPolymorphicFactoryFactory implements Factory<InterfaceC0103k> {
    public static StorageModule_ProvideMoshiPolymorphicFactoryFactory create() {
        return a.f208a;
    }

    public static InterfaceC0103k provideMoshiPolymorphicFactory() {
        return (InterfaceC0103k) Preconditions.checkNotNullFromProvides(StorageModule.INSTANCE.provideMoshiPolymorphicFactory());
    }

    @Override // javax.inject.Provider
    public InterfaceC0103k get() {
        return provideMoshiPolymorphicFactory();
    }
}
