package com.adif.elcanomovil.repositories.di;

import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import s1.AbstractC0597f;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideFirebaseDynamicLinkFactory implements Factory<FirebaseDynamicLinks> {
    public static RepositoryModule_Companion_ProvideFirebaseDynamicLinkFactory create() {
        return AbstractC0597f.f8396a;
    }

    public static FirebaseDynamicLinks provideFirebaseDynamicLink() {
        return (FirebaseDynamicLinks) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideFirebaseDynamicLink());
    }

    @Override // javax.inject.Provider
    public FirebaseDynamicLinks get() {
        return provideFirebaseDynamicLink();
    }
}
