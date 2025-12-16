package com.adif.elcanomovil.serviceStorage.di;

import B1.b;
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
public final class StorageModule_ProvideMoshiPolymorphicFactoryTrainFactory implements Factory<InterfaceC0103k> {
    public static StorageModule_ProvideMoshiPolymorphicFactoryTrainFactory create() {
        return b.f209a;
    }

    public static InterfaceC0103k provideMoshiPolymorphicFactoryTrain() {
        return (InterfaceC0103k) Preconditions.checkNotNullFromProvides(StorageModule.INSTANCE.provideMoshiPolymorphicFactoryTrain());
    }

    @Override // javax.inject.Provider
    public InterfaceC0103k get() {
        return provideMoshiPolymorphicFactoryTrain();
    }
}
