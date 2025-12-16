package com.adif.elcanomovil.di;

import com.google.firebase.messaging.FirebaseMessaging;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import g1.AbstractC0375b;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ApplicationModule_Companion_ProvideFirebaseMessagingFactory implements Factory<FirebaseMessaging> {
    public static ApplicationModule_Companion_ProvideFirebaseMessagingFactory create() {
        return AbstractC0375b.f6737a;
    }

    public static FirebaseMessaging provideFirebaseMessaging() {
        return (FirebaseMessaging) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideFirebaseMessaging());
    }

    @Override // javax.inject.Provider
    public FirebaseMessaging get() {
        return provideFirebaseMessaging();
    }
}
